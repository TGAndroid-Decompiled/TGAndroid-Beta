package defpackage;

import java.util.ArrayList;
public final class q0b implements Runnable {
    public final byte a;
    public final w1b b;
    public final ArrayList c;

    public q0b(w1b w1bVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = w1bVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.c;
        w1b w1bVar = this.b;
        switch (b) {
            case 0:
                u5b u5bVar = w1bVar.D0;
                u5bVar.getClass();
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!u5bVar.j.containsKey((Integer) obj)) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!u5bVar.q(0, arrayList, z)) {
                    w1bVar.l0();
                    w1bVar.q0();
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = w1bVar.w0;
                ArrayList arrayList3 = w1bVar.v0;
                w1bVar.A0 = false;
                if (!arrayList.isEmpty()) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        r47 r47Var = (r47) arrayList.get(i3);
                        int i4 = w1bVar.t0.get(r47Var.e1(), -1);
                        if (i4 >= 0 && ((t1b) arrayList3.get(i4)).b() == r47Var.e1()) {
                            ((t1b) arrayList3.get(i4)).b = r47Var;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i < size3) {
                            t1b t1bVar = (t1b) arrayList3.get(i);
                            if (t1bVar.b == null) {
                                w1bVar.s0 = t1bVar.b();
                            } else {
                                arrayList2.add(t1bVar);
                                i++;
                            }
                        }
                    }
                    w1bVar.q0();
                    w1bVar.T.setItemAnimator(null);
                    w1bVar.C0.e();
                    return;
                }
                return;
        }
    }
}
