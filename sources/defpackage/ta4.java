package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
public final class ta4 {
    public static final int c = 0;
    public final ona a = ona.g();
    public boolean b;

    static {
        new ta4(0);
    }

    public ta4(int i) {
        a();
        a();
    }

    public static void b(xk2 xk2Var, a3d a3dVar, int i, Object obj) {
        if (a3dVar == a3d.d) {
            xk2Var.A(i, 3);
            ((p3) obj).b(xk2Var);
            xk2Var.A(i, 4);
            return;
        }
        xk2Var.A(i, a3dVar.b);
        switch (a3dVar.ordinal()) {
            case 0:
                xk2Var.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                xk2Var.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                xk2Var.E(((Long) obj).longValue());
                return;
            case 3:
                xk2Var.E(((Long) obj).longValue());
                return;
            case 4:
                xk2Var.v(((Integer) obj).intValue());
                return;
            case 5:
                xk2Var.t(((Long) obj).longValue());
                return;
            case 6:
                xk2Var.r(((Integer) obj).intValue());
                return;
            case 7:
                xk2Var.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof n51) {
                    xk2Var.p((n51) obj);
                    return;
                } else {
                    xk2Var.z((String) obj);
                    return;
                }
            case 9:
                ((p3) obj).b(xk2Var);
                return;
            case 10:
                p3 p3Var = (p3) obj;
                xk2Var.C(((ju4) p3Var).a(null));
                p3Var.b(xk2Var);
                return;
            case 11:
                if (obj instanceof n51) {
                    xk2Var.p((n51) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                xk2Var.C(length);
                xk2Var.m(bArr, 0, length);
                return;
            case 12:
                xk2Var.C(((Integer) obj).intValue());
                return;
            case 13:
                xk2Var.v(((Integer) obj).intValue());
                return;
            case 14:
                xk2Var.r(((Integer) obj).intValue());
                return;
            case 15:
                xk2Var.t(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                xk2Var.C((intValue << 1) ^ (intValue >> 31));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                xk2Var.E((longValue << 1) ^ (longValue >> 63));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        ona onaVar = this.a;
        int size = onaVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry d = onaVar.d(i);
            if (d.getValue() instanceof ju4) {
                ju4 ju4Var = (ju4) d.getValue();
                ju4Var.getClass();
                ow8 ow8Var = ow8.c;
                ow8Var.getClass();
                ow8Var.a(ju4Var.getClass()).c(ju4Var);
                ju4Var.h();
            }
        }
        if (!onaVar.c) {
            if (onaVar.a.size() <= 0) {
                Iterator it = onaVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    grb.o();
                    return;
                }
            } else {
                onaVar.d(0).getKey().getClass();
                grb.o();
                return;
            }
        }
        if (!onaVar.c) {
            if (onaVar.b.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(onaVar.b);
            }
            onaVar.b = unmodifiableMap;
            if (onaVar.e.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(onaVar.e);
            }
            onaVar.e = unmodifiableMap2;
            onaVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        ta4 ta4Var = new ta4();
        ona onaVar = this.a;
        if (onaVar.a.size() <= 0) {
            Iterator it = onaVar.e().iterator();
            if (!it.hasNext()) {
                return ta4Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                grb.o();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry d = onaVar.d(0);
        if (d.getKey() != null) {
            grb.o();
            return null;
        }
        d.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta4)) {
            return false;
        }
        return this.a.equals(((ta4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ta4() {
    }
}
