package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.up0;
public final class w1 extends g.o {
    public final int f6182c;
    public final Object d;

    public w1(Object obj, int i10) {
        this.f6182c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f6182c) {
            case 0:
                x1 x1Var = (x1) this.d;
                if (x1Var.Y.f6342c.F(i10) == null) {
                    return x1Var.J;
                }
                x1Var.B1();
                return x1Var.R.get(i10);
            case 1:
                d2 d2Var = (d2) this.d;
                if (d2Var.f4896c.j(i10) != 2) {
                    return d2Var.h;
                }
                return 1;
            case 2:
                nj njVar = (nj) this.d;
                int i15 = njVar.f29164r;
                int i16 = njVar.f29166w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f33316n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                fz fzVar = (fz) this.d;
                a00 a00Var = fzVar.Y;
                if (i10 == 0) {
                    a00Var.f24434n0.getClass();
                }
                s4.i0 adapter = a00Var.f24417h0.getAdapter();
                ez ezVar = a00Var.f24423j0;
                if (adapter == ezVar && ezVar.f26187x.isEmpty()) {
                    return fzVar.J;
                }
                a00Var.f24434n0.getClass();
                fzVar.B1();
                return fzVar.R.get(i10);
            case 5:
                xy0 xy0Var = (xy0) this.d;
                if ((xy0Var.W != null && (xy0Var.d.f31306e.get(i10) instanceof Integer)) || i10 == xy0Var.d.h) {
                    return xy0Var.d.d;
                }
                return 1;
            case 6:
                up0 up0Var = (up0) this.d;
                if (i10 >= up0Var.f42515b0 && i10 < up0Var.f42517c0) {
                    return 1;
                }
                if (i10 >= up0Var.f42518d0 && i10 < up0Var.f42520e0) {
                    return 1;
                }
                return 3;
            case 7:
                p61 G = ((xh.h4) this.d).f51276i0.G(i10 - 1);
                if (G == null || (i13 = G.f29743u) == -1) {
                    return 3;
                }
                return i13;
            default:
                yh.r0 r0Var = (yh.r0) this.d;
                d00 d00Var = r0Var.f53098h0;
                yh.m0 m0Var = r0Var.f53101k0;
                if (m0Var != null && i10 != 0) {
                    p61 G2 = m0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f29743u) == -1) {
                        return d00Var.J;
                    }
                    return i14;
                }
                return d00Var.J;
        }
    }
}
