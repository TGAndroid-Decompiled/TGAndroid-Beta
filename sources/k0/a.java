package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.x;
import androidx.biometric.z;
import java.lang.ref.WeakReference;
import ob.c;
import org.telegram.messenger.gd;
import org.telegram.ui.Wallet.e1;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final int f18103a;
    public final Object f18104b;

    public a(Object obj, int i7) {
        this.f18103a = i7;
        this.f18104b = obj;
    }

    @Override
    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        switch (this.f18103a) {
            case 0:
                ((x) ((a0) ((c) this.f18104b).f21783b).d).a(i7, charSequence);
                return;
            default:
                e1 e1Var = (e1) this.f18104b;
                if (e1Var.f() && !e1Var.f44104f) {
                    if (i7 == 5) {
                        e1Var.c("AUTH_CANCELED");
                        return;
                    } else {
                        e1Var.a();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i7 = this.f18103a;
        Object obj = this.f18104b;
        switch (i7) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) obj).f21783b).d).f1968a;
                if (weakReference.get() != null && ((z) weakReference.get()).f1979n) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1986u == null) {
                        zVar.f1986u = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1986u, Boolean.TRUE);
                    return;
                }
                return;
            default:
                e1 e1Var = (e1) obj;
                if (e1Var.f() && (alertDialog = e1Var.f44106i) != null) {
                    alertDialog.setMessage(gd.M0(2131742878, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationHelp(int i7, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.f18103a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) this.f18104b).f21783b).d).f1968a;
                if (weakReference.get() != null) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1985t == null) {
                        zVar.f1985t = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1985t, charSequence);
                    return;
                }
                return;
            default:
                e1 e1Var = (e1) this.f18104b;
                if (e1Var.f() && (alertDialog = e1Var.f44106i) != null) {
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
