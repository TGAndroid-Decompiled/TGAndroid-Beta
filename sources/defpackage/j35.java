package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class j35 extends BiometricPrompt$AuthenticationCallback {
    public final l35 a;

    public j35(l35 l35Var) {
        this.a = l35Var;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        l35 l35Var = this.a;
        if (l35Var.f() && !l35Var.f) {
            if (i != 10 && i != 5) {
                l35Var.a();
            } else {
                l35Var.c("AUTH_CANCELED");
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
