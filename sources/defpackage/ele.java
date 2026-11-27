package defpackage;

import android.app.KeyguardManager;
import android.graphics.Typeface;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.crypto.Cipher;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
public abstract class ele {
    public static KeyStore a;
    public static KeyPairGenerator b;
    public static Boolean c;

    public static boolean a() {
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding").init(2, a.getKey("tmessages_passcode", null));
            c = Boolean.FALSE;
            return false;
        } catch (KeyPermanentlyInvalidatedException unused) {
            c = Boolean.TRUE;
            return true;
        } catch (Exception e) {
            cc4.g(e, true);
            c = Boolean.FALSE;
            return false;
        }
    }

    public static void b(boolean z) {
        if (!d()) {
            Typeface typeface = hl.a;
            if (((KeyguardManager) a.b.getSystemService("keyguard")).isKeyguardSecure() && ei4.b(a.b) && ei4.a(a.b)) {
                Utilities.e.c(new wh4((byte) 0, z));
            }
        }
    }

    public static KeyStore c() {
        KeyStore keyStore = a;
        if (keyStore != null) {
            return keyStore;
        }
        try {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            a = keyStore2;
            keyStore2.load(null);
            return a;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public static boolean d() {
        try {
            return c().containsAlias("tmessages_passcode");
        } catch (KeyStoreException e) {
            cc4.g(e, true);
            return false;
        }
    }
}
