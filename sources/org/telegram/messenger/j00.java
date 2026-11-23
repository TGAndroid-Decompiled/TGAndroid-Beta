package org.telegram.messenger;

import java.util.ArrayList;
public final class j00 implements Runnable {
    public final int f24777a;
    public final a10 f24778b;
    public final long f24779c;

    public j00(a10 a10Var, long j3, int i7) {
        this.f24777a = i7;
        this.f24778b = a10Var;
        this.f24779c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f24777a;
        long j3 = this.f24779c;
        a10 a10Var = this.f24778b;
        switch (i7) {
            case 0:
                ls.f(a10Var.currentAccount).k(130, Long.valueOf(j3));
                return;
            default:
                ArrayList arrayList = (ArrayList) a10Var.f22810n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        if (gjVar != null && gjVar.f24177k != null) {
                            arrayList2.add(a10Var.getMessagesStorage().e0(gjVar.e1(), gj.B0(gjVar.f24177k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    g0.g3(new zf(a10Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
