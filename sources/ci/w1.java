package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.u61;
import org.telegram.ui.wp0;
public final class w1 extends g.o {
    public final int f6180c;
    public final Object d;

    public w1(Object obj, int i10) {
        this.f6180c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f6180c) {
            case 0:
                x1 x1Var = (x1) this.d;
                if (x1Var.Y.f6340c.F(i10) == null) {
                    return x1Var.J;
                }
                x1Var.B1();
                return x1Var.R.get(i10);
            case 1:
                d2 d2Var = (d2) this.d;
                if (d2Var.f4894c.j(i10) != 2) {
                    return d2Var.h;
                }
                return 1;
            case 2:
                pj pjVar = (pj) this.d;
                int i15 = pjVar.f29505r;
                int i16 = pjVar.f29507w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f24441n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                iz izVar = (iz) this.d;
                d00 d00Var = izVar.Y;
                if (i10 == 0) {
                    d00Var.f25113n0.getClass();
                }
                s4.i0 adapter = d00Var.f25096h0.getAdapter();
                hz hzVar = d00Var.f25102j0;
                if (adapter == hzVar && hzVar.f26995x.isEmpty()) {
                    return izVar.J;
                }
                d00Var.f25113n0.getClass();
                izVar.B1();
                return izVar.R.get(i10);
            case 5:
                dz0 dz0Var = (dz0) this.d;
                if ((dz0Var.W != null && (dz0Var.d.f33521e.get(i10) instanceof Integer)) || i10 == dz0Var.d.h) {
                    return dz0Var.d.d;
                }
                return 1;
            case 6:
                wp0 wp0Var = (wp0) this.d;
                if (i10 >= wp0Var.f43580b0 && i10 < wp0Var.f43582c0) {
                    return 1;
                }
                if (i10 >= wp0Var.f43583d0 && i10 < wp0Var.f43585e0) {
                    return 1;
                }
                return 3;
            case 7:
                u61 G = ((xh.g4) this.d).f51489i0.G(i10 - 1);
                if (G == null || (i13 = G.f31085u) == -1) {
                    return 3;
                }
                return i13;
            default:
                yh.r0 r0Var = (yh.r0) this.d;
                g00 g00Var = r0Var.f53322h0;
                yh.m0 m0Var = r0Var.f53325k0;
                if (m0Var != null && i10 != 0) {
                    u61 G2 = m0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f31085u) == -1) {
                        return g00Var.J;
                    }
                    return i14;
                }
                return g00Var.J;
        }
    }
}
