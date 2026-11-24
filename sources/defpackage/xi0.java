package defpackage;

import android.hardware.biometrics.BiometricPrompt;
public abstract class xi0 {
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}
