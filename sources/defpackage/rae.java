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
public abstract class rae {
    public static gj0 a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b = p33.b("androidxBiometric", 3);
            p33.d(b);
            p33.e(b);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            p33.c(keyGenerator, p33.a(b));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) keyStore.getKey("androidxBiometric", null));
            return new gj0(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(gj0 gj0Var) {
        IdentityCredential identityCredential;
        if (gj0Var == null) {
            return null;
        }
        Cipher cipher = gj0Var.b;
        if (cipher != null) {
            return q33.b(cipher);
        }
        Signature signature = gj0Var.a;
        if (signature != null) {
            return q33.a(signature);
        }
        Mac mac = gj0Var.c;
        if (mac != null) {
            return q33.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = gj0Var.d) == null) {
            return null;
        }
        return r33.a(identityCredential);
    }
}
