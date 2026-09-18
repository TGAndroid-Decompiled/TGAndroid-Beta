package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.x51;
import org.telegram.ui.wp0;
public final class x1 extends g.p {
    public final int f5731c;
    public final Object d;

    public x1(Object obj, int i10) {
        this.f5731c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f5731c) {
            case 0:
                y1 y1Var = (y1) this.d;
                if (y1Var.Y.f5857c.F(i10) == null) {
                    return y1Var.J;
                }
                y1Var.B1();
                return y1Var.R.get(i10);
            case 1:
                e2 e2Var = (e2) this.d;
                if (e2Var.f4589c.j(i10) != 2) {
                    return e2Var.h;
                }
                return 1;
            case 2:
                jj jjVar = (jj) this.d;
                int i15 = jjVar.f25349r;
                int i16 = jjVar.f25351w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f24692n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                    kzVar.f25924n0.getClass();
                }
                s4.h0 adapter = kzVar.f25907h0.getAdapter();
                py pyVar = kzVar.f25913j0;
                if (adapter == pyVar && pyVar.f27351x.isEmpty()) {
                    return qyVar.J;
                }
                kzVar.f25924n0.getClass();
                qyVar.B1();
                return qyVar.R.get(i10);
            case 5:
                hy0 hy0Var = (hy0) this.d;
                if ((hy0Var.W != null && (hy0Var.d.e.get(i10) instanceof Integer)) || i10 == hy0Var.d.h) {
                    return hy0Var.d.d;
                }
                return 1;
            case 6:
                wp0 wp0Var = (wp0) this.d;
                if (i10 >= wp0Var.f39205b0 && i10 < wp0Var.f39207c0) {
                    return 1;
                }
                if (i10 >= wp0Var.f39208d0 && i10 < wp0Var.f39209e0) {
                    return 1;
                }
                return 3;
            case 7:
                x51 G = ((xh.h4) this.d).f46149i0.G(i10 - 1);
                if (G == null || (i13 = G.f30257u) == -1) {
                    return 3;
                }
                return i13;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                nz nzVar = s0Var.f47968h0;
                yh.n0 n0Var = s0Var.f47971k0;
                if (n0Var != null && i10 != 0) {
                    x51 G2 = n0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f30257u) == -1) {
                        return nzVar.J;
                    }
                    return i14;
                }
                return nzVar.J;
        }
    }
}
