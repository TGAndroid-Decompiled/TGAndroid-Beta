package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
public final class o57 implements os9 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final gu4 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final nl7 j;
    public final d76 k;
    public final t7c l;
    public final fk6 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public o57(int[] iArr, Object[] objArr, int i, int i2, gu4 gu4Var, int[] iArr2, int i3, int i4, nl7 nl7Var, d76 d76Var, t7c t7cVar, l84 l84Var, fk6 fk6Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = wi8.A(gu4Var);
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = nl7Var;
        this.k = d76Var;
        this.l = t7cVar;
        this.e = gu4Var;
        this.m = fk6Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder p = wi8.p("Field ", str, " for ");
            p.append(cls.getName());
            p.append(" not found. Known fields are ");
            p.append(Arrays.toString(declaredFields));
            throw new RuntimeException(p.toString());
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof gu4) {
            return ((gu4) obj).g();
        }
        return true;
    }

    public static defpackage.o57 w(defpackage.j19 r32, defpackage.nl7 r33, defpackage.d76 r34, defpackage.t7c r35, defpackage.l84 r36, defpackage.fk6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o57.w(j19, nl7, d76, t7c, l84, fk6):o57");
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) d8c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) d8c.h(obj, j)).longValue();
    }

    public final int A(int i) {
        if (i >= this.c && i <= this.d) {
            int[] iArr = this.a;
            int length = (iArr.length / 3) - 1;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void B(Object obj, long j, ag0 ag0Var, os9 os9Var, k84 k84Var) {
        int u;
        this.k.getClass();
        lr5 a = d76.a(obj, j);
        nl2 nl2Var = (nl2) ag0Var.d;
        int i = ag0Var.a;
        if ((i & 7) == 3) {
            do {
                gu4 a2 = os9Var.a();
                ag0Var.e(a2, os9Var, k84Var);
                os9Var.c(a2);
                a.add(a2);
                if (!nl2Var.c() && ag0Var.c == 0) {
                    u = nl2Var.u();
                } else {
                    return;
                }
            } while (u == i);
            ag0Var.c = u;
            return;
        }
        throw yr5.b();
    }

    public final void C(Object obj, int i, ag0 ag0Var, os9 os9Var, k84 k84Var) {
        int u;
        this.k.getClass();
        lr5 a = d76.a(obj, i & 1048575);
        nl2 nl2Var = (nl2) ag0Var.d;
        int i2 = ag0Var.a;
        if ((i2 & 7) == 2) {
            do {
                gu4 a2 = os9Var.a();
                ag0Var.f(a2, os9Var, k84Var);
                os9Var.c(a2);
                a.add(a2);
                if (!nl2Var.c() && ag0Var.c == 0) {
                    u = nl2Var.u();
                } else {
                    return;
                }
            } while (u == i2);
            ag0Var.c = u;
            return;
        }
        throw yr5.b();
    }

    public final void D(int i, ag0 ag0Var, Object obj) {
        nl2 nl2Var = (nl2) ag0Var.d;
        if ((536870912 & i) != 0) {
            ag0Var.B(2);
            d8c.o(obj, i & 1048575, nl2Var.t());
            return;
        }
        int i2 = i & 1048575;
        if (this.f) {
            ag0Var.B(2);
            d8c.o(obj, i2, nl2Var.s());
            return;
        }
        d8c.o(obj, i2, ag0Var.h());
    }

    public final void E(int i, ag0 ag0Var, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        d76 d76Var = this.k;
        int i2 = i & 1048575;
        if (z) {
            d76Var.getClass();
            ag0Var.v(d76.a(obj, i2), true);
            return;
        }
        d76Var.getClass();
        ag0Var.v(d76.a(obj, i2), false);
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        d8c.m(obj, d8c.f(obj, j) | (1 << (i2 >>> 20)), j);
    }

    public final void H(int i, int i2, Object obj) {
        d8c.m(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    @Override
    public final gu4 a() {
        this.j.getClass();
        return this.e.i();
    }

    @Override
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (p(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int J = J(i);
                    long j = 1048575 & J;
                    int i2 = iArr[i];
                    switch (I(J)) {
                        case 0:
                            if (n(i, obj2)) {
                                c8c c8cVar = d8c.c;
                                obj3 = obj;
                                c8cVar.f(obj3, j, c8cVar.b(obj2, j));
                                G(i, obj3);
                                continue;
                                i += 3;
                                obj = obj3;
                            }
                            break;
                        case 1:
                            if (n(i, obj2)) {
                                c8c c8cVar2 = d8c.c;
                                c8cVar2.g(obj, j, c8cVar2.c(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i, obj2)) {
                                d8c.n(obj, j, d8c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i, obj2)) {
                                d8c.n(obj, j, d8c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i, obj2)) {
                                d8c.m(obj, d8c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i, obj2)) {
                                d8c.n(obj, j, d8c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i, obj2)) {
                                d8c.m(obj, d8c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i, obj2)) {
                                c8c c8cVar3 = d8c.c;
                                c8cVar3.d(obj, j, c8cVar3.a(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i, obj2)) {
                                d8c.o(obj, j, d8c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(i, obj, obj2);
                            break;
                        case 10:
                            if (n(i, obj2)) {
                                d8c.o(obj, j, d8c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i, obj2)) {
                                d8c.m(obj, d8c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i, obj2)) {
                                d8c.m(obj, d8c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i, obj2)) {
                                d8c.m(obj, d8c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i, obj2)) {
                                d8c.n(obj, j, d8c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i, obj2)) {
                                d8c.m(obj, d8c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i, obj2)) {
                                d8c.n(obj, j, d8c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            s(i, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.k.getClass();
                            lr5 lr5Var = (lr5) d8c.h(obj, j);
                            lr5 lr5Var2 = (lr5) d8c.h(obj2, j);
                            int size = lr5Var.size();
                            int size2 = lr5Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((s3) lr5Var).a) {
                                    lr5Var = ((hv8) lr5Var).j(size2 + size);
                                }
                                lr5Var.addAll(lr5Var2);
                            }
                            if (size > 0) {
                                lr5Var2 = lr5Var;
                            }
                            d8c.o(obj, j, lr5Var2);
                            break;
                        case 50:
                            Class cls = rs9.a;
                            Object h = d8c.h(obj, j);
                            Object h2 = d8c.h(obj2, j);
                            this.m.getClass();
                            d8c.o(obj, j, fk6.a(h, h2));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (q(i2, i, obj2)) {
                                d8c.o(obj, j, d8c.h(obj2, j));
                                H(i2, i, obj);
                                break;
                            }
                            break;
                        case 60:
                            t(i, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (q(i2, i, obj2)) {
                                d8c.o(obj, j, d8c.h(obj2, j));
                                H(i2, i, obj);
                                break;
                            }
                            break;
                        case 68:
                            t(i, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    rs9.k(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            u36.i(obj, "Mutating immutable message: ");
        }
    }

    @Override
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof gu4) {
                gu4 gu4Var = (gu4) obj;
                gu4Var.k(Integer.MAX_VALUE);
                gu4Var.memoizedHashCode = 0;
                gu4Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int J = J(i);
                long j = 1048575 & J;
                int I = I(J);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.k.getClass();
                                s3 s3Var = (s3) ((lr5) d8c.h(obj, j));
                                if (s3Var.a) {
                                    s3Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((ek6) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).c(unsafe.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).c(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            s7c s7cVar = ((gu4) obj).unknownFields;
            if (s7cVar.e) {
                s7cVar.e = false;
            }
        }
    }

    @Override
    public final boolean d(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int J = J(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & J) == 0 || o(obj, i2, i, i3, i11)) {
                int I = I(J);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I != 60 && I != 68) {
                            if (I != 49) {
                                if (I == 50) {
                                    Object h = d8c.h(obj, J & 1048575);
                                    this.m.getClass();
                                    ek6 ek6Var = (ek6) h;
                                    if (ek6Var.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((j0d) ((dk6) this.b[(i2 / 3) << 1]).a.c).a == m0d.r) {
                                            os9 os9Var = null;
                                            for (Object obj2 : ek6Var.values()) {
                                                if (os9Var == null) {
                                                    os9Var = gv8.c.a(obj2.getClass());
                                                }
                                                if (!os9Var.d(obj2)) {
                                                }
                                            }
                                            continue;
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                i6++;
                                i4 = i;
                                i5 = i3;
                            }
                        } else {
                            if (q(i8, i2, obj) && !m(i2).d(d8c.h(obj, J & 1048575))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) d8c.h(obj, J & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        os9 m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.d(list.get(i13))) {
                            }
                        }
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (o(obj, i2, i, i3, i11) && !m(i2).d(d8c.h(obj, J & 1048575))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean e(defpackage.gu4 r12, defpackage.gu4 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o57.e(gu4, gu4):boolean");
    }

    @Override
    public final int f(defpackage.gu4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o57.f(gu4):int");
    }

    @Override
    public final void g(Object obj, k6d k6dVar) {
        int i;
        int i2;
        int i3;
        o57 o57Var = this;
        k6dVar.getClass();
        pl2 pl2Var = (pl2) k6dVar.b;
        int[] iArr = o57Var.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int J = o57Var.J(i6);
            int i8 = iArr[i6];
            int I = I(J);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    if (i10 == i4) {
                        i7 = 0;
                    } else {
                        i7 = unsafe.getInt(obj, i10);
                    }
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = J;
                i3 = i11;
            } else {
                i = 1;
                i2 = J;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (I) {
                case 0:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.s(i8, Double.doubleToRawLongBits(d8c.c.b(obj, j)));
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 1:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.q(i8, Float.floatToRawIntBits(d8c.c.c(obj, j)));
                        break;
                    }
                    break;
                case 2:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 5:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.n(i8, d8c.c.a(obj, j));
                        break;
                    }
                    break;
                case 8:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            pl2Var.y(i8, (String) object);
                            break;
                        } else {
                            pl2Var.o(i8, (m61) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.x(i8, (o3) unsafe.getObject(obj, j), o57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 10:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.o(i8, (m61) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.B(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 12:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 13:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        pl2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        pl2Var.B(i8, (i12 << 1) ^ (i12 >> 31));
                        break;
                    }
                    break;
                case 16:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        pl2Var.D(i8, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (o57Var.o(obj, i6, i5, i7, i3)) {
                        k6dVar.p1(i8, unsafe.getObject(obj, j), o57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 18:
                    rs9.n(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 19:
                    rs9.r(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 20:
                    rs9.t(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 21:
                    rs9.z(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 22:
                    rs9.s(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 23:
                    rs9.q(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 24:
                    rs9.p(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 25:
                    rs9.m(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = rs9.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        if (list instanceof h26) {
                            h26 h26Var = (h26) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object a = h26Var.a();
                                if (a instanceof String) {
                                    pl2Var.y(i13, (String) a);
                                } else {
                                    pl2Var.o(i13, (m61) a);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                pl2Var.y(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 27:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    os9 m = o57Var.m(i6);
                    Class cls2 = rs9.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            pl2Var.x(i16, (o3) list2.get(i17), m);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = rs9.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            pl2Var.o(i18, (m61) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 29:
                    rs9.y(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 30:
                    rs9.o(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 31:
                    rs9.u(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 32:
                    rs9.v(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 33:
                    rs9.w(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 34:
                    rs9.x(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 35:
                    rs9.n(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 36:
                    rs9.r(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 37:
                    rs9.t(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 38:
                    rs9.z(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 39:
                    rs9.s(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 40:
                    rs9.q(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 41:
                    rs9.p(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 42:
                    rs9.m(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 43:
                    rs9.y(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 44:
                    rs9.o(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 45:
                    rs9.u(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 46:
                    rs9.v(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 47:
                    rs9.w(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 48:
                    rs9.x(iArr[i6], (List) unsafe.getObject(obj, j), k6dVar, true);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    os9 m2 = o57Var.m(i6);
                    Class cls4 = rs9.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            k6dVar.p1(i20, list4.get(i21), m2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object obj2 = o57Var.b[(i6 / 3) << 1];
                        o57Var.m.getClass();
                        in3 in3Var = ((dk6) obj2).a;
                        for (Map.Entry entry : ((ek6) object2).entrySet()) {
                            pl2Var.A(i8, 2);
                            pl2Var.C(dk6.a(in3Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            xa4.b(pl2Var, (h0d) in3Var.b, i, key);
                            xa4.b(pl2Var, (j0d) in3Var.c, 2, value);
                            i = 1;
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 51:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.s(i8, Double.doubleToRawLongBits(((Double) d8c.h(obj, j)).doubleValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 52:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.q(i8, Float.floatToRawIntBits(((Float) d8c.h(obj, j)).floatValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 53:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.D(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 54:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.D(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 55:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.u(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 56:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.s(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 57:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.q(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 58:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.n(i8, ((Boolean) d8c.h(obj, j)).booleanValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 59:
                    if (o57Var.q(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            pl2Var.y(i8, (String) object3);
                        } else {
                            pl2Var.o(i8, (m61) object3);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 60:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.x(i8, (o3) unsafe.getObject(obj, j), o57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 61:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.o(i8, (m61) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 62:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.B(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 63:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.u(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 64:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.q(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 65:
                    if (o57Var.q(i8, i6, obj)) {
                        pl2Var.s(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 66:
                    if (o57Var.q(i8, i6, obj)) {
                        int y = y(obj, j);
                        pl2Var.B(i8, (y << 1) ^ (y >> 31));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 67:
                    if (o57Var.q(i8, i6, obj)) {
                        long z = z(obj, j);
                        pl2Var.D(i8, (z << (i == 1 ? 1L : 0L)) ^ (z >> 63));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 68:
                    if (o57Var.q(i8, i6, obj)) {
                        k6dVar.p1(i8, unsafe.getObject(obj, j), o57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                default:
                    i6 += 3;
                    i4 = 1048575;
            }
            o57Var = this;
            i6 += 3;
            i4 = 1048575;
        }
        o57Var.l.getClass();
        ((gu4) obj).unknownFields.d(k6dVar);
    }

    @Override
    public final int h(gu4 gu4Var) {
        int i;
        int g;
        int g2;
        int g3;
        int i2;
        int g4;
        int i3;
        int g5;
        int g6;
        int f;
        int g7;
        int a;
        int g8;
        int a2;
        int c;
        int g9;
        int size;
        int i4;
        int g10;
        int g11;
        int g12;
        int size2;
        int g13;
        int i5;
        int g14;
        int g15;
        int i6;
        int g16;
        int i7;
        int f2;
        o57 o57Var = this;
        gu4 gu4Var2 = gu4Var;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = o57Var.a;
            if (i8 < iArr.length) {
                int J = o57Var.J(i8);
                int I = I(J);
                int i12 = iArr[i8];
                int i13 = iArr[i8 + 2];
                int i14 = i13 & 1048575;
                Unsafe unsafe = o;
                if (I <= 17) {
                    if (i14 != i11) {
                        if (i14 == 1048575) {
                            i9 = 0;
                        } else {
                            i9 = unsafe.getInt(gu4Var2, i14);
                        }
                        i11 = i14;
                    }
                    i = 1 << (i13 >>> 20);
                } else {
                    i = 0;
                }
                long j = J & 1048575;
                if (I >= ya4.b.a) {
                    byte b = ya4.c.a;
                }
                switch (I) {
                    case 0:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            g = pl2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            g2 = pl2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        o57Var = this;
                        gu4Var2 = gu4Var;
                        break;
                    case 2:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            long j2 = unsafe.getLong(gu4Var2, j);
                            g3 = pl2.g(i12);
                            i2 = pl2.i(j2);
                            i10 += i2 + g3;
                        }
                        o57Var = this;
                        break;
                    case 3:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            long j3 = unsafe.getLong(gu4Var2, j);
                            g3 = pl2.g(i12);
                            i2 = pl2.i(j3);
                            i10 += i2 + g3;
                        }
                        o57Var = this;
                        break;
                    case 4:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            int i15 = unsafe.getInt(gu4Var2, j);
                            g4 = pl2.g(i12);
                            i3 = pl2.i(i15);
                            i10 += i3 + g4;
                        }
                        o57Var = this;
                        break;
                    case 5:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            g5 = pl2.g(i12);
                            g6 = g5 + 8;
                            i10 += g6;
                        }
                        o57Var = this;
                        gu4Var2 = gu4Var;
                        break;
                    case 6:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            g2 = pl2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        o57Var = this;
                        gu4Var2 = gu4Var;
                        break;
                    case 7:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            g6 = pl2.g(i12) + 1;
                            i10 += g6;
                        }
                        o57Var = this;
                        gu4Var2 = gu4Var;
                        break;
                    case 8:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            Object object = unsafe.getObject(gu4Var2, j);
                            if (object instanceof m61) {
                                int g17 = pl2.g(i12);
                                int size3 = ((m61) object).size();
                                f = kt6.f(size3, size3, g17, i10);
                            } else {
                                f = pl2.f((String) object) + pl2.g(i12) + i10;
                            }
                            i10 = f;
                        }
                        o57Var = this;
                        break;
                    case 9:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            Object object2 = unsafe.getObject(gu4Var2, j);
                            os9 m = o57Var.m(i8);
                            Class cls = rs9.a;
                            g7 = pl2.g(i12);
                            a = ((o3) object2).a(m);
                            i10 = kt6.f(a, a, g7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            int g18 = pl2.g(i12);
                            int size4 = ((m61) unsafe.getObject(gu4Var2, j)).size();
                            i10 = kt6.f(size4, size4, g18, i10);
                        }
                        o57Var = this;
                        break;
                    case 11:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            int i16 = unsafe.getInt(gu4Var2, j);
                            g4 = pl2.g(i12);
                            i3 = pl2.h(i16);
                            i10 += i3 + g4;
                        }
                        o57Var = this;
                        break;
                    case 12:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            int i17 = unsafe.getInt(gu4Var2, j);
                            g4 = pl2.g(i12);
                            i3 = pl2.i(i17);
                            i10 += i3 + g4;
                        }
                        o57Var = this;
                        break;
                    case 13:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            g2 = pl2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        o57Var = this;
                        gu4Var2 = gu4Var;
                        break;
                    case 14:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            g5 = pl2.g(i12);
                            g6 = g5 + 8;
                            i10 += g6;
                        }
                        o57Var = this;
                        gu4Var2 = gu4Var;
                        break;
                    case 15:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            int i18 = unsafe.getInt(gu4Var2, j);
                            g4 = pl2.g(i12);
                            i3 = pl2.h((i18 << 1) ^ (i18 >> 31));
                            i10 += i3 + g4;
                        }
                        o57Var = this;
                        break;
                    case 16:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            long j4 = unsafe.getLong(gu4Var2, j);
                            g3 = pl2.g(i12);
                            i2 = pl2.i((j4 << 1) ^ (j4 >> 63));
                            i10 += i2 + g3;
                        }
                        o57Var = this;
                        break;
                    case 17:
                        if (o57Var.o(gu4Var2, i8, i11, i9, i)) {
                            os9 m2 = o57Var.m(i8);
                            g8 = pl2.g(i12) << 1;
                            a2 = ((o3) unsafe.getObject(gu4Var2, j)).a(m2);
                            c = a2 + g8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c = rs9.c(i12, (List) unsafe.getObject(gu4Var2, j));
                        i10 += c;
                        break;
                    case 19:
                        c = rs9.b(i12, (List) unsafe.getObject(gu4Var2, j));
                        i10 += c;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(gu4Var2, j);
                        Class cls2 = rs9.a;
                        if (list.size() != 0) {
                            g9 = (pl2.g(i12) * list.size()) + rs9.e(list);
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 21:
                        List list2 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls3 = rs9.a;
                        size = list2.size();
                        if (size != 0) {
                            i4 = rs9.i(list2);
                            g10 = pl2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 22:
                        List list3 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls4 = rs9.a;
                        size = list3.size();
                        if (size != 0) {
                            i4 = rs9.d(list3);
                            g10 = pl2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 23:
                        c = rs9.c(i12, (List) unsafe.getObject(gu4Var2, j));
                        i10 += c;
                        break;
                    case 24:
                        c = rs9.b(i12, (List) unsafe.getObject(gu4Var2, j));
                        i10 += c;
                        break;
                    case 25:
                        Class cls5 = rs9.a;
                        int size5 = ((List) unsafe.getObject(gu4Var2, j)).size();
                        if (size5 == 0) {
                            g11 = 0;
                        } else {
                            g11 = (pl2.g(i12) + 1) * size5;
                        }
                        i10 += g11;
                        break;
                    case 26:
                        List list4 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls6 = rs9.a;
                        int size6 = list4.size();
                        if (size6 != 0) {
                            g9 = pl2.g(i12) * size6;
                            if (list4 instanceof h26) {
                                h26 h26Var = (h26) list4;
                                for (int i19 = 0; i19 < size6; i19++) {
                                    Object a3 = h26Var.a();
                                    if (a3 instanceof m61) {
                                        int size7 = ((m61) a3).size();
                                        g9 = pl2.h(size7) + size7 + g9;
                                    } else {
                                        g9 = pl2.f((String) a3) + g9;
                                    }
                                }
                            } else {
                                for (int i20 = 0; i20 < size6; i20++) {
                                    Object obj = list4.get(i20);
                                    if (obj instanceof m61) {
                                        int size8 = ((m61) obj).size();
                                        g9 = pl2.h(size8) + size8 + g9;
                                    } else {
                                        g9 = pl2.f((String) obj) + g9;
                                    }
                                }
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 27:
                        List list5 = (List) unsafe.getObject(gu4Var2, j);
                        os9 m3 = o57Var.m(i8);
                        Class cls7 = rs9.a;
                        int size9 = list5.size();
                        if (size9 == 0) {
                            g12 = 0;
                        } else {
                            g12 = pl2.g(i12) * size9;
                            for (int i21 = 0; i21 < size9; i21++) {
                                int a4 = ((o3) list5.get(i21)).a(m3);
                                g12 += pl2.h(a4) + a4;
                            }
                        }
                        i10 += g12;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls8 = rs9.a;
                        int size10 = list6.size();
                        if (size10 != 0) {
                            g9 = pl2.g(i12) * size10;
                            for (int i22 = 0; i22 < list6.size(); i22++) {
                                int size11 = ((m61) list6.get(i22)).size();
                                g9 += pl2.h(size11) + size11;
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 29:
                        List list7 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls9 = rs9.a;
                        size = list7.size();
                        if (size != 0) {
                            i4 = rs9.h(list7);
                            g10 = pl2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 30:
                        List list8 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls10 = rs9.a;
                        size = list8.size();
                        if (size != 0) {
                            i4 = rs9.a(list8);
                            g10 = pl2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 31:
                        c = rs9.b(i12, (List) unsafe.getObject(gu4Var2, j));
                        i10 += c;
                        break;
                    case 32:
                        c = rs9.c(i12, (List) unsafe.getObject(gu4Var2, j));
                        i10 += c;
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls11 = rs9.a;
                        size = list9.size();
                        if (size != 0) {
                            i4 = rs9.f(list9);
                            g10 = pl2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 34:
                        List list10 = (List) unsafe.getObject(gu4Var2, j);
                        Class cls12 = rs9.a;
                        size = list10.size();
                        if (size != 0) {
                            i4 = rs9.g(list10);
                            g10 = pl2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 35:
                        Class cls13 = rs9.a;
                        size2 = ((List) unsafe.getObject(gu4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        Class cls14 = rs9.a;
                        size2 = ((List) unsafe.getObject(gu4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        size2 = rs9.e((List) unsafe.getObject(gu4Var2, j));
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        size2 = rs9.i((List) unsafe.getObject(gu4Var2, j));
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        size2 = rs9.d((List) unsafe.getObject(gu4Var2, j));
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        Class cls15 = rs9.a;
                        size2 = ((List) unsafe.getObject(gu4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        Class cls16 = rs9.a;
                        size2 = ((List) unsafe.getObject(gu4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls17 = rs9.a;
                        size2 = ((List) unsafe.getObject(gu4Var2, j)).size();
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        size2 = rs9.h((List) unsafe.getObject(gu4Var2, j));
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        size2 = rs9.a((List) unsafe.getObject(gu4Var2, j));
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        Class cls18 = rs9.a;
                        size2 = ((List) unsafe.getObject(gu4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        Class cls19 = rs9.a;
                        size2 = ((List) unsafe.getObject(gu4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        size2 = rs9.f((List) unsafe.getObject(gu4Var2, j));
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        size2 = rs9.g((List) unsafe.getObject(gu4Var2, j));
                        if (size2 > 0) {
                            g13 = pl2.g(i12);
                            i10 = kt6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(gu4Var2, j);
                        os9 m4 = o57Var.m(i8);
                        Class cls20 = rs9.a;
                        int size12 = list11.size();
                        if (size12 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i23 = 0; i23 < size12; i23++) {
                                i5 += ((o3) list11.get(i23)).a(m4) + (pl2.g(i12) << 1);
                            }
                        }
                        i10 += i5;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(gu4Var2, j);
                        Object obj2 = o57Var.b[(i8 / 3) << 1];
                        o57Var.m.getClass();
                        ek6 ek6Var = (ek6) object3;
                        dk6 dk6Var = (dk6) obj2;
                        if (!ek6Var.isEmpty()) {
                            g9 = 0;
                            for (Map.Entry entry : ek6Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                dk6Var.getClass();
                                int g19 = pl2.g(i12);
                                int a5 = dk6.a(dk6Var.a, key, value);
                                g9 = kt6.f(a5, a5, g19, g9);
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 51:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            g = pl2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            g14 = pl2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            long z = z(gu4Var2, j);
                            g15 = pl2.g(i12);
                            i6 = pl2.i(z);
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            long z2 = z(gu4Var2, j);
                            g15 = pl2.g(i12);
                            i6 = pl2.i(z2);
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            int y = y(gu4Var2, j);
                            g16 = pl2.g(i12);
                            i7 = pl2.i(y);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            g = pl2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            g14 = pl2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            c = pl2.g(i12) + 1;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            Object object4 = unsafe.getObject(gu4Var2, j);
                            if (object4 instanceof m61) {
                                int g20 = pl2.g(i12);
                                int size13 = ((m61) object4).size();
                                f2 = kt6.f(size13, size13, g20, i10);
                            } else {
                                f2 = pl2.f((String) object4) + pl2.g(i12) + i10;
                            }
                            i10 = f2;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            Object object5 = unsafe.getObject(gu4Var2, j);
                            os9 m5 = o57Var.m(i8);
                            Class cls21 = rs9.a;
                            g7 = pl2.g(i12);
                            a = ((o3) object5).a(m5);
                            i10 = kt6.f(a, a, g7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            int g21 = pl2.g(i12);
                            int size14 = ((m61) unsafe.getObject(gu4Var2, j)).size();
                            i10 = kt6.f(size14, size14, g21, i10);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            int y2 = y(gu4Var2, j);
                            g16 = pl2.g(i12);
                            i7 = pl2.h(y2);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            int y3 = y(gu4Var2, j);
                            g16 = pl2.g(i12);
                            i7 = pl2.i(y3);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            g14 = pl2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            g = pl2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            int y4 = y(gu4Var2, j);
                            g16 = pl2.g(i12);
                            i7 = pl2.h((y4 << 1) ^ (y4 >> 31));
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            long z3 = z(gu4Var2, j);
                            g15 = pl2.g(i12);
                            i6 = pl2.i((z3 << 1) ^ (z3 >> 63));
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (o57Var.q(i12, i8, gu4Var2)) {
                            os9 m6 = o57Var.m(i8);
                            g8 = pl2.g(i12) << 1;
                            a2 = ((o3) unsafe.getObject(gu4Var2, j)).a(m6);
                            c = a2 + g8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
            } else {
                o57Var.l.getClass();
                return gu4Var2.unknownFields.b() + i10;
            }
        }
    }

    @Override
    public final void i(java.lang.Object r21, defpackage.ag0 r22, defpackage.k84 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o57.i(java.lang.Object, ag0, k84):void");
    }

    public final boolean j(gu4 gu4Var, gu4 gu4Var2, int i) {
        if (n(i, gu4Var) == n(i, gu4Var2)) {
            return true;
        }
        return false;
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (d8c.h(obj, J(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        rjb.p();
    }

    public final os9 m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        os9 os9Var = (os9) objArr[i2];
        if (os9Var != null) {
            return os9Var;
        }
        os9 a = gv8.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean n(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o57.n(int, java.lang.Object):boolean");
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i, int i2, Object obj) {
        if (d8c.f(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final void r(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.k84 r11, defpackage.ag0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o57.r(java.lang.Object, int, java.lang.Object, k84, ag0):void");
    }

    public final void s(int i, Object obj, Object obj2) {
        if (!n(i, obj2)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            os9 m = m(i);
            if (!n(i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    gu4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                gu4 a2 = m.a();
                m.b(a2, object2);
                unsafe.putObject(obj, J, a2);
                object2 = a2;
            }
            m.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!q(i2, i, obj2)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            os9 m = m(i);
            if (!q(i2, i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    gu4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                gu4 a2 = m.a();
                m.b(a2, object2);
                unsafe.putObject(obj, J, a2);
                object2 = a2;
            }
            m.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
    }

    public final Object u(int i, Object obj) {
        os9 m = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        gu4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }

    public final Object v(int i, int i2, Object obj) {
        os9 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        gu4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }
}
