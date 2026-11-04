package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.fl;
import org.telegram.ui.s11;
import org.telegram.ui.sm0;
import org.telegram.ui.vf0;
import org.telegram.ui.wl0;
import org.telegram.ui.wm;
public final class g2 extends g.p {
    public final int f656c;
    public final Object d;

    public g2(Object obj, int i3) {
        this.f656c = i3;
        this.d = obj;
    }

    @Override
    public final int i(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zi ziVar;
        ui s92;
        int i15;
        int i16;
        zi ziVar2;
        ui a10;
        ArrayList arrayList;
        int i17;
        int i18;
        gi.c5 c5Var;
        ri d;
        switch (this.f656c) {
            case 0:
                b3 b3Var = (b3) this.d;
                hy hyVar = b3Var.f510b2;
                f41 f41Var = b3Var.R1;
                if (f41Var != null && i3 != 0) {
                    r31 G = f41Var.G(i3 - 1);
                    if (G == null || (i10 = G.f37636u) == -1) {
                        return hyVar.J;
                    }
                    return i10;
                }
                return hyVar.J;
            case 1:
                r31 G2 = ((h6) this.d).f684b2.G(i3 - 1);
                if (G2 == null || (i11 = G2.f37636u) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                m6 m6Var = (m6) this.d;
                hy hyVar2 = m6Var.T1;
                f41 f41Var2 = m6Var.Z1;
                if (f41Var2 == null) {
                    return hyVar2.J;
                }
                r31 G3 = f41Var2.G(i3 - 1);
                if (G3 == null || (i12 = G3.f37636u) == -1) {
                    return hyVar2.J;
                }
                return i12;
            case 3:
                bi.h0 h0Var = (bi.h0) this.d;
                if (h0Var.f3841e.d(i3) == 0) {
                    return h0Var.f3844r;
                }
                return 1;
            case 4:
                ci.p1 p1Var = (ci.p1) this.d;
                hy hyVar3 = p1Var.f5722a2;
                ci.i1 i1Var = p1Var.f5724d2;
                if (i1Var != null && i3 != 0) {
                    r31 G4 = i1Var.G(i3 - 1);
                    if (G4 == null || (i13 = G4.f37636u) == -1) {
                        return hyVar3.J;
                    }
                    return i13;
                }
                return hyVar3.J;
            case 5:
                gi.s1 s1Var = (gi.s1) this.d;
                if (s1Var.Y.f13602c.F(i3) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i3);
            case 6:
                gi.y1 y1Var = (gi.y1) this.d;
                if (y1Var.f13915c.d(i3) != 2) {
                    return y1Var.h;
                }
                return 1;
            case 7:
                if (i3 != 0 && i3 != 1 && i3 != ((gi.d3) this.d).f12568f.b() - 1) {
                    return 1;
                }
                return 3;
            case 8:
                wm wmVar = (wm) this.d;
                fl flVar = wmVar.D0;
                int i19 = flVar.K;
                if (i3 >= i19 && i3 < flVar.L && (i14 = i3 - i19) >= 0 && i14 < flVar.L().size() && (s92 = wmVar.s9((ziVar = (zi) wmVar.D0.L().get(i14)))) != null) {
                    return s92.d(ziVar).f25146i;
                }
                return 1000;
            case 9:
                qi qiVar = (qi) this.d;
                int i20 = qiVar.f37465r;
                int i21 = qiVar.f37468x;
                if (i3 % i21 != i21 - 1) {
                    i15 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i15 = 0;
                }
                return i20 + i15;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i3 != chatAttachAlertPhotoLayout.H.f38052n - 1 && ((!chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.P0) || i3 != 0)) {
                    if (chatAttachAlertPhotoLayout.P0) {
                        i3--;
                    }
                    int i22 = chatAttachAlertPhotoLayout.L0;
                    int i23 = chatAttachAlertPhotoLayout.N0;
                    if (i3 % i23 != i23 - 1) {
                        i16 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i16 = 0;
                    }
                    return i22 + i16;
                }
                return chatAttachAlertPhotoLayout.G.J;
            case 11:
                kx kxVar = (kx) this.d;
                ey eyVar = kxVar.Y;
                if (i3 == 0) {
                    eyVar.f33561o0.getClass();
                }
                u4.h0 adapter = eyVar.f33545i0.getAdapter();
                jx jxVar = eyVar.f33551k0;
                if (adapter == jxVar && jxVar.f35214y.isEmpty()) {
                    return kxVar.J;
                }
                eyVar.f33561o0.getClass();
                kxVar.B1();
                return kxVar.R.get(i3);
            case 12:
                x90 x90Var = (x90) this.d;
                if (i3 >= 0 && i3 < x90Var.f40295r.f21842f.size() && (a10 = x90.a(x90Var, (ziVar2 = (zi) x90Var.f40295r.f21842f.get(i3)))) != null) {
                    return a10.d(ziVar2).f25146i;
                }
                return 1000;
            case 13:
                xv0 xv0Var = (xv0) this.d;
                if ((xv0Var.O1 != null && (xv0Var.f40517l1.f38561e.get(i3) instanceof Integer)) || i3 == xv0Var.f40517l1.h) {
                    return xv0Var.f40517l1.d;
                }
                return 1;
            case 14:
                vf0 vf0Var = (vf0) this.d;
                zi ziVar3 = (zi) vf0Var.N.get((arrayList.size() - 1) - i3);
                ui k10 = vf0Var.k(ziVar3);
                if (k10 != null) {
                    return k10.d(ziVar3).f25146i;
                }
                return 1000;
            case 15:
                wl0 wl0Var = (wl0) this.d;
                if (i3 >= wl0Var.f51205c0 && i3 < wl0Var.f51206d0) {
                    return 1;
                }
                if (i3 >= wl0Var.f51208e0 && i3 < wl0Var.f51210f0) {
                    return 1;
                }
                return 3;
            case 16:
                sm0 sm0Var = (sm0) this.d;
                if (sm0Var.M.d(i3) != 1 && !sm0Var.Z && (sm0Var.K != null || !TextUtils.isEmpty(sm0Var.f49567w))) {
                    int i24 = sm0Var.S;
                    int i25 = sm0Var.f49550h0;
                    if (i3 % i25 != i25 - 1) {
                        i17 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i17 = 0;
                    }
                    return i24 + i17;
                }
                return sm0Var.N.J;
            case 17:
                s11 s11Var = (s11) this.d;
                hy hyVar4 = s11Var.Q1;
                f41 f41Var3 = s11Var.W1;
                if (f41Var3 == null) {
                    return hyVar4.J;
                }
                r31 G5 = f41Var3.G(i3 - 1);
                if (G5 == null || (i18 = G5.f37636u) == -1) {
                    return hyVar4.J;
                }
                return i18;
            default:
                int size = (c5Var.f56265t0.size() - 1) - i3;
                ui uiVar = ((gi.c5) this.d).f56266u0;
                if (uiVar != null && size >= 0 && size < uiVar.d.size() && (d = uiVar.d((zi) uiVar.d.get(size))) != null) {
                    return d.f25146i;
                }
                return 1000;
        }
    }
}
