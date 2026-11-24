package defpackage;

import java.io.IOException;
import java.security.AccessController;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import sun.misc.Unsafe;
public final class ptd implements ywd {
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final xkd f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final rud k;
    public final wod l;
    public final m0e m;
    public final bsd n;

    static {
        Unsafe unsafe;
        Logger logger = x1e.a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public ptd(int[] iArr, Object[] objArr, int i, int i2, int i3, xkd xkdVar, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, rud rudVar, wod wodVar, m0e m0eVar, khd khdVar, bsd bsdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = z;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = rudVar;
        this.l = wodVar;
        this.m = m0eVar;
        this.f = xkdVar;
        this.n = bsdVar;
    }

    public static int A(Object obj, long j) {
        return ((Integer) x1e.l(obj, j)).intValue();
    }

    public static long B(Object obj, long j) {
        return ((Long) x1e.l(obj, j)).longValue();
    }

    public static int k(ywd ywdVar, int i, byte[] bArr, int i2, int i3, omd omdVar, ucd ucdVar) {
        int m = m(ywdVar, bArr, i2, i3, ucdVar);
        while (true) {
            omdVar.add(ucdVar.c);
            if (m >= i3) {
                break;
            }
            int d = r1f.d(bArr, m, ucdVar);
            if (i != ucdVar.a) {
                break;
            }
            m = m(ywdVar, bArr, d, i3, ucdVar);
        }
        return m;
    }

    public static int l(ywd ywdVar, byte[] bArr, int i, int i2, int i3, ucd ucdVar) {
        ptd ptdVar = (ptd) ywdVar;
        Object a = ptdVar.a();
        int j = ptdVar.j(a, bArr, i, i2, i3, ucdVar);
        ptdVar.b(a);
        ucdVar.c = a;
        return j;
    }

    public static int m(ywd ywdVar, byte[] bArr, int i, int i2, ucd ucdVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = r1f.c(i4, bArr, i3, ucdVar);
            i4 = ucdVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object a = ywdVar.a();
            int i6 = i5 + i4;
            ywdVar.c(a, bArr, i5, i6, ucdVar);
            ywdVar.b(a);
            ucdVar.c = a;
            return i6;
        }
        throw xmd.a();
    }

