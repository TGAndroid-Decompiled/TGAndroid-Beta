package j4;

import b2.r0;
import c3.h0;
import java.util.List;
public final class c0 {
    public final int f13262a;
    public final List f13263b;
    public final h0[] f13264c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.f13262a = i10;
        switch (i10) {
            case 1:
                this.f13263b = list;
                this.f13264c = new h0[list.size()];
                e2.c cVar = new e2.c(new fi.f(this, 20));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f13263b = list;
                this.f13264c = new h0[list.size()];
                this.d = new e2.c(new fi.f(this, 19));
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

    public final void b(c3.q qVar, f0 f0Var) {
        boolean z10;
        boolean z11;
        switch (this.f13262a) {
            case 0:
                int i10 = 0;
                while (true) {
                    h0[] h0VarArr = this.f13264c;
                    if (i10 < h0VarArr.length) {
                        f0Var.a();
                        f0Var.b();
                        h0 R1 = qVar.R1(f0Var.d, 3);
                        b2.s sVar = (b2.s) this.f13263b.get(i10);
                        String str = sVar.f2397r;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str, z10);
                        String str2 = sVar.f2382a;
                        if (str2 == null) {
                            f0Var.b();
                            str2 = f0Var.f13321e;
                        }
                        b2.r rVar = new b2.r();
                        rVar.f2325a = str2;
                        rVar.f2338p = r0.n("video/mp2t");
                        rVar.f2339q = r0.n(str);
                        rVar.f2328e = sVar.f2385e;
                        rVar.d = sVar.d;
                        rVar.N = sVar.O;
                        rVar.f2342t = sVar.f2400u;
                        i2.g.u(rVar, R1);
                        h0VarArr[i10] = R1;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    h0[] h0VarArr2 = this.f13264c;
                    if (i11 < h0VarArr2.length) {
                        f0Var.a();
                        f0Var.b();
                        h0 R12 = qVar.R1(f0Var.d, 3);
                        b2.s sVar2 = (b2.s) this.f13263b.get(i11);
                        String str3 = sVar2.f2397r;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str3, z11);
                        b2.r rVar2 = new b2.r();
                        f0Var.b();
                        rVar2.f2325a = f0Var.f13321e;
                        rVar2.f2338p = r0.n("video/mp2t");
                        rVar2.f2339q = r0.n(str3);
                        rVar2.f2328e = sVar2.f2385e;
                        rVar2.d = sVar2.d;
                        rVar2.N = sVar2.O;
                        rVar2.f2342t = sVar2.f2400u;
                        i2.g.u(rVar2, R12);
                        h0VarArr2[i11] = R12;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
