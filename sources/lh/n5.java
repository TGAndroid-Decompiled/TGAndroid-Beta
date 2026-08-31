package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.dp0;
public final class n5 extends f2.v {
    public final int f12871c;
    public final Object d;

    public n5(Object obj, int i10) {
        this.f12871c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f12871c) {
            case 0:
                j51 G = ((q5) this.d).f12912f0.G(i10 - 1);
                if (G == null || (i11 = G.f28023u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                mh.i1 i1Var = (mh.i1) this.d;
                pz pzVar = i1Var.f14204e0;
                mh.c1 c1Var = i1Var.f14207h0;
                if (c1Var != null && i10 != 0) {
                    j51 G2 = c1Var.G(i10 - 1);
                    if (G2 == null || (i12 = G2.f28023u) == -1) {
                        return pzVar.J;
                    }
                    return i12;
                }
                return pzVar.J;
            case 2:
                bj bjVar = (bj) this.d;
                int i15 = bjVar.f25602r;
                int i16 = bjVar.f25604w;
                if (i10 % i16 != i16 - 1) {
                    i13 = AndroidUtilities.dp(5.0f);
                } else {
                    i13 = 0;
                }
                return i15 + i13;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.D.f26945n - 1 && ((!chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.L0) || i10 != 0)) {
                    if (chatAttachAlertPhotoLayout.L0) {
                        i10--;
                    }
                    int i17 = chatAttachAlertPhotoLayout.H0;
                    int i18 = chatAttachAlertPhotoLayout.J0;
                    if (i10 % i18 != i18 - 1) {
                        i14 = AndroidUtilities.dp(2.0f);
                    } else {
                        i14 = 0;
                    }
                    return i17 + i14;
                }
                return chatAttachAlertPhotoLayout.C.J;
            case 4:
                ry ryVar = (ry) this.d;
                mz mzVar = ryVar.Y;
                if (i10 == 0) {
                    mzVar.f29297k0.getClass();
                }
                f2.p0 adapter = mzVar.f29278e0.getAdapter();
                qy qyVar = mzVar.f29285g0;
                if (adapter == qyVar && qyVar.f30527x.isEmpty()) {
                    return ryVar.J;
                }
                mzVar.f29297k0.getClass();
                ryVar.B1();
                return ryVar.R.get(i10);
            case 5:
                yx0 yx0Var = (yx0) this.d;
                if ((yx0Var.T != null && (yx0Var.d.f31742e.get(i10) instanceof Integer)) || i10 == yx0Var.d.h) {
                    return yx0Var.d.d;
                }
                return 1;
            case 6:
                dp0 dp0Var = (dp0) this.d;
                if (i10 >= dp0Var.Q && i10 < dp0Var.R) {
                    return 1;
                }
                if (i10 >= dp0Var.S && i10 < dp0Var.T) {
                    return 1;
                }
                return 3;
            case 7:
                qh.h1 h1Var = (qh.h1) this.d;
                if (h1Var.Y.f45402c.F(i10) == null) {
                    return h1Var.J;
                }
                h1Var.B1();
                return h1Var.R.get(i10);
            default:
                qh.o1 o1Var = (qh.o1) this.d;
                if (o1Var.f45821c.j(i10) != 2) {
                    return o1Var.h;
                }
                return 1;
        }
    }
}
