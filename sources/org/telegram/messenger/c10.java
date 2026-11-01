package org.telegram.messenger;

import java.util.ArrayList;
public final class c10 implements Runnable {
    public final int f15049a;
    public final u10 f15050b;
    public final long f15051c;

    public c10(u10 u10Var, long j10, int i10) {
        this.f15049a = i10;
        this.f15050b = u10Var;
        this.f15051c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f15049a;
        long j10 = this.f15051c;
        u10 u10Var = this.f15050b;
        switch (i10) {
            case 0:
                at.f(u10Var.currentAccount).k(130, Long.valueOf(j10));
                return;
            default:
                ArrayList arrayList = (ArrayList) u10Var.f18353n.R.f(j10);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        kj kjVar = (kj) arrayList.get(i11);
                        if (kjVar != null && kjVar.f16690k != null) {
                            arrayList2.add(u10Var.getMessagesStorage().e0(kjVar.f1(), kj.B0(kjVar.f16690k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    i0.g3(new ng(u10Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
