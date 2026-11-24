package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public abstract class dg4 {
    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, cg4 cg4Var) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, cg4Var, null);
    }

    public static FingerprintManager.CryptoObject b(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager c(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean d(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean e(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static xl3 f(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                return new xl3(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new xl3(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new xl3(cryptoObject.getMac());
            }
            return null;
        }
        return null;
    }

    public static FingerprintManager.CryptoObject g(xl3 xl3Var) {
        if (xl3Var == null) {
            return null;
        }
        Mac mac = (Mac) xl3Var.d;
        Signature signature = (Signature) xl3Var.b;
        Cipher cipher = (Cipher) xl3Var.c;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        if (mac == null) {
            return null;
        }
        return new FingerprintManager.CryptoObject(mac);
    }
}
