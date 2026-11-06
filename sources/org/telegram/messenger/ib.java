package org.telegram.messenger;

import java.io.File;
public final class ib implements Runnable {
    public final int f23141a;
    public final gc f23142b;
    public final String f23143c;

    public ib(gc gcVar, String str, int i7) {
        this.f23141a = i7;
        this.f23142b = gcVar;
        this.f23143c = str;
    }

    @Override
    public final void run() {
        switch (this.f23141a) {
            case 0:
                String str = this.f23143c;
                gc gcVar = this.f23142b;
                ub ubVar = (ub) gcVar.f22621g.get(str);
                if (ubVar != null) {
                    tb tbVar = ubVar.f25757s;
                    if (tbVar != null) {
                        tb tbVar2 = new tb(gcVar, tbVar.f25601a);
                        ubVar.f25757s = tbVar2;
                        gcVar.f22628o.add(tbVar2);
                    }
                    gcVar.T(false);
                    return;
                }
                return;
            case 1:
                ub ubVar2 = (ub) this.f23142b.f22621g.get(this.f23143c);
                if (ubVar2 != null) {
                    ubVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f23142b.f22635w.remove(this.f23143c);
                return;
            case 3:
                String str2 = this.f23143c;
                String B = gc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    hc g10 = hc.g(str2);
                    gc gcVar2 = this.f23142b;
                    ub ubVar3 = new ub(gcVar2);
                    ubVar3.f25751m = 1;
                    ubVar3.d = Utilities.a(str2);
                    ubVar3.f25745f = null;
                    ubVar3.f25747i = g10;
                    ubVar3.f25746g = B;
                    ubVar3.f25748j = null;
                    int i7 = g10.f22872p;
                    if (i7 != 0) {
                        ubVar3.f25750l = i7;
                    }
                    ubVar3.f25744e = str3;
                    gcVar2.f22621g.put(str3, ubVar3);
                    ubVar3.f25755q = new File(w7.z(4), rf.b.q(Utilities.a(g10.f22864g), "_temp.jpg"));
                    ubVar3.f25754p = file;
                    tb tbVar3 = new tb(gcVar2, ubVar3);
                    ubVar3.f25757s = tbVar3;
                    gcVar2.f22628o.add(tbVar3);
                    gcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f23143c;
                gc gcVar3 = this.f23142b;
                ub ubVar4 = (ub) gcVar3.f22621g.get(str4);
                if (ubVar4 != null) {
                    bc bcVar = ubVar4.f25758t;
                    if (bcVar != null) {
                        bc bcVar2 = new bc(gcVar3, bcVar.f21608a, bcVar.f21610c);
                        ubVar4.f25758t = bcVar2;
                        gcVar3.f22627n.add(bcVar2);
                    }
                    gcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
