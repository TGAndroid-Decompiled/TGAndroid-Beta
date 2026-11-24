package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;
public final class que implements xwe {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final qde e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final tve j;
    public final zqe k;
    public final mze l;
    public final ite m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public que(int[] iArr, Object[] objArr, int i, int i2, qde qdeVar, boolean z, int[] iArr2, int i3, int i4, tve tveVar, zqe zqeVar, mze mzeVar, wke wkeVar, ite iteVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = tveVar;
        this.k = zqeVar;
        this.l = mzeVar;
        this.e = qdeVar;
        this.m = iteVar;
    }

    public static long A(Object obj, long j) {
        return ((Long) i0f.l(obj, j)).longValue();
    }

    public static qze B(Object obj) {
        nne nneVar = (nne) obj;
        qze qzeVar = nneVar.zzb;
        if (qzeVar == qze.f) {
            qze b = qze.b();
            nneVar.zzb = b;
            return b;
        }
        return qzeVar;
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
            wn4.j(b00.j(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    public static defpackage.que l(defpackage.swe r33, defpackage.tve r34, defpackage.zqe r35, defpackage.mze r36, defpackage.wke r37, defpackage.ite r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.l(swe, tve, zqe, mze, wke, ite):que");
    }

    public static void n(int i, Object obj, g6e g6eVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            lje ljeVar = (lje) g6eVar.b;
            ljeVar.c(i, 2);
            byte[] bArr = ljeVar.b;
            int i2 = ljeVar.d;
            try {
                int t = lje.t(str.length() * 3);
                int t2 = lje.t(str.length());
                if (t2 == t) {
                    int i3 = i2 + t2;
                    ljeVar.d = i3;
                    int b = q0f.a.b(str, bArr, i3, ljeVar.e());
                    ljeVar.d = i2;
                    ljeVar.g((b - i2) - t2);
                    ljeVar.d = b;
                    return;
                }
                ljeVar.g(q0f.a(str));
                ljeVar.d = q0f.a.b(str, bArr, ljeVar.d, ljeVar.e());
                return;
            } catch (IndexOutOfBoundsException e) {
                throw new mje(e);
            } catch (z0f e2) {
                ljeVar.d = i2;
                lje.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                byte[] bytes = str.getBytes(foe.a);
                try {
                    ljeVar.g(bytes.length);
                    ljeVar.k(bytes, 0, bytes.length);
                    return;
                } catch (IndexOutOfBoundsException e3) {
                    throw new mje(e3);
                } catch (mje e4) {
                    throw e4;
                }
            }
        }
        g6eVar.b(i, (sie) obj);
    }

    public static int z(Object obj, long j) {
        return ((Integer) i0f.l(obj, j)).intValue();
    }

    @Override
    public final boolean a(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.a(java.lang.Object):boolean");
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
            Object l = i0f.l(obj, y);
            if (l != null) {
                this.m.getClass();
                ((ate) l).a = false;
                i0f.d(obj, y, l);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.k.b(obj, iArr[i]);
            i++;
        }
        this.l.getClass();
        ((nne) obj).zzb.e = false;
    }

    @Override
    public final void c(Object obj, byte[] bArr, int i, int i2, sad sadVar) {
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
        que queVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i16 = i2;
        sad sadVar2 = sadVar;
        if (queVar.f) {
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
                        i22 = g2f.d(i23, bArr2, i22, sadVar2);
                        i23 = sadVar2.a;
                    }
                    int i24 = i22;
                    int i25 = i23 >>> 3;
                    int i26 = i23 & 7;
                    int i27 = queVar.d;
                    int i28 = queVar.c;
                    if (i25 > i18) {
                        int i29 = i19 / 3;
                        if (i25 >= i28 && i25 <= i27) {
                            i4 = queVar.s(i25, i29);
                        } else {
                            i4 = -1;
                        }
                        i3 = 0;
                    } else if (i25 >= i28 && i25 <= i27) {
                        i3 = 0;
                        i4 = queVar.s(i25, 0);
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
                        int[] iArr = queVar.a;
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
                                        i0f.c.m(obj5, j, Double.longBitsToDouble(g2f.j(i24, bArr2)));
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
                                        i0f.c.n(obj5, j, Float.intBitsToFloat(g2f.a(i24, bArr2)));
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
                                        i11 = g2f.i(bArr2, i24, sadVar2);
                                        unsafe.putLong(obj5, j, sadVar2.b);
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
                                        int h = g2f.h(bArr2, i24, sadVar2);
                                        unsafe.putInt(obj5, j, sadVar2.a);
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
                                        unsafe.putLong(obj5, j, g2f.j(i24, bArr2));
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
                                        unsafe.putInt(obj5, j, g2f.a(i24, bArr2));
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
                                        i17 = g2f.i(bArr2, i24, sadVar2);
                                        if (sadVar2.b != 0) {
                                            z = i9;
                                        } else {
                                            z = false;
                                        }
                                        i0f.c.o(obj5, j, z);
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
                                            i17 = g2f.k(bArr2, i24, sadVar2);
                                        } else {
                                            i17 = g2f.l(bArr2, i24, sadVar2);
                                        }
                                        unsafe.putObject(obj5, j, sadVar2.c);
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
                                        i17 = g2f.g(queVar.m(i30), bArr2, i24, i16, sadVar2);
                                        Object object = unsafe.getObject(obj5, j);
                                        Object obj6 = sadVar2.c;
                                        if (object == null) {
                                            unsafe.putObject(obj5, j, obj6);
                                        } else {
                                            unsafe.putObject(obj5, j, foe.b(object, obj6));
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
                                        i17 = g2f.m(bArr2, i24, sadVar2);
                                        unsafe.putObject(obj5, j, sadVar2.c);
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
                                        i17 = g2f.h(bArr2, i24, sadVar2);
                                        unsafe.putInt(obj5, j, sadVar2.a);
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
                                        i17 = g2f.h(bArr2, i24, sadVar2);
                                        unsafe.putInt(obj5, j, o2f.a(sadVar2.a));
                                        i21 |= i35;
                                        i19 = i30;
                                        i18 = i10;
                                        break;
                                    }
                                case 16:
                                    if (i26 == 0) {
                                        i11 = g2f.i(bArr2, i24, sadVar2);
                                        long j2 = sadVar2.b;
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
                                    kpe kpeVar = (kpe) unsafe.getObject(obj7, j);
                                    if (!kpeVar.zza()) {
                                        int size = kpeVar.size();
                                        if (size == 0) {
                                            i14 = 10;
                                        } else {
                                            i14 = size << 1;
                                        }
                                        kpeVar = kpeVar.zza(i14);
                                        unsafe.putObject(obj7, j, kpeVar);
                                    }
                                    i17 = g2f.e(queVar.m(i30), i33, bArr2, i24, i16, kpeVar, sadVar2);
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i16 = i2;
                                    sadVar2 = sadVar;
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
                                    i15 = queVar.i(obj, bArr, i24, i2, i5, i25, i26, i30, i31, i32, j, sadVar);
                                    obj5 = obj;
                                    i8 = i30;
                                    if (i15 == i24) {
                                        obj2 = obj5;
                                        i7 = i15;
                                    } else {
                                        i16 = i2;
                                        sadVar2 = sadVar;
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
                                            queVar.o(obj4, i8, j);
                                            throw null;
                                        }
                                    } else {
                                        i15 = queVar.h(obj4, bArr, i12, i2, i5, i25, i26, i31, i32, j, i8, sadVar);
                                        obj2 = obj4;
                                        if (i15 == i12) {
                                            i7 = i15;
                                        } else {
                                            queVar = this;
                                            sadVar2 = sadVar;
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
                    sadVar2 = sadVar;
                    i17 = g2f.c(i5, bArr, i7, i2, B(obj2), sadVar);
                    obj5 = obj2;
                    i19 = i8;
                    i21 = i6;
                    queVar = this;
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
            j(obj5, bArr, i, i16, 0, sadVar);
        }
    }

    @Override
    public final void d(Object obj, g6e g6eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        g6eVar.getClass();
        lje ljeVar = (lje) g6eVar.b;
        boolean z = this.f;
        mze mzeVar = this.l;
        ite iteVar = this.m;
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
                            long doubleToRawLongBits = Double.doubleToRawLongBits(i0f.c.t(obj, y & 1048575));
                            ljeVar.c(i8, 1);
                            ljeVar.j(doubleToRawLongBits);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i7, obj)) {
                            int floatToRawIntBits = Float.floatToRawIntBits(i0f.c.r(obj, y & 1048575));
                            ljeVar.c(i8, 5);
                            ljeVar.l(floatToRawIntBits);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i7, obj)) {
                            long g = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(g);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i7, obj)) {
                            long g2 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(g2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i7, obj)) {
                            int b = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(b);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i7, obj)) {
                            long g3 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(g3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i7, obj)) {
                            int b2 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(b2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i7, obj)) {
                            boolean q = i0f.c.q(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.a(q ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i7, obj)) {
                            n(i8, i0f.l(obj, y & 1048575), g6eVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i7, obj)) {
                            g6eVar.a(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i7, obj)) {
                            g6eVar.b(i8, (sie) i0f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i7, obj)) {
                            int b3 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g(b3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i7, obj)) {
                            int b4 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(b4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i7, obj)) {
                            int b5 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(b5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i7, obj)) {
                            long g4 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(g4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i7, obj)) {
                            int b6 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g((b6 << 1) ^ (b6 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i7, obj)) {
                            long g5 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d((g5 << 1) ^ (g5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i7, obj)) {
                            g6eVar.c(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        fxe.g(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 19:
                        fxe.n(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 20:
                        fxe.q(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 21:
                        fxe.s(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 22:
                        fxe.B(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 23:
                        fxe.w(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 24:
                        fxe.G(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 25:
                        fxe.J(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 26:
                        fxe.e(i8, (List) i0f.l(obj, y & 1048575), g6eVar);
                        break;
                    case 27:
                        fxe.f(i8, (List) i0f.l(obj, y & 1048575), g6eVar, m(i7));
                        break;
                    case 28:
                        fxe.l(i8, (List) i0f.l(obj, y & 1048575), g6eVar);
                        break;
                    case 29:
                        fxe.E(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 30:
                        fxe.I(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 31:
                        fxe.H(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 32:
                        fxe.y(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 33:
                        fxe.F(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 34:
                        fxe.u(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 35:
                        fxe.g(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 36:
                        fxe.n(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 37:
                        fxe.q(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 38:
                        fxe.s(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 39:
                        fxe.B(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 40:
                        fxe.w(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 41:
                        fxe.G(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 42:
                        fxe.J(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 43:
                        fxe.E(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 44:
                        fxe.I(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 45:
                        fxe.H(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 46:
                        fxe.y(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 47:
                        fxe.F(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 48:
                        fxe.u(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 49:
                        fxe.m(i8, (List) i0f.l(obj, y & 1048575), g6eVar, m(i7));
                        break;
                    case 50:
                        if (i0f.l(obj, y & 1048575) != null) {
                            Object t = t(i7);
                            iteVar.getClass();
                            if (t != null) {
                                fyb.g();
                                return;
                            }
                            throw new NoSuchMethodError();
                        }
                        break;
                    case 51:
                        if (q(i8, i7, obj)) {
                            long doubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) i0f.l(obj, y & 1048575)).doubleValue());
                            ljeVar.c(i8, 1);
                            ljeVar.j(doubleToRawLongBits2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(i8, i7, obj)) {
                            int floatToRawIntBits2 = Float.floatToRawIntBits(((Float) i0f.l(obj, y & 1048575)).floatValue());
                            ljeVar.c(i8, 5);
                            ljeVar.l(floatToRawIntBits2);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(i8, i7, obj)) {
                            long A = A(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(A);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(i8, i7, obj)) {
                            long A2 = A(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(A2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(i8, i7, obj)) {
                            int z2 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(z2);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i8, i7, obj)) {
                            long A3 = A(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(A3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(i8, i7, obj)) {
                            int z3 = z(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(z3);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(i8, i7, obj)) {
                            boolean booleanValue = ((Boolean) i0f.l(obj, y & 1048575)).booleanValue();
                            ljeVar.c(i8, 0);
                            ljeVar.a(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(i8, i7, obj)) {
                            n(i8, i0f.l(obj, y & 1048575), g6eVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (q(i8, i7, obj)) {
                            g6eVar.a(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(i8, i7, obj)) {
                            g6eVar.b(i8, (sie) i0f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(i8, i7, obj)) {
                            int z4 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g(z4);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(i8, i7, obj)) {
                            int z5 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(z5);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i8, i7, obj)) {
                            int z6 = z(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(z6);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i8, i7, obj)) {
                            long A4 = A(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(A4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(i8, i7, obj)) {
                            int z7 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g((z7 << 1) ^ (z7 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(i8, i7, obj)) {
                            long A5 = A(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d((A5 << 1) ^ (A5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(i8, i7, obj)) {
                            g6eVar.c(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            mzeVar.getClass();
            ((nne) obj).zzb.c(g6eVar);
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
            mze mzeVar2 = mzeVar;
            long j = y2 & i13;
            switch (i14) {
                case 0:
                    if ((i10 & i18) != 0) {
                        long doubleToRawLongBits3 = Double.doubleToRawLongBits(i0f.c.t(obj, j));
                        i3 = 1;
                        ljeVar.c(i12, 1);
                        ljeVar.j(doubleToRawLongBits3);
                        break;
                    }
                    i3 = 1;
                    break;
                case 1:
                    if ((i10 & i18) != 0) {
                        int floatToRawIntBits3 = Float.floatToRawIntBits(i0f.c.r(obj, j));
                        ljeVar.c(i12, 5);
                        ljeVar.l(floatToRawIntBits3);
                    }
                    i3 = 1;
                    break;
                case 2:
                    if ((i10 & i18) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(j2);
                    }
                    i3 = 1;
                    break;
                case 3:
                    if ((i10 & i18) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(j3);
                    }
                    i3 = 1;
                    break;
                case 4:
                    if ((i10 & i18) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(i19);
                    }
                    i3 = 1;
                    break;
                case 5:
                    if ((i10 & i18) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 1);
                        ljeVar.j(j4);
                    }
                    i3 = 1;
                    break;
                case 6:
                    if ((i10 & i18) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(i20);
                    }
                    i3 = 1;
                    break;
                case 7:
                    if ((i10 & i18) != 0) {
                        boolean q2 = i0f.c.q(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.a(q2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    break;
                case 8:
                    if ((i10 & i18) != 0) {
                        n(i12, unsafe.getObject(obj, j), g6eVar);
                    }
                    i3 = 1;
                    break;
                case 9:
                    if ((i10 & i18) != 0) {
                        g6eVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 10:
                    if ((i10 & i18) != 0) {
                        g6eVar.b(i12, (sie) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    break;
                case 11:
                    if ((i10 & i18) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g(i21);
                    }
                    i3 = 1;
                    break;
                case 12:
                    if ((i10 & i18) != 0) {
                        int i22 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(i22);
                    }
                    i3 = 1;
                    break;
                case 13:
                    if ((i10 & i18) != 0) {
                        int i23 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(i23);
                    }
                    i3 = 1;
                    break;
                case 14:
                    if ((i10 & i18) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 1);
                        ljeVar.j(j5);
                    }
                    i3 = 1;
                    break;
                case 15:
                    if ((i10 & i18) != 0) {
                        int i24 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g((i24 << 1) ^ (i24 >> 31));
                    }
                    i3 = 1;
                    break;
                case 16:
                    if ((i10 & i18) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d((j6 << 1) ^ (j6 >> 63));
                    }
                    i3 = 1;
                    break;
                case 17:
                    if ((i10 & i18) != 0) {
                        g6eVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 18:
                    fxe.g(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 19:
                    fxe.n(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 20:
                    fxe.q(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 21:
                    fxe.s(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 22:
                    fxe.B(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 23:
                    fxe.w(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 24:
                    fxe.G(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 25:
                    fxe.J(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 26:
                    fxe.e(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar);
                    i3 = 1;
                    break;
                case 27:
                    fxe.f(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, m(i9));
                    i3 = 1;
                    break;
                case 28:
                    fxe.l(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar);
                    i3 = 1;
                    break;
                case 29:
                    fxe.E(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 30:
                    fxe.I(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 31:
                    fxe.H(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 32:
                    fxe.y(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 33:
                    fxe.F(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 34:
                    fxe.u(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    break;
                case 35:
                    boolean z8 = i15;
                    fxe.g(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z8);
                    i4 = z8;
                    i3 = i4;
                    break;
                case 36:
                    boolean z9 = i15;
                    fxe.n(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z9);
                    i4 = z9;
                    i3 = i4;
                    break;
                case 37:
                    boolean z10 = i15;
                    fxe.q(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z10);
                    i4 = z10;
                    i3 = i4;
                    break;
                case 38:
                    boolean z11 = i15;
                    fxe.s(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z11);
                    i4 = z11;
                    i3 = i4;
                    break;
                case 39:
                    boolean z12 = i15;
                    fxe.B(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z12);
                    i4 = z12;
                    i3 = i4;
                    break;
                case 40:
                    boolean z13 = i15;
                    fxe.w(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z13);
                    i4 = z13;
                    i3 = i4;
                    break;
                case 41:
                    boolean z14 = i15;
                    fxe.G(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z14);
                    i4 = z14;
                    i3 = i4;
                    break;
                case 42:
                    boolean z15 = i15;
                    fxe.J(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z15);
                    i4 = z15;
                    i3 = i4;
                    break;
                case 43:
                    boolean z16 = i15;
                    fxe.E(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z16);
                    i4 = z16;
                    i3 = i4;
                    break;
                case 44:
                    boolean z17 = i15;
                    fxe.I(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z17);
                    i4 = z17;
                    i3 = i4;
                    break;
                case 45:
                    boolean z18 = i15;
                    fxe.H(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z18);
                    i4 = z18;
                    i3 = i4;
                    break;
                case 46:
                    boolean z19 = i15;
                    fxe.y(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z19);
                    i4 = z19;
                    i3 = i4;
                    break;
                case 47:
                    boolean z20 = i15;
                    fxe.F(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z20);
                    i4 = z20;
                    i3 = i4;
                    break;
                case 48:
                    i4 = 1;
                    fxe.u(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, true);
                    i3 = i4;
                    break;
                case 49:
                    fxe.m(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, m(i9));
                    i3 = 1;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object t2 = t(i9);
                        iteVar.getClass();
                        if (t2 != null) {
                            fyb.g();
                            return;
                        }
                        throw new NoSuchMethodError();
                    }
                    i3 = 1;
                    break;
                case 51:
                    if (q(i12, i9, obj)) {
                        long doubleToRawLongBits4 = Double.doubleToRawLongBits(((Double) i0f.l(obj, j)).doubleValue());
                        ljeVar.c(i12, 1);
                        ljeVar.j(doubleToRawLongBits4);
                    }
                    i3 = 1;
                    break;
                case 52:
                    if (q(i12, i9, obj)) {
                        int floatToRawIntBits4 = Float.floatToRawIntBits(((Float) i0f.l(obj, j)).floatValue());
                        ljeVar.c(i12, 5);
                        ljeVar.l(floatToRawIntBits4);
                    }
                    i3 = 1;
                    break;
                case 53:
                    if (q(i12, i9, obj)) {
                        long A6 = A(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(A6);
                    }
                    i3 = 1;
                    break;
                case 54:
                    if (q(i12, i9, obj)) {
                        long A7 = A(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(A7);
                    }
                    i3 = 1;
                    break;
                case 55:
                    if (q(i12, i9, obj)) {
                        int z21 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(z21);
                    }
                    i3 = 1;
                    break;
                case 56:
                    if (q(i12, i9, obj)) {
                        long A8 = A(obj, j);
                        ljeVar.c(i12, 1);
                        ljeVar.j(A8);
                    }
                    i3 = 1;
                    break;
                case 57:
                    if (q(i12, i9, obj)) {
                        int z22 = z(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(z22);
                    }
                    i3 = 1;
                    break;
                case 58:
                    if (q(i12, i9, obj)) {
                        boolean booleanValue2 = ((Boolean) i0f.l(obj, j)).booleanValue();
                        ljeVar.c(i12, 0);
                        ljeVar.a(booleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    break;
                case 59:
                    if (q(i12, i9, obj)) {
                        n(i12, unsafe.getObject(obj, j), g6eVar);
                    }
                    i3 = 1;
                    break;
                case 60:
                    if (q(i12, i9, obj)) {
                        g6eVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    break;
                case 61:
                    if (q(i12, i9, obj)) {
                        g6eVar.b(i12, (sie) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    break;
                case 62:
                    if (q(i12, i9, obj)) {
                        int z23 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g(z23);
                    }
                    i3 = 1;
                    break;
                case 63:
                    if (q(i12, i9, obj)) {
                        int z24 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(z24);
                    }
                    i3 = 1;
                    break;
                case 64:
                    if (q(i12, i9, obj)) {
                        int z25 = z(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(z25);
                    }
                    i3 = 1;
                    break;
                case 65:
                    if (q(i12, i9, obj)) {
                        long A9 = A(obj, j);
                        ljeVar.c(i12, i15);
                        ljeVar.j(A9);
                    }
                    i3 = 1;
                    break;
                case 66:
                    if (q(i12, i9, obj)) {
                        int z26 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g((z26 << 1) ^ (z26 >> 31));
                    }
                    i3 = i15;
                    break;
                case 67:
                    if (q(i12, i9, obj)) {
                        long A10 = A(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d((A10 << i15) ^ (A10 >> 63));
                    }
                    i3 = i15;
                    break;
                case 68:
                    if (q(i12, i9, obj)) {
                        g6eVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = i15;
                    break;
                default:
                    i3 = i15;
                    break;
            }
            i9 += 3;
            mzeVar = mzeVar2;
            i5 = i3;
            i6 = i13;
            length2 = i;
        }
        mzeVar.getClass();
        ((nne) obj).zzb.c(g6eVar);
    }

    @Override
    public final void e(nne nneVar, nne nneVar2) {
        nne nneVar3;
        nneVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int y = y(i);
                long j = y & 1048575;
                int i2 = iArr[i];
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            c6c c6cVar = i0f.c;
                            c6cVar.m(nneVar3, j, c6cVar.t(nneVar2, j));
                            u(nneVar3, i);
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 1:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            c6c c6cVar2 = i0f.c;
                            c6cVar2.n(nneVar3, j, c6cVar2.r(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 2:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 3:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 4:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 5:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 6:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 7:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            c6c c6cVar3 = i0f.c;
                            c6cVar3.o(nneVar3, j, c6cVar3.q(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 8:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.d(nneVar3, j, i0f.l(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 9:
                        nneVar3 = nneVar;
                        p(nneVar3, nneVar2, i);
                        continue;
                        i += 3;
                        nneVar = nneVar3;
                    case 10:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.d(nneVar3, j, i0f.l(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 11:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 12:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 13:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 14:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 15:
                        nneVar3 = nneVar;
                        if (r(i, nneVar2)) {
                            i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                            u(nneVar3, i);
                        } else {
                            continue;
                        }
                        i += 3;
                        nneVar = nneVar3;
                    case 16:
                        if (r(i, nneVar2)) {
                            nneVar3 = nneVar;
                            i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                            u(nneVar3, i);
                            continue;
                            i += 3;
                            nneVar = nneVar3;
                        }
                        break;
                    case 17:
                        p(nneVar, nneVar2, i);
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
                        this.k.a(nneVar, nneVar2, j);
                        break;
                    case 50:
                        Class cls = fxe.a;
                        Object l = i0f.l(nneVar, j);
                        Object l2 = i0f.l(nneVar2, j);
                        this.m.getClass();
                        i0f.d(nneVar, j, ite.a(l, l2));
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
                        if (q(i2, i, nneVar2)) {
                            i0f.d(nneVar, j, i0f.l(nneVar2, j));
                            i0f.c(nneVar, i2, iArr[i + 2] & 1048575);
                            break;
                        }
                        break;
                    case 60:
                        v(nneVar, nneVar2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (q(i2, i, nneVar2)) {
                            i0f.d(nneVar, j, i0f.l(nneVar2, j));
                            i0f.c(nneVar, i2, iArr[i + 2] & 1048575);
                            break;
                        }
                        break;
                    case 68:
                        v(nneVar, nneVar2, i);
                        break;
                }
                nneVar3 = nneVar;
                i += 3;
                nneVar = nneVar3;
            } else {
                fxe.h(this.l, nneVar, nneVar2);
                return;
            }
        }
    }

    @Override
    public final boolean f(defpackage.nne r12, defpackage.nne r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.f(nne, nne):boolean");
    }

    @Override
    public final int g(defpackage.nne r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.g(nne):int");
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, sad sadVar) {
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
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(g2f.j(i9, bArr))));
                    i11 = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i9;
            case 52:
                i10 = i;
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(g2f.a(i10, bArr))));
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
                i11 = g2f.i(bArr, i, sadVar);
                unsafe.putObject(obj, j, Long.valueOf(sadVar.b));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.h(bArr, i, sadVar);
                unsafe.putObject(obj, j, Integer.valueOf(sadVar.a));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 56:
            case 65:
                i9 = i;
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(g2f.j(i9, bArr)));
                    i11 = i9 + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i9;
            case 57:
            case 64:
                i10 = i;
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(g2f.a(i10, bArr)));
                    i11 = i10 + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i10;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.i(bArr, i, sadVar);
                if (sadVar.b == 0) {
                    z = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int h = g2f.h(bArr, i, sadVar);
                int i12 = sadVar.a;
                if (i12 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!q0f.a.c(h, h + i12, bArr)) {
                            throw fpe.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, h, i12, foe.a));
                    h += i12;
                }
                unsafe.putInt(obj, j2, i4);
                return h;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int g = g2f.g(m(i8), bArr, i, i2, sadVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                Object obj3 = sadVar.c;
                if (obj2 == null) {
                    unsafe.putObject(obj, j, obj3);
                } else {
                    unsafe.putObject(obj, j, foe.b(obj2, obj3));
                }
                unsafe.putInt(obj, j2, i4);
                return g;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                i11 = g2f.m(bArr, i, sadVar);
                unsafe.putObject(obj, j, sadVar.c);
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int h2 = g2f.h(bArr, i, sadVar);
                int i13 = sadVar.a;
                b3e w = w(i8);
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
                i11 = g2f.h(bArr, i, sadVar);
                unsafe.putObject(obj, j, Integer.valueOf(o2f.a(sadVar.a)));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.i(bArr, i, sadVar);
                long j3 = sadVar.b;
                unsafe.putObject(obj, j, Long.valueOf((j3 >>> 1) ^ (-(j3 & 1))));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 68:
                if (i5 == 3) {
                    i11 = g2f.f(m(i8), bArr, i, i2, (i3 & (-8)) | 4, sadVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj4 = sadVar.c;
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, obj4);
                    } else {
                        unsafe.putObject(obj, j, foe.b(obj2, obj4));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i;
            default:
                return i;
        }
    }

    public final int i(java.lang.Object r13, byte[] r14, int r15, int r16, int r17, int r18, int r19, int r20, long r21, int r23, long r24, defpackage.sad r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.i(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, sad):int");
    }

    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, sad sadVar) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        int i5;
        que queVar;
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
        sad sadVar2;
        int i14;
        int i15;
        byte[] bArr3;
        int i16;
        Object obj3;
        int i17;
        int i18;
        int i19;
        int h;
        que queVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i20 = i2;
        sad sadVar3 = sadVar;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (true) {
            int[] iArr3 = queVar2.a;
            Unsafe unsafe3 = o;
            if (i21 < i20) {
                int i27 = i21 + 1;
                int i28 = bArr4[i21];
                if (i28 < 0) {
                    i27 = g2f.d(i28, bArr4, i27, sadVar3);
                    i28 = sadVar3.a;
                }
                int i29 = i27;
                int i30 = i28;
                int i31 = i30 >>> 3;
                int i32 = i30 & 7;
                int i33 = queVar2.d;
                int i34 = queVar2.c;
                if (i31 > i22) {
                    i7 = (i31 < i34 || i31 > i33) ? -1 : queVar2.s(i31, i23 / 3);
                    i6 = 0;
                } else if (i31 < i34 || i31 > i33) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = queVar2.s(i31, 0);
                }
                if (i7 == -1) {
                    iArr = iArr3;
                    i8 = i30;
                    i4 = i25;
                    unsafe = unsafe3;
                    i5 = i6;
                    i9 = i31;
                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 1) {
                                    i0f.c.m(obj4, j, Double.longBitsToDouble(g2f.j(i14, bArr2)));
                                    i21 = i14 + 8;
                                    int i40 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i40;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i41 = i14;
                                    obj2 = obj4;
                                    i10 = i41;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 5) {
                                    i0f.c.n(obj4, j, Float.intBitsToFloat(g2f.a(i14, bArr2)));
                                    i21 = i14 + 4;
                                    int i402 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i402;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i412 = i14;
                                    obj2 = obj4;
                                    i10 = i412;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 0) {
                                    int i42 = g2f.i(bArr, i14, sadVar2);
                                    unsafe2.putLong(obj4, j, sadVar2.b);
                                    int i43 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i43;
                                    i20 = i2;
                                    i21 = i42;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i4122 = i14;
                                    obj2 = obj4;
                                    i10 = i4122;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 0) {
                                    int h2 = g2f.h(bArr, i14, sadVar2);
                                    unsafe2.putInt(obj4, j, sadVar2.a);
                                    int i44 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i44;
                                    i20 = i2;
                                    i21 = h2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i41222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 1) {
                                    unsafe2.putLong(obj4, j, g2f.j(i14, bArr2));
                                    i21 = i14 + 8;
                                    int i4022 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4022;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i412222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj4, j, g2f.a(i14, bArr2));
                                    i21 = i14 + 4;
                                    int i40222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i40222;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    int i4122222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 == 0) {
                                    i21 = g2f.i(bArr2, i15, sadVar2);
                                    i0f.c.o(obj4, j, sadVar2.b != 0);
                                    int i402222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i402222;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i41222222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222222;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 == 2) {
                                    if ((i35 & 536870912) == 0) {
                                        i21 = g2f.k(bArr2, i15, sadVar2);
                                    } else {
                                        i21 = g2f.l(bArr2, i15, sadVar2);
                                    }
                                    unsafe2.putObject(obj4, j, sadVar2.c);
                                    int i4022222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4022222;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i412222222 = i14;
                                    obj2 = obj4;
                                    i10 = i412222222;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 2) {
                                    i21 = g2f.g(queVar2.m(i11), bArr3, i15, i16, sadVar2);
                                    if ((i12 & i38) == 0) {
                                        unsafe2.putObject(obj4, j, sadVar2.c);
                                    } else {
                                        unsafe2.putObject(obj4, j, foe.b(unsafe2.getObject(obj4, j), sadVar2.c));
                                    }
                                    int i45 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45;
                                    i20 = i16;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i4122222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222222;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 2) {
                                    i21 = g2f.m(bArr3, i15, sadVar2);
                                    unsafe2.putObject(obj4, j, sadVar2.c);
                                    int i452 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i452;
                                    i20 = i16;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i41222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i41222222222;
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 0) {
                                    i21 = g2f.h(bArr3, i15, sadVar2);
                                    int i46 = sadVar2.a;
                                    b3e w = queVar2.w(i11);
                                    if (w != null && !w.a(i46)) {
                                        B(obj4).a(i8, Long.valueOf(i46));
                                        bArr4 = bArr3;
                                        i20 = i16;
                                        i23 = i11;
                                        i25 = i13;
                                        i26 = i12;
                                        i24 = i8;
                                        i22 = i31;
                                        sadVar3 = sadVar2;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j, i46);
                                        int i4522 = i13;
                                        i26 = i12 | i38;
                                        bArr4 = bArr3;
                                        i25 = i4522;
                                        i20 = i16;
                                        sadVar3 = sadVar2;
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
                                    queVar = queVar2;
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
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 == 0) {
                                    i21 = g2f.h(bArr3, i15, sadVar2);
                                    unsafe2.putInt(obj4, j, o2f.a(sadVar2.a));
                                    int i45222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45222;
                                    i20 = i16;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                    break;
                                } else {
                                    i14 = i15;
                                    int i4122222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4122222222222;
                                    queVar = queVar2;
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
                                    int i47 = g2f.i(bArr, i15, sadVar);
                                    int i48 = i7;
                                    long j2 = sadVar.b;
                                    sadVar2 = sadVar;
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
                                    sadVar3 = sadVar2;
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
                                    queVar = queVar2;
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
                                    i21 = g2f.f(queVar2.m(i7), bArr, i29, i2, (i31 << 3) | 4, sadVar);
                                    if ((i12 & i38) == 0) {
                                        unsafe3.putObject(obj4, j, sadVar.c);
                                    } else {
                                        unsafe3.putObject(obj4, j, foe.b(unsafe3.getObject(obj4, j), sadVar.c));
                                    }
                                    int i50 = i12 | i38;
                                    i23 = i7;
                                    sadVar3 = sadVar;
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
                                    queVar = queVar2;
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
                                queVar = queVar2;
                                unsafe = unsafe2;
                                iArr = iArr2;
                                i9 = i31;
                                i4 = i13;
                                i26 = i12;
                                i5 = 0;
                                break;
                        }
                    } else {
                        sad sadVar4 = sadVar3;
                        i8 = i30;
                        i11 = i7;
                        if (i36 == 27) {
                            if (i32 == 2) {
                                kpe kpeVar = (kpe) unsafe3.getObject(obj4, j);
                                if (!kpeVar.zza()) {
                                    int size = kpeVar.size();
                                    kpeVar = kpeVar.zza(size == 0 ? 10 : size << 1);
                                    unsafe3.putObject(obj4, j, kpeVar);
                                }
                                obj4 = obj;
                                i20 = i2;
                                sadVar3 = sadVar;
                                i21 = g2f.e(queVar2.m(i11), i8, bArr, i29, i2, kpeVar, sadVar4);
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
                                queVar = queVar2;
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
                            h = queVar2.i(obj, bArr, i29, i2, i8, i31, i32, i11, i35, i36, j, sadVar);
                            obj4 = obj;
                            i8 = i8;
                            i22 = i31;
                            i11 = i11;
                            if (h == i29) {
                                queVar = queVar2;
                                obj2 = obj4;
                                i9 = i22;
                                i10 = h;
                            } else {
                                bArr4 = bArr;
                                i20 = i2;
                                sadVar3 = sadVar;
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
                                    queVar2.o(obj3, i11, j);
                                    throw null;
                                }
                                queVar = queVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            } else {
                                i9 = i19;
                                h = queVar2.h(obj3, bArr, i17, i2, i8, i9, i32, i35, i36, j, i11, sadVar);
                                queVar = queVar2;
                                obj2 = obj3;
                                i11 = i11;
                                if (h == i17) {
                                    i10 = h;
                                } else {
                                    bArr4 = bArr;
                                    i20 = i2;
                                    sadVar3 = sadVar;
                                    i22 = i9;
                                    i21 = h;
                                    queVar2 = queVar;
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
                    sadVar3 = sadVar;
                    i20 = i2;
                    i22 = i9;
                    queVar2 = queVar;
                    i23 = i11;
                    i24 = i8;
                    i25 = i4;
                    i21 = g2f.c(i8, bArr4, i10, i2, B(obj2), sadVar);
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
                queVar = queVar2;
                obj2 = obj4;
            }
        }
        int i51 = i4;
        if (i51 != 1048575) {
            unsafe.putInt(obj2, i51, i26);
        }
        for (int i52 = queVar.h; i52 < queVar.i; i52++) {
            int i53 = queVar.g[i52];
            int i54 = iArr[i53];
            Object l = i0f.l(obj2, queVar.y(i53) & 1048575);
            if (l != null && queVar.w(i53) != null) {
                queVar.m.getClass();
                ate ateVar = (ate) l;
                if (queVar.t(i53) != null) {
                    fyb.g();
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

    public final xwe m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        xwe xweVar = (xwe) objArr[i2];
        if (xweVar != null) {
            return xweVar;
        }
        xwe a = fwe.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final void o(Object obj, int i, long j) {
        ate ateVar;
        Object t = t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.m.getClass();
        if (!((ate) object).a) {
            ate ateVar2 = ate.b;
            if (ateVar2.isEmpty()) {
                ateVar = new ate();
            } else {
                ?? linkedHashMap = new LinkedHashMap(ateVar2);
                linkedHashMap.a = true;
                ateVar = linkedHashMap;
            }
            ite.a(ateVar, object);
            unsafe.putObject(obj, j, ateVar);
        }
        if (t == null) {
            throw new NoSuchMethodError();
        }
        throw new ClassCastException();
    }

    public final void p(nne nneVar, nne nneVar2, int i) {
        long y = y(i) & 1048575;
        if (r(i, nneVar2)) {
            Object l = i0f.l(nneVar, y);
            Object l2 = i0f.l(nneVar2, y);
            if (l != null && l2 != null) {
                i0f.d(nneVar, y, foe.b(l, l2));
                u(nneVar, i);
            } else if (l2 != null) {
                i0f.d(nneVar, y, l2);
                u(nneVar, i);
            }
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        if (i0f.b(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final boolean r(int r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.r(int, java.lang.Object):boolean");
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

    public final void u(nne nneVar, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        i0f.c(nneVar, i0f.b(nneVar, j) | (1 << (i2 >>> 20)), j);
    }

    public final void v(nne nneVar, nne nneVar2, int i) {
        int[] iArr;
        Object obj;
        int y = y(i);
        int i2 = this.a[i];
        long j = y & 1048575;
        if (q(i2, i, nneVar2)) {
            if (q(i2, i, nneVar)) {
                obj = i0f.l(nneVar, j);
            } else {
                obj = null;
            }
            Object l = i0f.l(nneVar2, j);
            if (obj != null && l != null) {
                i0f.d(nneVar, j, foe.b(obj, l));
                i0f.c(nneVar, i2, iArr[i + 2] & 1048575);
            } else if (l != null) {
                i0f.d(nneVar, j, l);
                i0f.c(nneVar, i2, iArr[i + 2] & 1048575);
            }
        }
    }

    public final b3e w(int i) {
        return (b3e) this.b[((i / 3) << 1) + 1];
    }

    public final boolean x(nne nneVar, nne nneVar2, int i) {
        if (r(i, nneVar) == r(i, nneVar2)) {
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
        return ((nne) this.e).d(4);
    }

    @Override
    public final int zzb(Object obj) {
        mze mzeVar;
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
        mze mzeVar2 = this.l;
        ite iteVar = this.m;
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
                if (i12 >= yle.b.a && i12 <= yle.c.a) {
                    int i16 = iArr2[i10 + 2];
                }
                switch (i12) {
                    case 0:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i10, obj)) {
                            long g = i0f.g(obj, j);
                            t4 = lje.t(i14 << 3);
                            o3 = lje.o(g);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i10, obj)) {
                            n2 = lje.n(i14, i0f.g(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i10, obj)) {
                            int b = i0f.b(obj, j);
                            t4 = lje.t(i14 << 3);
                            o3 = lje.p(b);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i10, obj)) {
                            n2 = lje.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i10, obj)) {
                            n2 = lje.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i10, obj)) {
                            Object l = i0f.l(obj, j);
                            if (l instanceof sie) {
                                n2 = lje.i(i14, (sie) l);
                                i11 += n2;
                                break;
                            } else {
                                t4 = lje.t(i14 << 3);
                                o3 = lje.f((String) l);
                                i11 += o3 + t4;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i10, obj)) {
                            n2 = fxe.a(i14, i0f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i10, obj)) {
                            n2 = lje.i(i14, (sie) i0f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i10, obj)) {
                            n2 = lje.s(i14, i0f.b(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i10, obj)) {
                            int b2 = i0f.b(obj, j);
                            t4 = lje.t(i14 << 3);
                            o3 = lje.p(b2);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i10, obj)) {
                            n2 = lje.u(i14, i0f.b(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i10, obj)) {
                            n2 = lje.q(i14, i0f.g(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i10, obj)) {
                            n2 = lje.h(i14, (qde) i0f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        n2 = fxe.C(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 19:
                        n2 = fxe.z(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 20:
                        List list = (List) i0f.l(obj, j);
                        Class cls = fxe.a;
                        if (list.size() != 0) {
                            n2 = mue.a(i14, list.size(), fxe.c(list));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 21:
                        List list2 = (List) i0f.l(obj, j);
                        Class cls2 = fxe.a;
                        int size = list2.size();
                        if (size != 0) {
                            n2 = mue.a(i14, size, fxe.k(list2));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 22:
                        List list3 = (List) i0f.l(obj, j);
                        Class cls3 = fxe.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            n2 = mue.a(i14, size2, fxe.t(list3));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 23:
                        n2 = fxe.C(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 24:
                        n2 = fxe.z(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 25:
                        Class cls4 = fxe.a;
                        int size3 = ((List) i0f.l(obj, j)).size();
                        if (size3 != 0) {
                            n2 = (lje.t(i14 << 3) + 1) * size3;
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 26:
                        n2 = fxe.j(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 27:
                        n2 = fxe.b(i14, (List) i0f.l(obj, j), m(i10));
                        i11 += n2;
                        break;
                    case 28:
                        n2 = fxe.o(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 29:
                        List list4 = (List) i0f.l(obj, j);
                        Class cls5 = fxe.a;
                        int size4 = list4.size();
                        if (size4 != 0) {
                            n2 = mue.a(i14, size4, fxe.v(list4));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 30:
                        List list5 = (List) i0f.l(obj, j);
                        Class cls6 = fxe.a;
                        int size5 = list5.size();
                        if (size5 != 0) {
                            n2 = mue.a(i14, size5, fxe.r(list5));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 31:
                        n2 = fxe.z(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 32:
                        n2 = fxe.C(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 33:
                        List list6 = (List) i0f.l(obj, j);
                        Class cls7 = fxe.a;
                        int size6 = list6.size();
                        if (size6 != 0) {
                            n2 = mue.a(i14, size6, fxe.x(list6));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 34:
                        List list7 = (List) i0f.l(obj, j);
                        Class cls8 = fxe.a;
                        int size7 = list7.size();
                        if (size7 != 0) {
                            n2 = mue.a(i14, size7, fxe.p(list7));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 35:
                        int D = fxe.D((List) unsafe.getObject(obj, j));
                        if (D > 0) {
                            i11 = mue.b(D, lje.m(i14), D, i11);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int A = fxe.A((List) unsafe.getObject(obj, j));
                        if (A > 0) {
                            i11 = mue.b(A, lje.m(i14), A, i11);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int c = fxe.c((List) unsafe.getObject(obj, j));
                        if (c > 0) {
                            i11 = mue.b(c, lje.m(i14), c, i11);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int k = fxe.k((List) unsafe.getObject(obj, j));
                        if (k > 0) {
                            i11 = mue.b(k, lje.m(i14), k, i11);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int t5 = fxe.t((List) unsafe.getObject(obj, j));
                        if (t5 > 0) {
                            i11 = mue.b(t5, lje.m(i14), t5, i11);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int D2 = fxe.D((List) unsafe.getObject(obj, j));
                        if (D2 > 0) {
                            i11 = mue.b(D2, lje.m(i14), D2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int A2 = fxe.A((List) unsafe.getObject(obj, j));
                        if (A2 > 0) {
                            i11 = mue.b(A2, lje.m(i14), A2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls9 = fxe.a;
                        int size8 = ((List) unsafe.getObject(obj, j)).size();
                        if (size8 > 0) {
                            i11 = mue.b(size8, lje.m(i14), size8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v = fxe.v((List) unsafe.getObject(obj, j));
                        if (v > 0) {
                            i11 = mue.b(v, lje.m(i14), v, i11);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int r = fxe.r((List) unsafe.getObject(obj, j));
                        if (r > 0) {
                            i11 = mue.b(r, lje.m(i14), r, i11);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int A3 = fxe.A((List) unsafe.getObject(obj, j));
                        if (A3 > 0) {
                            i11 = mue.b(A3, lje.m(i14), A3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int D3 = fxe.D((List) unsafe.getObject(obj, j));
                        if (D3 > 0) {
                            i11 = mue.b(D3, lje.m(i14), D3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int x = fxe.x((List) unsafe.getObject(obj, j));
                        if (x > 0) {
                            i11 = mue.b(x, lje.m(i14), x, i11);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p = fxe.p((List) unsafe.getObject(obj, j));
                        if (p > 0) {
                            i11 = mue.b(p, lje.m(i14), p, i11);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list8 = (List) i0f.l(obj, j);
                        xwe m = m(i10);
                        Class cls10 = fxe.a;
                        int size9 = list8.size();
                        if (size9 == 0) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            for (int i17 = 0; i17 < size9; i17++) {
                                i6 = lje.h(i14, (qde) list8.get(i17), m) + i6;
                            }
                        }
                        i11 = i6 + i11;
                        break;
                    case 50:
                        Object l2 = i0f.l(obj, j);
                        Object t6 = t(i10);
                        iteVar.getClass();
                        ite.b(l2, t6);
                        break;
                    case 51:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(i14, i10, obj)) {
                            long A4 = A(obj, j);
                            t4 = lje.t(i14 << 3);
                            o3 = lje.o(A4);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(i14, i10, obj)) {
                            n2 = lje.n(i14, A(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(i14, i10, obj)) {
                            int z2 = z(obj, j);
                            t4 = lje.t(i14 << 3);
                            o3 = lje.p(z2);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i14, i10, obj)) {
                            n2 = lje.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(i14, i10, obj)) {
                            n2 = lje.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(i14, i10, obj)) {
                            Object l3 = i0f.l(obj, j);
                            if (l3 instanceof sie) {
                                n2 = lje.i(i14, (sie) l3);
                                i11 += n2;
                                break;
                            } else {
                                t4 = lje.t(i14 << 3);
                                o3 = lje.f((String) l3);
                                i11 += o3 + t4;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (q(i14, i10, obj)) {
                            n2 = fxe.a(i14, i0f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(i14, i10, obj)) {
                            n2 = lje.i(i14, (sie) i0f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(i14, i10, obj)) {
                            n2 = lje.s(i14, z(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(i14, i10, obj)) {
                            int z3 = z(obj, j);
                            t4 = lje.t(i14 << 3);
                            o3 = lje.p(z3);
                            i11 += o3 + t4;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(i14, i10, obj)) {
                            n2 = lje.u(i14, z(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(i14, i10, obj)) {
                            n2 = lje.q(i14, A(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(i14, i10, obj)) {
                            n2 = lje.h(i14, (qde) i0f.l(obj, j), m(i10));
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
            mzeVar2.getClass();
            return ((nne) obj).zzb.d() + i11;
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
                mzeVar = mzeVar2;
                if (i26 != i18) {
                    i21 = unsafe.getInt(obj, i26);
                    i18 = i26;
                }
            } else {
                mzeVar = mzeVar2;
                i = 0;
            }
            long j2 = y2 & 1048575;
            switch (i23) {
                case 0:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.o(unsafe.getLong(obj, j2)) + lje.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.n(i22, unsafe.getLong(obj, j2));
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.p(unsafe.getInt(obj, j2)) + lje.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.r(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.v(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i & i21) != 0) {
                        i2 = 1;
                        i20 = yjb.A(i22 << 3, 1, i20);
                        break;
                    }
                    i2 = 1;
                    break;
                case 8:
                    if ((i & i21) != 0) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof sie) {
                            i3 = lje.i(i22, (sie) object);
                            i20 += i3;
                        } else {
                            t = lje.t(i22 << 3);
                            f = lje.f((String) object);
                            i3 = f + t;
                            i20 += i3;
                        }
                    }
                    i2 = 1;
                    break;
                case 9:
                    if ((i & i21) != 0) {
                        i3 = fxe.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 10:
                    if ((i & i21) != 0) {
                        i3 = lje.i(i22, (sie) unsafe.getObject(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 11:
                    if ((i & i21) != 0) {
                        i3 = lje.s(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 12:
                    if ((i & i21) != 0) {
                        int i27 = unsafe.getInt(obj, j2);
                        t = lje.t(i22 << 3);
                        f = lje.p(i27);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 13:
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 14:
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 15:
                    if ((i & i21) != 0) {
                        i3 = lje.u(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 16:
                    if ((i & i21) != 0) {
                        i3 = lje.q(i22, unsafe.getLong(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 17:
                    if ((i & i21) != 0) {
                        i3 = lje.h(i22, (qde) unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 18:
                    i3 = fxe.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 19:
                    i3 = fxe.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 20:
                    List list9 = (List) unsafe.getObject(obj, j2);
                    Class cls11 = fxe.a;
                    if (list9.size() != 0) {
                        i3 = mue.a(i22, list9.size(), fxe.c(list9));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 21:
                    List list10 = (List) unsafe.getObject(obj, j2);
                    Class cls12 = fxe.a;
                    int size10 = list10.size();
                    if (size10 != 0) {
                        i3 = mue.a(i22, size10, fxe.k(list10));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 22:
                    List list11 = (List) unsafe.getObject(obj, j2);
                    Class cls13 = fxe.a;
                    int size11 = list11.size();
                    if (size11 != 0) {
                        i3 = mue.a(i22, size11, fxe.t(list11));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 23:
                    i3 = fxe.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 24:
                    i3 = fxe.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 25:
                    Class cls14 = fxe.a;
                    int size12 = ((List) unsafe.getObject(obj, j2)).size();
                    if (size12 == 0) {
                        t2 = 0;
                    } else {
                        t2 = (lje.t(i22 << 3) + 1) * size12;
                    }
                    i20 += t2;
                    i2 = 1;
                    break;
                case 26:
                    i3 = fxe.j(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 27:
                    i3 = fxe.b(i22, (List) unsafe.getObject(obj, j2), m(i19));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 28:
                    i3 = fxe.o(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 29:
                    List list12 = (List) unsafe.getObject(obj, j2);
                    Class cls15 = fxe.a;
                    int size13 = list12.size();
                    if (size13 != 0) {
                        i3 = mue.a(i22, size13, fxe.v(list12));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 30:
                    List list13 = (List) unsafe.getObject(obj, j2);
                    Class cls16 = fxe.a;
                    int size14 = list13.size();
                    if (size14 != 0) {
                        i3 = mue.a(i22, size14, fxe.r(list13));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 31:
                    i3 = fxe.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 32:
                    i3 = fxe.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 33:
                    List list14 = (List) unsafe.getObject(obj, j2);
                    Class cls17 = fxe.a;
                    int size15 = list14.size();
                    if (size15 != 0) {
                        i3 = mue.a(i22, size15, fxe.x(list14));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 34:
                    List list15 = (List) unsafe.getObject(obj, j2);
                    Class cls18 = fxe.a;
                    int size16 = list15.size();
                    if (size16 != 0) {
                        i3 = mue.a(i22, size16, fxe.p(list15));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 35:
                    int D4 = fxe.D((List) unsafe.getObject(obj, j2));
                    if (D4 > 0) {
                        i20 = mue.b(D4, lje.m(i22), D4, i20);
                    }
                    i2 = 1;
                    break;
                case 36:
                    int A5 = fxe.A((List) unsafe.getObject(obj, j2));
                    if (A5 > 0) {
                        i20 = mue.b(A5, lje.m(i22), A5, i20);
                    }
                    i2 = 1;
                    break;
                case 37:
                    int c2 = fxe.c((List) unsafe.getObject(obj, j2));
                    if (c2 > 0) {
                        i20 = mue.b(c2, lje.m(i22), c2, i20);
                    }
                    i2 = 1;
                    break;
                case 38:
                    int k2 = fxe.k((List) unsafe.getObject(obj, j2));
                    if (k2 > 0) {
                        i20 = mue.b(k2, lje.m(i22), k2, i20);
                    }
                    i2 = 1;
                    break;
                case 39:
                    int t7 = fxe.t((List) unsafe.getObject(obj, j2));
                    if (t7 > 0) {
                        i20 = mue.b(t7, lje.m(i22), t7, i20);
                    }
                    i2 = 1;
                    break;
                case 40:
                    int D5 = fxe.D((List) unsafe.getObject(obj, j2));
                    if (D5 > 0) {
                        i20 = mue.b(D5, lje.m(i22), D5, i20);
                    }
                    i2 = 1;
                    break;
                case 41:
                    int A6 = fxe.A((List) unsafe.getObject(obj, j2));
                    if (A6 > 0) {
                        i20 = mue.b(A6, lje.m(i22), A6, i20);
                    }
                    i2 = 1;
                    break;
                case 42:
                    Class cls19 = fxe.a;
                    int size17 = ((List) unsafe.getObject(obj, j2)).size();
                    if (size17 > 0) {
                        i20 = mue.b(size17, lje.m(i22), size17, i20);
                    }
                    i2 = 1;
                    break;
                case 43:
                    int v2 = fxe.v((List) unsafe.getObject(obj, j2));
                    if (v2 > 0) {
                        i20 = mue.b(v2, lje.m(i22), v2, i20);
                    }
                    i2 = 1;
                    break;
                case 44:
                    int r2 = fxe.r((List) unsafe.getObject(obj, j2));
                    if (r2 > 0) {
                        i20 = mue.b(r2, lje.m(i22), r2, i20);
                    }
                    i2 = 1;
                    break;
                case 45:
                    int A7 = fxe.A((List) unsafe.getObject(obj, j2));
                    if (A7 > 0) {
                        i20 = mue.b(A7, lje.m(i22), A7, i20);
                    }
                    i2 = 1;
                    break;
                case 46:
                    int D6 = fxe.D((List) unsafe.getObject(obj, j2));
                    if (D6 > 0) {
                        i20 = mue.b(D6, lje.m(i22), D6, i20);
                    }
                    i2 = 1;
                    break;
                case 47:
                    int x2 = fxe.x((List) unsafe.getObject(obj, j2));
                    if (x2 > 0) {
                        i20 = mue.b(x2, lje.m(i22), x2, i20);
                    }
                    i2 = 1;
                    break;
                case 48:
                    int p2 = fxe.p((List) unsafe.getObject(obj, j2));
                    if (p2 > 0) {
                        i20 = mue.b(p2, lje.m(i22), p2, i20);
                    }
                    i2 = 1;
                    break;
                case 49:
                    List list16 = (List) unsafe.getObject(obj, j2);
                    xwe m2 = m(i19);
                    Class cls20 = fxe.a;
                    int size18 = list16.size();
                    if (size18 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i28 = 0; i28 < size18; i28++) {
                            i4 += lje.h(i22, (qde) list16.get(i28), m2);
                        }
                    }
                    i20 += i4;
                    i2 = 1;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    Object t8 = t(i19);
                    iteVar.getClass();
                    ite.b(object2, t8);
                    i2 = 1;
                    break;
                case 51:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 52:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 53:
                    if (q(i22, i19, obj)) {
                        i3 = lje.o(A(obj, j2)) + lje.t(i22 << 3);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 54:
                    if (q(i22, i19, obj)) {
                        i3 = lje.n(i22, A(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 55:
                    if (q(i22, i19, obj)) {
                        int z4 = z(obj, j2);
                        t = lje.t(i22 << 3);
                        f = lje.p(z4);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 56:
                    if (q(i22, i19, obj)) {
                        i3 = lje.r(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 57:
                    if (q(i22, i19, obj)) {
                        i3 = lje.v(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 58:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, i24, i20);
                        i2 = i24;
                        break;
                    }
                    i2 = 1;
                    break;
                case 59:
                    if (q(i22, i19, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof sie) {
                            i5 = lje.i(i22, (sie) object3);
                            i20 += i5;
                        } else {
                            t3 = lje.t(i22 << 3);
                            f2 = lje.f((String) object3);
                            i5 = f2 + t3;
                            i20 += i5;
                        }
                    }
                    i2 = i24;
                    break;
                case 60:
                    if (q(i22, i19, obj)) {
                        i5 = fxe.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 61:
                    if (q(i22, i19, obj)) {
                        i5 = lje.i(i22, (sie) unsafe.getObject(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 62:
                    if (q(i22, i19, obj)) {
                        i5 = lje.s(i22, z(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 63:
                    if (q(i22, i19, obj)) {
                        int z5 = z(obj, j2);
                        t3 = lje.t(i22 << 3);
                        f2 = lje.p(z5);
                        i5 = f2 + t3;
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 64:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                    }
                    i2 = i24;
                    break;
                case 65:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                    }
                    i2 = i24;
                    break;
                case 66:
                    if (q(i22, i19, obj)) {
                        i5 = lje.u(i22, z(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 67:
                    if (q(i22, i19, obj)) {
                        i5 = lje.q(i22, A(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 68:
                    if (q(i22, i19, obj)) {
                        i5 = lje.h(i22, (qde) unsafe.getObject(obj, j2), m(i19));
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
            mzeVar2 = mzeVar;
        }
        mzeVar2.getClass();
        return ((nne) obj).zzb.d() + i20;
    }
}
