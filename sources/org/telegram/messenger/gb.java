package org.telegram.messenger;

import java.io.File;
public final class gb implements Runnable {
    public final int f24187a;
    public final ec f24188b;
    public final String f24189c;

    public gb(ec ecVar, String str, int i7) {
        this.f24187a = i7;
        this.f24188b = ecVar;
        this.f24189c = str;
    }

    @Override
    public final void run() {
        switch (this.f24187a) {
            case 0:
                String str = this.f24189c;
                ec ecVar = this.f24188b;
                sb sbVar = (sb) ecVar.f23681g.get(str);
                if (sbVar != null) {
                    rb rbVar = sbVar.f26778s;
                    if (rbVar != null) {
                        rb rbVar2 = new rb(ecVar, rbVar.f26563a);
                        sbVar.f26778s = rbVar2;
                        ecVar.f23688o.add(rbVar2);
                    }
                    ecVar.T(false);
                    return;
                }
                return;
            case 1:
                sb sbVar2 = (sb) this.f24188b.f23681g.get(this.f24189c);
                if (sbVar2 != null) {
                    sbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24188b.f23695w.remove(this.f24189c);
                return;
            case 3:
                String str2 = this.f24189c;
                String B = ec.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    fc g10 = fc.g(str2);
                    ec ecVar2 = this.f24188b;
                    sb sbVar3 = new sb(ecVar2);
                    sbVar3.f26772m = 1;
                    sbVar3.d = Utilities.a(str2);
                    sbVar3.f26766f = null;
                    sbVar3.f26768i = g10;
                    sbVar3.f26767g = B;
                    sbVar3.f26769j = null;
                    int i7 = g10.f23877p;
                    if (i7 != 0) {
                        sbVar3.f26771l = i7;
                    }
                    sbVar3.f26765e = str3;
                    ecVar2.f23681g.put(str3, sbVar3);
                    sbVar3.f26776q = new File(w7.z(4), p5.c.v(Utilities.a(g10.f23869g), "_temp.jpg"));
                    sbVar3.f26775p = file;
                    rb rbVar3 = new rb(ecVar2, sbVar3);
                    sbVar3.f26778s = rbVar3;
                    ecVar2.f23688o.add(rbVar3);
                    ecVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24189c;
                ec ecVar3 = this.f24188b;
                sb sbVar4 = (sb) ecVar3.f23681g.get(str4);
                if (sbVar4 != null) {
                    zb zbVar = sbVar4.f26779t;
                    if (zbVar != null) {
                        zb zbVar2 = new zb(ecVar3, zbVar.f28276a, zbVar.f28278c);
                        sbVar4.f26779t = zbVar2;
                        ecVar3.f23687n.add(zbVar2);
                    }
                    ecVar3.V(false);
                    return;
                }
                return;
        }
    }
}
