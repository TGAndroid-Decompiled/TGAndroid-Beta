package l3;

import bi.b1;
import h2.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class c extends b1 {
    public long f18118b;
    public long[] f18119c;
    public long[] d;

    public static Serializable e1(int i7, x xVar) {
        if (i7 != 0) {
            boolean z9 = false;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 8) {
                            if (i7 != 10) {
                                if (i7 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(xVar.u()));
                                xVar.O(2);
                                return date;
                            }
                            int E = xVar.E();
                            ArrayList arrayList = new ArrayList(E);
                            for (int i10 = 0; i10 < E; i10++) {
                                Serializable e12 = e1(xVar.A(), xVar);
                                if (e12 != null) {
                                    arrayList.add(e12);
                                }
                            }
                            return arrayList;
                        }
                        return f1(xVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String g12 = g1(xVar);
                        int A = xVar.A();
                        if (A == 9) {
                            return hashMap;
                        }
                        Serializable e13 = e1(A, xVar);
                        if (e13 != null) {
                            hashMap.put(g12, e13);
                        }
                    }
                } else {
                    return g1(xVar);
                }
            } else {
                if (xVar.A() == 1) {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(xVar.u()));
        }
    }

    public static HashMap f1(x xVar) {
        int E = xVar.E();
        HashMap hashMap = new HashMap(E);
        for (int i7 = 0; i7 < E; i7++) {
            String g12 = g1(xVar);
            Serializable e12 = e1(xVar.A(), xVar);
            if (e12 != null) {
                hashMap.put(g12, e12);
            }
        }
        return hashMap;
    }

    public static String g1(x xVar) {
        int H = xVar.H();
        int i7 = xVar.f14163b;
        xVar.O(H);
        return new String(xVar.f14162a, i7, H);
    }
}
