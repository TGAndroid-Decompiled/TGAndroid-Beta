package defpackage;

import java.util.ArrayList;
public final class k0c implements Runnable {
    public final byte a;
    public final b1c b;
    public final long c;

    public k0c(b1c b1cVar, long j, byte b) {
        this.a = b;
        this.b = b1cVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        b1c b1cVar = this.b;
        switch (b) {
            case 0:
                kk7.f(b1cVar.currentAccount).k(130, Long.valueOf(j));
                return;
            default:
                ArrayList arrayList = (ArrayList) b1cVar.n.S.f(j);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        k27 k27Var = (k27) arrayList.get(i);
                        if (k27Var != null && k27Var.k != null) {
                            arrayList2.add(b1cVar.getMessagesStorage().c0(k27Var.e1(), k27.B0(k27Var.k)));
                        } else {
                            arrayList2.add(null);
                        }
                    }
                    gl.d3(new nn6(b1cVar, arrayList2, arrayList, (byte) 5));
                    return;
                }
                return;
        }
    }
}
