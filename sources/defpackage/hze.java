package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;
public final class hze implements o1f {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final hie e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final k0f j;
    public final qve k;
    public final d4f l;
    public final zxe m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public hze(int[] iArr, Object[] objArr, int i, int i2, hie hieVar, boolean z, int[] iArr2, int i3, int i4, k0f k0fVar, qve qveVar, d4f d4fVar, npe npeVar, zxe zxeVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = k0fVar;
        this.k = qveVar;
        this.l = d4fVar;
        this.e = hieVar;
        this.m = zxeVar;
    }

    public static long A(long j, Object obj) {
        return ((Long) a5f.l(obj, j)).longValue();
    }

    public static h4f B(Object obj) {
        ese eseVar = (ese) obj;
        h4f h4fVar = eseVar.zzb;
        if (h4fVar == h4f.f) {
            h4f b = h4f.b();
            eseVar.zzb = b;
            return b;
        }
        return h4fVar;
    }

    public static Field k(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            xi4.l(c00.k(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    public static defpackage.hze l(defpackage.j1f r33, defpackage.k0f r34, defpackage.qve r35, defpackage.d4f r36, defpackage.npe r37, defpackage.zxe r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.l(j1f, k0f, qve, d4f, npe, zxe):hze");
    }

    public static void n(int i, Object obj, g9d g9dVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            coe coeVar = (coe) g9dVar.b;
            coeVar.c(i, 2);
            byte[] bArr = coeVar.b;
            int i2 = coeVar.d;
            try {
                int t = coe.t(str.length() * 3);
                int t2 = coe.t(str.length());
                if (t2 == t) {
                    int i3 = i2 + t2;
                    coeVar.d = i3;
                    int b = h5f.a.b(str, bArr, i3, coeVar.e());
                    coeVar.d = i2;
                    coeVar.g((b - i2) - t2);
                    coeVar.d = b;
                    return;
                }
                coeVar.g(h5f.a(str));
                coeVar.d = h5f.a.b(str, bArr, coeVar.d, coeVar.e());
                return;
            } catch (IndexOutOfBoundsException e) {
                throw new doe(e);
            } catch (q5f e2) {
                coeVar.d = i2;
                coe.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                byte[] bytes = str.getBytes(xse.a);
                try {
                    coeVar.g(bytes.length);
                    coeVar.k(bytes, 0, bytes.length);
                    return;
                } catch (doe e3) {
                    throw e3;
                } catch (IndexOutOfBoundsException e4) {
                    throw new doe(e4);
                }
            }
        }
        g9dVar.b(i, (jne) obj);
    }

    public static int z(long j, Object obj) {
        return ((Integer) a5f.l(obj, j)).intValue();
    }

    @Override
    public final boolean a(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.a(java.lang.Object):boolean");
    }

    @Override
    public final void b(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.h;
        while (true) {
            iArr = this.g;
            i = this.i;
            if (i2 >= i) {
                break;
            }
            long y = y(iArr[i2]) & 1048575;
            Object l = a5f.l(obj, y);
            if (l != null) {
                this.m.getClass();
                ((rxe) l).a = false;
                a5f.d(y, obj, l);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.k.b(iArr[i], obj);
            i++;
        }
        this.l.getClass();
        ((ese) obj).zzb.e = false;
    }

    @Override
    public final void c(Object obj, byte[] bArr, int i, int i2, lfd lfdVar) {
        int i3;
        int i4;
        int i5;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        int i11;
        boolean z;
        Object obj4;
        int i12;
        int i13;
        int i14;
        int i15;
        hze hzeVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i16 = i2;
        lfd lfdVar2 = lfdVar;
        if (hzeVar.f) {
            int i17 = i;
            int i18 = -1;
            int i19 = 0;
            int i20 = 1048575;
            int i21 = 0;
            while (true) {
                Unsafe unsafe = o;
                if (i17 < i16) {
                    int i22 = i17 + 1;
                    int i23 = bArr2[i17];
                    if (i23 < 0) {
                        i22 = a7f.d(i23, bArr2, i22, lfdVar2);
                        i23 = lfdVar2.a;
                    }
                    int i24 = i22;
                    int i25 = i23 >>> 3;
                    int i26 = i23 & 7;
                    int i27 = hzeVar.d;
                    int i28 = hzeVar.c;
                    if (i25 > i18) {
                        int i29 = i19 / 3;
                        if (i25 >= i28 && i25 <= i27) {
                            i4 = hzeVar.s(i25, i29);
                        } else {
                            i4 = -1;
                        }
                        i3 = 0;
                    } else if (i25 >= i28 && i25 <= i27) {
                        i3 = 0;
                        i4 = hzeVar.s(i25, 0);
                    } else {
                        i3 = 0;
                        i4 = -1;
                    }
                    int i30 = i4;
                    if (i30 == -1) {
                        i5 = i23;
                        obj2 = obj5;
                        i6 = i21;
                        i7 = i24;
                        i8 = i3;
                    } else {
                        int[] iArr = hzeVar.a;
                        int i31 = iArr[i30 + 1];
                        int i32 = (i31 & 267386880) >>> 20;
                        int i33 = i23;
                        long j = i31 & 1048575;
                        if (i32 <= 17) {
                            int i34 = iArr[i30 + 2];
                            int i35 = 1 << (i34 >>> 20);
                            int i36 = i34 & 1048575;
                            if (i36 != i20) {
                                int i37 = 1048575;
                                i9 = 1;
                                if (i20 != 1048575) {
                                    unsafe.putInt(obj5, i20, i21);
                                    i37 = 1048575;
                                }
                                if (i36 != i37) {
                                    i21 = unsafe.getInt(obj5, i36);
                                }
                                i20 = i36;
                            } else {
                                i9 = 1;
                            }
                            switch (i32) {
                                case 0:
                                    i10 = i25;
                                    if (i26 != i9) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        a5f.c.m(obj5, j, Double.longBitsToDouble(a7f.j(i24, bArr2)));
                                        i21 |= i35;
                                        obj5 = obj5;
                                        i17 = i24 + 8;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 1:
                                    i10 = i25;
                                    if (i26 != 5) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        a5f.c.n(obj5, j, Float.intBitsToFloat(a7f.a(i24, bArr2)));
                                        i17 = i24 + 4;
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    i10 = i25;
                                    if (i26 != 0) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        i11 = a7f.i(bArr2, i24, lfdVar2);
                                        unsafe.putLong(obj5, j, lfdVar2.b);
                                        i21 |= i35;
                                        i17 = i11;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 4:
                                case 11:
                                    i10 = i25;
                                    if (i26 != 0) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        int h = a7f.h(bArr2, i24, lfdVar2);
                                        unsafe.putInt(obj5, j, lfdVar2.a);
                                        i21 |= i35;
                                        i17 = h;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 5:
                                case 14:
                                    i10 = i25;
                                    if (i26 != i9) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        unsafe.putLong(obj5, j, a7f.j(i24, bArr2));
                                        i17 = i24 + 8;
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    i10 = i25;
                                    if (i26 != 5) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        unsafe.putInt(obj5, j, a7f.a(i24, bArr2));
                                        i17 = i24 + 4;
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 7:
                                    i10 = i25;
                                    if (i26 != 0) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        i17 = a7f.i(bArr2, i24, lfdVar2);
                                        if (lfdVar2.b != 0) {
                                            z = i9;
                                        } else {
                                            z = false;
                                        }
                                        a5f.c.o(obj5, j, z);
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 8:
                                    i10 = i25;
                                    if (i26 != 2) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        if ((i31 & 536870912) == 0) {
                                            i17 = a7f.k(bArr2, i24, lfdVar2);
                                        } else {
                                            i17 = a7f.l(bArr2, i24, lfdVar2);
                                        }
                                        unsafe.putObject(obj5, j, lfdVar2.c);
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 9:
                                    i10 = i25;
                                    if (i26 != 2) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        i17 = a7f.g(hzeVar.m(i30), bArr2, i24, i16, lfdVar2);
                                        Object object = unsafe.getObject(obj5, j);
                                        Object obj6 = lfdVar2.c;
                                        if (object == null) {
                                            unsafe.putObject(obj5, j, obj6);
                                        } else {
                                            unsafe.putObject(obj5, j, xse.b(object, obj6));
                                        }
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 10:
                                    i10 = i25;
                                    if (i26 != 2) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        i17 = a7f.m(bArr2, i24, lfdVar2);
                                        unsafe.putObject(obj5, j, lfdVar2.c);
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 12:
                                    i10 = i25;
                                    if (i26 != 0) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        i17 = a7f.h(bArr2, i24, lfdVar2);
                                        unsafe.putInt(obj5, j, lfdVar2.a);
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 15:
                                    i10 = i25;
                                    if (i26 != 0) {
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    } else {
                                        i17 = a7f.h(bArr2, i24, lfdVar2);
                                        unsafe.putInt(obj5, j, g7f.a(lfdVar2.a));
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 16:
                                    if (i26 == 0) {
                                        i11 = a7f.i(bArr2, i24, lfdVar2);
                                        long j2 = lfdVar2.b;
                                        i10 = i25;
                                        unsafe.putLong(obj5, j, (j2 >>> i9) ^ (-(j2 & 1)));
                                        i21 |= i35;
                                        i17 = i11;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    } else {
                                        i10 = i25;
                                        obj3 = obj5;
                                        obj2 = obj3;
                                        i6 = i21;
                                        i7 = i24;
                                        i8 = i30;
                                        i25 = i10;
                                        i5 = i33;
                                        break;
                                    }
                                default:
                                    obj3 = obj5;
                                    i10 = i25;
                                    obj2 = obj3;
                                    i6 = i21;
                                    i7 = i24;
                                    i8 = i30;
                                    i25 = i10;
                                    i5 = i33;
                                    break;
                            }
                        } else {
                            Object obj7 = obj5;
                            i10 = i25;
                            if (i32 == 27) {
                                if (i26 == 2) {
                                    bue bueVar = (bue) unsafe.getObject(obj7, j);
                                    if (!bueVar.zza()) {
                                        int size = bueVar.size();
                                        if (size == 0) {
                                            i14 = 10;
                                        } else {
                                            i14 = size << 1;
                                        }
                                        bueVar = bueVar.zza(i14);
                                        unsafe.putObject(obj7, j, bueVar);
                                    }
                                    i17 = a7f.e(hzeVar.m(i30), i33, bArr2, i24, i16, bueVar, lfdVar2);
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i16 = i2;
                                    lfdVar2 = lfdVar;
                                    i19 = i30;
                                    i18 = i10;
                                } else {
                                    obj4 = obj;
                                    i6 = i21;
                                    i12 = i24;
                                    i8 = i30;
                                    i25 = i10;
                                    i5 = i33;
                                    i13 = i20;
                                }
                            } else {
                                i5 = i33;
                                if (i32 <= 49) {
                                    i6 = i21;
                                    i13 = i20;
                                    i25 = i10;
                                    i15 = hzeVar.i(obj, bArr, i24, i2, i5, i25, i26, i30, i31, i32, j, lfdVar);
                                    obj5 = obj;
                                    i8 = i30;
                                    if (i15 == i24) {
                                        obj2 = obj5;
                                        i7 = i15;
                                    } else {
                                        i16 = i2;
                                        lfdVar2 = lfdVar;
                                        i18 = i25;
                                        i17 = i15;
                                        i19 = i8;
                                        i20 = i13;
                                        i21 = i6;
                                        bArr2 = bArr;
                                    }
                                } else {
                                    obj4 = obj;
                                    i6 = i21;
                                    i8 = i30;
                                    i13 = i20;
                                    i12 = i24;
                                    i25 = i10;
                                    if (i32 == 50) {
                                        if (i26 == 2) {
                                            hzeVar.o(j, obj4, i8);
                                            throw null;
                                        }
                                    } else {
                                        i15 = hzeVar.h(obj4, bArr, i12, i2, i5, i25, i26, i31, i32, j, i8, lfdVar);
                                        obj2 = obj4;
                                        if (i15 == i12) {
                                            i7 = i15;
                                        } else {
                                            hzeVar = this;
                                            lfdVar2 = lfdVar;
                                            i18 = i25;
                                            i17 = i15;
                                            obj5 = obj2;
                                            i19 = i8;
                                            i20 = i13;
                                            i21 = i6;
                                            bArr2 = bArr;
                                            i16 = i2;
                                        }
                                    }
                                }
                                i20 = i13;
                            }
                            obj2 = obj4;
                            i7 = i12;
                            i20 = i13;
                        }
                    }
                    bArr2 = bArr;
                    lfdVar2 = lfdVar;
                    i17 = a7f.c(i5, bArr, i7, i2, B(obj2), lfdVar);
                    obj5 = obj2;
                    i19 = i8;
                    i21 = i6;
                    hzeVar = this;
                    i16 = i2;
                    i18 = i25;
                } else {
                    int i38 = i16;
                    int i39 = i20;
                    int i40 = i21;
                    Object obj8 = obj5;
                    if (i39 != 1048575) {
                        unsafe.putInt(obj8, i39, i40);
                    }
                    if (i17 == i38) {
                        return;
                    }
                    throw new IOException("Failed to parse the message.");
                }
            }
        } else {
            j(obj5, bArr, i, i16, 0, lfdVar);
        }
    }

    @Override
    public final void d(ese eseVar, ese eseVar2) {
        ese eseVar3;
        eseVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int y = y(i);
                long j = y & 1048575;
                int i2 = iArr[i];
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            cac cacVar = a5f.c;
                            cacVar.m(eseVar3, j, cacVar.t(j, eseVar2));
                            u(eseVar3, i);
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 1:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            cac cacVar2 = a5f.c;
                            cacVar2.n(eseVar3, j, cacVar2.r(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 2:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 3:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 4:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 5:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 6:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 7:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            cac cacVar3 = a5f.c;
                            cacVar3.o(eseVar3, j, cacVar3.q(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 8:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.d(j, eseVar3, a5f.l(eseVar2, j));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 9:
                        eseVar3 = eseVar;
                        p(eseVar3, eseVar2, i);
                        continue;
                        i += 3;
                        eseVar = eseVar3;
                    case 10:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.d(j, eseVar3, a5f.l(eseVar2, j));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 11:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 12:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 13:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 14:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 15:
                        eseVar3 = eseVar;
                        if (r(i, eseVar2)) {
                            a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                            u(eseVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        eseVar = eseVar3;
                    case 16:
                        if (r(i, eseVar2)) {
                            eseVar3 = eseVar;
                            a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                            u(eseVar3, i);
                            continue;
                            i += 3;
                            eseVar = eseVar3;
                        }
                        break;
                    case 17:
                        p(eseVar, eseVar2, i);
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
                        this.k.a(eseVar, eseVar2, j);
                        break;
                    case 50:
                        Class cls = w1f.a;
                        Object l = a5f.l(eseVar, j);
                        Object l2 = a5f.l(eseVar2, j);
                        this.m.getClass();
                        a5f.d(j, eseVar, zxe.a(l, l2));
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
                        if (q(i2, i, eseVar2)) {
                            a5f.d(j, eseVar, a5f.l(eseVar2, j));
                            a5f.c(iArr[i + 2] & 1048575, eseVar, i2);
                            break;
                        }
                        break;
                    case 60:
                        v(eseVar, eseVar2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (q(i2, i, eseVar2)) {
                            a5f.d(j, eseVar, a5f.l(eseVar2, j));
                            a5f.c(iArr[i + 2] & 1048575, eseVar, i2);
                            break;
                        }
                        break;
                    case 68:
                        v(eseVar, eseVar2, i);
                        break;
                }
                eseVar3 = eseVar;
                i += 3;
                eseVar = eseVar3;
            } else {
                w1f.h(this.l, eseVar, eseVar2);
                return;
            }
        }
    }

    @Override
    public final void e(Object obj, g9d g9dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        g9dVar.getClass();
        coe coeVar = (coe) g9dVar.b;
        boolean z = this.f;
        d4f d4fVar = this.l;
        zxe zxeVar = this.m;
        int[] iArr = this.a;
        int i5 = 1;
        int i6 = 1048575;
        if (z) {
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int y = y(i7);
                int i8 = iArr[i7];
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        if (r(i7, obj)) {
                            long doubleToRawLongBits = Double.doubleToRawLongBits(a5f.c.t(y & 1048575, obj));
                            coeVar.c(i8, 1);
                            coeVar.j(doubleToRawLongBits);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i7, obj)) {
                            int floatToRawIntBits = Float.floatToRawIntBits(a5f.c.r(y & 1048575, obj));
                            coeVar.c(i8, 5);
                            coeVar.l(floatToRawIntBits);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i7, obj)) {
                            long g = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(g);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i7, obj)) {
                            long g2 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(g2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i7, obj)) {
                            int b = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(b);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i7, obj)) {
                            long g3 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(g3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i7, obj)) {
                            int b2 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(b2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i7, obj)) {
                            boolean q = a5f.c.q(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.a(q ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i7, obj)) {
                            n(i8, a5f.l(obj, y & 1048575), g9dVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i7, obj)) {
                            g9dVar.a(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i7, obj)) {
                            g9dVar.b(i8, (jne) a5f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i7, obj)) {
                            int b3 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g(b3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i7, obj)) {
                            int b4 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(b4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i7, obj)) {
                            int b5 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(b5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i7, obj)) {
                            long g4 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(g4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i7, obj)) {
                            int b6 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g((b6 << 1) ^ (b6 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i7, obj)) {
                            long g5 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d((g5 << 1) ^ (g5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i7, obj)) {
                            g9dVar.c(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        w1f.g(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 19:
                        w1f.n(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 20:
                        w1f.q(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 21:
                        w1f.s(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 22:
                        w1f.B(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 23:
                        w1f.w(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 24:
                        w1f.G(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 25:
                        w1f.J(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 26:
                        w1f.e(i8, (List) a5f.l(obj, y & 1048575), g9dVar);
                        break;
                    case 27:
                        w1f.f(i8, (List) a5f.l(obj, y & 1048575), g9dVar, m(i7));
                        break;
                    case 28:
                        w1f.l(i8, (List) a5f.l(obj, y & 1048575), g9dVar);
                        break;
                    case 29:
                        w1f.E(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 30:
                        w1f.I(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 31:
                        w1f.H(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 32:
                        w1f.y(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 33:
                        w1f.F(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 34:
                        w1f.u(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 35:
                        w1f.g(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 36:
                        w1f.n(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 37:
                        w1f.q(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 38:
                        w1f.s(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 39:
                        w1f.B(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 40:
                        w1f.w(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 41:
                        w1f.G(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 42:
                        w1f.J(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 43:
                        w1f.E(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 44:
                        w1f.I(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 45:
                        w1f.H(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 46:
                        w1f.y(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 47:
                        w1f.F(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 48:
                        w1f.u(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 49:
                        w1f.m(i8, (List) a5f.l(obj, y & 1048575), g9dVar, m(i7));
                        break;
                    case 50:
                        if (a5f.l(obj, y & 1048575) != null) {
                            Object t = t(i7);
                            zxeVar.getClass();
                            if (t != null) {
                                grb.o();
                                return;
                            }
                            throw new NoSuchMethodError();
                        }
                        break;
                    case 51:
                        if (q(i8, i7, obj)) {
                            long doubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) a5f.l(obj, y & 1048575)).doubleValue());
                            coeVar.c(i8, 1);
                            coeVar.j(doubleToRawLongBits2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(i8, i7, obj)) {
                            int floatToRawIntBits2 = Float.floatToRawIntBits(((Float) a5f.l(obj, y & 1048575)).floatValue());
                            coeVar.c(i8, 5);
                            coeVar.l(floatToRawIntBits2);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(i8, i7, obj)) {
                            long A = A(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(A);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(i8, i7, obj)) {
                            long A2 = A(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(A2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(i8, i7, obj)) {
                            int z2 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(z2);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i8, i7, obj)) {
                            long A3 = A(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(A3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(i8, i7, obj)) {
                            int z3 = z(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(z3);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(i8, i7, obj)) {
                            boolean booleanValue = ((Boolean) a5f.l(obj, y & 1048575)).booleanValue();
                            coeVar.c(i8, 0);
                            coeVar.a(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(i8, i7, obj)) {
                            n(i8, a5f.l(obj, y & 1048575), g9dVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (q(i8, i7, obj)) {
                            g9dVar.a(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(i8, i7, obj)) {
                            g9dVar.b(i8, (jne) a5f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(i8, i7, obj)) {
                            int z4 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g(z4);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(i8, i7, obj)) {
                            int z5 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(z5);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i8, i7, obj)) {
                            int z6 = z(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(z6);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i8, i7, obj)) {
                            long A4 = A(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(A4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(i8, i7, obj)) {
                            int z7 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g((z7 << 1) ^ (z7 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(i8, i7, obj)) {
                            long A5 = A(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d((A5 << 1) ^ (A5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(i8, i7, obj)) {
                            g9dVar.c(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            d4fVar.getClass();
            ((ese) obj).zzb.c(g9dVar);
            return;
        }
        int length2 = iArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < length2) {
            int y2 = y(i9);
            int i12 = iArr[i9];
            int i13 = i6;
            int i14 = (y2 & 267386880) >>> 20;
            int i15 = i5;
            Unsafe unsafe = o;
            if (i14 <= 17) {
                int i16 = iArr[i9 + 2];
                i = length2;
                int i17 = i16 & i13;
                if (i17 != i11) {
                    i10 = unsafe.getInt(obj, i17);
                    i11 = i17;
                }
                i2 = i15 << (i16 >>> 20);
            } else {
                i = length2;
                i2 = 0;
            }
            int i18 = i2;
            d4f d4fVar2 = d4fVar;
            long j = y2 & i13;
            switch (i14) {
                case 0:
                    if ((i10 & i18) != 0) {
                        long doubleToRawLongBits3 = Double.doubleToRawLongBits(a5f.c.t(j, obj));
                        i3 = 1;
                        coeVar.c(i12, 1);
                        coeVar.j(doubleToRawLongBits3);
                        break;
                    }
                    i3 = 1;
                    break;
                case 1:
                    if ((i10 & i18) != 0) {
                        int floatToRawIntBits3 = Float.floatToRawIntBits(a5f.c.r(j, obj));
                        coeVar.c(i12, 5);
                        coeVar.l(floatToRawIntBits3);
                    }
                    i3 = 1;
                    break;
                case 2:
                    if ((i10 & i18) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.d(j2);
                    }
                    i3 = 1;
                    break;
                case 3:
                    if ((i10 & i18) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.d(j3);
                    }
                    i3 = 1;
                    break;
                case 4:
                    if ((i10 & i18) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.b(i19);
                    }
                    i3 = 1;
                    break;
                case 5:
                    if ((i10 & i18) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 1);
                        coeVar.j(j4);
                    }
                    i3 = 1;
                    break;
                case 6:
                    if ((i10 & i18) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 5);
                        coeVar.l(i20);
                    }
                    i3 = 1;
                    break;
                case 7:
                    if ((i10 & i18) != 0) {
                        boolean q2 = a5f.c.q(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.a(q2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    break;
                case 8:
                    if ((i10 & i18) != 0) {
                        n(i12, unsafe.getObject(obj, j), g9dVar);
                    }
                    i3 = 1;
                    break;
                case 9:
                    if ((i10 & i18) != 0) {
                        g9dVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 10:
                    if ((i10 & i18) != 0) {
                        g9dVar.b(i12, (jne) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    break;
                case 11:
                    if ((i10 & i18) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.g(i21);
                    }
                    i3 = 1;
                    break;
                case 12:
                    if ((i10 & i18) != 0) {
                        int i22 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.b(i22);
                    }
                    i3 = 1;
                    break;
                case 13:
                    if ((i10 & i18) != 0) {
                        int i23 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 5);
                        coeVar.l(i23);
                    }
                    i3 = 1;
                    break;
                case 14:
                    if ((i10 & i18) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 1);
                        coeVar.j(j5);
                    }
                    i3 = 1;
                    break;
                case 15:
                    if ((i10 & i18) != 0) {
                        int i24 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.g((i24 << 1) ^ (i24 >> 31));
                    }
                    i3 = 1;
                    break;
                case 16:
                    if ((i10 & i18) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.d((j6 << 1) ^ (j6 >> 63));
                    }
                    i3 = 1;
                    break;
                case 17:
                    if ((i10 & i18) != 0) {
                        g9dVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 18:
                    w1f.g(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 19:
                    w1f.n(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 20:
                    w1f.q(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 21:
                    w1f.s(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 22:
                    w1f.B(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 23:
                    w1f.w(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 24:
                    w1f.G(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 25:
                    w1f.J(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 26:
                    w1f.e(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar);
                    i3 = 1;
                    break;
                case 27:
                    w1f.f(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, m(i9));
                    i3 = 1;
                    break;
                case 28:
                    w1f.l(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar);
                    i3 = 1;
                    break;
                case 29:
                    w1f.E(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 30:
                    w1f.I(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 31:
                    w1f.H(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 32:
                    w1f.y(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 33:
                    w1f.F(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 34:
                    w1f.u(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    break;
                case 35:
                    boolean z8 = i15;
                    w1f.g(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z8);
                    i4 = z8;
                    i3 = i4;
                    break;
                case 36:
                    boolean z9 = i15;
                    w1f.n(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z9);
                    i4 = z9;
                    i3 = i4;
                    break;
                case 37:
                    boolean z10 = i15;
                    w1f.q(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z10);
                    i4 = z10;
                    i3 = i4;
                    break;
                case 38:
                    boolean z11 = i15;
                    w1f.s(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z11);
                    i4 = z11;
                    i3 = i4;
                    break;
                case 39:
                    boolean z12 = i15;
                    w1f.B(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z12);
                    i4 = z12;
                    i3 = i4;
                    break;
                case 40:
                    boolean z13 = i15;
                    w1f.w(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z13);
                    i4 = z13;
                    i3 = i4;
                    break;
                case 41:
                    boolean z14 = i15;
                    w1f.G(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z14);
                    i4 = z14;
                    i3 = i4;
                    break;
                case 42:
                    boolean z15 = i15;
                    w1f.J(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z15);
                    i4 = z15;
                    i3 = i4;
                    break;
                case 43:
                    boolean z16 = i15;
                    w1f.E(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z16);
                    i4 = z16;
                    i3 = i4;
                    break;
                case 44:
                    boolean z17 = i15;
                    w1f.I(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z17);
                    i4 = z17;
                    i3 = i4;
                    break;
                case 45:
                    boolean z18 = i15;
                    w1f.H(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z18);
                    i4 = z18;
                    i3 = i4;
                    break;
                case 46:
                    boolean z19 = i15;
                    w1f.y(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z19);
                    i4 = z19;
                    i3 = i4;
                    break;
                case 47:
                    boolean z20 = i15;
                    w1f.F(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z20);
                    i4 = z20;
                    i3 = i4;
                    break;
                case 48:
                    i4 = 1;
                    w1f.u(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, true);
                    i3 = i4;
                    break;
                case 49:
                    w1f.m(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, m(i9));
                    i3 = 1;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object t2 = t(i9);
                        zxeVar.getClass();
                        if (t2 != null) {
                            grb.o();
                            return;
                        }
                        throw new NoSuchMethodError();
                    }
                    i3 = 1;
                    break;
                case 51:
                    if (q(i12, i9, obj)) {
                        long doubleToRawLongBits4 = Double.doubleToRawLongBits(((Double) a5f.l(obj, j)).doubleValue());
                        coeVar.c(i12, 1);
                        coeVar.j(doubleToRawLongBits4);
                    }
                    i3 = 1;
                    break;
                case 52:
                    if (q(i12, i9, obj)) {
                        int floatToRawIntBits4 = Float.floatToRawIntBits(((Float) a5f.l(obj, j)).floatValue());
                        coeVar.c(i12, 5);
                        coeVar.l(floatToRawIntBits4);
                    }
                    i3 = 1;
                    break;
                case 53:
                    if (q(i12, i9, obj)) {
                        long A6 = A(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.d(A6);
                    }
                    i3 = 1;
                    break;
                case 54:
                    if (q(i12, i9, obj)) {
                        long A7 = A(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.d(A7);
                    }
                    i3 = 1;
                    break;
                case 55:
                    if (q(i12, i9, obj)) {
                        int z21 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.b(z21);
                    }
                    i3 = 1;
                    break;
                case 56:
                    if (q(i12, i9, obj)) {
                        long A8 = A(j, obj);
                        coeVar.c(i12, 1);
                        coeVar.j(A8);
                    }
                    i3 = 1;
                    break;
                case 57:
                    if (q(i12, i9, obj)) {
                        int z22 = z(j, obj);
                        coeVar.c(i12, 5);
                        coeVar.l(z22);
                    }
                    i3 = 1;
                    break;
                case 58:
                    if (q(i12, i9, obj)) {
                        boolean booleanValue2 = ((Boolean) a5f.l(obj, j)).booleanValue();
                        coeVar.c(i12, 0);
                        coeVar.a(booleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    break;
                case 59:
                    if (q(i12, i9, obj)) {
                        n(i12, unsafe.getObject(obj, j), g9dVar);
                    }
                    i3 = 1;
                    break;
                case 60:
                    if (q(i12, i9, obj)) {
                        g9dVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 61:
                    if (q(i12, i9, obj)) {
                        g9dVar.b(i12, (jne) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    break;
                case 62:
                    if (q(i12, i9, obj)) {
                        int z23 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.g(z23);
                    }
                    i3 = 1;
                    break;
                case 63:
                    if (q(i12, i9, obj)) {
                        int z24 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.b(z24);
                    }
                    i3 = 1;
                    break;
                case 64:
                    if (q(i12, i9, obj)) {
                        int z25 = z(j, obj);
                        coeVar.c(i12, 5);
                        coeVar.l(z25);
                    }
                    i3 = 1;
                    break;
                case 65:
                    if (q(i12, i9, obj)) {
                        long A9 = A(j, obj);
                        coeVar.c(i12, i15);
                        coeVar.j(A9);
                    }
                    i3 = 1;
                    break;
                case 66:
                    if (q(i12, i9, obj)) {
                        int z26 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.g((z26 << 1) ^ (z26 >> 31));
                    }
                    i3 = i15;
                    break;
                case 67:
                    if (q(i12, i9, obj)) {
                        long A10 = A(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.d((A10 << i15) ^ (A10 >> 63));
                    }
                    i3 = i15;
                    break;
                case 68:
                    if (q(i12, i9, obj)) {
                        g9dVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = i15;
                    break;
                default:
                    i3 = i15;
                    break;
            }
            i9 += 3;
            d4fVar = d4fVar2;
            i5 = i3;
            i6 = i13;
            length2 = i;
        }
        d4fVar.getClass();
        ((ese) obj).zzb.c(g9dVar);
    }

    @Override
    public final boolean f(defpackage.ese r12, defpackage.ese r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.f(ese, ese):boolean");
    }

    @Override
    public final int g(defpackage.ese r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.g(ese):int");
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, lfd lfdVar) {
        int i9;
        int i10;
        int i11;
        long j2 = this.a[i8 + 2] & 1048575;
        Object obj2 = null;
        boolean z = true;
        Unsafe unsafe = o;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(a7f.j(i9, bArr))));
                    i11 = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i9;
            case 52:
                i10 = i;
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(a7f.a(i10, bArr))));
                    i11 = i10 + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.i(bArr, i, lfdVar);
                unsafe.putObject(obj, j, Long.valueOf(lfdVar.b));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.h(bArr, i, lfdVar);
                unsafe.putObject(obj, j, Integer.valueOf(lfdVar.a));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 56:
            case 65:
                i9 = i;
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(a7f.j(i9, bArr)));
                    i11 = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i9;
            case 57:
            case 64:
                i10 = i;
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(a7f.a(i10, bArr)));
                    i11 = i10 + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i10;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.i(bArr, i, lfdVar);
                if (lfdVar.b == 0) {
                    z = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int h = a7f.h(bArr, i, lfdVar);
                int i12 = lfdVar.a;
                if (i12 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!h5f.a.c(h, h + i12, bArr)) {
                            throw wte.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, h, i12, xse.a));
                    h += i12;
                }
                unsafe.putInt(obj, j2, i4);
                return h;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int g = a7f.g(m(i8), bArr, i, i2, lfdVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                Object obj3 = lfdVar.c;
                if (obj2 == null) {
                    unsafe.putObject(obj, j, obj3);
                } else {
                    unsafe.putObject(obj, j, xse.b(obj2, obj3));
                }
                unsafe.putInt(obj, j2, i4);
                return g;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                i11 = a7f.m(bArr, i, lfdVar);
                unsafe.putObject(obj, j, lfdVar.c);
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int h2 = a7f.h(bArr, i, lfdVar);
                int i13 = lfdVar.a;
                r7e w = w(i8);
                if (w != null && !w.a(i13)) {
                    B(obj).a(i3, Long.valueOf(i13));
                    return h2;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i13));
                i11 = h2;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.h(bArr, i, lfdVar);
                unsafe.putObject(obj, j, Integer.valueOf(g7f.a(lfdVar.a)));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.i(bArr, i, lfdVar);
                long j3 = lfdVar.b;
                unsafe.putObject(obj, j, Long.valueOf((j3 >>> 1) ^ (-(j3 & 1))));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 68:
                if (i5 == 3) {
                    i11 = a7f.f(m(i8), bArr, i, i2, (i3 & (-8)) | 4, lfdVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj4 = lfdVar.c;
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, obj4);
                    } else {
                        unsafe.putObject(obj, j, xse.b(obj2, obj4));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i;
            default:
                return i;
        }
    }

    public final int i(java.lang.Object r13, byte[] r14, int r15, int r16, int r17, int r18, int r19, int r20, long r21, int r23, long r24, defpackage.lfd r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.i(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, lfd):int");
    }

    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, lfd lfdVar) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        int i5;
        hze hzeVar;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int i13;
        Unsafe unsafe2;
        byte[] bArr2;
        lfd lfdVar2;
        int i14;
        int i15;
        byte[] bArr3;
        int i16;
        Object obj3;
        int i17;
        int i18;
        int i19;
        int h;
        hze hzeVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i20 = i2;
        lfd lfdVar3 = lfdVar;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (true) {
            int[] iArr3 = hzeVar2.a;
            Unsafe unsafe3 = o;
            if (i21 < i20) {
                int i27 = i21 + 1;
                int i28 = bArr4[i21];
                if (i28 < 0) {
                    i27 = a7f.d(i28, bArr4, i27, lfdVar3);
                    i28 = lfdVar3.a;
                }
                int i29 = i27;
                int i30 = i28;
                int i31 = i30 >>> 3;
                int i32 = i30 & 7;
                int i33 = hzeVar2.d;
                int i34 = hzeVar2.c;
                if (i31 > i22) {
                    i7 = (i31 < i34 || i31 > i33) ? -1 : hzeVar2.s(i31, i23 / 3);
                    i6 = 0;
                } else if (i31 < i34 || i31 > i33) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = hzeVar2.s(i31, 0);
                }
                if (i7 == -1) {
                    iArr = iArr3;
                    i8 = i30;
                    i4 = i25;
                    unsafe = unsafe3;
                    i5 = i6;
                    i9 = i31;
                    hzeVar = hzeVar2;
                    obj2 = obj4;
                    i10 = i29;
                    i11 = i5;
                } else {
                    int i35 = iArr3[i7 + 1];
                    int i36 = (i35 & 267386880) >>> 20;
                    long j = i35 & 1048575;
                    if (i36 <= 17) {
                        int i37 = iArr3[i7 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i25) {
                            iArr2 = iArr3;
                            if (i25 != 1048575) {
                                unsafe3.putInt(obj4, i25, i26);
                            }
                            i13 = i39;
                            i12 = unsafe3.getInt(obj4, i39);
                        } else {
                            iArr2 = iArr3;
                            i12 = i26;
                            i13 = i25;
                        }
                        switch (i36) {
                            case 0:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 1) {
                                    a5f.c.m(obj4, j, Double.longBitsToDouble(a7f.j(i14, bArr2)));
                                    i21 = i14 + 8;
                                    int i40 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i40;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i41 = i14;
                                    obj2 = obj4;
                                    i10 = i41;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 5) {
                                    a5f.c.n(obj4, j, Float.intBitsToFloat(a7f.a(i14, bArr2)));
                                    i21 = i14 + 4;
                                    int i402 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i402;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i412 = i14;
                                    obj2 = obj4;
                                    i10 = i412;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 2:
                            case 3:
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 0) {
                                    int i42 = a7f.i(bArr, i14, lfdVar2);
                                    unsafe2.putLong(obj4, j, lfdVar2.b);
                                    int i43 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i43;
                                    i20 = i2;
                                    i21 = i42;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i4122 = i14;
                                    obj2 = obj4;
                                    i10 = i4122;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 4:
                            case 11:
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 0) {
                                    int h2 = a7f.h(bArr, i14, lfdVar2);
                                    unsafe2.putInt(obj4, j, lfdVar2.a);
                                    int i44 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i44;
                                    i20 = i2;
                                    i21 = h2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i41222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 1) {
                                    unsafe2.putLong(obj4, j, a7f.j(i14, bArr2));
                                    i21 = i14 + 8;
                                    int i4022 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4022;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i412222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj4, j, a7f.a(i14, bArr2));
                                    i21 = i14 + 4;
                                    int i40222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i40222;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i4122222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 == 0) {
                                    i21 = a7f.i(bArr2, i15, lfdVar2);
                                    a5f.c.o(obj4, j, lfdVar2.b != 0);
                                    int i402222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i402222;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i41222222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 == 2) {
                                    if ((i35 & 536870912) == 0) {
                                        i21 = a7f.k(bArr2, i15, lfdVar2);
                                    } else {
                                        i21 = a7f.l(bArr2, i15, lfdVar2);
                                    }
                                    unsafe2.putObject(obj4, j, lfdVar2.c);
                                    int i4022222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4022222;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i412222222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 9:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 2) {
                                    i21 = a7f.g(hzeVar2.m(i11), bArr3, i15, i16, lfdVar2);
                                    if ((i12 & i38) == 0) {
                                        unsafe2.putObject(obj4, j, lfdVar2.c);
                                    } else {
                                        unsafe2.putObject(obj4, j, xse.b(unsafe2.getObject(obj4, j), lfdVar2.c));
                                    }
                                    int i45 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i4122222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 10:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 2) {
                                    i21 = a7f.m(bArr3, i15, lfdVar2);
                                    unsafe2.putObject(obj4, j, lfdVar2.c);
                                    int i452 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i452;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i41222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 12:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 0) {
                                    i21 = a7f.h(bArr3, i15, lfdVar2);
                                    int i46 = lfdVar2.a;
                                    r7e w = hzeVar2.w(i11);
                                    if (w != null && !w.a(i46)) {
                                        B(obj4).a(i8, Long.valueOf(i46));
                                        bArr4 = bArr3;
                                        i20 = i16;
                                        i23 = i11;
                                        i25 = i13;
                                        i26 = i12;
                                        i24 = i8;
                                        i22 = i31;
                                        lfdVar3 = lfdVar2;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j, i46);
                                        int i4522 = i13;
                                        i26 = i12 | i38;
                                        bArr4 = bArr3;
                                        i25 = i4522;
                                        i20 = i16;
                                        lfdVar3 = lfdVar2;
                                        i23 = i11;
                                        i24 = i8;
                                        i22 = i31;
                                        break;
                                    }
                                } else {
                                    i14 = i15;
                                    int i412222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 0) {
                                    i21 = a7f.h(bArr3, i15, lfdVar2);
                                    unsafe2.putInt(obj4, j, g7f.a(lfdVar2.a));
                                    int i45222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45222;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i4122222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 16:
                                i8 = i30;
                                i15 = i29;
                                if (i32 == 0) {
                                    int i47 = a7f.i(bArr, i15, lfdVar);
                                    int i48 = i7;
                                    long j2 = lfdVar.b;
                                    lfdVar2 = lfdVar;
                                    obj4 = obj;
                                    i11 = i48;
                                    i16 = i2;
                                    unsafe3.putLong(obj4, j, (j2 >>> 1) ^ (-(j2 & 1)));
                                    int i49 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i49;
                                    i21 = i47;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i11 = i7;
                                    unsafe2 = unsafe3;
                                    i14 = i15;
                                    int i41222222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            case 17:
                                if (i32 == 3) {
                                    i21 = a7f.f(hzeVar2.m(i7), bArr, i29, i2, (i31 << 3) | 4, lfdVar);
                                    if ((i12 & i38) == 0) {
                                        unsafe3.putObject(obj4, j, lfdVar.c);
                                    } else {
                                        unsafe3.putObject(obj4, j, xse.b(unsafe3.getObject(obj4, j), lfdVar.c));
                                    }
                                    int i50 = i12 | i38;
                                    i23 = i7;
                                    lfdVar3 = lfdVar;
                                    bArr4 = bArr;
                                    i25 = i13;
                                    i24 = i30;
                                    i22 = i31;
                                    i26 = i50;
                                    i20 = i2;
                                    break;
                                } else {
                                    i8 = i30;
                                    i11 = i7;
                                    unsafe2 = unsafe3;
                                    i14 = i29;
                                    int i412222222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                }
                            default:
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i8 = i30;
                                i14 = i29;
                                int i4122222222222222 = i14;
                                obj2 = obj4;
                                i10 = i4122222222222222;
                                hzeVar = hzeVar2;
                                unsafe = unsafe2;
                                iArr = iArr2;
                                i9 = i31;
                                i4 = i13;
                                i26 = i12;
                                i5 = 0;
                                break;
                        }
                    } else {
                        lfd lfdVar4 = lfdVar3;
                        i8 = i30;
                        i11 = i7;
                        if (i36 == 27) {
                            if (i32 == 2) {
                                bue bueVar = (bue) unsafe3.getObject(obj4, j);
                                if (!bueVar.zza()) {
                                    int size = bueVar.size();
                                    bueVar = bueVar.zza(size == 0 ? 10 : size << 1);
                                    unsafe3.putObject(obj4, j, bueVar);
                                }
                                obj4 = obj;
                                i20 = i2;
                                lfdVar3 = lfdVar;
                                i21 = a7f.e(hzeVar2.m(i11), i8, bArr, i29, i2, bueVar, lfdVar4);
                                i23 = i11;
                                i24 = i8;
                                i22 = i31;
                                bArr4 = bArr;
                            } else {
                                obj3 = obj;
                                unsafe = unsafe3;
                                i17 = i29;
                                i18 = i26;
                                iArr = iArr3;
                                i19 = i31;
                                i4 = i25;
                                i5 = 0;
                                hzeVar = hzeVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            }
                        } else if (i36 <= 49) {
                            unsafe = unsafe3;
                            i18 = i26;
                            iArr = iArr3;
                            i4 = i25;
                            i5 = 0;
                            h = hzeVar2.i(obj, bArr, i29, i2, i8, i31, i32, i11, i35, i36, j, lfdVar);
                            obj4 = obj;
                            i8 = i8;
                            i22 = i31;
                            i11 = i11;
                            if (h == i29) {
                                hzeVar = hzeVar2;
                                obj2 = obj4;
                                i9 = i22;
                                i10 = h;
                            } else {
                                bArr4 = bArr;
                                i20 = i2;
                                lfdVar3 = lfdVar;
                                i21 = h;
                                i23 = i11;
                                i24 = i8;
                                i25 = i4;
                                i26 = i18;
                            }
                        } else {
                            obj3 = obj;
                            unsafe = unsafe3;
                            i18 = i26;
                            iArr = iArr3;
                            i4 = i25;
                            i17 = i29;
                            i19 = i31;
                            i5 = 0;
                            if (i36 == 50) {
                                if (i32 == 2) {
                                    hzeVar2.o(j, obj3, i11);
                                    throw null;
                                }
                                hzeVar = hzeVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            } else {
                                i9 = i19;
                                h = hzeVar2.h(obj3, bArr, i17, i2, i8, i9, i32, i35, i36, j, i11, lfdVar);
                                hzeVar = hzeVar2;
                                obj2 = obj3;
                                i11 = i11;
                                if (h == i17) {
                                    i10 = h;
                                } else {
                                    bArr4 = bArr;
                                    i20 = i2;
                                    lfdVar3 = lfdVar;
                                    i22 = i9;
                                    i21 = h;
                                    hzeVar2 = hzeVar;
                                    obj4 = obj2;
                                    i23 = i11;
                                    i24 = i8;
                                    i25 = i4;
                                    i26 = i18;
                                }
                            }
                        }
                        i26 = i18;
                    }
                }
                if (i8 != i3 || i3 == 0) {
                    bArr4 = bArr;
                    lfdVar3 = lfdVar;
                    i20 = i2;
                    i22 = i9;
                    hzeVar2 = hzeVar;
                    i23 = i11;
                    i24 = i8;
                    i25 = i4;
                    i21 = a7f.c(i8, bArr4, i10, i2, B(obj2), lfdVar);
                    obj4 = obj2;
                } else {
                    i20 = i2;
                    i21 = i10;
                    i24 = i8;
                }
            } else {
                i4 = i25;
                unsafe = unsafe3;
                iArr = iArr3;
                i5 = 0;
                hzeVar = hzeVar2;
                obj2 = obj4;
            }
        }
        int i51 = i4;
        if (i51 != 1048575) {
            unsafe.putInt(obj2, i51, i26);
        }
        for (int i52 = hzeVar.h; i52 < hzeVar.i; i52++) {
            int i53 = hzeVar.g[i52];
            int i54 = iArr[i53];
            Object l = a5f.l(obj2, hzeVar.y(i53) & 1048575);
            if (l != null && hzeVar.w(i53) != null) {
                hzeVar.m.getClass();
                rxe rxeVar = (rxe) l;
                if (hzeVar.t(i53) != null) {
                    grb.o();
                    return i5;
                }
                throw new NoSuchMethodError();
            }
        }
        if (i3 == 0) {
            if (i21 != i20) {
                throw new IOException("Failed to parse the message.");
            }
        } else if (i21 > i20 || i24 != i3) {
            throw new IOException("Failed to parse the message.");
        }
        return i21;
    }

    public final o1f m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        o1f o1fVar = (o1f) objArr[i2];
        if (o1fVar != null) {
            return o1fVar;
        }
        o1f a = w0f.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final void o(long j, Object obj, int i) {
        rxe rxeVar;
        Object t = t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.m.getClass();
        if (!((rxe) object).a) {
            rxe rxeVar2 = rxe.b;
            if (rxeVar2.isEmpty()) {
                rxeVar = new rxe();
            } else {
                ?? linkedHashMap = new LinkedHashMap(rxeVar2);
                linkedHashMap.a = true;
                rxeVar = linkedHashMap;
            }
            zxe.a(rxeVar, object);
            unsafe.putObject(obj, j, rxeVar);
        }
        if (t == null) {
            throw new NoSuchMethodError();
        }
        throw new ClassCastException();
    }

    public final void p(ese eseVar, ese eseVar2, int i) {
        long y = y(i) & 1048575;
        if (r(i, eseVar2)) {
            Object l = a5f.l(eseVar, y);
            Object l2 = a5f.l(eseVar2, y);
            if (l != null && l2 != null) {
                a5f.d(y, eseVar, xse.b(l, l2));
                u(eseVar, i);
            } else if (l2 != null) {
                a5f.d(y, eseVar, l2);
                u(eseVar, i);
            }
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        if (a5f.b(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final boolean r(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.r(int, java.lang.Object):boolean");
    }

    public final int s(int i, int i2) {
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

    public final Object t(int i) {
        return this.b[(i / 3) << 1];
    }

    public final void u(ese eseVar, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        a5f.c(j, eseVar, a5f.b(j, eseVar) | (1 << (i2 >>> 20)));
    }

    public final void v(ese eseVar, ese eseVar2, int i) {
        int[] iArr;
        Object obj;
        int y = y(i);
        int i2 = this.a[i];
        long j = y & 1048575;
        if (q(i2, i, eseVar2)) {
            if (q(i2, i, eseVar)) {
                obj = a5f.l(eseVar, j);
            } else {
                obj = null;
            }
            Object l = a5f.l(eseVar2, j);
            if (obj != null && l != null) {
                a5f.d(j, eseVar, xse.b(obj, l));
                a5f.c(iArr[i + 2] & 1048575, eseVar, i2);
            } else if (l != null) {
                a5f.d(j, eseVar, l);
                a5f.c(iArr[i + 2] & 1048575, eseVar, i2);
            }
        }
    }

    public final r7e w(int i) {
        return (r7e) this.b[((i / 3) << 1) + 1];
    }

    public final boolean x(ese eseVar, ese eseVar2, int i) {
        if (r(i, eseVar) == r(i, eseVar2)) {
            return true;
        }
        return false;
    }

    public final int y(int i) {
        return this.a[i + 1];
    }

    @Override
    public final Object zza() {
        this.j.getClass();
        return ((ese) this.e).d(4);
    }

    @Override
    public final int zzb(Object obj) {
        d4f d4fVar;
        int i;
        int i2;
        int o2;
        int t;
        int f;
        int i3;
        int t2;
        int i4;
        int t3;
        int f2;
        int i5;
        int t4;
        int o3;
        int n2;
        int i6;
        d4f d4fVar2 = this.l;
        zxe zxeVar = this.m;
        int i7 = 267386880;
        int i8 = 1048575;
        int[] iArr = this.a;
        int i9 = 1;
        boolean z = this.f;
        Unsafe unsafe = o;
        if (z) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < iArr.length) {
                int y = y(i10);
                int i12 = (y & i7) >>> 20;
                int i13 = i7;
                int i14 = iArr[i10];
                int i15 = i8;
                int[] iArr2 = iArr;
                long j = y & i8;
                if (i12 >= pqe.b.a && i12 <= pqe.c.a) {
                    int i16 = iArr2[i10 + 2];
                }
                switch (i12) {
                    case 0:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i10, obj)) {
                            long g = a5f.g(j, obj);
                            t4 = coe.t(i14 << 3);
                            o3 = coe.o(g);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i10, obj)) {
                            n2 = coe.n(i14, a5f.g(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i10, obj)) {
                            int b = a5f.b(j, obj);
                            t4 = coe.t(i14 << 3);
                            o3 = coe.p(b);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i10, obj)) {
                            n2 = coe.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i10, obj)) {
                            n2 = coe.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i10, obj)) {
                            Object l = a5f.l(obj, j);
                            if (l instanceof jne) {
                                n2 = coe.i(i14, (jne) l);
                                i11 += n2;
                                break;
                            } else {
                                t4 = coe.t(i14 << 3);
                                o3 = coe.f((String) l);
                                i11 += o3 + t4;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i10, obj)) {
                            n2 = w1f.a(i14, a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i10, obj)) {
                            n2 = coe.i(i14, (jne) a5f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i10, obj)) {
                            n2 = coe.s(i14, a5f.b(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i10, obj)) {
                            int b2 = a5f.b(j, obj);
                            t4 = coe.t(i14 << 3);
                            o3 = coe.p(b2);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i10, obj)) {
                            n2 = coe.u(i14, a5f.b(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i10, obj)) {
                            n2 = coe.q(i14, a5f.g(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i10, obj)) {
                            n2 = coe.h(i14, (hie) a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        n2 = w1f.C(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 19:
                        n2 = w1f.z(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 20:
                        List list = (List) a5f.l(obj, j);
                        Class cls = w1f.a;
                        if (list.size() != 0) {
                            n2 = dze.a(i14, list.size(), w1f.c(list));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 21:
                        List list2 = (List) a5f.l(obj, j);
                        Class cls2 = w1f.a;
                        int size = list2.size();
                        if (size != 0) {
                            n2 = dze.a(i14, size, w1f.k(list2));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 22:
                        List list3 = (List) a5f.l(obj, j);
                        Class cls3 = w1f.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            n2 = dze.a(i14, size2, w1f.t(list3));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 23:
                        n2 = w1f.C(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 24:
                        n2 = w1f.z(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 25:
                        Class cls4 = w1f.a;
                        int size3 = ((List) a5f.l(obj, j)).size();
                        if (size3 != 0) {
                            n2 = (coe.t(i14 << 3) + 1) * size3;
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 26:
                        n2 = w1f.j(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 27:
                        n2 = w1f.b(i14, (List) a5f.l(obj, j), m(i10));
                        i11 += n2;
                        break;
                    case 28:
                        n2 = w1f.o(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 29:
                        List list4 = (List) a5f.l(obj, j);
                        Class cls5 = w1f.a;
                        int size4 = list4.size();
                        if (size4 != 0) {
                            n2 = dze.a(i14, size4, w1f.v(list4));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 30:
                        List list5 = (List) a5f.l(obj, j);
                        Class cls6 = w1f.a;
                        int size5 = list5.size();
                        if (size5 != 0) {
                            n2 = dze.a(i14, size5, w1f.r(list5));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 31:
                        n2 = w1f.z(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 32:
                        n2 = w1f.C(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 33:
                        List list6 = (List) a5f.l(obj, j);
                        Class cls7 = w1f.a;
                        int size6 = list6.size();
                        if (size6 != 0) {
                            n2 = dze.a(i14, size6, w1f.x(list6));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 34:
                        List list7 = (List) a5f.l(obj, j);
                        Class cls8 = w1f.a;
                        int size7 = list7.size();
                        if (size7 != 0) {
                            n2 = dze.a(i14, size7, w1f.p(list7));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 35:
                        int D = w1f.D((List) unsafe.getObject(obj, j));
                        if (D > 0) {
                            i11 = dze.b(D, coe.m(i14), D, i11);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int A = w1f.A((List) unsafe.getObject(obj, j));
                        if (A > 0) {
                            i11 = dze.b(A, coe.m(i14), A, i11);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int c = w1f.c((List) unsafe.getObject(obj, j));
                        if (c > 0) {
                            i11 = dze.b(c, coe.m(i14), c, i11);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int k = w1f.k((List) unsafe.getObject(obj, j));
                        if (k > 0) {
                            i11 = dze.b(k, coe.m(i14), k, i11);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int t5 = w1f.t((List) unsafe.getObject(obj, j));
                        if (t5 > 0) {
                            i11 = dze.b(t5, coe.m(i14), t5, i11);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int D2 = w1f.D((List) unsafe.getObject(obj, j));
                        if (D2 > 0) {
                            i11 = dze.b(D2, coe.m(i14), D2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int A2 = w1f.A((List) unsafe.getObject(obj, j));
                        if (A2 > 0) {
                            i11 = dze.b(A2, coe.m(i14), A2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls9 = w1f.a;
                        int size8 = ((List) unsafe.getObject(obj, j)).size();
                        if (size8 > 0) {
                            i11 = dze.b(size8, coe.m(i14), size8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v = w1f.v((List) unsafe.getObject(obj, j));
                        if (v > 0) {
                            i11 = dze.b(v, coe.m(i14), v, i11);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int r = w1f.r((List) unsafe.getObject(obj, j));
                        if (r > 0) {
                            i11 = dze.b(r, coe.m(i14), r, i11);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int A3 = w1f.A((List) unsafe.getObject(obj, j));
                        if (A3 > 0) {
                            i11 = dze.b(A3, coe.m(i14), A3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int D3 = w1f.D((List) unsafe.getObject(obj, j));
                        if (D3 > 0) {
                            i11 = dze.b(D3, coe.m(i14), D3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int x = w1f.x((List) unsafe.getObject(obj, j));
                        if (x > 0) {
                            i11 = dze.b(x, coe.m(i14), x, i11);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p = w1f.p((List) unsafe.getObject(obj, j));
                        if (p > 0) {
                            i11 = dze.b(p, coe.m(i14), p, i11);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list8 = (List) a5f.l(obj, j);
                        o1f m = m(i10);
                        Class cls10 = w1f.a;
                        int size9 = list8.size();
                        if (size9 == 0) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            for (int i17 = 0; i17 < size9; i17++) {
                                i6 = coe.h(i14, (hie) list8.get(i17), m) + i6;
                            }
                        }
                        i11 = i6 + i11;
                        break;
                    case 50:
                        Object l2 = a5f.l(obj, j);
                        Object t6 = t(i10);
                        zxeVar.getClass();
                        zxe.b(l2, t6);
                        break;
                    case 51:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(i14, i10, obj)) {
                            long A4 = A(j, obj);
                            t4 = coe.t(i14 << 3);
                            o3 = coe.o(A4);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(i14, i10, obj)) {
                            n2 = coe.n(i14, A(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(i14, i10, obj)) {
                            int z2 = z(j, obj);
                            t4 = coe.t(i14 << 3);
                            o3 = coe.p(z2);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i14, i10, obj)) {
                            n2 = coe.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(i14, i10, obj)) {
                            n2 = coe.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(i14, i10, obj)) {
                            Object l3 = a5f.l(obj, j);
                            if (l3 instanceof jne) {
                                n2 = coe.i(i14, (jne) l3);
                                i11 += n2;
                                break;
                            } else {
                                t4 = coe.t(i14 << 3);
                                o3 = coe.f((String) l3);
                                i11 += o3 + t4;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (q(i14, i10, obj)) {
                            n2 = w1f.a(i14, a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(i14, i10, obj)) {
                            n2 = coe.i(i14, (jne) a5f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(i14, i10, obj)) {
                            n2 = coe.s(i14, z(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(i14, i10, obj)) {
                            int z3 = z(j, obj);
                            t4 = coe.t(i14 << 3);
                            o3 = coe.p(z3);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(i14, i10, obj)) {
                            n2 = coe.u(i14, z(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(i14, i10, obj)) {
                            n2 = coe.q(i14, A(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(i14, i10, obj)) {
                            n2 = coe.h(i14, (hie) a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                }
                i10 += 3;
                i7 = i13;
                i8 = i15;
                iArr = iArr2;
            }
            d4fVar2.getClass();
            return ((ese) obj).zzb.d() + i11;
        }
        int i18 = 1048575;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < iArr.length) {
            int y2 = y(i19);
            int i22 = iArr[i19];
            int i23 = (y2 & 267386880) >>> 20;
            int i24 = i9;
            if (i23 <= 17) {
                int i25 = iArr[i19 + 2];
                int i26 = i25 & 1048575;
                i = i24 << (i25 >>> 20);
                d4fVar = d4fVar2;
                if (i26 != i18) {
                    i21 = unsafe.getInt(obj, i26);
                    i18 = i26;
                }
            } else {
                d4fVar = d4fVar2;
                i = 0;
            }
            long j2 = y2 & 1048575;
            switch (i23) {
                case 0:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.o(unsafe.getLong(obj, j2)) + coe.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.n(i22, unsafe.getLong(obj, j2));
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.p(unsafe.getInt(obj, j2)) + coe.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.r(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.v(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i & i21) != 0) {
                        i2 = 1;
                        i20 = xnb.A(i22 << 3, 1, i20);
                        break;
                    }
                    i2 = 1;
                    break;
                case 8:
                    if ((i & i21) != 0) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof jne) {
                            i3 = coe.i(i22, (jne) object);
                            i20 += i3;
                        } else {
                            t = coe.t(i22 << 3);
                            f = coe.f((String) object);
                            i3 = f + t;
                            i20 += i3;
                        }
                    }
                    i2 = 1;
                    break;
                case 9:
                    if ((i & i21) != 0) {
                        i3 = w1f.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 10:
                    if ((i & i21) != 0) {
                        i3 = coe.i(i22, (jne) unsafe.getObject(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 11:
                    if ((i & i21) != 0) {
                        i3 = coe.s(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 12:
                    if ((i & i21) != 0) {
                        int i27 = unsafe.getInt(obj, j2);
                        t = coe.t(i22 << 3);
                        f = coe.p(i27);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 13:
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 14:
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 15:
                    if ((i & i21) != 0) {
                        i3 = coe.u(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 16:
                    if ((i & i21) != 0) {
                        i3 = coe.q(i22, unsafe.getLong(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 17:
                    if ((i & i21) != 0) {
                        i3 = coe.h(i22, (hie) unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 18:
                    i3 = w1f.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 19:
                    i3 = w1f.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 20:
                    List list9 = (List) unsafe.getObject(obj, j2);
                    Class cls11 = w1f.a;
                    if (list9.size() != 0) {
                        i3 = dze.a(i22, list9.size(), w1f.c(list9));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 21:
                    List list10 = (List) unsafe.getObject(obj, j2);
                    Class cls12 = w1f.a;
                    int size10 = list10.size();
                    if (size10 != 0) {
                        i3 = dze.a(i22, size10, w1f.k(list10));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 22:
                    List list11 = (List) unsafe.getObject(obj, j2);
                    Class cls13 = w1f.a;
                    int size11 = list11.size();
                    if (size11 != 0) {
                        i3 = dze.a(i22, size11, w1f.t(list11));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 23:
                    i3 = w1f.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 24:
                    i3 = w1f.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 25:
                    Class cls14 = w1f.a;
                    int size12 = ((List) unsafe.getObject(obj, j2)).size();
                    if (size12 == 0) {
                        t2 = 0;
                    } else {
                        t2 = (coe.t(i22 << 3) + 1) * size12;
                    }
                    i20 += t2;
                    i2 = 1;
                    break;
                case 26:
                    i3 = w1f.j(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 27:
                    i3 = w1f.b(i22, (List) unsafe.getObject(obj, j2), m(i19));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 28:
                    i3 = w1f.o(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 29:
                    List list12 = (List) unsafe.getObject(obj, j2);
                    Class cls15 = w1f.a;
                    int size13 = list12.size();
                    if (size13 != 0) {
                        i3 = dze.a(i22, size13, w1f.v(list12));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 30:
                    List list13 = (List) unsafe.getObject(obj, j2);
                    Class cls16 = w1f.a;
                    int size14 = list13.size();
                    if (size14 != 0) {
                        i3 = dze.a(i22, size14, w1f.r(list13));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 31:
                    i3 = w1f.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 32:
                    i3 = w1f.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 33:
                    List list14 = (List) unsafe.getObject(obj, j2);
                    Class cls17 = w1f.a;
                    int size15 = list14.size();
                    if (size15 != 0) {
                        i3 = dze.a(i22, size15, w1f.x(list14));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 34:
                    List list15 = (List) unsafe.getObject(obj, j2);
                    Class cls18 = w1f.a;
                    int size16 = list15.size();
                    if (size16 != 0) {
                        i3 = dze.a(i22, size16, w1f.p(list15));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 35:
                    int D4 = w1f.D((List) unsafe.getObject(obj, j2));
                    if (D4 > 0) {
                        i20 = dze.b(D4, coe.m(i22), D4, i20);
                    }
                    i2 = 1;
                    break;
                case 36:
                    int A5 = w1f.A((List) unsafe.getObject(obj, j2));
                    if (A5 > 0) {
                        i20 = dze.b(A5, coe.m(i22), A5, i20);
                    }
                    i2 = 1;
                    break;
                case 37:
                    int c2 = w1f.c((List) unsafe.getObject(obj, j2));
                    if (c2 > 0) {
                        i20 = dze.b(c2, coe.m(i22), c2, i20);
                    }
                    i2 = 1;
                    break;
                case 38:
                    int k2 = w1f.k((List) unsafe.getObject(obj, j2));
                    if (k2 > 0) {
                        i20 = dze.b(k2, coe.m(i22), k2, i20);
                    }
                    i2 = 1;
                    break;
                case 39:
                    int t7 = w1f.t((List) unsafe.getObject(obj, j2));
                    if (t7 > 0) {
                        i20 = dze.b(t7, coe.m(i22), t7, i20);
                    }
                    i2 = 1;
                    break;
                case 40:
                    int D5 = w1f.D((List) unsafe.getObject(obj, j2));
                    if (D5 > 0) {
                        i20 = dze.b(D5, coe.m(i22), D5, i20);
                    }
                    i2 = 1;
                    break;
                case 41:
                    int A6 = w1f.A((List) unsafe.getObject(obj, j2));
                    if (A6 > 0) {
                        i20 = dze.b(A6, coe.m(i22), A6, i20);
                    }
                    i2 = 1;
                    break;
                case 42:
                    Class cls19 = w1f.a;
                    int size17 = ((List) unsafe.getObject(obj, j2)).size();
                    if (size17 > 0) {
                        i20 = dze.b(size17, coe.m(i22), size17, i20);
                    }
                    i2 = 1;
                    break;
                case 43:
                    int v2 = w1f.v((List) unsafe.getObject(obj, j2));
                    if (v2 > 0) {
                        i20 = dze.b(v2, coe.m(i22), v2, i20);
                    }
                    i2 = 1;
                    break;
                case 44:
                    int r2 = w1f.r((List) unsafe.getObject(obj, j2));
                    if (r2 > 0) {
                        i20 = dze.b(r2, coe.m(i22), r2, i20);
                    }
                    i2 = 1;
                    break;
                case 45:
                    int A7 = w1f.A((List) unsafe.getObject(obj, j2));
                    if (A7 > 0) {
                        i20 = dze.b(A7, coe.m(i22), A7, i20);
                    }
                    i2 = 1;
                    break;
                case 46:
                    int D6 = w1f.D((List) unsafe.getObject(obj, j2));
                    if (D6 > 0) {
                        i20 = dze.b(D6, coe.m(i22), D6, i20);
                    }
                    i2 = 1;
                    break;
                case 47:
                    int x2 = w1f.x((List) unsafe.getObject(obj, j2));
                    if (x2 > 0) {
                        i20 = dze.b(x2, coe.m(i22), x2, i20);
                    }
                    i2 = 1;
                    break;
                case 48:
                    int p2 = w1f.p((List) unsafe.getObject(obj, j2));
                    if (p2 > 0) {
                        i20 = dze.b(p2, coe.m(i22), p2, i20);
                    }
                    i2 = 1;
                    break;
                case 49:
                    List list16 = (List) unsafe.getObject(obj, j2);
                    o1f m2 = m(i19);
                    Class cls20 = w1f.a;
                    int size18 = list16.size();
                    if (size18 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i28 = 0; i28 < size18; i28++) {
                            i4 += coe.h(i22, (hie) list16.get(i28), m2);
                        }
                    }
                    i20 += i4;
                    i2 = 1;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    Object t8 = t(i19);
                    zxeVar.getClass();
                    zxe.b(object2, t8);
                    i2 = 1;
                    break;
                case 51:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 52:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 53:
                    if (q(i22, i19, obj)) {
                        i3 = coe.o(A(j2, obj)) + coe.t(i22 << 3);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 54:
                    if (q(i22, i19, obj)) {
                        i3 = coe.n(i22, A(j2, obj));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 55:
                    if (q(i22, i19, obj)) {
                        int z4 = z(j2, obj);
                        t = coe.t(i22 << 3);
                        f = coe.p(z4);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 56:
                    if (q(i22, i19, obj)) {
                        i3 = coe.r(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 57:
                    if (q(i22, i19, obj)) {
                        i3 = coe.v(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 58:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, i24, i20);
                        i2 = i24;
                        break;
                    }
                    i2 = 1;
                    break;
                case 59:
                    if (q(i22, i19, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof jne) {
                            i5 = coe.i(i22, (jne) object3);
                            i20 += i5;
                        } else {
                            t3 = coe.t(i22 << 3);
                            f2 = coe.f((String) object3);
                            i5 = f2 + t3;
                            i20 += i5;
                        }
                    }
                    i2 = i24;
                    break;
                case 60:
                    if (q(i22, i19, obj)) {
                        i5 = w1f.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 61:
                    if (q(i22, i19, obj)) {
                        i5 = coe.i(i22, (jne) unsafe.getObject(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 62:
                    if (q(i22, i19, obj)) {
                        i5 = coe.s(i22, z(j2, obj));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 63:
                    if (q(i22, i19, obj)) {
                        int z5 = z(j2, obj);
                        t3 = coe.t(i22 << 3);
                        f2 = coe.p(z5);
                        i5 = f2 + t3;
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 64:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                    }
                    i2 = i24;
                    break;
                case 65:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                    }
                    i2 = i24;
                    break;
                case 66:
                    if (q(i22, i19, obj)) {
                        i5 = coe.u(i22, z(j2, obj));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 67:
                    if (q(i22, i19, obj)) {
                        i5 = coe.q(i22, A(j2, obj));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 68:
                    if (q(i22, i19, obj)) {
                        i5 = coe.h(i22, (hie) unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                default:
                    i2 = i24;
                    break;
            }
            i19 += 3;
            i9 = i2;
            d4fVar2 = d4fVar;
        }
        d4fVar2.getClass();
        return ((ese) obj).zzb.d() + i20;
    }
}
