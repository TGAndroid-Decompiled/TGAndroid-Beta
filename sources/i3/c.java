package i3;

import b2.g;
import e2.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class c extends g {
    public long f10426b;
    public long[] f10427c;
    public long[] d;

    public static Serializable Z0(int i10, v vVar) {
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
                                Date date = new Date((long) Double.longBitsToDouble(vVar.r()));
                                vVar.K(2);
                                return date;
                            }
                            int B = vVar.B();
                            ArrayList arrayList = new ArrayList(B);
                            for (int i11 = 0; i11 < B; i11++) {
                                Serializable Z0 = Z0(vVar.x(), vVar);
                                if (Z0 != null) {
                                    arrayList.add(Z0);
                                }
                            }
                            return arrayList;
                        }
                        return a1(vVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String b12 = b1(vVar);
                        int x10 = vVar.x();
                        if (x10 == 9) {
                            return hashMap;
                        }
                        Serializable Z02 = Z0(x10, vVar);
                        if (Z02 != null) {
                            hashMap.put(b12, Z02);
                        }
                    }
                } else {
                    return b1(vVar);
                }
            } else {
                if (vVar.x() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(vVar.r()));
        }
    }

    public static HashMap a1(v vVar) {
        int B = vVar.B();
        HashMap hashMap = new HashMap(B);
        for (int i10 = 0; i10 < B; i10++) {
            String b12 = b1(vVar);
            Serializable Z0 = Z0(vVar.x(), vVar);
            if (Z0 != null) {
                hashMap.put(b12, Z0);
            }
        }
        return hashMap;
    }

    public static String b1(v vVar) {
        int D = vVar.D();
        int i10 = vVar.f7235b;
        vVar.K(D);
        return new String(vVar.f7234a, i10, D);
    }
}
