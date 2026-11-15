package org.telegram.messenger;

import java.io.File;
public final class hb implements Runnable {
    public final int f24075a;
    public final fc f24076b;
    public final String f24077c;

    public hb(fc fcVar, String str, int i7) {
        this.f24075a = i7;
        this.f24076b = fcVar;
        this.f24077c = str;
    }

    @Override
    public final void run() {
        switch (this.f24075a) {
            case 0:
                String str = this.f24077c;
                fc fcVar = this.f24076b;
                tb tbVar = (tb) fcVar.f23465g.get(str);
                if (tbVar != null) {
                    sb sbVar = tbVar.f26650s;
                    if (sbVar != null) {
                        sb sbVar2 = new sb(fcVar, sbVar.f26424a);
                        tbVar.f26650s = sbVar2;
                        fcVar.f23472o.add(sbVar2);
                    }
                    fcVar.T(false);
                    return;
                }
                return;
            case 1:
                tb tbVar2 = (tb) this.f24076b.f23465g.get(this.f24077c);
                if (tbVar2 != null) {
                    tbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24076b.f23479w.remove(this.f24077c);
                return;
            case 3:
                String str2 = this.f24077c;
                String B = fc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    gc g10 = gc.g(str2);
                    fc fcVar2 = this.f24076b;
                    tb tbVar3 = new tb(fcVar2);
                    tbVar3.f26644m = 1;
                    tbVar3.d = Utilities.a(str2);
                    tbVar3.f26638f = null;
                    tbVar3.f26640i = g10;
                    tbVar3.f26639g = B;
                    tbVar3.f26641j = null;
                    int i7 = g10.f23724p;
                    if (i7 != 0) {
                        tbVar3.f26643l = i7;
                    }
                    tbVar3.f26637e = str3;
                    fcVar2.f23465g.put(str3, tbVar3);
                    tbVar3.f26648q = new File(w7.z(4), r.b.v(Utilities.a(g10.f23716g), "_temp.jpg"));
                    tbVar3.f26647p = file;
                    sb sbVar3 = new sb(fcVar2, tbVar3);
                    tbVar3.f26650s = sbVar3;
                    fcVar2.f23472o.add(sbVar3);
                    fcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24077c;
                fc fcVar3 = this.f24076b;
                tb tbVar4 = (tb) fcVar3.f23465g.get(str4);
                if (tbVar4 != null) {
                    ac acVar = tbVar4.f26651t;
                    if (acVar != null) {
                        ac acVar2 = new ac(fcVar3, acVar.f22486a, acVar.f22488c);
                        tbVar4.f26651t = acVar2;
                        fcVar3.f23471n.add(acVar2);
                    }
                    fcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
