package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xy;
import org.telegram.ui.ep0;
public final class q1 extends g.o {
    public final int f2046c;
    public final Object d;

    public q1(Object obj, int i10) {
        this.f2046c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f2046c) {
            case 0:
                a2 a2Var = (a2) this.d;
                uz uzVar = a2Var.f933h0;
                t1 t1Var = a2Var.f936k0;
                if (t1Var != null && i10 != 0) {
                    l61 G = t1Var.G(i10 - 1);
                    if (G == null || (i11 = G.f28236u) == -1) {
                        return uzVar.J;
                    }
                    return i11;
                }
                return uzVar.J;
            case 1:
                ei.u1 u1Var = (ei.u1) this.d;
                if (u1Var.Y.f9945c.F(i10) == null) {
                    return u1Var.J;
                }
                u1Var.B1();
                return u1Var.R.get(i10);
            case 2:
                ei.b2 b2Var = (ei.b2) this.d;
                if (b2Var.f8779c.j(i10) != 2) {
                    return b2Var.h;
                }
                return 1;
            case 3:
                gj gjVar = (gj) this.d;
                int i15 = gjVar.f26699r;
                int i16 = gjVar.f26701w;
                if (i10 % i16 != i16 - 1) {
                    i12 = AndroidUtilities.dp(5.0f);
                } else {
                    i12 = 0;
                }
                return i15 + i12;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f29955n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
            case 5:
                xy xyVar = (xy) this.d;
                rz rzVar = xyVar.Y;
                if (i10 == 0) {
                    rzVar.f30342n0.getClass();
                }
                s4.g0 adapter = rzVar.f30325h0.getAdapter();
                wy wyVar = rzVar.f30331j0;
                if (adapter == wyVar && wyVar.f32439x.isEmpty()) {
                    return xyVar.J;
                }
                rzVar.f30342n0.getClass();
                xyVar.B1();
                return xyVar.R.get(i10);
            case 6:
                sy0 sy0Var = (sy0) this.d;
                if ((sy0Var.W != null && (sy0Var.d.e.get(i10) instanceof Integer)) || i10 == sy0Var.d.h) {
                    return sy0Var.d.d;
                }
                return 1;
            case 7:
                ep0 ep0Var = (ep0) this.d;
                if (i10 >= ep0Var.f36967b0 && i10 < ep0Var.f36969c0) {
                    return 1;
                }
                if (i10 >= ep0Var.f36970d0 && i10 < ep0Var.f36971e0) {
                    return 1;
                }
                return 3;
            case 8:
                l61 G2 = ((yh.f4) this.d).f50695i0.G(i10 - 1);
                if (G2 == null || (i14 = G2.f28236u) == -1) {
                    return 3;
                }
                return i14;
            default:
                zh.k0 k0Var = (zh.k0) this.d;
                if (k0Var.e.j(i10) == 0) {
                    return k0Var.f52553r;
                }
                return 1;
        }
    }
}
