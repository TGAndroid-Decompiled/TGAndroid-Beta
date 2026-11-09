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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.cn;
import org.telegram.ui.dg0;
import org.telegram.ui.dm0;
import org.telegram.ui.e21;
import org.telegram.ui.ll;
import org.telegram.ui.zm0;
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
                ky kyVar = w1Var.Z1;
                p1 p1Var = w1Var.f4935c2;
                if (p1Var != null && i7 != 0) {
                    y31 G = p1Var.G(i7 - 1);
                    if (G == null || (i10 = G.f40577u) == -1) {
                        return kyVar.J;
                    }
                    return i10;
                }
                return kyVar.J;
            case 2:
                s1 s1Var = (s1) this.d;
                if (s1Var.Y.f12840c.F(i7) == null) {
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
                cn cnVar = (cn) this.d;
                ll llVar = cnVar.C0;
                int i19 = llVar.J;
                if (i7 >= i19 && i7 < llVar.K && (i11 = i7 - i19) >= 0 && i11 < llVar.L().size() && (t92 = cnVar.t9((ijVar = (ij) cnVar.C0.L().get(i11)))) != null) {
                    return t92.d(ijVar).f21447i;
                }
                return 1000;
            case 6:
                qi qiVar = (qi) this.d;
                int i20 = qiVar.f37338r;
                int i21 = qiVar.f37341x;
                if (i7 % i21 != i21 - 1) {
                    i12 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i12 = 0;
                }
                return i20 + i12;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 != chatAttachAlertPhotoLayout.G.f38447n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i7 != 0)) {
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
                nx nxVar = (nx) this.d;
                hy hyVar = nxVar.Y;
                if (i7 == 0) {
                    hyVar.f34447n0.getClass();
                }
                v4.g0 adapter = hyVar.f34430h0.getAdapter();
                mx mxVar = hyVar.f34436j0;
                if (adapter == mxVar && mxVar.f36167y.isEmpty()) {
                    return nxVar.J;
                }
                hyVar.f34447n0.getClass();
                nxVar.B1();
                return nxVar.R.get(i7);
            case 9:
                da0 da0Var = (da0) this.d;
                if (i7 >= 0 && i7 < da0Var.f32924r.f23701f.size() && (a10 = da0.a(da0Var, (ijVar2 = (ij) da0Var.f32924r.f23701f.get(i7)))) != null) {
                    return a10.d(ijVar2).f21447i;
                }
                return 1000;
            case 10:
                zv0 zv0Var = (zv0) this.d;
                if ((zv0Var.N1 != null && (zv0Var.f41155k1.f39813e.get(i7) instanceof Integer)) || i7 == zv0Var.f41155k1.h) {
                    return zv0Var.f41155k1.d;
                }
                return 1;
            case 11:
                dg0 dg0Var = (dg0) this.d;
                ij ijVar3 = (ij) dg0Var.M.get((arrayList.size() - 1) - i7);
                dj k10 = dg0Var.k(ijVar3);
                if (k10 != null) {
                    return k10.d(ijVar3).f21447i;
                }
                return 1000;
            case 12:
                dm0 dm0Var = (dm0) this.d;
                if (i7 >= dm0Var.f45061b0 && i7 < dm0Var.f45063c0) {
                    return 1;
                }
                if (i7 >= dm0Var.f45064d0 && i7 < dm0Var.f45066e0) {
                    return 1;
                }
                return 3;
            case 13:
                zm0 zm0Var = (zm0) this.d;
                if (zm0Var.L.d(i7) != 1 && !zm0Var.Y && (zm0Var.J != null || !TextUtils.isEmpty(zm0Var.f52627w))) {
                    int i24 = zm0Var.R;
                    int i25 = zm0Var.f52609g0;
                    if (i7 % i25 != i25 - 1) {
                        i14 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i14 = 0;
                    }
                    return i24 + i14;
                }
                return zm0Var.M.J;
            case 14:
                e21 e21Var = (e21) this.d;
                ky kyVar2 = e21Var.P1;
                m41 m41Var = e21Var.V1;
                if (m41Var == null) {
                    return kyVar2.J;
                }
                y31 G2 = m41Var.G(i7 - 1);
                if (G2 == null || (i15 = G2.f40577u) == -1) {
                    return kyVar2.J;
                }
                return i15;
            case 15:
                int size = (e5Var.f55976s0.size() - 1) - i7;
                dj djVar = ((e5) this.d).f55977t0;
                if (djVar != null && size >= 0 && size < djVar.d.size() && (d = djVar.d((ij) djVar.d.get(size))) != null) {
                    return d.f21447i;
                }
                return 1000;
            case 16:
                zh.g1 g1Var = (zh.g1) this.d;
                ky kyVar3 = g1Var.f60334a2;
                m41 m41Var2 = g1Var.Q1;
                if (m41Var2 != null && i7 != 0) {
                    y31 G3 = m41Var2.G(i7 - 1);
                    if (G3 == null || (i16 = G3.f40577u) == -1) {
                        return kyVar3.J;
                    }
                    return i16;
                }
                return kyVar3.J;
            case 17:
                y31 G4 = ((l3) this.d).f60457a2.G(i7 - 1);
                if (G4 == null || (i17 = G4.f40577u) == -1) {
                    return 3;
                }
                return i17;
            default:
                o3 o3Var = (o3) this.d;
                ky kyVar4 = o3Var.S1;
                m41 m41Var3 = o3Var.Y1;
                if (m41Var3 == null) {
                    return kyVar4.J;
                }
                y31 G5 = m41Var3.G(i7 - 1);
                if (G5 == null || (i18 = G5.f40577u) == -1) {
                    return kyVar4.J;
                }
                return i18;
        }
    }
}
