package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yx;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.e21;
import org.telegram.ui.eg0;
import org.telegram.ui.fm0;
import org.telegram.ui.kl;
public final class w2 extends g.p {
    public final int f4207c;
    public final Object d;

    public w2(Object obj, int i7) {
        this.f4207c = i7;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        gj gjVar;
        bj u92;
        int i15;
        int i16;
        gj gjVar2;
        bj a10;
        ArrayList arrayList;
        int i17;
        int i18;
        hi.a5 a5Var;
        yi d;
        switch (this.f4207c) {
            case 0:
                n3 n3Var = (n3) this.d;
                wy wyVar = n3Var.d2;
                c51 c51Var = n3Var.U1;
                if (c51Var != null && i7 != 0) {
                    o41 G = c51Var.G(i7 - 1);
                    if (G == null || (i10 = G.v) == -1) {
                        return wyVar.J;
                    }
                    return i10;
                }
                return wyVar.J;
            case 1:
                o41 G2 = ((i8) this.d).f3737e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                n8 n8Var = (n8) this.d;
                wy wyVar2 = n8Var.W1;
                c51 c51Var2 = n8Var.f3960c2;
                if (c51Var2 == null) {
                    return wyVar2.J;
                }
                o41 G3 = c51Var2.G(i7 - 1);
                if (G3 == null || (i12 = G3.v) == -1) {
                    return wyVar2.J;
                }
                return i12;
            case 3:
                ci.h0 h0Var = (ci.h0) this.d;
                if (h0Var.f5792e.d(i7) == 0) {
                    return h0Var.f5795r;
                }
                return 1;
            case 4:
                di.h1 h1Var = (di.h1) this.d;
                wy wyVar3 = h1Var.d2;
                di.a1 a1Var = h1Var.f8931g2;
                if (a1Var != null && i7 != 0) {
                    o41 G4 = a1Var.G(i7 - 1);
                    if (G4 == null || (i13 = G4.v) == -1) {
                        return wyVar3.J;
                    }
                    return i13;
                }
                return wyVar3.J;
            case 5:
                hi.s1 s1Var = (hi.s1) this.d;
                if (s1Var.Y.f15496c.F(i7) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i7);
            case 6:
                hi.y1 y1Var = (hi.y1) this.d;
                if (y1Var.f15781c.d(i7) != 2) {
                    return y1Var.h;
                }
                return 1;
            case 7:
                if (i7 != 0 && i7 != 1 && i7 != ((hi.d3) this.d).f14496f.b() - 1) {
                    return 1;
                }
                return 3;
            case 8:
                bn bnVar = (bn) this.d;
                kl klVar = bnVar.D0;
                int i19 = klVar.K;
                if (i7 >= i19 && i7 < klVar.L && (i14 = i7 - i19) >= 0 && i14 < klVar.L().size() && (u92 = bnVar.u9((gjVar = (gj) bnVar.D0.L().get(i14)))) != null) {
                    return u92.d(gjVar).f28098i;
                }
                return 1000;
            case 9:
                hj hjVar = (hj) this.d;
                int i20 = hjVar.f35916r;
                int i21 = hjVar.f35919x;
                if (i7 % i21 != i21 - 1) {
                    i15 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i15 = 0;
                }
                return i20 + i15;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 != chatAttachAlertPhotoLayout.H.f36558n - 1 && ((!chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.P0) || i7 != 0)) {
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
                yx yxVar = (yx) this.d;
                ty tyVar = yxVar.Y;
                if (i7 == 0) {
                    tyVar.f40123o0.getClass();
                }
                v4.i0 adapter = tyVar.f40107i0.getAdapter();
                xx xxVar = tyVar.f40113k0;
                if (adapter == xxVar && xxVar.f42244y.isEmpty()) {
                    return yxVar.J;
                }
                tyVar.f40123o0.getClass();
                yxVar.B1();
                return yxVar.R.get(i7);
            case 12:
                qa0 qa0Var = (qa0) this.d;
                if (i7 >= 0 && i7 < qa0Var.f38862r.f24737f.size() && (a10 = qa0.a(qa0Var, (gjVar2 = (gj) qa0Var.f38862r.f24737f.get(i7)))) != null) {
                    return a10.d(gjVar2).f28098i;
                }
                return 1000;
            case 13:
                kw0 kw0Var = (kw0) this.d;
                if ((kw0Var.R1 != null && (kw0Var.f37019o1.f35689e.get(i7) instanceof Integer)) || i7 == kw0Var.f37019o1.h) {
                    return kw0Var.f37019o1.d;
                }
                return 1;
            case 14:
                eg0 eg0Var = (eg0) this.d;
                gj gjVar3 = (gj) eg0Var.N.get((arrayList.size() - 1) - i7);
                bj l10 = eg0Var.l(gjVar3);
                if (l10 != null) {
                    return l10.d(gjVar3).f28098i;
                }
                return 1000;
            case 15:
                fm0 fm0Var = (fm0) this.d;
                if (i7 >= fm0Var.f47770c0 && i7 < fm0Var.f47771d0) {
                    return 1;
                }
                if (i7 >= fm0Var.f47773e0 && i7 < fm0Var.f47775f0) {
                    return 1;
                }
                return 3;
            case 16:
                cn0 cn0Var = (cn0) this.d;
                if (cn0Var.M.d(i7) != 1 && !cn0Var.Z && (cn0Var.K != null || !TextUtils.isEmpty(cn0Var.f46625w))) {
                    int i24 = cn0Var.S;
                    int i25 = cn0Var.f46608h0;
                    if (i7 % i25 != i25 - 1) {
                        i17 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i17 = 0;
                    }
                    return i24 + i17;
                }
                return cn0Var.N.J;
            case 17:
                e21 e21Var = (e21) this.d;
                wy wyVar4 = e21Var.T1;
                c51 c51Var3 = e21Var.Z1;
                if (c51Var3 == null) {
                    return wyVar4.J;
                }
                o41 G5 = c51Var3.G(i7 - 1);
                if (G5 == null || (i18 = G5.v) == -1) {
                    return wyVar4.J;
                }
                return i18;
            default:
                int size = (a5Var.f58202t0.size() - 1) - i7;
                bj bjVar = ((hi.a5) this.d).f58203u0;
                if (bjVar != null && size >= 0 && size < bjVar.d.size() && (d = bjVar.d((gj) bjVar.d.get(size))) != null) {
                    return d.f28098i;
                }
                return 1000;
        }
    }
}
