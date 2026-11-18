package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.z41;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.d21;
import org.telegram.ui.fg0;
import org.telegram.ui.fm0;
import org.telegram.ui.kl;
public final class s2 extends g.p {
    public final int f4018c;
    public final Object d;

    public s2(Object obj, int i7) {
        this.f4018c = i7;
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
        hi.b5 b5Var;
        xi d;
        switch (this.f4018c) {
            case 0:
                j3 j3Var = (j3) this.d;
                uy uyVar = j3Var.d2;
                z41 z41Var = j3Var.U1;
                if (z41Var != null && i7 != 0) {
                    l41 G = z41Var.G(i7 - 1);
                    if (G == null || (i10 = G.v) == -1) {
                        return uyVar.J;
                    }
                    return i10;
                }
                return uyVar.J;
            case 1:
                l41 G2 = ((f8) this.d).f3586e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                k8 k8Var = (k8) this.d;
                uy uyVar2 = k8Var.W1;
                z41 z41Var2 = k8Var.f3795c2;
                if (z41Var2 == null) {
                    return uyVar2.J;
                }
                l41 G3 = z41Var2.G(i7 - 1);
                if (G3 == null || (i12 = G3.v) == -1) {
                    return uyVar2.J;
                }
                return i12;
            case 3:
                ci.h0 h0Var = (ci.h0) this.d;
                if (h0Var.f5760e.d(i7) == 0) {
                    return h0Var.f5763r;
                }
                return 1;
            case 4:
                di.h1 h1Var = (di.h1) this.d;
                uy uyVar3 = h1Var.d2;
                di.a1 a1Var = h1Var.f8899g2;
                if (a1Var != null && i7 != 0) {
                    l41 G4 = a1Var.G(i7 - 1);
                    if (G4 == null || (i13 = G4.v) == -1) {
                        return uyVar3.J;
                    }
                    return i13;
                }
                return uyVar3.J;
            case 5:
                hi.t1 t1Var = (hi.t1) this.d;
                if (t1Var.Y.f15522c.F(i7) == null) {
                    return t1Var.J;
                }
                t1Var.B1();
                return t1Var.R.get(i7);
            case 6:
                hi.z1 z1Var = (hi.z1) this.d;
                if (z1Var.f15800c.d(i7) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 7:
                if (i7 != 0 && i7 != 1 && i7 != ((hi.e3) this.d).f14542f.b() - 1) {
                    return 1;
                }
                return 3;
            case 8:
                bn bnVar = (bn) this.d;
                kl klVar = bnVar.D0;
                int i19 = klVar.K;
                if (i7 >= i19 && i7 < klVar.L && (i14 = i7 - i19) >= 0 && i14 < klVar.L().size() && (u92 = bnVar.u9((fjVar = (fj) bnVar.D0.L().get(i14)))) != null) {
                    return u92.d(fjVar).f27886i;
                }
                return 1000;
            case 9:
                org.telegram.ui.Components.fj fjVar3 = (org.telegram.ui.Components.fj) this.d;
                int i20 = fjVar3.f35115r;
                int i21 = fjVar3.f35118x;
                if (i7 % i21 != i21 - 1) {
                    i15 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i15 = 0;
                }
                return i20 + i15;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 != chatAttachAlertPhotoLayout.H.f35927n - 1 && ((!chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.P0) || i7 != 0)) {
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
                wx wxVar = (wx) this.d;
                ry ryVar = wxVar.Y;
                if (i7 == 0) {
                    ryVar.f39376o0.getClass();
                }
                v4.i0 adapter = ryVar.f39360i0.getAdapter();
                vx vxVar = ryVar.f39366k0;
                if (adapter == vxVar && vxVar.f41479y.isEmpty()) {
                    return wxVar.J;
                }
                ryVar.f39376o0.getClass();
                wxVar.B1();
                return wxVar.R.get(i7);
            case 12:
                oa0 oa0Var = (oa0) this.d;
                if (i7 >= 0 && i7 < oa0Var.f38049r.f24456f.size() && (a10 = oa0.a(oa0Var, (fjVar2 = (fj) oa0Var.f38049r.f24456f.get(i7)))) != null) {
                    return a10.d(fjVar2).f27886i;
                }
                return 1000;
            case 13:
                iw0 iw0Var = (iw0) this.d;
                if ((iw0Var.R1 != null && (iw0Var.f36247o1.f34812e.get(i7) instanceof Integer)) || i7 == iw0Var.f36247o1.h) {
                    return iw0Var.f36247o1.d;
                }
                return 1;
            case 14:
                fg0 fg0Var = (fg0) this.d;
                fj fjVar4 = (fj) fg0Var.N.get((arrayList.size() - 1) - i7);
                aj l10 = fg0Var.l(fjVar4);
                if (l10 != null) {
                    return l10.d(fjVar4).f27886i;
                }
                return 1000;
            case 15:
                fm0 fm0Var = (fm0) this.d;
                if (i7 >= fm0Var.f47699c0 && i7 < fm0Var.f47700d0) {
                    return 1;
                }
                if (i7 >= fm0Var.f47702e0 && i7 < fm0Var.f47704f0) {
                    return 1;
                }
                return 3;
            case 16:
                cn0 cn0Var = (cn0) this.d;
                if (cn0Var.M.d(i7) != 1 && !cn0Var.Z && (cn0Var.K != null || !TextUtils.isEmpty(cn0Var.f46566w))) {
                    int i24 = cn0Var.S;
                    int i25 = cn0Var.f46549h0;
                    if (i7 % i25 != i25 - 1) {
                        i17 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i17 = 0;
                    }
                    return i24 + i17;
                }
                return cn0Var.N.J;
            case 17:
                d21 d21Var = (d21) this.d;
                uy uyVar4 = d21Var.T1;
                z41 z41Var3 = d21Var.Z1;
                if (z41Var3 == null) {
                    return uyVar4.J;
                }
                l41 G5 = z41Var3.G(i7 - 1);
                if (G5 == null || (i18 = G5.v) == -1) {
                    return uyVar4.J;
                }
                return i18;
            default:
                int size = (b5Var.f58142t0.size() - 1) - i7;
                aj ajVar = ((hi.b5) this.d).f58143u0;
                if (ajVar != null && size >= 0 && size < ajVar.d.size() && (d = ajVar.d((fj) ajVar.d.get(size))) != null) {
                    return d.f27886i;
                }
                return 1000;
        }
    }
}
