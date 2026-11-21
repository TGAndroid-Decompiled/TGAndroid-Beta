package org.telegram.messenger;

import java.io.File;
public final class gb implements Runnable {
    public final int f24215a;
    public final ec f24216b;
    public final String f24217c;

    public gb(ec ecVar, String str, int i7) {
        this.f24215a = i7;
        this.f24216b = ecVar;
        this.f24217c = str;
    }

    @Override
    public final void run() {
        switch (this.f24215a) {
            case 0:
                String str = this.f24217c;
                ec ecVar = this.f24216b;
                sb sbVar = (sb) ecVar.f23709g.get(str);
                if (sbVar != null) {
                    rb rbVar = sbVar.f26806s;
                    if (rbVar != null) {
                        rb rbVar2 = new rb(ecVar, rbVar.f26591a);
                        sbVar.f26806s = rbVar2;
                        ecVar.f23716o.add(rbVar2);
                    }
                    ecVar.T(false);
                    return;
                }
                return;
            case 1:
                sb sbVar2 = (sb) this.f24216b.f23709g.get(this.f24217c);
                if (sbVar2 != null) {
                    sbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24216b.f23723w.remove(this.f24217c);
                return;
            case 3:
                String str2 = this.f24217c;
                String B = ec.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    fc g10 = fc.g(str2);
                    ec ecVar2 = this.f24216b;
                    sb sbVar3 = new sb(ecVar2);
                    sbVar3.f26800m = 1;
                    sbVar3.d = Utilities.a(str2);
                    sbVar3.f26794f = null;
                    sbVar3.f26796i = g10;
                    sbVar3.f26795g = B;
                    sbVar3.f26797j = null;
                    int i7 = g10.f23905p;
                    if (i7 != 0) {
                        sbVar3.f26799l = i7;
                    }
                    sbVar3.f26793e = str3;
                    ecVar2.f23709g.put(str3, sbVar3);
                    sbVar3.f26804q = new File(w7.z(4), p5.c.v(Utilities.a(g10.f23897g), "_temp.jpg"));
                    sbVar3.f26803p = file;
                    rb rbVar3 = new rb(ecVar2, sbVar3);
                    sbVar3.f26806s = rbVar3;
                    ecVar2.f23716o.add(rbVar3);
                    ecVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24217c;
                ec ecVar3 = this.f24216b;
                sb sbVar4 = (sb) ecVar3.f23709g.get(str4);
                if (sbVar4 != null) {
                    zb zbVar = sbVar4.f26807t;
                    if (zbVar != null) {
                        zb zbVar2 = new zb(ecVar3, zbVar.f28304a, zbVar.f28306c);
                        sbVar4.f26807t = zbVar2;
                        ecVar3.f23715n.add(zbVar2);
                    }
                    ecVar3.V(false);
                    return;
                }
                return;
        }
    }
}
