package j4;

import b2.r0;
import c3.h0;
import java.util.List;
public final class c0 {
    public final int f13236a;
    public final List f13237b;
    public final h0[] f13238c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.f13236a = i10;
        switch (i10) {
            case 1:
                this.f13237b = list;
                this.f13238c = new h0[list.size()];
                e2.c cVar = new e2.c(new fi.f(this, 20));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f13237b = list;
                this.f13238c = new h0[list.size()];
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
        switch (this.f13236a) {
            case 0:
                int i10 = 0;
                while (true) {
                    h0[] h0VarArr = this.f13238c;
                    if (i10 < h0VarArr.length) {
                        f0Var.a();
                        f0Var.b();
                        h0 R1 = qVar.R1(f0Var.d, 3);
                        b2.s sVar = (b2.s) this.f13237b.get(i10);
                        String str = sVar.f2370r;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str, z10);
                        String str2 = sVar.f2355a;
                        if (str2 == null) {
                            f0Var.b();
                            str2 = f0Var.f13295e;
                        }
                        b2.r rVar = new b2.r();
                        rVar.f2298a = str2;
                        rVar.f2311p = r0.n("video/mp2t");
                        rVar.f2312q = r0.n(str);
                        rVar.f2301e = sVar.f2358e;
                        rVar.d = sVar.d;
                        rVar.N = sVar.O;
                        rVar.f2315t = sVar.f2373u;
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
                    h0[] h0VarArr2 = this.f13238c;
                    if (i11 < h0VarArr2.length) {
                        f0Var.a();
                        f0Var.b();
                        h0 R12 = qVar.R1(f0Var.d, 3);
                        b2.s sVar2 = (b2.s) this.f13237b.get(i11);
                        String str3 = sVar2.f2370r;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str3, z11);
                        b2.r rVar2 = new b2.r();
                        f0Var.b();
                        rVar2.f2298a = f0Var.f13295e;
                        rVar2.f2311p = r0.n("video/mp2t");
                        rVar2.f2312q = r0.n(str3);
                        rVar2.f2301e = sVar2.f2358e;
                        rVar2.d = sVar2.d;
                        rVar2.N = sVar2.O;
                        rVar2.f2315t = sVar2.f2373u;
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
