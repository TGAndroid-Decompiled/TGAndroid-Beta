package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class s7 implements m2.e {
    public final m9 f12124a;
    public final c9 f12125b;

    public s7(c9 c9Var, m9 m9Var) {
        this.f12125b = c9Var;
        this.f12124a = m9Var;
    }

    @Override
    public final void b(int i9) {
        c9 c9Var = this.f12125b;
        i4 currentPeerView = c9Var.getCurrentPeerView();
        if (currentPeerView != null) {
            c4 c4Var = c9Var.f12207x0;
            d9 d9Var = (d9) c4Var;
            d9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            c9Var.F();
            m9 m9Var = this.f12124a;
            i9 i9Var = m9Var.f11817p0;
            if (i9Var != null) {
                if (i9 < 3) {
                    i9Var.d(false);
                } else if (i9 > c9Var.f12205v0.b() - 4) {
                    m9Var.f11817p0.d(true);
                }
            }
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        int i11;
        c9 c9Var = this.f12125b;
        c9Var.E0 = i9;
        if (i10 > 0) {
            i11 = i9 + 1;
        } else {
            i11 = i9 - 1;
        }
        c9Var.F0 = i11;
        c9Var.G0 = f10;
        long j10 = UserConfig.getInstance(c9Var.f12204u0).clientUserId;
        int i12 = c9Var.E0;
        if (i12 >= 0 && (c9Var.f12203t0 != null ? c9Var.f12202s0 == j10 : !(i12 >= c9Var.f12206w0.size() || ((Long) c9Var.f12206w0.get(c9Var.E0)).longValue() != j10))) {
            ((d9) c9Var.f12207x0).d(1.0f - c9Var.G0);
            return;
        }
        int i13 = c9Var.F0;
        if (i13 >= 0 && (c9Var.f12203t0 != null ? c9Var.f12202s0 == j10 : !(i13 >= c9Var.f12206w0.size() || ((Long) c9Var.f12206w0.get(c9Var.F0)).longValue() != j10))) {
            ((d9) c9Var.f12207x0).d(c9Var.G0);
            return;
        }
        ((d9) c9Var.f12207x0).d(0.0f);
    }

    @Override
    public final void d(int i9) {
        c9 c9Var = this.f12125b;
        ((d9) c9Var.f12207x0).d.P();
        Runnable runnable = c9Var.C0;
        if (runnable != null && i9 == 0) {
            runnable.run();
            c9Var.C0 = null;
        }
        c9Var.B0 = i9;
        m9 m9Var = c9Var.M0;
        if (m9Var.f11806j0.B0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(m9Var.X0);
        }
    }
}
