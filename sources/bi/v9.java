package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class v9 implements z4.e {
    public final sb f3883a;
    public final ib f3884b;

    public v9(ib ibVar, sb sbVar) {
        this.f3884b = ibVar;
        this.f3883a = sbVar;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        int i12;
        ib ibVar = this.f3884b;
        ibVar.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        ibVar.J0 = i12;
        ibVar.K0 = f7;
        long j10 = UserConfig.getInstance(ibVar.f3990y0).clientUserId;
        int i13 = ibVar.I0;
        if (i13 >= 0 && (ibVar.f3989x0 != null ? ibVar.f3988w0 == j10 : !(i13 >= ibVar.A0.size() || ((Long) ibVar.A0.get(ibVar.I0)).longValue() != j10))) {
            ((jb) ibVar.B0).d(1.0f - ibVar.K0);
            return;
        }
        int i14 = ibVar.J0;
        if (i14 >= 0 && (ibVar.f3989x0 != null ? ibVar.f3988w0 == j10 : !(i14 >= ibVar.A0.size() || ((Long) ibVar.A0.get(ibVar.J0)).longValue() != j10))) {
            ((jb) ibVar.B0).d(ibVar.K0);
            return;
        }
        ((jb) ibVar.B0).d(0.0f);
    }

    @Override
    public final void b(int i10) {
        ib ibVar = this.f3884b;
        q5 currentPeerView = ibVar.getCurrentPeerView();
        if (currentPeerView != null) {
            j5 j5Var = ibVar.B0;
            jb jbVar = (jb) j5Var;
            jbVar.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            ibVar.F();
            sb sbVar = this.f3883a;
            ob obVar = sbVar.f3707t0;
            if (obVar != null) {
                if (i10 < 3) {
                    obVar.b(false);
                } else if (i10 > ibVar.f3991z0.b() - 4) {
                    sbVar.f3707t0.b(true);
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
        ib ibVar = this.f3884b;
        ((jb) ibVar.B0).d.P();
        Runnable runnable = ibVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            ibVar.G0 = null;
        }
        ibVar.F0 = i10;
        sb sbVar = ibVar.Q0;
        if (sbVar.f3693n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(sbVar.f3669b1);
        }
    }
}
