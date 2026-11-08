package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.x;
import androidx.biometric.z;
import d6.i;
import java.lang.ref.WeakReference;
import org.telegram.messenger.id;
import org.telegram.ui.Wallet.v0;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final int f17150a;
    public final Object f17151b;

    public a(Object obj, int i7) {
        this.f17150a = i7;
        this.f17151b = obj;
    }

    @Override
    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        switch (this.f17150a) {
            case 0:
                ((x) ((a0) ((i) this.f17151b).f8209b).d).a(i7, charSequence);
                return;
            default:
                v0 v0Var = (v0) this.f17151b;
                if (v0Var.f() && !v0Var.f43221f) {
                    if (i7 == 5) {
                        v0Var.c("AUTH_CANCELED");
                        return;
                    } else {
                        v0Var.a();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i7 = this.f17150a;
        Object obj = this.f17151b;
        switch (i7) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((i) obj).f8209b).d).f2026a;
                if (weakReference.get() != null && ((z) weakReference.get()).f2037n) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f2044u == null) {
                        zVar.f2044u = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f2044u, Boolean.TRUE);
                    return;
                }
                return;
            default:
                v0 v0Var = (v0) obj;
                if (v0Var.f() && (alertDialog = v0Var.f43223i) != null) {
                    alertDialog.setMessage(id.M0(2131743120, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationHelp(int i7, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.f17150a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((i) this.f17151b).f8209b).d).f2026a;
                if (weakReference.get() != null) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f2043t == null) {
                        zVar.f2043t = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f2043t, charSequence);
                    return;
                }
                return;
            default:
                v0 v0Var = (v0) this.f17151b;
                if (v0Var.f() && (alertDialog = v0Var.f43223i) != null) {
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
