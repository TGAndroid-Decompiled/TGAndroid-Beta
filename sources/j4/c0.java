package j4;

import b2.v0;
import c3.j0;
import java.util.List;
import v7.u6;
public final class c0 {
    public final int f14004a;
    public final List f14005b;
    public final j0[] f14006c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.f14004a = i10;
        switch (i10) {
            case 1:
                this.f14005b = list;
                this.f14006c = new j0[list.size()];
                e2.c cVar = new e2.c(new e1.c(this, 29));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f14005b = list;
                this.f14006c = new j0[list.size()];
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
        switch (this.f14004a) {
            case 0:
                int i10 = 0;
                while (true) {
                    j0[] j0VarArr = this.f14006c;
                    if (i10 < j0VarArr.length) {
                        f0Var.b();
                        f0Var.c();
                        j0 j02 = qVar.j0(f0Var.f14059c, 3);
                        b2.w wVar = (b2.w) this.f14005b.get(i10);
                        String str = wVar.f4132s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        u6.h(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = wVar.f4117a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.e;
                        }
                        b2.v vVar = new b2.v();
                        vVar.f4065a = str2;
                        vVar.f4078q = v0.n("video/mp2t");
                        vVar.f4079r = v0.n(str);
                        vVar.e = wVar.e;
                        vVar.d = wVar.d;
                        vVar.O = wVar.P;
                        vVar.f4082u = wVar.v;
                        i2.d.u(vVar, j02);
                        j0VarArr[i10] = j02;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    j0[] j0VarArr2 = this.f14006c;
                    if (i11 < j0VarArr2.length) {
                        f0Var.b();
                        f0Var.c();
                        j0 j03 = qVar.j0(f0Var.f14059c, 3);
                        b2.w wVar2 = (b2.w) this.f14005b.get(i11);
                        String str3 = wVar2.f4132s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        u6.h(z11, "Invalid closed caption MIME type provided: %s", str3);
                        b2.v vVar2 = new b2.v();
                        f0Var.c();
                        vVar2.f4065a = (String) f0Var.e;
                        vVar2.f4078q = v0.n("video/mp2t");
                        vVar2.f4079r = v0.n(str3);
                        vVar2.e = wVar2.e;
                        vVar2.d = wVar2.d;
                        vVar2.O = wVar2.P;
                        vVar2.f4082u = wVar2.v;
                        i2.d.u(vVar2, j03);
                        j0VarArr2[i11] = j03;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
