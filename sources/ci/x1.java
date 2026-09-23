package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.op0;
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
                kj kjVar = (kj) this.d;
                int i15 = kjVar.f25608r;
                int i16 = kjVar.f25610w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f24998n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                ry ryVar = (ry) this.d;
                lz lzVar = ryVar.Y;
                if (i10 == 0) {
                    lzVar.f26000n0.getClass();
                }
                s4.h0 adapter = lzVar.f25983h0.getAdapter();
                qy qyVar = lzVar.f25989j0;
                if (adapter == qyVar && qyVar.f27486x.isEmpty()) {
                    return ryVar.J;
                }
                lzVar.f26000n0.getClass();
                ryVar.B1();
                return ryVar.R.get(i10);
            case 5:
                ux0 ux0Var = (ux0) this.d;
                if ((ux0Var.W != null && (ux0Var.d.e.get(i10) instanceof Integer)) || i10 == ux0Var.d.h) {
                    return ux0Var.d.d;
                }
                return 1;
            case 6:
                op0 op0Var = (op0) this.d;
                if (i10 >= op0Var.f35922b0 && i10 < op0Var.f35924c0) {
                    return 1;
                }
                if (i10 >= op0Var.f35925d0 && i10 < op0Var.f35926e0) {
                    return 1;
                }
                return 3;
            case 7:
                h51 G = ((xh.h4) this.d).f45848i0.G(i10 - 1);
                if (G == null || (i13 = G.f24516u) == -1) {
                    return 3;
                }
                return i13;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                oz ozVar = s0Var.f47661h0;
                yh.n0 n0Var = s0Var.f47664k0;
                if (n0Var != null && i10 != 0) {
                    h51 G2 = n0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f24516u) == -1) {
                        return ozVar.J;
                    }
                    return i14;
                }
                return ozVar.J;
        }
    }
}
