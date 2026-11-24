package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.a;
public final class zh4 implements Runnable {
    public final byte a;
    public final boolean b;

    public zh4(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.b;
        switch (b) {
            case 0:
                KeyPairGenerator keyPairGenerator = jie.b;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        jie.b = keyPairGenerator;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        keyPairGenerator = null;
                    }
                }
                if (keyPairGenerator != null) {
                    try {
                        Locale locale = Locale.getDefault();
                        Locale locale2 = Locale.ENGLISH;
                        Locale.setDefault(locale2);
                        Resources resources = a.b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = a.b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        gm.c3(new zh4((byte) 1, z));
                        return;
                    } catch (InvalidAlgorithmParameterException e2) {
                        fc4.g(e2, true);
                        return;
                    } catch (Exception e3) {
                        if (!e3.getClass().getName().equals("android.security.KeyStoreException")) {
                            fc4.g(e3, true);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                nm7.e().k(133, Boolean.valueOf(z));
                return;
            case 2:
                Iterator it = e86.n.iterator();
                while (it.hasNext()) {
                    qac qacVar = (qac) it.next();
                    if (qacVar != null) {
                        qacVar.a(Boolean.valueOf(z));
                    }
                }
                return;
            default:
                nm7.e().k(269, Boolean.FALSE, Boolean.valueOf(z));
                return;
        }
    }
}
