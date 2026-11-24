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
public abstract class sce {
    public static gk0 a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b = a53.b("androidxBiometric", 3);
            a53.d(b);
            a53.e(b);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a53.c(keyGenerator, a53.a(b));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) keyStore.getKey("androidxBiometric", null));
            return new gk0(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(gk0 gk0Var) {
        IdentityCredential identityCredential;
        if (gk0Var == null) {
            return null;
        }
        Cipher cipher = gk0Var.b;
        if (cipher != null) {
            return b53.b(cipher);
        }
        Signature signature = gk0Var.a;
        if (signature != null) {
            return b53.a(signature);
        }
        Mac mac = gk0Var.c;
        if (mac != null) {
            return b53.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = gk0Var.d) == null) {
            return null;
        }
        return c53.a(identityCredential);
    }
}
