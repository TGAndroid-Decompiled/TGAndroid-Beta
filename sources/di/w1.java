package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zz;
import org.telegram.ui.aq0;
public final class w1 extends g.o {
    public final int f8026c;
    public final Object d;

    public w1(Object obj, int i10) {
        this.f8026c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f8026c) {
            case 0:
                x1 x1Var = (x1) this.d;
                if (x1Var.Y.f8120c.F(i10) == null) {
                    return x1Var.J;
                }
                x1Var.B1();
                return x1Var.R.get(i10);
            case 1:
                d2 d2Var = (d2) this.d;
                if (d2Var.f6781c.j(i10) != 2) {
                    return d2Var.h;
                }
                return 1;
            case 2:
                kj kjVar = (kj) this.d;
                int i15 = kjVar.f26709r;
                int i16 = kjVar.f26711w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f30086n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
                    if (chatAttachAlertPhotoLayout.O0) {
                        i10--;
                    }
                    int i17 = chatAttachAlertPhotoLayout.K0;
                    int i18 = chatAttachAlertPhotoLayout.M0;
                    if (i10 % i18 != i18 - 1) {
                        i12 = AndroidUtilities.dp(2.0f);
                    } else {
                        i12 = 0;
                    }
                    return i17 + i12;
                }
                return chatAttachAlertPhotoLayout.F.J;
            case 4:
                bz bzVar = (bz) this.d;
                wz wzVar = bzVar.Y;
                if (i10 == 0) {
                    wzVar.f31046n0.getClass();
                }
                s4.g0 adapter = wzVar.f31029h0.getAdapter();
                az azVar = wzVar.f31035j0;
                if (adapter == azVar && azVar.f23645x.isEmpty()) {
                    return bzVar.J;
                }
                wzVar.f31046n0.getClass();
                bzVar.B1();
                return bzVar.R.get(i10);
            case 5:
                ty0 ty0Var = (ty0) this.d;
                if ((ty0Var.W != null && (ty0Var.d.e.get(i10) instanceof Integer)) || i10 == ty0Var.d.h) {
                    return ty0Var.d.d;
                }
                return 1;
            case 6:
                aq0 aq0Var = (aq0) this.d;
                if (i10 >= aq0Var.f34306b0 && i10 < aq0Var.f34308c0) {
                    return 1;
                }
                if (i10 >= aq0Var.f34309d0 && i10 < aq0Var.f34310e0) {
                    return 1;
                }
                return 3;
            case 7:
                l61 G = ((yh.f4) this.d).f48871i0.G(i10 - 1);
                if (G == null || (i13 = G.f26963u) == -1) {
                    return 3;
                }
                return i13;
            default:
                zh.r0 r0Var = (zh.r0) this.d;
                zz zzVar = r0Var.f51040h0;
                zh.m0 m0Var = r0Var.f51043k0;
                if (m0Var != null && i10 != 0) {
                    l61 G2 = m0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f26963u) == -1) {
                        return zzVar.J;
                    }
                    return i14;
                }
                return zzVar.J;
        }
    }
}
