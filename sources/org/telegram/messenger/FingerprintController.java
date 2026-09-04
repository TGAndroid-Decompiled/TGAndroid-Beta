package org.telegram.messenger;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Locale;
import javax.crypto.Cipher;
public class FingerprintController {
    private static final String KEY_ALIAS = "tmessages_passcode";
    private static Boolean hasChangedFingerprints;
    private static KeyPairGenerator keyPairGenerator;
    private static KeyStore keyStore;

    public static boolean checkDeviceFingerprintsChanged() {
        Boolean bool = hasChangedFingerprints;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding").init(2, keyStore.getKey("tmessages_passcode", null));
            hasChangedFingerprints = Boolean.FALSE;
            return false;
        } catch (KeyPermanentlyInvalidatedException unused) {
            hasChangedFingerprints = Boolean.TRUE;
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            hasChangedFingerprints = Boolean.FALSE;
            return false;
        }
    }

    public static void checkKeyReady() {
        checkKeyReady(true);
    }

    public static void deleteInvalidKey() {
        try {
            getKeyStore().deleteEntry("tmessages_passcode");
        } catch (KeyStoreException e7) {
            FileLog.e(e7);
        }
        hasChangedFingerprints = null;
        checkKeyReady(false);
    }

    public static void generateNewKey(boolean z10) {
        KeyPairGenerator keyPairGenerator2 = getKeyPairGenerator();
        if (keyPairGenerator2 != null) {
            try {
                Locale locale = Locale.getDefault();
                setLocale(Locale.ENGLISH);
                keyPairGenerator2.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                keyPairGenerator2.generateKeyPair();
                setLocale(locale);
                AndroidUtilities.runOnUIThread(new x3(1, z10));
            } catch (InvalidAlgorithmParameterException e7) {
                FileLog.e(e7);
            } catch (Exception e10) {
                if (!e10.getClass().getName().equals("android.security.KeyStoreException")) {
                    FileLog.e(e10);
                }
            }
        }
    }

    private static KeyPairGenerator getKeyPairGenerator() {
        KeyPairGenerator keyPairGenerator2 = keyPairGenerator;
        if (keyPairGenerator2 != null) {
            return keyPairGenerator2;
        }
        try {
            KeyPairGenerator keyPairGenerator3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator = keyPairGenerator3;
            return keyPairGenerator3;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    private static KeyStore getKeyStore() {
        KeyStore keyStore2 = keyStore;
        if (keyStore2 != null) {
            return keyStore2;
        }
        try {
            KeyStore keyStore3 = KeyStore.getInstance("AndroidKeyStore");
            keyStore = keyStore3;
            keyStore3.load(null);
            return keyStore;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static boolean isKeyReady() {
        try {
            return getKeyStore().containsAlias("tmessages_passcode");
        } catch (KeyStoreException e7) {
            FileLog.e(e7);
            return false;
        }
    }

    public static void lambda$generateNewKey$0(boolean z10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didGenerateFingerprintKeyPair, Boolean.valueOf(z10));
    }

    private static void setLocale(Locale locale) {
        Locale.setDefault(locale);
        Resources resources = ApplicationLoader.applicationContext.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static void checkKeyReady(boolean z10) {
        if (isKeyReady() || !AndroidUtilities.isKeyguardSecure()) {
            return;
        }
        Context context = ApplicationLoader.applicationContext;
        xf.a aVar = xf.b.f49347a;
        if (aVar.E0(context) && aVar.e(ApplicationLoader.applicationContext)) {
            Utilities.globalQueue.postRunnable(new x3(0, z10));
        }
    }
}
