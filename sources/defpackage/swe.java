package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;
public final class swe implements zye {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final rfe e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final vxe j;
    public final cte k;
    public final o1f l;
    public final lve m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public swe(int[] iArr, Object[] objArr, int i, int i2, rfe rfeVar, boolean z, int[] iArr2, int i3, int i4, vxe vxeVar, cte cteVar, o1f o1fVar, yme ymeVar, lve lveVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = vxeVar;
        this.k = cteVar;
        this.l = o1fVar;
        this.e = rfeVar;
        this.m = lveVar;
    }

    public static long A(Object obj, long j) {
        return ((Long) k2f.l(obj, j)).longValue();
    }

    public static s1f B(Object obj) {
        qpe qpeVar = (qpe) obj;
        s1f s1fVar = qpeVar.zzb;
        if (s1fVar == s1f.f) {
            s1f b = s1f.b();
            qpeVar.zzb = b;
            return b;
        }
        return s1fVar;
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
            zo4.k(b10.j(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    public static defpackage.swe l(defpackage.uye r33, defpackage.vxe r34, defpackage.cte r35, defpackage.o1f r36, defpackage.yme r37, defpackage.lve r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swe.l(uye, vxe, cte, o1f, yme, lve):swe");
    }

    public static void n(int i, Object obj, eod eodVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            nle nleVar = (nle) eodVar.b;
            nleVar.c(i, 2);
            byte[] bArr = nleVar.b;
            int i2 = nleVar.d;
            try {
                int t = nle.t(str.length() * 3);
                int t2 = nle.t(str.length());
                if (t2 == t) {
                    int i3 = i2 + t2;
                    nleVar.d = i3;
                    int b = s2f.a.b(str, bArr, i3, nleVar.e());
                    nleVar.d = i2;
                    nleVar.g((b - i2) - t2);
                    nleVar.d = b;
                    return;
                }
                nleVar.g(s2f.a(str));
                nleVar.d = s2f.a.b(str, bArr, nleVar.d, nleVar.e());
                return;
            } catch (b3f e) {
                nleVar.d = i2;
                nle.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(iqe.a);
                try {
                    nleVar.g(bytes.length);
                    nleVar.k(bytes, 0, bytes.length);
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw new ole(e2);
                } catch (ole e3) {
                    throw e3;
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new ole(e4);
            }
        }
        eodVar.b(i, (tke) obj);
    }

    public static int z(Object obj, long j) {
        return ((Integer) k2f.l(obj, j)).intValue();
    }

    @Override
    public final boolean a(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swe.a(java.lang.Object):boolean");
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
            Object l = k2f.l(obj, y);
            if (l != null) {
                this.m.getClass();
                ((dve) l).a = false;
                k2f.d(obj, y, l);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.k.b(obj, iArr[i]);
            i++;
        }
        this.l.getClass();
        ((qpe) obj).zzb.e = false;
    }

    @Override
    public final void c(Object obj, byte[] bArr, int i, int i2, ucd ucdVar) {
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
        swe sweVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i16 = i2;
        ucd ucdVar2 = ucdVar;
        if (sweVar.f) {
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
                        i22 = i4f.d(i23, bArr2, i22, ucdVar2);
                        i23 = ucdVar2.a;
                    }
                    int i24 = i22;
                    int i25 = i23 >>> 3;
                    int i26 = i23 & 7;
                    int i27 = sweVar.d;
                    int i28 = sweVar.c;
                    if (i25 > i18) {
                        int i29 = i19 / 3;
                        if (i25 >= i28 && i25 <= i27) {
                            i4 = sweVar.s(i25, i29);
                        } else {
                            i4 = -1;
                        }
                        i3 = 0;
                    } else if (i25 >= i28 && i25 <= i27) {
                        i3 = 0;
                        i4 = sweVar.s(i25, 0);
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
                        int[] iArr = sweVar.a;
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
                                        k2f.c.m(obj5, j, Double.longBitsToDouble(i4f.j(i24, bArr2)));
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
                                        k2f.c.n(obj5, j, Float.intBitsToFloat(i4f.a(i24, bArr2)));
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
                                        i11 = i4f.i(bArr2, i24, ucdVar2);
                                        unsafe.putLong(obj5, j, ucdVar2.b);
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
                                        int h = i4f.h(bArr2, i24, ucdVar2);
                                        unsafe.putInt(obj5, j, ucdVar2.a);
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
                                        unsafe.putLong(obj5, j, i4f.j(i24, bArr2));
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
                                        unsafe.putInt(obj5, j, i4f.a(i24, bArr2));
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
                                        i17 = i4f.i(bArr2, i24, ucdVar2);
                                        if (ucdVar2.b != 0) {
                                            z = i9;
                                        } else {
                                            z = false;
                                        }
                                        k2f.c.o(obj5, j, z);
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
                                            i17 = i4f.k(bArr2, i24, ucdVar2);
                                        } else {
                                            i17 = i4f.l(bArr2, i24, ucdVar2);
                                        }
                                        unsafe.putObject(obj5, j, ucdVar2.c);
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
                                        i17 = i4f.g(sweVar.m(i30), bArr2, i24, i16, ucdVar2);
                                        Object object = unsafe.getObject(obj5, j);
                                        Object obj6 = ucdVar2.c;
                                        if (object == null) {
                                            unsafe.putObject(obj5, j, obj6);
                                        } else {
                                            unsafe.putObject(obj5, j, iqe.b(object, obj6));
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
                                        i17 = i4f.m(bArr2, i24, ucdVar2);
                                        unsafe.putObject(obj5, j, ucdVar2.c);
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
                                        i17 = i4f.h(bArr2, i24, ucdVar2);
                                        unsafe.putInt(obj5, j, ucdVar2.a);
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
                                        i17 = i4f.h(bArr2, i24, ucdVar2);
                                        unsafe.putInt(obj5, j, q4f.a(ucdVar2.a));
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 16:
                                    if (i26 == 0) {
                                        i11 = i4f.i(bArr2, i24, ucdVar2);
                                        long j2 = ucdVar2.b;
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
                                    nre nreVar = (nre) unsafe.getObject(obj7, j);
                                    if (!nreVar.zza()) {
                                        int size = nreVar.size();
                                        if (size == 0) {
                                            i14 = 10;
                                        } else {
                                            i14 = size << 1;
                                        }
                                        nreVar = nreVar.zza(i14);
                                        unsafe.putObject(obj7, j, nreVar);
                                    }
                                    i17 = i4f.e(sweVar.m(i30), i33, bArr2, i24, i16, nreVar, ucdVar2);
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i16 = i2;
                                    ucdVar2 = ucdVar;
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
                                    i15 = sweVar.i(obj, bArr, i24, i2, i5, i25, i26, i30, i31, i32, j, ucdVar);
                                    obj5 = obj;
                                    i8 = i30;
                                    if (i15 == i24) {
                                        obj2 = obj5;
                                        i7 = i15;
                                    } else {
                                        i16 = i2;
                                        ucdVar2 = ucdVar;
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
                                            sweVar.o(obj4, i8, j);
                                            throw null;
                                        }
                                    } else {
                                        i15 = sweVar.h(obj4, bArr, i12, i2, i5, i25, i26, i31, i32, j, i8, ucdVar);
                                        obj2 = obj4;
                                        if (i15 == i12) {
                                            i7 = i15;
                                        } else {
                                            sweVar = this;
                                            ucdVar2 = ucdVar;
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
                    ucdVar2 = ucdVar;
                    i17 = i4f.c(i5, bArr, i7, i2, B(obj2), ucdVar);
                    obj5 = obj2;
                    i19 = i8;
                    i21 = i6;
                    sweVar = this;
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
            j(obj5, bArr, i, i16, 0, ucdVar);
        }
    }

    @Override
    public final void d(Object obj, eod eodVar) {
        int i;
        int i2;
        int i3;
        int i4;
        eodVar.getClass();
        nle nleVar = (nle) eodVar.b;
        boolean z = this.f;
        o1f o1fVar = this.l;
        lve lveVar = this.m;
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
                            long doubleToRawLongBits = Double.doubleToRawLongBits(k2f.c.t(obj, y & 1048575));
                            nleVar.c(i8, 1);
                            nleVar.j(doubleToRawLongBits);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i7, obj)) {
                            int floatToRawIntBits = Float.floatToRawIntBits(k2f.c.r(obj, y & 1048575));
                            nleVar.c(i8, 5);
                            nleVar.l(floatToRawIntBits);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i7, obj)) {
                            long g = k2f.g(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.d(g);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i7, obj)) {
                            long g2 = k2f.g(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.d(g2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i7, obj)) {
                            int b = k2f.b(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.b(b);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i7, obj)) {
                            long g3 = k2f.g(obj, y & 1048575);
                            nleVar.c(i8, 1);
                            nleVar.j(g3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i7, obj)) {
                            int b2 = k2f.b(obj, y & 1048575);
                            nleVar.c(i8, 5);
                            nleVar.l(b2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i7, obj)) {
                            boolean q = k2f.c.q(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.a(q ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i7, obj)) {
                            n(i8, k2f.l(obj, y & 1048575), eodVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i7, obj)) {
                            eodVar.a(i8, k2f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i7, obj)) {
                            eodVar.b(i8, (tke) k2f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i7, obj)) {
                            int b3 = k2f.b(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.g(b3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i7, obj)) {
                            int b4 = k2f.b(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.b(b4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i7, obj)) {
                            int b5 = k2f.b(obj, y & 1048575);
                            nleVar.c(i8, 5);
                            nleVar.l(b5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i7, obj)) {
                            long g4 = k2f.g(obj, y & 1048575);
                            nleVar.c(i8, 1);
                            nleVar.j(g4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i7, obj)) {
                            int b6 = k2f.b(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.g((b6 << 1) ^ (b6 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i7, obj)) {
                            long g5 = k2f.g(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.d((g5 << 1) ^ (g5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i7, obj)) {
                            eodVar.c(i8, k2f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        hze.g(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 19:
                        hze.n(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 20:
                        hze.q(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 21:
                        hze.s(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 22:
                        hze.B(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 23:
                        hze.w(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 24:
                        hze.G(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 25:
                        hze.J(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 26:
                        hze.e(i8, (List) k2f.l(obj, y & 1048575), eodVar);
                        break;
                    case 27:
                        hze.f(i8, (List) k2f.l(obj, y & 1048575), eodVar, m(i7));
                        break;
                    case 28:
                        hze.l(i8, (List) k2f.l(obj, y & 1048575), eodVar);
                        break;
                    case 29:
                        hze.E(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 30:
                        hze.I(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 31:
                        hze.H(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 32:
                        hze.y(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 33:
                        hze.F(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 34:
                        hze.u(i8, (List) k2f.l(obj, y & 1048575), eodVar, false);
                        break;
                    case 35:
                        hze.g(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 36:
                        hze.n(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 37:
                        hze.q(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 38:
                        hze.s(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 39:
                        hze.B(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 40:
                        hze.w(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 41:
                        hze.G(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 42:
                        hze.J(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 43:
                        hze.E(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 44:
                        hze.I(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 45:
                        hze.H(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 46:
                        hze.y(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 47:
                        hze.F(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 48:
                        hze.u(i8, (List) k2f.l(obj, y & 1048575), eodVar, true);
                        break;
                    case 49:
                        hze.m(i8, (List) k2f.l(obj, y & 1048575), eodVar, m(i7));
                        break;
                    case 50:
                        if (k2f.l(obj, y & 1048575) != null) {
                            Object t = t(i7);
                            lveVar.getClass();
                            if (t != null) {
                                rjb.p();
                                return;
                            }
                            throw new NoSuchMethodError();
                        }
                        break;
                    case 51:
                        if (q(i8, i7, obj)) {
                            long doubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) k2f.l(obj, y & 1048575)).doubleValue());
                            nleVar.c(i8, 1);
                            nleVar.j(doubleToRawLongBits2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(i8, i7, obj)) {
                            int floatToRawIntBits2 = Float.floatToRawIntBits(((Float) k2f.l(obj, y & 1048575)).floatValue());
                            nleVar.c(i8, 5);
                            nleVar.l(floatToRawIntBits2);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(i8, i7, obj)) {
                            long A = A(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.d(A);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(i8, i7, obj)) {
                            long A2 = A(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.d(A2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(i8, i7, obj)) {
                            int z2 = z(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.b(z2);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i8, i7, obj)) {
                            long A3 = A(obj, y & 1048575);
                            nleVar.c(i8, 1);
                            nleVar.j(A3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(i8, i7, obj)) {
                            int z3 = z(obj, y & 1048575);
                            nleVar.c(i8, 5);
                            nleVar.l(z3);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(i8, i7, obj)) {
                            boolean booleanValue = ((Boolean) k2f.l(obj, y & 1048575)).booleanValue();
                            nleVar.c(i8, 0);
                            nleVar.a(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(i8, i7, obj)) {
                            n(i8, k2f.l(obj, y & 1048575), eodVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (q(i8, i7, obj)) {
                            eodVar.a(i8, k2f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(i8, i7, obj)) {
                            eodVar.b(i8, (tke) k2f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(i8, i7, obj)) {
                            int z4 = z(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.g(z4);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(i8, i7, obj)) {
                            int z5 = z(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.b(z5);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i8, i7, obj)) {
                            int z6 = z(obj, y & 1048575);
                            nleVar.c(i8, 5);
                            nleVar.l(z6);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i8, i7, obj)) {
                            long A4 = A(obj, y & 1048575);
                            nleVar.c(i8, 1);
                            nleVar.j(A4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(i8, i7, obj)) {
                            int z7 = z(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.g((z7 << 1) ^ (z7 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(i8, i7, obj)) {
                            long A5 = A(obj, y & 1048575);
                            nleVar.c(i8, 0);
                            nleVar.d((A5 << 1) ^ (A5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(i8, i7, obj)) {
                            eodVar.c(i8, k2f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            o1fVar.getClass();
            ((qpe) obj).zzb.c(eodVar);
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
            o1f o1fVar2 = o1fVar;
            long j = y2 & i13;
            switch (i14) {
                case 0:
                    if ((i10 & i18) != 0) {
                        long doubleToRawLongBits3 = Double.doubleToRawLongBits(k2f.c.t(obj, j));
                        i3 = 1;
                        nleVar.c(i12, 1);
                        nleVar.j(doubleToRawLongBits3);
                        break;
                    }
                    i3 = 1;
                    break;
                case 1:
                    if ((i10 & i18) != 0) {
                        int floatToRawIntBits3 = Float.floatToRawIntBits(k2f.c.r(obj, j));
                        nleVar.c(i12, 5);
                        nleVar.l(floatToRawIntBits3);
                    }
                    i3 = 1;
                    break;
                case 2:
                    if ((i10 & i18) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.d(j2);
                    }
                    i3 = 1;
                    break;
                case 3:
                    if ((i10 & i18) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.d(j3);
                    }
                    i3 = 1;
                    break;
                case 4:
                    if ((i10 & i18) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.b(i19);
                    }
                    i3 = 1;
                    break;
                case 5:
                    if ((i10 & i18) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        nleVar.c(i12, 1);
                        nleVar.j(j4);
                    }
                    i3 = 1;
                    break;
                case 6:
                    if ((i10 & i18) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        nleVar.c(i12, 5);
                        nleVar.l(i20);
                    }
                    i3 = 1;
                    break;
                case 7:
                    if ((i10 & i18) != 0) {
                        boolean q2 = k2f.c.q(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.a(q2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    break;
                case 8:
                    if ((i10 & i18) != 0) {
                        n(i12, unsafe.getObject(obj, j), eodVar);
                    }
                    i3 = 1;
                    break;
                case 9:
                    if ((i10 & i18) != 0) {
                        eodVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 10:
                    if ((i10 & i18) != 0) {
                        eodVar.b(i12, (tke) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    break;
                case 11:
                    if ((i10 & i18) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.g(i21);
                    }
                    i3 = 1;
                    break;
                case 12:
                    if ((i10 & i18) != 0) {
                        int i22 = unsafe.getInt(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.b(i22);
                    }
                    i3 = 1;
                    break;
                case 13:
                    if ((i10 & i18) != 0) {
                        int i23 = unsafe.getInt(obj, j);
                        nleVar.c(i12, 5);
                        nleVar.l(i23);
                    }
                    i3 = 1;
                    break;
                case 14:
                    if ((i10 & i18) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        nleVar.c(i12, 1);
                        nleVar.j(j5);
                    }
                    i3 = 1;
                    break;
                case 15:
                    if ((i10 & i18) != 0) {
                        int i24 = unsafe.getInt(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.g((i24 << 1) ^ (i24 >> 31));
                    }
                    i3 = 1;
                    break;
                case 16:
                    if ((i10 & i18) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.d((j6 << 1) ^ (j6 >> 63));
                    }
                    i3 = 1;
                    break;
                case 17:
                    if ((i10 & i18) != 0) {
                        eodVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 18:
                    hze.g(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 19:
                    hze.n(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 20:
                    hze.q(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 21:
                    hze.s(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 22:
                    hze.B(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 23:
                    hze.w(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 24:
                    hze.G(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 25:
                    hze.J(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 26:
                    hze.e(iArr[i9], (List) unsafe.getObject(obj, j), eodVar);
                    i3 = 1;
                    break;
                case 27:
                    hze.f(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, m(i9));
                    i3 = 1;
                    break;
                case 28:
                    hze.l(iArr[i9], (List) unsafe.getObject(obj, j), eodVar);
                    i3 = 1;
                    break;
                case 29:
                    hze.E(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 30:
                    hze.I(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 31:
                    hze.H(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 32:
                    hze.y(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 33:
                    hze.F(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 34:
                    hze.u(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, false);
                    i3 = 1;
                    break;
                case 35:
                    boolean z8 = i15;
                    hze.g(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z8);
                    i4 = z8;
                    i3 = i4;
                    break;
                case 36:
                    boolean z9 = i15;
                    hze.n(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z9);
                    i4 = z9;
                    i3 = i4;
                    break;
                case 37:
                    boolean z10 = i15;
                    hze.q(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z10);
                    i4 = z10;
                    i3 = i4;
                    break;
                case 38:
                    boolean z11 = i15;
                    hze.s(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z11);
                    i4 = z11;
                    i3 = i4;
                    break;
                case 39:
                    boolean z12 = i15;
                    hze.B(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z12);
                    i4 = z12;
                    i3 = i4;
                    break;
                case 40:
                    boolean z13 = i15;
                    hze.w(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z13);
                    i4 = z13;
                    i3 = i4;
                    break;
                case 41:
                    boolean z14 = i15;
                    hze.G(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z14);
                    i4 = z14;
                    i3 = i4;
                    break;
                case 42:
                    boolean z15 = i15;
                    hze.J(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z15);
                    i4 = z15;
                    i3 = i4;
                    break;
                case 43:
                    boolean z16 = i15;
                    hze.E(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z16);
                    i4 = z16;
                    i3 = i4;
                    break;
                case 44:
                    boolean z17 = i15;
                    hze.I(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z17);
                    i4 = z17;
                    i3 = i4;
                    break;
                case 45:
                    boolean z18 = i15;
                    hze.H(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z18);
                    i4 = z18;
                    i3 = i4;
                    break;
                case 46:
                    boolean z19 = i15;
                    hze.y(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z19);
                    i4 = z19;
                    i3 = i4;
                    break;
                case 47:
                    boolean z20 = i15;
                    hze.F(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, z20);
                    i4 = z20;
                    i3 = i4;
                    break;
                case 48:
                    i4 = 1;
                    hze.u(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, true);
                    i3 = i4;
                    break;
                case 49:
                    hze.m(iArr[i9], (List) unsafe.getObject(obj, j), eodVar, m(i9));
                    i3 = 1;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object t2 = t(i9);
                        lveVar.getClass();
                        if (t2 != null) {
                            rjb.p();
                            return;
                        }
                        throw new NoSuchMethodError();
                    }
                    i3 = 1;
                    break;
                case 51:
                    if (q(i12, i9, obj)) {
                        long doubleToRawLongBits4 = Double.doubleToRawLongBits(((Double) k2f.l(obj, j)).doubleValue());
                        nleVar.c(i12, 1);
                        nleVar.j(doubleToRawLongBits4);
                    }
                    i3 = 1;
                    break;
                case 52:
                    if (q(i12, i9, obj)) {
                        int floatToRawIntBits4 = Float.floatToRawIntBits(((Float) k2f.l(obj, j)).floatValue());
                        nleVar.c(i12, 5);
                        nleVar.l(floatToRawIntBits4);
                    }
                    i3 = 1;
                    break;
                case 53:
                    if (q(i12, i9, obj)) {
                        long A6 = A(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.d(A6);
                    }
                    i3 = 1;
                    break;
                case 54:
                    if (q(i12, i9, obj)) {
                        long A7 = A(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.d(A7);
                    }
                    i3 = 1;
                    break;
                case 55:
                    if (q(i12, i9, obj)) {
                        int z21 = z(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.b(z21);
                    }
                    i3 = 1;
                    break;
                case 56:
                    if (q(i12, i9, obj)) {
                        long A8 = A(obj, j);
                        nleVar.c(i12, 1);
                        nleVar.j(A8);
                    }
                    i3 = 1;
                    break;
                case 57:
                    if (q(i12, i9, obj)) {
                        int z22 = z(obj, j);
                        nleVar.c(i12, 5);
                        nleVar.l(z22);
                    }
                    i3 = 1;
                    break;
                case 58:
                    if (q(i12, i9, obj)) {
                        boolean booleanValue2 = ((Boolean) k2f.l(obj, j)).booleanValue();
                        nleVar.c(i12, 0);
                        nleVar.a(booleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    break;
                case 59:
                    if (q(i12, i9, obj)) {
                        n(i12, unsafe.getObject(obj, j), eodVar);
                    }
                    i3 = 1;
                    break;
                case 60:
                    if (q(i12, i9, obj)) {
                        eodVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 61:
                    if (q(i12, i9, obj)) {
                        eodVar.b(i12, (tke) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    break;
                case 62:
                    if (q(i12, i9, obj)) {
                        int z23 = z(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.g(z23);
                    }
                    i3 = 1;
                    break;
                case 63:
                    if (q(i12, i9, obj)) {
                        int z24 = z(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.b(z24);
                    }
                    i3 = 1;
                    break;
                case 64:
                    if (q(i12, i9, obj)) {
                        int z25 = z(obj, j);
                        nleVar.c(i12, 5);
                        nleVar.l(z25);
                    }
                    i3 = 1;
                    break;
                case 65:
                    if (q(i12, i9, obj)) {
                        long A9 = A(obj, j);
                        nleVar.c(i12, i15);
                        nleVar.j(A9);
                    }
                    i3 = 1;
                    break;
                case 66:
                    if (q(i12, i9, obj)) {
                        int z26 = z(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.g((z26 << 1) ^ (z26 >> 31));
                    }
                    i3 = i15;
                    break;
                case 67:
                    if (q(i12, i9, obj)) {
                        long A10 = A(obj, j);
                        nleVar.c(i12, 0);
                        nleVar.d((A10 << i15) ^ (A10 >> 63));
                    }
                    i3 = i15;
                    break;
                case 68:
                    if (q(i12, i9, obj)) {
                        eodVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = i15;
                    break;
                default:
                    i3 = i15;
                    break;
            }
            i9 += 3;
            o1fVar = o1fVar2;
            i5 = i3;
            i6 = i13;
            length2 = i;
        }
        o1fVar.getClass();
        ((qpe) obj).zzb.c(eodVar);
    }

    @Override
    public final void e(qpe qpeVar, qpe qpeVar2) {
        qpe qpeVar3;
        qpeVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int y = y(i);
                long j = y & 1048575;
                int i2 = iArr[i];
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            c8c c8cVar = k2f.c;
                            c8cVar.m(qpeVar3, j, c8cVar.t(qpeVar2, j));
                            u(qpeVar3, i);
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 1:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            c8c c8cVar2 = k2f.c;
                            c8cVar2.n(qpeVar3, j, c8cVar2.r(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 2:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c.a.putLong(qpeVar3, j, k2f.g(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 3:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c.a.putLong(qpeVar3, j, k2f.g(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 4:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c(qpeVar3, k2f.b(qpeVar2, j), j);
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 5:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c.a.putLong(qpeVar3, j, k2f.g(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 6:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c(qpeVar3, k2f.b(qpeVar2, j), j);
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 7:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            c8c c8cVar3 = k2f.c;
                            c8cVar3.o(qpeVar3, j, c8cVar3.q(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 8:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.d(qpeVar3, j, k2f.l(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 9:
                        qpeVar3 = qpeVar;
                        p(qpeVar3, qpeVar2, i);
                        continue;
                        i += 3;
                        qpeVar = qpeVar3;
                    case 10:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.d(qpeVar3, j, k2f.l(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 11:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c(qpeVar3, k2f.b(qpeVar2, j), j);
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 12:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c(qpeVar3, k2f.b(qpeVar2, j), j);
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 13:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c(qpeVar3, k2f.b(qpeVar2, j), j);
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 14:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c.a.putLong(qpeVar3, j, k2f.g(qpeVar2, j));
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 15:
                        qpeVar3 = qpeVar;
                        if (r(i, qpeVar2)) {
                            k2f.c(qpeVar3, k2f.b(qpeVar2, j), j);
                            u(qpeVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        qpeVar = qpeVar3;
                    case 16:
                        if (r(i, qpeVar2)) {
                            qpeVar3 = qpeVar;
                            k2f.c.a.putLong(qpeVar3, j, k2f.g(qpeVar2, j));
                            u(qpeVar3, i);
                            continue;
                            i += 3;
                            qpeVar = qpeVar3;
                        }
                        break;
                    case 17:
                        p(qpeVar, qpeVar2, i);
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
                        this.k.a(qpeVar, qpeVar2, j);
                        break;
                    case 50:
                        Class cls = hze.a;
                        Object l = k2f.l(qpeVar, j);
                        Object l2 = k2f.l(qpeVar2, j);
                        this.m.getClass();
                        k2f.d(qpeVar, j, lve.a(l, l2));
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
                        if (q(i2, i, qpeVar2)) {
                            k2f.d(qpeVar, j, k2f.l(qpeVar2, j));
                            k2f.c(qpeVar, i2, iArr[i + 2] & 1048575);
                            break;
                        }
                        break;
                    case 60:
                        v(qpeVar, qpeVar2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (q(i2, i, qpeVar2)) {
                            k2f.d(qpeVar, j, k2f.l(qpeVar2, j));
                            k2f.c(qpeVar, i2, iArr[i + 2] & 1048575);
                            break;
                        }
                        break;
                    case 68:
                        v(qpeVar, qpeVar2, i);
                        break;
                }
                qpeVar3 = qpeVar;
                i += 3;
                qpeVar = qpeVar3;
            } else {
                hze.h(this.l, qpeVar, qpeVar2);
                return;
            }
        }
    }

    @Override
    public final boolean f(defpackage.qpe r12, defpackage.qpe r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swe.f(qpe, qpe):boolean");
    }

    @Override
    public final int g(defpackage.qpe r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swe.g(qpe):int");
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ucd ucdVar) {
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
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(i4f.j(i9, bArr))));
                    i11 = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i9;
            case 52:
                i10 = i;
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(i4f.a(i10, bArr))));
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
                i11 = i4f.i(bArr, i, ucdVar);
                unsafe.putObject(obj, j, Long.valueOf(ucdVar.b));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                i11 = i4f.h(bArr, i, ucdVar);
                unsafe.putObject(obj, j, Integer.valueOf(ucdVar.a));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 56:
            case 65:
                i9 = i;
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(i4f.j(i9, bArr)));
                    i11 = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i9;
            case 57:
            case 64:
                i10 = i;
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(i4f.a(i10, bArr)));
                    i11 = i10 + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i10;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                i11 = i4f.i(bArr, i, ucdVar);
                if (ucdVar.b == 0) {
                    z = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int h = i4f.h(bArr, i, ucdVar);
                int i12 = ucdVar.a;
                if (i12 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!s2f.a.c(h, h + i12, bArr)) {
                            throw ire.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, h, i12, iqe.a));
                    h += i12;
                }
                unsafe.putInt(obj, j2, i4);
                return h;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int g = i4f.g(m(i8), bArr, i, i2, ucdVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                Object obj3 = ucdVar.c;
                if (obj2 == null) {
                    unsafe.putObject(obj, j, obj3);
                } else {
                    unsafe.putObject(obj, j, iqe.b(obj2, obj3));
                }
                unsafe.putInt(obj, j2, i4);
                return g;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                i11 = i4f.m(bArr, i, ucdVar);
                unsafe.putObject(obj, j, ucdVar.c);
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int h2 = i4f.h(bArr, i, ucdVar);
                int i13 = ucdVar.a;
                e5e w = w(i8);
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
                i11 = i4f.h(bArr, i, ucdVar);
                unsafe.putObject(obj, j, Integer.valueOf(q4f.a(ucdVar.a)));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                i11 = i4f.i(bArr, i, ucdVar);
                long j3 = ucdVar.b;
                unsafe.putObject(obj, j, Long.valueOf((j3 >>> 1) ^ (-(j3 & 1))));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 68:
                if (i5 == 3) {
                    i11 = i4f.f(m(i8), bArr, i, i2, (i3 & (-8)) | 4, ucdVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj4 = ucdVar.c;
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, obj4);
                    } else {
                        unsafe.putObject(obj, j, iqe.b(obj2, obj4));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i;
            default:
                return i;
        }
    }

    public final int i(java.lang.Object r13, byte[] r14, int r15, int r16, int r17, int r18, int r19, int r20, long r21, int r23, long r24, defpackage.ucd r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swe.i(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, ucd):int");
    }

    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, ucd ucdVar) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        int i5;
        swe sweVar;
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
        ucd ucdVar2;
        int i14;
        int i15;
        byte[] bArr3;
        int i16;
        Object obj3;
        int i17;
        int i18;
        int i19;
        int h;
        swe sweVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i20 = i2;
        ucd ucdVar3 = ucdVar;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (true) {
            int[] iArr3 = sweVar2.a;
            Unsafe unsafe3 = o;
            if (i21 < i20) {
                int i27 = i21 + 1;
                int i28 = bArr4[i21];
                if (i28 < 0) {
                    i27 = i4f.d(i28, bArr4, i27, ucdVar3);
                    i28 = ucdVar3.a;
                }
                int i29 = i27;
                int i30 = i28;
                int i31 = i30 >>> 3;
                int i32 = i30 & 7;
                int i33 = sweVar2.d;
                int i34 = sweVar2.c;
                if (i31 > i22) {
                    i7 = (i31 < i34 || i31 > i33) ? -1 : sweVar2.s(i31, i23 / 3);
                    i6 = 0;
                } else if (i31 < i34 || i31 > i33) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = sweVar2.s(i31, 0);
                }
                if (i7 == -1) {
                    iArr = iArr3;
                    i8 = i30;
                    i4 = i25;
                    unsafe = unsafe3;
                    i5 = i6;
                    i9 = i31;
                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 1) {
                                    k2f.c.m(obj4, j, Double.longBitsToDouble(i4f.j(i14, bArr2)));
                                    i21 = i14 + 8;
                                    int i40 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i40;
                                    i20 = i2;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i41 = i14;
                                    obj2 = obj4;
                                    i10 = i41;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 5) {
                                    k2f.c.n(obj4, j, Float.intBitsToFloat(i4f.a(i14, bArr2)));
                                    i21 = i14 + 4;
                                    int i402 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i402;
                                    i20 = i2;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i412 = i14;
                                    obj2 = obj4;
                                    i10 = i412;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 0) {
                                    int i42 = i4f.i(bArr, i14, ucdVar2);
                                    unsafe2.putLong(obj4, j, ucdVar2.b);
                                    int i43 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i43;
                                    i20 = i2;
                                    i21 = i42;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i4122 = i14;
                                    obj2 = obj4;
                                    i10 = i4122;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 0) {
                                    int h2 = i4f.h(bArr, i14, ucdVar2);
                                    unsafe2.putInt(obj4, j, ucdVar2.a);
                                    int i44 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i44;
                                    i20 = i2;
                                    i21 = h2;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i41222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 1) {
                                    unsafe2.putLong(obj4, j, i4f.j(i14, bArr2));
                                    i21 = i14 + 8;
                                    int i4022 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4022;
                                    i20 = i2;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i412222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj4, j, i4f.a(i14, bArr2));
                                    i21 = i14 + 4;
                                    int i40222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i40222;
                                    i20 = i2;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i4122222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 == 0) {
                                    i21 = i4f.i(bArr2, i15, ucdVar2);
                                    k2f.c.o(obj4, j, ucdVar2.b != 0);
                                    int i402222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i402222;
                                    i20 = i2;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i41222222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222222;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 == 2) {
                                    if ((i35 & 536870912) == 0) {
                                        i21 = i4f.k(bArr2, i15, ucdVar2);
                                    } else {
                                        i21 = i4f.l(bArr2, i15, ucdVar2);
                                    }
                                    unsafe2.putObject(obj4, j, ucdVar2.c);
                                    int i4022222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4022222;
                                    i20 = i2;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i412222222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222222;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 2) {
                                    i21 = i4f.g(sweVar2.m(i11), bArr3, i15, i16, ucdVar2);
                                    if ((i12 & i38) == 0) {
                                        unsafe2.putObject(obj4, j, ucdVar2.c);
                                    } else {
                                        unsafe2.putObject(obj4, j, iqe.b(unsafe2.getObject(obj4, j), ucdVar2.c));
                                    }
                                    int i45 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45;
                                    i20 = i16;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i4122222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222222;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 2) {
                                    i21 = i4f.m(bArr3, i15, ucdVar2);
                                    unsafe2.putObject(obj4, j, ucdVar2.c);
                                    int i452 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i452;
                                    i20 = i16;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i41222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222222222;
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 0) {
                                    i21 = i4f.h(bArr3, i15, ucdVar2);
                                    int i46 = ucdVar2.a;
                                    e5e w = sweVar2.w(i11);
                                    if (w != null && !w.a(i46)) {
                                        B(obj4).a(i8, Long.valueOf(i46));
                                        bArr4 = bArr3;
                                        i20 = i16;
                                        i23 = i11;
                                        i25 = i13;
                                        i26 = i12;
                                        i24 = i8;
                                        i22 = i31;
                                        ucdVar3 = ucdVar2;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j, i46);
                                        int i4522 = i13;
                                        i26 = i12 | i38;
                                        bArr4 = bArr3;
                                        i25 = i4522;
                                        i20 = i16;
                                        ucdVar3 = ucdVar2;
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
                                    sweVar = sweVar2;
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
                                ucdVar2 = ucdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 0) {
                                    i21 = i4f.h(bArr3, i15, ucdVar2);
                                    unsafe2.putInt(obj4, j, q4f.a(ucdVar2.a));
                                    int i45222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45222;
                                    i20 = i16;
                                    ucdVar3 = ucdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i4122222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222222222;
                                    sweVar = sweVar2;
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
                                    int i47 = i4f.i(bArr, i15, ucdVar);
                                    int i48 = i7;
                                    long j2 = ucdVar.b;
                                    ucdVar2 = ucdVar;
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
                                    ucdVar3 = ucdVar2;
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
                                    sweVar = sweVar2;
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
                                    i21 = i4f.f(sweVar2.m(i7), bArr, i29, i2, (i31 << 3) | 4, ucdVar);
                                    if ((i12 & i38) == 0) {
                                        unsafe3.putObject(obj4, j, ucdVar.c);
                                    } else {
                                        unsafe3.putObject(obj4, j, iqe.b(unsafe3.getObject(obj4, j), ucdVar.c));
                                    }
                                    int i50 = i12 | i38;
                                    i23 = i7;
                                    ucdVar3 = ucdVar;
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
                                    sweVar = sweVar2;
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
                                sweVar = sweVar2;
                                unsafe = unsafe2;
                                iArr = iArr2;
                                i9 = i31;
                                i4 = i13;
                                i26 = i12;
                                i5 = 0;
                                break;
                        }
                    } else {
                        ucd ucdVar4 = ucdVar3;
                        i8 = i30;
                        i11 = i7;
                        if (i36 == 27) {
                            if (i32 == 2) {
                                nre nreVar = (nre) unsafe3.getObject(obj4, j);
                                if (!nreVar.zza()) {
                                    int size = nreVar.size();
                                    nreVar = nreVar.zza(size == 0 ? 10 : size << 1);
                                    unsafe3.putObject(obj4, j, nreVar);
                                }
                                obj4 = obj;
                                i20 = i2;
                                ucdVar3 = ucdVar;
                                i21 = i4f.e(sweVar2.m(i11), i8, bArr, i29, i2, nreVar, ucdVar4);
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
                                sweVar = sweVar2;
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
                            h = sweVar2.i(obj, bArr, i29, i2, i8, i31, i32, i11, i35, i36, j, ucdVar);
                            obj4 = obj;
                            i8 = i8;
                            i22 = i31;
                            i11 = i11;
                            if (h == i29) {
                                sweVar = sweVar2;
                                obj2 = obj4;
                                i9 = i22;
                                i10 = h;
                            } else {
                                bArr4 = bArr;
                                i20 = i2;
                                ucdVar3 = ucdVar;
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
                                    sweVar2.o(obj3, i11, j);
                                    throw null;
                                }
                                sweVar = sweVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            } else {
                                i9 = i19;
                                h = sweVar2.h(obj3, bArr, i17, i2, i8, i9, i32, i35, i36, j, i11, ucdVar);
                                sweVar = sweVar2;
                                obj2 = obj3;
                                i11 = i11;
                                if (h == i17) {
                                    i10 = h;
                                } else {
                                    bArr4 = bArr;
                                    i20 = i2;
                                    ucdVar3 = ucdVar;
                                    i22 = i9;
                                    i21 = h;
                                    sweVar2 = sweVar;
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
                    ucdVar3 = ucdVar;
                    i20 = i2;
                    i22 = i9;
                    sweVar2 = sweVar;
                    i23 = i11;
                    i24 = i8;
                    i25 = i4;
                    i21 = i4f.c(i8, bArr4, i10, i2, B(obj2), ucdVar);
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
                sweVar = sweVar2;
                obj2 = obj4;
            }
        }
        int i51 = i4;
        if (i51 != 1048575) {
            unsafe.putInt(obj2, i51, i26);
        }
        for (int i52 = sweVar.h; i52 < sweVar.i; i52++) {
            int i53 = sweVar.g[i52];
            int i54 = iArr[i53];
            Object l = k2f.l(obj2, sweVar.y(i53) & 1048575);
            if (l != null && sweVar.w(i53) != null) {
                sweVar.m.getClass();
                dve dveVar = (dve) l;
                if (sweVar.t(i53) != null) {
                    rjb.p();
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

    public final zye m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        zye zyeVar = (zye) objArr[i2];
        if (zyeVar != null) {
            return zyeVar;
        }
        zye a = hye.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final void o(Object obj, int i, long j) {
        dve dveVar;
        Object t = t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.m.getClass();
        if (!((dve) object).a) {
            dve dveVar2 = dve.b;
            if (dveVar2.isEmpty()) {
                dveVar = new dve();
            } else {
                ?? linkedHashMap = new LinkedHashMap(dveVar2);
                linkedHashMap.a = true;
                dveVar = linkedHashMap;
            }
            lve.a(dveVar, object);
            unsafe.putObject(obj, j, dveVar);
        }
        if (t == null) {
            throw new NoSuchMethodError();
        }
        throw new ClassCastException();
    }

    public final void p(qpe qpeVar, qpe qpeVar2, int i) {
        long y = y(i) & 1048575;
        if (r(i, qpeVar2)) {
            Object l = k2f.l(qpeVar, y);
            Object l2 = k2f.l(qpeVar2, y);
            if (l != null && l2 != null) {
                k2f.d(qpeVar, y, iqe.b(l, l2));
                u(qpeVar, i);
            } else if (l2 != null) {
                k2f.d(qpeVar, y, l2);
                u(qpeVar, i);
            }
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        if (k2f.b(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final boolean r(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swe.r(int, java.lang.Object):boolean");
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

    public final void u(qpe qpeVar, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        k2f.c(qpeVar, k2f.b(qpeVar, j) | (1 << (i2 >>> 20)), j);
    }

    public final void v(qpe qpeVar, qpe qpeVar2, int i) {
        int[] iArr;
        Object obj;
        int y = y(i);
        int i2 = this.a[i];
        long j = y & 1048575;
        if (q(i2, i, qpeVar2)) {
            if (q(i2, i, qpeVar)) {
                obj = k2f.l(qpeVar, j);
            } else {
                obj = null;
            }
            Object l = k2f.l(qpeVar2, j);
            if (obj != null && l != null) {
                k2f.d(qpeVar, j, iqe.b(obj, l));
                k2f.c(qpeVar, i2, iArr[i + 2] & 1048575);
            } else if (l != null) {
                k2f.d(qpeVar, j, l);
                k2f.c(qpeVar, i2, iArr[i + 2] & 1048575);
            }
        }
    }

    public final e5e w(int i) {
        return (e5e) this.b[((i / 3) << 1) + 1];
    }

    public final boolean x(qpe qpeVar, qpe qpeVar2, int i) {
        if (r(i, qpeVar) == r(i, qpeVar2)) {
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
        return ((qpe) this.e).d(4);
    }

    @Override
    public final int zzb(Object obj) {
        o1f o1fVar;
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
        o1f o1fVar2 = this.l;
        lve lveVar = this.m;
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
                if (i12 >= aoe.b.a && i12 <= aoe.c.a) {
                    int i16 = iArr2[i10 + 2];
                }
                switch (i12) {
                    case 0:
                        if (r(i10, obj)) {
                            i11 = mle.a(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i10, obj)) {
                            i11 = mle.a(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i10, obj)) {
                            long g = k2f.g(obj, j);
                            t4 = nle.t(i14 << 3);
                            o3 = nle.o(g);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i10, obj)) {
                            n2 = nle.n(i14, k2f.g(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i10, obj)) {
                            int b = k2f.b(obj, j);
                            t4 = nle.t(i14 << 3);
                            o3 = nle.p(b);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i10, obj)) {
                            n2 = nle.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i10, obj)) {
                            n2 = nle.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i10, obj)) {
                            i11 = mle.a(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i10, obj)) {
                            Object l = k2f.l(obj, j);
                            if (l instanceof tke) {
                                n2 = nle.i(i14, (tke) l);
                                i11 += n2;
                                break;
                            } else {
                                t4 = nle.t(i14 << 3);
                                o3 = nle.f((String) l);
                                i11 += o3 + t4;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i10, obj)) {
                            n2 = hze.a(i14, k2f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i10, obj)) {
                            n2 = nle.i(i14, (tke) k2f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i10, obj)) {
                            n2 = nle.s(i14, k2f.b(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i10, obj)) {
                            int b2 = k2f.b(obj, j);
                            t4 = nle.t(i14 << 3);
                            o3 = nle.p(b2);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i10, obj)) {
                            i11 = mle.a(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i10, obj)) {
                            i11 = mle.a(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i10, obj)) {
                            n2 = nle.u(i14, k2f.b(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i10, obj)) {
                            n2 = nle.q(i14, k2f.g(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i10, obj)) {
                            n2 = nle.h(i14, (rfe) k2f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        n2 = hze.C(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 19:
                        n2 = hze.z(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 20:
                        List list = (List) k2f.l(obj, j);
                        Class cls = hze.a;
                        if (list.size() != 0) {
                            n2 = mle.e(i14, list.size(), hze.c(list));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 21:
                        List list2 = (List) k2f.l(obj, j);
                        Class cls2 = hze.a;
                        int size = list2.size();
                        if (size != 0) {
                            n2 = mle.e(i14, size, hze.k(list2));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 22:
                        List list3 = (List) k2f.l(obj, j);
                        Class cls3 = hze.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            n2 = mle.e(i14, size2, hze.t(list3));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 23:
                        n2 = hze.C(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 24:
                        n2 = hze.z(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 25:
                        Class cls4 = hze.a;
                        int size3 = ((List) k2f.l(obj, j)).size();
                        if (size3 != 0) {
                            n2 = (nle.t(i14 << 3) + 1) * size3;
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 26:
                        n2 = hze.j(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 27:
                        n2 = hze.b(i14, (List) k2f.l(obj, j), m(i10));
                        i11 += n2;
                        break;
                    case 28:
                        n2 = hze.o(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 29:
                        List list4 = (List) k2f.l(obj, j);
                        Class cls5 = hze.a;
                        int size4 = list4.size();
                        if (size4 != 0) {
                            n2 = mle.e(i14, size4, hze.v(list4));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 30:
                        List list5 = (List) k2f.l(obj, j);
                        Class cls6 = hze.a;
                        int size5 = list5.size();
                        if (size5 != 0) {
                            n2 = mle.e(i14, size5, hze.r(list5));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 31:
                        n2 = hze.z(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 32:
                        n2 = hze.C(i14, (List) k2f.l(obj, j));
                        i11 += n2;
                        break;
                    case 33:
                        List list6 = (List) k2f.l(obj, j);
                        Class cls7 = hze.a;
                        int size6 = list6.size();
                        if (size6 != 0) {
                            n2 = mle.e(i14, size6, hze.x(list6));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 34:
                        List list7 = (List) k2f.l(obj, j);
                        Class cls8 = hze.a;
                        int size7 = list7.size();
                        if (size7 != 0) {
                            n2 = mle.e(i14, size7, hze.p(list7));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 35:
                        int D = hze.D((List) unsafe.getObject(obj, j));
                        if (D > 0) {
                            i11 = mle.b(D, nle.m(i14), D, i11);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int A = hze.A((List) unsafe.getObject(obj, j));
                        if (A > 0) {
                            i11 = mle.b(A, nle.m(i14), A, i11);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int c = hze.c((List) unsafe.getObject(obj, j));
                        if (c > 0) {
                            i11 = mle.b(c, nle.m(i14), c, i11);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int k = hze.k((List) unsafe.getObject(obj, j));
                        if (k > 0) {
                            i11 = mle.b(k, nle.m(i14), k, i11);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int t5 = hze.t((List) unsafe.getObject(obj, j));
                        if (t5 > 0) {
                            i11 = mle.b(t5, nle.m(i14), t5, i11);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int D2 = hze.D((List) unsafe.getObject(obj, j));
                        if (D2 > 0) {
                            i11 = mle.b(D2, nle.m(i14), D2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int A2 = hze.A((List) unsafe.getObject(obj, j));
                        if (A2 > 0) {
                            i11 = mle.b(A2, nle.m(i14), A2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls9 = hze.a;
                        int size8 = ((List) unsafe.getObject(obj, j)).size();
                        if (size8 > 0) {
                            i11 = mle.b(size8, nle.m(i14), size8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v = hze.v((List) unsafe.getObject(obj, j));
                        if (v > 0) {
                            i11 = mle.b(v, nle.m(i14), v, i11);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int r = hze.r((List) unsafe.getObject(obj, j));
                        if (r > 0) {
                            i11 = mle.b(r, nle.m(i14), r, i11);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int A3 = hze.A((List) unsafe.getObject(obj, j));
                        if (A3 > 0) {
                            i11 = mle.b(A3, nle.m(i14), A3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int D3 = hze.D((List) unsafe.getObject(obj, j));
                        if (D3 > 0) {
                            i11 = mle.b(D3, nle.m(i14), D3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int x = hze.x((List) unsafe.getObject(obj, j));
                        if (x > 0) {
                            i11 = mle.b(x, nle.m(i14), x, i11);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p = hze.p((List) unsafe.getObject(obj, j));
                        if (p > 0) {
                            i11 = mle.b(p, nle.m(i14), p, i11);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list8 = (List) k2f.l(obj, j);
                        zye m = m(i10);
                        Class cls10 = hze.a;
                        int size9 = list8.size();
                        if (size9 == 0) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            for (int i17 = 0; i17 < size9; i17++) {
                                i6 = nle.h(i14, (rfe) list8.get(i17), m) + i6;
                            }
                        }
                        i11 = i6 + i11;
                        break;
                    case 50:
                        Object l2 = k2f.l(obj, j);
                        Object t6 = t(i10);
                        lveVar.getClass();
                        lve.b(l2, t6);
                        break;
                    case 51:
                        if (q(i14, i10, obj)) {
                            i11 = mle.a(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(i14, i10, obj)) {
                            i11 = mle.a(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(i14, i10, obj)) {
                            long A4 = A(obj, j);
                            t4 = nle.t(i14 << 3);
                            o3 = nle.o(A4);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(i14, i10, obj)) {
                            n2 = nle.n(i14, A(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(i14, i10, obj)) {
                            int z2 = z(obj, j);
                            t4 = nle.t(i14 << 3);
                            o3 = nle.p(z2);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i14, i10, obj)) {
                            n2 = nle.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(i14, i10, obj)) {
                            n2 = nle.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(i14, i10, obj)) {
                            i11 = mle.a(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(i14, i10, obj)) {
                            Object l3 = k2f.l(obj, j);
                            if (l3 instanceof tke) {
                                n2 = nle.i(i14, (tke) l3);
                                i11 += n2;
                                break;
                            } else {
                                t4 = nle.t(i14 << 3);
                                o3 = nle.f((String) l3);
                                i11 += o3 + t4;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (q(i14, i10, obj)) {
                            n2 = hze.a(i14, k2f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(i14, i10, obj)) {
                            n2 = nle.i(i14, (tke) k2f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(i14, i10, obj)) {
                            n2 = nle.s(i14, z(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(i14, i10, obj)) {
                            int z3 = z(obj, j);
                            t4 = nle.t(i14 << 3);
                            o3 = nle.p(z3);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i14, i10, obj)) {
                            i11 = mle.a(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i14, i10, obj)) {
                            i11 = mle.a(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(i14, i10, obj)) {
                            n2 = nle.u(i14, z(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(i14, i10, obj)) {
                            n2 = nle.q(i14, A(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(i14, i10, obj)) {
                            n2 = nle.h(i14, (rfe) k2f.l(obj, j), m(i10));
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
            o1fVar2.getClass();
            return ((qpe) obj).zzb.d() + i11;
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
                o1fVar = o1fVar2;
                if (i26 != i18) {
                    i21 = unsafe.getInt(obj, i26);
                    i18 = i26;
                }
            } else {
                o1fVar = o1fVar2;
                i = 0;
            }
            long j2 = y2 & 1048575;
            switch (i23) {
                case 0:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = mle.a(i22 << 3, 8, i20);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = mle.a(i22 << 3, 4, i20);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = nle.o(unsafe.getLong(obj, j2)) + nle.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = nle.n(i22, unsafe.getLong(obj, j2));
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = nle.p(unsafe.getInt(obj, j2)) + nle.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = nle.r(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = nle.v(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i & i21) != 0) {
                        i2 = 1;
                        i20 = mle.a(i22 << 3, 1, i20);
                        break;
                    }
                    i2 = 1;
                    break;
                case 8:
                    if ((i & i21) != 0) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof tke) {
                            i3 = nle.i(i22, (tke) object);
                            i20 += i3;
                        } else {
                            t = nle.t(i22 << 3);
                            f = nle.f((String) object);
                            i3 = f + t;
                            i20 += i3;
                        }
                    }
                    i2 = 1;
                    break;
                case 9:
                    if ((i & i21) != 0) {
                        i3 = hze.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 10:
                    if ((i & i21) != 0) {
                        i3 = nle.i(i22, (tke) unsafe.getObject(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 11:
                    if ((i & i21) != 0) {
                        i3 = nle.s(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 12:
                    if ((i & i21) != 0) {
                        int i27 = unsafe.getInt(obj, j2);
                        t = nle.t(i22 << 3);
                        f = nle.p(i27);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 13:
                    if ((i & i21) != 0) {
                        i20 = mle.a(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 14:
                    if ((i & i21) != 0) {
                        i20 = mle.a(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 15:
                    if ((i & i21) != 0) {
                        i3 = nle.u(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 16:
                    if ((i & i21) != 0) {
                        i3 = nle.q(i22, unsafe.getLong(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 17:
                    if ((i & i21) != 0) {
                        i3 = nle.h(i22, (rfe) unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 18:
                    i3 = hze.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 19:
                    i3 = hze.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 20:
                    List list9 = (List) unsafe.getObject(obj, j2);
                    Class cls11 = hze.a;
                    if (list9.size() != 0) {
                        i3 = mle.e(i22, list9.size(), hze.c(list9));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 21:
                    List list10 = (List) unsafe.getObject(obj, j2);
                    Class cls12 = hze.a;
                    int size10 = list10.size();
                    if (size10 != 0) {
                        i3 = mle.e(i22, size10, hze.k(list10));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 22:
                    List list11 = (List) unsafe.getObject(obj, j2);
                    Class cls13 = hze.a;
                    int size11 = list11.size();
                    if (size11 != 0) {
                        i3 = mle.e(i22, size11, hze.t(list11));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 23:
                    i3 = hze.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 24:
                    i3 = hze.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 25:
                    Class cls14 = hze.a;
                    int size12 = ((List) unsafe.getObject(obj, j2)).size();
                    if (size12 == 0) {
                        t2 = 0;
                    } else {
                        t2 = (nle.t(i22 << 3) + 1) * size12;
                    }
                    i20 += t2;
                    i2 = 1;
                    break;
                case 26:
                    i3 = hze.j(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 27:
                    i3 = hze.b(i22, (List) unsafe.getObject(obj, j2), m(i19));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 28:
                    i3 = hze.o(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 29:
                    List list12 = (List) unsafe.getObject(obj, j2);
                    Class cls15 = hze.a;
                    int size13 = list12.size();
                    if (size13 != 0) {
                        i3 = mle.e(i22, size13, hze.v(list12));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 30:
                    List list13 = (List) unsafe.getObject(obj, j2);
                    Class cls16 = hze.a;
                    int size14 = list13.size();
                    if (size14 != 0) {
                        i3 = mle.e(i22, size14, hze.r(list13));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 31:
                    i3 = hze.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 32:
                    i3 = hze.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 33:
                    List list14 = (List) unsafe.getObject(obj, j2);
                    Class cls17 = hze.a;
                    int size15 = list14.size();
                    if (size15 != 0) {
                        i3 = mle.e(i22, size15, hze.x(list14));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 34:
                    List list15 = (List) unsafe.getObject(obj, j2);
                    Class cls18 = hze.a;
                    int size16 = list15.size();
                    if (size16 != 0) {
                        i3 = mle.e(i22, size16, hze.p(list15));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 35:
                    int D4 = hze.D((List) unsafe.getObject(obj, j2));
                    if (D4 > 0) {
                        i20 = mle.b(D4, nle.m(i22), D4, i20);
                    }
                    i2 = 1;
                    break;
                case 36:
                    int A5 = hze.A((List) unsafe.getObject(obj, j2));
                    if (A5 > 0) {
                        i20 = mle.b(A5, nle.m(i22), A5, i20);
                    }
                    i2 = 1;
                    break;
                case 37:
                    int c2 = hze.c((List) unsafe.getObject(obj, j2));
                    if (c2 > 0) {
                        i20 = mle.b(c2, nle.m(i22), c2, i20);
                    }
                    i2 = 1;
                    break;
                case 38:
                    int k2 = hze.k((List) unsafe.getObject(obj, j2));
                    if (k2 > 0) {
                        i20 = mle.b(k2, nle.m(i22), k2, i20);
                    }
                    i2 = 1;
                    break;
                case 39:
                    int t7 = hze.t((List) unsafe.getObject(obj, j2));
                    if (t7 > 0) {
                        i20 = mle.b(t7, nle.m(i22), t7, i20);
                    }
                    i2 = 1;
                    break;
                case 40:
                    int D5 = hze.D((List) unsafe.getObject(obj, j2));
                    if (D5 > 0) {
                        i20 = mle.b(D5, nle.m(i22), D5, i20);
                    }
                    i2 = 1;
                    break;
                case 41:
                    int A6 = hze.A((List) unsafe.getObject(obj, j2));
                    if (A6 > 0) {
                        i20 = mle.b(A6, nle.m(i22), A6, i20);
                    }
                    i2 = 1;
                    break;
                case 42:
                    Class cls19 = hze.a;
                    int size17 = ((List) unsafe.getObject(obj, j2)).size();
                    if (size17 > 0) {
                        i20 = mle.b(size17, nle.m(i22), size17, i20);
                    }
                    i2 = 1;
                    break;
                case 43:
                    int v2 = hze.v((List) unsafe.getObject(obj, j2));
                    if (v2 > 0) {
                        i20 = mle.b(v2, nle.m(i22), v2, i20);
                    }
                    i2 = 1;
                    break;
                case 44:
                    int r2 = hze.r((List) unsafe.getObject(obj, j2));
                    if (r2 > 0) {
                        i20 = mle.b(r2, nle.m(i22), r2, i20);
                    }
                    i2 = 1;
                    break;
                case 45:
                    int A7 = hze.A((List) unsafe.getObject(obj, j2));
                    if (A7 > 0) {
                        i20 = mle.b(A7, nle.m(i22), A7, i20);
                    }
                    i2 = 1;
                    break;
                case 46:
                    int D6 = hze.D((List) unsafe.getObject(obj, j2));
                    if (D6 > 0) {
                        i20 = mle.b(D6, nle.m(i22), D6, i20);
                    }
                    i2 = 1;
                    break;
                case 47:
                    int x2 = hze.x((List) unsafe.getObject(obj, j2));
                    if (x2 > 0) {
                        i20 = mle.b(x2, nle.m(i22), x2, i20);
                    }
                    i2 = 1;
                    break;
                case 48:
                    int p2 = hze.p((List) unsafe.getObject(obj, j2));
                    if (p2 > 0) {
                        i20 = mle.b(p2, nle.m(i22), p2, i20);
                    }
                    i2 = 1;
                    break;
                case 49:
                    List list16 = (List) unsafe.getObject(obj, j2);
                    zye m2 = m(i19);
                    Class cls20 = hze.a;
                    int size18 = list16.size();
                    if (size18 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i28 = 0; i28 < size18; i28++) {
                            i4 += nle.h(i22, (rfe) list16.get(i28), m2);
                        }
                    }
                    i20 += i4;
                    i2 = 1;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    Object t8 = t(i19);
                    lveVar.getClass();
                    lve.b(object2, t8);
                    i2 = 1;
                    break;
                case 51:
                    if (q(i22, i19, obj)) {
                        i20 = mle.a(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 52:
                    if (q(i22, i19, obj)) {
                        i20 = mle.a(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 53:
                    if (q(i22, i19, obj)) {
                        i3 = nle.o(A(obj, j2)) + nle.t(i22 << 3);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 54:
                    if (q(i22, i19, obj)) {
                        i3 = nle.n(i22, A(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 55:
                    if (q(i22, i19, obj)) {
                        int z4 = z(obj, j2);
                        t = nle.t(i22 << 3);
                        f = nle.p(z4);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 56:
                    if (q(i22, i19, obj)) {
                        i3 = nle.r(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 57:
                    if (q(i22, i19, obj)) {
                        i3 = nle.v(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 58:
                    if (q(i22, i19, obj)) {
                        i20 = mle.a(i22 << 3, i24, i20);
                        i2 = i24;
                        break;
                    }
                    i2 = 1;
                    break;
                case 59:
                    if (q(i22, i19, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof tke) {
                            i5 = nle.i(i22, (tke) object3);
                            i20 += i5;
                        } else {
                            t3 = nle.t(i22 << 3);
                            f2 = nle.f((String) object3);
                            i5 = f2 + t3;
                            i20 += i5;
                        }
                    }
                    i2 = i24;
                    break;
                case 60:
                    if (q(i22, i19, obj)) {
                        i5 = hze.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 61:
                    if (q(i22, i19, obj)) {
                        i5 = nle.i(i22, (tke) unsafe.getObject(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 62:
                    if (q(i22, i19, obj)) {
                        i5 = nle.s(i22, z(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 63:
                    if (q(i22, i19, obj)) {
                        int z5 = z(obj, j2);
                        t3 = nle.t(i22 << 3);
                        f2 = nle.p(z5);
                        i5 = f2 + t3;
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 64:
                    if (q(i22, i19, obj)) {
                        i20 = mle.a(i22 << 3, 4, i20);
                    }
                    i2 = i24;
                    break;
                case 65:
                    if (q(i22, i19, obj)) {
                        i20 = mle.a(i22 << 3, 8, i20);
                    }
                    i2 = i24;
                    break;
                case 66:
                    if (q(i22, i19, obj)) {
                        i5 = nle.u(i22, z(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 67:
                    if (q(i22, i19, obj)) {
                        i5 = nle.q(i22, A(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 68:
                    if (q(i22, i19, obj)) {
                        i5 = nle.h(i22, (rfe) unsafe.getObject(obj, j2), m(i19));
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
            o1fVar2 = o1fVar;
        }
        o1fVar2.getClass();
        return ((qpe) obj).zzb.d() + i20;
    }
}
