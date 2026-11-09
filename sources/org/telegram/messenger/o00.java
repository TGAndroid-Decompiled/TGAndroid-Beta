package org.telegram.messenger;

import java.util.ArrayList;
public final class o00 implements Runnable {
    public final int f24267a;
    public final f10 f24268b;
    public final long f24269c;

    public o00(f10 f10Var, long j3, int i7) {
        this.f24267a = i7;
        this.f24268b = f10Var;
        this.f24269c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f24267a;
        long j3 = this.f24269c;
        f10 f10Var = this.f24268b;
        switch (i7) {
            case 0:
                qs.f(f10Var.currentAccount).k(130, Long.valueOf(j3));
                return;
            default:
                ArrayList arrayList = (ArrayList) f10Var.f22347n.R.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ij ijVar = (ij) arrayList.get(i10);
                        if (ijVar != null && ijVar.f23262k != null) {
                            arrayList2.add(f10Var.getMessagesStorage().e0(ijVar.e1(), ij.B0(ijVar.f23262k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    g0.h3(new ng(f10Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
