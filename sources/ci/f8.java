package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class f8 implements z4.f {
    public final z9 f5327a;
    public final p9 f5328b;

    public f8(p9 p9Var, z9 z9Var) {
        this.f5328b = p9Var;
        this.f5327a = z9Var;
    }

    @Override
    public final void a(int i10) {
        p9 p9Var = this.f5328b;
        p4 currentPeerView = p9Var.getCurrentPeerView();
        if (currentPeerView != null) {
            i4 i4Var = p9Var.B0;
            q9 q9Var = (q9) i4Var;
            q9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            p9Var.F();
            z9 z9Var = this.f5327a;
            v9 v9Var = z9Var.f6263t0;
            if (v9Var != null) {
                if (i10 < 3) {
                    v9Var.b(false);
                } else if (i10 > p9Var.f5424z0.b() - 4) {
                    z9Var.f6263t0.b(true);
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        p9 p9Var = this.f5328b;
        p9Var.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        p9Var.J0 = i12;
        p9Var.K0 = f7;
        long j10 = UserConfig.getInstance(p9Var.f5423y0).clientUserId;
        int i13 = p9Var.I0;
        if (i13 >= 0 && (p9Var.f5422x0 != null ? p9Var.f5421w0 == j10 : !(i13 >= p9Var.A0.size() || ((Long) p9Var.A0.get(p9Var.I0)).longValue() != j10))) {
            ((q9) p9Var.B0).d(1.0f - p9Var.K0);
            return;
        }
        int i14 = p9Var.J0;
        if (i14 >= 0 && (p9Var.f5422x0 != null ? p9Var.f5421w0 == j10 : !(i14 >= p9Var.A0.size() || ((Long) p9Var.A0.get(p9Var.J0)).longValue() != j10))) {
            ((q9) p9Var.B0).d(p9Var.K0);
            return;
        }
        ((q9) p9Var.B0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        p9 p9Var = this.f5328b;
        ((q9) p9Var.B0).d.P();
        Runnable runnable = p9Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            p9Var.G0 = null;
        }
        p9Var.F0 = i10;
        z9 z9Var = p9Var.Q0;
        if (z9Var.f6249n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(z9Var.f6225b1);
        }
    }
}
