package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class n35 extends BiometricPrompt$AuthenticationCallback {
    public final p35 a;

    public n35(p35 p35Var) {
        this.a = p35Var;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        p35 p35Var = this.a;
        if (p35Var.f() && !p35Var.f) {
            if (i != 10 && i != 5) {
                p35Var.a();
            } else {
                p35Var.c("AUTH_CANCELED");
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
