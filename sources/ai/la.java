package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class la implements z4.e {
    public final jc f1215a;
    public final zb f1216b;

    public la(zb zbVar, jc jcVar) {
        this.f1216b = zbVar;
        this.f1215a = jcVar;
    }

    @Override
    public final void a(int i10) {
        zb zbVar = this.f1216b;
        f6 currentPeerView = zbVar.getCurrentPeerView();
        if (currentPeerView != null) {
            y5 y5Var = zbVar.B0;
            ac acVar = (ac) y5Var;
            acVar.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            zbVar.F();
            jc jcVar = this.f1215a;
            fc fcVar = jcVar.f1110t0;
            if (fcVar != null) {
                if (i10 < 3) {
                    fcVar.b(false);
                } else if (i10 > zbVar.f1310z0.b() - 4) {
                    jcVar.f1110t0.b(true);
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        zb zbVar = this.f1216b;
        zbVar.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        zbVar.J0 = i12;
        zbVar.K0 = f7;
        long j3 = UserConfig.getInstance(zbVar.f1309y0).clientUserId;
        int i13 = zbVar.I0;
        if (i13 >= 0 && (zbVar.f1308x0 != null ? zbVar.f1307w0 == j3 : !(i13 >= zbVar.A0.size() || ((Long) zbVar.A0.get(zbVar.I0)).longValue() != j3))) {
            ((ac) zbVar.B0).d(1.0f - zbVar.K0);
            return;
        }
        int i14 = zbVar.J0;
        if (i14 >= 0 && (zbVar.f1308x0 != null ? zbVar.f1307w0 == j3 : !(i14 >= zbVar.A0.size() || ((Long) zbVar.A0.get(zbVar.J0)).longValue() != j3))) {
            ((ac) zbVar.B0).d(zbVar.K0);
            return;
        }
        ((ac) zbVar.B0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        zb zbVar = this.f1216b;
        ((ac) zbVar.B0).d.P();
        Runnable runnable = zbVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            zbVar.G0 = null;
        }
        zbVar.F0 = i10;
        jc jcVar = zbVar.Q0;
        if (jcVar.f1096n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(jcVar.f1072b1);
        }
    }
}
