package defpackage;

import java.util.ArrayList;
public final class ok5 implements Runnable {
    public final byte a = 0;
    public final String b;
    public final int c;
    public final boolean d;

    public ok5(int i, String str, boolean z) {
        this.c = i;
        this.b = str;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        int i = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                kk7.f(i).k(139, str, Boolean.valueOf(z));
                return;
            default:
                svc svcVar = (svc) vvc.a.get(str);
                if (svcVar != null && svcVar.t != null) {
                    if (vvc.g.contains(svcVar)) {
                        svcVar.K = i;
                        svcVar.t.l(i);
                        return;
                    }
                    svcVar.K = i;
                    svcVar.L = z;
                    ArrayList arrayList = vvc.f;
                    arrayList.remove(svcVar);
                    arrayList.add(svcVar);
                    vvc.o();
                    return;
                }
                return;
        }
    }

    public ok5(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }
}
