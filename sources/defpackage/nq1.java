package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class nq1 extends yo {
    public final byte c;
    public final Object d;

    public nq1(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override
    public final int i(int i) {
        int i2;
        k27 k27Var;
        f27 n7;
        int i3;
        c27 d;
        k27 k27Var2;
        f27 c;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b = this.c;
        int i8 = 0;
        Object obj = this.d;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                vs1 vs1Var = mu1Var.D0;
                int i9 = vs1Var.K;
                if (i < i9 || i >= vs1Var.L || (i2 = i - i9) < 0 || i2 >= vs1Var.G().size() || (n7 = mu1Var.n7((k27Var = (k27) mu1Var.D0.G().get(i2)))) == null) {
                    return 1000;
                }
                return n7.d(k27Var).i;
            case 1:
                v12 v12Var = (v12) obj;
                int i10 = v12Var.r;
                byte b2 = v12Var.x;
                if (i % b2 != b2 - 1) {
                    i8 = gl.L(5.0f);
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
                        i8 = gl.L(2.0f);
                    }
                    return i11 + i8;
                }
                return chatAttachAlertPhotoLayout.G.J;
            case 3:
                mv3 mv3Var = (mv3) obj;
                if (mv3Var.Y.c.E(i) == null) {
                    return mv3Var.J;
                }
                mv3Var.z1();
                return mv3Var.R.get(i);
            case 4:
                tv3 tv3Var = (tv3) obj;
                if (tv3Var.c.d(i) == 2) {
                    return 1;
                }
                return tv3Var.h;
            case 5:
                z04 z04Var = (z04) obj;
                t14 t14Var = z04Var.Y;
                if (i == 0) {
                    t14Var.o0.getClass();
                }
                w39 adapter = t14Var.i0.getAdapter();
                y04 y04Var = t14Var.k0;
                if (adapter == y04Var && y04Var.y.isEmpty()) {
                    return z04Var.J;
                }
                t14Var.o0.getClass();
                z04Var.z1();
                return z04Var.R.get(i);
            case 6:
                if (i == 0 || i == 1 || i == ((sr4) obj).f.b() - 1) {
                    return 3;
                }
                return 1;
            case 7:
                tv4 tv4Var = (tv4) obj;
                w64 w64Var = tv4Var.c2;
                l5c l5cVar = tv4Var.T1;
                if (l5cVar != null && i != 0) {
                    c4c G = l5cVar.G(i - 1);
                    if (G == null || (i3 = G.v) == -1) {
                        return w64Var.J;
                    }
                    return i3;
                }
                return w64Var.J;
            case 8:
                ot7 ot7Var = (ot7) obj;
                int size = (ot7Var.u0.size() - 1) - i;
                f27 f27Var = ot7Var.v0;
                if (f27Var == null || size < 0 || size >= f27Var.d.size() || (d = f27Var.d((k27) f27Var.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
            case 9:
                f37 f37Var = (f37) obj;
                if (i < 0 || i >= f37Var.r.f.size() || (c = f37Var.c((k27Var2 = (k27) f37Var.r.f.get(i)))) == null) {
                    return 1000;
                }
                return c.d(k27Var2).i;
            case 10:
                j47 j47Var = (j47) obj;
                ArrayList arrayList = j47Var.N;
                k27 k27Var3 = (k27) arrayList.get((arrayList.size() - 1) - i);
                f27 j = j47Var.j(k27Var3);
                if (j == null) {
                    return 1000;
                }
                return j.d(k27Var3).i;
            case 11:
                t08 t08Var = (t08) obj;
                if ((i < t08Var.c0 || i >= t08Var.d0) && (i < t08Var.e0 || i >= t08Var.f0)) {
                    return 3;
                }
                return 1;
            case 12:
                u58 u58Var = (u58) obj;
                if (u58Var.M.d(i) != 1 && !u58Var.Z && (u58Var.K != null || !TextUtils.isEmpty(u58Var.w))) {
                    int i12 = u58Var.S;
                    byte b4 = u58Var.h0;
                    if (i % b4 != b4 - 1) {
                        i8 = gl.L(2.0f);
                    }
                    return i12 + i8;
                }
                return u58Var.N.J;
            case 13:
                ew8 ew8Var = (ew8) obj;
                if (ew8Var.e.d(i) != 0) {
                    return 1;
                }
                return ew8Var.r;
            case 14:
                c4c G2 = ((y99) obj).d2.G(i - 1);
                if (G2 == null || (i4 = G2.v) == -1) {
                    return 3;
                }
                return i4;
            case 15:
                ny9 ny9Var = (ny9) obj;
                w64 w64Var2 = ny9Var.V1;
                l5c l5cVar2 = ny9Var.b2;
                if (l5cVar2 == null) {
                    return w64Var2.J;
                }
                c4c G3 = l5cVar2.G(i - 1);
                if (G3 == null || (i5 = G3.v) == -1) {
                    return w64Var2.J;
                }
                return i5;
            case 16:
                qy9 qy9Var = (qy9) obj;
                w64 w64Var3 = qy9Var.S1;
                l5c l5cVar3 = qy9Var.Y1;
                if (l5cVar3 == null) {
                    return w64Var3.J;
                }
                c4c G4 = l5cVar3.G(i - 1);
                if (G4 == null || (i6 = G4.v) == -1) {
                    return w64Var3.J;
                }
                return i6;
            case 17:
                kna knaVar = (kna) obj;
                w64 w64Var4 = knaVar.c2;
                fna fnaVar = knaVar.f2;
                if (fnaVar != null && i != 0) {
                    c4c G5 = fnaVar.G(i - 1);
                    if (G5 == null || (i7 = G5.v) == -1) {
                        return w64Var4.J;
                    }
                    return i7;
                }
                return w64Var4.J;
            default:
                u0b u0bVar = (u0b) obj;
                if ((u0bVar.Q1 == null || !(u0bVar.n1.e.get(i) instanceof Integer)) && i != u0bVar.n1.h) {
                    return 1;
                }
                return u0bVar.n1.d;
        }
    }
}
