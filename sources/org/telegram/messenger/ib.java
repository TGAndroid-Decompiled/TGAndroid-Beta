package org.telegram.messenger;

import java.io.File;
public final class ib implements Runnable {
    public final int f16094a;
    public final hc f16095b;
    public final String f16096c;

    public ib(hc hcVar, String str, int i10) {
        this.f16094a = i10;
        this.f16095b = hcVar;
        this.f16096c = str;
    }

    @Override
    public final void run() {
        switch (this.f16094a) {
            case 0:
                String str = this.f16096c;
                hc hcVar = this.f16095b;
                vb vbVar = (vb) hcVar.f15857g.get(str);
                if (vbVar != null) {
                    ub ubVar = vbVar.f18502s;
                    if (ubVar != null) {
                        ub ubVar2 = new ub(hcVar, ubVar.f18274a);
                        vbVar.f18502s = ubVar2;
                        hcVar.f15864o.add(ubVar2);
                    }
                    hcVar.T(false);
                    return;
                }
                return;
            case 1:
                vb vbVar2 = (vb) this.f16095b.f15857g.get(this.f16096c);
                if (vbVar2 != null) {
                    vbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f16095b.f15871w.remove(this.f16096c);
                return;
            case 3:
                String str2 = this.f16096c;
                String B = hc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(b8.z(4), str3);
                if (!file.exists()) {
                    ic g10 = ic.g(str2);
                    hc hcVar2 = this.f16095b;
                    vb vbVar3 = new vb(hcVar2);
                    vbVar3.f18496m = 1;
                    vbVar3.d = Utilities.a(str2);
                    vbVar3.f18490f = null;
                    vbVar3.f18492i = g10;
                    vbVar3.f18491g = B;
                    vbVar3.f18493j = null;
                    int i10 = g10.f16109p;
                    if (i10 != 0) {
                        vbVar3.f18495l = i10;
                    }
                    vbVar3.e = str3;
                    hcVar2.f15857g.put(str3, vbVar3);
                    vbVar3.f18500q = new File(b8.z(4), sc.e.A(Utilities.a(g10.f16101g), "_temp.jpg"));
                    vbVar3.f18499p = file;
                    ub ubVar3 = new ub(hcVar2, vbVar3);
                    vbVar3.f18502s = ubVar3;
                    hcVar2.f15864o.add(ubVar3);
                    hcVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f16096c;
                hc hcVar3 = this.f16095b;
                vb vbVar4 = (vb) hcVar3.f15857g.get(str4);
                if (vbVar4 != null) {
                    cc ccVar = vbVar4.f18503t;
                    if (ccVar != null) {
                        cc ccVar2 = new cc(hcVar3, ccVar.f14974a, ccVar.f14976c);
                        vbVar4.f18503t = ccVar2;
                        hcVar3.f15863n.add(ccVar2);
                    }
                    hcVar3.V(false);
                    return;
                }
                return;
        }
    }
}
