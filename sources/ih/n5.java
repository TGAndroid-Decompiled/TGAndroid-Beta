package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.to0;
public final class n5 extends f2.v {
    public final int f9304c;
    public final Object d;

    public n5(Object obj, int i10) {
        this.f9304c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f9304c) {
            case 0:
                w41 G = ((q5) this.d).f9343e0.G(i10 - 1);
                if (G == null || (i11 = G.f34309u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                jh.j1 j1Var = (jh.j1) this.d;
                iz izVar = j1Var.f12286d0;
                jh.d1 d1Var = j1Var.f12289g0;
                if (d1Var != null && i10 != 0) {
                    w41 G2 = d1Var.G(i10 - 1);
                    if (G2 == null || (i12 = G2.f34309u) == -1) {
                        return izVar.J;
                    }
                    return i12;
                }
                return izVar.J;
            case 2:
                nh.s1 s1Var = (nh.s1) this.d;
                if (s1Var.Y.f18580c.F(i10) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i10);
            case 3:
                nh.y1 y1Var = (nh.y1) this.d;
                if (y1Var.f18854c.j(i10) != 2) {
                    return y1Var.h;
                }
                return 1;
            case 4:
                bj bjVar = (bj) this.d;
                int i15 = bjVar.f27121r;
                int i16 = bjVar.f27123w;
                if (i10 % i16 != i16 - 1) {
                    i13 = AndroidUtilities.dp(5.0f);
                } else {
                    i13 = 0;
                }
                return i15 + i13;
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.C.f27506n - 1 && ((!chatAttachAlertPhotoLayout.L0 && !chatAttachAlertPhotoLayout.K0) || i10 != 0)) {
                    if (chatAttachAlertPhotoLayout.K0) {
                        i10--;
                    }
                    int i17 = chatAttachAlertPhotoLayout.G0;
                    int i18 = chatAttachAlertPhotoLayout.I0;
                    if (i10 % i18 != i18 - 1) {
                        i14 = AndroidUtilities.dp(2.0f);
                    } else {
                        i14 = 0;
                    }
                    return i17 + i14;
                }
                return chatAttachAlertPhotoLayout.B.J;
            case 6:
                ky kyVar = (ky) this.d;
                fz fzVar = kyVar.Y;
                if (i10 == 0) {
                    fzVar.f28605j0.getClass();
                }
                f2.p0 adapter = fzVar.f28585d0.getAdapter();
                jy jyVar = fzVar.f28593f0;
                if (adapter == jyVar && jyVar.f29852x.isEmpty()) {
                    return kyVar.J;
                }
                fzVar.f28605j0.getClass();
                kyVar.B1();
                return kyVar.R.get(i10);
            case 7:
                nx0 nx0Var = (nx0) this.d;
                if ((nx0Var.S != null && (nx0Var.d.f29841e.get(i10) instanceof Integer)) || i10 == nx0Var.d.h) {
                    return nx0Var.d.d;
                }
                return 1;
            default:
                to0 to0Var = (to0) this.d;
                if (i10 >= to0Var.P && i10 < to0Var.Q) {
                    return 1;
                }
                if (i10 >= to0Var.R && i10 < to0Var.S) {
                    return 1;
                }
                return 3;
        }
    }
}
