package defpackage;

import java.util.ArrayList;
public final class k4c implements Runnable {
    public final byte a;
    public final a5c b;
    public final long c;

    public k4c(a5c a5cVar, long j, byte b) {
        this.a = b;
        this.b = a5cVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        a5c a5cVar = this.b;
        switch (b) {
            case 0:
                jn7.f(a5cVar.currentAccount).k(131, Long.valueOf(j));
                return;
            default:
                ArrayList arrayList = (ArrayList) a5cVar.n.S.f(j);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        r47 r47Var = (r47) arrayList.get(i);
                        if (r47Var != null && r47Var.k != null) {
                            arrayList2.add(a5cVar.getMessagesStorage().c0(r47Var.e1(), r47.B0(r47Var.k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    hl.c3(new es6(a5cVar, arrayList2, arrayList, (byte) 5));
                    return;
                }
                return;
        }
    }
}
