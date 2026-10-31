package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import k6.h;
import org.telegram.messenger.cd;
import org.telegram.ui.Wallet.u0;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final int f10518a;
    public final Object f10519b;

    public a(Object obj, int i10) {
        this.f10518a = i10;
        this.f10519b = obj;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        switch (this.f10518a) {
            case 0:
                ((w) ((a0) ((h) this.f10519b).f10943b).d).a(i10, charSequence);
                return;
            default:
                u0 u0Var = (u0) this.f10519b;
                if (u0Var.f() && !u0Var.f35261f) {
                    if (i10 == 5) {
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
        int i10 = this.f10518a;
        Object obj = this.f10519b;
        switch (i10) {
            case 0:
                WeakReference weakReference = ((w) ((a0) ((h) obj).f10943b).d).f1122a;
                if (weakReference.get() != null && ((y) weakReference.get()).f1132n) {
                    y yVar = (y) weakReference.get();
                    if (yVar.f1139u == null) {
                        yVar.f1139u = new z();
                    }
                    y.h(yVar.f1139u, Boolean.TRUE);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) obj;
                if (u0Var.f() && (alertDialog = u0Var.f35263i) != null) {
                    alertDialog.setMessage(cd.L0(2131743143, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.f10518a) {
            case 0:
                WeakReference weakReference = ((w) ((a0) ((h) this.f10519b).f10943b).d).f1122a;
                if (weakReference.get() != null) {
                    y yVar = (y) weakReference.get();
                    if (yVar.f1138t == null) {
                        yVar.f1138t = new z();
                    }
                    y.h(yVar.f1138t, charSequence);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.f10519b;
                if (u0Var.f() && (alertDialog = u0Var.f35263i) != null) {
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
