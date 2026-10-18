package c3;

import android.util.Base64;
import b2.t0;
import b2.w0;
import e2.m0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.u6;
public abstract class b {
    public static final int[] f4570a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f4571b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] f4572c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};
    public static final int[] f4573f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f4574g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] f4575i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] f4576j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f4577k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f4578l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f4579m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f4580n = {5, 8, 10, 12};
    public static final int[] f4581o = {6, 9, 12, 15};
    public static final int[] f4582p = {2, 4, 6, 8};
    public static final int[] f4583q = {9, 11, 13, 16};
    public static final int[] f4584r = {5, 8, 10, 12};
    public static final String[] f4585s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f4586t = {44100, 48000, 32000};
    public static final int[] f4587u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f4588w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f4589x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f4590y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static boolean a(e2.x xVar, u uVar, int i10, s sVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        long C = xVar.C();
        long j10 = C >>> 16;
        if (j10 != i10) {
            return false;
        }
        if ((j10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (int) ((C >> 12) & 15);
        int i12 = (int) ((C >> 8) & 15);
        int i13 = (int) ((C >> 4) & 15);
        int i14 = (int) ((C >> 1) & 7);
        if ((C & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i13 <= 7) {
            if (i13 != uVar.f4667g - 1) {
                return false;
            }
        } else if (i13 > 10 || uVar.f4667g != 2) {
            return false;
        }
        if ((i14 != 0 && i14 != uVar.f4668i) || z11) {
            return false;
        }
        try {
            long I = xVar.I();
            if (!z10) {
                I *= uVar.f4664b;
            }
            long j11 = uVar.f4669j;
            if (j11 != 0 && I > j11) {
                return false;
            }
            sVar.f4659a = I;
            int s10 = s(i11, xVar);
            long j12 = uVar.f4669j;
            if (j12 != 0 && I + s10 < j12) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (s10 == -1) {
                return false;
            }
            if ((!z12 && s10 < uVar.f4663a) || s10 > uVar.f4664b) {
                return false;
            }
            int i15 = uVar.e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != uVar.f4666f) {
                        return false;
                    }
                } else if (i12 == 12) {
                    if (xVar.A() * 1000 != i15) {
                        return false;
                    }
                } else if (i12 > 14) {
                    return false;
                } else {
                    int H = xVar.H();
                    if (i12 == 14) {
                        H *= 10;
                    }
                    if (H != i15) {
                        return false;
                    }
                }
            }
            int A = xVar.A();
            int i16 = xVar.f8295b;
            byte[] bArr = xVar.f8294a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = xVar.f8295b; i19 < i17; i19++) {
                i18 = m0.f8263l[i18 ^ (bArr[i19] & 255)];
            }
            String str = m0.f8255a;
            if (A != i18) {
                return false;
            }
            if (xVar.a() != 0) {
                int j13 = xVar.j();
                if ((j13 & 128) != 0) {
                    return false;
                }
                int i20 = (j13 & 126) >> 1;
                if ((i20 >= 2 && i20 <= 7) || (i20 >= 13 && i20 <= 31)) {
                    e2.a.g("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i20);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void b(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw w0.a(null, str);
    }

    public static void c(long j10, e2.x xVar, j0[] j0VarArr) {
        int i10;
        int i11;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (xVar.a() > 1) {
                int i12 = 0;
                while (true) {
                    if (xVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int A = xVar.A();
                    i12 += A;
                    if (A != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (xVar.a() == 0) {
                        i13 = -1;
                        break;
                    }
                    int A2 = xVar.A();
                    i13 += A2;
                    if (A2 != 255) {
                        break;
                    }
                }
                int i14 = xVar.f8295b + i13;
                if (i13 != -1 && i13 <= xVar.a()) {
                    if (i10 == 4 && i13 >= 8) {
                        int A3 = xVar.A();
                        int H = xVar.H();
                        if (H == 49) {
                            i11 = xVar.m();
                        } else {
                            i11 = 0;
                        }
                        int A4 = xVar.A();
                        if (H == 47) {
                            xVar.O(1);
                        }
                        if (A3 == 181 && ((H == 49 || H == 47) && A4 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (H == 49) {
                            if (i11 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            d(j10, xVar, j0VarArr);
                        }
                    }
                } else {
                    e2.a.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = xVar.f8296c;
                }
                xVar.N(i14);
            } else {
                return;
            }
        }
    }

    public static void d(long j10, e2.x xVar, j0[] j0VarArr) {
        boolean z10;
        int A = xVar.A();
        if ((A & 64) != 0) {
            xVar.O(1);
            int i10 = (A & 31) * 3;
            int i11 = xVar.f8295b;
            for (j0 j0Var : j0VarArr) {
                xVar.N(i11);
                j0Var.d(i10, xVar);
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                j0Var.c(j10, 1, i10, 0, null);
            }
        }
    }

    public static int e(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && i12 < 19) {
            int i13 = d[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + h[i12]) * 2;
            }
            int i14 = f4574g[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static void f(int i10, e2.x xVar) {
        xVar.K(7);
        byte[] bArr = xVar.f8294a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static int g(byte[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: c3.b.g(byte[]):int");
    }

    public static int h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f4586t[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f4587u[i13 - 1];
            } else {
                i16 = v[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f4588w[i13 - 1];
            } else {
                i15 = f4589x[i13 - 1];
            }
        } else {
            i15 = f4590y[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i17) + i18;
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return ((i19 * i15) / i17) + i18;
    }

    public static int i(int i10) {
        if (i10 != 2147385345 && i10 != -25230976 && i10 != 536864768 && i10 != -14745368) {
            if (i10 != 1683496997 && i10 != 622876772) {
                if (i10 != 1078008818 && i10 != -233094848) {
                    if (i10 != 1908687592 && i10 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static int j(int i10) {
        if (i10 != 20) {
            if (i10 != 30) {
                switch (i10) {
                    case 5:
                        return 80000;
                    case 6:
                        return 768000;
                    case 7:
                        return 192000;
                    case 8:
                        return 2250000;
                    case 9:
                        return 40000;
                    case 10:
                        return 100000;
                    case 11:
                        return 16000;
                    case 12:
                        return 7000;
                    default:
                        switch (i10) {
                            case 14:
                                return 3062500;
                            case 15:
                                return 8000;
                            case 16:
                                return 256000;
                            case 17:
                                return 336000;
                            case 18:
                                return 768000;
                            default:
                                return -2147483647;
                        }
                }
            }
            return 2250000;
        }
        return 63750;
    }

    public static a4.g k(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 != Byte.MAX_VALUE && b10 != 100 && b10 != 64 && b10 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
                for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                    byte b12 = copyOf[i10];
                    int i11 = i10 + 1;
                    copyOf[i10] = copyOf[i11];
                    copyOf[i11] = b12;
                }
            }
            a4.g gVar = new a4.g(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                a4.g gVar2 = new a4.g(copyOf, copyOf.length);
                while (gVar2.b() >= 16) {
                    gVar2.o(2);
                    int g10 = gVar2.g(14) & 16383;
                    int min = Math.min(8 - gVar.d, 14);
                    int i12 = gVar.d;
                    int i13 = (8 - i12) - min;
                    byte[] bArr2 = gVar.f260b;
                    int i14 = gVar.f261c;
                    byte b13 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                    bArr2[i14] = b13;
                    int i15 = 14 - min;
                    bArr2[i14] = (byte) (b13 | ((g10 >>> i15) << i13));
                    int i16 = i14 + 1;
                    while (i15 > 8) {
                        gVar.f260b[i16] = (byte) (g10 >>> (i15 - 8));
                        i15 -= 8;
                        i16++;
                    }
                    int i17 = 8 - i15;
                    byte[] bArr3 = gVar.f260b;
                    byte b14 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                    bArr3[i16] = b14;
                    bArr3[i16] = (byte) (((g10 & ((1 << i15) - 1)) << i17) | b14);
                    gVar.o(14);
                    gVar.a();
                }
            }
            gVar.k(copyOf.length, copyOf);
            return gVar;
        }
        return new a4.g(bArr, bArr.length);
    }

    public static int l(a4.g gVar) {
        int g10 = gVar.g(4);
        if (g10 == 15) {
            if (gVar.b() >= 24) {
                return gVar.g(24);
            }
            throw w0.a(null, "AAC header insufficient data");
        } else if (g10 < 13) {
            return f4570a[g10];
        } else {
            throw w0.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static a3.l m(a4.g r9) {
        throw new UnsupportedOperationException("Method not decompiled: c3.b.m(a4.g):a3.l");
    }

    public static a n(a4.g gVar, boolean z10) {
        int g10 = gVar.g(5);
        if (g10 == 31) {
            g10 = gVar.g(6) + 32;
        }
        int l4 = l(gVar);
        int g11 = gVar.g(4);
        String j10 = i2.d.j(g10, "mp4a.40.");
        if (g10 == 5 || g10 == 29) {
            l4 = l(gVar);
            int g12 = gVar.g(5);
            if (g12 == 31) {
                g12 = gVar.g(6) + 32;
            }
            g10 = g12;
            if (g10 == 22) {
                g11 = gVar.g(4);
            }
        }
        if (z10) {
            if (g10 != 1 && g10 != 2 && g10 != 3 && g10 != 4 && g10 != 6 && g10 != 7 && g10 != 17) {
                switch (g10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw w0.c("Unsupported audio object type: " + g10);
                }
            }
            if (gVar.f()) {
                e2.a.l("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (gVar.f()) {
                gVar.o(14);
            }
            boolean f7 = gVar.f();
            if (g11 != 0) {
                if (g10 == 6 || g10 == 20) {
                    gVar.o(3);
                }
                if (f7) {
                    if (g10 == 22) {
                        gVar.o(16);
                    }
                    if (g10 == 17 || g10 == 19 || g10 == 20 || g10 == 23) {
                        gVar.o(3);
                    }
                    gVar.o(1);
                }
                switch (g10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int g13 = gVar.g(2);
                        if (g13 == 2 || g13 == 3) {
                            throw w0.c("Unsupported epConfig: " + g13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i10 = f4571b[g11];
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f4563b = l4;
            obj.f4564c = i10;
            obj.f4562a = j10;
            return obj;
        }
        throw w0.a(null, null);
    }

    public static void o(a4.g gVar, c cVar) {
        int g10 = gVar.g(5);
        gVar.o(2);
        if (gVar.f()) {
            gVar.o(5);
        }
        if (g10 >= 7 && g10 <= 10) {
            gVar.n();
        }
        if (gVar.f()) {
            int g11 = gVar.g(3);
            if (cVar.f4594b == -1 && g10 >= 0 && g10 <= 15 && (g11 == 0 || g11 == 1)) {
                cVar.f4594b = g10;
            }
            if (gVar.f()) {
                v(gVar);
            }
        }
    }

    public static void p(a4.g gVar, c cVar) {
        gVar.o(2);
        boolean f7 = gVar.f();
        int g10 = gVar.g(8);
        for (int i10 = 0; i10 < g10; i10++) {
            gVar.o(2);
            if (gVar.f()) {
                gVar.o(5);
            }
            if (f7) {
                gVar.o(24);
            } else {
                if (gVar.f()) {
                    if (!gVar.f()) {
                        gVar.o(4);
                    }
                    cVar.f4595c = gVar.g(6) + 1;
                }
                gVar.o(4);
            }
        }
        if (gVar.f()) {
            gVar.o(3);
            if (gVar.f()) {
                v(gVar);
            }
        }
    }

    public static int q(a4.g gVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && gVar.f(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return gVar.g(iArr[i10]) + i12;
    }

    public static t0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = m0.f8255a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                e2.a.l("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(o3.a.d(new e2.x(Base64.decode(split[1], 0))));
                } catch (RuntimeException e7) {
                    e2.a.m("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new t3.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t0(arrayList);
    }

    public static int s(int i10, e2.x xVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return xVar.A() + 1;
            case 7:
                return xVar.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static n4.s t(e2.x xVar) {
        xVar.O(1);
        int D = xVar.D();
        long j10 = xVar.f8295b + D;
        int i10 = D / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long u10 = xVar.u();
            if (u10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = u10;
            jArr2[i11] = xVar.u();
            xVar.O(2);
            i11++;
        }
        xVar.O((int) (j10 - xVar.f8295b));
        return new n4.s(8, jArr, jArr2);
    }

    public static l0 u(e2.x xVar, boolean z10, boolean z11) {
        if (z10) {
            w(3, xVar, false);
        }
        xVar.y((int) xVar.r(), StandardCharsets.UTF_8);
        long r10 = xVar.r();
        String[] strArr = new String[(int) r10];
        for (int i10 = 0; i10 < r10; i10++) {
            strArr[i10] = xVar.y((int) xVar.r(), StandardCharsets.UTF_8);
        }
        if (z11 && (xVar.A() & 1) == 0) {
            throw w0.a(null, "framing bit expected to be set");
        }
        return new l0(strArr);
    }

    public static void v(a4.g gVar) {
        int g10 = gVar.g(6);
        if (g10 >= 2 && g10 <= 42) {
            gVar.o(g10 * 8);
            return;
        }
        throw w0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(g10)));
    }

    public static boolean w(int i10, e2.x xVar, boolean z10) {
        if (xVar.a() < 7) {
            if (!z10) {
                throw w0.a(null, "too short header: " + xVar.a());
            }
            return false;
        } else if (xVar.A() != i10) {
            if (!z10) {
                throw w0.a(null, "expected header type " + Integer.toHexString(i10));
            }
            return false;
        } else if (xVar.A() == 118 && xVar.A() == 111 && xVar.A() == 114 && xVar.A() == 98 && xVar.A() == 105 && xVar.A() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw w0.a(null, "expected characters 'vorbis'");
        }
    }
}
