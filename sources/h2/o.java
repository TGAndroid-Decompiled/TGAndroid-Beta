package h2;

import b8.zb;
import d2.v;
import j$.util.Objects;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
public abstract class o {
    public static final byte[] f14158a = {0, 0, 0, 1};
    public static final float[] f14159b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f14160c = new Object();
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

    public static int c(byte[] bArr, int i3, int i10, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = i10 - i3;
        boolean z13 = false;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            b(zArr);
            return i3 - 3;
        } else if (i11 > 1 && zArr[1] && bArr[i3] == 1) {
            b(zArr);
            return i3 - 2;
        } else if (i11 > 2 && zArr[2] && bArr[i3] == 0 && bArr[i3 + 1] == 1) {
            b(zArr);
            return i3 - 1;
        } else {
            int i12 = i10 - 1;
            int i13 = i3 + 2;
            while (i13 < i12) {
                byte b10 = bArr[i13];
                if ((b10 & 254) == 0) {
                    int i14 = i13 - 2;
                    if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                        b(zArr);
                        return i14;
                    }
                    i13 -= 2;
                }
                i13 += 3;
            }
            if (i11 <= 2 ? !(i11 != 2 ? !zArr[1] || bArr[i12] != 1 : !zArr[2] || bArr[i10 - 2] != 0 || bArr[i12] != 1) : !(bArr[i10 - 3] != 0 || bArr[i10 - 2] != 0 || bArr[i12] != 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            zArr[0] = z11;
            if (i11 <= 1 ? !(!zArr[2] || bArr[i12] != 0) : !(bArr[i10 - 2] != 0 || bArr[i12] != 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
            zArr[1] = z12;
            if (bArr[i12] == 0) {
                z13 = true;
            }
            zArr[2] = z13;
            return i10;
        }
    }

    public static String d(v vVar) {
        String str = vVar.f8489s;
        String str2 = vVar.f8481k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (!str2.startsWith("dva1") && !str2.startsWith("dvav")) {
                if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return vVar.f8489s;
    }

    public static long e(byte b10, byte b11) {
        int i3;
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i3 = 2;
            if (i12 != 1 && i12 != 2) {
                i3 = b11 & 63;
            }
        } else {
            i3 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = 2500 << i14;
        } else if (i13 >= 12) {
            i10 = 10000 << (i13 & 1);
        } else if (i14 == 3) {
            i10 = 60000;
        } else {
            i10 = 10000 << i14;
        }
        return i3 * i10;
    }

    public static boolean f(byte[] bArr, int i3, v vVar) {
        int i10;
        if (Objects.equals(vVar.f8489s, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i10 = b10 & 31) == 1 || i10 == 9 || i10 == 14)) {
                return false;
            }
        } else if (Objects.equals(vVar.f8489s, "video/hevc")) {
            a7.d h = h(new s(bArr, 4, i3 + 4));
            int i11 = h.f138a;
            if (i11 != 35) {
                if (i11 <= 14 && i11 % 2 == 0 && h.f140c == vVar.J - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static int g(v vVar) {
        String d10 = d(vVar);
        if (Objects.equals(d10, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(d10, "video/hevc") && !Objects.equals(d10, "video/vvc")) {
            return 0;
        }
        return 2;
    }

    public static a7.d h(s sVar) {
        sVar.i();
        return new a7.d(sVar.e(6), sVar.e(6), sVar.e(3) - 1);
    }

    public static h2.h i(h2.s r19, boolean r20, int r21, h2.h r22) {
        throw new UnsupportedOperationException("Method not decompiled: h2.o.i(h2.s, boolean, int, h2.h):h2.h");
    }

    public static a7.l j(int i3, int i10, byte[] bArr) {
        byte b10;
        int i11;
        int max;
        int max2;
        int i12 = i3 + 2;
        while (true) {
            i10--;
            b10 = bArr[i10];
            if (b10 != 0 || i10 <= i12) {
                break;
            }
        }
        if (b10 != 0 && i10 > i12) {
            s sVar = new s(bArr, i12, i10 + 1);
            while (sVar.b(16)) {
                int e10 = sVar.e(8);
                int i13 = 0;
                while (e10 == 255) {
                    i13 += 255;
                    e10 = sVar.e(8);
                }
                int i14 = i13 + e10;
                int e11 = sVar.e(8);
                int i15 = 0;
                while (e11 == 255) {
                    i15 += 255;
                    e11 = sVar.e(8);
                }
                int i16 = i15 + e11;
                if (i16 != 0 && sVar.b(i16)) {
                    if (i14 == 176) {
                        int f10 = sVar.f();
                        boolean d10 = sVar.d();
                        if (d10) {
                            i11 = sVar.f();
                        } else {
                            i11 = 0;
                        }
                        int f11 = sVar.f();
                        int i17 = -1;
                        for (int i18 = 0; i18 <= f11; i18++) {
                            i17 = sVar.f();
                            sVar.f();
                            int e12 = sVar.e(6);
                            if (e12 != 63) {
                                if (e12 == 0) {
                                    max = Math.max(0, f10 - 30);
                                } else {
                                    max = Math.max(0, (e12 + f10) - 31);
                                }
                                sVar.e(max);
                                if (d10) {
                                    int e13 = sVar.e(6);
                                    if (e13 != 63) {
                                        if (e13 == 0) {
                                            max2 = Math.max(0, i11 - 30);
                                        } else {
                                            max2 = Math.max(0, (e13 + i11) - 31);
                                        }
                                        sVar.e(max2);
                                    } else {
                                        return null;
                                    }
                                }
                                if (sVar.d()) {
                                    sVar.j(10);
                                }
                            } else {
                                return null;
                            }
                        }
                        return new a7.l(i17);
                    }
                    sVar.j(i16 * 8);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static h2.k k(byte[] r32, int r33, int r34, za.p r35) {
        throw new UnsupportedOperationException("Method not decompiled: h2.o.k(byte[], int, int, za.p):h2.k");
    }

    public static za.p l(int r40, int r41, byte[] r42) {
        throw new UnsupportedOperationException("Method not decompiled: h2.o.l(int, int, byte[]):za.p");
    }

    public static h2.n m(int r30, int r31, byte[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: h2.o.m(int, int, byte[]):h2.n");
    }

    public static void n(s sVar) {
        int f10 = sVar.f() + 1;
        sVar.j(8);
        for (int i3 = 0; i3 < f10; i3++) {
            sVar.f();
            sVar.f();
            sVar.i();
        }
        sVar.j(20);
    }

    public static ArrayList o(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b10 = asReadOnlyBuffer.get();
                int i3 = (b10 >> 3) & 15;
                if (((b10 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b10 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i10 = 0; i10 < 8; i10++) {
                        byte b11 = asReadOnlyBuffer.get();
                        remaining |= (b11 & Byte.MAX_VALUE) << (i10 * 7);
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
                arrayList.add(new q(i3, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int p(int i3, byte[] bArr) {
        int i10;
        synchronized (f14160c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i3) {
                while (true) {
                    if (i11 < i3 - 2) {
                        try {
                            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                                break;
                            }
                            i11++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        i11 = i3;
                        break;
                    }
                }
                if (i11 < i3) {
                    int[] iArr = d;
                    if (iArr.length <= i12) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i3 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
