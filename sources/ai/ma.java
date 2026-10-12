package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class ma implements z4.e {
    public final kc f1427a;
    public final ac f1428b;

    public ma(ac acVar, kc kcVar) {
        this.f1428b = acVar;
        this.f1427a = kcVar;
    }

    @Override
    public final void a(int i10) {
        ac acVar = this.f1428b;
        f6 currentPeerView = acVar.getCurrentPeerView();
        if (currentPeerView != null) {
            y5 y5Var = acVar.B0;
            bc bcVar = (bc) y5Var;
            bcVar.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            acVar.F();
            kc kcVar = this.f1427a;
            gc gcVar = kcVar.f1295t0;
            if (gcVar != null) {
                if (i10 < 3) {
                    gcVar.b(false);
                } else if (i10 > acVar.f1542z0.b() - 4) {
                    kcVar.f1295t0.b(true);
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        ac acVar = this.f1428b;
        acVar.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        acVar.J0 = i12;
        acVar.K0 = f7;
        long j3 = UserConfig.getInstance(acVar.f1541y0).clientUserId;
        int i13 = acVar.I0;
        if (i13 >= 0 && (acVar.f1540x0 != null ? acVar.f1539w0 == j3 : !(i13 >= acVar.A0.size() || ((Long) acVar.A0.get(acVar.I0)).longValue() != j3))) {
            ((bc) acVar.B0).d(1.0f - acVar.K0);
            return;
        }
        int i14 = acVar.J0;
        if (i14 >= 0 && (acVar.f1540x0 != null ? acVar.f1539w0 == j3 : !(i14 >= acVar.A0.size() || ((Long) acVar.A0.get(acVar.J0)).longValue() != j3))) {
            ((bc) acVar.B0).d(acVar.K0);
            return;
        }
        ((bc) acVar.B0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        ac acVar = this.f1428b;
        ((bc) acVar.B0).d.P();
        Runnable runnable = acVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            acVar.G0 = null;
        }
        acVar.F0 = i10;
        kc kcVar = acVar.Q0;
        if (kcVar.f1281n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(kcVar.f1256b1);
        }
    }
}
