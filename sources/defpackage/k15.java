package defpackage;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
public final class k15 extends FingerprintManager.AuthenticationCallback {
    public final l15 a;

    public k15(l15 l15Var) {
        this.a = l15Var;
    }

    @Override
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.a.f()) {
            l15 l15Var = this.a;
            if (!l15Var.f) {
                if (i == 5) {
                    l15Var.c("AUTH_CANCELED");
                } else {
                    l15Var.a();
                }
            }
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        if (this.a.f() && (alertDialog = this.a.i) != null) {
            alertDialog.setMessage(k96.M0(2131742873, null));
        }
    }

    @Override
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        AlertDialog alertDialog;
        if (this.a.f() && (alertDialog = this.a.i) != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        l15 l15Var = this.a;
        if (!l15Var.f) {
            l15Var.c(null);
        }
    }
}
