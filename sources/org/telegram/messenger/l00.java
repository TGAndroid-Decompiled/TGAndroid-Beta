package org.telegram.messenger;

import java.util.ArrayList;
public final class l00 implements Runnable {
    public final int f24792a;
    public final c10 f24793b;
    public final long f24794c;

    public l00(c10 c10Var, long j3, int i7) {
        this.f24792a = i7;
        this.f24793b = c10Var;
        this.f24794c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f24792a;
        long j3 = this.f24794c;
        c10 c10Var = this.f24793b;
        switch (i7) {
            case 0:
                ns.f(c10Var.currentAccount).k(130, Long.valueOf(j3));
                return;
            default:
                ArrayList arrayList = (ArrayList) c10Var.f22791n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        if (gjVar != null && gjVar.f23819k != null) {
                            arrayList2.add(c10Var.getMessagesStorage().e0(gjVar.e1(), gj.B0(gjVar.f23819k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    g0.h3(new mg(c10Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
