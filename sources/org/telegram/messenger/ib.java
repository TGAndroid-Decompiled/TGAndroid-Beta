package org.telegram.messenger;

import java.io.File;
public final class ib implements Runnable {
    public final int f23131a;
    public final gc f23132b;
    public final String f23133c;

    public ib(gc gcVar, String str, int i7) {
        this.f23131a = i7;
        this.f23132b = gcVar;
        this.f23133c = str;
    }

    @Override
    public final void run() {
        switch (this.f23131a) {
            case 0:
                String str = this.f23133c;
                gc gcVar = this.f23132b;
                ub ubVar = (ub) gcVar.f22640g.get(str);
                if (ubVar != null) {
                    tb tbVar = ubVar.f25763s;
                    if (tbVar != null) {
                        tb tbVar2 = new tb(gcVar, tbVar.f25603a);
                        ubVar.f25763s = tbVar2;
                        gcVar.f22647o.add(tbVar2);
                    }
                    gcVar.T(false);
                    return;
                }
                return;
            case 1:
                ub ubVar2 = (ub) this.f23132b.f22640g.get(this.f23133c);
                if (ubVar2 != null) {
                    ubVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f23132b.f22654w.remove(this.f23133c);
                return;
            case 3:
                String str2 = this.f23133c;
                String B = gc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    hc g10 = hc.g(str2);
                    gc gcVar2 = this.f23132b;
                    ub ubVar3 = new ub(gcVar2);
                    ubVar3.f25757m = 1;
                    ubVar3.d = Utilities.a(str2);
                    ubVar3.f25751f = null;
                    ubVar3.f25753i = g10;
                    ubVar3.f25752g = B;
                    ubVar3.f25754j = null;
                    int i7 = g10.f22878p;
                    if (i7 != 0) {
                        ubVar3.f25756l = i7;
                    }
                    ubVar3.f25750e = str3;
                    gcVar2.f22640g.put(str3, ubVar3);
                    ubVar3.f25761q = new File(w7.z(4), rf.b.r(Utilities.a(g10.f22870g), "_temp.jpg"));
                    ubVar3.f25760p = file;
                    tb tbVar3 = new tb(gcVar2, ubVar3);
                    ubVar3.f25763s = tbVar3;
                    gcVar2.f22647o.add(tbVar3);
                    gcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f23133c;
                gc gcVar3 = this.f23132b;
                ub ubVar4 = (ub) gcVar3.f22640g.get(str4);
                if (ubVar4 != null) {
                    bc bcVar = ubVar4.f25764t;
                    if (bcVar != null) {
                        bc bcVar2 = new bc(gcVar3, bcVar.f21635a, bcVar.f21637c);
                        ubVar4.f25764t = bcVar2;
                        gcVar3.f22646n.add(bcVar2);
                    }
                    gcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
