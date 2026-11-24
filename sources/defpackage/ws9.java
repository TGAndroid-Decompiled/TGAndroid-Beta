package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class ws9 extends x23 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable h(int i, yw7 yw7Var) {
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
                                Date date = new Date((long) Double.longBitsToDouble(yw7Var.u()));
                                yw7Var.O(2);
                                return date;
                            }
                            int E = yw7Var.E();
                            ArrayList arrayList = new ArrayList(E);
                            for (int i2 = 0; i2 < E; i2++) {
                                Serializable h = h(yw7Var.A(), yw7Var);
                                if (h != null) {
                                    arrayList.add(h);
                                }
                            }
                            return arrayList;
                        }
                        return i(yw7Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String j = j(yw7Var);
                        int A = yw7Var.A();
                        if (A == 9) {
                            return hashMap;
                        }
                        Serializable h2 = h(A, yw7Var);
                        if (h2 != null) {
                            hashMap.put(j, h2);
                        }
                    }
                } else {
                    return j(yw7Var);
                }
            } else {
                if (yw7Var.A() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(yw7Var.u()));
        }
    }

    public static HashMap i(yw7 yw7Var) {
        int E = yw7Var.E();
        HashMap hashMap = new HashMap(E);
        for (int i = 0; i < E; i++) {
            String j = j(yw7Var);
            Serializable h = h(yw7Var.A(), yw7Var);
            if (h != null) {
                hashMap.put(j, h);
            }
        }
        return hashMap;
    }

    public static String j(yw7 yw7Var) {
        int H = yw7Var.H();
        int i = yw7Var.b;
        yw7Var.O(H);
        return new String(yw7Var.a, i, H);
    }
}
