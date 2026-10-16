package f2;

import b2.x;
import j$.util.Objects;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import v7.u6;
public abstract class p {
    public static final byte[] f8892a = {0, 0, 0, 1};
    public static final float[] f8893b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f8894c = new Object();
    public static int[] d = new int[10];

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void b(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - i10;
        boolean z13 = false;
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            b(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            b(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            b(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        b(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            if (i12 <= 2 ? !(i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !zArr[2] || bArr[i11 - 2] != 0 || bArr[i13] != 1) : !(bArr[i11 - 3] != 0 || bArr[i11 - 2] != 0 || bArr[i13] != 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            zArr[0] = z11;
            if (i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : !(bArr[i11 - 2] != 0 || bArr[i13] != 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
            zArr[1] = z12;
            if (bArr[i13] == 0) {
                z13 = true;
            }
            zArr[2] = z13;
            return i11;
        }
    }

    public static String d(x xVar) {
        String str = xVar.f2523s;
        String str2 = xVar.f2515k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (!str2.startsWith("dva1") && !str2.startsWith("dvav")) {
                if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return xVar.f2523s;
    }

    public static long e(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else if (i15 == 3) {
            i11 = 60000;
        } else {
            i11 = 10000 << i15;
        }
        return i10 * i11;
    }

    public static boolean f(byte[] bArr, int i10, x xVar) {
        int i11;
        if (Objects.equals(xVar.f2523s, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(xVar.f2523s, "video/hevc")) {
            a3.l h = h(new t(bArr, 4, i10 + 4));
            int i12 = h.f139a;
            if (i12 != 35) {
                if (i12 <= 14 && i12 % 2 == 0 && h.f141c == xVar.J - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static int g(x xVar) {
        String d10 = d(xVar);
        if (Objects.equals(d10, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(d10, "video/hevc") && !Objects.equals(d10, "video/vvc")) {
            return 0;
        }
        return 2;
    }

    public static a3.l h(t tVar) {
        tVar.i();
        return new a3.l(tVar.e(6), tVar.e(6), tVar.e(3) - 1);
    }

    public static f2.i i(f2.t r19, boolean r20, int r21, f2.i r22) {
        throw new UnsupportedOperationException("Method not decompiled: f2.p.i(f2.t, boolean, int, f2.i):f2.i");
    }

    public static com.google.android.gms.internal.cast.a j(int i10, int i11, byte[] bArr) {
        byte b10;
        int i12;
        int max;
        int max2;
        int i13 = i10 + 2;
        while (true) {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0 || i11 <= i13) {
                break;
            }
        }
        if (b10 != 0 && i11 > i13) {
            t tVar = new t(bArr, i13, i11 + 1);
            while (tVar.b(16)) {
                int e = tVar.e(8);
                int i14 = 0;
                while (e == 255) {
                    i14 += 255;
                    e = tVar.e(8);
                }
                int i15 = i14 + e;
                int e7 = tVar.e(8);
                int i16 = 0;
                while (e7 == 255) {
                    i16 += 255;
                    e7 = tVar.e(8);
                }
                int i17 = i16 + e7;
                if (i17 != 0 && tVar.b(i17)) {
                    if (i15 == 176) {
                        int f7 = tVar.f();
                        boolean d10 = tVar.d();
                        if (d10) {
                            i12 = tVar.f();
                        } else {
                            i12 = 0;
                        }
                        int f10 = tVar.f();
                        int i18 = -1;
                        for (int i19 = 0; i19 <= f10; i19++) {
                            i18 = tVar.f();
                            tVar.f();
                            int e10 = tVar.e(6);
                            if (e10 != 63) {
                                if (e10 == 0) {
                                    max = Math.max(0, f7 - 30);
                                } else {
                                    max = Math.max(0, (e10 + f7) - 31);
                                }
                                tVar.e(max);
                                if (d10) {
                                    int e11 = tVar.e(6);
                                    if (e11 != 63) {
                                        if (e11 == 0) {
                                            max2 = Math.max(0, i12 - 30);
                                        } else {
                                            max2 = Math.max(0, (e11 + i12) - 31);
                                        }
                                        tVar.e(max2);
                                    } else {
                                        return null;
                                    }
                                }
                                if (tVar.d()) {
                                    tVar.j(10);
                                }
                            } else {
                                return null;
                            }
                        }
                        return new com.google.android.gms.internal.cast.a(i18);
                    }
                    tVar.j(i17 * 8);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static f2.l k(byte[] r32, int r33, int r34, pi.e r35) {
        throw new UnsupportedOperationException("Method not decompiled: f2.p.k(byte[], int, int, pi.e):f2.l");
    }

    public static pi.e l(int r40, int r41, byte[] r42) {
        throw new UnsupportedOperationException("Method not decompiled: f2.p.l(int, int, byte[]):pi.e");
    }

    public static f2.o m(int r30, int r31, byte[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: f2.p.m(int, int, byte[]):f2.o");
    }

    public static void n(t tVar) {
        int f7 = tVar.f() + 1;
        tVar.j(8);
        for (int i10 = 0; i10 < f7; i10++) {
            tVar.f();
            tVar.f();
            tVar.i();
        }
        tVar.j(20);
    }

    public static ArrayList o(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b10 = asReadOnlyBuffer.get();
                int i10 = (b10 >> 3) & 15;
                if (((b10 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b10 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i11 = 0; i11 < 8; i11++) {
                        byte b11 = asReadOnlyBuffer.get();
                        remaining |= (b11 & Byte.MAX_VALUE) << (i11 * 7);
                        if ((b11 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new r(i10, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int p(int i10, byte[] bArr) {
        int i11;
        synchronized (f8894c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 < i10 - 2) {
                        try {
                            if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                                break;
                            }
                            i12++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        i12 = i10;
                        break;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = d;
                    if (iArr.length <= i13) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
