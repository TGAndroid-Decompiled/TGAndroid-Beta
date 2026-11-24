package defpackage;

import java.io.IOException;
import java.security.AccessController;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import sun.misc.Unsafe;
public final class mrd implements vud {
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final vid f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final osd k;
    public final tmd l;
    public final jyd m;
    public final ypd n;

    static {
        Unsafe unsafe;
        Logger logger = uzd.a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public mrd(int[] iArr, Object[] objArr, int i, int i2, int i3, vid vidVar, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, osd osdVar, tmd tmdVar, jyd jydVar, jfd jfdVar, ypd ypdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = z;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = osdVar;
        this.l = tmdVar;
        this.m = jydVar;
        this.f = vidVar;
        this.n = ypdVar;
    }

    public static int A(Object obj, long j) {
        return ((Integer) uzd.l(obj, j)).intValue();
    }

    public static long B(Object obj, long j) {
        return ((Long) uzd.l(obj, j)).longValue();
    }

    public static int k(vud vudVar, int i, byte[] bArr, int i2, int i3, mkd mkdVar, sad sadVar) {
        int m = m(vudVar, bArr, i2, i3, sadVar);
        while (true) {
            mkdVar.add(sadVar.c);
            if (m >= i3) {
                break;
            }
            int d = pze.d(bArr, m, sadVar);
            if (i != sadVar.a) {
                break;
            }
            m = m(vudVar, bArr, d, i3, sadVar);
        }
        return m;
    }

    public static int l(vud vudVar, byte[] bArr, int i, int i2, int i3, sad sadVar) {
        mrd mrdVar = (mrd) vudVar;
        Object a = mrdVar.a();
        int j = mrdVar.j(a, bArr, i, i2, i3, sadVar);
        mrdVar.b(a);
        sadVar.c = a;
        return j;
    }

    public static int m(vud vudVar, byte[] bArr, int i, int i2, sad sadVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = pze.c(i4, bArr, i3, sadVar);
            i4 = sadVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object a = vudVar.a();
            int i6 = i5 + i4;
            vudVar.c(a, bArr, i5, i6, sadVar);
            vudVar.b(a);
            sadVar.c = a;
            return i6;
        }
        throw vkd.a();
    }

