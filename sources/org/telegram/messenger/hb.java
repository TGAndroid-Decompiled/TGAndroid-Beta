package org.telegram.messenger;

import java.io.File;
public final class hb implements Runnable {
    public final int f24418a;
    public final fc f24419b;
    public final String f24420c;

    public hb(fc fcVar, String str, int i7) {
        this.f24418a = i7;
        this.f24419b = fcVar;
        this.f24420c = str;
    }

    @Override
    public final void run() {
        switch (this.f24418a) {
            case 0:
                String str = this.f24420c;
                fc fcVar = this.f24419b;
                tb tbVar = (tb) fcVar.f23890g.get(str);
                if (tbVar != null) {
                    sb sbVar = tbVar.f27006s;
                    if (sbVar != null) {
                        sb sbVar2 = new sb(fcVar, sbVar.f26777a);
                        tbVar.f27006s = sbVar2;
                        fcVar.f23897o.add(sbVar2);
                    }
                    fcVar.T(false);
                    return;
                }
                return;
            case 1:
                tb tbVar2 = (tb) this.f24419b.f23890g.get(this.f24420c);
                if (tbVar2 != null) {
                    tbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24419b.f23904w.remove(this.f24420c);
                return;
            case 3:
                String str2 = this.f24420c;
                String B = fc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    gc g10 = gc.g(str2);
                    fc fcVar2 = this.f24419b;
                    tb tbVar3 = new tb(fcVar2);
                    tbVar3.f27000m = 1;
                    tbVar3.d = Utilities.a(str2);
                    tbVar3.f26994f = null;
                    tbVar3.f26996i = g10;
                    tbVar3.f26995g = B;
                    tbVar3.f26997j = null;
                    int i7 = g10.f24125p;
                    if (i7 != 0) {
                        tbVar3.f26999l = i7;
                    }
                    tbVar3.f26993e = str3;
                    fcVar2.f23890g.put(str3, tbVar3);
                    tbVar3.f27004q = new File(w7.z(4), p5.c.v(Utilities.a(g10.f24117g), "_temp.jpg"));
                    tbVar3.f27003p = file;
                    sb sbVar3 = new sb(fcVar2, tbVar3);
                    tbVar3.f27006s = sbVar3;
                    fcVar2.f23897o.add(sbVar3);
                    fcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24420c;
                fc fcVar3 = this.f24419b;
                tb tbVar4 = (tb) fcVar3.f23890g.get(str4);
                if (tbVar4 != null) {
                    ac acVar = tbVar4.f27007t;
                    if (acVar != null) {
                        ac acVar2 = new ac(fcVar3, acVar.f22895a, acVar.f22897c);
                        tbVar4.f27007t = acVar2;
                        fcVar3.f23896n.add(acVar2);
                    }
                    fcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
