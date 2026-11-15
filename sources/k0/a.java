package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.x;
import androidx.biometric.z;
import java.lang.ref.WeakReference;
import ob.c;
import org.telegram.messenger.hd;
import org.telegram.ui.Wallet.u0;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final int f17708a;
    public final Object f17709b;

    public a(Object obj, int i7) {
        this.f17708a = i7;
        this.f17709b = obj;
    }

    @Override
    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        switch (this.f17708a) {
            case 0:
                ((x) ((a0) ((c) this.f17709b).f21417b).d).a(i7, charSequence);
                return;
            default:
                u0 u0Var = (u0) this.f17709b;
                if (u0Var.f() && !u0Var.f44541f) {
                    if (i7 == 5) {
                        u0Var.c("AUTH_CANCELED");
                        return;
                    } else {
                        u0Var.a();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i7 = this.f17708a;
        Object obj = this.f17709b;
        switch (i7) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) obj).f21417b).d).f1977a;
                if (weakReference.get() != null && ((z) weakReference.get()).f1988n) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1995u == null) {
                        zVar.f1995u = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1995u, Boolean.TRUE);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) obj;
                if (u0Var.f() && (alertDialog = u0Var.f44543i) != null) {
                    alertDialog.setMessage(hd.M0(2131743117, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationHelp(int i7, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.f17708a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) this.f17709b).f21417b).d).f1977a;
                if (weakReference.get() != null) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1994t == null) {
                        zVar.f1994t = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1994t, charSequence);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.f17709b;
                if (u0Var.f() && (alertDialog = u0Var.f44543i) != null) {
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
