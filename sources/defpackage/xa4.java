package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
public final class xa4 {
    public static final int c = 0;
    public final vla a = vla.g();
    public boolean b;

    static {
        new xa4(0);
    }

    public xa4(int i) {
        a();
        a();
    }

    public static void b(pl2 pl2Var, l0d l0dVar, int i, Object obj) {
        if (l0dVar == l0d.d) {
            pl2Var.A(i, 3);
            ((o3) obj).b(pl2Var);
            pl2Var.A(i, 4);
            return;
        }
        pl2Var.A(i, l0dVar.b);
        switch (l0dVar.ordinal()) {
            case 0:
                pl2Var.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                pl2Var.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                pl2Var.E(((Long) obj).longValue());
                return;
            case 3:
                pl2Var.E(((Long) obj).longValue());
                return;
            case 4:
                pl2Var.v(((Integer) obj).intValue());
                return;
            case 5:
                pl2Var.t(((Long) obj).longValue());
                return;
            case 6:
                pl2Var.r(((Integer) obj).intValue());
                return;
            case 7:
                pl2Var.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof m61) {
                    pl2Var.p((m61) obj);
                    return;
                } else {
                    pl2Var.z((String) obj);
                    return;
                }
            case 9:
                ((o3) obj).b(pl2Var);
                return;
            case 10:
                o3 o3Var = (o3) obj;
                pl2Var.C(((gu4) o3Var).a(null));
                o3Var.b(pl2Var);
                return;
            case 11:
                if (obj instanceof m61) {
                    pl2Var.p((m61) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                pl2Var.C(length);
                pl2Var.m(bArr, 0, length);
                return;
            case 12:
                pl2Var.C(((Integer) obj).intValue());
                return;
            case 13:
                pl2Var.v(((Integer) obj).intValue());
                return;
            case 14:
                pl2Var.r(((Integer) obj).intValue());
                return;
            case 15:
                pl2Var.t(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                pl2Var.C((intValue << 1) ^ (intValue >> 31));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                pl2Var.E((longValue << 1) ^ (longValue >> 63));
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
        vla vlaVar = this.a;
        int size = vlaVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry d = vlaVar.d(i);
            if (d.getValue() instanceof gu4) {
                gu4 gu4Var = (gu4) d.getValue();
                gu4Var.getClass();
                gv8 gv8Var = gv8.c;
                gv8Var.getClass();
                gv8Var.a(gu4Var.getClass()).c(gu4Var);
                gu4Var.h();
            }
        }
        if (!vlaVar.c) {
            if (vlaVar.a.size() <= 0) {
                Iterator it = vlaVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    rjb.p();
                    return;
                }
            } else {
                vlaVar.d(0).getKey().getClass();
                rjb.p();
                return;
            }
        }
        if (!vlaVar.c) {
            if (vlaVar.b.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(vlaVar.b);
            }
            vlaVar.b = unmodifiableMap;
            if (vlaVar.e.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(vlaVar.e);
            }
            vlaVar.e = unmodifiableMap2;
            vlaVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        xa4 xa4Var = new xa4();
        vla vlaVar = this.a;
        if (vlaVar.a.size() <= 0) {
            Iterator it = vlaVar.e().iterator();
            if (!it.hasNext()) {
                return xa4Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                rjb.p();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry d = vlaVar.d(0);
        if (d.getKey() != null) {
            rjb.p();
            return null;
        }
        d.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa4)) {
            return false;
        }
        return this.a.equals(((xa4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xa4() {
    }
}
