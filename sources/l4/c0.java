package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import ei.y8;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class c0 {
    public final int f17764a;
    public final List f17765b;
    public final i0[] f17766c;
    public final g2.d d;

    public c0(int i3, List list) {
        this.f17764a = i3;
        switch (i3) {
            case 1:
                this.f17765b = list;
                this.f17766c = new i0[list.size()];
                g2.d dVar = new g2.d(new y8(this, 29));
                this.d = dVar;
                dVar.C(3);
                return;
            default:
                this.f17765b = list;
                this.f17766c = new i0[list.size()];
                this.d = new g2.d(new y8(this, 28));
                return;
        }
    }

    public void a(long j10, g2.y yVar) {
        if (yVar.a() >= 9) {
            int m10 = yVar.m();
            int m11 = yVar.m();
            int A = yVar.A();
            if (m10 == 434 && m11 == 1195456820 && A == 3) {
                this.d.a(j10, yVar);
            }
        }
    }

    public final void b(e3.q qVar, f0 f0Var) {
        boolean z10;
        boolean z11;
        switch (this.f17764a) {
            case 0:
                int i3 = 0;
                while (true) {
                    i0[] i0VarArr = this.f17766c;
                    if (i3 < i0VarArr.length) {
                        f0Var.b();
                        f0Var.c();
                        i0 i02 = qVar.i0(f0Var.f17822c, 3);
                        d2.v vVar = (d2.v) this.f17765b.get(i3);
                        String str = vVar.f8489s;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        zb.h(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = vVar.f8473a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.f17823e;
                        }
                        d2.u uVar = new d2.u();
                        uVar.f8416a = str2;
                        uVar.f8430q = u0.n("video/mp2t");
                        uVar.f8431r = u0.n(str);
                        uVar.f8419e = vVar.f8476e;
                        uVar.d = vVar.d;
                        uVar.O = vVar.P;
                        uVar.f8434u = vVar.v;
                        f1.w(uVar, i02);
                        i0VarArr[i3] = i02;
                        i3++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    i0[] i0VarArr2 = this.f17766c;
                    if (i10 < i0VarArr2.length) {
                        f0Var.b();
                        f0Var.c();
                        i0 i03 = qVar.i0(f0Var.f17822c, 3);
                        d2.v vVar2 = (d2.v) this.f17765b.get(i10);
                        String str3 = vVar2.f8489s;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        zb.h(z11, "Invalid closed caption MIME type provided: %s", str3);
                        d2.u uVar2 = new d2.u();
                        f0Var.c();
                        uVar2.f8416a = (String) f0Var.f17823e;
                        uVar2.f8430q = u0.n("video/mp2t");
                        uVar2.f8431r = u0.n(str3);
                        uVar2.f8419e = vVar2.f8476e;
                        uVar2.d = vVar2.d;
                        uVar2.O = vVar2.P;
                        uVar2.f8434u = vVar2.v;
                        f1.w(uVar2, i03);
                        i0VarArr2[i10] = i03;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
