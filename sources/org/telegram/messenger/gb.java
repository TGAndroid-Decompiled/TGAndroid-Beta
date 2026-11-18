package org.telegram.messenger;

import java.io.File;
public final class gb implements Runnable {
    public final int f24190a;
    public final ec f24191b;
    public final String f24192c;

    public gb(ec ecVar, String str, int i7) {
        this.f24190a = i7;
        this.f24191b = ecVar;
        this.f24192c = str;
    }

    @Override
    public final void run() {
        switch (this.f24190a) {
            case 0:
                String str = this.f24192c;
                ec ecVar = this.f24191b;
                sb sbVar = (sb) ecVar.f23684g.get(str);
                if (sbVar != null) {
                    rb rbVar = sbVar.f26780s;
                    if (rbVar != null) {
                        rb rbVar2 = new rb(ecVar, rbVar.f26565a);
                        sbVar.f26780s = rbVar2;
                        ecVar.f23691o.add(rbVar2);
                    }
                    ecVar.T(false);
                    return;
                }
                return;
            case 1:
                sb sbVar2 = (sb) this.f24191b.f23684g.get(this.f24192c);
                if (sbVar2 != null) {
                    sbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24191b.f23698w.remove(this.f24192c);
                return;
            case 3:
                String str2 = this.f24192c;
                String B = ec.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    fc g10 = fc.g(str2);
                    ec ecVar2 = this.f24191b;
                    sb sbVar3 = new sb(ecVar2);
                    sbVar3.f26774m = 1;
                    sbVar3.d = Utilities.a(str2);
                    sbVar3.f26768f = null;
                    sbVar3.f26770i = g10;
                    sbVar3.f26769g = B;
                    sbVar3.f26771j = null;
                    int i7 = g10.f23880p;
                    if (i7 != 0) {
                        sbVar3.f26773l = i7;
                    }
                    sbVar3.f26767e = str3;
                    ecVar2.f23684g.put(str3, sbVar3);
                    sbVar3.f26778q = new File(w7.z(4), p5.c.v(Utilities.a(g10.f23872g), "_temp.jpg"));
                    sbVar3.f26777p = file;
                    rb rbVar3 = new rb(ecVar2, sbVar3);
                    sbVar3.f26780s = rbVar3;
                    ecVar2.f23691o.add(rbVar3);
                    ecVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24192c;
                ec ecVar3 = this.f24191b;
                sb sbVar4 = (sb) ecVar3.f23684g.get(str4);
                if (sbVar4 != null) {
                    zb zbVar = sbVar4.f26781t;
                    if (zbVar != null) {
                        zb zbVar2 = new zb(ecVar3, zbVar.f28278a, zbVar.f28280c);
                        sbVar4.f26781t = zbVar2;
                        ecVar3.f23690n.add(zbVar2);
                    }
                    ecVar3.V(false);
                    return;
                }
                return;
        }
    }
}
