package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class g8 implements z4.e {
    public final aa f5426a;
    public final q9 f5427b;

    public g8(q9 q9Var, aa aaVar) {
        this.f5427b = q9Var;
        this.f5426a = aaVar;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        int i12;
        q9 q9Var = this.f5427b;
        q9Var.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        q9Var.J0 = i12;
        q9Var.K0 = f7;
        long j10 = UserConfig.getInstance(q9Var.f5517y0).clientUserId;
        int i13 = q9Var.I0;
        if (i13 >= 0 && (q9Var.f5516x0 != null ? q9Var.f5515w0 == j10 : !(i13 >= q9Var.A0.size() || ((Long) q9Var.A0.get(q9Var.I0)).longValue() != j10))) {
            ((r9) q9Var.B0).d(1.0f - q9Var.K0);
            return;
        }
        int i14 = q9Var.J0;
        if (i14 >= 0 && (q9Var.f5516x0 != null ? q9Var.f5515w0 == j10 : !(i14 >= q9Var.A0.size() || ((Long) q9Var.A0.get(q9Var.J0)).longValue() != j10))) {
            ((r9) q9Var.B0).d(q9Var.K0);
            return;
        }
        ((r9) q9Var.B0).d(0.0f);
    }

    @Override
    public final void b(int i10) {
        q9 q9Var = this.f5427b;
        q4 currentPeerView = q9Var.getCurrentPeerView();
        if (currentPeerView != null) {
            j4 j4Var = q9Var.B0;
            r9 r9Var = (r9) j4Var;
            r9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            q9Var.F();
            aa aaVar = this.f5426a;
            w9 w9Var = aaVar.f5219t0;
            if (w9Var != null) {
                if (i10 < 3) {
                    w9Var.b(false);
                } else if (i10 > q9Var.f5518z0.b() - 4) {
                    aaVar.f5219t0.b(true);
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
        q9 q9Var = this.f5427b;
        ((r9) q9Var.B0).d.P();
        Runnable runnable = q9Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            q9Var.G0 = null;
        }
        q9Var.F0 = i10;
        aa aaVar = q9Var.Q0;
        if (aaVar.f5205n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(aaVar.f5181b1);
        }
    }
}
