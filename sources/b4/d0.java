package b4;

import j3.m0;
import j3.n0;
import java.util.List;
import k7.t6;
public final class d0 {
    public final int f1356a;
    public final List f1357b;
    public final r3.v[] f1358c;

    public d0(int i10, List list) {
        this.f1356a = i10;
        switch (i10) {
            case 1:
                this.f1357b = list;
                this.f1358c = new r3.v[list.size()];
                return;
            default:
                this.f1357b = list;
                this.f1358c = new r3.v[list.size()];
                return;
        }
    }

    public void a(long j10, h5.w wVar) {
        if (wVar.a() >= 9) {
            int g10 = wVar.g();
            int g11 = wVar.g();
            int u10 = wVar.u();
            if (g10 == 434 && g11 == 1195456820 && u10 == 3) {
                t6.b(j10, wVar, this.f1358c);
            }
        }
    }

    public final void b(r3.m mVar, h0 h0Var) {
        boolean z4;
        boolean z10;
        switch (this.f1356a) {
            case 0:
                int i10 = 0;
                while (true) {
                    r3.v[] vVarArr = this.f1358c;
                    if (i10 < vVarArr.length) {
                        h0Var.a();
                        h0Var.b();
                        r3.v d22 = mVar.d2(h0Var.d, 3);
                        n0 n0Var = (n0) this.f1357b.get(i10);
                        String str = n0Var.C;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        h5.a.e("Invalid closed caption MIME type provided: " + str, z4);
                        String str2 = n0Var.f8717a;
                        if (str2 == null) {
                            h0Var.b();
                            str2 = h0Var.e;
                        }
                        m0 m0Var = new m0();
                        m0Var.f8655a = str2;
                        m0Var.f8666o = str;
                        m0Var.d = n0Var.d;
                        m0Var.f8657c = n0Var.f8719c;
                        m0Var.G = n0Var.U;
                        m0Var.f8668q = n0Var.E;
                        d22.b(new n0(m0Var));
                        vVarArr[i10] = d22;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    r3.v[] vVarArr2 = this.f1358c;
                    if (i11 < vVarArr2.length) {
                        h0Var.a();
                        h0Var.b();
                        r3.v d23 = mVar.d2(h0Var.d, 3);
                        n0 n0Var2 = (n0) this.f1357b.get(i11);
                        String str3 = n0Var2.C;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        h5.a.e("Invalid closed caption MIME type provided: " + str3, z10);
                        m0 m0Var2 = new m0();
                        h0Var.b();
                        m0Var2.f8655a = h0Var.e;
                        m0Var2.f8666o = str3;
                        m0Var2.d = n0Var2.d;
                        m0Var2.f8657c = n0Var2.f8719c;
                        m0Var2.G = n0Var2.U;
                        m0Var2.f8668q = n0Var2.E;
                        d23.b(new n0(m0Var2));
                        vVarArr2[i11] = d23;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
