package org.telegram.messenger;

import java.util.ArrayList;
public final class b10 implements Runnable {
    public final int f14702a;
    public final t10 f14703b;
    public final long f14704c;

    public b10(t10 t10Var, long j10, int i10) {
        this.f14702a = i10;
        this.f14703b = t10Var;
        this.f14704c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f14702a;
        long j10 = this.f14704c;
        t10 t10Var = this.f14703b;
        switch (i10) {
            case 0:
                zs.f(t10Var.currentAccount).k(130, Long.valueOf(j10));
                return;
            default:
                ArrayList arrayList = (ArrayList) t10Var.f17987n.R.f(j10);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        jj jjVar = (jj) arrayList.get(i11);
                        if (jjVar != null && jjVar.f16337k != null) {
                            arrayList2.add(t10Var.getMessagesStorage().e0(jjVar.f1(), jj.B0(jjVar.f16337k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    i0.g3(new mg(t10Var, arrayList2, arrayList, 5));
                    return;
                }
                return;
        }
    }
}
