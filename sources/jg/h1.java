package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zx;
import org.telegram.ui.fm;
import org.telegram.ui.kh0;
import org.telegram.ui.lo0;
import org.telegram.ui.nn0;
import org.telegram.ui.t31;
import org.telegram.ui.un;
import ph.q3;
import ph.t3;
import vh.s3;
public final class h1 extends g.o {
    public final int f9995c;
    public final Object d;

    public h1(Object obj, int i10) {
        this.f9995c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        s3 s3Var;
        bj d;
        int i11;
        jj jjVar;
        ej k92;
        int i12;
        int i13;
        jj jjVar2;
        ej a2;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.f9995c) {
            case 0:
                int size = (s3Var.f10057s0.size() - 1) - i10;
                ej ejVar = ((s3) this.d).f10058t0;
                if (ejVar != null && size >= 0 && size < ejVar.d.size() && (d = ejVar.d((jj) ejVar.d.get(size))) != null) {
                    return d.f14780i;
                }
                return 1000;
            case 1:
                un unVar = (un) this.d;
                fm fmVar = unVar.C0;
                int i20 = fmVar.J;
                if (i10 >= i20 && i10 < fmVar.K && (i11 = i10 - i20) >= 0 && i11 < fmVar.L().size() && (k92 = unVar.k9((jjVar = (jj) unVar.C0.L().get(i11)))) != null) {
                    return k92.d(jjVar).f14780i;
                }
                return 1000;
            case 2:
                qi qiVar = (qi) this.d;
                int i21 = qiVar.f29660r;
                int i22 = qiVar.f29663x;
                if (i10 % i22 != i22 - 1) {
                    i12 = org.telegram.messenger.i0.L(5.0f);
                } else {
                    i12 = 0;
                }
                return i21 + i12;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f24834n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
                    if (chatAttachAlertPhotoLayout.O0) {
                        i10--;
                    }
                    int i23 = chatAttachAlertPhotoLayout.K0;
                    int i24 = chatAttachAlertPhotoLayout.M0;
                    if (i10 % i24 != i24 - 1) {
                        i13 = org.telegram.messenger.i0.L(2.0f);
                    } else {
                        i13 = 0;
                    }
                    return i23 + i13;
                }
                return chatAttachAlertPhotoLayout.F.J;
            case 4:
                ay ayVar = (ay) this.d;
                vy vyVar = ayVar.Y;
                if (i10 == 0) {
                    vyVar.f31897n0.getClass();
                }
                s4.g0 adapter = vyVar.f31880h0.getAdapter();
                zx zxVar = vyVar.f31886j0;
                if (adapter == zxVar && zxVar.f33258y.isEmpty()) {
                    return ayVar.J;
                }
                vyVar.f31897n0.getClass();
                ayVar.B1();
                return ayVar.R.get(i10);
            case 5:
                ua0 ua0Var = (ua0) this.d;
                if (i10 >= 0 && i10 < ua0Var.f30884r.f16749f.size() && (a2 = ua0.a(ua0Var, (jjVar2 = (jj) ua0Var.f30884r.f16749f.get(i10)))) != null) {
                    return a2.d(jjVar2).f14780i;
                }
                return 1000;
            case 6:
                cx0 cx0Var = (cx0) this.d;
                if ((cx0Var.N1 != null && (cx0Var.f25208k1.e.get(i10) instanceof Integer)) || i10 == cx0Var.f25208k1.h) {
                    return cx0Var.f25208k1.d;
                }
                return 1;
            case 7:
                kh0 kh0Var = (kh0) this.d;
                jj jjVar3 = (jj) kh0Var.M.get((arrayList.size() - 1) - i10);
                ej k10 = kh0Var.k(jjVar3);
                if (k10 != null) {
                    return k10.d(jjVar3).f14780i;
                }
                return 1000;
            case 8:
                nn0 nn0Var = (nn0) this.d;
                if (i10 >= nn0Var.f39985b0 && i10 < nn0Var.f39987c0) {
                    return 1;
                }
                if (i10 >= nn0Var.f39988d0 && i10 < nn0Var.f39989e0) {
                    return 1;
                }
                return 3;
            case 9:
                lo0 lo0Var = (lo0) this.d;
                if (lo0Var.L.d(i10) != 1 && !lo0Var.Y && (lo0Var.J != null || !TextUtils.isEmpty(lo0Var.f39355w))) {
                    int i25 = lo0Var.R;
                    int i26 = lo0Var.f39337g0;
                    if (i10 % i26 != i26 - 1) {
                        i14 = org.telegram.messenger.i0.L(2.0f);
                    } else {
                        i14 = 0;
                    }
                    return i25 + i14;
                }
                return lo0Var.M.J;
            case 10:
                t31 t31Var = (t31) this.d;
                yy yyVar = t31Var.P1;
                p51 p51Var = t31Var.V1;
                if (p51Var == null) {
                    return yyVar.J;
                }
                a51 G = p51Var.G(i10 - 1);
                if (G == null || (i15 = G.f24301u) == -1) {
                    return yyVar.J;
                }
                return i15;
            case 11:
                ph.l1 l1Var = (ph.l1) this.d;
                yy yyVar2 = l1Var.a2;
                p51 p51Var2 = l1Var.Q1;
                if (p51Var2 != null && i10 != 0) {
                    a51 G2 = p51Var2.G(i10 - 1);
                    if (G2 == null || (i16 = G2.f24301u) == -1) {
                        return yyVar2.J;
                    }
                    return i16;
                }
                return yyVar2.J;
            case 12:
                a51 G3 = ((q3) this.d).a2.G(i10 - 1);
                if (G3 == null || (i17 = G3.f24301u) == -1) {
                    return 3;
                }
                return i17;
            case 13:
                t3 t3Var = (t3) this.d;
                yy yyVar3 = t3Var.S1;
                p51 p51Var3 = t3Var.Y1;
                if (p51Var3 == null) {
                    return yyVar3.J;
                }
                a51 G4 = p51Var3.G(i10 - 1);
                if (G4 == null || (i18 = G4.f24301u) == -1) {
                    return yyVar3.J;
                }
                return i18;
            case 14:
                qh.g0 g0Var = (qh.g0) this.d;
                if (g0Var.e.d(i10) == 0) {
                    return g0Var.f45724r;
                }
                return 1;
            case 15:
                rh.t0 t0Var = (rh.t0) this.d;
                yy yyVar4 = t0Var.Z1;
                rh.n0 n0Var = t0Var.f47472c2;
                if (n0Var != null && i10 != 0) {
                    a51 G5 = n0Var.G(i10 - 1);
                    if (G5 == null || (i19 = G5.f24301u) == -1) {
                        return yyVar4.J;
                    }
                    return i19;
                }
                return yyVar4.J;
            case 16:
                vh.f1 f1Var = (vh.f1) this.d;
                if (f1Var.Y.f51185c.F(i10) == null) {
                    return f1Var.J;
                }
                f1Var.B1();
                return f1Var.R.get(i10);
            case 17:
                vh.l1 l1Var2 = (vh.l1) this.d;
                if (l1Var2.f51446c.d(i10) != 2) {
                    return l1Var2.h;
                }
                return 1;
            default:
                if (i10 != 0 && i10 != 1 && i10 != ((vh.k2) this.d).f51388f.b() - 1) {
                    return 1;
                }
                return 3;
        }
    }
}
