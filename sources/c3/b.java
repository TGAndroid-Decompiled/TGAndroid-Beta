package c3;

import android.util.Base64;
import b2.u0;
import b2.w0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.t6;
public abstract class b {
    public static final int[] f3597a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f3598b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] f3599c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};
    public static final int[] f3600f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f3601g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] f3602i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] f3603j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f3604k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f3605l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f3606m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f3607n = {5, 8, 10, 12};
    public static final int[] f3608o = {6, 9, 12, 15};
    public static final int[] f3609p = {2, 4, 6, 8};
    public static final int[] f3610q = {9, 11, 13, 16};
    public static final int[] f3611r = {5, 8, 10, 12};
    public static final String[] f3612s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f3613t = {44100, 48000, 32000};
    public static final int[] f3614u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f3615w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f3616x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f3617y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

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
            if (i13 != uVar.f3695g - 1) {
                return false;
            }
        } else if (i13 > 10 || uVar.f3695g != 2) {
            return false;
        }
        if ((i14 != 0 && i14 != uVar.f3696i) || z11) {
            return false;
        }
        try {
            long I = xVar.I();
            if (!z10) {
                I *= uVar.f3692b;
            }
            long j11 = uVar.f3697j;
            if (j11 != 0 && I > j11) {
                return false;
            }
            sVar.f3687a = I;
            int s10 = s(i11, xVar);
            long j12 = uVar.f3697j;
            if (j12 != 0 && I + s10 < j12) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (s10 == -1) {
                return false;
            }
            if ((!z12 && s10 < uVar.f3691a) || s10 > uVar.f3692b) {
                return false;
            }
            int i15 = uVar.e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != uVar.f3694f) {
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
            int i16 = xVar.f6208b;
            byte[] bArr = xVar.f6207a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = xVar.f6208b; i19 < i17; i19++) {
                i18 = e2.l0.f6173l[i18 ^ (bArr[i19] & 255)];
            }
            String str = e2.l0.f6165a;
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

    public static void c(long j10, e2.x xVar, k0[] k0VarArr) {
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
                int i14 = xVar.f6208b + i13;
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
                            d(j10, xVar, k0VarArr);
                        }
                    }
                } else {
                    e2.a.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = xVar.f6209c;
                }
                xVar.N(i14);
            } else {
                return;
            }
        }
    }

    public static void d(long j10, e2.x xVar, k0[] k0VarArr) {
        boolean z10;
        int A = xVar.A();
        if ((A & 64) != 0) {
            xVar.O(1);
            int i10 = (A & 31) * 3;
            int i11 = xVar.f6208b;
            for (k0 k0Var : k0VarArr) {
                xVar.N(i11);
                k0Var.d(i10, xVar);
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.p(z10);
                k0Var.c(j10, 1, i10, 0, null);
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
            int i14 = f3601g[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static void f(int i10, e2.x xVar) {
        xVar.K(7);
        byte[] bArr = xVar.f6207a;
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
        int i17 = f3613t[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f3614u[i13 - 1];
            } else {
                i16 = v[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f3615w[i13 - 1];
            } else {
                i15 = f3616x[i13 - 1];
            }
        } else {
            i15 = f3617y[i13 - 1];
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
                    gVar2.f0(2);
                    int i12 = gVar2.i(14) & 16383;
                    int min = Math.min(8 - gVar.d, 14);
                    int i13 = gVar.d;
                    int i14 = (8 - i13) - min;
                    byte[] bArr2 = (byte[]) gVar.f260b;
                    int i15 = gVar.f261c;
                    byte b13 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr2[i15]);
                    bArr2[i15] = b13;
                    int i16 = 14 - min;
                    bArr2[i15] = (byte) (b13 | ((i12 >>> i16) << i14));
                    int i17 = i15 + 1;
                    while (i16 > 8) {
                        ((byte[]) gVar.f260b)[i17] = (byte) (i12 >>> (i16 - 8));
                        i16 -= 8;
                        i17++;
                    }
                    int i18 = 8 - i16;
                    byte[] bArr3 = (byte[]) gVar.f260b;
                    byte b14 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                    bArr3[i17] = b14;
                    bArr3[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b14);
                    gVar.f0(14);
                    gVar.a();
                }
            }
            gVar.b0(copyOf.length, copyOf);
            return gVar;
        }
        return new a4.g(bArr, bArr.length);
    }

    public static int l(a4.g gVar) {
        int i10 = gVar.i(4);
        if (i10 == 15) {
            if (gVar.b() >= 24) {
                return gVar.i(24);
            }
            throw w0.a(null, "AAC header insufficient data");
        } else if (i10 < 13) {
            return f3597a[i10];
        } else {
            throw w0.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static a3.l m(a4.g r9) {
        throw new UnsupportedOperationException("Method not decompiled: c3.b.m(a4.g):a3.l");
    }

    public static a n(a4.g gVar, boolean z10) {
        int i10 = gVar.i(5);
        if (i10 == 31) {
            i10 = gVar.i(6) + 32;
        }
        int l4 = l(gVar);
        int i11 = gVar.i(4);
        String i12 = i0.a.i(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            l4 = l(gVar);
            int i13 = gVar.i(5);
            if (i13 == 31) {
                i13 = gVar.i(6) + 32;
            }
            i10 = i13;
            if (i10 == 22) {
                i11 = gVar.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw w0.c("Unsupported audio object type: " + i10);
                }
            }
            if (gVar.h()) {
                e2.a.l("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (gVar.h()) {
                gVar.f0(14);
            }
            boolean h10 = gVar.h();
            if (i11 != 0) {
                if (i10 == 6 || i10 == 20) {
                    gVar.f0(3);
                }
                if (h10) {
                    if (i10 == 22) {
                        gVar.f0(16);
                    }
                    if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        gVar.f0(3);
                    }
                    gVar.f0(1);
                }
                switch (i10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i14 = gVar.i(2);
                        if (i14 == 2 || i14 == 3) {
                            throw w0.c("Unsupported epConfig: " + i14);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i15 = f3598b[i11];
        if (i15 != -1) {
            ?? obj = new Object();
            obj.f3593b = l4;
            obj.f3594c = i15;
            obj.f3592a = i12;
            return obj;
        }
        throw w0.a(null, null);
    }

    public static void o(a4.g gVar, c cVar) {
        int i10 = gVar.i(5);
        gVar.f0(2);
        if (gVar.h()) {
            gVar.f0(5);
        }
        if (i10 >= 7 && i10 <= 10) {
            gVar.e0();
        }
        if (gVar.h()) {
            int i11 = gVar.i(3);
            if (cVar.f3619b == -1 && i10 >= 0 && i10 <= 15 && (i11 == 0 || i11 == 1)) {
                cVar.f3619b = i10;
            }
            if (gVar.h()) {
                v(gVar);
            }
        }
    }

    public static void p(a4.g gVar, c cVar) {
        gVar.f0(2);
        boolean h10 = gVar.h();
        int i10 = gVar.i(8);
        for (int i11 = 0; i11 < i10; i11++) {
            gVar.f0(2);
            if (gVar.h()) {
                gVar.f0(5);
            }
            if (h10) {
                gVar.f0(24);
            } else {
                if (gVar.h()) {
                    if (!gVar.h()) {
                        gVar.f0(4);
                    }
                    cVar.f3620c = gVar.i(6) + 1;
                }
                gVar.f0(4);
            }
        }
        if (gVar.h()) {
            gVar.f0(3);
            if (gVar.h()) {
                v(gVar);
            }
        }
    }

    public static int q(a4.g gVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && gVar.h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return gVar.i(iArr[i10]) + i12;
    }

    public static u0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = e2.l0.f6165a;
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
        return new u0(arrayList);
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

    public static hf.b t(e2.x xVar) {
        xVar.O(1);
        int D = xVar.D();
        long j10 = xVar.f6208b + D;
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
        xVar.O((int) (j10 - xVar.f6208b));
        return new hf.b(8, jArr, jArr2);
    }

    public static a4.l u(e2.x xVar, boolean z10, boolean z11) {
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
        return new a4.l(strArr, 9);
    }

    public static void v(a4.g gVar) {
        int i10 = gVar.i(6);
        if (i10 >= 2 && i10 <= 42) {
            gVar.f0(i10 * 8);
            return;
        }
        throw w0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i10)));
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
