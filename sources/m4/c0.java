package m4;

import a8.ma;
import e2.s0;
import f3.j0;
import java.util.List;
import kg.f1;
public final class c0 {
    public final int f20648a;
    public final List f20649b;
    public final j0[] f20650c;
    public final h2.c d;

    public c0(int i7, List list) {
        this.f20648a = i7;
        switch (i7) {
            case 1:
                this.f20649b = list;
                this.f20650c = new j0[list.size()];
                h2.c cVar = new h2.c(new f1(this, 18));
                this.d = cVar;
                cVar.C(3);
                return;
            default:
                this.f20649b = list;
                this.f20650c = new j0[list.size()];
                this.d = new h2.c(new f1(this, 17));
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
        switch (this.f20648a) {
            case 0:
                int i7 = 0;
                while (true) {
                    j0[] j0VarArr = this.f20650c;
                    if (i7 < j0VarArr.length) {
                        f0Var.b();
                        f0Var.c();
                        j0 d2 = qVar.d2(f0Var.f20706c, 3);
                        e2.u uVar = (e2.u) this.f20649b.get(i7);
                        String str = uVar.f10759s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        ma.h(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = uVar.f10743a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.f20707e;
                        }
                        e2.t tVar = new e2.t();
                        tVar.f10692a = str2;
                        tVar.f10706q = s0.n("video/mp2t");
                        tVar.f10707r = s0.n(str);
                        tVar.f10695e = uVar.f10746e;
                        tVar.d = uVar.d;
                        tVar.O = uVar.P;
                        tVar.f10710u = uVar.v;
                        p5.c.r(tVar, d2);
                        j0VarArr[i7] = d2;
                        i7++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    j0[] j0VarArr2 = this.f20650c;
                    if (i10 < j0VarArr2.length) {
                        f0Var.b();
                        f0Var.c();
                        j0 d22 = qVar.d2(f0Var.f20706c, 3);
                        e2.u uVar2 = (e2.u) this.f20649b.get(i10);
                        String str3 = uVar2.f10759s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        ma.h(z11, "Invalid closed caption MIME type provided: %s", str3);
                        e2.t tVar2 = new e2.t();
                        f0Var.c();
                        tVar2.f10692a = (String) f0Var.f20707e;
                        tVar2.f10706q = s0.n("video/mp2t");
                        tVar2.f10707r = s0.n(str3);
                        tVar2.f10695e = uVar2.f10746e;
                        tVar2.d = uVar2.d;
                        tVar2.O = uVar2.P;
                        tVar2.f10710u = uVar2.v;
                        p5.c.r(tVar2, d22);
                        j0VarArr2[i10] = d22;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
