package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class uq9 extends l13 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable h(int i, xu7 xu7Var) {
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
                                Date date = new Date((long) Double.longBitsToDouble(xu7Var.u()));
                                xu7Var.O(2);
                                return date;
                            }
                            int E = xu7Var.E();
                            ArrayList arrayList = new ArrayList(E);
                            for (int i2 = 0; i2 < E; i2++) {
                                Serializable h = h(xu7Var.A(), xu7Var);
                                if (h != null) {
                                    arrayList.add(h);
                                }
                            }
                            return arrayList;
                        }
                        return i(xu7Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String j = j(xu7Var);
                        int A = xu7Var.A();
                        if (A == 9) {
                            return hashMap;
                        }
                        Serializable h2 = h(A, xu7Var);
                        if (h2 != null) {
                            hashMap.put(j, h2);
                        }
                    }
                } else {
                    return j(xu7Var);
                }
            } else {
                if (xu7Var.A() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(xu7Var.u()));
        }
    }

    public static HashMap i(xu7 xu7Var) {
        int E = xu7Var.E();
        HashMap hashMap = new HashMap(E);
        for (int i = 0; i < E; i++) {
            String j = j(xu7Var);
            Serializable h = h(xu7Var.A(), xu7Var);
            if (h != null) {
                hashMap.put(j, h);
            }
        }
        return hashMap;
    }

    public static String j(xu7 xu7Var) {
        int H = xu7Var.H();
        int i = xu7Var.b;
        xu7Var.O(H);
        return new String(xu7Var.a, i, H);
    }
}
