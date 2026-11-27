package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class ar1 extends zo {
    public final byte c;
    public final Object d;

    public ar1(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override
    public final int i(int i) {
        int i2;
        r47 r47Var;
        m47 v7;
        int i3;
        j47 d;
        r47 r47Var2;
        m47 c;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b = this.c;
        int i8 = 0;
        Object obj = this.d;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj;
                it1 it1Var = zu1Var.D0;
                int i9 = it1Var.K;
                if (i < i9 || i >= it1Var.L || (i2 = i - i9) < 0 || i2 >= it1Var.G().size() || (v7 = zu1Var.v7((r47Var = (r47) zu1Var.D0.G().get(i2)))) == null) {
                    return 1000;
                }
                return v7.d(r47Var).i;
            case 1:
                m22 m22Var = (m22) obj;
                int i10 = m22Var.r;
                byte b2 = m22Var.x;
                if (i % b2 != b2 - 1) {
                    i8 = hl.L(5.0f);
                }
                return i10 + i8;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                if (i != chatAttachAlertPhotoLayout.H.n - 1 && ((!chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.P0) || i != 0)) {
                    if (chatAttachAlertPhotoLayout.P0) {
                        i--;
                    }
                    int i11 = chatAttachAlertPhotoLayout.L0;
                    byte b3 = chatAttachAlertPhotoLayout.N0;
                    if (i % b3 != b3 - 1) {
                        i8 = hl.L(2.0f);
                    }
                    return i11 + i8;
                }
                return chatAttachAlertPhotoLayout.G.J;
            case 3:
                gw3 gw3Var = (gw3) obj;
                if (gw3Var.Y.c.E(i) == null) {
                    return gw3Var.J;
                }
                gw3Var.z1();
                return gw3Var.R.get(i);
            case 4:
                ow3 ow3Var = (ow3) obj;
                if (ow3Var.c.d(i) == 2) {
                    return 1;
                }
                return ow3Var.h;
            case 5:
                u14 u14Var = (u14) obj;
                o24 o24Var = u14Var.Y;
                if (i == 0) {
                    o24Var.o0.getClass();
                }
                j79 adapter = o24Var.i0.getAdapter();
                t14 t14Var = o24Var.k0;
                if (adapter == t14Var && t14Var.y.isEmpty()) {
                    return u14Var.J;
                }
                o24Var.o0.getClass();
                u14Var.z1();
                return u14Var.R.get(i);
            case 6:
                if (i == 0 || i == 1 || i == ((wt4) obj).f.b() - 1) {
                    return 3;
                }
                return 1;
            case 7:
                yx4 yx4Var = (yx4) obj;
                q74 q74Var = yx4Var.c2;
                l9c l9cVar = yx4Var.T1;
                if (l9cVar != null && i != 0) {
                    b8c G = l9cVar.G(i - 1);
                    if (G == null || (i3 = G.v) == -1) {
                        return q74Var.J;
                    }
                    return i3;
                }
                return q74Var.J;
            case 8:
                vw7 vw7Var = (vw7) obj;
                int size = (vw7Var.u0.size() - 1) - i;
                m47 m47Var = vw7Var.v0;
                if (m47Var == null || size < 0 || size >= m47Var.d.size() || (d = m47Var.d((r47) m47Var.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
            case 9:
                m57 m57Var = (m57) obj;
                if (i < 0 || i >= m57Var.r.f.size() || (c = m57Var.c((r47Var2 = (r47) m57Var.r.f.get(i)))) == null) {
                    return 1000;
                }
                return c.d(r47Var2).i;
            case 10:
                q67 q67Var = (q67) obj;
                ArrayList arrayList = q67Var.N;
                r47 r47Var3 = (r47) arrayList.get((arrayList.size() - 1) - i);
                m47 j = q67Var.j(r47Var3);
                if (j == null) {
                    return 1000;
                }
                return j.d(r47Var3).i;
            case 11:
                a48 a48Var = (a48) obj;
                if ((i < a48Var.c0 || i >= a48Var.d0) && (i < a48Var.e0 || i >= a48Var.f0)) {
                    return 3;
                }
                return 1;
            case 12:
                l98 l98Var = (l98) obj;
                if (l98Var.M.d(i) != 1 && !l98Var.Z && (l98Var.K != null || !TextUtils.isEmpty(l98Var.w))) {
                    int i12 = l98Var.S;
                    byte b4 = l98Var.h0;
                    if (i % b4 != b4 - 1) {
                        i8 = hl.L(2.0f);
                    }
                    return i12 + i8;
                }
                return l98Var.N.J;
            case 13:
                pz8 pz8Var = (pz8) obj;
                if (pz8Var.e.d(i) != 0) {
                    return 1;
                }
                return pz8Var.r;
            case 14:
                b8c G2 = ((md9) obj).d2.G(i - 1);
                if (G2 == null || (i4 = G2.v) == -1) {
                    return 3;
                }
                return i4;
            case 15:
                h2a h2aVar = (h2a) obj;
                q74 q74Var2 = h2aVar.V1;
                l9c l9cVar2 = h2aVar.b2;
                if (l9cVar2 == null) {
                    return q74Var2.J;
                }
                b8c G3 = l9cVar2.G(i - 1);
                if (G3 == null || (i5 = G3.v) == -1) {
                    return q74Var2.J;
                }
                return i5;
            case 16:
                k2a k2aVar = (k2a) obj;
                q74 q74Var3 = k2aVar.S1;
                l9c l9cVar3 = k2aVar.Y1;
                if (l9cVar3 == null) {
                    return q74Var3.J;
                }
                b8c G4 = l9cVar3.G(i - 1);
                if (G4 == null || (i6 = G4.v) == -1) {
                    return q74Var3.J;
                }
                return i6;
            case 17:
                gra graVar = (gra) obj;
                q74 q74Var4 = graVar.c2;
                bra braVar = graVar.f2;
                if (braVar != null && i != 0) {
                    b8c G5 = braVar.G(i - 1);
                    if (G5 == null || (i7 = G5.v) == -1) {
                        return q74Var4.J;
                    }
                    return i7;
                }
                return q74Var4.J;
            default:
                s4b s4bVar = (s4b) obj;
                if ((s4bVar.Q1 == null || !(s4bVar.n1.e.get(i) instanceof Integer)) && i != s4bVar.n1.h) {
                    return 1;
                }
                return s4bVar.n1.d;
        }
    }
}
