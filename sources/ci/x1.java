package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.w51;
import org.telegram.ui.np0;
public final class x1 extends g.p {
    public final int f5806c;
    public final Object d;

    public x1(Object obj, int i10) {
        this.f5806c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f5806c) {
            case 0:
                y1 y1Var = (y1) this.d;
                if (y1Var.Y.f5903c.F(i10) == null) {
                    return y1Var.J;
                }
                y1Var.B1();
                return y1Var.R.get(i10);
            case 1:
                e2 e2Var = (e2) this.d;
                if (e2Var.f4595c.j(i10) != 2) {
                    return e2Var.h;
                }
                return 1;
            case 2:
                lj ljVar = (lj) this.d;
                int i15 = ljVar.f26088r;
                int i16 = ljVar.f26090w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f25467n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                sy syVar = (sy) this.d;
                mz mzVar = syVar.Y;
                if (i10 == 0) {
                    mzVar.f26580n0.getClass();
                }
                s4.h0 adapter = mzVar.f26563h0.getAdapter();
                ry ryVar = mzVar.f26569j0;
                if (adapter == ryVar && ryVar.f28086x.isEmpty()) {
                    return syVar.J;
                }
                mzVar.f26580n0.getClass();
                syVar.B1();
                return syVar.R.get(i10);
            case 5:
                gy0 gy0Var = (gy0) this.d;
                if ((gy0Var.W != null && (gy0Var.d.e.get(i10) instanceof Integer)) || i10 == gy0Var.d.h) {
                    return gy0Var.d.d;
                }
                return 1;
            case 6:
                np0 np0Var = (np0) this.d;
                if (i10 >= np0Var.f35938b0 && i10 < np0Var.f35940c0) {
                    return 1;
                }
                if (i10 >= np0Var.f35941d0 && i10 < np0Var.f35942e0) {
                    return 1;
                }
                return 3;
            case 7:
                w51 G = ((xh.h4) this.d).f46175i0.G(i10 - 1);
                if (G == null || (i13 = G.f29904u) == -1) {
                    return 3;
                }
                return i13;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                pz pzVar = s0Var.f47982h0;
                yh.n0 n0Var = s0Var.f47985k0;
                if (n0Var != null && i10 != 0) {
                    w51 G2 = n0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f29904u) == -1) {
                        return pzVar.J;
                    }
                    return i14;
                }
                return pzVar.J;
        }
    }
}
