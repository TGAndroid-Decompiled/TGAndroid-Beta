package defpackage;

import java.util.List;
public final class oz9 {
    public final byte a;
    public final List b;
    public final x1c[] c;
    public final lo d;

    public oz9(List list, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = list;
                this.c = new x1c[list.size()];
                lo loVar = new lo(new ftb(this, (byte) 6));
                this.d = loVar;
                loVar.l(3);
                return;
            default:
                this.b = list;
                this.c = new x1c[list.size()];
                this.d = new lo(new ye9(this, (byte) 23));
                return;
        }
    }

    public final void a(long j, ey7 ey7Var) {
        if (ey7Var.a() >= 9) {
            int m = ey7Var.m();
            int m2 = ey7Var.m();
            int A = ey7Var.A();
            if (m == 434 && m2 == 1195456820 && A == 3) {
                this.d.a(j, ey7Var);
            }
        }
    }

    public final void b(g84 g84Var, l6c l6cVar) {
        boolean z;
        boolean z2;
        byte b = this.a;
        List list = this.b;
        x1c[] x1cVarArr = this.c;
        switch (b) {
            case 0:
                for (int i = 0; i < x1cVarArr.length; i++) {
                    l6cVar.a();
                    l6cVar.b();
                    x1c e0 = g84Var.e0(l6cVar.d, 3);
                    ko4 ko4Var = (ko4) list.get(i);
                    String str = ko4Var.t;
                    if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yve.h(z, "Invalid closed caption MIME type provided: %s", str);
                    String str2 = ko4Var.a;
                    if (str2 == null) {
                        l6cVar.b();
                        str2 = l6cVar.e;
                    }
                    jo4 jo4Var = new jo4();
                    jo4Var.a = str2;
                    jo4Var.r = dg7.n("video/mp2t");
                    jo4Var.s = dg7.n(str);
                    jo4Var.e = ko4Var.e;
                    jo4Var.d = ko4Var.d;
                    jo4Var.S = ko4Var.T;
                    jo4Var.v = ko4Var.w;
                    xnb.v(jo4Var, e0);
                    x1cVarArr[i] = e0;
                }
                return;
            default:
                for (int i2 = 0; i2 < x1cVarArr.length; i2++) {
                    l6cVar.a();
                    l6cVar.b();
                    x1c e02 = g84Var.e0(l6cVar.d, 3);
                    ko4 ko4Var2 = (ko4) list.get(i2);
                    String str3 = ko4Var2.t;
                    if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    yve.h(z2, "Invalid closed caption MIME type provided: %s", str3);
                    jo4 jo4Var2 = new jo4();
                    l6cVar.b();
                    jo4Var2.a = l6cVar.e;
                    jo4Var2.r = dg7.n("video/mp2t");
                    jo4Var2.s = dg7.n(str3);
                    jo4Var2.e = ko4Var2.e;
                    jo4Var2.d = ko4Var2.d;
                    jo4Var2.S = ko4Var2.T;
                    jo4Var2.v = ko4Var2.w;
                    xnb.v(jo4Var2, e02);
                    x1cVarArr[i2] = e02;
                }
                return;
        }
    }
}
