package j4;

import b2.w0;
import c3.i0;
import java.util.List;
import v7.u6;
public final class c0 {
    public final int f12588a;
    public final List f12589b;
    public final i0[] f12590c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.f12588a = i10;
        switch (i10) {
            case 1:
                this.f12589b = list;
                this.f12590c = new i0[list.size()];
                e2.c cVar = new e2.c(new f1.a(this, 20));
                this.d = cVar;
                cVar.k(3);
                return;
            default:
                this.f12589b = list;
                this.f12590c = new i0[list.size()];
                this.d = new e2.c(new f1.a(this, 19));
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
        switch (this.f12588a) {
            case 0:
                int i10 = 0;
                while (true) {
                    i0[] i0VarArr = this.f12590c;
                    if (i10 < i0VarArr.length) {
                        f0Var.b();
                        f0Var.c();
                        i0 a02 = qVar.a0(f0Var.f12643c, 3);
                        b2.x xVar = (b2.x) this.f12589b.get(i10);
                        String str = xVar.f2519s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        u6.h(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = xVar.f2504a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.e;
                        }
                        b2.w wVar = new b2.w();
                        wVar.f2452a = str2;
                        wVar.f2465q = w0.n("video/mp2t");
                        wVar.f2466r = w0.n(str);
                        wVar.e = xVar.e;
                        wVar.d = xVar.d;
                        wVar.O = xVar.P;
                        wVar.f2469u = xVar.v;
                        i2.d.s(wVar, a02);
                        i0VarArr[i10] = a02;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    i0[] i0VarArr2 = this.f12590c;
                    if (i11 < i0VarArr2.length) {
                        f0Var.b();
                        f0Var.c();
                        i0 a03 = qVar.a0(f0Var.f12643c, 3);
                        b2.x xVar2 = (b2.x) this.f12589b.get(i11);
                        String str3 = xVar2.f2519s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        u6.h(z11, "Invalid closed caption MIME type provided: %s", str3);
                        b2.w wVar2 = new b2.w();
                        f0Var.c();
                        wVar2.f2452a = (String) f0Var.e;
                        wVar2.f2465q = w0.n("video/mp2t");
                        wVar2.f2466r = w0.n(str3);
                        wVar2.e = xVar2.e;
                        wVar2.d = xVar2.d;
                        wVar2.O = xVar2.P;
                        wVar2.f2469u = xVar2.v;
                        i2.d.s(wVar2, a03);
                        i0VarArr2[i11] = a03;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
