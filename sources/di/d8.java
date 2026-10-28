package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class d8 implements a5.i {
    public final y9 f8492a;
    public final x f8493b;

    public d8(x xVar, y9 y9Var) {
        this.f8493b = xVar;
        this.f8492a = y9Var;
    }

    @Override
    public final void a(int i10) {
        x xVar = this.f8493b;
        q4 currentPeerView = xVar.getCurrentPeerView();
        if (currentPeerView != null) {
            j4 j4Var = xVar.B0;
            p9 p9Var = (p9) j4Var;
            p9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            xVar.F();
            y9 y9Var = this.f8492a;
            u9 u9Var = y9Var.f9458t0;
            if (u9Var != null) {
                if (i10 < 3) {
                    u9Var.b(false);
                } else if (i10 > xVar.f8565z0.b() - 4) {
                    y9Var.f9458t0.b(true);
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        x xVar = this.f8493b;
        xVar.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        xVar.J0 = i12;
        xVar.K0 = f7;
        long j10 = UserConfig.getInstance(xVar.f8564y0).clientUserId;
        int i13 = xVar.I0;
        if (i13 >= 0 && (xVar.f8563x0 != null ? xVar.f8562w0 == j10 : !(i13 >= xVar.A0.size() || ((Long) xVar.A0.get(xVar.I0)).longValue() != j10))) {
            ((p9) xVar.B0).d(1.0f - xVar.K0);
            return;
        }
        int i14 = xVar.J0;
        if (i14 >= 0 && (xVar.f8563x0 != null ? xVar.f8562w0 == j10 : !(i14 >= xVar.A0.size() || ((Long) xVar.A0.get(xVar.J0)).longValue() != j10))) {
            ((p9) xVar.B0).d(xVar.K0);
            return;
        }
        ((p9) xVar.B0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        x xVar = this.f8493b;
        ((p9) xVar.B0).d.Q();
        Runnable runnable = xVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            xVar.G0 = null;
        }
        xVar.F0 = i10;
        y9 y9Var = ((o9) xVar).R0;
        if (y9Var.f9444n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(y9Var.f9420b1);
        }
    }
}
