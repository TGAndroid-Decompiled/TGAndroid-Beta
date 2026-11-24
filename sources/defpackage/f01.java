package defpackage;

import java.util.ArrayList;
import java.util.TreeMap;
public final class f01 implements Runnable {
    public final byte a;
    public final w01 b;

    public f01(w01 w01Var, byte b) {
        this.a = b;
        this.b = w01Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        w01 w01Var = this.b;
        switch (b) {
            case 0:
                w01Var.m = null;
                if (w01Var.c == 1) {
                    w01Var.y();
                    return;
                }
                return;
            case 1:
                w01Var.O = null;
                w01Var.u();
                return;
            case 2:
                w01Var.O = null;
                w01Var.u();
                return;
            case 3:
                w01Var.O = null;
                w01Var.u();
                return;
            case 4:
                w01 w01Var2 = this.b;
                a64[] a64VarArr = w01Var2.z;
                w01Var2.n = null;
                byte b2 = w01Var2.c;
                if (b2 != 4) {
                    TreeMap treeMap = w01Var2.d;
                    if (b2 == 2 && w01Var2.t) {
                        a64 a64Var = a64VarArr[w01Var2.y ? 1 : 0];
                        if (w01Var2.o(a64Var)) {
                            long h = w01Var2.a.h();
                            if (!w01Var2.F) {
                                ArrayList arrayList = new ArrayList();
                                for (m01 m01Var : treeMap.values()) {
                                    if (m01Var.c != null && m01Var.b > 1) {
                                        arrayList.add(m01Var);
                                    }
                                }
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    m01 m01Var2 = (m01) obj;
                                    int a = w01Var2.a(a64Var, h, m01Var2.f, m01Var2.b, 1, m01Var2.a);
                                    if (a >= 0) {
                                        m01Var2.c.cancel();
                                        m01Var2.c = null;
                                        w01Var2.v--;
                                        m01Var2.b = a;
                                        w01Var2.p(m01Var2);
                                    }
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList(treeMap.values());
                                int size2 = arrayList2.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList2.get(i2);
                                    i2++;
                                    m01 m01Var3 = (m01) obj2;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (u01 u01Var : m01Var3.k.values()) {
                                        t01 l = w01Var2.l(u01Var.a);
                                        if (u01Var.d != null && l != null && u01Var.c > 0) {
                                            arrayList3.add(u01Var);
                                        }
                                    }
                                    int size3 = arrayList3.size();
                                    int i3 = i;
                                    while (i3 < size3) {
                                        int i4 = i3 + 1;
                                        u01 u01Var2 = (u01) arrayList3.get(i3);
                                        t01 l2 = w01Var2.l(u01Var2.a);
                                        a64 a64Var2 = a64VarArr[w01Var2.y ? 1 : 0];
                                        long j = u01Var2.g;
                                        int i5 = size3;
                                        int i6 = u01Var2.c;
                                        l2.getClass();
                                        int a2 = w01Var2.a(a64Var2, h, j, i6, 0, m01Var3.a);
                                        if (a2 >= 0) {
                                            w01Var2.g(u01Var2);
                                            u01Var2.c = a2;
                                            w01Var2.r(m01Var3, u01Var2);
                                        }
                                        i3 = i4;
                                        size3 = i5;
                                        i = 0;
                                    }
                                }
                            }
                        }
                    }
                    w01Var2.B();
                    return;
                }
                return;
            case 5:
                w01Var.l = null;
                w01Var.w();
                return;
            case 6:
                if (w01Var.c == 0) {
                    w01Var.a.d("start");
                    w01Var.y();
                    return;
                }
                return;
            default:
                l01 l01Var = w01Var.a;
                if (w01Var.c == 3) {
                    long h2 = l01Var.h() - w01Var.o;
                    l01Var.d("rejoined after " + h2 + " ms");
                    if (h2 > 30000) {
                        w01Var.e(false);
                        w01.d(w01Var.l);
                        w01Var.l = null;
                        w01Var.y();
                        return;
                    }
                    w01Var.c = (byte) 2;
                    w01Var.e = w01Var.b();
                    w01Var.w();
                    return;
                }
                return;
        }
    }
}
