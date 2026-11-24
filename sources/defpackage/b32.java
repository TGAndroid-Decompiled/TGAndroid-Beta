package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class b32 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final k27 b;
    public final boolean c;
    public final ViewGroup d;
    public final n39 e;

    public b32(n39 n39Var, ViewGroup viewGroup, k27 k27Var, boolean z, byte b) {
        this.a = b;
        this.e = n39Var;
        this.d = viewGroup;
        this.b = k27Var;
        this.c = z;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        n39 n39Var = this.e;
        ViewGroup viewGroup = this.d;
        k27 k27Var = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                iba ibaVar = (iba) viewGroup;
                ibaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                c32 c32Var = (c32) n39Var;
                se4 se4Var = c32Var.I;
                d32 d32Var = c32Var.Y;
                if (d32Var.b.U2.y()) {
                    int e1 = k27Var.e1();
                    se4Var.a = k27.B0(k27Var.k);
                    se4Var.b = e1;
                    ibaVar.b(d32Var.U.containsKey(se4Var), z);
                } else {
                    ibaVar.b(false, z);
                }
                return true;
            case 1:
                ue3 ue3Var = (ue3) viewGroup;
                ue3Var.getViewTreeObserver().removeOnPreDrawListener(this);
                af4 af4Var = ((te4) n39Var).c;
                if (af4Var.p0.t()) {
                    se4 se4Var2 = af4Var.T;
                    int e12 = k27Var.e1();
                    se4Var2.a = k27.B0(k27Var.k);
                    se4Var2.b = e12;
                    ue3Var.e0(af4Var.p0.b(af4Var.T), z);
                } else {
                    ue3Var.e0(false, z);
                }
                return true;
            case 2:
                iba ibaVar2 = (iba) viewGroup;
                ibaVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                af4 af4Var2 = ((ve4) n39Var).w;
                if (af4Var2.p0.t()) {
                    se4 se4Var3 = af4Var2.T;
                    int e13 = k27Var.e1();
                    se4Var3.a = k27.B0(k27Var.k);
                    se4Var3.b = e13;
                    ibaVar2.b(af4Var2.p0.b(af4Var2.T), z);
                } else {
                    ibaVar2.b(false, z);
                }
                return true;
            case 3:
                eba ebaVar = (eba) viewGroup;
                ebaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                af4 af4Var3 = ((ve4) n39Var).w;
                if (af4Var3.p0.t()) {
                    se4 se4Var4 = af4Var3.T;
                    int e14 = k27Var.e1();
                    se4Var4.a = k27.B0(k27Var.k);
                    se4Var4.b = e14;
                    ebaVar.e(af4Var3.p0.b(af4Var3.T), z);
                } else {
                    ebaVar.e(false, z);
                }
                return true;
            default:
                lba lbaVar = (lba) viewGroup;
                lbaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                af4 af4Var4 = ((xe4) n39Var).w;
                if (af4Var4.p0.t()) {
                    se4 se4Var5 = af4Var4.T;
                    int e15 = k27Var.e1();
                    se4Var5.a = k27.B0(k27Var.k);
                    se4Var5.b = e15;
                    lbaVar.f(af4Var4.p0.b(af4Var4.T), z);
                } else {
                    lbaVar.f(false, z);
                }
                return true;
        }
    }
}
