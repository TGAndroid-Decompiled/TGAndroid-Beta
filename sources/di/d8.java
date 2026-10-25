package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class d8 implements a5.i {
    public final y9 f8493a;
    public final o9 f8494b;

    public d8(o9 o9Var, y9 y9Var) {
        this.f8494b = o9Var;
        this.f8493a = y9Var;
    }

    @Override
    public final void a(int i10) {
        o9 o9Var = this.f8494b;
        q4 currentPeerView = o9Var.getCurrentPeerView();
        if (currentPeerView != null) {
            j4 j4Var = o9Var.B0;
            p9 p9Var = (p9) j4Var;
            p9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            o9Var.F();
            y9 y9Var = this.f8493a;
            u9 u9Var = y9Var.f9459t0;
            if (u9Var != null) {
                if (i10 < 3) {
                    u9Var.b(false);
                } else if (i10 > o9Var.f8566z0.b() - 4) {
                    y9Var.f9459t0.b(true);
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        o9 o9Var = this.f8494b;
        o9Var.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        o9Var.J0 = i12;
        o9Var.K0 = f7;
        long j10 = UserConfig.getInstance(o9Var.f8565y0).clientUserId;
        int i13 = o9Var.I0;
        if (i13 >= 0 && (o9Var.f8564x0 != null ? o9Var.f8563w0 == j10 : !(i13 >= o9Var.A0.size() || ((Long) o9Var.A0.get(o9Var.I0)).longValue() != j10))) {
            ((p9) o9Var.B0).d(1.0f - o9Var.K0);
            return;
        }
        int i14 = o9Var.J0;
        if (i14 >= 0 && (o9Var.f8564x0 != null ? o9Var.f8563w0 == j10 : !(i14 >= o9Var.A0.size() || ((Long) o9Var.A0.get(o9Var.J0)).longValue() != j10))) {
            ((p9) o9Var.B0).d(o9Var.K0);
            return;
        }
        ((p9) o9Var.B0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        o9 o9Var = this.f8494b;
        ((p9) o9Var.B0).d.P();
        Runnable runnable = o9Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            o9Var.G0 = null;
        }
        o9Var.F0 = i10;
        y9 y9Var = o9Var.Q0;
        if (y9Var.f9445n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(y9Var.f9421b1);
        }
    }
}
