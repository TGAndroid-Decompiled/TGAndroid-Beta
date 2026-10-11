package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.tp0;
public final class w1 extends g.o {
    public final int f6181c;
    public final Object d;

    public w1(Object obj, int i10) {
        this.f6181c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f6181c) {
            case 0:
                x1 x1Var = (x1) this.d;
                if (x1Var.Y.f6341c.F(i10) == null) {
                    return x1Var.J;
                }
                x1Var.B1();
                return x1Var.R.get(i10);
            case 1:
                d2 d2Var = (d2) this.d;
                if (d2Var.f4895c.j(i10) != 2) {
                    return d2Var.h;
                }
                return 1;
            case 2:
                nj njVar = (nj) this.d;
                int i15 = njVar.f29061r;
                int i16 = njVar.f29063w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f33301n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                gz gzVar = (gz) this.d;
                b00 b00Var = gzVar.Y;
                if (i10 == 0) {
                    b00Var.f24695n0.getClass();
                }
                s4.i0 adapter = b00Var.f24678h0.getAdapter();
                fz fzVar = b00Var.f24684j0;
                if (adapter == fzVar && fzVar.f26527x.isEmpty()) {
                    return gzVar.J;
                }
                b00Var.f24695n0.getClass();
                gzVar.B1();
                return gzVar.R.get(i10);
            case 5:
                zy0 zy0Var = (zy0) this.d;
                if ((zy0Var.W != null && (zy0Var.d.f32511e.get(i10) instanceof Integer)) || i10 == zy0Var.d.h) {
                    return zy0Var.d.d;
                }
                return 1;
            case 6:
                tp0 tp0Var = (tp0) this.d;
                if (i10 >= tp0Var.f42224b0 && i10 < tp0Var.f42226c0) {
                    return 1;
                }
                if (i10 >= tp0Var.f42227d0 && i10 < tp0Var.f42229e0) {
                    return 1;
                }
                return 3;
            case 7:
                r61 G = ((xh.h4) this.d).f51363i0.G(i10 - 1);
                if (G == null || (i13 = G.f30370u) == -1) {
                    return 3;
                }
                return i13;
            default:
                yh.r0 r0Var = (yh.r0) this.d;
                e00 e00Var = r0Var.f53185h0;
                yh.m0 m0Var = r0Var.f53188k0;
                if (m0Var != null && i10 != 0) {
                    r61 G2 = m0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f30370u) == -1) {
                        return e00Var.J;
                    }
                    return i14;
                }
                return e00Var.J;
        }
    }
}
