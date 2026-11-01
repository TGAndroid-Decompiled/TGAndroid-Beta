package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zx;
import org.telegram.ui.fm;
import org.telegram.ui.ih0;
import org.telegram.ui.jo0;
import org.telegram.ui.ln0;
import org.telegram.ui.r31;
import org.telegram.ui.un;
import ph.q3;
import ph.t3;
import vh.s3;
public final class h1 extends g.o {
    public final int f9996c;
    public final Object d;

    public h1(Object obj, int i10) {
        this.f9996c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        s3 s3Var;
        cj d;
        int i11;
        kj kjVar;
        fj p9;
        int i12;
        int i13;
        kj kjVar2;
        fj a2;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.f9996c) {
            case 0:
                int size = (s3Var.f10058s0.size() - 1) - i10;
                fj fjVar = ((s3) this.d).f10059t0;
                if (fjVar != null && size >= 0 && size < fjVar.d.size() && (d = fjVar.d((kj) fjVar.d.get(size))) != null) {
                    return d.f15163i;
                }
                return 1000;
            case 1:
                un unVar = (un) this.d;
                fm fmVar = unVar.C0;
                int i20 = fmVar.J;
                if (i10 >= i20 && i10 < fmVar.K && (i11 = i10 - i20) >= 0 && i11 < fmVar.L().size() && (p9 = unVar.p9((kjVar = (kj) unVar.C0.L().get(i11)))) != null) {
                    return p9.d(kjVar).f15163i;
                }
                return 1000;
            case 2:
                qi qiVar = (qi) this.d;
                int i21 = qiVar.f29734r;
                int i22 = qiVar.f29737x;
                if (i10 % i22 != i22 - 1) {
                    i12 = org.telegram.messenger.i0.L(5.0f);
                } else {
                    i12 = 0;
                }
                return i21 + i12;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f24889n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
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
                    vyVar.f31975n0.getClass();
                }
                s4.g0 adapter = vyVar.f31958h0.getAdapter();
                zx zxVar = vyVar.f31964j0;
                if (adapter == zxVar && zxVar.f33253y.isEmpty()) {
                    return ayVar.J;
                }
                vyVar.f31975n0.getClass();
                ayVar.B1();
                return ayVar.R.get(i10);
            case 5:
                ua0 ua0Var = (ua0) this.d;
                if (i10 >= 0 && i10 < ua0Var.f30918r.f17133f.size() && (a2 = ua0.a(ua0Var, (kjVar2 = (kj) ua0Var.f30918r.f17133f.get(i10)))) != null) {
                    return a2.d(kjVar2).f15163i;
                }
                return 1000;
            case 6:
                dx0 dx0Var = (dx0) this.d;
                if ((dx0Var.N1 != null && (dx0Var.f25621k1.e.get(i10) instanceof Integer)) || i10 == dx0Var.f25621k1.h) {
                    return dx0Var.f25621k1.d;
                }
                return 1;
            case 7:
                ih0 ih0Var = (ih0) this.d;
                kj kjVar3 = (kj) ih0Var.M.get((arrayList.size() - 1) - i10);
                fj k10 = ih0Var.k(kjVar3);
                if (k10 != null) {
                    return k10.d(kjVar3).f15163i;
                }
                return 1000;
            case 8:
                ln0 ln0Var = (ln0) this.d;
                if (i10 >= ln0Var.f39318b0 && i10 < ln0Var.f39320c0) {
                    return 1;
                }
                if (i10 >= ln0Var.f39321d0 && i10 < ln0Var.f39322e0) {
                    return 1;
                }
                return 3;
            case 9:
                jo0 jo0Var = (jo0) this.d;
                if (jo0Var.L.d(i10) != 1 && !jo0Var.Y && (jo0Var.J != null || !TextUtils.isEmpty(jo0Var.f38510w))) {
                    int i25 = jo0Var.R;
                    int i26 = jo0Var.f38492g0;
                    if (i10 % i26 != i26 - 1) {
                        i14 = org.telegram.messenger.i0.L(2.0f);
                    } else {
                        i14 = 0;
                    }
                    return i25 + i14;
                }
                return jo0Var.M.J;
            case 10:
                r31 r31Var = (r31) this.d;
                yy yyVar = r31Var.P1;
                q51 q51Var = r31Var.V1;
                if (q51Var == null) {
                    return yyVar.J;
                }
                b51 G = q51Var.G(i10 - 1);
                if (G == null || (i15 = G.f24652u) == -1) {
                    return yyVar.J;
                }
                return i15;
            case 11:
                ph.l1 l1Var = (ph.l1) this.d;
                yy yyVar2 = l1Var.a2;
                q51 q51Var2 = l1Var.Q1;
                if (q51Var2 != null && i10 != 0) {
                    b51 G2 = q51Var2.G(i10 - 1);
                    if (G2 == null || (i16 = G2.f24652u) == -1) {
                        return yyVar2.J;
                    }
                    return i16;
                }
                return yyVar2.J;
            case 12:
                b51 G3 = ((q3) this.d).a2.G(i10 - 1);
                if (G3 == null || (i17 = G3.f24652u) == -1) {
                    return 3;
                }
                return i17;
            case 13:
                t3 t3Var = (t3) this.d;
                yy yyVar3 = t3Var.S1;
                q51 q51Var3 = t3Var.Y1;
                if (q51Var3 == null) {
                    return yyVar3.J;
                }
                b51 G4 = q51Var3.G(i10 - 1);
                if (G4 == null || (i18 = G4.f24652u) == -1) {
                    return yyVar3.J;
                }
                return i18;
            case 14:
                qh.g0 g0Var = (qh.g0) this.d;
                if (g0Var.e.d(i10) == 0) {
                    return g0Var.f45735r;
                }
                return 1;
            case 15:
                rh.t0 t0Var = (rh.t0) this.d;
                yy yyVar4 = t0Var.Z1;
                rh.n0 n0Var = t0Var.f47484c2;
                if (n0Var != null && i10 != 0) {
                    b51 G5 = n0Var.G(i10 - 1);
                    if (G5 == null || (i19 = G5.f24652u) == -1) {
                        return yyVar4.J;
                    }
                    return i19;
                }
                return yyVar4.J;
            case 16:
                vh.f1 f1Var = (vh.f1) this.d;
                if (f1Var.Y.f51200c.F(i10) == null) {
                    return f1Var.J;
                }
                f1Var.B1();
                return f1Var.R.get(i10);
            case 17:
                vh.l1 l1Var2 = (vh.l1) this.d;
                if (l1Var2.f51461c.d(i10) != 2) {
                    return l1Var2.h;
                }
                return 1;
            default:
                if (i10 != 0 && i10 != 1 && i10 != ((vh.k2) this.d).f51403f.b() - 1) {
                    return 1;
                }
                return 3;
        }
    }
}
