package k3;

import ci.u0;
import g2.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class c extends u0 {
    public long f16820b;
    public long[] f16821c;
    public long[] d;

    public static Serializable e1(int i3, y yVar) {
        if (i3 != 0) {
            boolean z10 = false;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 8) {
                            if (i3 != 10) {
                                if (i3 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(yVar.u()));
                                yVar.O(2);
                                return date;
                            }
                            int E = yVar.E();
                            ArrayList arrayList = new ArrayList(E);
                            for (int i10 = 0; i10 < E; i10++) {
                                Serializable e12 = e1(yVar.A(), yVar);
                                if (e12 != null) {
                                    arrayList.add(e12);
                                }
                            }
                            return arrayList;
                        }
                        return f1(yVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String g12 = g1(yVar);
                        int A = yVar.A();
                        if (A == 9) {
                            return hashMap;
                        }
                        Serializable e13 = e1(A, yVar);
                        if (e13 != null) {
                            hashMap.put(g12, e13);
                        }
                    }
                } else {
                    return g1(yVar);
                }
            } else {
                if (yVar.A() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(yVar.u()));
        }
    }

    public static HashMap f1(y yVar) {
        int E = yVar.E();
        HashMap hashMap = new HashMap(E);
        for (int i3 = 0; i3 < E; i3++) {
            String g12 = g1(yVar);
            Serializable e12 = e1(yVar.A(), yVar);
            if (e12 != null) {
                hashMap.put(g12, e12);
            }
        }
        return hashMap;
    }

    public static String g1(y yVar) {
        int H = yVar.H();
        int i3 = yVar.f11924b;
        yVar.O(H);
        return new String(yVar.f11923a, i3, H);
    }
}