    public static defpackage.mrd n(defpackage.fud r24, defpackage.osd r25, defpackage.tmd r26, defpackage.jyd r27, defpackage.jfd r28, defpackage.ypd r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrd.n(fud, osd, tmd, jyd, jfd, ypd):mrd");
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
                Object l = uzd.l(obj, v);
                if (l != null) {
                    this.n.getClass();
                    ((lpd) l).a = false;
                    uzd.d(obj, v, l);
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
        ((vid) obj).zzjp.d = false;
    }

    @Override
    public final void c(java.lang.Object r19, byte[] r20, int r21, int r22, defpackage.sad r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrd.c(java.lang.Object, byte[], int, int, sad):void");
    }

    @Override
    public final void d(vid vidVar, vid vidVar2) {
        vid vidVar3;
        long k;
        Unsafe unsafe;
        int i;
        vidVar2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int v = v(i2);
                long j = v & 1048575;
                int i3 = iArr[i2];
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        } else {
                            c6c c6cVar = uzd.d;
                            c6cVar.m(vidVar3, j, c6cVar.A(vidVar2, j));
                            x(vidVar3, i2);
                            break;
                        }
                    case 1:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        } else {
                            c6c c6cVar2 = uzd.d;
                            c6cVar2.n(vidVar3, j, c6cVar2.z(vidVar2, j));
                            x(vidVar3, i2);
                            break;
                        }
                    case 2:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        k = uzd.k(vidVar2, j);
                        unsafe = uzd.d.a;
                        unsafe.putLong(vidVar3, j, k);
                        x(vidVar3, i2);
                        break;
                    case 3:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        k = uzd.k(vidVar2, j);
                        unsafe = uzd.d.a;
                        unsafe.putLong(vidVar3, j, k);
                        x(vidVar3, i2);
                        break;
                    case 4:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                        x(vidVar3, i2);
                        break;
                    case 5:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        k = uzd.k(vidVar2, j);
                        unsafe = uzd.d.a;
                        unsafe.putLong(vidVar3, j, k);
                        x(vidVar3, i2);
                        break;
                    case 6:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                        x(vidVar3, i2);
                        break;
                    case 7:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        } else {
                            c6c c6cVar3 = uzd.d;
                            c6cVar3.o(vidVar3, j, c6cVar3.y(vidVar2, j));
                            x(vidVar3, i2);
                            break;
                        }
                    case 8:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.d(vidVar3, j, uzd.l(vidVar2, j));
                        x(vidVar3, i2);
                        break;
                    case 9:
                        vidVar3 = vidVar;
                        p(vidVar3, vidVar2, i2);
                        break;
                    case 10:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.d(vidVar3, j, uzd.l(vidVar2, j));
                        x(vidVar3, i2);
                        break;
                    case 11:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                        x(vidVar3, i2);
                        break;
                    case 12:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                        x(vidVar3, i2);
                        break;
                    case 13:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                        x(vidVar3, i2);
                        break;
                    case 14:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        k = uzd.k(vidVar2, j);
                        unsafe = uzd.d.a;
                        unsafe.putLong(vidVar3, j, k);
                        x(vidVar3, i2);
                        break;
                    case 15:
                        vidVar3 = vidVar;
                        if (!r(i2, vidVar2)) {
                            break;
                        }
                        uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                        x(vidVar3, i2);
                        break;
                    case 16:
                        if (r(i2, vidVar2)) {
                            k = uzd.k(vidVar2, j);
                            unsafe = uzd.d.a;
                            vidVar3 = vidVar;
                            unsafe.putLong(vidVar3, j, k);
                            x(vidVar3, i2);
                            break;
                        }
                        vidVar3 = vidVar;
                        break;
                    case 17:
                        p(vidVar, vidVar2, i2);
                        vidVar3 = vidVar;
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
                        this.l.b(vidVar, vidVar2, j);
                        vidVar3 = vidVar;
                        break;
                    case 50:
                        Class cls = gvd.a;
                        Object l = uzd.l(vidVar, j);
                        Object l2 = uzd.l(vidVar2, j);
                        this.n.getClass();
                        uzd.d(vidVar, j, ypd.a(l, l2));
                        vidVar3 = vidVar;
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
                        if (q(i3, i2, vidVar2)) {
                            uzd.d(vidVar, j, uzd.l(vidVar2, j));
                            i = iArr[i2 + 2];
                            uzd.c(vidVar, i3, i & 1048575);
                        }
                        vidVar3 = vidVar;
                        break;
                    case 60:
                    case 68:
                        y(vidVar, vidVar2, i2);
                        vidVar3 = vidVar;
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (q(i3, i2, vidVar2)) {
                            uzd.d(vidVar, j, uzd.l(vidVar2, j));
                            i = iArr[i2 + 2];
                            uzd.c(vidVar, i3, i & 1048575);
                        }
                        vidVar3 = vidVar;
                        break;
                    default:
                        vidVar3 = vidVar;
                        break;
                }
                i2 += 4;
                vidVar = vidVar3;
            } else {
                vid vidVar4 = vidVar;
                if (!this.g) {
                    gvd.a(this.m, vidVar4, vidVar2);
                    return;
                }
                return;
            }
        }
    }

    @Override
    public final int e(defpackage.vid r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrd.e(vid):int");
    }

    @Override
    public final boolean f(defpackage.vid r11, defpackage.vid r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrd.f(vid, vid):boolean");
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
                                    Object l = uzd.l(obj, v & 1048575);
                                    this.n.getClass();
                                    if (!((lpd) l).isEmpty()) {
                                        t(w);
                                        throw new NoSuchMethodError();
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (q(i5, w, obj) && !s(w).g(uzd.l(obj, v & 1048575))) {
                            return false;
                        }
                        i3++;
                        z4 = z;
                        iArr2 = iArr;
                    }
                    List list = (List) uzd.l(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        vud s = s(w);
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
                    if (z2 && !s(w).g(uzd.l(obj, v & 1048575))) {
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

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, sad sadVar) {
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
                    valueOf = Double.valueOf(Double.longBitsToDouble(pze.h(i9, bArr)));
                    unsafe.putObject(obj, j, valueOf);
                    e = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                return i9;
            case 52:
                i10 = i;
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(Float.intBitsToFloat(pze.f(i10, bArr)));
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
                e = pze.e(bArr, i, sadVar);
                valueOf3 = Long.valueOf(sadVar.b);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                e = pze.d(bArr, i, sadVar);
                valueOf3 = Integer.valueOf(sadVar.a);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 56:
            case 65:
                i9 = i;
                if (i5 == 1) {
                    valueOf = Long.valueOf(pze.h(i9, bArr));
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
                    valueOf2 = Integer.valueOf(pze.f(i10, bArr));
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
                e = pze.e(bArr, i, sadVar);
                if (sadVar.b == 0) {
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
                e = pze.d(bArr, i, sadVar);
                i11 = sadVar.a;
                if (i11 == 0) {
                    valueOf3 = "";
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                if ((i6 & 536870912) != 0) {
                    if (!l0e.a.b(bArr, e, e + i11)) {
                        throw new IOException("Protocol message had invalid UTF-8.");
                    }
                }
                str = new String(bArr, e, i11, ejd.a);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                e = m(s(i8), bArr, i, i2, sadVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                valueOf3 = sadVar.c;
                if (obj2 != null) {
                    valueOf3 = ejd.a(obj2, valueOf3);
                }
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                e = pze.d(bArr, i, sadVar);
                i11 = sadVar.a;
                if (i11 == 0) {
                    valueOf3 = cdd.c;
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                str = cdd.i(e, i11, bArr);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int d = pze.d(bArr, i, sadVar);
                int i12 = sadVar.a;
                u(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i12));
                e = d;
                unsafe.putInt(obj, j2, i4);
                return e;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                e = pze.d(bArr, i, sadVar);
                int i13 = sadVar.a;
                valueOf3 = Integer.valueOf((i13 >>> 1) ^ (-(i13 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                e = pze.e(bArr, i, sadVar);
                long j3 = sadVar.b;
                valueOf3 = Long.valueOf((j3 >>> 1) ^ (-(j3 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 68:
                if (i5 == 3) {
                    e = l(s(i8), bArr, i, i2, (i3 & (-8)) | 4, sadVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj3 = sadVar.c;
                    if (obj2 != null) {
                        obj3 = ejd.a(obj2, obj3);
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

    public final int i(java.lang.Object r10, byte[] r11, int r12, int r13, int r14, int r15, int r16, int r17, long r18, int r20, long r21, defpackage.sad r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrd.i(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, sad):int");
    }

    public final int j(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, defpackage.sad r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrd.j(java.lang.Object, byte[], int, int, int, sad):int");
    }

    public final void o(Object obj, int i, long j) {
        lpd lpdVar;
        t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((lpd) object).a) {
            lpd lpdVar2 = lpd.b;
            if (lpdVar2.isEmpty()) {
                lpdVar = new lpd();
            } else {
                ?? linkedHashMap = new LinkedHashMap(lpdVar2);
                linkedHashMap.a = true;
                lpdVar = linkedHashMap;
            }
            ypd.a(lpdVar, object);
            unsafe.putObject(obj, j, lpdVar);
        }
        throw new NoSuchMethodError();
    }

    public final void p(vid vidVar, vid vidVar2, int i) {
        long v = v(i) & 1048575;
        if (r(i, vidVar2)) {
            Object l = uzd.l(vidVar, v);
            Object l2 = uzd.l(vidVar2, v);
            if (l != null && l2 != null) {
                l2 = ejd.a(l, l2);
            } else if (l2 == null) {
                return;
            }
            uzd.d(vidVar, v, l2);
            x(vidVar, i);
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        if (uzd.j(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final boolean r(int r7, java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrd.r(int, java.lang.Object):boolean");
    }

    public final vud s(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.b;
        vud vudVar = (vud) objArr[i2];
        if (vudVar != null) {
            return vudVar;
        }
        vud a = ttd.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object t(int i) {
        return this.b[(i / 4) << 1];
    }

    public final y9e u(int i) {
        return (y9e) this.b[((i / 4) << 1) + 1];
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

    public final void x(vid vidVar, int i) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        uzd.c(vidVar, uzd.j(vidVar, j) | (1 << (i2 >>> 20)), j);
    }

    public final void y(vid vidVar, vid vidVar2, int i) {
        int i2;
        int v = v(i);
        int[] iArr = this.a;
        int i3 = iArr[i];
        long j = v & 1048575;
        if (q(i3, i, vidVar2)) {
            Object l = uzd.l(vidVar, j);
            Object l2 = uzd.l(vidVar2, j);
            if (l != null && l2 != null) {
                uzd.d(vidVar, j, ejd.a(l, l2));
                i2 = iArr[i + 2];
            } else if (l2 != null) {
                uzd.d(vidVar, j, l2);
                i2 = iArr[i + 2];
            } else {
                return;
            }
            uzd.c(vidVar, i3, i2 & 1048575);
        }
    }

    public final boolean z(vid vidVar, vid vidVar2, int i) {
        if (r(i, vidVar) == r(i, vidVar2)) {
            return true;
        }
        return false;
    }
}
