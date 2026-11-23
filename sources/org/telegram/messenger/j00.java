package org.telegram.messenger;

import java.util.ArrayList;
public final class j00 implements Runnable {
    public final int f24813a;
    public final a10 f24814b;
    public final long f24815c;

    public j00(a10 a10Var, long j3, int i7) {
        this.f24813a = i7;
        this.f24814b = a10Var;
        this.f24815c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f24813a;
        long j3 = this.f24815c;
        a10 a10Var = this.f24814b;
        switch (i7) {
            case 0:
                ls.f(a10Var.currentAccount).k(130, Long.valueOf(j3));
                return;
            default:
                ArrayList arrayList = (ArrayList) a10Var.f22846n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        if (gjVar != null && gjVar.f24213k != null) {
                            arrayList2.add(a10Var.getMessagesStorage().e0(gjVar.e1(), gj.B0(gjVar.f24213k)));
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
