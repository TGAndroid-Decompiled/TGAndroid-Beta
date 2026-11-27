package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class s32 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final r47 b;
    public final boolean c;
    public final ViewGroup d;
    public final c79 e;

    public s32(c79 c79Var, ViewGroup viewGroup, r47 r47Var, boolean z, byte b) {
        this.a = b;
        this.e = c79Var;
        this.d = viewGroup;
        this.b = r47Var;
        this.c = z;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        c79 c79Var = this.e;
        ViewGroup viewGroup = this.d;
        r47 r47Var = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                zea zeaVar = (zea) viewGroup;
                zeaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                t32 t32Var = (t32) c79Var;
                qg4 qg4Var = t32Var.I;
                u32 u32Var = t32Var.Y;
                if (u32Var.b.U2.z()) {
                    int e1 = r47Var.e1();
                    qg4Var.a = r47.B0(r47Var.k);
                    qg4Var.b = e1;
                    zeaVar.b(u32Var.U.containsKey(qg4Var), z);
                } else {
                    zeaVar.b(false, z);
                }
                return true;
            case 1:
                of3 of3Var = (of3) viewGroup;
                of3Var.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var = ((rg4) c79Var).c;
                if (yg4Var.p0.u()) {
                    qg4 qg4Var2 = yg4Var.T;
                    int e12 = r47Var.e1();
                    qg4Var2.a = r47.B0(r47Var.k);
                    qg4Var2.b = e12;
                    of3Var.d0(yg4Var.p0.d(yg4Var.T), z);
                } else {
                    of3Var.d0(false, z);
                }
                return true;
            case 2:
                zea zeaVar2 = (zea) viewGroup;
                zeaVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var2 = ((tg4) c79Var).w;
                if (yg4Var2.p0.u()) {
                    qg4 qg4Var3 = yg4Var2.T;
                    int e13 = r47Var.e1();
                    qg4Var3.a = r47.B0(r47Var.k);
                    qg4Var3.b = e13;
                    zeaVar2.b(yg4Var2.p0.d(yg4Var2.T), z);
                } else {
                    zeaVar2.b(false, z);
                }
                return true;
            case 3:
                vea veaVar = (vea) viewGroup;
                veaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var3 = ((tg4) c79Var).w;
                if (yg4Var3.p0.u()) {
                    qg4 qg4Var4 = yg4Var3.T;
                    int e14 = r47Var.e1();
                    qg4Var4.a = r47.B0(r47Var.k);
                    qg4Var4.b = e14;
                    veaVar.e(yg4Var3.p0.d(yg4Var3.T), z);
                } else {
                    veaVar.e(false, z);
                }
                return true;
            default:
                cfa cfaVar = (cfa) viewGroup;
                cfaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var4 = ((vg4) c79Var).w;
                if (yg4Var4.p0.u()) {
                    qg4 qg4Var5 = yg4Var4.T;
                    int e15 = r47Var.e1();
                    qg4Var5.a = r47.B0(r47Var.k);
                    qg4Var5.b = e15;
                    cfaVar.f(yg4Var4.p0.d(yg4Var4.T), z);
                } else {
                    cfaVar.f(false, z);
                }
                return true;
        }
    }
}
