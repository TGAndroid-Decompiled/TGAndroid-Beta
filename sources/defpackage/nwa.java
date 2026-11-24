package defpackage;

import java.util.ArrayList;
public final class nwa implements Runnable {
    public final byte a;
    public final uxa b;
    public final ArrayList c;

    public nwa(uxa uxaVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = uxaVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.c;
        uxa uxaVar = this.b;
        switch (b) {
            case 0:
                y1b y1bVar = uxaVar.D0;
                y1bVar.getClass();
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!y1bVar.j.containsKey((Integer) obj)) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!y1bVar.q(0, arrayList, z)) {
                    uxaVar.l0();
                    uxaVar.q0();
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = uxaVar.w0;
                ArrayList arrayList3 = uxaVar.v0;
                uxaVar.A0 = false;
                if (!arrayList.isEmpty()) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        k27 k27Var = (k27) arrayList.get(i3);
                        int i4 = uxaVar.t0.get(k27Var.e1(), -1);
                        if (i4 >= 0 && ((rxa) arrayList3.get(i4)).b() == k27Var.e1()) {
                            ((rxa) arrayList3.get(i4)).b = k27Var;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i < size3) {
                            rxa rxaVar = (rxa) arrayList3.get(i);
                            if (rxaVar.b == null) {
                                uxaVar.s0 = rxaVar.b();
                            } else {
                                arrayList2.add(rxaVar);
                                i++;
                            }
                        }
                    }
                    uxaVar.q0();
                    uxaVar.T.setItemAnimator(null);
                    uxaVar.C0.e();
                    return;
                }
                return;
        }
    }
}
