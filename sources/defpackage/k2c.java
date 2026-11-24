package defpackage;

import java.util.ArrayList;
public final class k2c implements Runnable {
    public final byte a;
    public final b3c b;
    public final long c;

    public k2c(b3c b3cVar, long j, byte b) {
        this.a = b;
        this.b = b3cVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        b3c b3cVar = this.b;
        switch (b) {
            case 0:
                nm7.f(b3cVar.currentAccount).k(131, Long.valueOf(j));
                return;
            default:
                ArrayList arrayList = (ArrayList) b3cVar.n.S.f(j);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        k47 k47Var = (k47) arrayList.get(i);
                        if (k47Var != null && k47Var.k != null) {
                            arrayList2.add(b3cVar.getMessagesStorage().c0(k47Var.e1(), k47.B0(k47Var.k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    gm.c3(new op6(b3cVar, arrayList2, arrayList, (byte) 5));
                    return;
                }
                return;
        }
    }
}
