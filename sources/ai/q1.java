package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zy;
import org.telegram.ui.cp0;
public final class q1 extends g.o {
    public final int f2046c;
    public final Object d;

    public q1(Object obj, int i10) {
        this.f2046c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f2046c) {
            case 0:
                a2 a2Var = (a2) this.d;
                wz wzVar = a2Var.f932h0;
                t1 t1Var = a2Var.f935k0;
                if (t1Var != null && i10 != 0) {
                    h61 G = t1Var.G(i10 - 1);
                    if (G == null || (i11 = G.f26794u) == -1) {
                        return wzVar.J;
                    }
                    return i11;
                }
                return wzVar.J;
            case 1:
                ei.u1 u1Var = (ei.u1) this.d;
                if (u1Var.Y.f9928c.F(i10) == null) {
                    return u1Var.J;
                }
                u1Var.B1();
                return u1Var.R.get(i10);
            case 2:
                ei.b2 b2Var = (ei.b2) this.d;
                if (b2Var.f8770c.j(i10) != 2) {
                    return b2Var.h;
                }
                return 1;
            case 3:
                ij ijVar = (ij) this.d;
                int i15 = ijVar.f27283r;
                int i16 = ijVar.f27285w;
                if (i10 % i16 != i16 - 1) {
                    i12 = AndroidUtilities.dp(5.0f);
                } else {
                    i12 = 0;
                }
                return i15 + i12;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f30323n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
                    if (chatAttachAlertPhotoLayout.O0) {
                        i10--;
                    }
                    int i17 = chatAttachAlertPhotoLayout.K0;
                    int i18 = chatAttachAlertPhotoLayout.M0;
                    if (i10 % i18 != i18 - 1) {
                        i13 = AndroidUtilities.dp(2.0f);
                    } else {
                        i13 = 0;
                    }
                    return i17 + i13;
                }
                return chatAttachAlertPhotoLayout.F.J;
            case 5:
                zy zyVar = (zy) this.d;
                tz tzVar = zyVar.Y;
                if (i10 == 0) {
                    tzVar.f30758n0.getClass();
                }
                s4.g0 adapter = tzVar.f30741h0.getAdapter();
                yy yyVar = tzVar.f30747j0;
                if (adapter == yyVar && yyVar.f32768x.isEmpty()) {
                    return zyVar.J;
                }
                tzVar.f30758n0.getClass();
                zyVar.B1();
                return zyVar.R.get(i10);
            case 6:
                qy0 qy0Var = (qy0) this.d;
                if ((qy0Var.W != null && (qy0Var.d.e.get(i10) instanceof Integer)) || i10 == qy0Var.d.h) {
                    return qy0Var.d.d;
                }
                return 1;
            case 7:
                cp0 cp0Var = (cp0) this.d;
                if (i10 >= cp0Var.f36025b0 && i10 < cp0Var.f36027c0) {
                    return 1;
                }
                if (i10 >= cp0Var.f36028d0 && i10 < cp0Var.f36029e0) {
                    return 1;
                }
                return 3;
            case 8:
                h61 G2 = ((yh.f4) this.d).f50251i0.G(i10 - 1);
                if (G2 == null || (i14 = G2.f26794u) == -1) {
                    return 3;
                }
                return i14;
            default:
                zh.k0 k0Var = (zh.k0) this.d;
                if (k0Var.e.j(i10) == 0) {
                    return k0Var.f52091r;
                }
                return 1;
        }
    }
}
