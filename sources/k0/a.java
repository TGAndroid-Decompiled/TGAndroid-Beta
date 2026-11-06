package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.x;
import androidx.biometric.z;
import d6.i;
import java.lang.ref.WeakReference;
import org.telegram.messenger.hd;
import org.telegram.ui.Wallet.w0;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final int f17147a;
    public final Object f17148b;

    public a(Object obj, int i7) {
        this.f17147a = i7;
        this.f17148b = obj;
    }

    @Override
    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        switch (this.f17147a) {
            case 0:
                ((x) ((a0) ((i) this.f17148b).f8209b).d).a(i7, charSequence);
                return;
            default:
                w0 w0Var = (w0) this.f17148b;
                if (w0Var.f() && !w0Var.f43250f) {
                    if (i7 == 5) {
                        w0Var.c("AUTH_CANCELED");
                        return;
                    } else {
                        w0Var.a();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i7 = this.f17147a;
        Object obj = this.f17148b;
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
                w0 w0Var = (w0) obj;
                if (w0Var.f() && (alertDialog = w0Var.f43252i) != null) {
                    alertDialog.setMessage(hd.M0(2131743118, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationHelp(int i7, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.f17147a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((i) this.f17148b).f8209b).d).f2026a;
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
                w0 w0Var = (w0) this.f17148b;
                if (w0Var.f() && (alertDialog = w0Var.f43252i) != null) {
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
