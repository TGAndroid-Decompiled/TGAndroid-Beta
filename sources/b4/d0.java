package b4;

import j3.m0;
import j3.n0;
import java.util.List;
import k7.t6;
public final class d0 {
    public final int f1451a;
    public final List f1452b;
    public final r3.v[] f1453c;

    public d0(int i10, List list) {
        this.f1451a = i10;
        switch (i10) {
            case 1:
                this.f1452b = list;
                this.f1453c = new r3.v[list.size()];
                return;
            default:
                this.f1452b = list;
                this.f1453c = new r3.v[list.size()];
                return;
        }
    }

    public void a(long j10, h5.w wVar) {
        if (wVar.a() >= 9) {
            int g10 = wVar.g();
            int g11 = wVar.g();
            int u10 = wVar.u();
            if (g10 == 434 && g11 == 1195456820 && u10 == 3) {
                t6.b(j10, wVar, this.f1453c);
            }
        }
    }

    public final void b(r3.m mVar, h0 h0Var) {
        boolean z4;
        boolean z10;
        switch (this.f1451a) {
            case 0:
                int i10 = 0;
                while (true) {
                    r3.v[] vVarArr = this.f1453c;
                    if (i10 < vVarArr.length) {
                        h0Var.a();
                        h0Var.b();
                        r3.v i22 = mVar.i2(h0Var.d, 3);
                        n0 n0Var = (n0) this.f1452b.get(i10);
                        String str = n0Var.C;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        h5.a.e("Invalid closed caption MIME type provided: " + str, z4);
                        String str2 = n0Var.f9318a;
                        if (str2 == null) {
                            h0Var.b();
                            str2 = h0Var.f1514e;
                        }
                        m0 m0Var = new m0();
                        m0Var.f9253a = str2;
                        m0Var.f9265o = str;
                        m0Var.d = n0Var.d;
                        m0Var.f9255c = n0Var.f9320c;
                        m0Var.G = n0Var.U;
                        m0Var.f9267q = n0Var.E;
                        i22.b(new n0(m0Var));
                        vVarArr[i10] = i22;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    r3.v[] vVarArr2 = this.f1453c;
                    if (i11 < vVarArr2.length) {
                        h0Var.a();
                        h0Var.b();
                        r3.v i23 = mVar.i2(h0Var.d, 3);
                        n0 n0Var2 = (n0) this.f1452b.get(i11);
                        String str3 = n0Var2.C;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        h5.a.e("Invalid closed caption MIME type provided: " + str3, z10);
                        m0 m0Var2 = new m0();
                        h0Var.b();
                        m0Var2.f9253a = h0Var.f1514e;
                        m0Var2.f9265o = str3;
                        m0Var2.d = n0Var2.d;
                        m0Var2.f9255c = n0Var2.f9320c;
                        m0Var2.G = n0Var2.U;
                        m0Var2.f9267q = n0Var2.E;
                        i23.b(new n0(m0Var2));
                        vVarArr2[i11] = i23;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
