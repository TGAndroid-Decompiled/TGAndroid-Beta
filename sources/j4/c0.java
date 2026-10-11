package j4;

import b2.r0;
import c3.h0;
import ei.c5;
import java.util.List;
public final class c0 {
    public final int f13749a;
    public final List f13750b;
    public final h0[] f13751c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.f13749a = i10;
        switch (i10) {
            case 1:
                this.f13750b = list;
                this.f13751c = new h0[list.size()];
                e2.c cVar = new e2.c(new c5(this, 27));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f13750b = list;
                this.f13751c = new h0[list.size()];
                this.d = new e2.c(new c5(this, 26));
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
        switch (this.f13749a) {
            case 0:
                int i10 = 0;
                while (true) {
                    h0[] h0VarArr = this.f13751c;
                    if (i10 < h0VarArr.length) {
                        f0Var.b();
                        f0Var.c();
                        h0 f22 = qVar.f2(f0Var.f13807c, 3);
                        b2.s sVar = (b2.s) this.f13750b.get(i10);
                        String str = sVar.f3643r;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str, z10);
                        String str2 = sVar.f3628a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.f13808e;
                        }
                        b2.r rVar = new b2.r();
                        rVar.f3571a = str2;
                        rVar.f3584p = r0.n("video/mp2t");
                        rVar.f3585q = r0.n(str);
                        rVar.f3574e = sVar.f3631e;
                        rVar.d = sVar.d;
                        rVar.N = sVar.O;
                        rVar.f3588t = sVar.f3646u;
                        hg.c.s(rVar, f22);
                        h0VarArr[i10] = f22;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    h0[] h0VarArr2 = this.f13751c;
                    if (i11 < h0VarArr2.length) {
                        f0Var.b();
                        f0Var.c();
                        h0 f23 = qVar.f2(f0Var.f13807c, 3);
                        b2.s sVar2 = (b2.s) this.f13750b.get(i11);
                        String str3 = sVar2.f3643r;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        e2.d.a("Invalid closed caption MIME type provided: " + str3, z11);
                        b2.r rVar2 = new b2.r();
                        f0Var.c();
                        rVar2.f3571a = (String) f0Var.f13808e;
                        rVar2.f3584p = r0.n("video/mp2t");
                        rVar2.f3585q = r0.n(str3);
                        rVar2.f3574e = sVar2.f3631e;
                        rVar2.d = sVar2.d;
                        rVar2.N = sVar2.O;
                        rVar2.f3588t = sVar2.f3646u;
                        hg.c.s(rVar2, f23);
                        h0VarArr2[i11] = f23;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
