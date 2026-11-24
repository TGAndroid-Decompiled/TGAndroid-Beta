package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
public final class o37 implements nq9 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final fs4 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final kj7 j;
    public final d56 k;
    public final t5c l;
    public final di6 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public o37(int[] iArr, Object[] objArr, int i, int i2, fs4 fs4Var, int[] iArr2, int i3, int i4, kj7 kj7Var, d56 d56Var, t5c t5cVar, c74 c74Var, di6 di6Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = ug8.A(fs4Var);
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = kj7Var;
        this.k = d56Var;
        this.l = t5cVar;
        this.e = fs4Var;
        this.m = di6Var;
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
            StringBuilder p = ug8.p("Field ", str, " for ");
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
        if (obj instanceof fs4) {
            return ((fs4) obj).g();
        }
        return true;
    }

    public static defpackage.o37 w(defpackage.iz8 r32, defpackage.kj7 r33, defpackage.d56 r34, defpackage.t5c r35, defpackage.c74 r36, defpackage.di6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o37.w(iz8, kj7, d56, t5c, c74, di6):o37");
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) d6c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) d6c.h(obj, j)).longValue();
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

    public final void B(Object obj, long j, af0 af0Var, nq9 nq9Var, b74 b74Var) {
        int u;
        this.k.getClass();
        lp5 a = d56.a(obj, j);
        ak2 ak2Var = (ak2) af0Var.d;
        int i = af0Var.a;
        if ((i & 7) == 3) {
            do {
                fs4 a2 = nq9Var.a();
                af0Var.e(a2, nq9Var, b74Var);
                nq9Var.c(a2);
                a.add(a2);
                if (!ak2Var.c() && af0Var.c == 0) {
                    u = ak2Var.u();
                } else {
                    return;
                }
            } while (u == i);
            af0Var.c = u;
            return;
        }
        throw zp5.b();
    }

    public final void C(Object obj, int i, af0 af0Var, nq9 nq9Var, b74 b74Var) {
        int u;
        this.k.getClass();
        lp5 a = d56.a(obj, i & 1048575);
        ak2 ak2Var = (ak2) af0Var.d;
        int i2 = af0Var.a;
        if ((i2 & 7) == 2) {
            do {
                fs4 a2 = nq9Var.a();
                af0Var.f(a2, nq9Var, b74Var);
                nq9Var.c(a2);
                a.add(a2);
                if (!ak2Var.c() && af0Var.c == 0) {
                    u = ak2Var.u();
                } else {
                    return;
                }
            } while (u == i2);
            af0Var.c = u;
            return;
        }
        throw zp5.b();
    }

    public final void D(int i, af0 af0Var, Object obj) {
        ak2 ak2Var = (ak2) af0Var.d;
        if ((536870912 & i) != 0) {
            af0Var.B(2);
            d6c.o(obj, i & 1048575, ak2Var.t());
            return;
        }
        int i2 = i & 1048575;
        if (this.f) {
            af0Var.B(2);
            d6c.o(obj, i2, ak2Var.s());
            return;
        }
        d6c.o(obj, i2, af0Var.h());
    }

    public final void E(int i, af0 af0Var, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        d56 d56Var = this.k;
        int i2 = i & 1048575;
        if (z) {
            d56Var.getClass();
            af0Var.v(d56.a(obj, i2), true);
            return;
        }
        d56Var.getClass();
        af0Var.v(d56.a(obj, i2), false);
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        d6c.m(obj, d6c.f(obj, j) | (1 << (i2 >>> 20)), j);
    }

    public final void H(int i, int i2, Object obj) {
        d6c.m(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    @Override
    public final fs4 a() {
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
                                c6c c6cVar = d6c.c;
                                obj3 = obj;
                                c6cVar.f(obj3, j, c6cVar.b(obj2, j));
                                G(i, obj3);
                                continue;
                                i += 3;
                                obj = obj3;
                            }
                            break;
                        case 1:
                            if (n(i, obj2)) {
                                c6c c6cVar2 = d6c.c;
                                c6cVar2.g(obj, j, c6cVar2.c(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i, obj2)) {
                                d6c.n(obj, j, d6c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i, obj2)) {
                                d6c.n(obj, j, d6c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i, obj2)) {
                                d6c.m(obj, d6c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i, obj2)) {
                                d6c.n(obj, j, d6c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i, obj2)) {
                                d6c.m(obj, d6c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i, obj2)) {
                                c6c c6cVar3 = d6c.c;
                                c6cVar3.d(obj, j, c6cVar3.a(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i, obj2)) {
                                d6c.o(obj, j, d6c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(i, obj, obj2);
                            break;
                        case 10:
                            if (n(i, obj2)) {
                                d6c.o(obj, j, d6c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i, obj2)) {
                                d6c.m(obj, d6c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i, obj2)) {
                                d6c.m(obj, d6c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i, obj2)) {
                                d6c.m(obj, d6c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i, obj2)) {
                                d6c.n(obj, j, d6c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i, obj2)) {
                                d6c.m(obj, d6c.f(obj2, j), j);
                                G(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i, obj2)) {
                                d6c.n(obj, j, d6c.g(obj2, j));
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
                            lp5 lp5Var = (lp5) d6c.h(obj, j);
                            lp5 lp5Var2 = (lp5) d6c.h(obj2, j);
                            int size = lp5Var.size();
                            int size2 = lp5Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((s3) lp5Var).a) {
                                    lp5Var = ((gt8) lp5Var).j(size2 + size);
                                }
                                lp5Var.addAll(lp5Var2);
                            }
                            if (size > 0) {
                                lp5Var2 = lp5Var;
                            }
                            d6c.o(obj, j, lp5Var2);
                            break;
                        case 50:
                            Class cls = qq9.a;
                            Object h = d6c.h(obj, j);
                            Object h2 = d6c.h(obj2, j);
                            this.m.getClass();
                            d6c.o(obj, j, di6.a(h, h2));
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
                                d6c.o(obj, j, d6c.h(obj2, j));
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
                                d6c.o(obj, j, d6c.h(obj2, j));
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
                    qq9.k(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            w26.i(obj, "Mutating immutable message: ");
        }
    }

    @Override
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof fs4) {
                fs4 fs4Var = (fs4) obj;
                fs4Var.k(Integer.MAX_VALUE);
                fs4Var.memoizedHashCode = 0;
                fs4Var.h();
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
                                s3 s3Var = (s3) ((lp5) d6c.h(obj, j));
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
                                    ((ci6) object).a = false;
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
            s5c s5cVar = ((fs4) obj).unknownFields;
            if (s5cVar.e) {
                s5cVar.e = false;
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
                                    Object h = d6c.h(obj, J & 1048575);
                                    this.m.getClass();
                                    ci6 ci6Var = (ci6) h;
                                    if (ci6Var.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((iyc) ((bi6) this.b[(i2 / 3) << 1]).a.c).a == lyc.r) {
                                            nq9 nq9Var = null;
                                            for (Object obj2 : ci6Var.values()) {
                                                if (nq9Var == null) {
                                                    nq9Var = ft8.c.a(obj2.getClass());
                                                }
                                                if (!nq9Var.d(obj2)) {
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
                            if (q(i8, i2, obj) && !m(i2).d(d6c.h(obj, J & 1048575))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) d6c.h(obj, J & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        nq9 m = m(i2);
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
                    if (o(obj, i2, i, i3, i11) && !m(i2).d(d6c.h(obj, J & 1048575))) {
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
    public final boolean e(defpackage.fs4 r12, defpackage.fs4 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o37.e(fs4, fs4):boolean");
    }

    @Override
    public final int f(defpackage.fs4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o37.f(fs4):int");
    }

    @Override
    public final int g(fs4 fs4Var) {
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
        o37 o37Var = this;
        fs4 fs4Var2 = fs4Var;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = o37Var.a;
            if (i8 < iArr.length) {
                int J = o37Var.J(i8);
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
                            i9 = unsafe.getInt(fs4Var2, i14);
                        }
                        i11 = i14;
                    }
                    i = 1 << (i13 >>> 20);
                } else {
                    i = 0;
                }
                long j = J & 1048575;
                if (I >= y84.b.a) {
                    byte b = y84.c.a;
                }
                switch (I) {
                    case 0:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            g = ck2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            g2 = ck2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        o37Var = this;
                        fs4Var2 = fs4Var;
                        break;
                    case 2:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            long j2 = unsafe.getLong(fs4Var2, j);
                            g3 = ck2.g(i12);
                            i2 = ck2.i(j2);
                            i10 += i2 + g3;
                        }
                        o37Var = this;
                        break;
                    case 3:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            long j3 = unsafe.getLong(fs4Var2, j);
                            g3 = ck2.g(i12);
                            i2 = ck2.i(j3);
                            i10 += i2 + g3;
                        }
                        o37Var = this;
                        break;
                    case 4:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            int i15 = unsafe.getInt(fs4Var2, j);
                            g4 = ck2.g(i12);
                            i3 = ck2.i(i15);
                            i10 += i3 + g4;
                        }
                        o37Var = this;
                        break;
                    case 5:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            g5 = ck2.g(i12);
                            g6 = g5 + 8;
                            i10 += g6;
                        }
                        o37Var = this;
                        fs4Var2 = fs4Var;
                        break;
                    case 6:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            g2 = ck2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        o37Var = this;
                        fs4Var2 = fs4Var;
                        break;
                    case 7:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            g6 = ck2.g(i12) + 1;
                            i10 += g6;
                        }
                        o37Var = this;
                        fs4Var2 = fs4Var;
                        break;
                    case 8:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            Object object = unsafe.getObject(fs4Var2, j);
                            if (object instanceof f51) {
                                int g17 = ck2.g(i12);
                                int size3 = ((f51) object).size();
                                f = ls6.f(size3, size3, g17, i10);
                            } else {
                                f = ck2.f((String) object) + ck2.g(i12) + i10;
                            }
                            i10 = f;
                        }
                        o37Var = this;
                        break;
                    case 9:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            Object object2 = unsafe.getObject(fs4Var2, j);
                            nq9 m = o37Var.m(i8);
                            Class cls = qq9.a;
                            g7 = ck2.g(i12);
                            a = ((o3) object2).a(m);
                            i10 = ls6.f(a, a, g7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            int g18 = ck2.g(i12);
                            int size4 = ((f51) unsafe.getObject(fs4Var2, j)).size();
                            i10 = ls6.f(size4, size4, g18, i10);
                        }
                        o37Var = this;
                        break;
                    case 11:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            int i16 = unsafe.getInt(fs4Var2, j);
                            g4 = ck2.g(i12);
                            i3 = ck2.h(i16);
                            i10 += i3 + g4;
                        }
                        o37Var = this;
                        break;
                    case 12:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            int i17 = unsafe.getInt(fs4Var2, j);
                            g4 = ck2.g(i12);
                            i3 = ck2.i(i17);
                            i10 += i3 + g4;
                        }
                        o37Var = this;
                        break;
                    case 13:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            g2 = ck2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        o37Var = this;
                        fs4Var2 = fs4Var;
                        break;
                    case 14:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            g5 = ck2.g(i12);
                            g6 = g5 + 8;
                            i10 += g6;
                        }
                        o37Var = this;
                        fs4Var2 = fs4Var;
                        break;
                    case 15:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            int i18 = unsafe.getInt(fs4Var2, j);
                            g4 = ck2.g(i12);
                            i3 = ck2.h((i18 << 1) ^ (i18 >> 31));
                            i10 += i3 + g4;
                        }
                        o37Var = this;
                        break;
                    case 16:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            long j4 = unsafe.getLong(fs4Var2, j);
                            g3 = ck2.g(i12);
                            i2 = ck2.i((j4 << 1) ^ (j4 >> 63));
                            i10 += i2 + g3;
                        }
                        o37Var = this;
                        break;
                    case 17:
                        if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                            nq9 m2 = o37Var.m(i8);
                            g8 = ck2.g(i12) << 1;
                            a2 = ((o3) unsafe.getObject(fs4Var2, j)).a(m2);
                            c = a2 + g8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c = qq9.c(i12, (List) unsafe.getObject(fs4Var2, j));
                        i10 += c;
                        break;
                    case 19:
                        c = qq9.b(i12, (List) unsafe.getObject(fs4Var2, j));
                        i10 += c;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(fs4Var2, j);
                        Class cls2 = qq9.a;
                        if (list.size() != 0) {
                            g9 = (ck2.g(i12) * list.size()) + qq9.e(list);
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 21:
                        List list2 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls3 = qq9.a;
                        size = list2.size();
                        if (size != 0) {
                            i4 = qq9.i(list2);
                            g10 = ck2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 22:
                        List list3 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls4 = qq9.a;
                        size = list3.size();
                        if (size != 0) {
                            i4 = qq9.d(list3);
                            g10 = ck2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 23:
                        c = qq9.c(i12, (List) unsafe.getObject(fs4Var2, j));
                        i10 += c;
                        break;
                    case 24:
                        c = qq9.b(i12, (List) unsafe.getObject(fs4Var2, j));
                        i10 += c;
                        break;
                    case 25:
                        Class cls5 = qq9.a;
                        int size5 = ((List) unsafe.getObject(fs4Var2, j)).size();
                        if (size5 == 0) {
                            g11 = 0;
                        } else {
                            g11 = (ck2.g(i12) + 1) * size5;
                        }
                        i10 += g11;
                        break;
                    case 26:
                        List list4 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls6 = qq9.a;
                        int size6 = list4.size();
                        if (size6 != 0) {
                            g9 = ck2.g(i12) * size6;
                            if (list4 instanceof h06) {
                                h06 h06Var = (h06) list4;
                                for (int i19 = 0; i19 < size6; i19++) {
                                    Object a3 = h06Var.a();
                                    if (a3 instanceof f51) {
                                        int size7 = ((f51) a3).size();
                                        g9 = ck2.h(size7) + size7 + g9;
                                    } else {
                                        g9 = ck2.f((String) a3) + g9;
                                    }
                                }
                            } else {
                                for (int i20 = 0; i20 < size6; i20++) {
                                    Object obj = list4.get(i20);
                                    if (obj instanceof f51) {
                                        int size8 = ((f51) obj).size();
                                        g9 = ck2.h(size8) + size8 + g9;
                                    } else {
                                        g9 = ck2.f((String) obj) + g9;
                                    }
                                }
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 27:
                        List list5 = (List) unsafe.getObject(fs4Var2, j);
                        nq9 m3 = o37Var.m(i8);
                        Class cls7 = qq9.a;
                        int size9 = list5.size();
                        if (size9 == 0) {
                            g12 = 0;
                        } else {
                            g12 = ck2.g(i12) * size9;
                            for (int i21 = 0; i21 < size9; i21++) {
                                int a4 = ((o3) list5.get(i21)).a(m3);
                                g12 += ck2.h(a4) + a4;
                            }
                        }
                        i10 += g12;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls8 = qq9.a;
                        int size10 = list6.size();
                        if (size10 != 0) {
                            g9 = ck2.g(i12) * size10;
                            for (int i22 = 0; i22 < list6.size(); i22++) {
                                int size11 = ((f51) list6.get(i22)).size();
                                g9 += ck2.h(size11) + size11;
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 29:
                        List list7 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls9 = qq9.a;
                        size = list7.size();
                        if (size != 0) {
                            i4 = qq9.h(list7);
                            g10 = ck2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 30:
                        List list8 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls10 = qq9.a;
                        size = list8.size();
                        if (size != 0) {
                            i4 = qq9.a(list8);
                            g10 = ck2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 31:
                        c = qq9.b(i12, (List) unsafe.getObject(fs4Var2, j));
                        i10 += c;
                        break;
                    case 32:
                        c = qq9.c(i12, (List) unsafe.getObject(fs4Var2, j));
                        i10 += c;
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls11 = qq9.a;
                        size = list9.size();
                        if (size != 0) {
                            i4 = qq9.f(list9);
                            g10 = ck2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 34:
                        List list10 = (List) unsafe.getObject(fs4Var2, j);
                        Class cls12 = qq9.a;
                        size = list10.size();
                        if (size != 0) {
                            i4 = qq9.g(list10);
                            g10 = ck2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 35:
                        Class cls13 = qq9.a;
                        size2 = ((List) unsafe.getObject(fs4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        Class cls14 = qq9.a;
                        size2 = ((List) unsafe.getObject(fs4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        size2 = qq9.e((List) unsafe.getObject(fs4Var2, j));
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        size2 = qq9.i((List) unsafe.getObject(fs4Var2, j));
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        size2 = qq9.d((List) unsafe.getObject(fs4Var2, j));
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        Class cls15 = qq9.a;
                        size2 = ((List) unsafe.getObject(fs4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        Class cls16 = qq9.a;
                        size2 = ((List) unsafe.getObject(fs4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls17 = qq9.a;
                        size2 = ((List) unsafe.getObject(fs4Var2, j)).size();
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        size2 = qq9.h((List) unsafe.getObject(fs4Var2, j));
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        size2 = qq9.a((List) unsafe.getObject(fs4Var2, j));
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        Class cls18 = qq9.a;
                        size2 = ((List) unsafe.getObject(fs4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        Class cls19 = qq9.a;
                        size2 = ((List) unsafe.getObject(fs4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        size2 = qq9.f((List) unsafe.getObject(fs4Var2, j));
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        size2 = qq9.g((List) unsafe.getObject(fs4Var2, j));
                        if (size2 > 0) {
                            g13 = ck2.g(i12);
                            i10 = ls6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(fs4Var2, j);
                        nq9 m4 = o37Var.m(i8);
                        Class cls20 = qq9.a;
                        int size12 = list11.size();
                        if (size12 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i23 = 0; i23 < size12; i23++) {
                                i5 += ((o3) list11.get(i23)).a(m4) + (ck2.g(i12) << 1);
                            }
                        }
                        i10 += i5;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(fs4Var2, j);
                        Object obj2 = o37Var.b[(i8 / 3) << 1];
                        o37Var.m.getClass();
                        ci6 ci6Var = (ci6) object3;
                        bi6 bi6Var = (bi6) obj2;
                        if (!ci6Var.isEmpty()) {
                            g9 = 0;
                            for (Map.Entry entry : ci6Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                bi6Var.getClass();
                                int g19 = ck2.g(i12);
                                int a5 = bi6.a(bi6Var.a, key, value);
                                g9 = ls6.f(a5, a5, g19, g9);
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 51:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            g = ck2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            g14 = ck2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            long z = z(fs4Var2, j);
                            g15 = ck2.g(i12);
                            i6 = ck2.i(z);
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            long z2 = z(fs4Var2, j);
                            g15 = ck2.g(i12);
                            i6 = ck2.i(z2);
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            int y = y(fs4Var2, j);
                            g16 = ck2.g(i12);
                            i7 = ck2.i(y);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            g = ck2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            g14 = ck2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            c = ck2.g(i12) + 1;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            Object object4 = unsafe.getObject(fs4Var2, j);
                            if (object4 instanceof f51) {
                                int g20 = ck2.g(i12);
                                int size13 = ((f51) object4).size();
                                f2 = ls6.f(size13, size13, g20, i10);
                            } else {
                                f2 = ck2.f((String) object4) + ck2.g(i12) + i10;
                            }
                            i10 = f2;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            Object object5 = unsafe.getObject(fs4Var2, j);
                            nq9 m5 = o37Var.m(i8);
                            Class cls21 = qq9.a;
                            g7 = ck2.g(i12);
                            a = ((o3) object5).a(m5);
                            i10 = ls6.f(a, a, g7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            int g21 = ck2.g(i12);
                            int size14 = ((f51) unsafe.getObject(fs4Var2, j)).size();
                            i10 = ls6.f(size14, size14, g21, i10);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            int y2 = y(fs4Var2, j);
                            g16 = ck2.g(i12);
                            i7 = ck2.h(y2);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            int y3 = y(fs4Var2, j);
                            g16 = ck2.g(i12);
                            i7 = ck2.i(y3);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            g14 = ck2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            g = ck2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            int y4 = y(fs4Var2, j);
                            g16 = ck2.g(i12);
                            i7 = ck2.h((y4 << 1) ^ (y4 >> 31));
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            long z3 = z(fs4Var2, j);
                            g15 = ck2.g(i12);
                            i6 = ck2.i((z3 << 1) ^ (z3 >> 63));
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (o37Var.q(i12, i8, fs4Var2)) {
                            nq9 m6 = o37Var.m(i8);
                            g8 = ck2.g(i12) << 1;
                            a2 = ((o3) unsafe.getObject(fs4Var2, j)).a(m6);
                            c = a2 + g8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
            } else {
                o37Var.l.getClass();
                return fs4Var2.unknownFields.b() + i10;
            }
        }
    }

    @Override
    public final void h(java.lang.Object r21, defpackage.af0 r22, defpackage.b74 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o37.h(java.lang.Object, af0, b74):void");
    }

    @Override
    public final void i(Object obj, l69 l69Var) {
        int i;
        int i2;
        int i3;
        o37 o37Var = this;
        l69Var.getClass();
        ck2 ck2Var = (ck2) l69Var.b;
        int[] iArr = o37Var.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int J = o37Var.J(i6);
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
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.s(i8, Double.doubleToRawLongBits(d6c.c.b(obj, j)));
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 1:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.q(i8, Float.floatToRawIntBits(d6c.c.c(obj, j)));
                        break;
                    }
                    break;
                case 2:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 5:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.n(i8, d6c.c.a(obj, j));
                        break;
                    }
                    break;
                case 8:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ck2Var.y(i8, (String) object);
                            break;
                        } else {
                            ck2Var.o(i8, (f51) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.x(i8, (o3) unsafe.getObject(obj, j), o37Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 10:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.o(i8, (f51) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.B(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 12:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 13:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        ck2Var.B(i8, (i12 << 1) ^ (i12 >> 31));
                        break;
                    }
                    break;
                case 16:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        ck2Var.D(i8, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        l69Var.L(i8, unsafe.getObject(obj, j), o37Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 18:
                    qq9.n(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 19:
                    qq9.r(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 20:
                    qq9.t(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 21:
                    qq9.z(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 22:
                    qq9.s(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 23:
                    qq9.q(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 24:
                    qq9.p(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 25:
                    qq9.m(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = qq9.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        if (list instanceof h06) {
                            h06 h06Var = (h06) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object a = h06Var.a();
                                if (a instanceof String) {
                                    ck2Var.y(i13, (String) a);
                                } else {
                                    ck2Var.o(i13, (f51) a);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                ck2Var.y(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 27:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    nq9 m = o37Var.m(i6);
                    Class cls2 = qq9.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            ck2Var.x(i16, (o3) list2.get(i17), m);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = qq9.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ck2Var.o(i18, (f51) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 29:
                    qq9.y(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 30:
                    qq9.o(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 31:
                    qq9.u(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 32:
                    qq9.v(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 33:
                    qq9.w(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 34:
                    qq9.x(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 35:
                    qq9.n(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 36:
                    qq9.r(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 37:
                    qq9.t(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 38:
                    qq9.z(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 39:
                    qq9.s(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 40:
                    qq9.q(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 41:
                    qq9.p(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 42:
                    qq9.m(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 43:
                    qq9.y(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 44:
                    qq9.o(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 45:
                    qq9.u(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 46:
                    qq9.v(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 47:
                    qq9.w(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 48:
                    qq9.x(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, true);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    nq9 m2 = o37Var.m(i6);
                    Class cls4 = qq9.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            l69Var.L(i20, list4.get(i21), m2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object obj2 = o37Var.b[(i6 / 3) << 1];
                        o37Var.m.getClass();
                        xl3 xl3Var = ((bi6) obj2).a;
                        for (Map.Entry entry : ((ci6) object2).entrySet()) {
                            ck2Var.A(i8, 2);
                            ck2Var.C(bi6.a(xl3Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            x84.b(ck2Var, (gyc) xl3Var.b, i, key);
                            x84.b(ck2Var, (iyc) xl3Var.c, 2, value);
                            i = 1;
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 51:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.s(i8, Double.doubleToRawLongBits(((Double) d6c.h(obj, j)).doubleValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 52:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.q(i8, Float.floatToRawIntBits(((Float) d6c.h(obj, j)).floatValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 53:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.D(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 54:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.D(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 55:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.u(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 56:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.s(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 57:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.q(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 58:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.n(i8, ((Boolean) d6c.h(obj, j)).booleanValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 59:
                    if (o37Var.q(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ck2Var.y(i8, (String) object3);
                        } else {
                            ck2Var.o(i8, (f51) object3);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 60:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.x(i8, (o3) unsafe.getObject(obj, j), o37Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 61:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.o(i8, (f51) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 62:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.B(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 63:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.u(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 64:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.q(i8, y(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 65:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.s(i8, z(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 66:
                    if (o37Var.q(i8, i6, obj)) {
                        int y = y(obj, j);
                        ck2Var.B(i8, (y << 1) ^ (y >> 31));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 67:
                    if (o37Var.q(i8, i6, obj)) {
                        long z = z(obj, j);
                        ck2Var.D(i8, (z << (i == 1 ? 1L : 0L)) ^ (z >> 63));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 68:
                    if (o37Var.q(i8, i6, obj)) {
                        l69Var.L(i8, unsafe.getObject(obj, j), o37Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                default:
                    i6 += 3;
                    i4 = 1048575;
            }
            o37Var = this;
            i6 += 3;
            i4 = 1048575;
        }
        o37Var.l.getClass();
        ((fs4) obj).unknownFields.d(l69Var);
    }

    public final boolean j(fs4 fs4Var, fs4 fs4Var2, int i) {
        if (n(i, fs4Var) == n(i, fs4Var2)) {
            return true;
        }
        return false;
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (d6c.h(obj, J(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        fyb.g();
    }

    public final nq9 m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        nq9 nq9Var = (nq9) objArr[i2];
        if (nq9Var != null) {
            return nq9Var;
        }
        nq9 a = ft8.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean n(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o37.n(int, java.lang.Object):boolean");
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
        if (d6c.f(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final void r(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.b74 r11, defpackage.af0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o37.r(java.lang.Object, int, java.lang.Object, b74, af0):void");
    }

    public final void s(int i, Object obj, Object obj2) {
        if (!n(i, obj2)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            nq9 m = m(i);
            if (!n(i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    fs4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                fs4 a2 = m.a();
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
            nq9 m = m(i);
            if (!q(i2, i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    fs4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                fs4 a2 = m.a();
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
        nq9 m = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        fs4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }

    public final Object v(int i, int i2, Object obj) {
        nq9 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        fs4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }
}
