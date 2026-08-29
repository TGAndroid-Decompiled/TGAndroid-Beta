package h7;

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
public abstract class w {
    public static androidx.biometric.v a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b10 = androidx.biometric.b0.b("androidxBiometric", 3);
            androidx.biometric.b0.d(b10);
            androidx.biometric.b0.e(b10);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            androidx.biometric.b0.c(keyGenerator, androidx.biometric.b0.a(b10));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) keyStore.getKey("androidxBiometric", null));
            return new androidx.biometric.v(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e10) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e10);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(androidx.biometric.v vVar) {
        IdentityCredential identityCredential;
        if (vVar == null) {
            return null;
        }
        Cipher cipher = vVar.f1057b;
        if (cipher != null) {
            return androidx.biometric.c0.b(cipher);
        }
        Signature signature = vVar.f1056a;
        if (signature != null) {
            return androidx.biometric.c0.a(signature);
        }
        Mac mac = vVar.f1058c;
        if (mac != null) {
            return androidx.biometric.c0.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = vVar.d) == null) {
            return null;
        }
        return androidx.biometric.d0.a(identityCredential);
    }
}
