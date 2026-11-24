package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class j15 extends BiometricPrompt$AuthenticationCallback {
    public final l15 a;

    public j15(l15 l15Var) {
        this.a = l15Var;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        l15 l15Var = this.a;
        if (l15Var.f() && !l15Var.f) {
            if (i != 10 && i != 5) {
                l15Var.a();
            } else {
                l15Var.c("AUTH_CANCELED");
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
