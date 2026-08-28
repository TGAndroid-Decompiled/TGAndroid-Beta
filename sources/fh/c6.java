package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zy;
import org.telegram.ui.uo0;
public final class c6 extends f2.x {
    public final int f6403c;
    public final Object d;

    public c6(Object obj, int i9) {
        this.f6403c = i9;
        this.d = obj;
    }

    @Override
    public final int i(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f6403c) {
            case 0:
                l41 G = ((f6) this.d).f6464e0.G(i9 - 1);
                if (G == null || (i10 = G.f30348u) == -1) {
                    return 3;
                }
                return i10;
            case 1:
                gh.l1 l1Var = (gh.l1) this.d;
                zy zyVar = l1Var.f8464d0;
                gh.e1 e1Var = l1Var.f8467g0;
                if (e1Var != null && i9 != 0) {
                    l41 G2 = e1Var.G(i9 - 1);
                    if (G2 == null || (i11 = G2.f30348u) == -1) {
                        return zyVar.J;
                    }
                    return i11;
                }
                return zyVar.J;
            case 2:
                kh.v1 v1Var = (kh.v1) this.d;
                if (v1Var.Y.f16229c.F(i9) == null) {
                    return v1Var.J;
                }
                v1Var.B1();
                return v1Var.R.get(i9);
            case 3:
                kh.b2 b2Var = (kh.b2) this.d;
                if (b2Var.f14983c.j(i9) != 2) {
                    return b2Var.h;
                }
                return 1;
            case 4:
                yi yiVar = (yi) this.d;
                int i14 = yiVar.f34974r;
                int i15 = yiVar.f34976w;
                if (i9 % i15 != i15 - 1) {
                    i12 = AndroidUtilities.dp(5.0f);
                } else {
                    i12 = 0;
                }
                return i14 + i12;
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i9 != chatAttachAlertPhotoLayout.C.f35001n - 1 && ((!chatAttachAlertPhotoLayout.L0 && !chatAttachAlertPhotoLayout.K0) || i9 != 0)) {
                    if (chatAttachAlertPhotoLayout.K0) {
                        i9--;
                    }
                    int i16 = chatAttachAlertPhotoLayout.G0;
                    int i17 = chatAttachAlertPhotoLayout.I0;
                    if (i9 % i17 != i17 - 1) {
                        i13 = AndroidUtilities.dp(2.0f);
                    } else {
                        i13 = 0;
                    }
                    return i16 + i13;
                }
                return chatAttachAlertPhotoLayout.B.J;
            case 6:
                cy cyVar = (cy) this.d;
                wy wyVar = cyVar.Y;
                if (i9 == 0) {
                    wyVar.f34414j0.getClass();
                }
                f2.r0 adapter = wyVar.f34394d0.getAdapter();
                ay ayVar = wyVar.f34402f0;
                if (adapter == ayVar && ayVar.f26924x.isEmpty()) {
                    return cyVar.J;
                }
                wyVar.f34414j0.getClass();
                cyVar.B1();
                return cyVar.R.get(i9);
            case 7:
                cx0 cx0Var = (cx0) this.d;
                if ((cx0Var.S != null && (cx0Var.d.f35088e.get(i9) instanceof Integer)) || i9 == cx0Var.d.h) {
                    return cx0Var.d.d;
                }
                return 1;
            default:
                uo0 uo0Var = (uo0) this.d;
                if (i9 >= uo0Var.P && i9 < uo0Var.Q) {
                    return 1;
                }
                if (i9 >= uo0Var.R && i9 < uo0Var.S) {
                    return 1;
                }
                return 3;
        }
    }
}
