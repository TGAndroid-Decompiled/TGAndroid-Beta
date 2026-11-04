package org.telegram.messenger;

import java.io.File;
public final class bb implements Runnable {
    public final int f21758a;
    public final zb f21759b;
    public final String f21760c;

    public bb(zb zbVar, String str, int i3) {
        this.f21758a = i3;
        this.f21759b = zbVar;
        this.f21760c = str;
    }

    @Override
    public final void run() {
        switch (this.f21758a) {
            case 0:
                String str = this.f21760c;
                zb zbVar = this.f21759b;
                nb nbVar = (nb) zbVar.f26762g.get(str);
                if (nbVar != null) {
                    mb mbVar = nbVar.f24356s;
                    if (mbVar != null) {
                        mb mbVar2 = new mb(zbVar, mbVar.f24183a);
                        nbVar.f24356s = mbVar2;
                        zbVar.f26769o.add(mbVar2);
                    }
                    zbVar.T(false);
                    return;
                }
                return;
            case 1:
                nb nbVar2 = (nb) this.f21759b.f26762g.get(this.f21760c);
                if (nbVar2 != null) {
                    nbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f21759b.f26776w.remove(this.f21760c);
                return;
            case 3:
                String str2 = this.f21760c;
                String B = zb.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    ac g7 = ac.g(str2);
                    zb zbVar2 = this.f21759b;
                    nb nbVar3 = new nb(zbVar2);
                    nbVar3.f24350m = 1;
                    nbVar3.d = Utilities.a(str2);
                    nbVar3.f24344f = null;
                    nbVar3.f24346i = g7;
                    nbVar3.f24345g = B;
                    nbVar3.f24347j = null;
                    int i3 = g7.f21497p;
                    if (i3 != 0) {
                        nbVar3.f24349l = i3;
                    }
                    nbVar3.f24343e = str3;
                    zbVar2.f26762g.put(str3, nbVar3);
                    nbVar3.f24354q = new File(w7.z(4), t4.c.q(Utilities.a(g7.f21489g), "_temp.jpg"));
                    nbVar3.f24353p = file;
                    mb mbVar3 = new mb(zbVar2, nbVar3);
                    nbVar3.f24356s = mbVar3;
                    zbVar2.f26769o.add(mbVar3);
                    zbVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f21760c;
                zb zbVar3 = this.f21759b;
                nb nbVar4 = (nb) zbVar3.f26762g.get(str4);
                if (nbVar4 != null) {
                    ub ubVar = nbVar4.f24357t;
                    if (ubVar != null) {
                        ub ubVar2 = new ub(zbVar3, ubVar.f25667a, ubVar.f25669c);
                        nbVar4.f24357t = ubVar2;
                        zbVar3.f26768n.add(ubVar2);
                    }
                    zbVar3.V(false);
                    return;
                }
                return;
        }
    }
}
