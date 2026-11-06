package org.telegram.messenger;

import java.io.File;
public final class ib implements Runnable {
    public final int f23134a;
    public final gc f23135b;
    public final String f23136c;

    public ib(gc gcVar, String str, int i7) {
        this.f23134a = i7;
        this.f23135b = gcVar;
        this.f23136c = str;
    }

    @Override
    public final void run() {
        switch (this.f23134a) {
            case 0:
                String str = this.f23136c;
                gc gcVar = this.f23135b;
                ub ubVar = (ub) gcVar.f22614g.get(str);
                if (ubVar != null) {
                    tb tbVar = ubVar.f25749s;
                    if (tbVar != null) {
                        tb tbVar2 = new tb(gcVar, tbVar.f25593a);
                        ubVar.f25749s = tbVar2;
                        gcVar.f22621o.add(tbVar2);
                    }
                    gcVar.T(false);
                    return;
                }
                return;
            case 1:
                ub ubVar2 = (ub) this.f23135b.f22614g.get(this.f23136c);
                if (ubVar2 != null) {
                    ubVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f23135b.f22628w.remove(this.f23136c);
                return;
            case 3:
                String str2 = this.f23136c;
                String B = gc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    hc g10 = hc.g(str2);
                    gc gcVar2 = this.f23135b;
                    ub ubVar3 = new ub(gcVar2);
                    ubVar3.f25743m = 1;
                    ubVar3.d = Utilities.a(str2);
                    ubVar3.f25737f = null;
                    ubVar3.f25739i = g10;
                    ubVar3.f25738g = B;
                    ubVar3.f25740j = null;
                    int i7 = g10.f22865p;
                    if (i7 != 0) {
                        ubVar3.f25742l = i7;
                    }
                    ubVar3.f25736e = str3;
                    gcVar2.f22614g.put(str3, ubVar3);
                    ubVar3.f25747q = new File(w7.z(4), rf.b.q(Utilities.a(g10.f22857g), "_temp.jpg"));
                    ubVar3.f25746p = file;
                    tb tbVar3 = new tb(gcVar2, ubVar3);
                    ubVar3.f25749s = tbVar3;
                    gcVar2.f22621o.add(tbVar3);
                    gcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f23136c;
                gc gcVar3 = this.f23135b;
                ub ubVar4 = (ub) gcVar3.f22614g.get(str4);
                if (ubVar4 != null) {
                    bc bcVar = ubVar4.f25750t;
                    if (bcVar != null) {
                        bc bcVar2 = new bc(gcVar3, bcVar.f21607a, bcVar.f21609c);
                        ubVar4.f25750t = bcVar2;
                        gcVar3.f22620n.add(bcVar2);
                    }
                    gcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
