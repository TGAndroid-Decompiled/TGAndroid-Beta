package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.y51;
import org.telegram.ui.mp0;
public final class x1 extends g.p {
    public final int f5818c;
    public final Object d;

    public x1(Object obj, int i10) {
        this.f5818c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f5818c) {
            case 0:
                y1 y1Var = (y1) this.d;
                if (y1Var.Y.f5915c.F(i10) == null) {
                    return y1Var.J;
                }
                y1Var.B1();
                return y1Var.R.get(i10);
            case 1:
                e2 e2Var = (e2) this.d;
                if (e2Var.f4602c.j(i10) != 2) {
                    return e2Var.h;
                }
                return 1;
            case 2:
                mj mjVar = (mj) this.d;
                int i15 = mjVar.f26305r;
                int i16 = mjVar.f26307w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f25786n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                ty tyVar = (ty) this.d;
                nz nzVar = tyVar.Y;
                if (i10 == 0) {
                    nzVar.f26850n0.getClass();
                }
                s4.h0 adapter = nzVar.f26833h0.getAdapter();
                sy syVar = nzVar.f26839j0;
                if (adapter == syVar && syVar.f28368x.isEmpty()) {
                    return tyVar.J;
                }
                nzVar.f26850n0.getClass();
                tyVar.B1();
                return tyVar.R.get(i10);
            case 5:
                iy0 iy0Var = (iy0) this.d;
                if ((iy0Var.W != null && (iy0Var.d.e.get(i10) instanceof Integer)) || i10 == iy0Var.d.h) {
                    return iy0Var.d.d;
                }
                return 1;
            case 6:
                mp0 mp0Var = (mp0) this.d;
                if (i10 >= mp0Var.f35735b0 && i10 < mp0Var.f35737c0) {
                    return 1;
                }
                if (i10 >= mp0Var.f35738d0 && i10 < mp0Var.f35739e0) {
                    return 1;
                }
                return 3;
            case 7:
                y51 G = ((xh.h4) this.d).f46284i0.G(i10 - 1);
                if (G == null || (i13 = G.f30646u) == -1) {
                    return 3;
                }
                return i13;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                qz qzVar = s0Var.f48091h0;
                yh.n0 n0Var = s0Var.f48094k0;
                if (n0Var != null && i10 != 0) {
                    y51 G2 = n0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f30646u) == -1) {
                        return qzVar.J;
                    }
                    return i14;
                }
                return qzVar.J;
        }
    }
}
