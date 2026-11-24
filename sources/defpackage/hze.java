package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
public abstract class hze {
    public static final Class a;
    public static final o1f b;
    public static final o1f c;
    public static final o1f d;

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

    public static void B(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += nle.p(((Integer) list.get(i3)).intValue());
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    nleVar.b(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                nleVar.c(i, 0);
                nleVar.b(intValue);
            }
        }
    }

    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return nle.r(i) * size;
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    public static void E(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += nle.t(((Integer) list.get(i3)).intValue());
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    nleVar.g(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                nleVar.c(i, 0);
                nleVar.g(intValue);
            }
        }
    }

    public static void F(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    i2 += nle.t((intValue << 1) ^ (intValue >> 31));
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    nleVar.g((intValue2 << 1) ^ (intValue2 >> 31));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                nleVar.c(i, 0);
                nleVar.g((intValue3 << 1) ^ (intValue3 >> 31));
            }
        }
    }

    public static void G(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            int i2 = 0;
            if (z) {
                nleVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                nleVar.g(i3);
                while (i2 < list.size()) {
                    nleVar.l(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                nleVar.c(i, 5);
                nleVar.l(intValue);
                i2++;
            }
        }
    }

    public static void H(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            int i2 = 0;
            if (z) {
                nleVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                nleVar.g(i3);
                while (i2 < list.size()) {
                    nleVar.l(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                nleVar.c(i, 5);
                nleVar.l(intValue);
                i2++;
            }
        }
    }

    public static void I(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += nle.p(((Integer) list.get(i3)).intValue());
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    nleVar.b(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                nleVar.c(i, 0);
                nleVar.b(intValue);
            }
        }
    }

    public static void J(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Boolean) list.get(i3)).getClass();
                    i2++;
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    nleVar.a(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                nleVar.c(i, 0);
                nleVar.a(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static int a(int i, Object obj, zye zyeVar) {
        rfe rfeVar = (rfe) obj;
        int t = nle.t(i << 3);
        int c2 = rfeVar.c();
        if (c2 == -1) {
            c2 = zyeVar.zzb(rfeVar);
            rfeVar.b(c2);
        }
        return mle.a(c2, c2, t);
    }

    public static int b(int i, List list, zye zyeVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = nle.m(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            rfe rfeVar = (rfe) list.get(i2);
            int c2 = rfeVar.c();
            if (c2 == -1) {
                c2 = zyeVar.zzb(rfeVar);
                rfeVar.b(c2);
            }
            m = mle.a(c2, c2, m);
        }
        return m;
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof ute) {
            ute uteVar = (ute) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += nle.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static o1f d(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (o1f) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void e(int i, List list, eod eodVar) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            byte[] bArr = nleVar.b;
            if (list instanceof hte) {
                hte hteVar = (hte) list;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object d2 = hteVar.d(i2);
                    if (d2 instanceof String) {
                        String str = (String) d2;
                        nleVar.c(i, 2);
                        int i3 = nleVar.d;
                        try {
                            int t = nle.t(str.length() * 3);
                            int t2 = nle.t(str.length());
                            if (t2 == t) {
                                int i4 = i3 + t2;
                                nleVar.d = i4;
                                int b2 = s2f.a.b(str, bArr, i4, nleVar.e());
                                nleVar.d = i3;
                                nleVar.g((b2 - i3) - t2);
                                nleVar.d = b2;
                            } else {
                                nleVar.g(s2f.a(str));
                                nleVar.d = s2f.a.b(str, bArr, nleVar.d, nleVar.e());
                            }
                        } catch (b3f e) {
                            nleVar.d = i3;
                            nle.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                            byte[] bytes = str.getBytes(iqe.a);
                            try {
                                nleVar.g(bytes.length);
                                nleVar.k(bytes, 0, bytes.length);
                            } catch (IndexOutOfBoundsException e2) {
                                throw new ole(e2);
                            } catch (ole e3) {
                                throw e3;
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            throw new ole(e4);
                        }
                    } else {
                        tke tkeVar = (tke) d2;
                        nleVar.c(i, 2);
                        nleVar.g(tkeVar.i());
                        nleVar.k(tkeVar.b, tkeVar.m(), tkeVar.i());
                    }
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str2 = (String) list.get(i5);
                nleVar.c(i, 2);
                int i6 = nleVar.d;
                try {
                    int t3 = nle.t(str2.length() * 3);
                    int t4 = nle.t(str2.length());
                    if (t4 == t3) {
                        int i7 = i6 + t4;
                        nleVar.d = i7;
                        int b3 = s2f.a.b(str2, bArr, i7, nleVar.e());
                        nleVar.d = i6;
                        nleVar.g((b3 - i6) - t4);
                        nleVar.d = b3;
                    } else {
                        nleVar.g(s2f.a(str2));
                        nleVar.d = s2f.a.b(str2, bArr, nleVar.d, nleVar.e());
                    }
                } catch (b3f e5) {
                    nleVar.d = i6;
                    nle.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes2 = str2.getBytes(iqe.a);
                    try {
                        nleVar.g(bytes2.length);
                        nleVar.k(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e6) {
                        throw new ole(e6);
                    } catch (ole e7) {
                        throw e7;
                    }
                } catch (IndexOutOfBoundsException e8) {
                    throw new ole(e8);
                }
            }
        }
    }

    public static void f(int i, List list, eod eodVar, zye zyeVar) {
        if (list != null && !list.isEmpty()) {
            eodVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                eodVar.a(i, list.get(i2), zyeVar);
            }
        }
    }

    public static void g(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            int i2 = 0;
            if (z) {
                nleVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                nleVar.g(i3);
                while (i2 < list.size()) {
                    nleVar.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue());
                nleVar.c(i, 1);
                nleVar.j(doubleToRawLongBits);
                i2++;
            }
        }
    }

    public static void h(o1f o1fVar, qpe qpeVar, qpe qpeVar2) {
        o1fVar.getClass();
        s1f s1fVar = qpeVar.zzb;
        s1f s1fVar2 = qpeVar2.zzb;
        if (!s1fVar2.equals(s1f.f)) {
            int i = s1fVar.a + s1fVar2.a;
            int[] copyOf = Arrays.copyOf(s1fVar.b, i);
            System.arraycopy(s1fVar2.b, 0, copyOf, s1fVar.a, s1fVar2.a);
            Object[] copyOf2 = Arrays.copyOf(s1fVar.c, i);
            System.arraycopy(s1fVar2.c, 0, copyOf2, s1fVar.a, s1fVar2.a);
            s1fVar = new s1f(i, copyOf, copyOf2, true);
        }
        qpeVar.zzb = s1fVar;
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
        int m = nle.m(i) * size;
        if (list instanceof hte) {
            hte hteVar = (hte) list;
            while (i2 < size) {
                Object d2 = hteVar.d(i2);
                if (d2 instanceof tke) {
                    int i3 = ((tke) d2).i();
                    m = mle.a(i3, i3, m);
                } else {
                    m = nle.f((String) d2) + m;
                }
                i2++;
            }
            return m;
        }
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof tke) {
                int i4 = ((tke) obj).i();
                m = mle.a(i4, i4, m);
            } else {
                m = nle.f((String) obj) + m;
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
        if (list instanceof ute) {
            ute uteVar = (ute) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += nle.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void l(int i, List list, eod eodVar) {
        if (list != null && !list.isEmpty()) {
            eodVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                nle nleVar = (nle) eodVar.b;
                tke tkeVar = (tke) list.get(i2);
                nleVar.c(i, 2);
                nleVar.g(tkeVar.i());
                nleVar.k(tkeVar.b, tkeVar.m(), tkeVar.i());
            }
        }
    }

    public static void m(int i, List list, eod eodVar, zye zyeVar) {
        if (list != null && !list.isEmpty()) {
            eodVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                eodVar.c(i, list.get(i2), zyeVar);
            }
        }
    }

    public static void n(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            int i2 = 0;
            if (z) {
                nleVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                nleVar.g(i3);
                while (i2 < list.size()) {
                    nleVar.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int floatToRawIntBits = Float.floatToRawIntBits(((Float) list.get(i2)).floatValue());
                nleVar.c(i, 5);
                nleVar.l(floatToRawIntBits);
                i2++;
            }
        }
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = nle.m(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = ((tke) list.get(i2)).i();
            m = mle.a(i3, i3, m);
        }
        return m;
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (list instanceof ute) {
                ts2.t(list);
                if (size > 0) {
                    throw null;
                }
            } else {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += nle.o((longValue << 1) ^ (longValue >> 63));
                }
                return i;
            }
        }
        return 0;
    }

    public static void q(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += nle.o(((Long) list.get(i3)).longValue());
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    nleVar.d(((Long) list.get(i4)).longValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue = ((Long) list.get(i5)).longValue();
                nleVar.c(i, 0);
                nleVar.d(longValue);
            }
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zpe) {
            zpe zpeVar = (zpe) list;
            int i2 = 0;
            while (i < size) {
                zpeVar.j(i);
                i2 += nle.p(zpeVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += nle.p(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static void s(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += nle.o(((Long) list.get(i3)).longValue());
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    nleVar.d(((Long) list.get(i4)).longValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue = ((Long) list.get(i5)).longValue();
                nleVar.c(i, 0);
                nleVar.d(longValue);
            }
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zpe) {
            zpe zpeVar = (zpe) list;
            int i2 = 0;
            while (i < size) {
                zpeVar.j(i);
                i2 += nle.p(zpeVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += nle.p(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static void u(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            if (z) {
                nleVar.c(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    long longValue = ((Long) list.get(i3)).longValue();
                    i2 += nle.o((longValue << 1) ^ (longValue >> 63));
                }
                nleVar.g(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue2 = ((Long) list.get(i4)).longValue();
                    nleVar.d((longValue2 << 1) ^ (longValue2 >> 63));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                nleVar.c(i, 0);
                nleVar.d((longValue3 << 1) ^ (longValue3 >> 63));
            }
        }
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zpe) {
            zpe zpeVar = (zpe) list;
            int i2 = 0;
            while (i < size) {
                zpeVar.j(i);
                i2 += nle.t(zpeVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += nle.t(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static void w(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            int i2 = 0;
            if (z) {
                nleVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                nleVar.g(i3);
                while (i2 < list.size()) {
                    nleVar.j(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                nleVar.c(i, 1);
                nleVar.j(longValue);
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
        if (list instanceof zpe) {
            zpe zpeVar = (zpe) list;
            int i2 = 0;
            while (i < size) {
                zpeVar.j(i);
                int i3 = zpeVar.b[i];
                i2 += nle.t((i3 << 1) ^ (i3 >> 31));
                i++;
            }
            return i2;
        }
        int i4 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i4 += nle.t((intValue << 1) ^ (intValue >> 31));
            i++;
        }
        return i4;
    }

    public static void y(int i, List list, eod eodVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nle nleVar = (nle) eodVar.b;
            int i2 = 0;
            if (z) {
                nleVar.c(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                nleVar.g(i3);
                while (i2 < list.size()) {
                    nleVar.j(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                nleVar.c(i, 1);
                nleVar.j(longValue);
                i2++;
            }
        }
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return nle.v(i) * size;
    }
}
