package j4;

import a8.yb;
import b2.w0;
import c3.j0;
import java.util.List;
public final class c0 {
    public final int f15260a;
    public final List f15261b;
    public final j0[] f15262c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.f15260a = i10;
        switch (i10) {
            case 1:
                this.f15261b = list;
                this.f15262c = new j0[list.size()];
                e2.c cVar = new e2.c(new e1.c(this, 29));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f15261b = list;
                this.f15262c = new j0[list.size()];
                this.d = new e2.c(new e1.c(this, 28));
                return;
        }
    }

    public void a(long j10, e2.x xVar) {
        if (xVar.a() >= 9) {
            int m10 = xVar.m();
            int m11 = xVar.m();
            int A = xVar.A();
            if (m10 == 434 && m11 == 1195456820 && A == 3) {
                this.d.a(j10, xVar);
            }
        }
    }

    public final void b(c3.q qVar, f0 f0Var) {
        boolean z10;
        boolean z11;
        switch (this.f15260a) {
            case 0:
                int i10 = 0;
                while (true) {
                    j0[] j0VarArr = this.f15262c;
                    if (i10 < j0VarArr.length) {
                        f0Var.b();
                        f0Var.c();
                        j0 F1 = qVar.F1(f0Var.f15315c, 3);
                        b2.x xVar = (b2.x) this.f15261b.get(i10);
                        String str = xVar.f3586s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        yb.h(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = xVar.f3571a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.e;
                        }
                        b2.w wVar = new b2.w();
                        wVar.f3519a = str2;
                        wVar.f3532q = w0.n("video/mp2t");
                        wVar.f3533r = w0.n(str);
                        wVar.e = xVar.e;
                        wVar.d = xVar.d;
                        wVar.O = xVar.P;
                        wVar.f3536u = xVar.v;
                        ic.a.u(wVar, F1);
                        j0VarArr[i10] = F1;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    j0[] j0VarArr2 = this.f15262c;
                    if (i11 < j0VarArr2.length) {
                        f0Var.b();
                        f0Var.c();
                        j0 F12 = qVar.F1(f0Var.f15315c, 3);
                        b2.x xVar2 = (b2.x) this.f15261b.get(i11);
                        String str3 = xVar2.f3586s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        yb.h(z11, "Invalid closed caption MIME type provided: %s", str3);
                        b2.w wVar2 = new b2.w();
                        f0Var.c();
                        wVar2.f3519a = (String) f0Var.e;
                        wVar2.f3532q = w0.n("video/mp2t");
                        wVar2.f3533r = w0.n(str3);
                        wVar2.e = xVar2.e;
                        wVar2.d = xVar2.d;
                        wVar2.O = xVar2.P;
                        wVar2.f3536u = xVar2.v;
                        ic.a.u(wVar2, F12);
                        j0VarArr2[i11] = F12;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
