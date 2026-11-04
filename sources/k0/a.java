package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.x;
import androidx.biometric.z;
import bb.c;
import java.lang.ref.WeakReference;
import org.telegram.messenger.bd;
import org.telegram.ui.Wallet.t0;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final int f16434a;
    public final Object f16435b;

    public a(Object obj, int i3) {
        this.f16434a = i3;
        this.f16435b = obj;
    }

    @Override
    public final void onAuthenticationError(int i3, CharSequence charSequence) {
        switch (this.f16434a) {
            case 0:
                ((x) ((a0) ((c) this.f16435b).f3211b).d).a(i3, charSequence);
                return;
            default:
                t0 t0Var = (t0) this.f16435b;
                if (t0Var.f() && !t0Var.f43188f) {
                    if (i3 == 5) {
                        t0Var.c("AUTH_CANCELED");
                        return;
                    } else {
                        t0Var.a();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i3 = this.f16434a;
        Object obj = this.f16435b;
        switch (i3) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) obj).f3211b).d).f1449a;
                if (weakReference.get() != null && ((z) weakReference.get()).f1460n) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1467u == null) {
                        zVar.f1467u = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1467u, Boolean.TRUE);
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) obj;
                if (t0Var.f() && (alertDialog = t0Var.f43190i) != null) {
                    alertDialog.setMessage(bd.M0(2131743127, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationHelp(int i3, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.f16434a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) this.f16435b).f3211b).d).f1449a;
                if (weakReference.get() != null) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1466t == null) {
                        zVar.f1466t = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1466t, charSequence);
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) this.f16435b;
                if (t0Var.f() && (alertDialog = t0Var.f43190i) != null) {
                    alertDialog.setMessage(charSequence);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
