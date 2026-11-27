package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
public abstract class hfe {
    public static hj0 a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b = h43.b("androidxBiometric", 3);
            h43.d(b);
            h43.e(b);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            h43.c(keyGenerator, h43.a(b));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) keyStore.getKey("androidxBiometric", null));
            return new hj0(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(hj0 hj0Var) {
        IdentityCredential identityCredential;
        if (hj0Var == null) {
            return null;
        }
        Cipher cipher = hj0Var.b;
        if (cipher != null) {
            return i43.b(cipher);
        }
        Signature signature = hj0Var.a;
        if (signature != null) {
            return i43.a(signature);
        }
        Mac mac = hj0Var.c;
        if (mac != null) {
            return i43.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = hj0Var.d) == null) {
            return null;
        }
        return j43.a(identityCredential);
    }
}
