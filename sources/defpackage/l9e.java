package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
public final class l9e implements bbe {
    public static final int[] j = new int[0];
    public static final Unsafe k;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final rrd e;
    public final int[] f;
    public final int g;
    public final int h;
    public final y5d i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        k = unsafe;
    }

    public l9e(int[] iArr, Object[] objArr, int i, int i2, rrd rrdVar, int[] iArr2, int i3, int i4, y5d y5dVar, gcd gcdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = y5dVar;
        this.e = rrdVar;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof c2e) {
            return ((c2e) obj).m();
        }
        return true;
    }

    public static int p(Object obj, long j2) {
        return ((Integer) nfe.g(obj, j2)).intValue();
    }

    public static int r(int i) {
        return (i >>> 20) & 255;
    }

    public static long t(Object obj, long j2) {
        return ((Long) nfe.g(obj, j2)).longValue();
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l = yjb.l("Field ", str, " for ", name, " not found. Known fields are ");
            l.append(arrays);
            throw new RuntimeException(l.toString(), e);
        }
    }

    @Override
    public final void a(Object obj, byte[] bArr, int i, int i2, kj6 kj6Var) {
        o(obj, bArr, i, i2, 0, kj6Var);
    }

    @Override
    public final boolean b(c2e c2eVar, c2e c2eVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int s = s(i);
                long j2 = s & 1048575;
                switch (r(s)) {
                    case 0:
                        if (!j(c2eVar, c2eVar2, i)) {
                            break;
                        } else {
                            c6c c6cVar = nfe.c;
                            if (Double.doubleToLongBits(c6cVar.k(c2eVar, j2)) != Double.doubleToLongBits(c6cVar.k(c2eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!j(c2eVar, c2eVar2, i)) {
                            break;
                        } else {
                            c6c c6cVar2 = nfe.c;
                            if (Float.floatToIntBits(c6cVar2.p(c2eVar, j2)) != Float.floatToIntBits(c6cVar2.p(c2eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!j(c2eVar, c2eVar2, i)) {
                            break;
                        } else {
                            c6c c6cVar3 = nfe.c;
                            if (c6cVar3.x(c2eVar, j2) != c6cVar3.x(c2eVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
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
                        e = pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2));
                        break;
                    case 50:
                        e = pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2));
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
                        long j3 = iArr[i + 2] & 1048575;
                        if (nfe.e(c2eVar, j3) == nfe.e(c2eVar2, j3) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (e) {
                    i += 3;
                }
            } else if (c2eVar.zzc.equals(c2eVar2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int c(defpackage.c2e r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9e.c(c2e):int");
    }

    @Override
    public final boolean d(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int s = s(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & s) == 0 || l(obj, i2, i, i3, i11)) {
                int r = r(s);
                if (r != 9 && r != 17) {
                    if (r != 27) {
                        if (r != 60 && r != 68) {
                            if (r != 49) {
                                if (r == 50 && !((r7e) nfe.g(obj, s & 1048575)).isEmpty()) {
                                    w(i2).getClass();
                                    fyb.g();
                                    return false;
                                }
                            }
                        } else if (n(i8, i2, obj) && !v(i2).d(nfe.g(obj, s & 1048575))) {
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) nfe.g(obj, s & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        bbe v = v(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (v.d(list.get(i13))) {
                            }
                        }
                        continue;
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (l(obj, i2, i, i3, i11) && !v(i2).d(nfe.g(obj, s & 1048575))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int e(defpackage.c2e r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9e.e(c2e):int");
    }

    @Override
    public final void f(Object obj, xdd xddVar) {
        int i;
        int i2;
        l9e l9eVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = l9eVar.a;
            if (i4 < iArr.length) {
                int s = l9eVar.s(i4);
                int r = r(s);
                int i7 = iArr[i4];
                Unsafe unsafe = k;
                if (r <= 17) {
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
                    i = 1 << (i8 >>> 20);
                } else {
                    i = 0;
                }
                long j2 = s & i3;
                switch (r) {
                    case 0:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).h(i7, Double.doubleToRawLongBits(nfe.c.k(obj, j2)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).f(i7, Float.floatToRawIntBits(nfe.c.p(obj, j2)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).p(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).p(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).j(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).h(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).f(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            byte x = nfe.c.x(obj, j2);
                            cwd cwdVar = (cwd) xddVar.a;
                            cwdVar.o(i7 << 3);
                            int i10 = cwdVar.d;
                            try {
                                int i11 = i10 + 1;
                                try {
                                    cwdVar.b[i10] = x;
                                    cwdVar.d = i11;
                                    break;
                                } catch (IndexOutOfBoundsException e) {
                                    e = e;
                                    i10 = i11;
                                    throw new bk2(i10, cwdVar.c, 1, e);
                                }
                            } catch (IndexOutOfBoundsException e2) {
                                e = e2;
                            }
                        } else {
                            continue;
                        }
                    case 8:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            Object object = unsafe.getObject(obj, j2);
                            if (object instanceof String) {
                                ((cwd) xddVar.a).l(i7, (String) object);
                                break;
                            } else {
                                ((cwd) xddVar.a).e(i7, (zud) object);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            xddVar.h(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).e(i7, (zud) unsafe.getObject(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).n(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).j(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).f(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            ((cwd) xddVar.a).h(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            int i12 = unsafe.getInt(obj, j2);
                            ((cwd) xddVar.a).n(i7, (i12 << 1) ^ (i12 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            long j3 = unsafe.getLong(obj, j2);
                            ((cwd) xddVar.a).p(i7, (j3 << 1) ^ (j3 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (l9eVar.l(obj, i4, i6, i5, i)) {
                            xddVar.f(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        pbe.q(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 19:
                        pbe.u(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 20:
                        pbe.w(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 21:
                        pbe.d(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 22:
                        pbe.v(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 23:
                        pbe.t(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 24:
                        pbe.s(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 25:
                        pbe.p(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 26:
                        int i13 = iArr[i4];
                        List list = (List) unsafe.getObject(obj, j2);
                        y5d y5dVar = pbe.a;
                        if (list != null && !list.isEmpty()) {
                            cwd cwdVar2 = (cwd) xddVar.a;
                            if (list instanceof g5e) {
                                g5e g5eVar = (g5e) list;
                                for (int i14 = 0; i14 < list.size(); i14++) {
                                    Object zza = g5eVar.zza();
                                    if (zza instanceof String) {
                                        cwdVar2.l(i13, (String) zza);
                                    } else {
                                        cwdVar2.e(i13, (zud) zza);
                                    }
                                }
                                break;
                            } else {
                                for (int i15 = 0; i15 < list.size(); i15++) {
                                    cwdVar2.l(i13, (String) list.get(i15));
                                }
                                break;
                            }
                        }
                        break;
                    case 27:
                        int i16 = iArr[i4];
                        List list2 = (List) unsafe.getObject(obj, j2);
                        bbe v = l9eVar.v(i4);
                        y5d y5dVar2 = pbe.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i17 = 0; i17 < list2.size(); i17++) {
                                xddVar.h(i16, list2.get(i17), v);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i18 = iArr[i4];
                        List list3 = (List) unsafe.getObject(obj, j2);
                        y5d y5dVar3 = pbe.a;
                        if (list3 != null && !list3.isEmpty()) {
                            xddVar.getClass();
                            for (int i19 = 0; i19 < list3.size(); i19++) {
                                ((cwd) xddVar.a).e(i18, (zud) list3.get(i19));
                            }
                            break;
                        }
                        break;
                    case 29:
                        pbe.c(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 30:
                        pbe.r(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 31:
                        pbe.x(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 32:
                        pbe.y(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 33:
                        pbe.a(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 34:
                        pbe.b(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                        break;
                    case 35:
                        pbe.q(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 36:
                        pbe.u(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 37:
                        pbe.w(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 38:
                        pbe.d(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 39:
                        pbe.v(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 40:
                        pbe.t(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 41:
                        pbe.s(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 42:
                        pbe.p(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 43:
                        pbe.c(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 44:
                        pbe.r(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 45:
                        pbe.x(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 46:
                        pbe.y(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 47:
                        pbe.a(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 48:
                        pbe.b(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                        break;
                    case 49:
                        int i20 = iArr[i4];
                        List list4 = (List) unsafe.getObject(obj, j2);
                        bbe v2 = l9eVar.v(i4);
                        y5d y5dVar4 = pbe.a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i21 = 0; i21 < list4.size(); i21++) {
                                xddVar.f(i20, list4.get(i21), v2);
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j2) != null) {
                            l9eVar.w(i4).getClass();
                            fyb.g();
                            return;
                        }
                        break;
                    case 51:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).h(i7, Double.doubleToRawLongBits(((Double) nfe.g(obj, j2)).doubleValue()));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).f(i7, Float.floatToRawIntBits(((Float) nfe.g(obj, j2)).floatValue()));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).p(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).p(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).j(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).h(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).f(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (l9eVar.n(i7, i4, obj)) {
                            byte booleanValue = ((Boolean) nfe.g(obj, j2)).booleanValue();
                            cwd cwdVar3 = (cwd) xddVar.a;
                            cwdVar3.o(i7 << 3);
                            int i22 = cwdVar3.d;
                            try {
                                i2 = i22 + 1;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                            }
                            try {
                                cwdVar3.b[i22] = booleanValue;
                                cwdVar3.d = i2;
                                break;
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                i22 = i2;
                                throw new bk2(i22, cwdVar3.c, 1, e);
                            }
                        } else {
                            continue;
                        }
                    case 59:
                        if (l9eVar.n(i7, i4, obj)) {
                            Object object2 = unsafe.getObject(obj, j2);
                            if (object2 instanceof String) {
                                ((cwd) xddVar.a).l(i7, (String) object2);
                                break;
                            } else {
                                ((cwd) xddVar.a).e(i7, (zud) object2);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (l9eVar.n(i7, i4, obj)) {
                            xddVar.h(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).e(i7, (zud) unsafe.getObject(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).n(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).j(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).f(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (l9eVar.n(i7, i4, obj)) {
                            ((cwd) xddVar.a).h(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (l9eVar.n(i7, i4, obj)) {
                            int p = p(obj, j2);
                            ((cwd) xddVar.a).n(i7, (p << 1) ^ (p >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (l9eVar.n(i7, i4, obj)) {
                            long t = t(obj, j2);
                            ((cwd) xddVar.a).p(i7, (t << 1) ^ (t >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (l9eVar.n(i7, i4, obj)) {
                            xddVar.f(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                }
                i4 += 3;
                i3 = 1048575;
                l9eVar = this;
            } else {
                ((c2e) obj).zzc.d(xddVar);
                return;
            }
        }
    }

    public final void g(int i, Object obj, Object obj2) {
        if (!k(i, obj2)) {
            return;
        }
        long s = s(i) & 1048575;
        Unsafe unsafe = k;
        Object object = unsafe.getObject(obj2, s);
        if (object != null) {
            bbe v = v(i);
            if (!k(i, obj)) {
                if (!m(object)) {
                    unsafe.putObject(obj, s, object);
                } else {
                    c2e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                }
                i(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                c2e zze2 = v.zze();
                v.zzg(zze2, object2);
                unsafe.putObject(obj, s, zze2);
                object2 = zze2;
            }
            v.zzg(object2, object);
            return;
        }
        sc8.j(mue.d("Source subfield ", this.a[i], " is present but null: ", obj2.toString()));
    }

    public final void h(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!n(i2, i, obj2)) {
            return;
        }
        long s = s(i) & 1048575;
        Unsafe unsafe = k;
        Object object = unsafe.getObject(obj2, s);
        if (object != null) {
            bbe v = v(i);
            if (!n(i2, i, obj)) {
                if (!m(object)) {
                    unsafe.putObject(obj, s, object);
                } else {
                    c2e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                }
                nfe.h(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                c2e zze2 = v.zze();
                v.zzg(zze2, object2);
                unsafe.putObject(obj, s, zze2);
                object2 = zze2;
            }
            v.zzg(object2, object);
            return;
        }
        sc8.j(mue.d("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
    }

    public final void i(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        nfe.h(obj, j2, nfe.e(obj, j2) | (1 << (i2 >>> 20)));
    }

    public final boolean j(c2e c2eVar, c2e c2eVar2, int i) {
        if (k(i, c2eVar) == k(i, c2eVar2)) {
            return true;
        }
        return false;
    }

    public final boolean k(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9e.k(int, java.lang.Object):boolean");
    }

    public final boolean l(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return k(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n(int i, int i2, Object obj) {
        if (nfe.e(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final int o(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.kj6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9e.o(java.lang.Object, byte[], int, int, int, kj6):int");
    }

    public final int q(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
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

    public final int s(int i) {
        return this.a[i + 1];
    }

    public final yqd u(int i) {
        return (yqd) this.b[((i / 3) << 1) + 1];
    }

    public final bbe v(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        bbe bbeVar = (bbe) objArr[i2];
        if (bbeVar != null) {
            return bbeVar;
        }
        bbe a = jae.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object w(int i) {
        return this.b[(i / 3) << 1];
    }

    public final Object x(int i, Object obj) {
        bbe v = v(i);
        int s = s(i) & 1048575;
        if (!k(i, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s);
        if (m(object)) {
            return object;
        }
        c2e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    public final Object y(int i, int i2, Object obj) {
        bbe v = v(i2);
        if (!n(i, i2, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        c2e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    @Override
    public final c2e zze() {
        return (c2e) ((c2e) this.e).d(4);
    }

    @Override
    public final void zzf(Object obj) {
        if (m(obj)) {
            if (obj instanceof c2e) {
                c2e c2eVar = (c2e) obj;
                c2eVar.l();
                c2eVar.zza = 0;
                c2eVar.j();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int s = s(i);
                    int i2 = 1048575 & s;
                    int r = r(s);
                    long j2 = i2;
                    Unsafe unsafe = k;
                    if (r != 9) {
                        if (r != 60 && r != 68) {
                            switch (r) {
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
                                    bsd bsdVar = (bsd) ((a3e) nfe.g(obj, j2));
                                    if (!bsdVar.a) {
                                        break;
                                    } else {
                                        bsdVar.a = false;
                                        break;
                                    }
                                case 50:
                                    Object object = unsafe.getObject(obj, j2);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((r7e) object).a = false;
                                        unsafe.putObject(obj, j2, object);
                                        break;
                                    }
                            }
                        } else if (n(iArr[i], i, obj)) {
                            v(i).zzf(unsafe.getObject(obj, j2));
                        }
                        i += 3;
                    }
                    if (k(i, obj)) {
                        v(i).zzf(unsafe.getObject(obj, j2));
                    }
                    i += 3;
                } else {
                    this.i.getClass();
                    iee ieeVar = ((c2e) obj).zzc;
                    if (ieeVar.e) {
                        ieeVar.e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (m(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int s = s(i);
                    int i2 = s & 1048575;
                    int r = r(s);
                    int i3 = iArr[i];
                    long j2 = i2;
                    switch (r) {
                        case 0:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                c6c c6cVar = nfe.c;
                                c6cVar.v(obj3, j2, c6cVar.k(obj2, j2));
                                i(i, obj3);
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 1:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                c6c c6cVar2 = nfe.c;
                                c6cVar2.w(obj3, j2, c6cVar2.p(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 2:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 3:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 4:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.h(obj3, j2, nfe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 5:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 6:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.h(obj3, j2, nfe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 7:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                c6c c6cVar3 = nfe.c;
                                c6cVar3.s(obj3, j2, c6cVar3.x(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 8:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.i(obj3, j2, nfe.g(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 9:
                            obj3 = obj;
                            g(i, obj3, obj2);
                            continue;
                            i += 3;
                            obj = obj3;
                        case 10:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.i(obj3, j2, nfe.g(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 11:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.h(obj3, j2, nfe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 12:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.h(obj3, j2, nfe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 13:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.h(obj3, j2, nfe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 14:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 15:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                nfe.h(obj3, j2, nfe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 16:
                            if (k(i, obj2)) {
                                obj3 = obj;
                                nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                                i(i, obj3);
                                continue;
                                i += 3;
                                obj = obj3;
                            }
                            break;
                        case 17:
                            g(i, obj, obj2);
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
                            a3e a3eVar = (a3e) nfe.g(obj, j2);
                            a3e a3eVar2 = (a3e) nfe.g(obj2, j2);
                            int size = a3eVar.size();
                            int size2 = a3eVar2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((bsd) a3eVar).a) {
                                    a3eVar = a3eVar.zzd(size2 + size);
                                }
                                a3eVar.addAll(a3eVar2);
                            }
                            if (size > 0) {
                                a3eVar2 = a3eVar;
                            }
                            nfe.i(obj, j2, a3eVar2);
                            break;
                        case 50:
                            y5d y5dVar = pbe.a;
                            nfe.i(obj, j2, gcd.a(nfe.g(obj, j2), nfe.g(obj2, j2)));
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
                            if (n(i3, i, obj2)) {
                                nfe.i(obj, j2, nfe.g(obj2, j2));
                                nfe.h(obj, iArr[i + 2] & 1048575, i3);
                                break;
                            }
                            break;
                        case 60:
                            h(i, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (n(i3, i, obj2)) {
                                nfe.i(obj, j2, nfe.g(obj2, j2));
                                nfe.h(obj, iArr[i + 2] & 1048575, i3);
                                break;
                            }
                            break;
                        case 68:
                            h(i, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    pbe.o(obj, obj2);
                    return;
                }
            }
        } else {
            w26.j("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }
}
