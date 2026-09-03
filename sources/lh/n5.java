package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.hp0;
public final class n5 extends f2.v {
    public final int f12873c;
    public final Object d;

    public n5(Object obj, int i10) {
        this.f12873c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f12873c) {
            case 0:
                h51 G = ((q5) this.d).f12914f0.G(i10 - 1);
                if (G == null || (i11 = G.f27384u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                mh.i1 i1Var = (mh.i1) this.d;
                pz pzVar = i1Var.f14206e0;
                mh.c1 c1Var = i1Var.f14209h0;
                if (c1Var != null && i10 != 0) {
                    h51 G2 = c1Var.G(i10 - 1);
                    if (G2 == null || (i12 = G2.f27384u) == -1) {
                        return pzVar.J;
                    }
                    return i12;
                }
                return pzVar.J;
            case 2:
                bj bjVar = (bj) this.d;
                int i15 = bjVar.f25613r;
                int i16 = bjVar.f25615w;
                if (i10 % i16 != i16 - 1) {
                    i13 = AndroidUtilities.dp(5.0f);
                } else {
                    i13 = 0;
                }
                return i15 + i13;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.D.f26944n - 1 && ((!chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.L0) || i10 != 0)) {
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
                ry ryVar = (ry) this.d;
                mz mzVar = ryVar.Y;
                if (i10 == 0) {
                    mzVar.f29299k0.getClass();
                }
                f2.p0 adapter = mzVar.f29280e0.getAdapter();
                qy qyVar = mzVar.f29287g0;
                if (adapter == qyVar && qyVar.f30556x.isEmpty()) {
                    return ryVar.J;
                }
                mzVar.f29299k0.getClass();
                ryVar.B1();
                return ryVar.R.get(i10);
            case 5:
                xx0 xx0Var = (xx0) this.d;
                if ((xx0Var.T != null && (xx0Var.d.f31435e.get(i10) instanceof Integer)) || i10 == xx0Var.d.h) {
                    return xx0Var.d.d;
                }
                return 1;
            case 6:
                hp0 hp0Var = (hp0) this.d;
                if (i10 >= hp0Var.V && i10 < hp0Var.W) {
                    return 1;
                }
                if (i10 >= hp0Var.f37442a0 && i10 < hp0Var.f37444b0) {
                    return 1;
                }
                return 3;
            case 7:
                qh.g1 g1Var = (qh.g1) this.d;
                if (g1Var.Y.f45384c.F(i10) == null) {
                    return g1Var.J;
                }
                g1Var.B1();
                return g1Var.R.get(i10);
            default:
                qh.n1 n1Var = (qh.n1) this.d;
                if (n1Var.f45793c.j(i10) != 2) {
                    return n1Var.h;
                }
                return 1;
        }
    }
}
