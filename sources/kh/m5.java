package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.hp0;
public final class m5 extends f2.v {
    public final int f10827c;
    public final Object d;

    public m5(Object obj, int i10) {
        this.f10827c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f10827c) {
            case 0:
                i51 G = ((p5) this.d).f10865f0.G(i10 - 1);
                if (G == null || (i11 = G.f25594u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                lh.j1 j1Var = (lh.j1) this.d;
                nz nzVar = j1Var.f12624e0;
                lh.d1 d1Var = j1Var.f12627h0;
                if (d1Var != null && i10 != 0) {
                    i51 G2 = d1Var.G(i10 - 1);
                    if (G2 == null || (i12 = G2.f25594u) == -1) {
                        return nzVar.J;
                    }
                    return i12;
                }
                return nzVar.J;
            case 2:
                zi ziVar = (zi) this.d;
                int i15 = ziVar.f31387r;
                int i16 = ziVar.f31389w;
                if (i10 % i16 != i16 - 1) {
                    i13 = AndroidUtilities.dp(5.0f);
                } else {
                    i13 = 0;
                }
                return i15 + i13;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.D.f24311n - 1 && ((!chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.L0) || i10 != 0)) {
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
                py pyVar = (py) this.d;
                kz kzVar = pyVar.Y;
                if (i10 == 0) {
                    kzVar.f26454k0.getClass();
                }
                f2.o0 adapter = kzVar.f26435e0.getAdapter();
                oy oyVar = kzVar.f26442g0;
                if (adapter == oyVar && oyVar.f27688x.isEmpty()) {
                    return pyVar.J;
                }
                kzVar.f26454k0.getClass();
                pyVar.B1();
                return pyVar.R.get(i10);
            case 5:
                xx0 xx0Var = (xx0) this.d;
                if ((xx0Var.T != null && (xx0Var.d.e.get(i10) instanceof Integer)) || i10 == xx0Var.d.h) {
                    return xx0Var.d.d;
                }
                return 1;
            case 6:
                hp0 hp0Var = (hp0) this.d;
                if (i10 >= hp0Var.V && i10 < hp0Var.W) {
                    return 1;
                }
                if (i10 >= hp0Var.f34719a0 && i10 < hp0Var.f34721b0) {
                    return 1;
                }
                return 3;
            case 7:
                ph.g1 g1Var = (ph.g1) this.d;
                if (g1Var.Y.f41736c.F(i10) == null) {
                    return g1Var.J;
                }
                g1Var.B1();
                return g1Var.R.get(i10);
            default:
                ph.n1 n1Var = (ph.n1) this.d;
                if (n1Var.f42036c.j(i10) != 2) {
                    return n1Var.h;
                }
                return 1;
        }
    }
}
