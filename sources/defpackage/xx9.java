package defpackage;

import java.util.List;
public final class xx9 {
    public final byte a;
    public final List b;
    public final yzb[] c;
    public final kp d;

    public xx9(List list, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = list;
                this.c = new yzb[list.size()];
                kp kpVar = new kp(new wta(this, (byte) 27));
                this.d = kpVar;
                kpVar.l(3);
                return;
            default:
                this.b = list;
                this.c = new yzb[list.size()];
                this.d = new kp(new yf9(this, (byte) 14));
                return;
        }
    }

    public final void a(long j, yw7 yw7Var) {
        if (yw7Var.a() >= 9) {
            int m = yw7Var.m();
            int m2 = yw7Var.m();
            int A = yw7Var.A();
            if (m == 434 && m2 == 1195456820 && A == 3) {
                this.d.a(j, yw7Var);
            }
        }
    }

    public final void b(u84 u84Var, l4c l4cVar) {
        boolean z;
        boolean z2;
        byte b = this.a;
        List list = this.b;
        yzb[] yzbVarArr = this.c;
        switch (b) {
            case 0:
                for (int i = 0; i < yzbVarArr.length; i++) {
                    l4cVar.a();
                    l4cVar.b();
                    yzb c0 = u84Var.c0(l4cVar.d, 3);
                    go4 go4Var = (go4) list.get(i);
                    String str = go4Var.t;
                    if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    jte.h(z, "Invalid closed caption MIME type provided: %s", str);
                    String str2 = go4Var.a;
                    if (str2 == null) {
                        l4cVar.b();
                        str2 = l4cVar.e;
                    }
                    fo4 fo4Var = new fo4();
                    fo4Var.a = str2;
                    fo4Var.r = wf7.n("video/mp2t");
                    fo4Var.s = wf7.n(str);
                    fo4Var.e = go4Var.e;
                    fo4Var.d = go4Var.d;
                    fo4Var.S = go4Var.T;
                    fo4Var.v = go4Var.w;
                    mlb.w(fo4Var, c0);
                    yzbVarArr[i] = c0;
                }
                return;
            default:
                for (int i2 = 0; i2 < yzbVarArr.length; i2++) {
                    l4cVar.a();
                    l4cVar.b();
                    yzb c02 = u84Var.c0(l4cVar.d, 3);
                    go4 go4Var2 = (go4) list.get(i2);
                    String str3 = go4Var2.t;
                    if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    jte.h(z2, "Invalid closed caption MIME type provided: %s", str3);
                    fo4 fo4Var2 = new fo4();
                    l4cVar.b();
                    fo4Var2.a = l4cVar.e;
                    fo4Var2.r = wf7.n("video/mp2t");
                    fo4Var2.s = wf7.n(str3);
                    fo4Var2.e = go4Var2.e;
                    fo4Var2.d = go4Var2.d;
                    fo4Var2.S = go4Var2.T;
                    fo4Var2.v = go4Var2.w;
                    mlb.w(fo4Var2, c02);
                    yzbVarArr[i2] = c02;
                }
                return;
        }
    }
}
