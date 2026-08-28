package j3;

import h3.t1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
public abstract class b {
    public static final int[] f13207a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f13208b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] f13209c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] f13210e = {24000, 22050, 16000};
    public static final int[] f13211f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f13212g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] f13213i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] f13214j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f13215k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f13216l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final String[] f13217m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f13218n = {44100, 48000, 32000};
    public static final int[] f13219o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f13220p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f13221q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f13222r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f13223s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int b(int i9, int i10) {
        int i11 = i10 / 2;
        if (i9 >= 0 && i9 < 3 && i10 >= 0 && i11 < 19) {
            int i12 = d[i9];
            if (i12 == 44100) {
                return ((i10 % 2) + h[i11]) * 2;
            }
            int i13 = f13212g[i11];
            if (i12 == 32000) {
                return i13 * 6;
            }
            return i13 * 4;
        }
        return -1;
    }

    public static void c(int i9, d5.y yVar) {
        yVar.z(7);
        byte[] bArr = yVar.f4410a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i9 >> 16) & 255);
        bArr[5] = (byte) ((i9 >> 8) & 255);
        bArr[6] = (byte) (i9 & 255);
    }

    public static int d(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i9 & (-2097152)) != -2097152 || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f13218n[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = f13219o[i12 - 1];
            } else {
                i15 = f13220p[i12 - 1];
            }
            return (((i15 * 12) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = f13221q[i12 - 1];
            } else {
                i14 = f13222r[i12 - 1];
            }
        } else {
            i14 = f13223s[i12 - 1];
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

    public static long e(byte b10, byte b11) {
        int i9;
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i9 = 2;
            if (i12 != 1 && i12 != 2) {
                i9 = b11 & 63;
            }
        } else {
            i9 = 1;
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
        return i9 * i10;
    }

    public static int f(d5.x xVar) {
        int i9 = xVar.i(4);
        if (i9 == 15) {
            if (xVar.b() >= 24) {
                return xVar.i(24);
            }
            throw t1.a("AAC header insufficient data", null);
        } else if (i9 < 13) {
            return f13207a[i9];
        } else {
            throw t1.a("AAC header wrong Sampling Frequency Index", null);
        }
    }

    public static a8.b g(d5.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: j3.b.g(d5.x):a8.b");
    }

    public static a h(d5.x xVar, boolean z10) {
        int i9 = xVar.i(5);
        if (i9 == 31) {
            i9 = xVar.i(6) + 32;
        }
        int f10 = f(xVar);
        int i10 = xVar.i(4);
        String l10 = r0.l(i9, "mp4a.40.");
        if (i9 == 5 || i9 == 29) {
            f10 = f(xVar);
            int i11 = xVar.i(5);
            if (i11 == 31) {
                i11 = xVar.i(6) + 32;
            }
            i9 = i11;
            if (i9 == 22) {
                i10 = xVar.i(4);
            }
        }
        if (z10) {
            if (i9 != 1 && i9 != 2 && i9 != 3 && i9 != 4 && i9 != 6 && i9 != 7 && i9 != 17) {
                switch (i9) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw t1.c("Unsupported audio object type: " + i9);
                }
            }
            if (xVar.h()) {
                d5.a.K("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (xVar.h()) {
                xVar.s(14);
            }
            boolean h10 = xVar.h();
            if (i10 != 0) {
                if (i9 == 6 || i9 == 20) {
                    xVar.s(3);
                }
                if (h10) {
                    if (i9 == 22) {
                        xVar.s(16);
                    }
                    if (i9 == 17 || i9 == 19 || i9 == 20 || i9 == 23) {
                        xVar.s(3);
                    }
                    xVar.s(1);
                }
                switch (i9) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i12 = xVar.i(2);
                        if (i12 == 2 || i12 == 3) {
                            throw t1.c("Unsupported epConfig: " + i12);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i13 = f13208b[i10];
        if (i13 != -1) {
            ?? obj = new Object();
            obj.f13204a = f10;
            obj.f13205b = i13;
            obj.f13206c = l10;
            return obj;
        }
        throw t1.a(null, null);
    }

    public static int i(int i9) {
        int i10;
        int i11;
        if ((i9 & (-2097152)) == -2097152 && (i10 = (i9 >>> 19) & 3) != 1 && (i11 = (i9 >>> 17) & 3) != 0) {
            int i12 = (i9 >>> 12) & 15;
            int i13 = (i9 >>> 10) & 3;
            if (i12 != 0 && i12 != 15 && i13 != 3) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            return 384;
                        }
                        throw new IllegalArgumentException();
                    }
                    return 1152;
                } else if (i10 == 3) {
                    return 1152;
                } else {
                    return 576;
                }
            }
        }
        return -1;
    }
}