    public static defpackage.ptd n(defpackage.iwd r24, defpackage.rud r25, defpackage.wod r26, defpackage.m0e r27, defpackage.khd r28, defpackage.bsd r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.n(iwd, rud, wod, m0e, khd, bsd):ptd");
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
                Object l = x1e.l(obj, v);
                if (l != null) {
                    this.n.getClass();
                    ((ord) l).a = false;
                    x1e.d(obj, v, l);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.l.a(obj, i2);
            }
        }
        this.m.getClass();
        ((xkd) obj).zzjp.d = false;
    }

    @Override
    public final void c(java.lang.Object r19, byte[] r20, int r21, int r22, defpackage.ucd r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.c(java.lang.Object, byte[], int, int, ucd):void");
    }

    @Override
    public final void d(xkd xkdVar, xkd xkdVar2) {
        xkd xkdVar3;
        long k;
        Unsafe unsafe;
        int i;
        xkdVar2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int v = v(i2);
                long j = v & 1048575;
                int i3 = iArr[i2];
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        } else {
                            c8c c8cVar = x1e.d;
                            c8cVar.m(xkdVar3, j, c8cVar.A(xkdVar2, j));
                            x(xkdVar3, i2);
                            break;
                        }
                    case 1:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        } else {
                            c8c c8cVar2 = x1e.d;
                            c8cVar2.n(xkdVar3, j, c8cVar2.z(xkdVar2, j));
                            x(xkdVar3, i2);
                            break;
                        }
                    case 2:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        k = x1e.k(xkdVar2, j);
                        unsafe = x1e.d.a;
                        unsafe.putLong(xkdVar3, j, k);
                        x(xkdVar3, i2);
                        break;
                    case 3:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        k = x1e.k(xkdVar2, j);
                        unsafe = x1e.d.a;
                        unsafe.putLong(xkdVar3, j, k);
                        x(xkdVar3, i2);
                        break;
                    case 4:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                        x(xkdVar3, i2);
                        break;
                    case 5:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        k = x1e.k(xkdVar2, j);
                        unsafe = x1e.d.a;
                        unsafe.putLong(xkdVar3, j, k);
                        x(xkdVar3, i2);
                        break;
                    case 6:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                        x(xkdVar3, i2);
                        break;
                    case 7:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        } else {
                            c8c c8cVar3 = x1e.d;
                            c8cVar3.o(xkdVar3, j, c8cVar3.y(xkdVar2, j));
                            x(xkdVar3, i2);
                            break;
                        }
                    case 8:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.d(xkdVar3, j, x1e.l(xkdVar2, j));
                        x(xkdVar3, i2);
                        break;
                    case 9:
                        xkdVar3 = xkdVar;
                        p(xkdVar3, xkdVar2, i2);
                        break;
                    case 10:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.d(xkdVar3, j, x1e.l(xkdVar2, j));
                        x(xkdVar3, i2);
                        break;
                    case 11:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                        x(xkdVar3, i2);
                        break;
                    case 12:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                        x(xkdVar3, i2);
                        break;
                    case 13:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                        x(xkdVar3, i2);
                        break;
                    case 14:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        k = x1e.k(xkdVar2, j);
                        unsafe = x1e.d.a;
                        unsafe.putLong(xkdVar3, j, k);
                        x(xkdVar3, i2);
                        break;
                    case 15:
                        xkdVar3 = xkdVar;
                        if (!r(i2, xkdVar2)) {
                            break;
                        }
                        x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                        x(xkdVar3, i2);
                        break;
                    case 16:
                        if (r(i2, xkdVar2)) {
                            k = x1e.k(xkdVar2, j);
                            unsafe = x1e.d.a;
                            xkdVar3 = xkdVar;
                            unsafe.putLong(xkdVar3, j, k);
                            x(xkdVar3, i2);
                            break;
                        }
                        xkdVar3 = xkdVar;
                        break;
                    case 17:
                        p(xkdVar, xkdVar2, i2);
                        xkdVar3 = xkdVar;
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
                        this.l.b(xkdVar, xkdVar2, j);
                        xkdVar3 = xkdVar;
                        break;
                    case 50:
                        Class cls = jxd.a;
                        Object l = x1e.l(xkdVar, j);
                        Object l2 = x1e.l(xkdVar2, j);
                        this.n.getClass();
                        x1e.d(xkdVar, j, bsd.a(l, l2));
                        xkdVar3 = xkdVar;
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
                        if (q(i3, i2, xkdVar2)) {
                            x1e.d(xkdVar, j, x1e.l(xkdVar2, j));
                            i = iArr[i2 + 2];
                            x1e.c(xkdVar, i3, i & 1048575);
                        }
                        xkdVar3 = xkdVar;
                        break;
                    case 60:
                    case 68:
                        y(xkdVar, xkdVar2, i2);
                        xkdVar3 = xkdVar;
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (q(i3, i2, xkdVar2)) {
                            x1e.d(xkdVar, j, x1e.l(xkdVar2, j));
                            i = iArr[i2 + 2];
                            x1e.c(xkdVar, i3, i & 1048575);
                        }
                        xkdVar3 = xkdVar;
                        break;
                    default:
                        xkdVar3 = xkdVar;
                        break;
                }
                i2 += 4;
                xkdVar = xkdVar3;
            } else {
                xkd xkdVar4 = xkdVar;
                if (!this.g) {
                    jxd.a(this.m, xkdVar4, xkdVar2);
                    return;
                }
                return;
            }
        }
    }

    @Override
    public final int e(defpackage.xkd r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.e(xkd):int");
    }

    @Override
    public final boolean f(defpackage.xkd r11, defpackage.xkd r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.f(xkd, xkd):boolean");
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
                                    Object l = x1e.l(obj, v & 1048575);
                                    this.n.getClass();
                                    if (!((ord) l).isEmpty()) {
                                        t(w);
                                        throw new NoSuchMethodError();
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (q(i5, w, obj) && !s(w).g(x1e.l(obj, v & 1048575))) {
                            return false;
                        }
                        i3++;
                        z4 = z;
                        iArr2 = iArr;
                    }
                    List list = (List) x1e.l(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ywd s = s(w);
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
                    if (z2 && !s(w).g(x1e.l(obj, v & 1048575))) {
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

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ucd ucdVar) {
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
                    valueOf = Double.valueOf(Double.longBitsToDouble(r1f.h(i9, bArr)));
                    unsafe.putObject(obj, j, valueOf);
                    e = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                return i9;
            case 52:
                i10 = i;
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(Float.intBitsToFloat(r1f.f(i10, bArr)));
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
                e = r1f.e(bArr, i, ucdVar);
                valueOf3 = Long.valueOf(ucdVar.b);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.d(bArr, i, ucdVar);
                valueOf3 = Integer.valueOf(ucdVar.a);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 56:
            case 65:
                i9 = i;
                if (i5 == 1) {
                    valueOf = Long.valueOf(r1f.h(i9, bArr));
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
                    valueOf2 = Integer.valueOf(r1f.f(i10, bArr));
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
                e = r1f.e(bArr, i, ucdVar);
                if (ucdVar.b == 0) {
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
                e = r1f.d(bArr, i, ucdVar);
                i11 = ucdVar.a;
                if (i11 == 0) {
                    valueOf3 = "";
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                if ((i6 & 536870912) != 0) {
                    if (!o2e.a.b(bArr, e, e + i11)) {
                        throw new IOException("Protocol message had invalid UTF-8.");
                    }
                }
                str = new String(bArr, e, i11, gld.a);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                e = m(s(i8), bArr, i, i2, ucdVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                valueOf3 = ucdVar.c;
                if (obj2 != null) {
                    valueOf3 = gld.a(obj2, valueOf3);
                }
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                e = r1f.d(bArr, i, ucdVar);
                i11 = ucdVar.a;
                if (i11 == 0) {
                    valueOf3 = efd.c;
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                str = efd.i(e, i11, bArr);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int d = r1f.d(bArr, i, ucdVar);
                int i12 = ucdVar.a;
                u(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i12));
                e = d;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.d(bArr, i, ucdVar);
                int i13 = ucdVar.a;
                valueOf3 = Integer.valueOf((i13 >>> 1) ^ (-(i13 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.e(bArr, i, ucdVar);
                long j3 = ucdVar.b;
                valueOf3 = Long.valueOf((j3 >>> 1) ^ (-(j3 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 68:
                if (i5 == 3) {
                    e = l(s(i8), bArr, i, i2, (i3 & (-8)) | 4, ucdVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj3 = ucdVar.c;
                    if (obj2 != null) {
                        obj3 = gld.a(obj2, obj3);
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

    public final int i(java.lang.Object r10, byte[] r11, int r12, int r13, int r14, int r15, int r16, int r17, long r18, int r20, long r21, defpackage.ucd r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.i(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, ucd):int");
    }

    public final int j(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, defpackage.ucd r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.j(java.lang.Object, byte[], int, int, int, ucd):int");
    }

    public final void o(Object obj, int i, long j) {
        ord ordVar;
        t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((ord) object).a) {
            ord ordVar2 = ord.b;
            if (ordVar2.isEmpty()) {
                ordVar = new ord();
            } else {
                ?? linkedHashMap = new LinkedHashMap(ordVar2);
                linkedHashMap.a = true;
                ordVar = linkedHashMap;
            }
            bsd.a(ordVar, object);
            unsafe.putObject(obj, j, ordVar);
        }
        throw new NoSuchMethodError();
    }

    public final void p(xkd xkdVar, xkd xkdVar2, int i) {
        long v = v(i) & 1048575;
        if (r(i, xkdVar2)) {
            Object l = x1e.l(xkdVar, v);
            Object l2 = x1e.l(xkdVar2, v);
            if (l != null && l2 != null) {
                l2 = gld.a(l, l2);
            } else if (l2 == null) {
                return;
            }
            x1e.d(xkdVar, v, l2);
            x(xkdVar, i);
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        if (x1e.j(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final boolean r(int r7, java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.r(int, java.lang.Object):boolean");
    }

    public final ywd s(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.b;
        ywd ywdVar = (ywd) objArr[i2];
        if (ywdVar != null) {
            return ywdVar;
        }
        ywd a = wvd.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object t(int i) {
        return this.b[(i / 4) << 1];
    }

    public final zbe u(int i) {
        return (zbe) this.b[((i / 4) << 1) + 1];
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

    public final void x(xkd xkdVar, int i) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        x1e.c(xkdVar, x1e.j(xkdVar, j) | (1 << (i2 >>> 20)), j);
    }

    public final void y(xkd xkdVar, xkd xkdVar2, int i) {
        int i2;
        int v = v(i);
        int[] iArr = this.a;
        int i3 = iArr[i];
        long j = v & 1048575;
        if (q(i3, i, xkdVar2)) {
            Object l = x1e.l(xkdVar, j);
            Object l2 = x1e.l(xkdVar2, j);
            if (l != null && l2 != null) {
                x1e.d(xkdVar, j, gld.a(l, l2));
                i2 = iArr[i + 2];
            } else if (l2 != null) {
                x1e.d(xkdVar, j, l2);
                i2 = iArr[i + 2];
            } else {
                return;
            }
            x1e.c(xkdVar, i3, i2 & 1048575);
        }
    }

    public final boolean z(xkd xkdVar, xkd xkdVar2, int i) {
        if (r(i, xkdVar) == r(i, xkdVar2)) {
            return true;
        }
        return false;
    }
}
