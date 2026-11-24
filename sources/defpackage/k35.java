package defpackage;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
public final class k35 extends FingerprintManager.AuthenticationCallback {
    public final l35 a;

    public k35(l35 l35Var) {
        this.a = l35Var;
    }

    @Override
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.a.f()) {
            l35 l35Var = this.a;
            if (!l35Var.f) {
                if (i == 5) {
                    l35Var.c("AUTH_CANCELED");
                } else {
                    l35Var.a();
                }
            }
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        if (this.a.f() && (alertDialog = this.a.i) != null) {
            alertDialog.setMessage(jb6.M0(2131742799, null));
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
        l35 l35Var = this.a;
        if (!l35Var.f) {
            l35Var.c(null);
        }
    }
}
