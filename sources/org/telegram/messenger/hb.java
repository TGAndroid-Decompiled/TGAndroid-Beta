package org.telegram.messenger;

import java.io.File;
public final class hb implements Runnable {
    public final int f24078a;
    public final fc f24079b;
    public final String f24080c;

    public hb(fc fcVar, String str, int i7) {
        this.f24078a = i7;
        this.f24079b = fcVar;
        this.f24080c = str;
    }

    @Override
    public final void run() {
        switch (this.f24078a) {
            case 0:
                String str = this.f24080c;
                fc fcVar = this.f24079b;
                tb tbVar = (tb) fcVar.f23468g.get(str);
                if (tbVar != null) {
                    sb sbVar = tbVar.f26659s;
                    if (sbVar != null) {
                        sb sbVar2 = new sb(fcVar, sbVar.f26434a);
                        tbVar.f26659s = sbVar2;
                        fcVar.f23475o.add(sbVar2);
                    }
                    fcVar.T(false);
                    return;
                }
                return;
            case 1:
                tb tbVar2 = (tb) this.f24079b.f23468g.get(this.f24080c);
                if (tbVar2 != null) {
                    tbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24079b.f23482w.remove(this.f24080c);
                return;
            case 3:
                String str2 = this.f24080c;
                String B = fc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    gc g10 = gc.g(str2);
                    fc fcVar2 = this.f24079b;
                    tb tbVar3 = new tb(fcVar2);
                    tbVar3.f26653m = 1;
                    tbVar3.d = Utilities.a(str2);
                    tbVar3.f26647f = null;
                    tbVar3.f26649i = g10;
                    tbVar3.f26648g = B;
                    tbVar3.f26650j = null;
                    int i7 = g10.f23726p;
                    if (i7 != 0) {
                        tbVar3.f26652l = i7;
                    }
                    tbVar3.f26646e = str3;
                    fcVar2.f23468g.put(str3, tbVar3);
                    tbVar3.f26657q = new File(w7.z(4), r.b.v(Utilities.a(g10.f23718g), "_temp.jpg"));
                    tbVar3.f26656p = file;
                    sb sbVar3 = new sb(fcVar2, tbVar3);
                    tbVar3.f26659s = sbVar3;
                    fcVar2.f23475o.add(sbVar3);
                    fcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24080c;
                fc fcVar3 = this.f24079b;
                tb tbVar4 = (tb) fcVar3.f23468g.get(str4);
                if (tbVar4 != null) {
                    ac acVar = tbVar4.f26660t;
                    if (acVar != null) {
                        ac acVar2 = new ac(fcVar3, acVar.f22486a, acVar.f22488c);
                        tbVar4.f26660t = acVar2;
                        fcVar3.f23474n.add(acVar2);
                    }
                    fcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
