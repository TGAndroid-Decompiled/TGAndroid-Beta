package org.telegram.messenger;

import java.io.File;
public final class hb implements Runnable {
    public final int f24382a;
    public final fc f24383b;
    public final String f24384c;

    public hb(fc fcVar, String str, int i7) {
        this.f24382a = i7;
        this.f24383b = fcVar;
        this.f24384c = str;
    }

    @Override
    public final void run() {
        switch (this.f24382a) {
            case 0:
                String str = this.f24384c;
                fc fcVar = this.f24383b;
                tb tbVar = (tb) fcVar.f23854g.get(str);
                if (tbVar != null) {
                    sb sbVar = tbVar.f26970s;
                    if (sbVar != null) {
                        sb sbVar2 = new sb(fcVar, sbVar.f26741a);
                        tbVar.f26970s = sbVar2;
                        fcVar.f23861o.add(sbVar2);
                    }
                    fcVar.T(false);
                    return;
                }
                return;
            case 1:
                tb tbVar2 = (tb) this.f24383b.f23854g.get(this.f24384c);
                if (tbVar2 != null) {
                    tbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24383b.f23868w.remove(this.f24384c);
                return;
            case 3:
                String str2 = this.f24384c;
                String B = fc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    gc g10 = gc.g(str2);
                    fc fcVar2 = this.f24383b;
                    tb tbVar3 = new tb(fcVar2);
                    tbVar3.f26964m = 1;
                    tbVar3.d = Utilities.a(str2);
                    tbVar3.f26958f = null;
                    tbVar3.f26960i = g10;
                    tbVar3.f26959g = B;
                    tbVar3.f26961j = null;
                    int i7 = g10.f24089p;
                    if (i7 != 0) {
                        tbVar3.f26963l = i7;
                    }
                    tbVar3.f26957e = str3;
                    fcVar2.f23854g.put(str3, tbVar3);
                    tbVar3.f26968q = new File(w7.z(4), p5.c.v(Utilities.a(g10.f24081g), "_temp.jpg"));
                    tbVar3.f26967p = file;
                    sb sbVar3 = new sb(fcVar2, tbVar3);
                    tbVar3.f26970s = sbVar3;
                    fcVar2.f23861o.add(sbVar3);
                    fcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24384c;
                fc fcVar3 = this.f24383b;
                tb tbVar4 = (tb) fcVar3.f23854g.get(str4);
                if (tbVar4 != null) {
                    ac acVar = tbVar4.f26971t;
                    if (acVar != null) {
                        ac acVar2 = new ac(fcVar3, acVar.f22859a, acVar.f22861c);
                        tbVar4.f26971t = acVar2;
                        fcVar3.f23860n.add(acVar2);
                    }
                    fcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
