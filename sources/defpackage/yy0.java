package defpackage;

import java.util.ArrayList;
import java.util.TreeMap;
public final class yy0 implements Runnable {
    public final byte a;
    public final pz0 b;

    public yy0(pz0 pz0Var, byte b) {
        this.a = b;
        this.b = pz0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        pz0 pz0Var = this.b;
        switch (b) {
            case 0:
                pz0Var.m = null;
                if (pz0Var.c == 1) {
                    pz0Var.y();
                    return;
                }
                return;
            case 1:
                pz0Var.O = null;
                pz0Var.u();
                return;
            case 2:
                pz0Var.O = null;
                pz0Var.u();
                return;
            case 3:
                pz0Var.O = null;
                pz0Var.u();
                return;
            case 4:
                pz0 pz0Var2 = this.b;
                p44[] p44VarArr = pz0Var2.z;
                pz0Var2.n = null;
                byte b2 = pz0Var2.c;
                if (b2 != 4) {
                    TreeMap treeMap = pz0Var2.d;
                    if (b2 == 2 && pz0Var2.t) {
                        p44 p44Var = p44VarArr[pz0Var2.y ? 1 : 0];
                        if (pz0Var2.o(p44Var)) {
                            long h = pz0Var2.a.h();
                            if (!pz0Var2.F) {
                                ArrayList arrayList = new ArrayList();
                                for (fz0 fz0Var : treeMap.values()) {
                                    if (fz0Var.c != null && fz0Var.b > 1) {
                                        arrayList.add(fz0Var);
                                    }
                                }
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    fz0 fz0Var2 = (fz0) obj;
                                    int a = pz0Var2.a(p44Var, h, fz0Var2.f, fz0Var2.b, 1, fz0Var2.a);
                                    if (a >= 0) {
                                        fz0Var2.c.cancel();
                                        fz0Var2.c = null;
                                        pz0Var2.v--;
                                        fz0Var2.b = a;
                                        pz0Var2.p(fz0Var2);
                                    }
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList(treeMap.values());
                                int size2 = arrayList2.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList2.get(i2);
                                    i2++;
                                    fz0 fz0Var3 = (fz0) obj2;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (nz0 nz0Var : fz0Var3.k.values()) {
                                        mz0 l = pz0Var2.l(nz0Var.a);
                                        if (nz0Var.d != null && l != null && nz0Var.c > 0) {
                                            arrayList3.add(nz0Var);
                                        }
                                    }
                                    int size3 = arrayList3.size();
                                    int i3 = i;
                                    while (i3 < size3) {
                                        int i4 = i3 + 1;
                                        nz0 nz0Var2 = (nz0) arrayList3.get(i3);
                                        mz0 l2 = pz0Var2.l(nz0Var2.a);
                                        p44 p44Var2 = p44VarArr[pz0Var2.y ? 1 : 0];
                                        long j = nz0Var2.g;
                                        int i5 = size3;
                                        int i6 = nz0Var2.c;
                                        l2.getClass();
                                        int a2 = pz0Var2.a(p44Var2, h, j, i6, 0, fz0Var3.a);
                                        if (a2 >= 0) {
                                            pz0Var2.g(nz0Var2);
                                            nz0Var2.c = a2;
                                            pz0Var2.r(fz0Var3, nz0Var2);
                                        }
                                        i3 = i4;
                                        size3 = i5;
                                        i = 0;
                                    }
                                }
                            }
                        }
                    }
                    pz0Var2.B();
                    return;
                }
                return;
            case 5:
                pz0Var.l = null;
                pz0Var.w();
                return;
            case 6:
                if (pz0Var.c == 0) {
                    pz0Var.a.d("start");
                    pz0Var.y();
                    return;
                }
                return;
            default:
                ez0 ez0Var = pz0Var.a;
                if (pz0Var.c == 3) {
                    long h2 = ez0Var.h() - pz0Var.o;
                    ez0Var.d("rejoined after " + h2 + " ms");
                    if (h2 > 30000) {
                        pz0Var.e(false);
                        pz0.d(pz0Var.l);
                        pz0Var.l = null;
                        pz0Var.y();
                        return;
                    }
                    pz0Var.c = (byte) 2;
                    pz0Var.e = pz0Var.b();
                    pz0Var.w();
                    return;
                }
                return;
        }
    }
}
