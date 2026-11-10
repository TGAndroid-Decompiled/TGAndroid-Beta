package f3;

import a8.ia;
import android.util.Base64;
import e2.q0;
import e2.t0;
import h2.m0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class b {
    public static final int[] f10975a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f10976b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] f10977c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] f10978e = {24000, 22050, 16000};
    public static final int[] f10979f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f10980g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] f10981i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] f10982j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f10983k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f10984l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f10985m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f10986n = {5, 8, 10, 12};
    public static final int[] f10987o = {6, 9, 12, 15};
    public static final int[] f10988p = {2, 4, 6, 8};
    public static final int[] f10989q = {9, 11, 13, 16};
    public static final int[] f10990r = {5, 8, 10, 12};
    public static final String[] f10991s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f10992t = {44100, 48000, 32000};
    public static final int[] f10993u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f10994w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f10995x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f10996y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static boolean a(h2.x xVar, u uVar, int i7, s sVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        long C = xVar.C();
        long j3 = C >>> 16;
        if (j3 != i7) {
            return false;
        }
        if ((j3 & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = (int) ((C >> 12) & 15);
        int i11 = (int) ((C >> 8) & 15);
        int i12 = (int) ((C >> 4) & 15);
        int i13 = (int) ((C >> 1) & 7);
        if ((C & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 <= 7) {
            if (i12 != uVar.f11084g - 1) {
                return false;
            }
        } else if (i12 > 10 || uVar.f11084g != 2) {
            return false;
        }
        if ((i13 != 0 && i13 != uVar.f11085i) || z10) {
            return false;
        }
        try {
            long I = xVar.I();
            if (!z9) {
                I *= uVar.f11080b;
            }
            long j10 = uVar.f11086j;
            if (j10 != 0 && I > j10) {
                return false;
            }
            sVar.f11075a = I;
            int s5 = s(i10, xVar);
            long j11 = uVar.f11086j;
            if (j11 != 0 && I + s5 < j11) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (s5 == -1) {
                return false;
            }
            if ((!z11 && s5 < uVar.f11079a) || s5 > uVar.f11080b) {
                return false;
            }
            int i14 = uVar.f11082e;
            if (i11 != 0) {
                if (i11 <= 11) {
                    if (i11 != uVar.f11083f) {
                        return false;
                    }
                } else if (i11 == 12) {
                    if (xVar.A() * 1000 != i14) {
                        return false;
                    }
                } else if (i11 > 14) {
                    return false;
                } else {
                    int H = xVar.H();
                    if (i11 == 14) {
                        H *= 10;
                    }
                    if (H != i14) {
                        return false;
                    }
                }
            }
            int A = xVar.A();
            int i15 = xVar.f14165b;
            byte[] bArr = xVar.f14164a;
            int i16 = i15 - 1;
            int i17 = 0;
            for (int i18 = xVar.f14165b; i18 < i16; i18++) {
                i17 = m0.f14123l[i17 ^ (bArr[i18] & 255)];
            }
            String str = m0.f14114a;
            if (A != i17) {
                return false;
            }
            if (xVar.a() != 0) {
                int j12 = xVar.j();
                if ((j12 & 128) != 0) {
                    return false;
                }
                int i19 = (j12 & 126) >> 1;
                if ((i19 >= 2 && i19 <= 7) || (i19 >= 13 && i19 <= 31)) {
                    h2.a.g("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i19);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void b(String str, boolean z9) {
        if (z9) {
            return;
        }
        throw t0.a(null, str);
    }

    public static void c(long j3, h2.x xVar, j0[] j0VarArr) {
        int i7;
        int i10;
        boolean z9;
        while (true) {
            boolean z10 = true;
            if (xVar.a() > 1) {
                int i11 = 0;
                while (true) {
                    if (xVar.a() == 0) {
                        i7 = -1;
                        break;
                    }
                    int A = xVar.A();
                    i11 += A;
                    if (A != 255) {
                        i7 = i11;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (xVar.a() == 0) {
                        i12 = -1;
                        break;
                    }
                    int A2 = xVar.A();
                    i12 += A2;
                    if (A2 != 255) {
                        break;
                    }
                }
                int i13 = xVar.f14165b + i12;
                if (i12 != -1 && i12 <= xVar.a()) {
                    if (i7 == 4 && i12 >= 8) {
                        int A3 = xVar.A();
                        int H = xVar.H();
                        if (H == 49) {
                            i10 = xVar.m();
                        } else {
                            i10 = 0;
                        }
                        int A4 = xVar.A();
                        if (H == 47) {
                            xVar.O(1);
                        }
                        if (A3 == 181 && ((H == 49 || H == 47) && A4 == 3)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (H == 49) {
                            if (i10 != 1195456820) {
                                z10 = false;
                            }
                            z9 &= z10;
                        }
                        if (z9) {
                            d(j3, xVar, j0VarArr);
                        }
                    }
                } else {
                    h2.a.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i13 = xVar.f14166c;
                }
                xVar.N(i13);
            } else {
                return;
            }
        }
    }

    public static void d(long j3, h2.x xVar, j0[] j0VarArr) {
        boolean z9;
        int A = xVar.A();
        if ((A & 64) != 0) {
            xVar.O(1);
            int i7 = (A & 31) * 3;
            int i10 = xVar.f14165b;
            for (j0 j0Var : j0VarArr) {
                xVar.N(i10);
                j0Var.b(i7, xVar);
                if (j3 != -9223372036854775807L) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                j0Var.c(j3, 1, i7, 0, null);
            }
        }
    }

    public static int e(int i7, int i10) {
        int i11 = i10 / 2;
        if (i7 >= 0 && i7 < 3 && i10 >= 0 && i11 < 19) {
            int i12 = d[i7];
            if (i12 == 44100) {
                return ((i10 % 2) + h[i11]) * 2;
            }
            int i13 = f10980g[i11];
            if (i12 == 32000) {
                return i13 * 6;
            }
            return i13 * 4;
        }
        return -1;
    }

    public static void f(int i7, h2.x xVar) {
        xVar.K(7);
        byte[] bArr = xVar.f14164a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int g(byte[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: f3.b.g(byte[]):int");
    }

    public static int h(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i7 & (-2097152)) != -2097152 || (i10 = (i7 >>> 19) & 3) == 1 || (i11 = (i7 >>> 17) & 3) == 0 || (i12 = (i7 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f10992t[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i7 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = f10993u[i12 - 1];
            } else {
                i15 = v[i12 - 1];
            }
            return (((i15 * 12) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = f10994w[i12 - 1];
            } else {
                i14 = f10995x[i12 - 1];
            }
        } else {
            i14 = f10996y[i12 - 1];
        }
        int i18 = 144;
        if (i10 == 3) {
            return ((i14 * 144) / i16) + i17;
        }
        if (i11 == 1) {
            i18 = 72;
        }
        return ((i18 * i14) / i16) + i17;
    }

    public static int i(int i7) {
        if (i7 != 2147385345 && i7 != -25230976 && i7 != 536864768 && i7 != -14745368) {
            if (i7 != 1683496997 && i7 != 622876772) {
                if (i7 != 1078008818 && i7 != -233094848) {
                    if (i7 != 1908687592 && i7 != -398277519) {
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

    public static int j(int i7) {
        if (i7 != 20) {
            if (i7 != 30) {
                switch (i7) {
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
                        switch (i7) {
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

    public static d4.f k(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 != Byte.MAX_VALUE && b10 != 100 && b10 != 64 && b10 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
                for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                    byte b12 = copyOf[i7];
                    int i10 = i7 + 1;
                    copyOf[i7] = copyOf[i10];
                    copyOf[i10] = b12;
                }
            }
            d4.f fVar = new d4.f(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                d4.f fVar2 = new d4.f(copyOf, copyOf.length);
                while (fVar2.b() >= 16) {
                    fVar2.L(2);
                    int j3 = fVar2.j(14) & 16383;
                    int min = Math.min(8 - fVar.d, 14);
                    int i11 = fVar.d;
                    int i12 = (8 - i11) - min;
                    byte[] bArr2 = (byte[]) fVar.f8167b;
                    int i13 = fVar.f8168c;
                    byte b13 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr2[i13]);
                    bArr2[i13] = b13;
                    int i14 = 14 - min;
                    bArr2[i13] = (byte) (b13 | ((j3 >>> i14) << i12));
                    int i15 = i13 + 1;
                    while (i14 > 8) {
                        ((byte[]) fVar.f8167b)[i15] = (byte) (j3 >>> (i14 - 8));
                        i14 -= 8;
                        i15++;
                    }
                    int i16 = 8 - i14;
                    byte[] bArr3 = (byte[]) fVar.f8167b;
                    byte b14 = (byte) (bArr3[i15] & ((1 << i16) - 1));
                    bArr3[i15] = b14;
                    bArr3[i15] = (byte) (((j3 & ((1 << i14) - 1)) << i16) | b14);
                    fVar.L(14);
                    fVar.a();
                }
            }
            fVar.H(copyOf.length, copyOf);
            return fVar;
        }
        return new d4.f(bArr, bArr.length);
    }

    public static int l(d4.f fVar) {
        int j3 = fVar.j(4);
        if (j3 == 15) {
            if (fVar.b() >= 24) {
                return fVar.j(24);
            }
            throw t0.a(null, "AAC header insufficient data");
        } else if (j3 < 13) {
            return f10975a[j3];
        } else {
            throw t0.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static b7.d m(d4.f r9) {
        throw new UnsupportedOperationException("Method not decompiled: f3.b.m(d4.f):b7.d");
    }

    public static a n(d4.f fVar, boolean z9) {
        int j3 = fVar.j(5);
        if (j3 == 31) {
            j3 = fVar.j(6) + 32;
        }
        int l10 = l(fVar);
        int j10 = fVar.j(4);
        String j11 = jg.g.j(j3, "mp4a.40.");
        if (j3 == 5 || j3 == 29) {
            l10 = l(fVar);
            int j12 = fVar.j(5);
            if (j12 == 31) {
                j12 = fVar.j(6) + 32;
            }
            j3 = j12;
            if (j3 == 22) {
                j10 = fVar.j(4);
            }
        }
        if (z9) {
            if (j3 != 1 && j3 != 2 && j3 != 3 && j3 != 4 && j3 != 6 && j3 != 7 && j3 != 17) {
                switch (j3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw t0.c("Unsupported audio object type: " + j3);
                }
            }
            if (fVar.i()) {
                h2.a.l("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (fVar.i()) {
                fVar.L(14);
            }
            boolean i7 = fVar.i();
            if (j10 != 0) {
                if (j3 == 6 || j3 == 20) {
                    fVar.L(3);
                }
                if (i7) {
                    if (j3 == 22) {
                        fVar.L(16);
                    }
                    if (j3 == 17 || j3 == 19 || j3 == 20 || j3 == 23) {
                        fVar.L(3);
                    }
                    fVar.L(1);
                }
                switch (j3) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int j13 = fVar.j(2);
                        if (j13 == 2 || j13 == 3) {
                            throw t0.c("Unsupported epConfig: " + j13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i10 = f10976b[j10];
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f10967b = l10;
            obj.f10968c = i10;
            obj.f10966a = j11;
            return obj;
        }
        throw t0.a(null, null);
    }

    public static void o(d4.f fVar, c cVar) {
        int j3 = fVar.j(5);
        fVar.L(2);
        if (fVar.i()) {
            fVar.L(5);
        }
        if (j3 >= 7 && j3 <= 10) {
            fVar.K();
        }
        if (fVar.i()) {
            int j10 = fVar.j(3);
            if (cVar.f11000b == -1 && j3 >= 0 && j3 <= 15 && (j10 == 0 || j10 == 1)) {
                cVar.f11000b = j3;
            }
            if (fVar.i()) {
                v(fVar);
            }
        }
    }

    public static void p(d4.f fVar, c cVar) {
        fVar.L(2);
        boolean i7 = fVar.i();
        int j3 = fVar.j(8);
        for (int i10 = 0; i10 < j3; i10++) {
            fVar.L(2);
            if (fVar.i()) {
                fVar.L(5);
            }
            if (i7) {
                fVar.L(24);
            } else {
                if (fVar.i()) {
                    if (!fVar.i()) {
                        fVar.L(4);
                    }
                    cVar.f11001c = fVar.j(6) + 1;
                }
                fVar.L(4);
            }
        }
        if (fVar.i()) {
            fVar.L(3);
            if (fVar.i()) {
                v(fVar);
            }
        }
    }

    public static int q(d4.f fVar, int[] iArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 3 && fVar.i(); i10++) {
            i7++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i7; i12++) {
            i11 += 1 << iArr[i12];
        }
        return fVar.j(iArr[i7]) + i11;
    }

    public static q0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            String str2 = m0.f14114a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                h2.a.l("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(r3.a.d(new h2.x(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    h2.a.m("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new w3.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new q0(arrayList);
    }

    public static int s(int i7, h2.x xVar) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
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
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static q4.q t(h2.x xVar) {
        xVar.O(1);
        int D = xVar.D();
        long j3 = xVar.f14165b + D;
        int i7 = D / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                break;
            }
            long u10 = xVar.u();
            if (u10 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = u10;
            jArr2[i10] = xVar.u();
            xVar.O(2);
            i10++;
        }
        xVar.O((int) (j3 - xVar.f14165b));
        return new q4.q(jArr, jArr2, false, 19);
    }

    public static l0 u(h2.x xVar, boolean z9, boolean z10) {
        if (z9) {
            w(3, xVar, false);
        }
        xVar.y((int) xVar.r(), StandardCharsets.UTF_8);
        long r10 = xVar.r();
        String[] strArr = new String[(int) r10];
        for (int i7 = 0; i7 < r10; i7++) {
            strArr[i7] = xVar.y((int) xVar.r(), StandardCharsets.UTF_8);
        }
        if (z10 && (xVar.A() & 1) == 0) {
            throw t0.a(null, "framing bit expected to be set");
        }
        return new l0(strArr);
    }

    public static void v(d4.f fVar) {
        int j3 = fVar.j(6);
        if (j3 >= 2 && j3 <= 42) {
            fVar.L(j3 * 8);
            return;
        }
        throw t0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(j3)));
    }

    public static boolean w(int i7, h2.x xVar, boolean z9) {
        if (xVar.a() < 7) {
            if (!z9) {
                throw t0.a(null, "too short header: " + xVar.a());
            }
            return false;
        } else if (xVar.A() != i7) {
            if (!z9) {
                throw t0.a(null, "expected header type " + Integer.toHexString(i7));
            }
            return false;
        } else if (xVar.A() == 118 && xVar.A() == 111 && xVar.A() == 114 && xVar.A() == 98 && xVar.A() == 105 && xVar.A() == 115) {
            return true;
        } else {
            if (z9) {
                return false;
            }
            throw t0.a(null, "expected characters 'vorbis'");
        }
    }
}
