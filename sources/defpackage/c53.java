package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;
public abstract class c53 {
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
