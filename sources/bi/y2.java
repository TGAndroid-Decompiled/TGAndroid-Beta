package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vx;
import org.telegram.ui.an0;
import org.telegram.ui.bn;
import org.telegram.ui.c21;
import org.telegram.ui.dg0;
import org.telegram.ui.dm0;
import org.telegram.ui.kl;
public final class y2 extends g.p {
    public final int f4250c;
    public final Object d;

    public y2(Object obj, int i7) {
        this.f4250c = i7;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        fj fjVar;
        aj u92;
        int i15;
        int i16;
        fj fjVar2;
        aj a10;
        ArrayList arrayList;
        int i17;
        int i18;
        hi.l5 l5Var;
        xi d;
        switch (this.f4250c) {
            case 0:
                p3 p3Var = (p3) this.d;
                ty tyVar = p3Var.d2;
                b51 b51Var = p3Var.U1;
                if (b51Var != null && i7 != 0) {
                    n41 G = b51Var.G(i7 - 1);
                    if (G == null || (i10 = G.v) == -1) {
                        return tyVar.J;
                    }
                    return i10;
                }
                return tyVar.J;
            case 1:
                n41 G2 = ((l8) this.d).f3813e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                q8 q8Var = (q8) this.d;
                ty tyVar2 = q8Var.W1;
                b51 b51Var2 = q8Var.f4009c2;
                if (b51Var2 == null) {
                    return tyVar2.J;
                }
                n41 G3 = b51Var2.G(i7 - 1);
                if (G3 == null || (i12 = G3.v) == -1) {
                    return tyVar2.J;
                }
                return i12;
            case 3:
                ci.h0 h0Var = (ci.h0) this.d;
                if (h0Var.f5755e.d(i7) == 0) {
                    return h0Var.f5758r;
                }
                return 1;
            case 4:
                di.h1 h1Var = (di.h1) this.d;
                ty tyVar3 = h1Var.d2;
                di.a1 a1Var = h1Var.f8892g2;
                if (a1Var != null && i7 != 0) {
                    n41 G4 = a1Var.G(i7 - 1);
                    if (G4 == null || (i13 = G4.v) == -1) {
                        return tyVar3.J;
                    }
                    return i13;
                }
                return tyVar3.J;
            case 5:
                hi.a2 a2Var = (hi.a2) this.d;
                if (a2Var.Y.f14216c.F(i7) == null) {
                    return a2Var.J;
                }
                a2Var.B1();
                return a2Var.R.get(i7);
            case 6:
                hi.g2 g2Var = (hi.g2) this.d;
                if (g2Var.f14521c.d(i7) != 2) {
                    return g2Var.h;
                }
                return 1;
            case 7:
                if (i7 != 0 && i7 != 1 && i7 != ((hi.m3) this.d).f14896f.b() - 1) {
                    return 1;
                }
                return 3;
            case 8:
                bn bnVar = (bn) this.d;
                kl klVar = bnVar.D0;
                int i19 = klVar.K;
                if (i7 >= i19 && i7 < klVar.L && (i14 = i7 - i19) >= 0 && i14 < klVar.L().size() && (u92 = bnVar.u9((fjVar = (fj) bnVar.D0.L().get(i14)))) != null) {
                    return u92.d(fjVar).f28002i;
                }
                return 1000;
            case 9:
                gj gjVar = (gj) this.d;
                int i20 = gjVar.f35452r;
                int i21 = gjVar.f35455x;
                if (i7 % i21 != i21 - 1) {
                    i15 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i15 = 0;
                }
                return i20 + i15;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 != chatAttachAlertPhotoLayout.H.f35768n - 1 && ((!chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.P0) || i7 != 0)) {
                    if (chatAttachAlertPhotoLayout.P0) {
                        i7--;
                    }
                    int i22 = chatAttachAlertPhotoLayout.L0;
                    int i23 = chatAttachAlertPhotoLayout.N0;
                    if (i7 % i23 != i23 - 1) {
                        i16 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i16 = 0;
                    }
                    return i22 + i16;
                }
                return chatAttachAlertPhotoLayout.G.J;
            case 11:
                vx vxVar = (vx) this.d;
                qy qyVar = vxVar.Y;
                if (i7 == 0) {
                    qyVar.f39078o0.getClass();
                }
                v4.i0 adapter = qyVar.f39062i0.getAdapter();
                ux uxVar = qyVar.f39068k0;
                if (adapter == uxVar && uxVar.f40499y.isEmpty()) {
                    return vxVar.J;
                }
                qyVar.f39078o0.getClass();
                vxVar.B1();
                return vxVar.R.get(i7);
            case 12:
                na0 na0Var = (na0) this.d;
                if (i7 >= 0 && i7 < na0Var.f37746r.f24555f.size() && (a10 = na0.a(na0Var, (fjVar2 = (fj) na0Var.f37746r.f24555f.get(i7)))) != null) {
                    return a10.d(fjVar2).f28002i;
                }
                return 1000;
            case 13:
                jw0 jw0Var = (jw0) this.d;
                if ((jw0Var.R1 != null && (jw0Var.f36541o1.f35212e.get(i7) instanceof Integer)) || i7 == jw0Var.f36541o1.h) {
                    return jw0Var.f36541o1.d;
                }
                return 1;
            case 14:
                dg0 dg0Var = (dg0) this.d;
                fj fjVar3 = (fj) dg0Var.N.get((arrayList.size() - 1) - i7);
                aj l10 = dg0Var.l(fjVar3);
                if (l10 != null) {
                    return l10.d(fjVar3).f28002i;
                }
                return 1000;
            case 15:
                dm0 dm0Var = (dm0) this.d;
                if (i7 >= dm0Var.f47169c0 && i7 < dm0Var.f47170d0) {
                    return 1;
                }
                if (i7 >= dm0Var.f47172e0 && i7 < dm0Var.f47174f0) {
                    return 1;
                }
                return 3;
            case 16:
                an0 an0Var = (an0) this.d;
                if (an0Var.M.d(i7) != 1 && !an0Var.Z && (an0Var.K != null || !TextUtils.isEmpty(an0Var.f45772w))) {
                    int i24 = an0Var.S;
                    int i25 = an0Var.f45755h0;
                    if (i7 % i25 != i25 - 1) {
                        i17 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i17 = 0;
                    }
                    return i24 + i17;
                }
                return an0Var.N.J;
            case 17:
                c21 c21Var = (c21) this.d;
                ty tyVar4 = c21Var.T1;
                b51 b51Var3 = c21Var.Z1;
                if (b51Var3 == null) {
                    return tyVar4.J;
                }
                n41 G5 = b51Var3.G(i7 - 1);
                if (G5 == null || (i18 = G5.v) == -1) {
                    return tyVar4.J;
                }
                return i18;
            default:
                int size = (l5Var.f58314u0.size() - 1) - i7;
                aj ajVar = ((hi.l5) this.d).f58315v0;
                if (ajVar != null && size >= 0 && size < ajVar.d.size() && (d = ajVar.d((fj) ajVar.d.get(size))) != null) {
                    return d.f28002i;
                }
                return 1000;
        }
    }
}
