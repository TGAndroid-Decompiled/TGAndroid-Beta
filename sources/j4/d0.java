package j4;

import b2.v0;
import c3.k0;
import java.util.List;
import v7.t6;
public final class d0 {
    public final int f9432a;
    public final List f9433b;
    public final k0[] f9434c;
    public final e2.c d;

    public d0(int i10, List list) {
        this.f9432a = i10;
        switch (i10) {
            case 1:
                this.f9433b = list;
                this.f9434c = new k0[list.size()];
                e2.c cVar = new e2.c(new ig.c0(this, 7));
                this.d = cVar;
                cVar.p(3);
                return;
            default:
                this.f9433b = list;
                this.f9434c = new k0[list.size()];
                this.d = new e2.c(new ig.c0(this, 6));
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

    public final void b(c3.q qVar, g0 g0Var) {
        boolean z10;
        boolean z11;
        switch (this.f9432a) {
            case 0:
                int i10 = 0;
                while (true) {
                    k0[] k0VarArr = this.f9434c;
                    if (i10 < k0VarArr.length) {
                        g0Var.b();
                        g0Var.c();
                        k0 I1 = qVar.I1(g0Var.f9492c, 3);
                        b2.x xVar = (b2.x) this.f9433b.get(i10);
                        String str = xVar.f2423s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        t6.h(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = xVar.f2408a;
                        if (str2 == null) {
                            g0Var.c();
                            str2 = (String) g0Var.e;
                        }
                        b2.w wVar = new b2.w();
                        wVar.f2356a = str2;
                        wVar.f2369q = v0.n("video/mp2t");
                        wVar.f2370r = v0.n(str);
                        wVar.e = xVar.e;
                        wVar.d = xVar.d;
                        wVar.O = xVar.P;
                        wVar.f2373u = xVar.v;
                        i0.a.r(wVar, I1);
                        k0VarArr[i10] = I1;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    k0[] k0VarArr2 = this.f9434c;
                    if (i11 < k0VarArr2.length) {
                        g0Var.b();
                        g0Var.c();
                        k0 I12 = qVar.I1(g0Var.f9492c, 3);
                        b2.x xVar2 = (b2.x) this.f9433b.get(i11);
                        String str3 = xVar2.f2423s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        t6.h(z11, "Invalid closed caption MIME type provided: %s", str3);
                        b2.w wVar2 = new b2.w();
                        g0Var.c();
                        wVar2.f2356a = (String) g0Var.e;
                        wVar2.f2369q = v0.n("video/mp2t");
                        wVar2.f2370r = v0.n(str3);
                        wVar2.e = xVar2.e;
                        wVar2.d = xVar2.d;
                        wVar2.O = xVar2.P;
                        wVar2.f2373u = xVar2.v;
                        i0.a.r(wVar2, I12);
                        k0VarArr2[i11] = I12;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
