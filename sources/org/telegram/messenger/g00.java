package org.telegram.messenger;

import java.util.ArrayList;
public final class g00 implements Runnable {
    public final int f22617a;
    public final x00 f22618b;
    public final long f22619c;

    public g00(x00 x00Var, long j10, int i3) {
        this.f22617a = i3;
        this.f22618b = x00Var;
        this.f22619c = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f22617a;
        long j10 = this.f22619c;
        x00 x00Var = this.f22618b;
        switch (i3) {
            case 0:
                hs.f(x00Var.currentAccount).k(130, Long.valueOf(j10));
                return;
            default:
                ArrayList arrayList = (ArrayList) x00Var.f26327n.S.f(j10);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        zi ziVar = (zi) arrayList.get(i10);
                        if (ziVar != null && ziVar.f26868k != null) {
                            arrayList2.add(x00Var.getMessagesStorage().e0(ziVar.f1(), zi.B0(ziVar.f26868k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    g0.h3(new fg(x00Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
