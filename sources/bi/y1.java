package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.rx;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.dm0;
import org.telegram.ui.jl;
import org.telegram.ui.z11;
import org.telegram.ui.zm0;
public final class y1 extends g.p {
    public final int f4011c;
    public final Object d;

    public y1(Object obj, int i7) {
        this.f4011c = i7;
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
        hi.c5 c5Var;
        yi d;
        switch (this.f4011c) {
            case 0:
                s2 s2Var = (s2) this.d;
                oy oyVar = s2Var.f3848e2;
                p41 p41Var = s2Var.U1;
                if (p41Var != null && i7 != 0) {
                    b41 G = p41Var.G(i7 - 1);
                    if (G == null || (i10 = G.f33193u) == -1) {
                        return oyVar.J;
                    }
                    return i10;
                }
                return oyVar.J;
            case 1:
                b41 G2 = ((z5) this.d).f4036e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.f33193u) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                e6 e6Var = (e6) this.d;
                oy oyVar2 = e6Var.W1;
                p41 p41Var2 = e6Var.f3487c2;
                if (p41Var2 == null) {
                    return oyVar2.J;
                }
                b41 G3 = p41Var2.G(i7 - 1);
                if (G3 == null || (i12 = G3.f33193u) == -1) {
                    return oyVar2.J;
                }
                return i12;
            case 3:
                ci.g0 g0Var = (ci.g0) this.d;
                if (g0Var.f5481e.d(i7) == 0) {
                    return g0Var.f5484r;
                }
                return 1;
            case 4:
                di.i1 i1Var = (di.i1) this.d;
                oy oyVar3 = i1Var.d2;
                di.b1 b1Var = i1Var.f8768g2;
                if (b1Var != null && i7 != 0) {
                    b41 G4 = b1Var.G(i7 - 1);
                    if (G4 == null || (i13 = G4.f33193u) == -1) {
                        return oyVar3.J;
                    }
                    return i13;
                }
                return oyVar3.J;
            case 5:
                hi.s1 s1Var = (hi.s1) this.d;
                if (s1Var.Y.f15137c.F(i7) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i7);
            case 6:
                hi.y1 y1Var = (hi.y1) this.d;
                if (y1Var.f15409c.d(i7) != 2) {
                    return y1Var.h;
                }
                return 1;
            case 7:
                if (i7 != 0 && i7 != 1 && i7 != ((hi.d3) this.d).f14108f.b() - 1) {
                    return 1;
                }
                return 3;
            case 8:
                an anVar = (an) this.d;
                jl jlVar = anVar.D0;
                int i19 = jlVar.K;
                if (i7 >= i19 && i7 < jlVar.L && (i14 = i7 - i19) >= 0 && i14 < jlVar.L().size() && (u92 = anVar.u9((gjVar = (gj) anVar.D0.L().get(i14)))) != null) {
                    return u92.d(gjVar).f27752i;
                }
                return 1000;
            case 9:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.d;
                int i20 = yiVar.f42004r;
                int i21 = yiVar.f42007x;
                if (i7 % i21 != i21 - 1) {
                    i15 = org.telegram.messenger.g0.L(5.0f);
                } else {
                    i15 = 0;
                }
                return i20 + i15;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 != chatAttachAlertPhotoLayout.H.f33020n - 1 && ((!chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.P0) || i7 != 0)) {
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
                rx rxVar = (rx) this.d;
                ly lyVar = rxVar.Y;
                if (i7 == 0) {
                    lyVar.f36972o0.getClass();
                }
                v4.h0 adapter = lyVar.f36956i0.getAdapter();
                qx qxVar = lyVar.f36962k0;
                if (adapter == qxVar && qxVar.f38788y.isEmpty()) {
                    return rxVar.J;
                }
                lyVar.f36972o0.getClass();
                rxVar.B1();
                return rxVar.R.get(i7);
            case 12:
                ea0 ea0Var = (ea0) this.d;
                if (i7 >= 0 && i7 < ea0Var.f34264r.f24404f.size() && (a10 = ea0.a(ea0Var, (gjVar2 = (gj) ea0Var.f34264r.f24404f.get(i7)))) != null) {
                    return a10.d(gjVar2).f27752i;
                }
                return 1000;
            case 13:
                bw0 bw0Var = (bw0) this.d;
                if ((bw0Var.R1 != null && (bw0Var.f33413o1.f41764e.get(i7) instanceof Integer)) || i7 == bw0Var.f33413o1.h) {
                    return bw0Var.f33413o1.d;
                }
                return 1;
            case 14:
                bg0 bg0Var = (bg0) this.d;
                gj gjVar3 = (gj) bg0Var.N.get((arrayList.size() - 1) - i7);
                bj l10 = bg0Var.l(gjVar3);
                if (l10 != null) {
                    return l10.d(gjVar3).f27752i;
                }
                return 1000;
            case 15:
                dm0 dm0Var = (dm0) this.d;
                if (i7 >= dm0Var.f46403c0 && i7 < dm0Var.f46404d0) {
                    return 1;
                }
                if (i7 >= dm0Var.f46406e0 && i7 < dm0Var.f46408f0) {
                    return 1;
                }
                return 3;
            case 16:
                zm0 zm0Var = (zm0) this.d;
                if (zm0Var.M.d(i7) != 1 && !zm0Var.Z && (zm0Var.K != null || !TextUtils.isEmpty(zm0Var.f53984w))) {
                    int i24 = zm0Var.S;
                    int i25 = zm0Var.f53967h0;
                    if (i7 % i25 != i25 - 1) {
                        i17 = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        i17 = 0;
                    }
                    return i24 + i17;
                }
                return zm0Var.N.J;
            case 17:
                z11 z11Var = (z11) this.d;
                oy oyVar4 = z11Var.T1;
                p41 p41Var3 = z11Var.Z1;
                if (p41Var3 == null) {
                    return oyVar4.J;
                }
                b41 G5 = p41Var3.G(i7 - 1);
                if (G5 == null || (i18 = G5.f33193u) == -1) {
                    return oyVar4.J;
                }
                return i18;
            default:
                int size = (c5Var.f57574t0.size() - 1) - i7;
                bj bjVar = ((hi.c5) this.d).f57575u0;
                if (bjVar != null && size >= 0 && size < bjVar.d.size() && (d = bjVar.d((gj) bjVar.d.get(size))) != null) {
                    return d.f27752i;
                }
                return 1000;
        }
    }
}
