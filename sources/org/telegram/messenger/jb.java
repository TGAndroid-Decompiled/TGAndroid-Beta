package org.telegram.messenger;

import java.io.File;
public final class jb implements Runnable {
    public final int f16429a;
    public final ic f16430b;
    public final String f16431c;

    public jb(ic icVar, String str, int i10) {
        this.f16429a = i10;
        this.f16430b = icVar;
        this.f16431c = str;
    }

    @Override
    public final void run() {
        switch (this.f16429a) {
            case 0:
                String str = this.f16431c;
                ic icVar = this.f16430b;
                wb wbVar = (wb) icVar.f16250g.get(str);
                if (wbVar != null) {
                    vb vbVar = wbVar.f19024s;
                    if (vbVar != null) {
                        vb vbVar2 = new vb(icVar, vbVar.f18603a);
                        wbVar.f19024s = vbVar2;
                        icVar.f16257o.add(vbVar2);
                    }
                    icVar.T(false);
                    return;
                }
                return;
            case 1:
                wb wbVar2 = (wb) this.f16430b.f16250g.get(this.f16431c);
                if (wbVar2 != null) {
                    wbVar2.c(null, null);
                    return;
                }
                return;
            case 2:
                this.f16430b.f16264w.remove(this.f16431c);
                return;
            case 3:
                String str2 = this.f16431c;
                String B = ic.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(b8.z(4), str3);
                if (!file.exists()) {
                    jc g10 = jc.g(str2);
                    ic icVar2 = this.f16430b;
                    wb wbVar3 = new wb(icVar2);
                    wbVar3.f19018m = 1;
                    wbVar3.d = Utilities.a(str2);
                    wbVar3.f19012f = null;
                    wbVar3.f19014i = g10;
                    wbVar3.f19013g = B;
                    wbVar3.f19015j = null;
                    int i10 = g10.f16444p;
                    if (i10 != 0) {
                        wbVar3.f19017l = i10;
                    }
                    wbVar3.e = str3;
                    icVar2.f16250g.put(str3, wbVar3);
                    wbVar3.f19022q = new File(b8.z(4), sc.e.A(Utilities.a(g10.f16436g), "_temp.jpg"));
                    wbVar3.f19021p = file;
                    vb vbVar3 = new vb(icVar2, wbVar3);
                    wbVar3.f19024s = vbVar3;
                    icVar2.f16257o.add(vbVar3);
                    icVar2.T(false);
                    return;
                }
                return;
            default:
                String str4 = this.f16431c;
                ic icVar3 = this.f16430b;
                wb wbVar4 = (wb) icVar3.f16250g.get(str4);
                if (wbVar4 != null) {
                    dc dcVar = wbVar4.f19025t;
                    if (dcVar != null) {
                        dc dcVar2 = new dc(icVar3, dcVar.f15336a, dcVar.f15338c);
                        wbVar4.f19025t = dcVar2;
                        icVar3.f16256n.add(dcVar2);
                    }
                    icVar3.V(false);
                    return;
                }
                return;
        }
    }
}
