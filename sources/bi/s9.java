package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class s9 implements z4.e {
    public final pb f3735a;
    public final fb f3736b;

    public s9(fb fbVar, pb pbVar) {
        this.f3736b = fbVar;
        this.f3735a = pbVar;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        int i12;
        fb fbVar = this.f3736b;
        fbVar.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        fbVar.J0 = i12;
        fbVar.K0 = f7;
        long j3 = UserConfig.getInstance(fbVar.f3857y0).clientUserId;
        int i13 = fbVar.I0;
        if (i13 >= 0 && (fbVar.f3856x0 != null ? fbVar.f3855w0 == j3 : !(i13 >= fbVar.A0.size() || ((Long) fbVar.A0.get(fbVar.I0)).longValue() != j3))) {
            ((gb) fbVar.B0).d(1.0f - fbVar.K0);
            return;
        }
        int i14 = fbVar.J0;
        if (i14 >= 0 && (fbVar.f3856x0 != null ? fbVar.f3855w0 == j3 : !(i14 >= fbVar.A0.size() || ((Long) fbVar.A0.get(fbVar.J0)).longValue() != j3))) {
            ((gb) fbVar.B0).d(fbVar.K0);
            return;
        }
        ((gb) fbVar.B0).d(0.0f);
    }

    @Override
    public final void b(int i10) {
        fb fbVar = this.f3736b;
        o5 currentPeerView = fbVar.getCurrentPeerView();
        if (currentPeerView != null) {
            h5 h5Var = fbVar.B0;
            gb gbVar = (gb) h5Var;
            gbVar.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            fbVar.F();
            pb pbVar = this.f3735a;
            lb lbVar = pbVar.f3602t0;
            if (lbVar != null) {
                if (i10 < 3) {
                    lbVar.e(false);
                } else if (i10 > fbVar.f3858z0.b() - 4) {
                    pbVar.f3602t0.e(true);
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
        fb fbVar = this.f3736b;
        ((gb) fbVar.B0).d.P();
        Runnable runnable = fbVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            fbVar.G0 = null;
        }
        fbVar.F0 = i10;
        pb pbVar = fbVar.Q0;
        if (pbVar.f3588n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(pbVar.f3563b1);
        }
    }
}
