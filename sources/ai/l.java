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
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.an0;
import org.telegram.ui.cn;
import org.telegram.ui.eg0;
import org.telegram.ui.em0;
import org.telegram.ui.f21;
import org.telegram.ui.ll;
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
        dj t92;
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
                jy jyVar = w1Var.f4936c2;
                p1 p1Var = w1Var.f4938f2;
                if (p1Var != null && i7 != 0) {
                    x31 G = p1Var.G(i7 - 1);
                    if (G == null || (i10 = G.f40165u) == -1) {
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
                if (z1Var.f13238c.d(i7) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 4:
                if (i7 != 0 && i7 != 1 && i7 != ((f3) this.d).f11969f.b() - 1) {
                    return 1;
                }
                return 3;
            case 5:
                cn cnVar = (cn) this.d;
                ll llVar = cnVar.C0;
                int i19 = llVar.J;
                if (i7 >= i19 && i7 < llVar.K && (i11 = i7 - i19) >= 0 && i11 < llVar.L().size() && (t92 = cnVar.t9((ijVar = (ij) cnVar.C0.L().get(i11)))) != null) {
                    return t92.d(ijVar).f21452i;
                }
                return 1000;
            case 6:
                pi piVar = (pi) this.d;
                int i20 = piVar.f36937r;
                int i21 = piVar.f36940x;
                if (i7 % i21 != i21 - 1) {
                    i12 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i12 = 0;
                }
                return i20 + i12;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 != chatAttachAlertPhotoLayout.G.f38021n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i7 != 0)) {
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
                    gyVar.f34048n0.getClass();
                }
                v4.g0 adapter = gyVar.f34031h0.getAdapter();
                lx lxVar = gyVar.f34037j0;
                if (adapter == lxVar && lxVar.f35760y.isEmpty()) {
                    return mxVar.J;
                }
                gyVar.f34048n0.getClass();
                mxVar.B1();
                return mxVar.R.get(i7);
            case 9:
                ca0 ca0Var = (ca0) this.d;
                if (i7 >= 0 && i7 < ca0Var.f32528r.f23705f.size() && (a10 = ca0.a(ca0Var, (ijVar2 = (ij) ca0Var.f32528r.f23705f.get(i7)))) != null) {
                    return a10.d(ijVar2).f21452i;
                }
                return 1000;
            case 10:
                yv0 yv0Var = (yv0) this.d;
                if ((yv0Var.Q1 != null && (yv0Var.n1.f38754e.get(i7) instanceof Integer)) || i7 == yv0Var.n1.h) {
                    return yv0Var.n1.d;
                }
                return 1;
            case 11:
                eg0 eg0Var = (eg0) this.d;
                ij ijVar3 = (ij) eg0Var.M.get((arrayList.size() - 1) - i7);
                dj k10 = eg0Var.k(ijVar3);
                if (k10 != null) {
                    return k10.d(ijVar3).f21452i;
                }
                return 1000;
            case 12:
                em0 em0Var = (em0) this.d;
                if (i7 >= em0Var.f45384b0 && i7 < em0Var.f45386c0) {
                    return 1;
                }
                if (i7 >= em0Var.f45387d0 && i7 < em0Var.f45389e0) {
                    return 1;
                }
                return 3;
            case 13:
                an0 an0Var = (an0) this.d;
                if (an0Var.L.d(i7) != 1 && !an0Var.Y && (an0Var.J != null || !TextUtils.isEmpty(an0Var.f43777w))) {
                    int i24 = an0Var.R;
                    int i25 = an0Var.f43759g0;
                    if (i7 % i25 != i25 - 1) {
                        i14 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i14 = 0;
                    }
                    return i24 + i14;
                }
                return an0Var.M.J;
            case 14:
                f21 f21Var = (f21) this.d;
                jy jyVar2 = f21Var.S1;
                m41 m41Var = f21Var.Y1;
                if (m41Var == null) {
                    return jyVar2.J;
                }
                x31 G2 = m41Var.G(i7 - 1);
                if (G2 == null || (i15 = G2.f40165u) == -1) {
                    return jyVar2.J;
                }
                return i15;
            case 15:
                int size = (e5Var.f55975s0.size() - 1) - i7;
                dj djVar = ((e5) this.d).f55976t0;
                if (djVar != null && size >= 0 && size < djVar.d.size() && (d = djVar.d((ij) djVar.d.get(size))) != null) {
                    return d.f21452i;
                }
                return 1000;
            case 16:
                zh.g1 g1Var = (zh.g1) this.d;
                jy jyVar3 = g1Var.d2;
                m41 m41Var2 = g1Var.T1;
                if (m41Var2 != null && i7 != 0) {
                    x31 G3 = m41Var2.G(i7 - 1);
                    if (G3 == null || (i16 = G3.f40165u) == -1) {
                        return jyVar3.J;
                    }
                    return i16;
                }
                return jyVar3.J;
            case 17:
                x31 G4 = ((l3) this.d).d2.G(i7 - 1);
                if (G4 == null || (i17 = G4.f40165u) == -1) {
                    return 3;
                }
                return i17;
            default:
                o3 o3Var = (o3) this.d;
                jy jyVar4 = o3Var.V1;
                m41 m41Var3 = o3Var.f60512b2;
                if (m41Var3 == null) {
                    return jyVar4.J;
                }
                x31 G5 = m41Var3.G(i7 - 1);
                if (G5 == null || (i18 = G5.f40165u) == -1) {
                    return jyVar4.J;
                }
                return i18;
        }
    }
}
