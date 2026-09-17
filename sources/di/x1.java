package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.vp0;
public final class x1 extends g.p {
    public final int f8388c;
    public final Object d;

    public x1(Object obj, int i10) {
        this.f8388c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f8388c) {
            case 0:
                y1 y1Var = (y1) this.d;
                if (y1Var.Y.f8535c.F(i10) == null) {
                    return y1Var.J;
                }
                y1Var.B1();
                return y1Var.R.get(i10);
            case 1:
                e2 e2Var = (e2) this.d;
                if (e2Var.f7183c.j(i10) != 2) {
                    return e2Var.h;
                }
                return 1;
            case 2:
                jj jjVar = (jj) this.d;
                int i15 = jjVar.f27542r;
                int i16 = jjVar.f27544w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f26783n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                qy qyVar = (qy) this.d;
                kz kzVar = qyVar.Y;
                if (i10 == 0) {
                    kzVar.f27993n0.getClass();
                }
                s4.h0 adapter = kzVar.f27976h0.getAdapter();
                py pyVar = kzVar.f27982j0;
                if (adapter == pyVar && pyVar.f29546x.isEmpty()) {
                    return qyVar.J;
                }
                kzVar.f27993n0.getClass();
                qyVar.B1();
                return qyVar.R.get(i10);
            case 5:
                ux0 ux0Var = (ux0) this.d;
                if ((ux0Var.W != null && (ux0Var.d.f29861e.get(i10) instanceof Integer)) || i10 == ux0Var.d.h) {
                    return ux0Var.d.d;
                }
                return 1;
            case 6:
                vp0 vp0Var = (vp0) this.d;
                if (i10 >= vp0Var.f41630b0 && i10 < vp0Var.f41632c0) {
                    return 1;
                }
                if (i10 >= vp0Var.f41633d0 && i10 < vp0Var.f41635e0) {
                    return 1;
                }
                return 3;
            case 7:
                h51 G = ((yh.f4) this.d).f50314i0.G(i10 - 1);
                if (G == null || (i13 = G.f26631u) == -1) {
                    return 3;
                }
                return i13;
            default:
                zh.s0 s0Var = (zh.s0) this.d;
                nz nzVar = s0Var.f52569h0;
                zh.n0 n0Var = s0Var.f52572k0;
                if (n0Var != null && i10 != 0) {
                    h51 G2 = n0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f26631u) == -1) {
                        return nzVar.J;
                    }
                    return i14;
                }
                return nzVar.J;
        }
    }
}
