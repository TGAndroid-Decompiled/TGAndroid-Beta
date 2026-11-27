package defpackage;

import java.util.ArrayList;
import java.util.TreeMap;
public final class gz0 implements Runnable {
    public final byte a;
    public final xz0 b;

    public gz0(xz0 xz0Var, byte b) {
        this.a = b;
        this.b = xz0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        xz0 xz0Var = this.b;
        switch (b) {
            case 0:
                xz0Var.m = null;
                if (xz0Var.c == 1) {
                    xz0Var.y();
                    return;
                }
                return;
            case 1:
                xz0Var.O = null;
                xz0Var.u();
                return;
            case 2:
                xz0Var.O = null;
                xz0Var.u();
                return;
            case 3:
                xz0Var.O = null;
                xz0Var.u();
                return;
            case 4:
                xz0 xz0Var2 = this.b;
                l54[] l54VarArr = xz0Var2.z;
                xz0Var2.n = null;
                byte b2 = xz0Var2.c;
                if (b2 != 4) {
                    TreeMap treeMap = xz0Var2.d;
                    if (b2 == 2 && xz0Var2.t) {
                        l54 l54Var = l54VarArr[xz0Var2.y ? 1 : 0];
                        if (xz0Var2.o(l54Var)) {
                            long h = xz0Var2.a.h();
                            if (!xz0Var2.F) {
                                ArrayList arrayList = new ArrayList();
                                for (nz0 nz0Var : treeMap.values()) {
                                    if (nz0Var.c != null && nz0Var.b > 1) {
                                        arrayList.add(nz0Var);
                                    }
                                }
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    nz0 nz0Var2 = (nz0) obj;
                                    int a = xz0Var2.a(l54Var, h, nz0Var2.f, nz0Var2.b, 1, nz0Var2.a);
                                    if (a >= 0) {
                                        nz0Var2.c.cancel();
                                        nz0Var2.c = null;
                                        xz0Var2.v--;
                                        nz0Var2.b = a;
                                        xz0Var2.p(nz0Var2);
                                    }
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList(treeMap.values());
                                int size2 = arrayList2.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList2.get(i2);
                                    i2++;
                                    nz0 nz0Var3 = (nz0) obj2;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (vz0 vz0Var : nz0Var3.k.values()) {
                                        uz0 l = xz0Var2.l(vz0Var.a);
                                        if (vz0Var.d != null && l != null && vz0Var.c > 0) {
                                            arrayList3.add(vz0Var);
                                        }
                                    }
                                    int size3 = arrayList3.size();
                                    int i3 = i;
                                    while (i3 < size3) {
                                        int i4 = i3 + 1;
                                        vz0 vz0Var2 = (vz0) arrayList3.get(i3);
                                        uz0 l2 = xz0Var2.l(vz0Var2.a);
                                        l54 l54Var2 = l54VarArr[xz0Var2.y ? 1 : 0];
                                        long j = vz0Var2.g;
                                        int i5 = size3;
                                        int i6 = vz0Var2.c;
                                        l2.getClass();
                                        int a2 = xz0Var2.a(l54Var2, h, j, i6, 0, nz0Var3.a);
                                        if (a2 >= 0) {
                                            xz0Var2.g(vz0Var2);
                                            vz0Var2.c = a2;
                                            xz0Var2.r(nz0Var3, vz0Var2);
                                        }
                                        i3 = i4;
                                        size3 = i5;
                                        i = 0;
                                    }
                                }
                            }
                        }
                    }
                    xz0Var2.B();
                    return;
                }
                return;
            case 5:
                xz0Var.l = null;
                xz0Var.w();
                return;
            case 6:
                if (xz0Var.c == 0) {
                    xz0Var.a.c("start");
                    xz0Var.y();
                    return;
                }
                return;
            default:
                mz0 mz0Var = xz0Var.a;
                if (xz0Var.c == 3) {
                    long h2 = mz0Var.h() - xz0Var.o;
                    mz0Var.c("rejoined after " + h2 + " ms");
                    if (h2 > 30000) {
                        xz0Var.e(false);
                        xz0.d(xz0Var.l);
                        xz0Var.l = null;
                        xz0Var.y();
                        return;
                    }
                    xz0Var.c = (byte) 2;
                    xz0Var.e = xz0Var.b();
                    xz0Var.w();
                    return;
                }
                return;
        }
    }
}
