package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
public final class mif implements uif {
    public static final int[] h = new int[0];
    public static final Unsafe i;
    public final int[] a;
    public final Object[] b;
    public final kff c;
    public final int[] d;
    public final int e;
    public final zhf f;
    public final ejf g;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public mif(int[] iArr, Object[] objArr, kff kffVar, int[] iArr2, int i2, zhf zhfVar, ejf ejfVar, pgf pgfVar) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i2;
        this.f = zhfVar;
        this.g = ejfVar;
        this.c = kffVar;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof wgf) {
            return ((wgf) obj).g();
        }
        return true;
    }

    public static defpackage.mif j(defpackage.tif r30, defpackage.zhf r31, defpackage.ejf r32, defpackage.pgf r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.j(tif, zhf, ejf, pgf):mif");
    }

    public static int k(Object obj, long j) {
        return ((Integer) hjf.g(obj, j)).intValue();
    }

    public static int l(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static long n(Object obj, long j) {
        return ((Long) hjf.g(obj, j)).longValue();
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder m = mlb.m("Field ", str, " for ", name, " not found. Known fields are ");
            m.append(arrays);
            throw new RuntimeException(m.toString());
        }
    }

    @Override
    public final void a(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.a(java.lang.Object):void");
    }

    @Override
    public final boolean b(wgf wgfVar, wgf wgfVar2) {
        boolean e;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int m = m(i2);
                long j = m & 1048575;
                switch (l(m)) {
                    case 0:
                        if (!t(wgfVar, wgfVar2, i2)) {
                            break;
                        } else {
                            c8c c8cVar = hjf.c;
                            if (Double.doubleToLongBits(c8cVar.k(wgfVar, j)) != Double.doubleToLongBits(c8cVar.k(wgfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!t(wgfVar, wgfVar2, i2)) {
                            break;
                        } else {
                            c8c c8cVar2 = hjf.c;
                            if (Float.floatToIntBits(c8cVar2.p(wgfVar, j)) != Float.floatToIntBits(c8cVar2.p(wgfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!t(wgfVar, wgfVar2, i2)) {
                            break;
                        } else {
                            c8c c8cVar3 = hjf.c;
                            if (c8cVar3.x(wgfVar, j) != c8cVar3.x(wgfVar2, j)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
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
                        e = vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j));
                        break;
                    case 50:
                        e = vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j));
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
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i2 + 2] & 1048575;
                        if (hjf.e(wgfVar, j2) == hjf.e(wgfVar2, j2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    default:
                        i2 += 3;
                }
                if (e) {
                    i2 += 3;
                }
            } else {
                this.g.getClass();
                if (wgfVar.zzc.equals(wgfVar2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void c(Object obj, Object obj2) {
        Object obj3;
        if (h(obj)) {
            obj2.getClass();
            int i2 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i2 < iArr.length) {
                    int m = m(i2);
                    int i3 = m & 1048575;
                    int l = l(m);
                    int i4 = iArr[i2];
                    long j = i3;
                    switch (l) {
                        case 0:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                c8c c8cVar = hjf.c;
                                c8cVar.v(obj3, j, c8cVar.k(obj2, j));
                                s(i2, obj3);
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 1:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                c8c c8cVar2 = hjf.c;
                                c8cVar2.w(obj3, j, c8cVar2.p(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 2:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 3:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 4:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.h(obj3, j, hjf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 5:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 6:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.h(obj3, j, hjf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 7:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                c8c c8cVar3 = hjf.c;
                                c8cVar3.s(obj3, j, c8cVar3.x(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 8:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.i(obj3, j, hjf.g(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 9:
                            obj3 = obj;
                            q(i2, obj3, obj2);
                            continue;
                            i2 += 3;
                            obj = obj3;
                        case 10:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.i(obj3, j, hjf.g(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 11:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.h(obj3, j, hjf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 12:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.h(obj3, j, hjf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 13:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.h(obj3, j, hjf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 14:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 15:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                hjf.h(obj3, j, hjf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 16:
                            if (u(i2, obj2)) {
                                obj3 = obj;
                                hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                                s(i2, obj3);
                                continue;
                                i2 += 3;
                                obj = obj3;
                            }
                            break;
                        case 17:
                            q(i2, obj, obj2);
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
                            this.f.b(obj, j, obj2);
                            break;
                        case 50:
                            Class cls = vif.a;
                            Object g = hjf.g(obj, j);
                            Object g2 = hjf.g(obj2, j);
                            if (g == null) {
                                g2.getClass();
                                rjb.p();
                                return;
                            }
                            rjb.p();
                            return;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (i(i4, i2, obj2)) {
                                hjf.i(obj, j, hjf.g(obj2, j));
                                hjf.h(obj, iArr[i2 + 2] & 1048575, i4);
                                break;
                            }
                            break;
                        case 60:
                            r(i2, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (i(i4, i2, obj2)) {
                                hjf.i(obj, j, hjf.g(obj2, j));
                                hjf.h(obj, iArr[i2 + 2] & 1048575, i4);
                                break;
                            }
                            break;
                        case 68:
                            r(i2, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i2 += 3;
                    obj = obj3;
                } else {
                    vif.o(this.g, obj, obj2);
                    return;
                }
            }
        } else {
            u36.j("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override
    public final void d(Object obj, hoe hoeVar) {
        int i2;
        mif mifVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = mifVar.a;
            if (i4 < iArr.length) {
                int m = mifVar.m(i4);
                int l = l(m);
                int i7 = iArr[i4];
                Unsafe unsafe = i;
                if (l <= 17) {
                    int i8 = iArr[i4 + 2];
                    int i9 = i8 & i3;
                    if (i9 != i6) {
                        if (i9 == i3) {
                            i5 = 0;
                        } else {
                            i5 = unsafe.getInt(obj, i9);
                        }
                        i6 = i9;
                    }
                    i2 = 1 << (i8 >>> 20);
                } else {
                    i2 = 0;
                }
                long j = m & i3;
                switch (l) {
                    case 0:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).f(i7, Double.doubleToRawLongBits(hjf.c.k(obj, j)));
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 1:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).d(i7, Float.floatToRawIntBits(hjf.c.p(obj, j)));
                            break;
                        }
                        break;
                    case 2:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).k(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 3:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).k(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 4:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            int i10 = unsafe.getInt(obj, j);
                            igf igfVar = (igf) hoeVar.a;
                            igfVar.j(i7 << 3);
                            if (i10 >= 0) {
                                igfVar.j(i10);
                                break;
                            } else {
                                igfVar.l(i10);
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).f(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 6:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).d(i7, unsafe.getInt(obj, j));
                            break;
                        }
                        break;
                    case 7:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            boolean x = hjf.c.x(obj, j);
                            igf igfVar2 = (igf) hoeVar.a;
                            igfVar2.j(i7 << 3);
                            igfVar2.a(x ? (byte) 1 : (byte) 0);
                            break;
                        }
                        break;
                    case 8:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof String) {
                                ((igf) hoeVar.a).h(i7, (String) object);
                                break;
                            } else {
                                ((igf) hoeVar.a).c(i7, (yff) object);
                                break;
                            }
                        }
                        break;
                    case 9:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            hoeVar.b(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 10:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).c(i7, (yff) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 11:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            int i11 = unsafe.getInt(obj, j);
                            igf igfVar3 = (igf) hoeVar.a;
                            igfVar3.j(i7 << 3);
                            igfVar3.j(i11);
                            break;
                        }
                        break;
                    case 12:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            int i12 = unsafe.getInt(obj, j);
                            igf igfVar4 = (igf) hoeVar.a;
                            igfVar4.j(i7 << 3);
                            if (i12 >= 0) {
                                igfVar4.j(i12);
                                break;
                            } else {
                                igfVar4.l(i12);
                                break;
                            }
                        }
                        break;
                    case 13:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).d(i7, unsafe.getInt(obj, j));
                            break;
                        }
                        break;
                    case 14:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            ((igf) hoeVar.a).f(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 15:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            int i13 = unsafe.getInt(obj, j);
                            int i14 = (i13 << 1) ^ (i13 >> 31);
                            igf igfVar5 = (igf) hoeVar.a;
                            igfVar5.j(i7 << 3);
                            igfVar5.j(i14);
                            break;
                        }
                        break;
                    case 16:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            long j2 = unsafe.getLong(obj, j);
                            ((igf) hoeVar.a).k(i7, (j2 << 1) ^ (j2 >> 63));
                            break;
                        }
                        break;
                    case 17:
                        if (mifVar.v(obj, i4, i6, i5, i2)) {
                            hoeVar.a(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 18:
                        vif.q(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 19:
                        vif.u(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 20:
                        vif.w(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 21:
                        vif.d(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 22:
                        vif.v(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 23:
                        vif.t(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 24:
                        vif.s(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 25:
                        vif.p(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 26:
                        int i15 = iArr[i4];
                        List list = (List) unsafe.getObject(obj, j);
                        Class cls = vif.a;
                        if (list == null) {
                            continue;
                        } else if (!list.isEmpty()) {
                            igf igfVar6 = (igf) hoeVar.a;
                            if (list instanceof thf) {
                                thf thfVar = (thf) list;
                                for (int i16 = 0; i16 < list.size(); i16++) {
                                    Object b = thfVar.b(i16);
                                    if (b instanceof String) {
                                        igfVar6.h(i15, (String) b);
                                    } else {
                                        igfVar6.c(i15, (yff) b);
                                    }
                                }
                            } else {
                                for (int i17 = 0; i17 < list.size(); i17++) {
                                    igfVar6.h(i15, (String) list.get(i17));
                                }
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 27:
                        int i18 = iArr[i4];
                        List list2 = (List) unsafe.getObject(obj, j);
                        uif o = mifVar.o(i4);
                        Class cls2 = vif.a;
                        if (list2 == null) {
                            continue;
                        } else if (!list2.isEmpty()) {
                            for (int i19 = 0; i19 < list2.size(); i19++) {
                                hoeVar.b(i18, list2.get(i19), o);
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 28:
                        int i20 = iArr[i4];
                        List list3 = (List) unsafe.getObject(obj, j);
                        Class cls3 = vif.a;
                        if (list3 == null) {
                            continue;
                        } else if (!list3.isEmpty()) {
                            hoeVar.getClass();
                            for (int i21 = 0; i21 < list3.size(); i21++) {
                                ((igf) hoeVar.a).c(i20, (yff) list3.get(i21));
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 29:
                        vif.c(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 30:
                        vif.r(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 31:
                        vif.x(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 32:
                        vif.y(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 33:
                        vif.a(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 34:
                        vif.b(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 35:
                        vif.q(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 36:
                        vif.u(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 37:
                        vif.w(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 38:
                        vif.d(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 39:
                        vif.v(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 40:
                        vif.t(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 41:
                        vif.s(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 42:
                        vif.p(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 43:
                        vif.c(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 44:
                        vif.r(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 45:
                        vif.x(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 46:
                        vif.y(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 47:
                        vif.a(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 48:
                        vif.b(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 49:
                        int i22 = iArr[i4];
                        List list4 = (List) unsafe.getObject(obj, j);
                        uif o2 = mifVar.o(i4);
                        Class cls4 = vif.a;
                        if (list4 == null) {
                            continue;
                        } else if (!list4.isEmpty()) {
                            for (int i23 = 0; i23 < list4.size(); i23++) {
                                hoeVar.a(i22, list4.get(i23), o2);
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            mifVar.b[(i4 / 3) << 1].getClass();
                            rjb.p();
                            return;
                        }
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 51:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).f(i7, Double.doubleToRawLongBits(((Double) hjf.g(obj, j)).doubleValue()));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 52:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).d(i7, Float.floatToRawIntBits(((Float) hjf.g(obj, j)).floatValue()));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 53:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).k(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 54:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).k(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 55:
                        if (mifVar.i(i7, i4, obj)) {
                            int k = k(obj, j);
                            igf igfVar7 = (igf) hoeVar.a;
                            igfVar7.j(i7 << 3);
                            if (k >= 0) {
                                igfVar7.j(k);
                            } else {
                                igfVar7.l(k);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 56:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).f(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 57:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).d(i7, k(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 58:
                        if (mifVar.i(i7, i4, obj)) {
                            boolean booleanValue = ((Boolean) hjf.g(obj, j)).booleanValue();
                            igf igfVar8 = (igf) hoeVar.a;
                            igfVar8.j(i7 << 3);
                            igfVar8.a(booleanValue ? (byte) 1 : (byte) 0);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 59:
                        if (mifVar.i(i7, i4, obj)) {
                            Object object2 = unsafe.getObject(obj, j);
                            if (object2 instanceof String) {
                                ((igf) hoeVar.a).h(i7, (String) object2);
                            } else {
                                ((igf) hoeVar.a).c(i7, (yff) object2);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 60:
                        if (mifVar.i(i7, i4, obj)) {
                            hoeVar.b(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 61:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).c(i7, (yff) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 62:
                        if (mifVar.i(i7, i4, obj)) {
                            int k2 = k(obj, j);
                            igf igfVar9 = (igf) hoeVar.a;
                            igfVar9.j(i7 << 3);
                            igfVar9.j(k2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 63:
                        if (mifVar.i(i7, i4, obj)) {
                            int k3 = k(obj, j);
                            igf igfVar10 = (igf) hoeVar.a;
                            igfVar10.j(i7 << 3);
                            if (k3 >= 0) {
                                igfVar10.j(k3);
                            } else {
                                igfVar10.l(k3);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 64:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).d(i7, k(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 65:
                        if (mifVar.i(i7, i4, obj)) {
                            ((igf) hoeVar.a).f(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 66:
                        if (mifVar.i(i7, i4, obj)) {
                            int k4 = k(obj, j);
                            int i24 = (k4 << 1) ^ (k4 >> 31);
                            igf igfVar11 = (igf) hoeVar.a;
                            igfVar11.j(i7 << 3);
                            igfVar11.j(i24);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 67:
                        if (mifVar.i(i7, i4, obj)) {
                            long n = n(obj, j);
                            ((igf) hoeVar.a).k(i7, (n << 1) ^ (n >> 63));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 68:
                        if (mifVar.i(i7, i4, obj)) {
                            hoeVar.a(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    default:
                        i4 += 3;
                        i3 = 1048575;
                }
                mifVar = this;
                i4 += 3;
                i3 = 1048575;
            } else {
                mifVar.g.getClass();
                djf djfVar = ((wgf) obj).zzc;
                return;
            }
        }
    }

    @Override
    public final int e(defpackage.wgf r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.e(wgf):int");
    }

    @Override
    public final int f(defpackage.wgf r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.f(wgf):int");
    }

    @Override
    public final boolean g(Object obj) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.e) {
            int i8 = this.d[i6];
            int[] iArr = this.a;
            int i9 = iArr[i8];
            int m = m(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i7) {
                if (i11 != 1048575) {
                    i5 = i.getInt(obj, i11);
                }
                i3 = i8;
                i4 = i5;
                i2 = i11;
            } else {
                int i13 = i5;
                i2 = i7;
                i3 = i8;
                i4 = i13;
            }
            if ((268435456 & m) == 0 || v(obj, i3, i2, i4, i12)) {
                int l = l(m);
                if (l != 9 && l != 17) {
                    if (l != 27) {
                        if (l != 60 && l != 68) {
                            if (l != 49) {
                                if (l == 50) {
                                    hjf.g(obj, m & 1048575).getClass();
                                    rjb.p();
                                    return false;
                                }
                            }
                        } else if (i(i9, i3, obj) && !o(i3).g(hjf.g(obj, m & 1048575))) {
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) hjf.g(obj, m & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        uif o = o(i3);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (o.g(list.get(i14))) {
                            }
                        }
                        continue;
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else {
                    if (v(obj, i3, i2, i4, i12) && !o(i3).g(hjf.g(obj, m & 1048575))) {
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean i(int i2, int i3, Object obj) {
        if (hjf.e(obj, this.a[i3 + 2] & 1048575) == i2) {
            return true;
        }
        return false;
    }

    public final int m(int i2) {
        return this.a[i2 + 1];
    }

    public final uif o(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        uif uifVar = (uif) objArr[i3];
        if (uifVar != null) {
            return uifVar;
        }
        uif a = rif.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final void q(int i2, Object obj, Object obj2) {
        if (!u(i2, obj2)) {
            return;
        }
        long m = m(i2) & 1048575;
        Unsafe unsafe = i;
        Object object = unsafe.getObject(obj2, m);
        if (object != null) {
            uif o = o(i2);
            if (!u(i2, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, m, object);
                } else {
                    wgf zzc = o.zzc();
                    o.c(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                }
                s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                wgf zzc2 = o.zzc();
                o.c(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.c(object2, object);
            return;
        }
        dq9.m(mle.d("Source subfield ", this.a[i2], " is present but null: ", obj2.toString()));
    }

    public final void r(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (!i(i3, i2, obj2)) {
            return;
        }
        long m = m(i2) & 1048575;
        Unsafe unsafe = i;
        Object object = unsafe.getObject(obj2, m);
        if (object != null) {
            uif o = o(i2);
            if (!i(i3, i2, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, m, object);
                } else {
                    wgf zzc = o.zzc();
                    o.c(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                }
                hjf.h(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                wgf zzc2 = o.zzc();
                o.c(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.c(object2, object);
            return;
        }
        dq9.m(mle.d("Source subfield ", iArr[i2], " is present but null: ", obj2.toString()));
    }

    public final void s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        hjf.h(obj, j, hjf.e(obj, j) | (1 << (i3 >>> 20)));
    }

    public final boolean t(wgf wgfVar, wgf wgfVar2, int i2) {
        if (u(i2, wgfVar) == u(i2, wgfVar2)) {
            return true;
        }
        return false;
    }

    public final boolean u(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.u(int, java.lang.Object):boolean");
    }

    public final boolean v(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return u(i2, obj);
        }
        if ((i4 & i5) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final wgf zzc() {
        return (wgf) ((wgf) this.c).h(4, null);
    }
}
