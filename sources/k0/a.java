package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.x;
import androidx.biometric.z;
import java.lang.ref.WeakReference;
import ob.c;
import org.telegram.messenger.gd;
import org.telegram.ui.Wallet.f1;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final int f18199a;
    public final Object f18200b;

    public a(Object obj, int i7) {
        this.f18199a = i7;
        this.f18200b = obj;
    }

    @Override
    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        switch (this.f18199a) {
            case 0:
                ((x) ((a0) ((c) this.f18200b).f21874b).d).a(i7, charSequence);
                return;
            default:
                f1 f1Var = (f1) this.f18200b;
                if (f1Var.f() && !f1Var.f44277f) {
                    if (i7 == 5) {
                        f1Var.c("AUTH_CANCELED");
                        return;
                    } else {
                        f1Var.a();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i7 = this.f18199a;
        Object obj = this.f18200b;
        switch (i7) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) obj).f21874b).d).f1940a;
                if (weakReference.get() != null && ((z) weakReference.get()).f1951n) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1958u == null) {
                        zVar.f1958u = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1958u, Boolean.TRUE);
                    return;
                }
                return;
            default:
                f1 f1Var = (f1) obj;
                if (f1Var.f() && (alertDialog = f1Var.f44279i) != null) {
                    alertDialog.setMessage(gd.N0(2131742865, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationHelp(int i7, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.f18199a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) this.f18200b).f21874b).d).f1940a;
                if (weakReference.get() != null) {
                    z zVar = (z) weakReference.get();
                    if (zVar.f1957t == null) {
                        zVar.f1957t = new androidx.lifecycle.z();
                    }
                    z.h(zVar.f1957t, charSequence);
                    return;
                }
                return;
            default:
                f1 f1Var = (f1) this.f18200b;
                if (f1Var.f() && (alertDialog = f1Var.f44279i) != null) {
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
