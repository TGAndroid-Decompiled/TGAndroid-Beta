package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class p7 implements m2.f {
    public final i9 f17631a;
    public final y8 f17632b;

    public p7(y8 y8Var, i9 i9Var) {
        this.f17632b = y8Var;
        this.f17631a = i9Var;
    }

    @Override
    public final void a(int i10) {
        y8 y8Var = this.f17632b;
        f4 currentPeerView = y8Var.getCurrentPeerView();
        if (currentPeerView != null) {
            z3 z3Var = y8Var.f17700y0;
            z8 z8Var = (z8) z3Var;
            z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            y8Var.F();
            i9 i9Var = this.f17631a;
            e9 e9Var = i9Var.f17290q0;
            if (e9Var != null) {
                if (i10 < 3) {
                    e9Var.b(false);
                } else if (i10 > y8Var.f17698w0.b() - 4) {
                    i9Var.f17290q0.b(true);
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        int i12;
        y8 y8Var = this.f17632b;
        y8Var.F0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        y8Var.G0 = i12;
        y8Var.H0 = f10;
        long j10 = UserConfig.getInstance(y8Var.f17697v0).clientUserId;
        int i13 = y8Var.F0;
        if (i13 >= 0 && (y8Var.f17696u0 != null ? y8Var.f17695t0 == j10 : !(i13 >= y8Var.f17699x0.size() || ((Long) y8Var.f17699x0.get(y8Var.F0)).longValue() != j10))) {
            ((z8) y8Var.f17700y0).d(1.0f - y8Var.H0);
            return;
        }
        int i14 = y8Var.G0;
        if (i14 >= 0 && (y8Var.f17696u0 != null ? y8Var.f17695t0 == j10 : !(i14 >= y8Var.f17699x0.size() || ((Long) y8Var.f17699x0.get(y8Var.G0)).longValue() != j10))) {
            ((z8) y8Var.f17700y0).d(y8Var.H0);
            return;
        }
        ((z8) y8Var.f17700y0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        y8 y8Var = this.f17632b;
        ((z8) y8Var.f17700y0).d.P();
        Runnable runnable = y8Var.D0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            y8Var.D0 = null;
        }
        y8Var.C0 = i10;
        i9 i9Var = y8Var.N0;
        if (i9Var.f17279k0.C0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(i9Var.Y0);
        }
    }
}
