package j4;

import b2.r0;
import hi.y1;
import java.util.List;
public final class d0 {
    public final int f11534a;
    public final List f11535b;
    public final c3.h0[] f11536c;
    public final e2.c d;

    public d0(int i10, List list) {
        this.f11534a = i10;
        switch (i10) {
            case 1:
                this.f11535b = list;
                this.f11536c = new c3.h0[list.size()];
                e2.c cVar = new e2.c(new y1(this, 19));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f11535b = list;
                this.f11536c = new c3.h0[list.size()];
                this.d = new e2.c(new y1(this, 18));
                return;
        }
    }

    public void a(long j3, e2.v vVar) {
        if (vVar.a() >= 9) {
            int j10 = vVar.j();
            int j11 = vVar.j();
            int x10 = vVar.x();
            if (j10 == 434 && j11 == 1195456820 && x10 == 3) {
                this.d.a(j3, vVar);
            }
        }
    }

    public final void b(c3.q qVar, g0 g0Var) {
        boolean z10;
        boolean z11;
        switch (this.f11534a) {
            case 0:
                int i10 = 0;
                while (true) {
                    c3.h0[] h0VarArr = this.f11536c;
                    if (i10 < h0VarArr.length) {
                        g0Var.a();
                        g0Var.b();
                        c3.h0 I = qVar.I(g0Var.d, 3);
                        b2.s sVar = (b2.s) this.f11535b.get(i10);
                        String str = sVar.f2002r;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str, z10);
                        String str2 = sVar.f1988a;
                        if (str2 == null) {
                            g0Var.b();
                            str2 = g0Var.e;
                        }
                        b2.r rVar = new b2.r();
                        rVar.f1933a = str2;
                        rVar.f1945p = r0.n("video/mp2t");
                        rVar.f1946q = r0.n(str);
                        rVar.e = sVar.e;
                        rVar.d = sVar.d;
                        rVar.N = sVar.O;
                        rVar.f1949t = sVar.f2005u;
                        hc.b.u(rVar, I);
                        h0VarArr[i10] = I;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    c3.h0[] h0VarArr2 = this.f11536c;
                    if (i11 < h0VarArr2.length) {
                        g0Var.a();
                        g0Var.b();
                        c3.h0 I2 = qVar.I(g0Var.d, 3);
                        b2.s sVar2 = (b2.s) this.f11535b.get(i11);
                        String str3 = sVar2.f2002r;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str3, z11);
                        b2.r rVar2 = new b2.r();
                        g0Var.b();
                        rVar2.f1933a = g0Var.e;
                        rVar2.f1945p = r0.n("video/mp2t");
                        rVar2.f1946q = r0.n(str3);
                        rVar2.e = sVar2.e;
                        rVar2.d = sVar2.d;
                        rVar2.N = sVar2.O;
                        rVar2.f1949t = sVar2.f2005u;
                        hc.b.u(rVar2, I2);
                        h0VarArr2[i11] = I2;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
