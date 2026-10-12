package i3;

import b2.h;
import e2.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class c extends h {
    public long f11268b;
    public long[] f11269c;
    public long[] d;

    public static Serializable e1(int i10, x xVar) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(xVar.u()));
                                xVar.O(2);
                                return date;
                            }
                            int E = xVar.E();
                            ArrayList arrayList = new ArrayList(E);
                            for (int i11 = 0; i11 < E; i11++) {
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
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(xVar.u()));
        }
    }

    public static HashMap f1(x xVar) {
        int E = xVar.E();
        HashMap hashMap = new HashMap(E);
        for (int i10 = 0; i10 < E; i10++) {
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
        int i10 = xVar.f8412b;
        xVar.O(H);
        return new String(xVar.f8411a, i10, H);
    }
}
