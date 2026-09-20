package j4;

import b2.r0;
import c3.h0;
import ei.d5;
import hg.k0;
import java.util.List;
public final class c0 {
    public final int f12630a;
    public final List f12631b;
    public final h0[] f12632c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.f12630a = i10;
        switch (i10) {
            case 1:
                this.f12631b = list;
                this.f12632c = new h0[list.size()];
                e2.c cVar = new e2.c(new d5(this, 28));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f12631b = list;
                this.f12632c = new h0[list.size()];
                this.d = new e2.c(new d5(this, 27));
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
        switch (this.f12630a) {
            case 0:
                int i10 = 0;
                while (true) {
                    h0[] h0VarArr = this.f12632c;
                    if (i10 < h0VarArr.length) {
                        f0Var.a();
                        f0Var.b();
                        h0 Z1 = qVar.Z1(f0Var.d, 3);
                        b2.s sVar = (b2.s) this.f12631b.get(i10);
                        String str = sVar.f3309r;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str, z10);
                        String str2 = sVar.f3295a;
                        if (str2 == null) {
                            f0Var.b();
                            str2 = f0Var.e;
                        }
                        b2.r rVar = new b2.r();
                        rVar.f3240a = str2;
                        rVar.f3252p = r0.n("video/mp2t");
                        rVar.f3253q = r0.n(str);
                        rVar.e = sVar.e;
                        rVar.d = sVar.d;
                        rVar.N = sVar.O;
                        rVar.f3256t = sVar.f3312u;
                        k0.s(rVar, Z1);
                        h0VarArr[i10] = Z1;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    h0[] h0VarArr2 = this.f12632c;
                    if (i11 < h0VarArr2.length) {
                        f0Var.a();
                        f0Var.b();
                        h0 Z12 = qVar.Z1(f0Var.d, 3);
                        b2.s sVar2 = (b2.s) this.f12631b.get(i11);
                        String str3 = sVar2.f3309r;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str3, z11);
                        b2.r rVar2 = new b2.r();
                        f0Var.b();
                        rVar2.f3240a = f0Var.e;
                        rVar2.f3252p = r0.n("video/mp2t");
                        rVar2.f3253q = r0.n(str3);
                        rVar2.e = sVar2.e;
                        rVar2.d = sVar2.d;
                        rVar2.N = sVar2.O;
                        rVar2.f3256t = sVar2.f3312u;
                        k0.s(rVar2, Z12);
                        h0VarArr2[i11] = Z12;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
