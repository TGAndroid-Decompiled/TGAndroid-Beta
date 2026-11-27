package defpackage;

import java.io.IOException;
import java.security.AccessController;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import sun.misc.Unsafe;
public final class cwd implements lzd {
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final mnd f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final exd k;
    public final krd l;
    public final z2e m;
    public final oud n;

    static {
        Unsafe unsafe;
        Logger logger = k4e.a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public cwd(int[] iArr, Object[] objArr, int i, int i2, int i3, mnd mndVar, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, exd exdVar, krd krdVar, z2e z2eVar, akd akdVar, oud oudVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = z;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = exdVar;
        this.l = krdVar;
        this.m = z2eVar;
        this.f = mndVar;
        this.n = oudVar;
    }

    public static int A(long j, Object obj) {
        return ((Integer) k4e.l(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) k4e.l(j, obj)).longValue();
    }

    public static int k(lzd lzdVar, int i, byte[] bArr, int i2, int i3, dpd dpdVar, lfd lfdVar) {
        int m = m(lzdVar, bArr, i2, i3, lfdVar);
        while (true) {
            dpdVar.add(lfdVar.c);
            if (m >= i3) {
                break;
            }
            int d = i4f.d(bArr, m, lfdVar);
            if (i != lfdVar.a) {
                break;
            }
            m = m(lzdVar, bArr, d, i3, lfdVar);
        }
        return m;
    }

    public static int l(lzd lzdVar, byte[] bArr, int i, int i2, int i3, lfd lfdVar) {
        cwd cwdVar = (cwd) lzdVar;
        Object a = cwdVar.a();
        int j = cwdVar.j(a, bArr, i, i2, i3, lfdVar);
        cwdVar.b(a);
        lfdVar.c = a;
        return j;
    }

    public static int m(lzd lzdVar, byte[] bArr, int i, int i2, lfd lfdVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i4f.c(i4, bArr, i3, lfdVar);
            i4 = lfdVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object a = lzdVar.a();
            int i6 = i5 + i4;
            lzdVar.c(a, bArr, i5, i6, lfdVar);
            lzdVar.b(a);
            lfdVar.c = a;
            return i6;
        }
        throw mpd.a();
    }

    public static defpackage.cwd n(defpackage.vyd r24, defpackage.exd r25, defpackage.krd r26, defpackage.z2e r27, defpackage.akd r28, defpackage.oud r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwd.n(vyd, exd, krd, z2e, akd, oud):cwd");
    }

    @Override
    public final Object a() {
        this.k.getClass();
        return this.f.a(4);
    }

