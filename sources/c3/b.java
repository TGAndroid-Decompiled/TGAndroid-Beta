package c3;

import android.util.Base64;
import b2.p0;
import b2.s0;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.js0;
public abstract class b {
    public static final int[] f4127a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f4128b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] f4129c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};
    public static final int[] f4130f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f4131g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] f4132i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] f4133j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f4134k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f4135l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f4136m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f4137n = {5, 8, 10, 12};
    public static final int[] f4138o = {6, 9, 12, 15};
    public static final int[] f4139p = {2, 4, 6, 8};
    public static final int[] f4140q = {9, 11, 13, 16};
    public static final int[] f4141r = {5, 8, 10, 12};
    public static final String[] f4142s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f4143t = {44100, 48000, 32000};
    public static final int[] f4144u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f4145w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f4146x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f4147y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean b(e2.v r19, c3.u r20, int r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: c3.b.b(e2.v, c3.u, int, c3.s):boolean");
    }

    public static void c(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw s0.a(null, str);
    }

    public static void d(long j3, e2.v vVar, h0[] h0VarArr) {
        int i10;
        int i11;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (vVar.a() > 1) {
                int i12 = 0;
                while (true) {
                    if (vVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int x10 = vVar.x();
                    i12 += x10;
                    if (x10 != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (vVar.a() == 0) {
                        i13 = -1;
                        break;
                    }
                    int x11 = vVar.x();
                    i13 += x11;
                    if (x11 != 255) {
                        break;
                    }
                }
                int i14 = vVar.f7235b + i13;
                if (i13 != -1 && i13 <= vVar.a()) {
                    if (i10 == 4 && i13 >= 8) {
                        int x12 = vVar.x();
                        int D = vVar.D();
                        if (D == 49) {
                            i11 = vVar.j();
                        } else {
                            i11 = 0;
                        }
                        int x13 = vVar.x();
                        if (D == 47) {
                            vVar.K(1);
                        }
                        if (x12 == 181 && ((D == 49 || D == 47) && x13 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (D == 49) {
                            if (i11 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            e(j3, vVar, h0VarArr);
                        }
                    }
                } else {
                    e2.a.n("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = vVar.f7236c;
                }
                vVar.J(i14);
            } else {
                return;
            }
        }
    }

    public static void e(long j3, e2.v vVar, h0[] h0VarArr) {
        boolean z10;
        int x10 = vVar.x();
        if ((x10 & 64) != 0) {
            vVar.K(1);
            int i10 = (x10 & 31) * 3;
            int i11 = vVar.f7235b;
            for (h0 h0Var : h0VarArr) {
                vVar.J(i11);
                h0Var.d(i10, vVar);
                if (j3 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                h0Var.c(j3, 1, i10, 0, null);
            }
        }
    }

    public static int f(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && i12 < 19) {
            int i13 = d[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + h[i12]) * 2;
            }
            int i14 = f4131g[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static void g(int i10, e2.v vVar) {
        vVar.G(7);
        byte[] bArr = vVar.f7234a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
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
        int i17 = f4143t[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f4144u[i13 - 1];
            } else {
                i16 = v[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f4145w[i13 - 1];
            } else {
                i15 = f4146x[i13 - 1];
            }
        } else {
            i15 = f4147y[i13 - 1];
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

    public static a4.h j(byte[] bArr) {
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
            a4.h hVar = new a4.h(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                a4.h hVar2 = new a4.h(copyOf, copyOf.length);
                while (hVar2.b() >= 16) {
                    hVar2.t(2);
                    int i12 = hVar2.i(14) & 16383;
                    int min = Math.min(8 - hVar.d, 14);
                    int i13 = hVar.d;
                    int i14 = (8 - i13) - min;
                    byte[] bArr2 = hVar.f254b;
                    int i15 = hVar.f255c;
                    byte b13 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr2[i15]);
                    bArr2[i15] = b13;
                    int i16 = 14 - min;
                    bArr2[i15] = (byte) (b13 | ((i12 >>> i16) << i14));
                    int i17 = i15 + 1;
                    while (i16 > 8) {
                        hVar.f254b[i17] = (byte) (i12 >>> (i16 - 8));
                        i16 -= 8;
                        i17++;
                    }
                    int i18 = 8 - i16;
                    byte[] bArr3 = hVar.f254b;
                    byte b14 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                    bArr3[i17] = b14;
                    bArr3[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b14);
                    hVar.t(14);
                    hVar.a();
                }
            }
            hVar.o(copyOf.length, copyOf);
            return hVar;
        }
        return new a4.h(bArr, bArr.length);
    }

    public static long k(byte b10, byte b11) {
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

    public static int l(a4.h hVar) {
        int i10 = hVar.i(4);
        if (i10 == 15) {
            if (hVar.b() >= 24) {
                return hVar.i(24);
            }
            throw s0.a(null, "AAC header insufficient data");
        } else if (i10 < 13) {
            return f4127a[i10];
        } else {
            throw s0.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static a3.l m(a4.h r9) {
        throw new UnsupportedOperationException("Method not decompiled: c3.b.m(a4.h):a3.l");
    }

    public static a n(a4.h hVar, boolean z10) {
        int i10 = hVar.i(5);
        if (i10 == 31) {
            i10 = hVar.i(6) + 32;
        }
        int l4 = l(hVar);
        int i11 = hVar.i(4);
        String j3 = hc.b.j(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            l4 = l(hVar);
            int i12 = hVar.i(5);
            if (i12 == 31) {
                i12 = hVar.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = hVar.i(4);
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
                        throw s0.c("Unsupported audio object type: " + i10);
                }
            }
            if (hVar.h()) {
                e2.a.n("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (hVar.h()) {
                hVar.t(14);
            }
            boolean h10 = hVar.h();
            if (i11 != 0) {
                if (i10 == 6 || i10 == 20) {
                    hVar.t(3);
                }
                if (h10) {
                    if (i10 == 22) {
                        hVar.t(16);
                    }
                    if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        hVar.t(3);
                    }
                    hVar.t(1);
                }
                switch (i10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i13 = hVar.i(2);
                        if (i13 == 2 || i13 == 3) {
                            throw s0.c("Unsupported epConfig: " + i13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i14 = f4128b[i11];
        if (i14 != -1) {
            ?? obj = new Object();
            obj.f4123b = l4;
            obj.f4124c = i14;
            obj.f4122a = j3;
            return obj;
        }
        throw s0.a(null, null);
    }

    public static void o(a4.h hVar, c cVar) {
        int i10 = hVar.i(5);
        hVar.t(2);
        if (hVar.h()) {
            hVar.t(5);
        }
        if (i10 >= 7 && i10 <= 10) {
            hVar.s();
        }
        if (hVar.h()) {
            int i11 = hVar.i(3);
            if (cVar.f4149b == -1 && i10 >= 0 && i10 <= 15 && (i11 == 0 || i11 == 1)) {
                cVar.f4149b = i10;
            }
            if (hVar.h()) {
                w(hVar);
            }
        }
    }

    public static void p(a4.h hVar, c cVar) {
        hVar.t(2);
        boolean h10 = hVar.h();
        int i10 = hVar.i(8);
        for (int i11 = 0; i11 < i10; i11++) {
            hVar.t(2);
            if (hVar.h()) {
                hVar.t(5);
            }
            if (h10) {
                hVar.t(24);
            } else {
                if (hVar.h()) {
                    if (!hVar.h()) {
                        hVar.t(4);
                    }
                    cVar.f4150c = hVar.i(6) + 1;
                }
                hVar.t(4);
            }
        }
        if (hVar.h()) {
            hVar.t(3);
            if (hVar.h()) {
                w(hVar);
            }
        }
    }

    public static int q(a4.h hVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && hVar.h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return hVar.i(iArr[i10]) + i12;
    }

    public static p0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = e2.d0.f7188a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                e2.a.n("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(o3.a.d(new e2.v(Base64.decode(split[1], 0))));
                } catch (RuntimeException e7) {
                    e2.a.o("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new t3.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p0(arrayList);
    }

    public static p0 s(p pVar, boolean z10) {
        js0 js0Var;
        if (z10) {
            js0Var = null;
        } else {
            js0Var = q3.i.f40501b;
        }
        e2.v vVar = new e2.v(10);
        p0 p0Var = null;
        int i10 = 0;
        while (true) {
            try {
                pVar.b(0, 10, vVar.f7234a);
                vVar.J(0);
                if (vVar.A() != 4801587) {
                    break;
                }
                vVar.K(3);
                int w10 = vVar.w();
                int i11 = w10 + 10;
                if (p0Var == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(vVar.f7234a, 0, bArr, 0, 10);
                    pVar.b(10, w10, bArr);
                    p0Var = new q3.i(js0Var).c(i11, bArr);
                } else {
                    pVar.j(w10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        pVar.p();
        pVar.j(i10);
        if (p0Var == null || p0Var.f1871a.length == 0) {
            return null;
        }
        return p0Var;
    }

    public static int t(int i10, e2.v vVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return vVar.x() + 1;
            case 7:
                return vVar.D() + 1;
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

    public static n4.y u(e2.v vVar) {
        vVar.K(1);
        int A = vVar.A();
        long j3 = vVar.f7235b + A;
        int i10 = A / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long r10 = vVar.r();
            if (r10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = r10;
            jArr2[i11] = vVar.r();
            vVar.K(2);
            i11++;
        }
        vVar.K((int) (j3 - vVar.f7235b));
        return new n4.y(6, jArr, jArr2);
    }

    public static j0 v(e2.v vVar, boolean z10, boolean z11) {
        if (z10) {
            x(3, vVar, false);
        }
        vVar.v((int) vVar.o(), StandardCharsets.UTF_8);
        long o9 = vVar.o();
        String[] strArr = new String[(int) o9];
        for (int i10 = 0; i10 < o9; i10++) {
            strArr[i10] = vVar.v((int) vVar.o(), StandardCharsets.UTF_8);
        }
        if (z11 && (vVar.x() & 1) == 0) {
            throw s0.a(null, "framing bit expected to be set");
        }
        return new j0(strArr);
    }

    public static void w(a4.h hVar) {
        int i10 = hVar.i(6);
        if (i10 >= 2 && i10 <= 42) {
            hVar.t(i10 * 8);
            return;
        }
        throw s0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i10)));
    }

    public static boolean x(int i10, e2.v vVar, boolean z10) {
        if (vVar.a() < 7) {
            if (!z10) {
                throw s0.a(null, "too short header: " + vVar.a());
            }
            return false;
        } else if (vVar.x() != i10) {
            if (!z10) {
                throw s0.a(null, "expected header type " + Integer.toHexString(i10));
            }
            return false;
        } else if (vVar.x() == 118 && vVar.x() == 111 && vVar.x() == 114 && vVar.x() == 98 && vVar.x() == 105 && vVar.x() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw s0.a(null, "expected characters 'vorbis'");
        }
    }
}
