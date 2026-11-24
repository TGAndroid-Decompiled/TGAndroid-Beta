package defpackage;

import java.util.List;
public final class uv9 {
    public final byte a;
    public final List b;
    public final wxb[] c;
    public final ko d;

    public uv9(List list, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = list;
                this.c = new wxb[list.size()];
                ko koVar = new ko(new hza(this, (byte) 23));
                this.d = koVar;
                koVar.l(3);
                return;
            default:
                this.b = list;
                this.c = new wxb[list.size()];
                this.d = new ko(new wh9(this, (byte) 10));
                return;
        }
    }

    public final void a(long j, xu7 xu7Var) {
        if (xu7Var.a() >= 9) {
            int m = xu7Var.m();
            int m2 = xu7Var.m();
            int A = xu7Var.A();
            if (m == 434 && m2 == 1195456820 && A == 3) {
                this.d.a(j, xu7Var);
            }
        }
    }

    public final void b(l74 l74Var, l2c l2cVar) {
        boolean z;
        boolean z2;
        byte b = this.a;
        List list = this.b;
        wxb[] wxbVarArr = this.c;
        switch (b) {
            case 0:
                for (int i = 0; i < wxbVarArr.length; i++) {
                    l2cVar.a();
                    l2cVar.b();
                    wxb S = l74Var.S(l2cVar.d, 3);
                    fm4 fm4Var = (fm4) list.get(i);
                    String str = fm4Var.t;
                    if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gre.h(z, "Invalid closed caption MIME type provided: %s", str);
                    String str2 = fm4Var.a;
                    if (str2 == null) {
                        l2cVar.b();
                        str2 = l2cVar.e;
                    }
                    em4 em4Var = new em4();
                    em4Var.a = str2;
                    em4Var.r = ud7.n("video/mp2t");
                    em4Var.s = ud7.n(str);
                    em4Var.e = fm4Var.e;
                    em4Var.d = fm4Var.d;
                    em4Var.S = fm4Var.T;
                    em4Var.v = fm4Var.w;
                    yjb.v(em4Var, S);
                    wxbVarArr[i] = S;
                }
                return;
            default:
                for (int i2 = 0; i2 < wxbVarArr.length; i2++) {
                    l2cVar.a();
                    l2cVar.b();
                    wxb S2 = l74Var.S(l2cVar.d, 3);
                    fm4 fm4Var2 = (fm4) list.get(i2);
                    String str3 = fm4Var2.t;
                    if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    gre.h(z2, "Invalid closed caption MIME type provided: %s", str3);
                    em4 em4Var2 = new em4();
                    l2cVar.b();
                    em4Var2.a = l2cVar.e;
                    em4Var2.r = ud7.n("video/mp2t");
                    em4Var2.s = ud7.n(str3);
                    em4Var2.e = fm4Var2.e;
                    em4Var2.d = fm4Var2.d;
                    em4Var2.S = fm4Var2.T;
                    em4Var2.v = fm4Var2.w;
                    yjb.v(em4Var2, S2);
                    wxbVarArr[i2] = S2;
                }
                return;
        }
    }
}
