package org.telegram.messenger;

import java.io.File;
public final class gb implements Runnable {
    public final int f24288a;
    public final ec f24289b;
    public final String f24290c;

    public gb(ec ecVar, String str, int i7) {
        this.f24288a = i7;
        this.f24289b = ecVar;
        this.f24290c = str;
    }

    @Override
    public final void run() {
        switch (this.f24288a) {
            case 0:
                String str = this.f24290c;
                ec ecVar = this.f24289b;
                sb sbVar = (sb) ecVar.f23786g.get(str);
                if (sbVar != null) {
                    rb rbVar = sbVar.f26879s;
                    if (rbVar != null) {
                        rb rbVar2 = new rb(ecVar, rbVar.f26664a);
                        sbVar.f26879s = rbVar2;
                        ecVar.f23793o.add(rbVar2);
                    }
                    ecVar.T(false);
                    return;
                }
                return;
            case 1:
                sb sbVar2 = (sb) this.f24289b.f23786g.get(this.f24290c);
                if (sbVar2 != null) {
                    sbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f24289b.f23800w.remove(this.f24290c);
                return;
            case 3:
                String str2 = this.f24290c;
                String B = ec.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    fc g10 = fc.g(str2);
                    ec ecVar2 = this.f24289b;
                    sb sbVar3 = new sb(ecVar2);
                    sbVar3.f26873m = 1;
                    sbVar3.d = Utilities.a(str2);
                    sbVar3.f26867f = null;
                    sbVar3.f26869i = g10;
                    sbVar3.f26868g = B;
                    sbVar3.f26870j = null;
                    int i7 = g10.f23985p;
                    if (i7 != 0) {
                        sbVar3.f26872l = i7;
                    }
                    sbVar3.f26866e = str3;
                    ecVar2.f23786g.put(str3, sbVar3);
                    sbVar3.f26877q = new File(w7.z(4), p5.c.v(Utilities.a(g10.f23977g), "_temp.jpg"));
                    sbVar3.f26876p = file;
                    rb rbVar3 = new rb(ecVar2, sbVar3);
                    sbVar3.f26879s = rbVar3;
                    ecVar2.f23793o.add(rbVar3);
                    ecVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f24290c;
                ec ecVar3 = this.f24289b;
                sb sbVar4 = (sb) ecVar3.f23786g.get(str4);
                if (sbVar4 != null) {
                    zb zbVar = sbVar4.f26880t;
                    if (zbVar != null) {
                        zb zbVar2 = new zb(ecVar3, zbVar.f28368a, zbVar.f28370c);
                        sbVar4.f26880t = zbVar2;
                        ecVar3.f23792n.add(zbVar2);
                    }
                    ecVar3.V(false);
                    return;
                }
                return;
        }
    }
}
