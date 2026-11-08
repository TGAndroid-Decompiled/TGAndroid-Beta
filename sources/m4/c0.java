package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class c0 {
    public final int f19598a;
    public final List f19599b;
    public final j0[] f19600c;
    public final h2.c d;

    public c0(int i7, List list) {
        this.f19598a = i7;
        switch (i7) {
            case 1:
                this.f19599b = list;
                this.f19600c = new j0[list.size()];
                h2.c cVar = new h2.c(new l2.y(this, 18));
                this.d = cVar;
                cVar.C(3);
                return;
            default:
                this.f19599b = list;
                this.f19600c = new j0[list.size()];
                this.d = new h2.c(new l2.y(this, 17));
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

    public final void b(f3.q qVar, g0 g0Var) {
        boolean z9;
        boolean z10;
        switch (this.f19598a) {
            case 0:
                int i7 = 0;
                while (true) {
                    j0[] j0VarArr = this.f19600c;
                    if (i7 < j0VarArr.length) {
                        g0Var.b();
                        g0Var.c();
                        j0 O1 = qVar.O1(g0Var.f19673c, 3);
                        e2.u uVar = (e2.u) this.f19599b.get(i7);
                        String str = uVar.f10615s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        ia.h(z9, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = uVar.f10599a;
                        if (str2 == null) {
                            g0Var.c();
                            str2 = (String) g0Var.f19674e;
                        }
                        e2.t tVar = new e2.t();
                        tVar.f10548a = str2;
                        tVar.f10562q = s0.n("video/mp2t");
                        tVar.f10563r = s0.n(str);
                        tVar.f10551e = uVar.f10602e;
                        tVar.d = uVar.d;
                        tVar.O = uVar.P;
                        tVar.f10566u = uVar.v;
                        f1.s(tVar, O1);
                        j0VarArr[i7] = O1;
                        i7++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    j0[] j0VarArr2 = this.f19600c;
                    if (i10 < j0VarArr2.length) {
                        g0Var.b();
                        g0Var.c();
                        j0 O12 = qVar.O1(g0Var.f19673c, 3);
                        e2.u uVar2 = (e2.u) this.f19599b.get(i10);
                        String str3 = uVar2.f10615s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        ia.h(z10, "Invalid closed caption MIME type provided: %s", str3);
                        e2.t tVar2 = new e2.t();
                        g0Var.c();
                        tVar2.f10548a = (String) g0Var.f19674e;
                        tVar2.f10562q = s0.n("video/mp2t");
                        tVar2.f10563r = s0.n(str3);
                        tVar2.f10551e = uVar2.f10602e;
                        tVar2.d = uVar2.d;
                        tVar2.O = uVar2.P;
                        tVar2.f10566u = uVar2.v;
                        f1.s(tVar2, O12);
                        j0VarArr2[i10] = O12;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
