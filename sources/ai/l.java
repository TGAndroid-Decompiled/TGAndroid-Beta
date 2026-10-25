package ai;

import bi.x1;
import fi.z1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.lp0;
import zh.g4;
public final class l extends g.o {
    public final int f1565c;
    public final Object d;

    public l(Object obj, int i10) {
        this.f1565c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f1565c) {
            case 0:
                x0 x0Var = (x0) this.d;
                if (x0Var.e.j(i10) == 0) {
                    return x0Var.f1975r;
                }
                return 1;
            case 1:
                x1 x1Var = (x1) this.d;
                vz vzVar = x1Var.f5649h0;
                bi.q1 q1Var = x1Var.f5652k0;
                if (q1Var != null && i10 != 0) {
                    t61 G = q1Var.G(i10 - 1);
                    if (G == null || (i11 = G.f32881u) == -1) {
                        return vzVar.J;
                    }
                    return i11;
                }
                return vzVar.J;
            case 2:
                fi.t1 t1Var = (fi.t1) this.d;
                if (t1Var.Y.f11743c.F(i10) == null) {
                    return t1Var.J;
                }
                t1Var.C1();
                return t1Var.R.get(i10);
            case 3:
                z1 z1Var = (z1) this.d;
                if (z1Var.f12051c.j(i10) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 4:
                ij ijVar = (ij) this.d;
                int i15 = ijVar.f29296r;
                int i16 = ijVar.f29298w;
                if (i10 % i16 != i16 - 1) {
                    i12 = AndroidUtilities.dp(5.0f);
                } else {
                    i12 = 0;
                }
                return i15 + i12;
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f33100n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
                    if (chatAttachAlertPhotoLayout.O0) {
                        i10--;
                    }
                    int i17 = chatAttachAlertPhotoLayout.K0;
                    int i18 = chatAttachAlertPhotoLayout.M0;
                    if (i10 % i18 != i18 - 1) {
                        i13 = AndroidUtilities.dp(2.0f);
                    } else {
                        i13 = 0;
                    }
                    return i17 + i13;
                }
                return chatAttachAlertPhotoLayout.F.J;
            case 6:
                yy yyVar = (yy) this.d;
                sz szVar = yyVar.Y;
                if (i10 == 0) {
                    szVar.f32748n0.getClass();
                }
                s4.h0 adapter = szVar.f32731h0.getAdapter();
                xy xyVar = szVar.f32737j0;
                if (adapter == xyVar && xyVar.f34851x.isEmpty()) {
                    return yyVar.J;
                }
                szVar.f32748n0.getClass();
                yyVar.C1();
                return yyVar.R.get(i10);
            case 7:
                cz0 cz0Var = (cz0) this.d;
                if ((cz0Var.W != null && (cz0Var.d.e.get(i10) instanceof Integer)) || i10 == cz0Var.d.h) {
                    return cz0Var.d.d;
                }
                return 1;
            case 8:
                lp0 lp0Var = (lp0) this.d;
                if (i10 >= lp0Var.f41314b0 && i10 < lp0Var.f41316c0) {
                    return 1;
                }
                if (i10 >= lp0Var.f41317d0 && i10 < lp0Var.f41318e0) {
                    return 1;
                }
                return 3;
            default:
                t61 G2 = ((g4) this.d).f53018i0.G(i10 - 1);
                if (G2 == null || (i14 = G2.f32881u) == -1) {
                    return 3;
                }
                return i14;
        }
    }
}
