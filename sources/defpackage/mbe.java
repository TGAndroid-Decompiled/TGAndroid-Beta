package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
public final class mbe implements cde {
    public static final int[] j = new int[0];
    public static final Unsafe k;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final utd e;
    public final int[] f;
    public final int g;
    public final int h;
    public final a8d i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        k = unsafe;
    }

    public mbe(int[] iArr, Object[] objArr, int i, int i2, utd utdVar, int[] iArr2, int i3, int i4, a8d a8dVar, ied iedVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = a8dVar;
        this.e = utdVar;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof f4e) {
            return ((f4e) obj).m();
        }
        return true;
    }

    public static int p(Object obj, long j2) {
        return ((Integer) ohe.g(obj, j2)).intValue();
    }

    public static int r(int i) {
        return (i >>> 20) & 255;
    }

    public static long t(Object obj, long j2) {
        return ((Long) ohe.g(obj, j2)).longValue();
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
            StringBuilder m = mlb.m("Field ", str, " for ", name, " not found. Known fields are ");
            m.append(arrays);
            throw new RuntimeException(m.toString(), e);
        }
    }

    @Override
    public final void a(Object obj, byte[] bArr, int i, int i2, nl6 nl6Var) {
        o(obj, bArr, i, i2, 0, nl6Var);
    }

    @Override
    public final boolean b(f4e f4eVar, f4e f4eVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int s = s(i);
                long j2 = s & 1048575;
                switch (r(s)) {
                    case 0:
                        if (!j(f4eVar, f4eVar2, i)) {
                            break;
                        } else {
                            c8c c8cVar = ohe.c;
                            if (Double.doubleToLongBits(c8cVar.k(f4eVar, j2)) != Double.doubleToLongBits(c8cVar.k(f4eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!j(f4eVar, f4eVar2, i)) {
                            break;
                        } else {
                            c8c c8cVar2 = ohe.c;
                            if (Float.floatToIntBits(c8cVar2.p(f4eVar, j2)) != Float.floatToIntBits(c8cVar2.p(f4eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!j(f4eVar, f4eVar2, i)) {
                            break;
                        } else {
                            c8c c8cVar3 = ohe.c;
                            if (c8cVar3.x(f4eVar, j2) != c8cVar3.x(f4eVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
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
                        e = qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2));
                        break;
                    case 50:
                        e = qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2));
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
                        if (ohe.e(f4eVar, j3) == ohe.e(f4eVar2, j3) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
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
            } else if (f4eVar.zzc.equals(f4eVar2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int c(defpackage.f4e r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbe.c(f4e):int");
    }

    @Override
    public final void d(Object obj, cf9 cf9Var) {
        int i;
        int i2;
        mbe mbeVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = mbeVar.a;
            if (i4 < iArr.length) {
                int s = mbeVar.s(i4);
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
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).h(i7, Double.doubleToRawLongBits(ohe.c.k(obj, j2)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).f(i7, Float.floatToRawIntBits(ohe.c.p(obj, j2)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).p(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).p(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).j(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).h(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).f(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            byte x = ohe.c.x(obj, j2);
                            fyd fydVar = (fyd) cf9Var.b;
                            fydVar.o(i7 << 3);
                            int i10 = fydVar.d;
                            try {
                                int i11 = i10 + 1;
                                try {
                                    fydVar.b[i10] = x;
                                    fydVar.d = i11;
                                    break;
                                } catch (IndexOutOfBoundsException e) {
                                    e = e;
                                    i10 = i11;
                                    throw new ol2(i10, fydVar.c, 1, e);
                                }
                            } catch (IndexOutOfBoundsException e2) {
                                e = e2;
                            }
                        } else {
                            continue;
                        }
                    case 8:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            Object object = unsafe.getObject(obj, j2);
                            if (object instanceof String) {
                                ((fyd) cf9Var.b).l(i7, (String) object);
                                break;
                            } else {
                                ((fyd) cf9Var.b).e(i7, (cxd) object);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            cf9Var.N(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).e(i7, (cxd) unsafe.getObject(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).n(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).j(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).f(i7, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            ((fyd) cf9Var.b).h(i7, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            int i12 = unsafe.getInt(obj, j2);
                            ((fyd) cf9Var.b).n(i7, (i12 << 1) ^ (i12 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            long j3 = unsafe.getLong(obj, j2);
                            ((fyd) cf9Var.b).p(i7, (j3 << 1) ^ (j3 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (mbeVar.l(obj, i4, i6, i5, i)) {
                            cf9Var.K(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        qde.q(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 19:
                        qde.u(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 20:
                        qde.w(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 21:
                        qde.d(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 22:
                        qde.v(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 23:
                        qde.t(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 24:
                        qde.s(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 25:
                        qde.p(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 26:
                        int i13 = iArr[i4];
                        List list = (List) unsafe.getObject(obj, j2);
                        a8d a8dVar = qde.a;
                        if (list != null && !list.isEmpty()) {
                            fyd fydVar2 = (fyd) cf9Var.b;
                            if (list instanceof j7e) {
                                j7e j7eVar = (j7e) list;
                                for (int i14 = 0; i14 < list.size(); i14++) {
                                    Object zza = j7eVar.zza();
                                    if (zza instanceof String) {
                                        fydVar2.l(i13, (String) zza);
                                    } else {
                                        fydVar2.e(i13, (cxd) zza);
                                    }
                                }
                                break;
                            } else {
                                for (int i15 = 0; i15 < list.size(); i15++) {
                                    fydVar2.l(i13, (String) list.get(i15));
                                }
                                break;
                            }
                        }
                        break;
                    case 27:
                        int i16 = iArr[i4];
                        List list2 = (List) unsafe.getObject(obj, j2);
                        cde v = mbeVar.v(i4);
                        a8d a8dVar2 = qde.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i17 = 0; i17 < list2.size(); i17++) {
                                cf9Var.N(i16, list2.get(i17), v);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i18 = iArr[i4];
                        List list3 = (List) unsafe.getObject(obj, j2);
                        a8d a8dVar3 = qde.a;
                        if (list3 != null && !list3.isEmpty()) {
                            cf9Var.getClass();
                            for (int i19 = 0; i19 < list3.size(); i19++) {
                                ((fyd) cf9Var.b).e(i18, (cxd) list3.get(i19));
                            }
                            break;
                        }
                        break;
                    case 29:
                        qde.c(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 30:
                        qde.r(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 31:
                        qde.x(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 32:
                        qde.y(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 33:
                        qde.a(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 34:
                        qde.b(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                        break;
                    case 35:
                        qde.q(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 36:
                        qde.u(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 37:
                        qde.w(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 38:
                        qde.d(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 39:
                        qde.v(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 40:
                        qde.t(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 41:
                        qde.s(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 42:
                        qde.p(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 43:
                        qde.c(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 44:
                        qde.r(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 45:
                        qde.x(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 46:
                        qde.y(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 47:
                        qde.a(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 48:
                        qde.b(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                        break;
                    case 49:
                        int i20 = iArr[i4];
                        List list4 = (List) unsafe.getObject(obj, j2);
                        cde v2 = mbeVar.v(i4);
                        a8d a8dVar4 = qde.a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i21 = 0; i21 < list4.size(); i21++) {
                                cf9Var.K(i20, list4.get(i21), v2);
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j2) != null) {
                            mbeVar.w(i4).getClass();
                            rjb.p();
                            return;
                        }
                        break;
                    case 51:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).h(i7, Double.doubleToRawLongBits(((Double) ohe.g(obj, j2)).doubleValue()));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).f(i7, Float.floatToRawIntBits(((Float) ohe.g(obj, j2)).floatValue()));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).p(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).p(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).j(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).h(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).f(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (mbeVar.n(i7, i4, obj)) {
                            byte booleanValue = ((Boolean) ohe.g(obj, j2)).booleanValue();
                            fyd fydVar3 = (fyd) cf9Var.b;
                            fydVar3.o(i7 << 3);
                            int i22 = fydVar3.d;
                            try {
                                i2 = i22 + 1;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                            }
                            try {
                                fydVar3.b[i22] = booleanValue;
                                fydVar3.d = i2;
                                break;
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                i22 = i2;
                                throw new ol2(i22, fydVar3.c, 1, e);
                            }
                        } else {
                            continue;
                        }
                    case 59:
                        if (mbeVar.n(i7, i4, obj)) {
                            Object object2 = unsafe.getObject(obj, j2);
                            if (object2 instanceof String) {
                                ((fyd) cf9Var.b).l(i7, (String) object2);
                                break;
                            } else {
                                ((fyd) cf9Var.b).e(i7, (cxd) object2);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (mbeVar.n(i7, i4, obj)) {
                            cf9Var.N(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).e(i7, (cxd) unsafe.getObject(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).n(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).j(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).f(i7, p(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (mbeVar.n(i7, i4, obj)) {
                            ((fyd) cf9Var.b).h(i7, t(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (mbeVar.n(i7, i4, obj)) {
                            int p = p(obj, j2);
                            ((fyd) cf9Var.b).n(i7, (p << 1) ^ (p >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (mbeVar.n(i7, i4, obj)) {
                            long t = t(obj, j2);
                            ((fyd) cf9Var.b).p(i7, (t << 1) ^ (t >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (mbeVar.n(i7, i4, obj)) {
                            cf9Var.K(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                            break;
                        } else {
                            break;
                        }
                }
                i4 += 3;
                i3 = 1048575;
                mbeVar = this;
            } else {
                ((f4e) obj).zzc.d(cf9Var);
                return;
            }
        }
    }

    @Override
    public final boolean e(Object obj) {
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
                                if (r == 50 && !((s9e) ohe.g(obj, s & 1048575)).isEmpty()) {
                                    w(i2).getClass();
                                    rjb.p();
                                    return false;
                                }
                            }
                        } else if (n(i8, i2, obj) && !v(i2).e(ohe.g(obj, s & 1048575))) {
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) ohe.g(obj, s & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        cde v = v(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (v.e(list.get(i13))) {
                            }
                        }
                        continue;
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (l(obj, i2, i, i3, i11) && !v(i2).e(ohe.g(obj, s & 1048575))) {
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
    public final int f(defpackage.f4e r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbe.f(f4e):int");
    }

    public final void g(int i, Object obj, Object obj2) {
        if (!k(i, obj2)) {
            return;
        }
        long s = s(i) & 1048575;
        Unsafe unsafe = k;
        Object object = unsafe.getObject(obj2, s);
        if (object != null) {
            cde v = v(i);
            if (!k(i, obj)) {
                if (!m(object)) {
                    unsafe.putObject(obj, s, object);
                } else {
                    f4e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                }
                i(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                f4e zze2 = v.zze();
                v.zzg(zze2, object2);
                unsafe.putObject(obj, s, zze2);
                object2 = zze2;
            }
            v.zzg(object2, object);
            return;
        }
        dq9.m(mle.d("Source subfield ", this.a[i], " is present but null: ", obj2.toString()));
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
            cde v = v(i);
            if (!n(i2, i, obj)) {
                if (!m(object)) {
                    unsafe.putObject(obj, s, object);
                } else {
                    f4e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                }
                ohe.h(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                f4e zze2 = v.zze();
                v.zzg(zze2, object2);
                unsafe.putObject(obj, s, zze2);
                object2 = zze2;
            }
            v.zzg(object2, object);
            return;
        }
        dq9.m(mle.d("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
    }

    public final void i(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        ohe.h(obj, j2, ohe.e(obj, j2) | (1 << (i2 >>> 20)));
    }

    public final boolean j(f4e f4eVar, f4e f4eVar2, int i) {
        if (k(i, f4eVar) == k(i, f4eVar2)) {
            return true;
        }
        return false;
    }

    public final boolean k(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbe.k(int, java.lang.Object):boolean");
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
        if (ohe.e(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final int o(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.nl6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbe.o(java.lang.Object, byte[], int, int, int, nl6):int");
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

    public final btd u(int i) {
        return (btd) this.b[((i / 3) << 1) + 1];
    }

    public final cde v(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        cde cdeVar = (cde) objArr[i2];
        if (cdeVar != null) {
            return cdeVar;
        }
        cde a = kce.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object w(int i) {
        return this.b[(i / 3) << 1];
    }

    public final Object x(int i, Object obj) {
        cde v = v(i);
        int s = s(i) & 1048575;
        if (!k(i, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s);
        if (m(object)) {
            return object;
        }
        f4e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    public final Object y(int i, int i2, Object obj) {
        cde v = v(i2);
        if (!n(i, i2, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        f4e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    @Override
    public final f4e zze() {
        return (f4e) ((f4e) this.e).d(4);
    }

    @Override
    public final void zzf(Object obj) {
        if (m(obj)) {
            if (obj instanceof f4e) {
                f4e f4eVar = (f4e) obj;
                f4eVar.l();
                f4eVar.zza = 0;
                f4eVar.j();
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
                                    eud eudVar = (eud) ((d5e) ohe.g(obj, j2));
                                    if (!eudVar.a) {
                                        break;
                                    } else {
                                        eudVar.a = false;
                                        break;
                                    }
                                case 50:
                                    Object object = unsafe.getObject(obj, j2);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((s9e) object).a = false;
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
                    jge jgeVar = ((f4e) obj).zzc;
                    if (jgeVar.e) {
                        jgeVar.e = false;
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
                                c8c c8cVar = ohe.c;
                                c8cVar.v(obj3, j2, c8cVar.k(obj2, j2));
                                i(i, obj3);
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 1:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                c8c c8cVar2 = ohe.c;
                                c8cVar2.w(obj3, j2, c8cVar2.p(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 2:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 3:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 4:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.h(obj3, j2, ohe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 5:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 6:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.h(obj3, j2, ohe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 7:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                c8c c8cVar3 = ohe.c;
                                c8cVar3.s(obj3, j2, c8cVar3.x(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 8:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.i(obj3, j2, ohe.g(obj2, j2));
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
                                ohe.i(obj3, j2, ohe.g(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 11:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.h(obj3, j2, ohe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 12:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.h(obj3, j2, ohe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 13:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.h(obj3, j2, ohe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 14:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 15:
                            obj3 = obj;
                            if (k(i, obj2)) {
                                ohe.h(obj3, j2, ohe.e(obj2, j2));
                                i(i, obj3);
                            } else {
                                continue;
                            }
                            i += 3;
                            obj = obj3;
                        case 16:
                            if (k(i, obj2)) {
                                obj3 = obj;
                                ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
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
                            d5e d5eVar = (d5e) ohe.g(obj, j2);
                            d5e d5eVar2 = (d5e) ohe.g(obj2, j2);
                            int size = d5eVar.size();
                            int size2 = d5eVar2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((eud) d5eVar).a) {
                                    d5eVar = d5eVar.zzd(size2 + size);
                                }
                                d5eVar.addAll(d5eVar2);
                            }
                            if (size > 0) {
                                d5eVar2 = d5eVar;
                            }
                            ohe.i(obj, j2, d5eVar2);
                            break;
                        case 50:
                            a8d a8dVar = qde.a;
                            ohe.i(obj, j2, ied.a(ohe.g(obj, j2), ohe.g(obj2, j2)));
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
                                ohe.i(obj, j2, ohe.g(obj2, j2));
                                ohe.h(obj, iArr[i + 2] & 1048575, i3);
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
                                ohe.i(obj, j2, ohe.g(obj2, j2));
                                ohe.h(obj, iArr[i + 2] & 1048575, i3);
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
                    qde.o(obj, obj2);
                    return;
                }
            }
        } else {
            u36.j("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }
}
