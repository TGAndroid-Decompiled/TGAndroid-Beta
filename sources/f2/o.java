package f2;

import b2.r0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
public abstract class o {
    public static final byte[] f7732a = {0, 0, 0, 1};
    public static final float[] f7733b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f7734c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
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
        e2.d.g(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        a(zArr);
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

    public static boolean c(byte[] bArr, int i10, b2.s sVar) {
        int i11;
        if (Objects.equals(sVar.f2002r, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(sVar.f2002r, "video/hevc")) {
            a3.l e = e(new a4.h(bArr, 4, i10 + 4));
            int i12 = e.f140a;
            if (i12 != 35) {
                if (i12 <= 14 && i12 % 2 == 0 && e.f142c == sVar.I - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static int d(b2.s sVar) {
        if (Objects.equals(sVar.f2002r, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(sVar.f2002r, "video/hevc") && r0.b(sVar.f1995k, "video/hevc") == null) {
            return 0;
        }
        return 2;
    }

    public static a3.l e(a4.h hVar) {
        hVar.s();
        return new a3.l(hVar.i(6), hVar.i(6), hVar.i(3) - 1);
    }

    public static f2.h f(a4.h r19, boolean r20, int r21, f2.h r22) {
        throw new UnsupportedOperationException("Method not decompiled: f2.o.f(a4.h, boolean, int, f2.h):f2.h");
    }

    public static com.google.android.gms.internal.cast.a g(int i10, int i11, byte[] bArr) {
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
            a4.h hVar = new a4.h(bArr, i13, i11 + 1);
            while (hVar.d(16)) {
                int i14 = hVar.i(8);
                int i15 = 0;
                while (i14 == 255) {
                    i15 += 255;
                    i14 = hVar.i(8);
                }
                int i16 = i15 + i14;
                int i17 = hVar.i(8);
                int i18 = 0;
                while (i17 == 255) {
                    i18 += 255;
                    i17 = hVar.i(8);
                }
                int i19 = i18 + i17;
                if (i19 != 0 && hVar.d(i19)) {
                    if (i16 == 176) {
                        int m10 = hVar.m();
                        boolean h = hVar.h();
                        if (h) {
                            i12 = hVar.m();
                        } else {
                            i12 = 0;
                        }
                        int m11 = hVar.m();
                        int i20 = -1;
                        for (int i21 = 0; i21 <= m11; i21++) {
                            i20 = hVar.m();
                            hVar.m();
                            int i22 = hVar.i(6);
                            if (i22 != 63) {
                                if (i22 == 0) {
                                    max = Math.max(0, m10 - 30);
                                } else {
                                    max = Math.max(0, (i22 + m10) - 31);
                                }
                                hVar.i(max);
                                if (h) {
                                    int i23 = hVar.i(6);
                                    if (i23 != 63) {
                                        if (i23 == 0) {
                                            max2 = Math.max(0, i12 - 30);
                                        } else {
                                            max2 = Math.max(0, (i23 + i12) - 31);
                                        }
                                        hVar.i(max2);
                                    } else {
                                        return null;
                                    }
                                }
                                if (hVar.h()) {
                                    hVar.t(10);
                                }
                            } else {
                                return null;
                            }
                        }
                        return new com.google.android.gms.internal.cast.a(i20);
                    }
                    hVar.t(i19 * 8);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static f2.k h(byte[] r32, int r33, int r34, ki.f r35) {
        throw new UnsupportedOperationException("Method not decompiled: f2.o.h(byte[], int, int, ki.f):f2.k");
    }

    public static ki.f i(int r40, int r41, byte[] r42) {
        throw new UnsupportedOperationException("Method not decompiled: f2.o.i(int, int, byte[]):ki.f");
    }

    public static f2.n j(int r30, int r31, byte[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: f2.o.j(int, int, byte[]):f2.n");
    }

    public static void k(a4.h hVar) {
        int m10 = hVar.m() + 1;
        hVar.t(8);
        for (int i10 = 0; i10 < m10; i10++) {
            hVar.m();
            hVar.m();
            hVar.s();
        }
        hVar.t(20);
    }

    public static ArrayList l(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
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
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + remaining);
            arrayList.add(new q(i10, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
        }
        return arrayList;
    }

    public static int m(int i10, byte[] bArr) {
        int i11;
        synchronized (f7734c) {
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
