package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
public abstract class fxe {
    public static final Class a;
    public static final mze b;
    public static final mze c;
    public static final mze d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = d(false);
        c = d(true);
        d = new Object();
    }

    public static int A(List list) {
        return list.size() << 2;
    }

    public static void B(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += lje.p(((Integer) list.get(i3)).intValue());
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ljeVar.b(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                ljeVar.c(i, 0);
                ljeVar.b(intValue);
            }
        }
    }

    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return lje.r(i) * size;
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    public static void E(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += lje.t(((Integer) list.get(i3)).intValue());
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ljeVar.g(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                ljeVar.c(i, 0);
                ljeVar.g(intValue);
            }
        }
    }

    public static void F(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    i2 += lje.t((intValue << 1) ^ (intValue >> 31));
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    ljeVar.g((intValue2 << 1) ^ (intValue2 >> 31));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                ljeVar.c(i, 0);
                ljeVar.g((intValue3 << 1) ^ (intValue3 >> 31));
            }
        }
    }

    public static void G(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            int i2 = 0;
            if (z) {
                ljeVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                ljeVar.g(i3);
                while (i2 < list.size()) {
                    ljeVar.l(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                ljeVar.c(i, 5);
                ljeVar.l(intValue);
                i2++;
            }
        }
    }

    public static void H(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            int i2 = 0;
            if (z) {
                ljeVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                ljeVar.g(i3);
                while (i2 < list.size()) {
                    ljeVar.l(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                ljeVar.c(i, 5);
                ljeVar.l(intValue);
                i2++;
            }
        }
    }

    public static void I(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += lje.p(((Integer) list.get(i3)).intValue());
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ljeVar.b(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                ljeVar.c(i, 0);
                ljeVar.b(intValue);
            }
        }
    }

    public static void J(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Boolean) list.get(i3)).getClass();
                    i2++;
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ljeVar.a(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                ljeVar.c(i, 0);
                ljeVar.a(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static int a(int i, Object obj, xwe xweVar) {
        qde qdeVar = (qde) obj;
        int t = lje.t(i << 3);
        int c2 = qdeVar.c();
        if (c2 == -1) {
            c2 = xweVar.zzb(qdeVar);
            qdeVar.b(c2);
        }
        return yjb.A(c2, c2, t);
    }

    public static int b(int i, List list, xwe xweVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = lje.m(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            qde qdeVar = (qde) list.get(i2);
            int c2 = qdeVar.c();
            if (c2 == -1) {
                c2 = xweVar.zzb(qdeVar);
                qdeVar.b(c2);
            }
            m = yjb.A(c2, c2, m);
        }
        return m;
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof rre) {
            rre rreVar = (rre) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += lje.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static mze d(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (mze) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void e(int i, List list, g6e g6eVar) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            byte[] bArr = ljeVar.b;
            if (list instanceof ere) {
                ere ereVar = (ere) list;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object d2 = ereVar.d(i2);
                    if (d2 instanceof String) {
                        String str = (String) d2;
                        ljeVar.c(i, 2);
                        int i3 = ljeVar.d;
                        try {
                            int t = lje.t(str.length() * 3);
                            int t2 = lje.t(str.length());
                            if (t2 == t) {
                                int i4 = i3 + t2;
                                ljeVar.d = i4;
                                int b2 = q0f.a.b(str, bArr, i4, ljeVar.e());
                                ljeVar.d = i3;
                                ljeVar.g((b2 - i3) - t2);
                                ljeVar.d = b2;
                            } else {
                                ljeVar.g(q0f.a(str));
                                ljeVar.d = q0f.a.b(str, bArr, ljeVar.d, ljeVar.e());
                            }
                        } catch (IndexOutOfBoundsException e) {
                            throw new mje(e);
                        } catch (z0f e2) {
                            ljeVar.d = i3;
                            lje.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                            byte[] bytes = str.getBytes(foe.a);
                            try {
                                ljeVar.g(bytes.length);
                                ljeVar.k(bytes, 0, bytes.length);
                            } catch (IndexOutOfBoundsException e3) {
                                throw new mje(e3);
                            } catch (mje e4) {
                                throw e4;
                            }
                        }
                    } else {
                        sie sieVar = (sie) d2;
                        ljeVar.c(i, 2);
                        ljeVar.g(sieVar.i());
                        ljeVar.k(sieVar.b, sieVar.m(), sieVar.i());
                    }
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str2 = (String) list.get(i5);
                ljeVar.c(i, 2);
                int i6 = ljeVar.d;
                try {
                    int t3 = lje.t(str2.length() * 3);
                    int t4 = lje.t(str2.length());
                    if (t4 == t3) {
                        int i7 = i6 + t4;
                        ljeVar.d = i7;
                        int b3 = q0f.a.b(str2, bArr, i7, ljeVar.e());
                        ljeVar.d = i6;
                        ljeVar.g((b3 - i6) - t4);
                        ljeVar.d = b3;
                    } else {
                        ljeVar.g(q0f.a(str2));
                        ljeVar.d = q0f.a.b(str2, bArr, ljeVar.d, ljeVar.e());
                    }
                } catch (IndexOutOfBoundsException e5) {
                    throw new mje(e5);
                } catch (z0f e6) {
                    ljeVar.d = i6;
                    lje.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
                    byte[] bytes2 = str2.getBytes(foe.a);
                    try {
                        ljeVar.g(bytes2.length);
                        ljeVar.k(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e7) {
                        throw new mje(e7);
                    } catch (mje e8) {
                        throw e8;
                    }
                }
            }
        }
    }

    public static void f(int i, List list, g6e g6eVar, xwe xweVar) {
        if (list != null && !list.isEmpty()) {
            g6eVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                g6eVar.a(i, list.get(i2), xweVar);
            }
        }
    }

    public static void g(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            int i2 = 0;
            if (z) {
                ljeVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                ljeVar.g(i3);
                while (i2 < list.size()) {
                    ljeVar.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue());
                ljeVar.c(i, 1);
                ljeVar.j(doubleToRawLongBits);
                i2++;
            }
        }
    }

    public static void h(mze mzeVar, nne nneVar, nne nneVar2) {
        mzeVar.getClass();
        qze qzeVar = nneVar.zzb;
        qze qzeVar2 = nneVar2.zzb;
        if (!qzeVar2.equals(qze.f)) {
            int i = qzeVar.a + qzeVar2.a;
            int[] copyOf = Arrays.copyOf(qzeVar.b, i);
            System.arraycopy(qzeVar2.b, 0, copyOf, qzeVar.a, qzeVar2.a);
            Object[] copyOf2 = Arrays.copyOf(qzeVar.c, i);
            System.arraycopy(qzeVar2.c, 0, copyOf2, qzeVar.a, qzeVar2.a);
            qzeVar = new qze(i, copyOf, copyOf2, true);
        }
        nneVar.zzb = qzeVar;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int j(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m = lje.m(i) * size;
        if (list instanceof ere) {
            ere ereVar = (ere) list;
            while (i2 < size) {
                Object d2 = ereVar.d(i2);
                if (d2 instanceof sie) {
                    int i3 = ((sie) d2).i();
                    m = yjb.A(i3, i3, m);
                } else {
                    m = lje.f((String) d2) + m;
                }
                i2++;
            }
            return m;
        }
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof sie) {
                int i4 = ((sie) obj).i();
                m = yjb.A(i4, i4, m);
            } else {
                m = lje.f((String) obj) + m;
            }
            i2++;
        }
        return m;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof rre) {
            rre rreVar = (rre) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += lje.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void l(int i, List list, g6e g6eVar) {
        if (list != null && !list.isEmpty()) {
            g6eVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                lje ljeVar = (lje) g6eVar.b;
                sie sieVar = (sie) list.get(i2);
                ljeVar.c(i, 2);
                ljeVar.g(sieVar.i());
                ljeVar.k(sieVar.b, sieVar.m(), sieVar.i());
            }
        }
    }

    public static void m(int i, List list, g6e g6eVar, xwe xweVar) {
        if (list != null && !list.isEmpty()) {
            g6eVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                g6eVar.c(i, list.get(i2), xweVar);
            }
        }
    }

    public static void n(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            int i2 = 0;
            if (z) {
                ljeVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                ljeVar.g(i3);
                while (i2 < list.size()) {
                    ljeVar.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int floatToRawIntBits = Float.floatToRawIntBits(((Float) list.get(i2)).floatValue());
                ljeVar.c(i, 5);
                ljeVar.l(floatToRawIntBits);
                i2++;
            }
        }
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = lje.m(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = ((sie) list.get(i2)).i();
            m = yjb.A(i3, i3, m);
        }
        return m;
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (list instanceof rre) {
                ir2.u(list);
                if (size > 0) {
                    throw null;
                }
            } else {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += lje.o((longValue << 1) ^ (longValue >> 63));
                }
                return i;
            }
        }
        return 0;
    }

    public static void q(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += lje.o(((Long) list.get(i3)).longValue());
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ljeVar.d(((Long) list.get(i4)).longValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue = ((Long) list.get(i5)).longValue();
                ljeVar.c(i, 0);
                ljeVar.d(longValue);
            }
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wne) {
            wne wneVar = (wne) list;
            int i2 = 0;
            while (i < size) {
                wneVar.j(i);
                i2 += lje.p(wneVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += lje.p(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static void s(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += lje.o(((Long) list.get(i3)).longValue());
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ljeVar.d(((Long) list.get(i4)).longValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue = ((Long) list.get(i5)).longValue();
                ljeVar.c(i, 0);
                ljeVar.d(longValue);
            }
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wne) {
            wne wneVar = (wne) list;
            int i2 = 0;
            while (i < size) {
                wneVar.j(i);
                i2 += lje.p(wneVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += lje.p(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static void u(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            if (z) {
                ljeVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    long longValue = ((Long) list.get(i3)).longValue();
                    i2 += lje.o((longValue << 1) ^ (longValue >> 63));
                }
                ljeVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue2 = ((Long) list.get(i4)).longValue();
                    ljeVar.d((longValue2 << 1) ^ (longValue2 >> 63));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                ljeVar.c(i, 0);
                ljeVar.d((longValue3 << 1) ^ (longValue3 >> 63));
            }
        }
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wne) {
            wne wneVar = (wne) list;
            int i2 = 0;
            while (i < size) {
                wneVar.j(i);
                i2 += lje.t(wneVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += lje.t(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static void w(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            int i2 = 0;
            if (z) {
                ljeVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                ljeVar.g(i3);
                while (i2 < list.size()) {
                    ljeVar.j(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                ljeVar.c(i, 1);
                ljeVar.j(longValue);
                i2++;
            }
        }
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wne) {
            wne wneVar = (wne) list;
            int i2 = 0;
            while (i < size) {
                wneVar.j(i);
                int i3 = wneVar.b[i];
                i2 += lje.t((i3 << 1) ^ (i3 >> 31));
                i++;
            }
            return i2;
        }
        int i4 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i4 += lje.t((intValue << 1) ^ (intValue >> 31));
            i++;
        }
        return i4;
    }

    public static void y(int i, List list, g6e g6eVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lje ljeVar = (lje) g6eVar.b;
            int i2 = 0;
            if (z) {
                ljeVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                ljeVar.g(i3);
                while (i2 < list.size()) {
                    ljeVar.j(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                ljeVar.c(i, 1);
                ljeVar.j(longValue);
                i2++;
            }
        }
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return lje.v(i) * size;
    }
}
