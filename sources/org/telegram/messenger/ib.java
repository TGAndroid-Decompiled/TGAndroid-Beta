package org.telegram.messenger;

import java.io.File;
public final class ib implements Runnable {
    public final int f23135a;
    public final gc f23136b;
    public final String f23137c;

    public ib(gc gcVar, String str, int i7) {
        this.f23135a = i7;
        this.f23136b = gcVar;
        this.f23137c = str;
    }

    @Override
    public final void run() {
        switch (this.f23135a) {
            case 0:
                String str = this.f23137c;
                gc gcVar = this.f23136b;
                ub ubVar = (ub) gcVar.f22644g.get(str);
                if (ubVar != null) {
                    tb tbVar = ubVar.f25767s;
                    if (tbVar != null) {
                        tb tbVar2 = new tb(gcVar, tbVar.f25607a);
                        ubVar.f25767s = tbVar2;
                        gcVar.f22651o.add(tbVar2);
                    }
                    gcVar.T(false);
                    return;
                }
                return;
            case 1:
                ub ubVar2 = (ub) this.f23136b.f22644g.get(this.f23137c);
                if (ubVar2 != null) {
                    ubVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f23136b.f22658w.remove(this.f23137c);
                return;
            case 3:
                String str2 = this.f23137c;
                String B = gc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    hc g10 = hc.g(str2);
                    gc gcVar2 = this.f23136b;
                    ub ubVar3 = new ub(gcVar2);
                    ubVar3.f25761m = 1;
                    ubVar3.d = Utilities.a(str2);
                    ubVar3.f25755f = null;
                    ubVar3.f25757i = g10;
                    ubVar3.f25756g = B;
                    ubVar3.f25758j = null;
                    int i7 = g10.f22882p;
                    if (i7 != 0) {
                        ubVar3.f25760l = i7;
                    }
                    ubVar3.f25754e = str3;
                    gcVar2.f22644g.put(str3, ubVar3);
                    ubVar3.f25765q = new File(w7.z(4), rf.b.r(Utilities.a(g10.f22874g), "_temp.jpg"));
                    ubVar3.f25764p = file;
                    tb tbVar3 = new tb(gcVar2, ubVar3);
                    ubVar3.f25767s = tbVar3;
                    gcVar2.f22651o.add(tbVar3);
                    gcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f23137c;
                gc gcVar3 = this.f23136b;
                ub ubVar4 = (ub) gcVar3.f22644g.get(str4);
                if (ubVar4 != null) {
                    bc bcVar = ubVar4.f25768t;
                    if (bcVar != null) {
                        bc bcVar2 = new bc(gcVar3, bcVar.f21640a, bcVar.f21642c);
                        ubVar4.f25768t = bcVar2;
                        gcVar3.f22650n.add(bcVar2);
                    }
                    gcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