    @Override
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i : iArr) {
                long v = v(i) & 1048575;
                Object l = k4e.l(v, obj);
                if (l != null) {
                    this.n.getClass();
                    ((bud) l).a = false;
                    k4e.d(v, obj, l);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.l.a(i2, obj);
            }
        }
        this.m.getClass();
        ((mnd) obj).zzjp.d = false;
    }

    @Override
    public final void c(java.lang.Object r19, byte[] r20, int r21, int r22, defpackage.lfd r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwd.c(java.lang.Object, byte[], int, int, lfd):void");
    }

    @Override
    public final void d(mnd mndVar, mnd mndVar2) {
        mnd mndVar3;
        long k;
        Unsafe unsafe;
        int i;
        mndVar2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int v = v(i2);
                long j = v & 1048575;
                int i3 = iArr[i2];
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        } else {
                            cac cacVar = k4e.d;
                            cacVar.m(mndVar3, j, cacVar.A(mndVar2, j));
                            x(mndVar3, i2);
                            break;
                        }
                    case 1:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        } else {
                            cac cacVar2 = k4e.d;
                            cacVar2.n(mndVar3, j, cacVar2.z(j, mndVar2));
                            x(mndVar3, i2);
                            break;
                        }
                    case 2:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k = k4e.k(j, mndVar2);
                        unsafe = k4e.d.a;
                        unsafe.putLong(mndVar3, j, k);
                        x(mndVar3, i2);
                        break;
                    case 3:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k = k4e.k(j, mndVar2);
                        unsafe = k4e.d.a;
                        unsafe.putLong(mndVar3, j, k);
                        x(mndVar3, i2);
                        break;
                    case 4:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 5:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k = k4e.k(j, mndVar2);
                        unsafe = k4e.d.a;
                        unsafe.putLong(mndVar3, j, k);
                        x(mndVar3, i2);
                        break;
                    case 6:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 7:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        } else {
                            cac cacVar3 = k4e.d;
                            cacVar3.o(mndVar3, j, cacVar3.y(j, mndVar2));
                            x(mndVar3, i2);
                            break;
                        }
                    case 8:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.d(j, mndVar3, k4e.l(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 9:
                        mndVar3 = mndVar;
                        p(mndVar3, mndVar2, i2);
                        break;
                    case 10:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.d(j, mndVar3, k4e.l(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 11:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 12:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 13:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 14:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k = k4e.k(j, mndVar2);
                        unsafe = k4e.d.a;
                        unsafe.putLong(mndVar3, j, k);
                        x(mndVar3, i2);
                        break;
                    case 15:
                        mndVar3 = mndVar;
                        if (!r(i2, mndVar2)) {
                            break;
                        }
                        k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    case 16:
                        if (r(i2, mndVar2)) {
                            k = k4e.k(j, mndVar2);
                            unsafe = k4e.d.a;
                            mndVar3 = mndVar;
                            unsafe.putLong(mndVar3, j, k);
                            x(mndVar3, i2);
                            break;
                        }
                        mndVar3 = mndVar;
                        break;
                    case 17:
                        p(mndVar, mndVar2, i2);
                        mndVar3 = mndVar;
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
                        this.l.b(mndVar, mndVar2, j);
                        mndVar3 = mndVar;
                        break;
                    case 50:
                        Class cls = wzd.a;
                        Object l = k4e.l(j, mndVar);
                        Object l2 = k4e.l(j, mndVar2);
                        this.n.getClass();
                        k4e.d(j, mndVar, oud.a(l, l2));
                        mndVar3 = mndVar;
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
                        if (q(i3, i2, mndVar2)) {
                            k4e.d(j, mndVar, k4e.l(j, mndVar2));
                            i = iArr[i2 + 2];
                            k4e.c(i & 1048575, mndVar, i3);
                        }
                        mndVar3 = mndVar;
                        break;
                    case 60:
                    case 68:
                        y(mndVar, mndVar2, i2);
                        mndVar3 = mndVar;
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (q(i3, i2, mndVar2)) {
                            k4e.d(j, mndVar, k4e.l(j, mndVar2));
                            i = iArr[i2 + 2];
                            k4e.c(i & 1048575, mndVar, i3);
                        }
                        mndVar3 = mndVar;
                        break;
                    default:
                        mndVar3 = mndVar;
                        break;
                }
                i2 += 4;
                mndVar = mndVar3;
            } else {
                mnd mndVar4 = mndVar;
                if (!this.g) {
                    wzd.a(this.m, mndVar4, mndVar2);
                    return;
                }
                return;
            }
        }
    }

    @Override
    public final int e(defpackage.mnd r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwd.e(mnd):int");
    }

    @Override
    public final boolean f(defpackage.mnd r11, defpackage.mnd r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwd.f(mnd, mnd):boolean");
    }

    @Override
    public final boolean g(Object obj) {
        boolean z;
        int[] iArr;
        int i;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        z4 = true;
        z4 = true;
        int[] iArr2 = this.h;
        if (iArr2 != null && iArr2.length != 0) {
            int length = iArr2.length;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = iArr2[i3];
                int w = w(i5);
                int v = v(w);
                boolean z5 = this.g;
                if (!z5) {
                    int i6 = this.a[w + 2];
                    int i7 = i6 & 1048575;
                    i = (z4 ? 1 : 0) << (i6 >>> 20);
                    if (i7 != i2) {
                        Unsafe unsafe = o;
                        z = z4 ? 1 : 0;
                        iArr = iArr2;
                        i4 = unsafe.getInt(obj, i7);
                        i2 = i7;
                    } else {
                        z = z4 ? 1 : 0;
                        iArr = iArr2;
                    }
                } else {
                    z = z4 ? 1 : 0;
                    iArr = iArr2;
                    i = 0;
                }
                if ((268435456 & v) != 0) {
                    if (z5) {
                        z3 = r(w, obj);
                    } else if ((i4 & i) != 0) {
                        z3 = z;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        return false;
                    }
                }
                int i8 = (267386880 & v) >>> 20;
                if (i8 != 9 && i8 != 17) {
                    if (i8 != 27) {
                        if (i8 != 60 && i8 != 68) {
                            if (i8 != 49) {
                                if (i8 == 50) {
                                    Object l = k4e.l(v & 1048575, obj);
                                    this.n.getClass();
                                    if (!((bud) l).isEmpty()) {
                                        t(w);
                                        throw new NoSuchMethodError();
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (q(i5, w, obj) && !s(w).g(k4e.l(v & 1048575, obj))) {
                            return false;
                        }
                        i3++;
                        z4 = z;
                        iArr2 = iArr;
                    }
                    List list = (List) k4e.l(v & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        lzd s = s(w);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (!s.g(list.get(i9))) {
                                return false;
                            }
                        }
                        continue;
                    }
                    i3++;
                    z4 = z;
                    iArr2 = iArr;
                } else {
                    if (z5) {
                        z2 = r(w, obj);
                    } else if ((i & i4) != 0) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    if (z2 && !s(w).g(k4e.l(v & 1048575, obj))) {
                        return false;
                    }
                    i3++;
                    z4 = z;
                    iArr2 = iArr;
                }
            }
        }
        return z4;
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, lfd lfdVar) {
        int i9;
        Object valueOf;
        int i10;
        Object valueOf2;
        int e;
        Object valueOf3;
        int i11;
        Object str;
        long j2 = this.a[i8 + 2] & 1048575;
        Object obj2 = null;
        boolean z = true;
        Unsafe unsafe = o;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 == 1) {
                    valueOf = Double.valueOf(Double.longBitsToDouble(i4f.h(i9, bArr)));
                    unsafe.putObject(obj, j, valueOf);
                    e = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                return i9;
            case 52:
                i10 = i;
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(Float.intBitsToFloat(i4f.f(i10, bArr)));
                    unsafe.putObject(obj, j, valueOf2);
                    e = i10 + 4;
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.e(bArr, i, lfdVar);
                valueOf3 = Long.valueOf(lfdVar.b);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                valueOf3 = Integer.valueOf(lfdVar.a);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 56:
            case 65:
                i9 = i;
                if (i5 == 1) {
                    valueOf = Long.valueOf(i4f.h(i9, bArr));
                    unsafe.putObject(obj, j, valueOf);
                    e = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                return i9;
            case 57:
            case 64:
                i10 = i;
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(i4f.f(i10, bArr));
                    unsafe.putObject(obj, j, valueOf2);
                    e = i10 + 4;
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                return i10;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.e(bArr, i, lfdVar);
                if (lfdVar.b == 0) {
                    z = false;
                }
                valueOf3 = Boolean.valueOf(z);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                i11 = lfdVar.a;
                if (i11 == 0) {
                    valueOf3 = "";
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                if ((i6 & 536870912) != 0) {
                    if (!b5e.a.b(bArr, e, e + i11)) {
                        throw new IOException("Protocol message had invalid UTF-8.");
                    }
                }
                str = new String(bArr, e, i11, vnd.a);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                e = m(s(i8), bArr, i, i2, lfdVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                valueOf3 = lfdVar.c;
                if (obj2 != null) {
                    valueOf3 = vnd.a(obj2, valueOf3);
                }
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                i11 = lfdVar.a;
                if (i11 == 0) {
                    valueOf3 = vhd.c;
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                str = vhd.i(e, i11, bArr);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int d = i4f.d(bArr, i, lfdVar);
                int i12 = lfdVar.a;
                u(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i12));
                e = d;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                int i13 = lfdVar.a;
                valueOf3 = Integer.valueOf((i13 >>> 1) ^ (-(i13 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.e(bArr, i, lfdVar);
                long j3 = lfdVar.b;
                valueOf3 = Long.valueOf((j3 >>> 1) ^ (-(j3 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 68:
                if (i5 == 3) {
                    e = l(s(i8), bArr, i, i2, (i3 & (-8)) | 4, lfdVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj3 = lfdVar.c;
                    if (obj2 != null) {
                        obj3 = vnd.a(obj2, obj3);
                    }
                    unsafe.putObject(obj, j, obj3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                return i;
            default:
                return i;
        }
    }

    public final int i(java.lang.Object r10, byte[] r11, int r12, int r13, int r14, int r15, int r16, int r17, long r18, int r20, long r21, defpackage.lfd r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwd.i(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, lfd):int");
    }

    public final int j(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, defpackage.lfd r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwd.j(java.lang.Object, byte[], int, int, int, lfd):int");
    }

    public final void o(long j, Object obj, int i) {
        bud budVar;
        t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((bud) object).a) {
            bud budVar2 = bud.b;
            if (budVar2.isEmpty()) {
                budVar = new bud();
            } else {
                ?? linkedHashMap = new LinkedHashMap(budVar2);
                linkedHashMap.a = true;
                budVar = linkedHashMap;
            }
            oud.a(budVar, object);
            unsafe.putObject(obj, j, budVar);
        }
        throw new NoSuchMethodError();
    }

    public final void p(mnd mndVar, mnd mndVar2, int i) {
        long v = v(i) & 1048575;
        if (r(i, mndVar2)) {
            Object l = k4e.l(v, mndVar);
            Object l2 = k4e.l(v, mndVar2);
            if (l != null && l2 != null) {
                l2 = vnd.a(l, l2);
            } else if (l2 == null) {
                return;
            }
            k4e.d(v, mndVar, l2);
            x(mndVar, i);
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        if (k4e.j(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final boolean r(int r7, java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwd.r(int, java.lang.Object):boolean");
    }

    public final lzd s(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.b;
        lzd lzdVar = (lzd) objArr[i2];
        if (lzdVar != null) {
            return lzdVar;
        }
        lzd a = jyd.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object t(int i) {
        return this.b[(i / 4) << 1];
    }

    public final oee u(int i) {
        return (oee) this.b[((i / 4) << 1) + 1];
    }

    public final int v(int i) {
        return this.a[i + 1];
    }

    public final int w(int i) {
        int i2 = this.c;
        if (i >= i2) {
            int[] iArr = this.a;
            int i3 = this.e;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (iArr[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.d) {
                int i5 = i3 - i2;
                int length = (iArr.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = iArr[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
                return -1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public final void x(mnd mndVar, int i) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        k4e.c(j, mndVar, k4e.j(j, mndVar) | (1 << (i2 >>> 20)));
    }

    public final void y(mnd mndVar, mnd mndVar2, int i) {
        int i2;
        int v = v(i);
        int[] iArr = this.a;
        int i3 = iArr[i];
        long j = v & 1048575;
        if (q(i3, i, mndVar2)) {
            Object l = k4e.l(j, mndVar);
            Object l2 = k4e.l(j, mndVar2);
            if (l != null && l2 != null) {
                k4e.d(j, mndVar, vnd.a(l, l2));
                i2 = iArr[i + 2];
            } else if (l2 != null) {
                k4e.d(j, mndVar, l2);
                i2 = iArr[i + 2];
            } else {
                return;
            }
            k4e.c(i2 & 1048575, mndVar, i3);
        }
    }

    public final boolean z(mnd mndVar, mnd mndVar2, int i) {
        if (r(i, mndVar) == r(i, mndVar2)) {
            return true;
        }
        return false;
    }
}
