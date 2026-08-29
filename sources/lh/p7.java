package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class p7 implements m2.e {
    public final i9 f16096a;
    public final y8 f16097b;

    public p7(y8 y8Var, i9 i9Var) {
        this.f16097b = y8Var;
        this.f16096a = i9Var;
    }

    @Override
    public final void a(int i10) {
        y8 y8Var = this.f16097b;
        d4 currentPeerView = y8Var.getCurrentPeerView();
        if (currentPeerView != null) {
            x3 x3Var = y8Var.f16183x0;
            z8 z8Var = (z8) x3Var;
            z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            y8Var.F();
            i9 i9Var = this.f16096a;
            e9 e9Var = i9Var.f15776p0;
            if (e9Var != null) {
                if (i10 < 3) {
                    e9Var.d(false);
                } else if (i10 > y8Var.f16181v0.b() - 4) {
                    i9Var.f15776p0.d(true);
                }
            }
        }
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        int i12;
        y8 y8Var = this.f16097b;
        y8Var.E0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        y8Var.F0 = i12;
        y8Var.G0 = f9;
        long j10 = UserConfig.getInstance(y8Var.f16180u0).clientUserId;
        int i13 = y8Var.E0;
        if (i13 >= 0 && (y8Var.f16179t0 != null ? y8Var.f16178s0 == j10 : !(i13 >= y8Var.f16182w0.size() || ((Long) y8Var.f16182w0.get(y8Var.E0)).longValue() != j10))) {
            ((z8) y8Var.f16183x0).d(1.0f - y8Var.G0);
            return;
        }
        int i14 = y8Var.F0;
        if (i14 >= 0 && (y8Var.f16179t0 != null ? y8Var.f16178s0 == j10 : !(i14 >= y8Var.f16182w0.size() || ((Long) y8Var.f16182w0.get(y8Var.F0)).longValue() != j10))) {
            ((z8) y8Var.f16183x0).d(y8Var.G0);
            return;
        }
        ((z8) y8Var.f16183x0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        y8 y8Var = this.f16097b;
        ((z8) y8Var.f16183x0).d.P();
        Runnable runnable = y8Var.C0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            y8Var.C0 = null;
        }
        y8Var.B0 = i10;
        i9 i9Var = y8Var.M0;
        if (i9Var.f15765j0.B0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
        }
    }
}
