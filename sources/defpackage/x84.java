package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
public final class x84 {
    public static final int c = 0;
    public final uja a = uja.g();
    public boolean b;

    static {
        new x84(0);
    }

    public x84(int i) {
        a();
        a();
    }

    public static void b(ck2 ck2Var, kyc kycVar, int i, Object obj) {
        if (kycVar == kyc.d) {
            ck2Var.A(i, 3);
            ((o3) obj).b(ck2Var);
            ck2Var.A(i, 4);
            return;
        }
        ck2Var.A(i, kycVar.b);
        switch (kycVar.ordinal()) {
            case 0:
                ck2Var.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                ck2Var.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                ck2Var.E(((Long) obj).longValue());
                return;
            case 3:
                ck2Var.E(((Long) obj).longValue());
                return;
            case 4:
                ck2Var.v(((Integer) obj).intValue());
                return;
            case 5:
                ck2Var.t(((Long) obj).longValue());
                return;
            case 6:
                ck2Var.r(((Integer) obj).intValue());
                return;
            case 7:
                ck2Var.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof f51) {
                    ck2Var.p((f51) obj);
                    return;
                } else {
                    ck2Var.z((String) obj);
                    return;
                }
            case 9:
                ((o3) obj).b(ck2Var);
                return;
            case 10:
                o3 o3Var = (o3) obj;
                ck2Var.C(((fs4) o3Var).a(null));
                o3Var.b(ck2Var);
                return;
            case 11:
                if (obj instanceof f51) {
                    ck2Var.p((f51) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                ck2Var.C(length);
                ck2Var.m(bArr, 0, length);
                return;
            case 12:
                ck2Var.C(((Integer) obj).intValue());
                return;
            case 13:
                ck2Var.v(((Integer) obj).intValue());
                return;
            case 14:
                ck2Var.r(((Integer) obj).intValue());
                return;
            case 15:
                ck2Var.t(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                ck2Var.C((intValue << 1) ^ (intValue >> 31));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                ck2Var.E((longValue << 1) ^ (longValue >> 63));
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
        uja ujaVar = this.a;
        int size = ujaVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry d = ujaVar.d(i);
            if (d.getValue() instanceof fs4) {
                fs4 fs4Var = (fs4) d.getValue();
                fs4Var.getClass();
                ft8 ft8Var = ft8.c;
                ft8Var.getClass();
                ft8Var.a(fs4Var.getClass()).c(fs4Var);
                fs4Var.h();
            }
        }
        if (!ujaVar.c) {
            if (ujaVar.a.size() <= 0) {
                Iterator it = ujaVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    fyb.g();
                    return;
                }
            } else {
                ujaVar.d(0).getKey().getClass();
                fyb.g();
                return;
            }
        }
        if (!ujaVar.c) {
            if (ujaVar.b.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(ujaVar.b);
            }
            ujaVar.b = unmodifiableMap;
            if (ujaVar.e.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(ujaVar.e);
            }
            ujaVar.e = unmodifiableMap2;
            ujaVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        x84 x84Var = new x84();
        uja ujaVar = this.a;
        if (ujaVar.a.size() <= 0) {
            Iterator it = ujaVar.e().iterator();
            if (!it.hasNext()) {
                return x84Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                fyb.g();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry d = ujaVar.d(0);
        if (d.getKey() != null) {
            fyb.g();
            return null;
        }
        d.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x84)) {
            return false;
        }
        return this.a.equals(((x84) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public x84() {
    }
}
