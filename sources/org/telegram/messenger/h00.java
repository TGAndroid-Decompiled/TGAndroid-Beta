package org.telegram.messenger;

import java.util.ArrayList;
public final class h00 implements Runnable {
    public final int f24440a;
    public final y00 f24441b;
    public final long f24442c;

    public h00(y00 y00Var, long j3, int i7) {
        this.f24440a = i7;
        this.f24441b = y00Var;
        this.f24442c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f24440a;
        long j3 = this.f24442c;
        y00 y00Var = this.f24441b;
        switch (i7) {
            case 0:
                ks.f(y00Var.currentAccount).k(130, Long.valueOf(j3));
                return;
            default:
                ArrayList arrayList = (ArrayList) y00Var.f28185n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        fj fjVar = (fj) arrayList.get(i10);
                        if (fjVar != null && fjVar.f24073k != null) {
                            arrayList2.add(y00Var.getMessagesStorage().e0(fjVar.e1(), fj.B0(fjVar.f24073k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    g0.g3(new yf(y00Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
