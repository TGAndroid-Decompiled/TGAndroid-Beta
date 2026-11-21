package org.telegram.messenger;

import java.util.ArrayList;
public final class i00 implements Runnable {
    public final int f24561a;
    public final z00 f24562b;
    public final long f24563c;

    public i00(z00 z00Var, long j3, int i7) {
        this.f24561a = i7;
        this.f24562b = z00Var;
        this.f24563c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f24561a;
        long j3 = this.f24563c;
        z00 z00Var = this.f24562b;
        switch (i7) {
            case 0:
                ks.f(z00Var.currentAccount).k(130, Long.valueOf(j3));
                return;
            default:
                ArrayList arrayList = (ArrayList) z00Var.f28270n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        fj fjVar = (fj) arrayList.get(i10);
                        if (fjVar != null && fjVar.f23993k != null) {
                            arrayList2.add(z00Var.getMessagesStorage().e0(fjVar.e1(), fj.B0(fjVar.f23993k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    g0.g3(new yf(z00Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
