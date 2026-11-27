package defpackage;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
public final class o35 extends FingerprintManager.AuthenticationCallback {
    public final p35 a;

    public o35(p35 p35Var) {
        this.a = p35Var;
    }

    @Override
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.a.f()) {
            p35 p35Var = this.a;
            if (!p35Var.f) {
                if (i == 5) {
                    p35Var.c("AUTH_CANCELED");
                } else {
                    p35Var.a();
                }
            }
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        if (this.a.f() && (alertDialog = this.a.i) != null) {
            alertDialog.setMessage(ob6.M0(2131742767, null));
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
        p35 p35Var = this.a;
        if (!p35Var.f) {
            p35Var.c(null);
        }
    }
}
