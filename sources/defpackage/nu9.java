package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class nu9 extends e23 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable h(int i, ey7 ey7Var) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(ey7Var.u()));
                                ey7Var.O(2);
                                return date;
                            }
                            int E = ey7Var.E();
                            ArrayList arrayList = new ArrayList(E);
                            for (int i2 = 0; i2 < E; i2++) {
                                Serializable h = h(ey7Var.A(), ey7Var);
                                if (h != null) {
                                    arrayList.add(h);
                                }
                            }
                            return arrayList;
                        }
                        return i(ey7Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String j = j(ey7Var);
                        int A = ey7Var.A();
                        if (A == 9) {
                            return hashMap;
                        }
                        Serializable h2 = h(A, ey7Var);
                        if (h2 != null) {
                            hashMap.put(j, h2);
                        }
                    }
                } else {
                    return j(ey7Var);
                }
            } else {
                if (ey7Var.A() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(ey7Var.u()));
        }
    }

    public static HashMap i(ey7 ey7Var) {
        int E = ey7Var.E();
        HashMap hashMap = new HashMap(E);
        for (int i = 0; i < E; i++) {
            String j = j(ey7Var);
            Serializable h = h(ey7Var.A(), ey7Var);
            if (h != null) {
                hashMap.put(j, h);
            }
        }
        return hashMap;
    }

    public static String j(ey7 ey7Var) {
        int H = ey7Var.H();
        int i = ey7Var.b;
        ey7Var.O(H);
        return new String(ey7Var.a, i, H);
    }
}
