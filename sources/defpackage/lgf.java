package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
public final class lgf implements tgf {
    public static final int[] h = new int[0];
    public static final Unsafe i;
    public final int[] a;
    public final Object[] b;
    public final jdf c;
    public final int[] d;
    public final int e;
    public final yff f;
    public final dhf g;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public lgf(int[] iArr, Object[] objArr, jdf jdfVar, int[] iArr2, int i2, yff yffVar, dhf dhfVar, oef oefVar) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i2;
        this.f = yffVar;
        this.g = dhfVar;
        this.c = jdfVar;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vef) {
            return ((vef) obj).g();
        }
        return true;
    }

    public static defpackage.lgf j(defpackage.sgf r30, defpackage.yff r31, defpackage.dhf r32, defpackage.oef r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.j(sgf, yff, dhf, oef):lgf");
    }

    public static int k(Object obj, long j) {
        return ((Integer) ghf.g(obj, j)).intValue();
    }

    public static int l(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static long n(Object obj, long j) {
        return ((Long) ghf.g(obj, j)).longValue();
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
            StringBuilder l = yjb.l("Field ", str, " for ", name, " not found. Known fields are ");
            l.append(arrays);
            throw new RuntimeException(l.toString());
        }
    }

    @Override
    public final void a(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.a(java.lang.Object):void");
    }

    @Override
    public final boolean b(vef vefVar, vef vefVar2) {
        boolean e;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int m = m(i2);
                long j = m & 1048575;
                switch (l(m)) {
                    case 0:
                        if (!t(vefVar, vefVar2, i2)) {
                            break;
                        } else {
                            c6c c6cVar = ghf.c;
                            if (Double.doubleToLongBits(c6cVar.k(vefVar, j)) != Double.doubleToLongBits(c6cVar.k(vefVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!t(vefVar, vefVar2, i2)) {
                            break;
                        } else {
                            c6c c6cVar2 = ghf.c;
                            if (Float.floatToIntBits(c6cVar2.p(vefVar, j)) != Float.floatToIntBits(c6cVar2.p(vefVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!t(vefVar, vefVar2, i2)) {
                            break;
                        } else {
                            c6c c6cVar3 = ghf.c;
                            if (c6cVar3.x(vefVar, j) != c6cVar3.x(vefVar2, j)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
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
                        e = ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j));
                        break;
                    case 50:
                        e = ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j));
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
                        if (ghf.e(vefVar, j2) == ghf.e(vefVar2, j2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
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
                if (vefVar.zzc.equals(vefVar2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void c(Object obj, xdd xddVar) {
        int i2;
        lgf lgfVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = lgfVar.a;
            if (i4 < iArr.length) {
                int m = lgfVar.m(i4);
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
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).f(i7, Double.doubleToRawLongBits(ghf.c.k(obj, j)));
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 1:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).d(i7, Float.floatToRawIntBits(ghf.c.p(obj, j)));
                            break;
                        }
                        break;
                    case 2:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).k(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 3:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).k(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 4:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            int i10 = unsafe.getInt(obj, j);
                            hef hefVar = (hef) xddVar.a;
                            hefVar.j(i7 << 3);
                            if (i10 >= 0) {
                                hefVar.j(i10);
                                break;
                            } else {
                                hefVar.l(i10);
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).f(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 6:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).d(i7, unsafe.getInt(obj, j));
                            break;
                        }
                        break;
                    case 7:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            boolean x = ghf.c.x(obj, j);
                            hef hefVar2 = (hef) xddVar.a;
                            hefVar2.j(i7 << 3);
                            hefVar2.a(x ? (byte) 1 : (byte) 0);
                            break;
                        }
                        break;
                    case 8:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof String) {
                                ((hef) xddVar.a).h(i7, (String) object);
                                break;
                            } else {
                                ((hef) xddVar.a).c(i7, (xdf) object);
                                break;
                            }
                        }
                        break;
                    case 9:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            xddVar.g(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 10:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).c(i7, (xdf) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 11:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            int i11 = unsafe.getInt(obj, j);
                            hef hefVar3 = (hef) xddVar.a;
                            hefVar3.j(i7 << 3);
                            hefVar3.j(i11);
                            break;
                        }
                        break;
                    case 12:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            int i12 = unsafe.getInt(obj, j);
                            hef hefVar4 = (hef) xddVar.a;
                            hefVar4.j(i7 << 3);
                            if (i12 >= 0) {
                                hefVar4.j(i12);
                                break;
                            } else {
                                hefVar4.l(i12);
                                break;
                            }
                        }
                        break;
                    case 13:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).d(i7, unsafe.getInt(obj, j));
                            break;
                        }
                        break;
                    case 14:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            ((hef) xddVar.a).f(i7, unsafe.getLong(obj, j));
                            break;
                        }
                        break;
                    case 15:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            int i13 = unsafe.getInt(obj, j);
                            int i14 = (i13 << 1) ^ (i13 >> 31);
                            hef hefVar5 = (hef) xddVar.a;
                            hefVar5.j(i7 << 3);
                            hefVar5.j(i14);
                            break;
                        }
                        break;
                    case 16:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            long j2 = unsafe.getLong(obj, j);
                            ((hef) xddVar.a).k(i7, (j2 << 1) ^ (j2 >> 63));
                            break;
                        }
                        break;
                    case 17:
                        if (lgfVar.v(obj, i4, i6, i5, i2)) {
                            xddVar.e(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 18:
                        ugf.q(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 19:
                        ugf.u(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 20:
                        ugf.w(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 21:
                        ugf.d(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 22:
                        ugf.v(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 23:
                        ugf.t(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 24:
                        ugf.s(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 25:
                        ugf.p(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 26:
                        int i15 = iArr[i4];
                        List list = (List) unsafe.getObject(obj, j);
                        Class cls = ugf.a;
                        if (list == null) {
                            continue;
                        } else if (!list.isEmpty()) {
                            hef hefVar6 = (hef) xddVar.a;
                            if (list instanceof sff) {
                                sff sffVar = (sff) list;
                                for (int i16 = 0; i16 < list.size(); i16++) {
                                    Object b = sffVar.b(i16);
                                    if (b instanceof String) {
                                        hefVar6.h(i15, (String) b);
                                    } else {
                                        hefVar6.c(i15, (xdf) b);
                                    }
                                }
                            } else {
                                for (int i17 = 0; i17 < list.size(); i17++) {
                                    hefVar6.h(i15, (String) list.get(i17));
                                }
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 27:
                        int i18 = iArr[i4];
                        List list2 = (List) unsafe.getObject(obj, j);
                        tgf o = lgfVar.o(i4);
                        Class cls2 = ugf.a;
                        if (list2 == null) {
                            continue;
                        } else if (!list2.isEmpty()) {
                            for (int i19 = 0; i19 < list2.size(); i19++) {
                                xddVar.g(i18, list2.get(i19), o);
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 28:
                        int i20 = iArr[i4];
                        List list3 = (List) unsafe.getObject(obj, j);
                        Class cls3 = ugf.a;
                        if (list3 == null) {
                            continue;
                        } else if (!list3.isEmpty()) {
                            xddVar.getClass();
                            for (int i21 = 0; i21 < list3.size(); i21++) {
                                ((hef) xddVar.a).c(i20, (xdf) list3.get(i21));
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 29:
                        ugf.c(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 30:
                        ugf.r(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 31:
                        ugf.x(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 32:
                        ugf.y(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 33:
                        ugf.a(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 34:
                        ugf.b(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 35:
                        ugf.q(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 36:
                        ugf.u(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 37:
                        ugf.w(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 38:
                        ugf.d(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 39:
                        ugf.v(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 40:
                        ugf.t(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 41:
                        ugf.s(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 42:
                        ugf.p(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 43:
                        ugf.c(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 44:
                        ugf.r(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 45:
                        ugf.x(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 46:
                        ugf.y(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 47:
                        ugf.a(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 48:
                        ugf.b(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 49:
                        int i22 = iArr[i4];
                        List list4 = (List) unsafe.getObject(obj, j);
                        tgf o2 = lgfVar.o(i4);
                        Class cls4 = ugf.a;
                        if (list4 == null) {
                            continue;
                        } else if (!list4.isEmpty()) {
                            for (int i23 = 0; i23 < list4.size(); i23++) {
                                xddVar.e(i22, list4.get(i23), o2);
                            }
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            lgfVar.b[(i4 / 3) << 1].getClass();
                            fyb.g();
                            return;
                        }
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 51:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).f(i7, Double.doubleToRawLongBits(((Double) ghf.g(obj, j)).doubleValue()));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 52:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).d(i7, Float.floatToRawIntBits(((Float) ghf.g(obj, j)).floatValue()));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 53:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).k(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 54:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).k(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 55:
                        if (lgfVar.i(i7, i4, obj)) {
                            int k = k(obj, j);
                            hef hefVar7 = (hef) xddVar.a;
                            hefVar7.j(i7 << 3);
                            if (k >= 0) {
                                hefVar7.j(k);
                            } else {
                                hefVar7.l(k);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 56:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).f(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 57:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).d(i7, k(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 58:
                        if (lgfVar.i(i7, i4, obj)) {
                            boolean booleanValue = ((Boolean) ghf.g(obj, j)).booleanValue();
                            hef hefVar8 = (hef) xddVar.a;
                            hefVar8.j(i7 << 3);
                            hefVar8.a(booleanValue ? (byte) 1 : (byte) 0);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 59:
                        if (lgfVar.i(i7, i4, obj)) {
                            Object object2 = unsafe.getObject(obj, j);
                            if (object2 instanceof String) {
                                ((hef) xddVar.a).h(i7, (String) object2);
                            } else {
                                ((hef) xddVar.a).c(i7, (xdf) object2);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 60:
                        if (lgfVar.i(i7, i4, obj)) {
                            xddVar.g(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 61:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).c(i7, (xdf) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 62:
                        if (lgfVar.i(i7, i4, obj)) {
                            int k2 = k(obj, j);
                            hef hefVar9 = (hef) xddVar.a;
                            hefVar9.j(i7 << 3);
                            hefVar9.j(k2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 63:
                        if (lgfVar.i(i7, i4, obj)) {
                            int k3 = k(obj, j);
                            hef hefVar10 = (hef) xddVar.a;
                            hefVar10.j(i7 << 3);
                            if (k3 >= 0) {
                                hefVar10.j(k3);
                            } else {
                                hefVar10.l(k3);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 64:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).d(i7, k(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 65:
                        if (lgfVar.i(i7, i4, obj)) {
                            ((hef) xddVar.a).f(i7, n(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 66:
                        if (lgfVar.i(i7, i4, obj)) {
                            int k4 = k(obj, j);
                            int i24 = (k4 << 1) ^ (k4 >> 31);
                            hef hefVar11 = (hef) xddVar.a;
                            hefVar11.j(i7 << 3);
                            hefVar11.j(i24);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 67:
                        if (lgfVar.i(i7, i4, obj)) {
                            long n = n(obj, j);
                            ((hef) xddVar.a).k(i7, (n << 1) ^ (n >> 63));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 68:
                        if (lgfVar.i(i7, i4, obj)) {
                            xddVar.e(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    default:
                        i4 += 3;
                        i3 = 1048575;
                }
                lgfVar = this;
                i4 += 3;
                i3 = 1048575;
            } else {
                lgfVar.g.getClass();
                chf chfVar = ((vef) obj).zzc;
                return;
            }
        }
    }

    @Override
    public final void d(Object obj, Object obj2) {
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
                                c6c c6cVar = ghf.c;
                                c6cVar.v(obj3, j, c6cVar.k(obj2, j));
                                s(i2, obj3);
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 1:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                c6c c6cVar2 = ghf.c;
                                c6cVar2.w(obj3, j, c6cVar2.p(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 2:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 3:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 4:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.h(obj3, j, ghf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 5:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 6:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.h(obj3, j, ghf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 7:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                c6c c6cVar3 = ghf.c;
                                c6cVar3.s(obj3, j, c6cVar3.x(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 8:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.i(obj3, j, ghf.g(obj2, j));
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
                                ghf.i(obj3, j, ghf.g(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 11:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.h(obj3, j, ghf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 12:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.h(obj3, j, ghf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 13:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.h(obj3, j, ghf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 14:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 15:
                            obj3 = obj;
                            if (u(i2, obj2)) {
                                ghf.h(obj3, j, ghf.e(obj2, j));
                                s(i2, obj3);
                            } else {
                                continue;
                            }
                            i2 += 3;
                            obj = obj3;
                        case 16:
                            if (u(i2, obj2)) {
                                obj3 = obj;
                                ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
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
                            Class cls = ugf.a;
                            Object g = ghf.g(obj, j);
                            Object g2 = ghf.g(obj2, j);
                            if (g == null) {
                                g2.getClass();
                                fyb.g();
                                return;
                            }
                            fyb.g();
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
                                ghf.i(obj, j, ghf.g(obj2, j));
                                ghf.h(obj, iArr[i2 + 2] & 1048575, i4);
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
                                ghf.i(obj, j, ghf.g(obj2, j));
                                ghf.h(obj, iArr[i2 + 2] & 1048575, i4);
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
                    ugf.o(this.g, obj, obj2);
                    return;
                }
            }
        } else {
            w26.j("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override
    public final int e(defpackage.vef r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.e(vef):int");
    }

    @Override
    public final int f(defpackage.vef r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.f(vef):int");
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
                                    ghf.g(obj, m & 1048575).getClass();
                                    fyb.g();
                                    return false;
                                }
                            }
                        } else if (i(i9, i3, obj) && !o(i3).g(ghf.g(obj, m & 1048575))) {
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) ghf.g(obj, m & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        tgf o = o(i3);
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
                    if (v(obj, i3, i2, i4, i12) && !o(i3).g(ghf.g(obj, m & 1048575))) {
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
        if (ghf.e(obj, this.a[i3 + 2] & 1048575) == i2) {
            return true;
        }
        return false;
    }

    public final int m(int i2) {
        return this.a[i2 + 1];
    }

    public final tgf o(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        tgf tgfVar = (tgf) objArr[i3];
        if (tgfVar != null) {
            return tgfVar;
        }
        tgf a = qgf.c.a((Class) objArr[i3 + 1]);
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
            tgf o = o(i2);
            if (!u(i2, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, m, object);
                } else {
                    vef zzc = o.zzc();
                    o.d(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                }
                s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                vef zzc2 = o.zzc();
                o.d(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.d(object2, object);
            return;
        }
        sc8.j(mue.d("Source subfield ", this.a[i2], " is present but null: ", obj2.toString()));
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
            tgf o = o(i2);
            if (!i(i3, i2, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, m, object);
                } else {
                    vef zzc = o.zzc();
                    o.d(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                }
                ghf.h(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                vef zzc2 = o.zzc();
                o.d(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.d(object2, object);
            return;
        }
        sc8.j(mue.d("Source subfield ", iArr[i2], " is present but null: ", obj2.toString()));
    }

    public final void s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        ghf.h(obj, j, ghf.e(obj, j) | (1 << (i3 >>> 20)));
    }

    public final boolean t(vef vefVar, vef vefVar2, int i2) {
        if (u(i2, vefVar) == u(i2, vefVar2)) {
            return true;
        }
        return false;
    }

    public final boolean u(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.u(int, java.lang.Object):boolean");
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
    public final vef zzc() {
        return (vef) ((vef) this.c).h(4, null);
    }
}
