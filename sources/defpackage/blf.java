package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
public final class blf implements jlf {
    public static final int[] h = new int[0];
    public static final Unsafe i;
    public final int[] a;
    public final Object[] b;
    public final zhf c;
    public final int[] d;
    public final int e;
    public final okf f;
    public final tlf g;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public blf(int[] iArr, Object[] objArr, zhf zhfVar, int[] iArr2, int i2, okf okfVar, tlf tlfVar, ejf ejfVar) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i2;
        this.f = okfVar;
        this.g = tlfVar;
        this.c = zhfVar;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ljf) {
            return ((ljf) obj).g();
        }
        return true;
    }

    public static defpackage.blf j(defpackage.ilf r30, defpackage.okf r31, defpackage.tlf r32, defpackage.ejf r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.j(ilf, okf, tlf, ejf):blf");
    }

    public static int k(long j, Object obj) {
        return ((Integer) wlf.g(obj, j)).intValue();
    }

    public static int l(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static long n(long j, Object obj) {
        return ((Long) wlf.g(obj, j)).longValue();
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
            StringBuilder l = xnb.l("Field ", str, " for ", name, " not found. Known fields are ");
            l.append(arrays);
            throw new RuntimeException(l.toString());
        }
    }

    @Override
    public final void a(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.a(java.lang.Object):void");
    }

    @Override
    public final boolean b(ljf ljfVar, ljf ljfVar2) {
        boolean e;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int m = m(i2);
                long j = m & 1048575;
                switch (l(m)) {
                    case 0:
                        if (!t(ljfVar, ljfVar2, i2)) {
                            break;
                        } else {
                            cac cacVar = wlf.c;
                            if (Double.doubleToLongBits(cacVar.k(ljfVar, j)) != Double.doubleToLongBits(cacVar.k(ljfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!t(ljfVar, ljfVar2, i2)) {
                            break;
                        } else {
                            cac cacVar2 = wlf.c;
                            if (Float.floatToIntBits(cacVar2.p(ljfVar, j)) != Float.floatToIntBits(cacVar2.p(ljfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!t(ljfVar, ljfVar2, i2)) {
                            break;
                        } else {
                            cac cacVar3 = wlf.c;
                            if (cacVar3.x(ljfVar, j) != cacVar3.x(ljfVar2, j)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
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
                        e = klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j));
                        break;
                    case 50:
                        e = klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j));
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
                        if (wlf.e(ljfVar, j2) == wlf.e(ljfVar2, j2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
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
                if (ljfVar.zzc.equals(ljfVar2.zzc)) {
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
                                cac cacVar = wlf.c;
                                cacVar.v(obj3, j, cacVar.k(obj2, j));
                                s(i2, obj3);
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 1:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                cac cacVar2 = wlf.c;
                                cacVar2.w(obj3, j, cacVar2.p(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 2:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 3:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 4:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.h(obj3, j, wlf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 5:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 6:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.h(obj3, j, wlf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 7:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                cac cacVar3 = wlf.c;
                                cacVar3.s(obj3, j, cacVar3.x(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 8:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.i(obj3, j, wlf.g(obj2, j));
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
                                wlf.i(obj3, j, wlf.g(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 11:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.h(obj3, j, wlf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 12:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.h(obj3, j, wlf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 13:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.h(obj3, j, wlf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 14:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 15:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                wlf.h(obj3, j, wlf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 16:
                            if (u(i2, obj2)) {
                                obj3 = obj;
                                wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
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
                            this.f.b(j, obj, obj2);
                            break;
                        case 50:
                            Class cls = klf.a;
                            Object g = wlf.g(obj, j);
                            Object g2 = wlf.g(obj2, j);
                            if (g == null) {
                                g2.getClass();
                                grb.o();
                                return;
                            }
                            grb.o();
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
                                wlf.i(obj, j, wlf.g(obj2, j));
                                wlf.h(obj, iArr[i2 + 2] & 1048575, i4);
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
                                wlf.i(obj, j, wlf.g(obj2, j));
                                wlf.h(obj, iArr[i2 + 2] & 1048575, i4);
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
                    klf.o(this.g, obj, obj2);
                    return;
                }
            }
        } else {
            lq5.j("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override
    public final int d(defpackage.ljf r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.d(ljf):int");
    }

    @Override
    public final int e(defpackage.ljf r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.e(ljf):int");
    }

    @Override
    public final boolean f(Object obj) {
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
                                    wlf.g(obj, m & 1048575).getClass();
                                    grb.o();
                                    return false;
                                }
                            }
                        } else if (i(i9, i3, obj) && !o(i3).f(wlf.g(obj, m & 1048575))) {
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) wlf.g(obj, m & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        jlf o = o(i3);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (o.f(list.get(i14))) {
                            }
                        }
                        continue;
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else {
                    if (v(obj, i3, i2, i4, i12) && !o(i3).f(wlf.g(obj, m & 1048575))) {
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

    @Override
    public final void g(Object obj, oqd oqdVar) {
        int i2;
        blf blfVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = blfVar.a;
            if (i4 < iArr.length) {
                int m = blfVar.m(i4);
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
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).f(i7, Double.doubleToRawLongBits(wlf.c.k(obj, j)));
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 1:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).d(i7, Float.floatToRawIntBits(wlf.c.p(obj, j)));
                            break;
                        }
                        break;
                    case 2:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).k(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 3:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).k(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 4:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            int i10 = unsafe.getInt(obj, j);
                            xif xifVar = (xif) oqdVar.a;
                            xifVar.j(i7 << 3);
                            if (i10 >= 0) {
                                xifVar.j(i10);
                                break;
                            } else {
                                xifVar.l(i10);
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).f(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 6:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).d(i7, unsafe.getInt(obj, j));
                            break;
                        }
                        break;
                    case 7:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            boolean x = wlf.c.x(obj, j);
                            xif xifVar2 = (xif) oqdVar.a;
                            xifVar2.j(i7 << 3);
                            xifVar2.a(x ? (byte) 1 : (byte) 0);
                            break;
                        }
                        break;
                    case 8:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof String) {
                                ((xif) oqdVar.a).h(i7, (String) object);
                                break;
                            } else {
                                ((xif) oqdVar.a).c(i7, (nif) object);
                                break;
                            }
                        }
                        break;
                    case 9:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            oqdVar.g(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 10:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).c(i7, (nif) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 11:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            int i11 = unsafe.getInt(obj, j);
                            xif xifVar3 = (xif) oqdVar.a;
                            xifVar3.j(i7 << 3);
                            xifVar3.j(i11);
                            break;
                        }
                        break;
                    case 12:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            int i12 = unsafe.getInt(obj, j);
                            xif xifVar4 = (xif) oqdVar.a;
                            xifVar4.j(i7 << 3);
                            if (i12 >= 0) {
                                xifVar4.j(i12);
                                break;
                            } else {
                                xifVar4.l(i12);
                                break;
                            }
                        }
                        break;
                    case 13:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).d(i7, unsafe.getInt(obj, j));
                            break;
                        }
                        break;
                    case 14:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            ((xif) oqdVar.a).f(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 15:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            int i13 = unsafe.getInt(obj, j);
                            int i14 = (i13 << 1) ^ (i13 >> 31);
                            xif xifVar5 = (xif) oqdVar.a;
                            xifVar5.j(i7 << 3);
                            xifVar5.j(i14);
                            break;
                        }
                        break;
                    case 16:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            long j2 = unsafe.getLong(obj, j);
                            ((xif) oqdVar.a).k(i7, (j2 << 1) ^ (j2 >> 63));
                            break;
                        }
                        break;
                    case 17:
                        if (blfVar.v(obj, i4, i6, i5, i2)) {
                            oqdVar.e(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 18:
                        klf.q(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 19:
                        klf.u(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 20:
                        klf.w(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 21:
                        klf.d(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 22:
                        klf.v(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 23:
                        klf.t(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 24:
                        klf.s(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 25:
                        klf.p(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 26:
                        int i15 = iArr[i4];
                        List list = (List) unsafe.getObject(obj, j);
                        Class cls = klf.a;
                        if (list == null) {
                            continue;
                        } else if (!list.isEmpty()) {
                            xif xifVar6 = (xif) oqdVar.a;
                            if (list instanceof ikf) {
                                ikf ikfVar = (ikf) list;
                                for (int i16 = 0; i16 < list.size(); i16++) {
                                    Object b = ikfVar.b(i16);
                                    if (b instanceof String) {
                                        xifVar6.h(i15, (String) b);
                                    } else {
                                        xifVar6.c(i15, (nif) b);
                                    }
                                }
                            } else {
                                for (int i17 = 0; i17 < list.size(); i17++) {
                                    xifVar6.h(i15, (String) list.get(i17));
                                }
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 27:
                        int i18 = iArr[i4];
                        List list2 = (List) unsafe.getObject(obj, j);
                        jlf o = blfVar.o(i4);
                        Class cls2 = klf.a;
                        if (list2 == null) {
                            continue;
                        } else if (!list2.isEmpty()) {
                            for (int i19 = 0; i19 < list2.size(); i19++) {
                                oqdVar.g(i18, list2.get(i19), o);
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 28:
                        int i20 = iArr[i4];
                        List list3 = (List) unsafe.getObject(obj, j);
                        Class cls3 = klf.a;
                        if (list3 == null) {
                            continue;
                        } else if (!list3.isEmpty()) {
                            oqdVar.getClass();
                            for (int i21 = 0; i21 < list3.size(); i21++) {
                                ((xif) oqdVar.a).c(i20, (nif) list3.get(i21));
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 29:
                        klf.c(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 30:
                        klf.r(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 31:
                        klf.x(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 32:
                        klf.y(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 33:
                        klf.a(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 34:
                        klf.b(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 35:
                        klf.q(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 36:
                        klf.u(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 37:
                        klf.w(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 38:
                        klf.d(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 39:
                        klf.v(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 40:
                        klf.t(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 41:
                        klf.s(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 42:
                        klf.p(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 43:
                        klf.c(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 44:
                        klf.r(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 45:
                        klf.x(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 46:
                        klf.y(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 47:
                        klf.a(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 48:
                        klf.b(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 49:
                        int i22 = iArr[i4];
                        List list4 = (List) unsafe.getObject(obj, j);
                        jlf o2 = blfVar.o(i4);
                        Class cls4 = klf.a;
                        if (list4 == null) {
                            continue;
                        } else if (!list4.isEmpty()) {
                            for (int i23 = 0; i23 < list4.size(); i23++) {
                                oqdVar.e(i22, list4.get(i23), o2);
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            blfVar.b[(i4 / 3) << 1].getClass();
                            grb.o();
                            return;
                        }
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 51:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).f(i7, Double.doubleToRawLongBits(((Double) wlf.g(obj, j)).doubleValue()));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 52:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).d(i7, Float.floatToRawIntBits(((Float) wlf.g(obj, j)).floatValue()));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 53:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).k(i7, n(j, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 54:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).k(i7, n(j, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 55:
                        if (blfVar.i(i7, i4, obj)) {
                            int k = k(j, obj);
                            xif xifVar7 = (xif) oqdVar.a;
                            xifVar7.j(i7 << 3);
                            if (k >= 0) {
                                xifVar7.j(k);
                            } else {
                                xifVar7.l(k);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 56:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).f(i7, n(j, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 57:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).d(i7, k(j, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 58:
                        if (blfVar.i(i7, i4, obj)) {
                            boolean booleanValue = ((Boolean) wlf.g(obj, j)).booleanValue();
                            xif xifVar8 = (xif) oqdVar.a;
                            xifVar8.j(i7 << 3);
                            xifVar8.a(booleanValue ? (byte) 1 : (byte) 0);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 59:
                        if (blfVar.i(i7, i4, obj)) {
                            Object object2 = unsafe.getObject(obj, j);
                            if (object2 instanceof String) {
                                ((xif) oqdVar.a).h(i7, (String) object2);
                            } else {
                                ((xif) oqdVar.a).c(i7, (nif) object2);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 60:
                        if (blfVar.i(i7, i4, obj)) {
                            oqdVar.g(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 61:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).c(i7, (nif) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 62:
                        if (blfVar.i(i7, i4, obj)) {
                            int k2 = k(j, obj);
                            xif xifVar9 = (xif) oqdVar.a;
                            xifVar9.j(i7 << 3);
                            xifVar9.j(k2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 63:
                        if (blfVar.i(i7, i4, obj)) {
                            int k3 = k(j, obj);
                            xif xifVar10 = (xif) oqdVar.a;
                            xifVar10.j(i7 << 3);
                            if (k3 >= 0) {
                                xifVar10.j(k3);
                            } else {
                                xifVar10.l(k3);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 64:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).d(i7, k(j, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 65:
                        if (blfVar.i(i7, i4, obj)) {
                            ((xif) oqdVar.a).f(i7, n(j, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 66:
                        if (blfVar.i(i7, i4, obj)) {
                            int k4 = k(j, obj);
                            int i24 = (k4 << 1) ^ (k4 >> 31);
                            xif xifVar11 = (xif) oqdVar.a;
                            xifVar11.j(i7 << 3);
                            xifVar11.j(i24);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 67:
                        if (blfVar.i(i7, i4, obj)) {
                            long n = n(j, obj);
                            ((xif) oqdVar.a).k(i7, (n << 1) ^ (n >> 63));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 68:
                        if (blfVar.i(i7, i4, obj)) {
                            oqdVar.e(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    default:
                        i4 += 3;
                        i3 = 1048575;
                }
                blfVar = this;
                i4 += 3;
                i3 = 1048575;
            } else {
                blfVar.g.getClass();
                slf slfVar = ((ljf) obj).zzc;
                return;
            }
        }
    }

    public final boolean i(int i2, int i3, Object obj) {
        if (wlf.e(obj, this.a[i3 + 2] & 1048575) == i2) {
            return true;
        }
        return false;
    }

    public final int m(int i2) {
        return this.a[i2 + 1];
    }

    public final jlf o(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        jlf jlfVar = (jlf) objArr[i3];
        if (jlfVar != null) {
            return jlfVar;
        }
        jlf a = glf.c.a((Class) objArr[i3 + 1]);
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
            jlf o = o(i2);
            if (!u(i2, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, m, object);
                } else {
                    ljf zzc = o.zzc();
                    o.c(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                }
                s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                ljf zzc2 = o.zzc();
                o.c(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.c(object2, object);
            return;
        }
        grb.i(dze.d("Source subfield ", this.a[i2], " is present but null: ", obj2.toString()));
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
            jlf o = o(i2);
            if (!i(i3, i2, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, m, object);
                } else {
                    ljf zzc = o.zzc();
                    o.c(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                }
                wlf.h(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                ljf zzc2 = o.zzc();
                o.c(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.c(object2, object);
            return;
        }
        grb.i(dze.d("Source subfield ", iArr[i2], " is present but null: ", obj2.toString()));
    }

    public final void s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        wlf.h(obj, j, wlf.e(obj, j) | (1 << (i3 >>> 20)));
    }

    public final boolean t(ljf ljfVar, ljf ljfVar2, int i2) {
        if (u(i2, ljfVar) == u(i2, ljfVar2)) {
            return true;
        }
        return false;
    }

    public final boolean u(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.u(int, java.lang.Object):boolean");
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
    public final ljf zzc() {
        return (ljf) ((ljf) this.c).h(4, null);
    }
}
