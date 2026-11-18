package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.List;
public final class c0 {
    public final int f20558a;
    public final List f20559b;
    public final i0[] f20560c;
    public final h2.c d;

    public c0(int i7, List list) {
        this.f20558a = i7;
        switch (i7) {
            case 1:
                this.f20559b = list;
                this.f20560c = new i0[list.size()];
                h2.c cVar = new h2.c(new ki.e(this, 15));
                this.d = cVar;
                cVar.C(3);
                return;
            default:
                this.f20559b = list;
                this.f20560c = new i0[list.size()];
                this.d = new h2.c(new ki.e(this, 14));
                return;
        }
    }

    public void a(long j3, h2.x xVar) {
        if (xVar.a() >= 9) {
            int m10 = xVar.m();
            int m11 = xVar.m();
            int A = xVar.A();
            if (m10 == 434 && m11 == 1195456820 && A == 3) {
                this.d.a(j3, xVar);
            }
        }
    }

    public final void b(f3.q qVar, f0 f0Var) {
        boolean z10;
        boolean z11;
        switch (this.f20558a) {
            case 0:
                int i7 = 0;
                while (true) {
                    i0[] i0VarArr = this.f20560c;
                    if (i7 < i0VarArr.length) {
                        f0Var.b();
                        f0Var.c();
                        i0 d2 = qVar.d2(f0Var.f20616c, 3);
                        e2.u uVar = (e2.u) this.f20559b.get(i7);
                        String str = uVar.f10769s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        la.h(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = uVar.f10753a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.f20617e;
                        }
                        e2.t tVar = new e2.t();
                        tVar.f10702a = str2;
                        tVar.f10716q = s0.n("video/mp2t");
                        tVar.f10717r = s0.n(str);
                        tVar.f10705e = uVar.f10756e;
                        tVar.d = uVar.d;
                        tVar.O = uVar.P;
                        tVar.f10720u = uVar.v;
                        p5.c.r(tVar, d2);
                        i0VarArr[i7] = d2;
                        i7++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    i0[] i0VarArr2 = this.f20560c;
                    if (i10 < i0VarArr2.length) {
                        f0Var.b();
                        f0Var.c();
                        i0 d22 = qVar.d2(f0Var.f20616c, 3);
                        e2.u uVar2 = (e2.u) this.f20559b.get(i10);
                        String str3 = uVar2.f10769s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        la.h(z11, "Invalid closed caption MIME type provided: %s", str3);
                        e2.t tVar2 = new e2.t();
                        f0Var.c();
                        tVar2.f10702a = (String) f0Var.f20617e;
                        tVar2.f10716q = s0.n("video/mp2t");
                        tVar2.f10717r = s0.n(str3);
                        tVar2.f10705e = uVar2.f10756e;
                        tVar2.d = uVar2.d;
                        tVar2.O = uVar2.P;
                        tVar2.f10720u = uVar2.v;
                        p5.c.r(tVar2, d22);
                        i0VarArr2[i10] = d22;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
