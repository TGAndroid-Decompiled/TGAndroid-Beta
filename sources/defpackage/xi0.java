package defpackage;

import android.hardware.biometrics.BiometricPrompt;
public abstract class xi0 {
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
