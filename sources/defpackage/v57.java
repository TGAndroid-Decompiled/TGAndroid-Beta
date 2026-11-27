package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
public final class v57 implements fu9 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final ju4 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final tl7 j;
    public final h76 k;
    public final t9c l;
    public final hk6 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public v57(int[] iArr, Object[] objArr, int i, int i2, ju4 ju4Var, int[] iArr2, int i3, int i4, tl7 tl7Var, h76 h76Var, t9c t9cVar, w74 w74Var, hk6 hk6Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = ik8.A(ju4Var);
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = tl7Var;
        this.k = h76Var;
        this.l = t9cVar;
        this.e = ju4Var;
        this.m = hk6Var;
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
            StringBuilder p = ik8.p("Field ", str, " for ");
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
        if (obj instanceof ju4) {
            return ((ju4) obj).g();
        }
        return true;
    }

    public static defpackage.v57 w(defpackage.v29 r32, defpackage.tl7 r33, defpackage.h76 r34, defpackage.t9c r35, defpackage.w74 r36, defpackage.hk6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v57.w(v29, tl7, h76, t9c, w74, hk6):v57");
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) dac.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) dac.h(j, obj)).longValue();
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

    public final void B(Object obj, long j, cf0 cf0Var, fu9 fu9Var, v74 v74Var) {
        int u;
        this.k.getClass();
        or5 a = h76.a(j, obj);
        vk2 vk2Var = (vk2) cf0Var.d;
        int i = cf0Var.a;
        if ((i & 7) == 3) {
            do {
                ju4 a2 = fu9Var.a();
                cf0Var.e(a2, fu9Var, v74Var);
                fu9Var.c(a2);
                a.add(a2);
                if (!vk2Var.c() && cf0Var.c == 0) {
                    u = vk2Var.u();
                } else {
                    return;
                }
            } while (u == i);
            cf0Var.c = u;
            return;
        }
        throw bs5.b();
    }

    public final void C(Object obj, int i, cf0 cf0Var, fu9 fu9Var, v74 v74Var) {
        int u;
        this.k.getClass();
        or5 a = h76.a(i & 1048575, obj);
        vk2 vk2Var = (vk2) cf0Var.d;
        int i2 = cf0Var.a;
        if ((i2 & 7) == 2) {
            do {
                ju4 a2 = fu9Var.a();
                cf0Var.f(a2, fu9Var, v74Var);
                fu9Var.c(a2);
                a.add(a2);
                if (!vk2Var.c() && cf0Var.c == 0) {
                    u = vk2Var.u();
                } else {
                    return;
                }
            } while (u == i2);
            cf0Var.c = u;
            return;
        }
        throw bs5.b();
    }

    public final void D(int i, cf0 cf0Var, Object obj) {
        vk2 vk2Var = (vk2) cf0Var.d;
        if ((536870912 & i) != 0) {
            cf0Var.B(2);
            dac.o(i & 1048575, obj, vk2Var.t());
            return;
        }
        int i2 = i & 1048575;
        if (this.f) {
            cf0Var.B(2);
            dac.o(i2, obj, vk2Var.s());
            return;
        }
        dac.o(i2, obj, cf0Var.h());
    }

    public final void E(int i, cf0 cf0Var, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        h76 h76Var = this.k;
        int i2 = i & 1048575;
        if (z) {
            h76Var.getClass();
            cf0Var.v(h76.a(i2, obj), true);
            return;
        }
        h76Var.getClass();
        cf0Var.v(h76.a(i2, obj), false);
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        dac.m(j, obj, dac.f(j, obj) | (1 << (i2 >>> 20)));
    }

    public final void H(int i, int i2, Object obj) {
        dac.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    @Override
    public final ju4 a() {
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
                                cac cacVar = dac.c;
                                obj3 = obj;
                                cacVar.f(obj3, j, cacVar.b(j, obj2));
                                G(i, obj3);
                                continue;
                                i += 3;
                                obj = obj3;
                            }
                            break;
                        case 1:
                            if (n(i, obj2)) {
                                cac cacVar2 = dac.c;
                                cacVar2.g(obj, j, cacVar2.c(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i, obj2)) {
                                dac.n(obj, j, dac.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i, obj2)) {
                                dac.n(obj, j, dac.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i, obj2)) {
                                dac.m(j, obj, dac.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i, obj2)) {
                                dac.n(obj, j, dac.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i, obj2)) {
                                dac.m(j, obj, dac.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i, obj2)) {
                                cac cacVar3 = dac.c;
                                cacVar3.d(obj, j, cacVar3.a(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i, obj2)) {
                                dac.o(j, obj, dac.h(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(i, obj, obj2);
                            break;
                        case 10:
                            if (n(i, obj2)) {
                                dac.o(j, obj, dac.h(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i, obj2)) {
                                dac.m(j, obj, dac.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i, obj2)) {
                                dac.m(j, obj, dac.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i, obj2)) {
                                dac.m(j, obj, dac.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i, obj2)) {
                                dac.n(obj, j, dac.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i, obj2)) {
                                dac.m(j, obj, dac.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i, obj2)) {
                                dac.n(obj, j, dac.g(j, obj2));
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
                            or5 or5Var = (or5) dac.h(j, obj);
                            or5 or5Var2 = (or5) dac.h(j, obj2);
                            int size = or5Var.size();
                            int size2 = or5Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((t3) or5Var).a) {
                                    or5Var = ((pw8) or5Var).j(size2 + size);
                                }
                                or5Var.addAll(or5Var2);
                            }
                            if (size > 0) {
                                or5Var2 = or5Var;
                            }
                            dac.o(j, obj, or5Var2);
                            break;
                        case 50:
                            Class cls = iu9.a;
                            Object h = dac.h(j, obj);
                            Object h2 = dac.h(j, obj2);
                            this.m.getClass();
                            dac.o(j, obj, hk6.a(h, h2));
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
                                dac.o(j, obj, dac.h(j, obj2));
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
                                dac.o(j, obj, dac.h(j, obj2));
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
                    iu9.k(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            lq5.q(obj, "Mutating immutable message: ");
        }
    }

    @Override
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof ju4) {
                ju4 ju4Var = (ju4) obj;
                ju4Var.k(Integer.MAX_VALUE);
                ju4Var.memoizedHashCode = 0;
                ju4Var.h();
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
                                t3 t3Var = (t3) ((or5) dac.h(j, obj));
                                if (t3Var.a) {
                                    t3Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((gk6) object).a = false;
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
            s9c s9cVar = ((ju4) obj).unknownFields;
            if (s9cVar.e) {
                s9cVar.e = false;
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
                                    Object h = dac.h(J & 1048575, obj);
                                    this.m.getClass();
                                    gk6 gk6Var = (gk6) h;
                                    if (gk6Var.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((y2d) ((fk6) this.b[(i2 / 3) << 1]).a.c).a == b3d.r) {
                                            fu9 fu9Var = null;
                                            for (Object obj2 : gk6Var.values()) {
                                                if (fu9Var == null) {
                                                    fu9Var = ow8.c.a(obj2.getClass());
                                                }
                                                if (!fu9Var.d(obj2)) {
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
                            if (q(i8, i2, obj) && !m(i2).d(dac.h(J & 1048575, obj))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) dac.h(J & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        fu9 m = m(i2);
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
                    if (o(obj, i2, i, i3, i11) && !m(i2).d(dac.h(J & 1048575, obj))) {
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
    public final boolean e(defpackage.ju4 r12, defpackage.ju4 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v57.e(ju4, ju4):boolean");
    }

    @Override
    public final int f(defpackage.ju4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v57.f(ju4):int");
    }

    @Override
    public final void g(Object obj, z8d z8dVar) {
        int i;
        int i2;
        int i3;
        v57 v57Var = this;
        z8dVar.getClass();
        xk2 xk2Var = (xk2) z8dVar.b;
        int[] iArr = v57Var.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int J = v57Var.J(i6);
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
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.s(i8, Double.doubleToRawLongBits(dac.c.b(j, obj)));
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 1:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.q(i8, Float.floatToRawIntBits(dac.c.c(j, obj)));
                        break;
                    }
                    break;
                case 2:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 5:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.n(i8, dac.c.a(j, obj));
                        break;
                    }
                    break;
                case 8:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            xk2Var.y(i8, (String) object);
                            break;
                        } else {
                            xk2Var.o(i8, (n51) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.x(i8, (p3) unsafe.getObject(obj, j), v57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 10:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.o(i8, (n51) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.B(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 12:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 13:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        xk2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        xk2Var.B(i8, (i12 << 1) ^ (i12 >> 31));
                        break;
                    }
                    break;
                case 16:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        xk2Var.D(i8, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (v57Var.o(obj, i6, i5, i7, i3)) {
                        z8dVar.p1(i8, unsafe.getObject(obj, j), v57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 18:
                    iu9.n(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 19:
                    iu9.r(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 20:
                    iu9.t(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 21:
                    iu9.z(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 22:
                    iu9.s(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 23:
                    iu9.q(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 24:
                    iu9.p(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 25:
                    iu9.m(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = iu9.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        if (list instanceof l26) {
                            l26 l26Var = (l26) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object a = l26Var.a();
                                if (a instanceof String) {
                                    xk2Var.y(i13, (String) a);
                                } else {
                                    xk2Var.o(i13, (n51) a);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                xk2Var.y(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 27:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    fu9 m = v57Var.m(i6);
                    Class cls2 = iu9.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            xk2Var.x(i16, (p3) list2.get(i17), m);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = iu9.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            xk2Var.o(i18, (n51) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 29:
                    iu9.y(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 30:
                    iu9.o(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 31:
                    iu9.u(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 32:
                    iu9.v(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 33:
                    iu9.w(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 34:
                    iu9.x(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 35:
                    iu9.n(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 36:
                    iu9.r(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 37:
                    iu9.t(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 38:
                    iu9.z(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 39:
                    iu9.s(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 40:
                    iu9.q(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 41:
                    iu9.p(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 42:
                    iu9.m(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 43:
                    iu9.y(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 44:
                    iu9.o(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 45:
                    iu9.u(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 46:
                    iu9.v(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 47:
                    iu9.w(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, i == 1 ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 48:
                    iu9.x(iArr[i6], (List) unsafe.getObject(obj, j), z8dVar, true);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    fu9 m2 = v57Var.m(i6);
                    Class cls4 = iu9.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            z8dVar.p1(i20, list4.get(i21), m2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object obj2 = v57Var.b[(i6 / 3) << 1];
                        v57Var.m.getClass();
                        pm3 pm3Var = ((fk6) obj2).a;
                        for (Map.Entry entry : ((gk6) object2).entrySet()) {
                            xk2Var.A(i8, 2);
                            xk2Var.C(fk6.a(pm3Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            ta4.b(xk2Var, (w2d) pm3Var.b, i, key);
                            ta4.b(xk2Var, (y2d) pm3Var.c, 2, value);
                            i = 1;
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 51:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.s(i8, Double.doubleToRawLongBits(((Double) dac.h(j, obj)).doubleValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 52:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.q(i8, Float.floatToRawIntBits(((Float) dac.h(j, obj)).floatValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 53:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.D(i8, z(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 54:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.D(i8, z(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 55:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.u(i8, y(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 56:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.s(i8, z(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 57:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.q(i8, y(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 58:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.n(i8, ((Boolean) dac.h(j, obj)).booleanValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 59:
                    if (v57Var.q(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            xk2Var.y(i8, (String) object3);
                        } else {
                            xk2Var.o(i8, (n51) object3);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 60:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.x(i8, (p3) unsafe.getObject(obj, j), v57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 61:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.o(i8, (n51) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 62:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.B(i8, y(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 63:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.u(i8, y(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 64:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.q(i8, y(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 65:
                    if (v57Var.q(i8, i6, obj)) {
                        xk2Var.s(i8, z(j, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 66:
                    if (v57Var.q(i8, i6, obj)) {
                        int y = y(j, obj);
                        xk2Var.B(i8, (y << 1) ^ (y >> 31));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 67:
                    if (v57Var.q(i8, i6, obj)) {
                        long z = z(j, obj);
                        xk2Var.D(i8, (z << (i == 1 ? 1L : 0L)) ^ (z >> 63));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 68:
                    if (v57Var.q(i8, i6, obj)) {
                        z8dVar.p1(i8, unsafe.getObject(obj, j), v57Var.m(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                default:
                    i6 += 3;
                    i4 = 1048575;
            }
            v57Var = this;
            i6 += 3;
            i4 = 1048575;
        }
        v57Var.l.getClass();
        ((ju4) obj).unknownFields.d(z8dVar);
    }

    @Override
    public final int h(ju4 ju4Var) {
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
        v57 v57Var = this;
        ju4 ju4Var2 = ju4Var;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = v57Var.a;
            if (i8 < iArr.length) {
                int J = v57Var.J(i8);
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
                            i9 = unsafe.getInt(ju4Var2, i14);
                        }
                        i11 = i14;
                    }
                    i = 1 << (i13 >>> 20);
                } else {
                    i = 0;
                }
                long j = J & 1048575;
                if (I >= ua4.b.a) {
                    byte b = ua4.c.a;
                }
                switch (I) {
                    case 0:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            g = xk2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            g2 = xk2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        v57Var = this;
                        ju4Var2 = ju4Var;
                        break;
                    case 2:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            long j2 = unsafe.getLong(ju4Var2, j);
                            g3 = xk2.g(i12);
                            i2 = xk2.i(j2);
                            i10 += i2 + g3;
                        }
                        v57Var = this;
                        break;
                    case 3:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            long j3 = unsafe.getLong(ju4Var2, j);
                            g3 = xk2.g(i12);
                            i2 = xk2.i(j3);
                            i10 += i2 + g3;
                        }
                        v57Var = this;
                        break;
                    case 4:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            int i15 = unsafe.getInt(ju4Var2, j);
                            g4 = xk2.g(i12);
                            i3 = xk2.i(i15);
                            i10 += i3 + g4;
                        }
                        v57Var = this;
                        break;
                    case 5:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            g5 = xk2.g(i12);
                            g6 = g5 + 8;
                            i10 += g6;
                        }
                        v57Var = this;
                        ju4Var2 = ju4Var;
                        break;
                    case 6:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            g2 = xk2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        v57Var = this;
                        ju4Var2 = ju4Var;
                        break;
                    case 7:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            g6 = xk2.g(i12) + 1;
                            i10 += g6;
                        }
                        v57Var = this;
                        ju4Var2 = ju4Var;
                        break;
                    case 8:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            Object object = unsafe.getObject(ju4Var2, j);
                            if (object instanceof n51) {
                                int g17 = xk2.g(i12);
                                int size3 = ((n51) object).size();
                                f = qu6.f(size3, size3, g17, i10);
                            } else {
                                f = xk2.f((String) object) + xk2.g(i12) + i10;
                            }
                            i10 = f;
                        }
                        v57Var = this;
                        break;
                    case 9:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            Object object2 = unsafe.getObject(ju4Var2, j);
                            fu9 m = v57Var.m(i8);
                            Class cls = iu9.a;
                            g7 = xk2.g(i12);
                            a = ((p3) object2).a(m);
                            i10 = qu6.f(a, a, g7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            int g18 = xk2.g(i12);
                            int size4 = ((n51) unsafe.getObject(ju4Var2, j)).size();
                            i10 = qu6.f(size4, size4, g18, i10);
                        }
                        v57Var = this;
                        break;
                    case 11:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            int i16 = unsafe.getInt(ju4Var2, j);
                            g4 = xk2.g(i12);
                            i3 = xk2.h(i16);
                            i10 += i3 + g4;
                        }
                        v57Var = this;
                        break;
                    case 12:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            int i17 = unsafe.getInt(ju4Var2, j);
                            g4 = xk2.g(i12);
                            i3 = xk2.i(i17);
                            i10 += i3 + g4;
                        }
                        v57Var = this;
                        break;
                    case 13:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            g2 = xk2.g(i12);
                            g6 = g2 + 4;
                            i10 += g6;
                        }
                        v57Var = this;
                        ju4Var2 = ju4Var;
                        break;
                    case 14:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            g5 = xk2.g(i12);
                            g6 = g5 + 8;
                            i10 += g6;
                        }
                        v57Var = this;
                        ju4Var2 = ju4Var;
                        break;
                    case 15:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            int i18 = unsafe.getInt(ju4Var2, j);
                            g4 = xk2.g(i12);
                            i3 = xk2.h((i18 << 1) ^ (i18 >> 31));
                            i10 += i3 + g4;
                        }
                        v57Var = this;
                        break;
                    case 16:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            long j4 = unsafe.getLong(ju4Var2, j);
                            g3 = xk2.g(i12);
                            i2 = xk2.i((j4 << 1) ^ (j4 >> 63));
                            i10 += i2 + g3;
                        }
                        v57Var = this;
                        break;
                    case 17:
                        if (v57Var.o(ju4Var2, i8, i11, i9, i)) {
                            fu9 m2 = v57Var.m(i8);
                            g8 = xk2.g(i12) << 1;
                            a2 = ((p3) unsafe.getObject(ju4Var2, j)).a(m2);
                            c = a2 + g8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c = iu9.c(i12, (List) unsafe.getObject(ju4Var2, j));
                        i10 += c;
                        break;
                    case 19:
                        c = iu9.b(i12, (List) unsafe.getObject(ju4Var2, j));
                        i10 += c;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(ju4Var2, j);
                        Class cls2 = iu9.a;
                        if (list.size() != 0) {
                            g9 = (xk2.g(i12) * list.size()) + iu9.e(list);
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 21:
                        List list2 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls3 = iu9.a;
                        size = list2.size();
                        if (size != 0) {
                            i4 = iu9.i(list2);
                            g10 = xk2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 22:
                        List list3 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls4 = iu9.a;
                        size = list3.size();
                        if (size != 0) {
                            i4 = iu9.d(list3);
                            g10 = xk2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 23:
                        c = iu9.c(i12, (List) unsafe.getObject(ju4Var2, j));
                        i10 += c;
                        break;
                    case 24:
                        c = iu9.b(i12, (List) unsafe.getObject(ju4Var2, j));
                        i10 += c;
                        break;
                    case 25:
                        Class cls5 = iu9.a;
                        int size5 = ((List) unsafe.getObject(ju4Var2, j)).size();
                        if (size5 == 0) {
                            g11 = 0;
                        } else {
                            g11 = (xk2.g(i12) + 1) * size5;
                        }
                        i10 += g11;
                        break;
                    case 26:
                        List list4 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls6 = iu9.a;
                        int size6 = list4.size();
                        if (size6 != 0) {
                            g9 = xk2.g(i12) * size6;
                            if (list4 instanceof l26) {
                                l26 l26Var = (l26) list4;
                                for (int i19 = 0; i19 < size6; i19++) {
                                    Object a3 = l26Var.a();
                                    if (a3 instanceof n51) {
                                        int size7 = ((n51) a3).size();
                                        g9 = xk2.h(size7) + size7 + g9;
                                    } else {
                                        g9 = xk2.f((String) a3) + g9;
                                    }
                                }
                            } else {
                                for (int i20 = 0; i20 < size6; i20++) {
                                    Object obj = list4.get(i20);
                                    if (obj instanceof n51) {
                                        int size8 = ((n51) obj).size();
                                        g9 = xk2.h(size8) + size8 + g9;
                                    } else {
                                        g9 = xk2.f((String) obj) + g9;
                                    }
                                }
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 27:
                        List list5 = (List) unsafe.getObject(ju4Var2, j);
                        fu9 m3 = v57Var.m(i8);
                        Class cls7 = iu9.a;
                        int size9 = list5.size();
                        if (size9 == 0) {
                            g12 = 0;
                        } else {
                            g12 = xk2.g(i12) * size9;
                            for (int i21 = 0; i21 < size9; i21++) {
                                int a4 = ((p3) list5.get(i21)).a(m3);
                                g12 += xk2.h(a4) + a4;
                            }
                        }
                        i10 += g12;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls8 = iu9.a;
                        int size10 = list6.size();
                        if (size10 != 0) {
                            g9 = xk2.g(i12) * size10;
                            for (int i22 = 0; i22 < list6.size(); i22++) {
                                int size11 = ((n51) list6.get(i22)).size();
                                g9 += xk2.h(size11) + size11;
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 29:
                        List list7 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls9 = iu9.a;
                        size = list7.size();
                        if (size != 0) {
                            i4 = iu9.h(list7);
                            g10 = xk2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 30:
                        List list8 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls10 = iu9.a;
                        size = list8.size();
                        if (size != 0) {
                            i4 = iu9.a(list8);
                            g10 = xk2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 31:
                        c = iu9.b(i12, (List) unsafe.getObject(ju4Var2, j));
                        i10 += c;
                        break;
                    case 32:
                        c = iu9.c(i12, (List) unsafe.getObject(ju4Var2, j));
                        i10 += c;
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls11 = iu9.a;
                        size = list9.size();
                        if (size != 0) {
                            i4 = iu9.f(list9);
                            g10 = xk2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 34:
                        List list10 = (List) unsafe.getObject(ju4Var2, j);
                        Class cls12 = iu9.a;
                        size = list10.size();
                        if (size != 0) {
                            i4 = iu9.g(list10);
                            g10 = xk2.g(i12);
                            g9 = (g10 * size) + i4;
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 35:
                        Class cls13 = iu9.a;
                        size2 = ((List) unsafe.getObject(ju4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        Class cls14 = iu9.a;
                        size2 = ((List) unsafe.getObject(ju4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        size2 = iu9.e((List) unsafe.getObject(ju4Var2, j));
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        size2 = iu9.i((List) unsafe.getObject(ju4Var2, j));
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        size2 = iu9.d((List) unsafe.getObject(ju4Var2, j));
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        Class cls15 = iu9.a;
                        size2 = ((List) unsafe.getObject(ju4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        Class cls16 = iu9.a;
                        size2 = ((List) unsafe.getObject(ju4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls17 = iu9.a;
                        size2 = ((List) unsafe.getObject(ju4Var2, j)).size();
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        size2 = iu9.h((List) unsafe.getObject(ju4Var2, j));
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        size2 = iu9.a((List) unsafe.getObject(ju4Var2, j));
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        Class cls18 = iu9.a;
                        size2 = ((List) unsafe.getObject(ju4Var2, j)).size() << 2;
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        Class cls19 = iu9.a;
                        size2 = ((List) unsafe.getObject(ju4Var2, j)).size() << 3;
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        size2 = iu9.f((List) unsafe.getObject(ju4Var2, j));
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        size2 = iu9.g((List) unsafe.getObject(ju4Var2, j));
                        if (size2 > 0) {
                            g13 = xk2.g(i12);
                            i10 = qu6.f(size2, g13, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(ju4Var2, j);
                        fu9 m4 = v57Var.m(i8);
                        Class cls20 = iu9.a;
                        int size12 = list11.size();
                        if (size12 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i23 = 0; i23 < size12; i23++) {
                                i5 += ((p3) list11.get(i23)).a(m4) + (xk2.g(i12) << 1);
                            }
                        }
                        i10 += i5;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(ju4Var2, j);
                        Object obj2 = v57Var.b[(i8 / 3) << 1];
                        v57Var.m.getClass();
                        gk6 gk6Var = (gk6) object3;
                        fk6 fk6Var = (fk6) obj2;
                        if (!gk6Var.isEmpty()) {
                            g9 = 0;
                            for (Map.Entry entry : gk6Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                fk6Var.getClass();
                                int g19 = xk2.g(i12);
                                int a5 = fk6.a(fk6Var.a, key, value);
                                g9 = qu6.f(a5, a5, g19, g9);
                            }
                            i10 += g9;
                            break;
                        }
                        g9 = 0;
                        i10 += g9;
                    case 51:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            g = xk2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            g14 = xk2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            long z = z(j, ju4Var2);
                            g15 = xk2.g(i12);
                            i6 = xk2.i(z);
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            long z2 = z(j, ju4Var2);
                            g15 = xk2.g(i12);
                            i6 = xk2.i(z2);
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            int y = y(j, ju4Var2);
                            g16 = xk2.g(i12);
                            i7 = xk2.i(y);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            g = xk2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            g14 = xk2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            c = xk2.g(i12) + 1;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            Object object4 = unsafe.getObject(ju4Var2, j);
                            if (object4 instanceof n51) {
                                int g20 = xk2.g(i12);
                                int size13 = ((n51) object4).size();
                                f2 = qu6.f(size13, size13, g20, i10);
                            } else {
                                f2 = xk2.f((String) object4) + xk2.g(i12) + i10;
                            }
                            i10 = f2;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            Object object5 = unsafe.getObject(ju4Var2, j);
                            fu9 m5 = v57Var.m(i8);
                            Class cls21 = iu9.a;
                            g7 = xk2.g(i12);
                            a = ((p3) object5).a(m5);
                            i10 = qu6.f(a, a, g7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            int g21 = xk2.g(i12);
                            int size14 = ((n51) unsafe.getObject(ju4Var2, j)).size();
                            i10 = qu6.f(size14, size14, g21, i10);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            int y2 = y(j, ju4Var2);
                            g16 = xk2.g(i12);
                            i7 = xk2.h(y2);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            int y3 = y(j, ju4Var2);
                            g16 = xk2.g(i12);
                            i7 = xk2.i(y3);
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            g14 = xk2.g(i12);
                            c = g14 + 4;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            g = xk2.g(i12);
                            c = g + 8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            int y4 = y(j, ju4Var2);
                            g16 = xk2.g(i12);
                            i7 = xk2.h((y4 << 1) ^ (y4 >> 31));
                            c = i7 + g16;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            long z3 = z(j, ju4Var2);
                            g15 = xk2.g(i12);
                            i6 = xk2.i((z3 << 1) ^ (z3 >> 63));
                            i10 += i6 + g15;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (v57Var.q(i12, i8, ju4Var2)) {
                            fu9 m6 = v57Var.m(i8);
                            g8 = xk2.g(i12) << 1;
                            a2 = ((p3) unsafe.getObject(ju4Var2, j)).a(m6);
                            c = a2 + g8;
                            i10 += c;
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
            } else {
                v57Var.l.getClass();
                return ju4Var2.unknownFields.b() + i10;
            }
        }
    }

    @Override
    public final void i(java.lang.Object r21, defpackage.cf0 r22, defpackage.v74 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v57.i(java.lang.Object, cf0, v74):void");
    }

    public final boolean j(ju4 ju4Var, ju4 ju4Var2, int i) {
        if (n(i, ju4Var) == n(i, ju4Var2)) {
            return true;
        }
        return false;
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (dac.h(J(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        grb.o();
    }

    public final fu9 m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        fu9 fu9Var = (fu9) objArr[i2];
        if (fu9Var != null) {
            return fu9Var;
        }
        fu9 a = ow8.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean n(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v57.n(int, java.lang.Object):boolean");
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
        if (dac.f(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void r(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.v74 r11, defpackage.cf0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v57.r(java.lang.Object, int, java.lang.Object, v74, cf0):void");
    }

    public final void s(int i, Object obj, Object obj2) {
        if (!n(i, obj2)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            fu9 m = m(i);
            if (!n(i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    ju4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                ju4 a2 = m.a();
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
            fu9 m = m(i);
            if (!q(i2, i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    ju4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                ju4 a2 = m.a();
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
        fu9 m = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        ju4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }

    public final Object v(int i, int i2, Object obj) {
        fu9 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        ju4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }
}
