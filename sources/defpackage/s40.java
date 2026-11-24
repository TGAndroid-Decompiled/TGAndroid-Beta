package defpackage;

import android.hardware.biometrics.BiometricPrompt;
public abstract class s40 {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
