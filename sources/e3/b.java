package e3;

import android.util.Base64;
import b8.zb;
import d2.s0;
import d2.v0;
import g2.n0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.p1;
public abstract class b {
    public static final int[] f9408a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f9409b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] f9410c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] f9411e = {24000, 22050, 16000};
    public static final int[] f9412f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f9413g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] f9414i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] f9415j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f9416k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f9417l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f9418m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f9419n = {5, 8, 10, 12};
    public static final int[] f9420o = {6, 9, 12, 15};
    public static final int[] f9421p = {2, 4, 6, 8};
    public static final int[] f9422q = {9, 11, 13, 16};
    public static final int[] f9423r = {5, 8, 10, 12};
    public static final String[] f9424s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f9425t = {44100, 48000, 32000};
    public static final int[] f9426u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f9427w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f9428x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f9429y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static boolean a(g2.y yVar, u uVar, int i3, s sVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        long C = yVar.C();
        long j10 = C >>> 16;
        if (j10 != i3) {
            return false;
        }
        if ((j10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (int) ((C >> 12) & 15);
        int i11 = (int) ((C >> 8) & 15);
        int i12 = (int) ((C >> 4) & 15);
        int i13 = (int) ((C >> 1) & 7);
        if ((C & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i12 <= 7) {
            if (i12 != uVar.f9515g - 1) {
                return false;
            }
        } else if (i12 > 10 || uVar.f9515g != 2) {
            return false;
        }
        if ((i13 != 0 && i13 != uVar.f9516i) || z11) {
            return false;
        }
        try {
            long I = yVar.I();
            if (!z10) {
                I *= uVar.f9511b;
            }
            long j11 = uVar.f9517j;
            if (j11 != 0 && I > j11) {
                return false;
            }
            sVar.f9506a = I;
            int s6 = s(i10, yVar);
            long j12 = uVar.f9517j;
            if (j12 != 0 && I + s6 < j12) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (s6 == -1) {
                return false;
            }
            if ((!z12 && s6 < uVar.f9510a) || s6 > uVar.f9511b) {
                return false;
            }
            int i14 = uVar.f9513e;
            if (i11 != 0) {
                if (i11 <= 11) {
                    if (i11 != uVar.f9514f) {
                        return false;
                    }
                } else if (i11 == 12) {
                    if (yVar.A() * 1000 != i14) {
                        return false;
                    }
                } else if (i11 > 14) {
                    return false;
                } else {
                    int H = yVar.H();
                    if (i11 == 14) {
                        H *= 10;
                    }
                    if (H != i14) {
                        return false;
                    }
                }
            }
            int A = yVar.A();
            int i15 = yVar.f11924b;
            byte[] bArr = yVar.f11923a;
            int i16 = i15 - 1;
            int i17 = 0;
            for (int i18 = yVar.f11924b; i18 < i16; i18++) {
                i17 = n0.f11882l[i17 ^ (bArr[i18] & 255)];
            }
            String str = n0.f11873a;
            if (A != i17) {
                return false;
            }
            if (yVar.a() != 0) {
                int j13 = yVar.j();
                if ((j13 & 128) != 0) {
                    return false;
                }
                int i19 = (j13 & 126) >> 1;
                if ((i19 >= 2 && i19 <= 7) || (i19 >= 13 && i19 <= 31)) {
                    g2.a.g("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i19);
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
        throw v0.a(null, str);
    }

    public static void c(long j10, g2.y yVar, i0[] i0VarArr) {
        int i3;
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (yVar.a() > 1) {
                int i11 = 0;
                while (true) {
                    if (yVar.a() == 0) {
                        i3 = -1;
                        break;
                    }
                    int A = yVar.A();
                    i11 += A;
                    if (A != 255) {
                        i3 = i11;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (yVar.a() == 0) {
                        i12 = -1;
                        break;
                    }
                    int A2 = yVar.A();
                    i12 += A2;
                    if (A2 != 255) {
                        break;
                    }
                }
                int i13 = yVar.f11924b + i12;
                if (i12 != -1 && i12 <= yVar.a()) {
                    if (i3 == 4 && i12 >= 8) {
                        int A3 = yVar.A();
                        int H = yVar.H();
                        if (H == 49) {
                            i10 = yVar.m();
                        } else {
                            i10 = 0;
                        }
                        int A4 = yVar.A();
                        if (H == 47) {
                            yVar.O(1);
                        }
                        if (A3 == 181 && ((H == 49 || H == 47) && A4 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (H == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            d(j10, yVar, i0VarArr);
                        }
                    }
                } else {
                    g2.a.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i13 = yVar.f11925c;
                }
                yVar.N(i13);
            } else {
                return;
            }
        }
    }

    public static void d(long j10, g2.y yVar, i0[] i0VarArr) {
        boolean z10;
        int A = yVar.A();
        if ((A & 64) != 0) {
            yVar.O(1);
            int i3 = (A & 31) * 3;
            int i10 = yVar.f11924b;
            for (i0 i0Var : i0VarArr) {
                yVar.N(i10);
                i0Var.e(i3, yVar);
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.p(z10);
                i0Var.d(j10, 1, i3, 0, null);
            }
        }
    }

    public static int e(int i3, int i10) {
        int i11 = i10 / 2;
        if (i3 >= 0 && i3 < 3 && i10 >= 0 && i11 < 19) {
            int i12 = d[i3];
            if (i12 == 44100) {
                return ((i10 % 2) + h[i11]) * 2;
            }
            int i13 = f9413g[i11];
            if (i12 == 32000) {
                return i13 * 6;
            }
            return i13 * 4;
        }
        return -1;
    }

    public static void f(int i3, g2.y yVar) {
        yVar.K(7);
        byte[] bArr = yVar.f11923a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i3 >> 16) & 255);
        bArr[5] = (byte) ((i3 >> 8) & 255);
        bArr[6] = (byte) (i3 & 255);
    }

    public static int g(byte[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: e3.b.g(byte[]):int");
    }

    public static int h(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i3 & (-2097152)) != -2097152 || (i10 = (i3 >>> 19) & 3) == 1 || (i11 = (i3 >>> 17) & 3) == 0 || (i12 = (i3 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i3 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f9425t[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i3 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = f9426u[i12 - 1];
            } else {
                i15 = v[i12 - 1];
            }
            return (((i15 * 12) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = f9427w[i12 - 1];
            } else {
                i14 = f9428x[i12 - 1];
            }
        } else {
            i14 = f9429y[i12 - 1];
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

    public static int i(int i3) {
        if (i3 != 2147385345 && i3 != -25230976 && i3 != 536864768 && i3 != -14745368) {
            if (i3 != 1683496997 && i3 != 622876772) {
                if (i3 != 1078008818 && i3 != -233094848) {
                    if (i3 != 1908687592 && i3 != -398277519) {
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

    public static int j(int i3) {
        if (i3 != 20) {
            if (i3 != 30) {
                switch (i3) {
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
                        switch (i3) {
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

    public static c4.f k(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 != Byte.MAX_VALUE && b10 != 100 && b10 != 64 && b10 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b12 = copyOf[i3];
                    int i10 = i3 + 1;
                    copyOf[i3] = copyOf[i10];
                    copyOf[i10] = b12;
                }
            }
            c4.f fVar = new c4.f(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                c4.f fVar2 = new c4.f(copyOf, copyOf.length);
                while (fVar2.b() >= 16) {
                    fVar2.L(2);
                    int j10 = fVar2.j(14) & 16383;
                    int min = Math.min(8 - fVar.d, 14);
                    int i11 = fVar.d;
                    int i12 = (8 - i11) - min;
                    byte[] bArr2 = (byte[]) fVar.f4190b;
                    int i13 = fVar.f4191c;
                    byte b13 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr2[i13]);
                    bArr2[i13] = b13;
                    int i14 = 14 - min;
                    bArr2[i13] = (byte) (b13 | ((j10 >>> i14) << i12));
                    int i15 = i13 + 1;
                    while (i14 > 8) {
                        ((byte[]) fVar.f4190b)[i15] = (byte) (j10 >>> (i14 - 8));
                        i14 -= 8;
                        i15++;
                    }
                    int i16 = 8 - i14;
                    byte[] bArr3 = (byte[]) fVar.f4190b;
                    byte b14 = (byte) (bArr3[i15] & ((1 << i16) - 1));
                    bArr3[i15] = b14;
                    bArr3[i15] = (byte) (((j10 & ((1 << i14) - 1)) << i16) | b14);
                    fVar.L(14);
                    fVar.a();
                }
            }
            fVar.H(copyOf.length, copyOf);
            return fVar;
        }
        return new c4.f(bArr, bArr.length);
    }

    public static int l(c4.f fVar) {
        int j10 = fVar.j(4);
        if (j10 == 15) {
            if (fVar.b() >= 24) {
                return fVar.j(24);
            }
            throw v0.a(null, "AAC header insufficient data");
        } else if (j10 < 13) {
            return f9408a[j10];
        } else {
            throw v0.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static a7.d m(c4.f r9) {
        throw new UnsupportedOperationException("Method not decompiled: e3.b.m(c4.f):a7.d");
    }

    public static a n(c4.f fVar, boolean z10) {
        int j10 = fVar.j(5);
        if (j10 == 31) {
            j10 = fVar.j(6) + 32;
        }
        int l10 = l(fVar);
        int j11 = fVar.j(4);
        String i3 = p1.i(j10, "mp4a.40.");
        if (j10 == 5 || j10 == 29) {
            l10 = l(fVar);
            int j12 = fVar.j(5);
            if (j12 == 31) {
                j12 = fVar.j(6) + 32;
            }
            j10 = j12;
            if (j10 == 22) {
                j11 = fVar.j(4);
            }
        }
        if (z10) {
            if (j10 != 1 && j10 != 2 && j10 != 3 && j10 != 4 && j10 != 6 && j10 != 7 && j10 != 17) {
                switch (j10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw v0.c("Unsupported audio object type: " + j10);
                }
            }
            if (fVar.i()) {
                g2.a.l("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (fVar.i()) {
                fVar.L(14);
            }
            boolean i10 = fVar.i();
            if (j11 != 0) {
                if (j10 == 6 || j10 == 20) {
                    fVar.L(3);
                }
                if (i10) {
                    if (j10 == 22) {
                        fVar.L(16);
                    }
                    if (j10 == 17 || j10 == 19 || j10 == 20 || j10 == 23) {
                        fVar.L(3);
                    }
                    fVar.L(1);
                }
                switch (j10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int j13 = fVar.j(2);
                        if (j13 == 2 || j13 == 3) {
                            throw v0.c("Unsupported epConfig: " + j13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i11 = f9409b[j11];
        if (i11 != -1) {
            ?? obj = new Object();
            obj.f9404b = l10;
            obj.f9405c = i11;
            obj.f9403a = i3;
            return obj;
        }
        throw v0.a(null, null);
    }

    public static void o(c4.f fVar, c cVar) {
        int j10 = fVar.j(5);
        fVar.L(2);
        if (fVar.i()) {
            fVar.L(5);
        }
        if (j10 >= 7 && j10 <= 10) {
            fVar.K();
        }
        if (fVar.i()) {
            int j11 = fVar.j(3);
            if (cVar.f9431b == -1 && j10 >= 0 && j10 <= 15 && (j11 == 0 || j11 == 1)) {
                cVar.f9431b = j10;
            }
            if (fVar.i()) {
                v(fVar);
            }
        }
    }

    public static void p(c4.f fVar, c cVar) {
        fVar.L(2);
        boolean i3 = fVar.i();
        int j10 = fVar.j(8);
        for (int i10 = 0; i10 < j10; i10++) {
            fVar.L(2);
            if (fVar.i()) {
                fVar.L(5);
            }
            if (i3) {
                fVar.L(24);
            } else {
                if (fVar.i()) {
                    if (!fVar.i()) {
                        fVar.L(4);
                    }
                    cVar.f9432c = fVar.j(6) + 1;
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

    public static int q(c4.f fVar, int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 3 && fVar.i(); i10++) {
            i3++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            i11 += 1 << iArr[i12];
        }
        return fVar.j(iArr[i3]) + i11;
    }

    public static s0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str = (String) list.get(i3);
            String str2 = n0.f11873a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                g2.a.l("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(q3.a.d(new g2.y(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    g2.a.m("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new v3.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new s0(arrayList);
    }

    public static int s(int i3, g2.y yVar) {
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i3 - 2);
            case 6:
                return yVar.A() + 1;
            case 7:
                return yVar.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i3 - 8);
            default:
                return -1;
        }
    }

    public static tf.b t(g2.y yVar) {
        yVar.O(1);
        int D = yVar.D();
        long j10 = yVar.f11924b + D;
        int i3 = D / 18;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                break;
            }
            long u10 = yVar.u();
            if (u10 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = u10;
            jArr2[i10] = yVar.u();
            yVar.O(2);
            i10++;
        }
        yVar.O((int) (j10 - yVar.f11924b));
        return new tf.b(jArr, jArr2);
    }

    public static k0 u(g2.y yVar, boolean z10, boolean z11) {
        if (z10) {
            w(3, yVar, false);
        }
        yVar.y((int) yVar.r(), StandardCharsets.UTF_8);
        long r5 = yVar.r();
        String[] strArr = new String[(int) r5];
        for (int i3 = 0; i3 < r5; i3++) {
            strArr[i3] = yVar.y((int) yVar.r(), StandardCharsets.UTF_8);
        }
        if (z11 && (yVar.A() & 1) == 0) {
            throw v0.a(null, "framing bit expected to be set");
        }
        return new k0(strArr);
    }

    public static void v(c4.f fVar) {
        int j10 = fVar.j(6);
        if (j10 >= 2 && j10 <= 42) {
            fVar.L(j10 * 8);
            return;
        }
        throw v0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(j10)));
    }

    public static boolean w(int i3, g2.y yVar, boolean z10) {
        if (yVar.a() < 7) {
            if (!z10) {
                throw v0.a(null, "too short header: " + yVar.a());
            }
            return false;
        } else if (yVar.A() != i3) {
            if (!z10) {
                throw v0.a(null, "expected header type " + Integer.toHexString(i3));
            }
            return false;
        } else if (yVar.A() == 118 && yVar.A() == 111 && yVar.A() == 114 && yVar.A() == 98 && yVar.A() == 105 && yVar.A() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw v0.a(null, "expected characters 'vorbis'");
        }
    }
}
