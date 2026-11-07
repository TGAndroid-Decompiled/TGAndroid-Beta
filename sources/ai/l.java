package ai;

import android.text.TextUtils;
import bi.p1;
import bi.w1;
import fi.e5;
import fi.f3;
import fi.s1;
import fi.z1;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.bm0;
import org.telegram.ui.c21;
import org.telegram.ui.jl;
import org.telegram.ui.xm0;
import zh.l3;
import zh.o3;
public final class l extends g.p {
    public final int f1314c;
    public final Object d;

    public l(Object obj, int i7) {
        this.f1314c = i7;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        ij ijVar;
        dj s9;
        int i12;
        int i13;
        ij ijVar2;
        dj a10;
        ArrayList arrayList;
        int i14;
        int i15;
        e5 e5Var;
        aj d;
        int i16;
        int i17;
        int i18;
        switch (this.f1314c) {
            case 0:
                q0 q0Var = (q0) this.d;
                if (q0Var.f1674e.d(i7) == 0) {
                    return q0Var.f1677r;
                }
                return 1;
            case 1:
                w1 w1Var = (w1) this.d;
                jy jyVar = w1Var.Z1;
                p1 p1Var = w1Var.f4937c2;
                if (p1Var != null && i7 != 0) {
                    x31 G = p1Var.G(i7 - 1);
                    if (G == null || (i10 = G.f40168u) == -1) {
                        return jyVar.J;
                    }
                    return i10;
                }
                return jyVar.J;
            case 2:
                s1 s1Var = (s1) this.d;
                if (s1Var.Y.f12841c.F(i7) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i7);
            case 3:
                z1 z1Var = (z1) this.d;
                if (z1Var.f13236c.d(i7) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 4:
                if (i7 != 0 && i7 != 1 && i7 != ((f3) this.d).f11965f.b() - 1) {
                    return 1;
                }
                return 3;
            case 5:
                an anVar = (an) this.d;
                jl jlVar = anVar.C0;
                int i19 = jlVar.J;
                if (i7 >= i19 && i7 < jlVar.K && (i11 = i7 - i19) >= 0 && i11 < jlVar.L().size() && (s9 = anVar.s9((ijVar = (ij) anVar.C0.L().get(i11)))) != null) {
                    return s9.d(ijVar).f21448i;
                }
                return 1000;
            case 6:
                qi qiVar = (qi) this.d;
                int i20 = qiVar.f37303r;
                int i21 = qiVar.f37306x;
                if (i7 % i21 != i21 - 1) {
                    i12 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i12 = 0;
                }
                return i20 + i12;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 != chatAttachAlertPhotoLayout.G.f38355n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i7 != 0)) {
                    if (chatAttachAlertPhotoLayout.O0) {
                        i7--;
                    }
                    int i22 = chatAttachAlertPhotoLayout.K0;
                    int i23 = chatAttachAlertPhotoLayout.M0;
                    if (i7 % i23 != i23 - 1) {
                        i13 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i13 = 0;
                    }
                    return i22 + i13;
                }
                return chatAttachAlertPhotoLayout.F.J;
            case 8:
                mx mxVar = (mx) this.d;
                gy gyVar = mxVar.Y;
                if (i7 == 0) {
                    gyVar.f34064n0.getClass();
                }
                v4.g0 adapter = gyVar.f34047h0.getAdapter();
                lx lxVar = gyVar.f34053j0;
                if (adapter == lxVar && lxVar.f35788y.isEmpty()) {
                    return mxVar.J;
                }
                gyVar.f34064n0.getClass();
                mxVar.B1();
                return mxVar.R.get(i7);
            case 9:
                ca0 ca0Var = (ca0) this.d;
                if (i7 >= 0 && i7 < ca0Var.f32498r.f23697f.size() && (a10 = ca0.a(ca0Var, (ijVar2 = (ij) ca0Var.f32498r.f23697f.get(i7)))) != null) {
                    return a10.d(ijVar2).f21448i;
                }
                return 1000;
            case 10:
                yv0 yv0Var = (yv0) this.d;
                if ((yv0Var.N1 != null && (yv0Var.f40763k1.f38728e.get(i7) instanceof Integer)) || i7 == yv0Var.f40763k1.h) {
                    return yv0Var.f40763k1.d;
                }
                return 1;
            case 11:
                bg0 bg0Var = (bg0) this.d;
                ij ijVar3 = (ij) bg0Var.M.get((arrayList.size() - 1) - i7);
                dj k10 = bg0Var.k(ijVar3);
                if (k10 != null) {
                    return k10.d(ijVar3).f21448i;
                }
                return 1000;
            case 12:
                bm0 bm0Var = (bm0) this.d;
                if (i7 >= bm0Var.f44429b0 && i7 < bm0Var.f44431c0) {
                    return 1;
                }
                if (i7 >= bm0Var.f44432d0 && i7 < bm0Var.f44434e0) {
                    return 1;
                }
                return 3;
            case 13:
                xm0 xm0Var = (xm0) this.d;
                if (xm0Var.L.d(i7) != 1 && !xm0Var.Y && (xm0Var.J != null || !TextUtils.isEmpty(xm0Var.f51939w))) {
                    int i24 = xm0Var.R;
                    int i25 = xm0Var.f51921g0;
                    if (i7 % i25 != i25 - 1) {
                        i14 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i14 = 0;
                    }
                    return i24 + i14;
                }
                return xm0Var.M.J;
            case 14:
                c21 c21Var = (c21) this.d;
                jy jyVar2 = c21Var.P1;
                l41 l41Var = c21Var.V1;
                if (l41Var == null) {
                    return jyVar2.J;
                }
                x31 G2 = l41Var.G(i7 - 1);
                if (G2 == null || (i15 = G2.f40168u) == -1) {
                    return jyVar2.J;
                }
                return i15;
            case 15:
                int size = (e5Var.f55871s0.size() - 1) - i7;
                dj djVar = ((e5) this.d).f55872t0;
                if (djVar != null && size >= 0 && size < djVar.d.size() && (d = djVar.d((ij) djVar.d.get(size))) != null) {
                    return d.f21448i;
                }
                return 1000;
            case 16:
                zh.h1 h1Var = (zh.h1) this.d;
                jy jyVar3 = h1Var.f60248a2;
                l41 l41Var2 = h1Var.Q1;
                if (l41Var2 != null && i7 != 0) {
                    x31 G3 = l41Var2.G(i7 - 1);
                    if (G3 == null || (i16 = G3.f40168u) == -1) {
                        return jyVar3.J;
                    }
                    return i16;
                }
                return jyVar3.J;
            case 17:
                x31 G4 = ((l3) this.d).f60345a2.G(i7 - 1);
                if (G4 == null || (i17 = G4.f40168u) == -1) {
                    return 3;
                }
                return i17;
            default:
                o3 o3Var = (o3) this.d;
                jy jyVar4 = o3Var.S1;
                l41 l41Var3 = o3Var.Y1;
                if (l41Var3 == null) {
                    return jyVar4.J;
                }
                x31 G5 = l41Var3.G(i7 - 1);
                if (G5 == null || (i18 = G5.f40168u) == -1) {
                    return jyVar4.J;
                }
                return i18;
        }
    }
}
