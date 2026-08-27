package d5;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import p8.l0;

public abstract class a {

    public static final byte[] f4763a = {0, 0, 0, 1};

    public static final String[] f4764b = {"", "A", "B", "C"};

    public static final Object f4765c = new Object();
    public static final byte[] d = {0, 0, 0, 1};

    public static final float[] f4766e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    public static final Object f4767f = new Object();

    public static int[] f4768g = new int[10];
    public static final Object h = new Object();

    public static final Object f4769i = new Object();

    public static boolean f4770j;

    public static long f4771k;

    public static void A(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static r B(int i10, int i11, byte[] bArr) {
        y yVar = new y(bArr, i10 + 2, i11);
        int i12 = 4;
        yVar.s(4);
        int i13 = yVar.i(3);
        yVar.r();
        int i14 = yVar.i(2);
        boolean zH = yVar.h();
        int i15 = yVar.i(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (yVar.h()) {
                i16 |= 1 << i17;
            }
        }
        int i18 = 6;
        int[] iArr = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr[i19] = yVar.i(8);
        }
        int i20 = i16;
        int i21 = yVar.i(8);
        int i22 = 0;
        for (int i23 = 0; i23 < i13; i23++) {
            if (yVar.h()) {
                i22 += 89;
            }
            if (yVar.h()) {
                i22 += 8;
            }
        }
        yVar.s(i22);
        if (i13 > 0) {
            yVar.s((8 - i13) * 2);
        }
        yVar.l();
        int iL = yVar.l();
        if (iL == 3) {
            yVar.r();
        }
        int iL2 = yVar.l();
        int iL3 = yVar.l();
        if (yVar.h()) {
            int iL4 = yVar.l();
            int iL5 = yVar.l();
            int iL6 = yVar.l();
            int iL7 = yVar.l();
            iL2 -= (iL4 + iL5) * ((iL == 1 || iL == 2) ? 2 : 1);
            iL3 -= (iL6 + iL7) * (iL == 1 ? 2 : 1);
        }
        yVar.l();
        yVar.l();
        int iL8 = yVar.l();
        for (int i24 = yVar.h() ? 0 : i13; i24 <= i13; i24++) {
            yVar.l();
            yVar.l();
            yVar.l();
        }
        yVar.l();
        yVar.l();
        yVar.l();
        yVar.l();
        yVar.l();
        yVar.l();
        if (yVar.h() && yVar.h()) {
            int i25 = 0;
            while (i25 < i12) {
                int i26 = 0;
                while (i26 < i18) {
                    if (yVar.h()) {
                        int iMin = Math.min(64, 1 << ((i25 << 1) + 4));
                        if (i25 > 1) {
                            yVar.m();
                        }
                        for (int i27 = 0; i27 < iMin; i27++) {
                            yVar.m();
                        }
                    } else {
                        yVar.l();
                    }
                    i26 += i25 == 3 ? 3 : 1;
                    i18 = 6;
                }
                i25++;
                i12 = 4;
                i18 = 6;
            }
        }
        yVar.s(2);
        if (yVar.h()) {
            yVar.s(8);
            yVar.l();
            yVar.l();
            yVar.r();
        }
        int iL9 = yVar.l();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i28 = -1;
        int i29 = -1;
        int i30 = 0;
        while (i30 < iL9) {
            if (i30 == 0 || !yVar.h()) {
                int iL10 = yVar.l();
                int iL11 = yVar.l();
                int[] iArr2 = new int[iL10];
                for (int i31 = 0; i31 < iL10; i31++) {
                    iArr2[i31] = yVar.l() + 1;
                    yVar.r();
                }
                int[] iArr3 = new int[iL11];
                for (int i32 = 0; i32 < iL11; i32++) {
                    iArr3[i32] = yVar.l() + 1;
                    yVar.r();
                }
                i28 = iL10;
                iArrCopyOf2 = iArr3;
                iArrCopyOf = iArr2;
                i29 = iL11;
            } else {
                int i33 = i28 + i29;
                int iL12 = (1 - ((yVar.h() ? 1 : 0) * 2)) * (yVar.l() + 1);
                int i34 = i33 + 1;
                int[] iArr4 = iArrCopyOf;
                boolean[] zArr = new boolean[i34];
                for (int i35 = 0; i35 <= i33; i35++) {
                    if (yVar.h()) {
                        zArr[i35] = true;
                    } else {
                        zArr[i35] = yVar.h();
                    }
                }
                int[] iArr5 = new int[i34];
                int[] iArr6 = new int[i34];
                int i36 = 0;
                for (int i37 = i29 - 1; i37 >= 0; i37--) {
                    int i38 = iArrCopyOf2[i37] + iL12;
                    if (i38 < 0 && zArr[i28 + i37]) {
                        iArr5[i36] = i38;
                        i36++;
                    }
                }
                if (iL12 < 0 && zArr[i33]) {
                    iArr5[i36] = iL12;
                    i36++;
                }
                int i39 = i36;
                for (int i40 = 0; i40 < i28; i40++) {
                    int i41 = iArr4[i40] + iL12;
                    if (i41 < 0 && zArr[i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i39);
                int i42 = 0;
                for (int i43 = i28 - 1; i43 >= 0; i43--) {
                    int i44 = iArr4[i43] + iL12;
                    if (i44 > 0 && zArr[i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                if (iL12 > 0 && zArr[i33]) {
                    iArr6[i42] = iL12;
                    i42++;
                }
                int i45 = i39;
                int i46 = i42;
                for (int i47 = 0; i47 < i29; i47++) {
                    int i48 = iArrCopyOf2[i47] + iL12;
                    if (i48 > 0 && zArr[i28 + i47]) {
                        iArr6[i46] = i48;
                        i46++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr6, i46);
                i29 = i46;
                i28 = i45;
            }
            i30++;
            iL9 = iL9;
            iL8 = iL8;
        }
        int i49 = iL8;
        if (yVar.h()) {
            for (int i50 = 0; i50 < yVar.l(); i50++) {
                yVar.s(i49 + 5);
            }
        }
        yVar.s(2);
        float f10 = 1.0f;
        if (yVar.h()) {
            if (yVar.h()) {
                int i51 = yVar.i(8);
                if (i51 == 255) {
                    int i52 = yVar.i(16);
                    int i53 = yVar.i(16);
                    if (i52 != 0 && i53 != 0) {
                        f10 = i52 / i53;
                    }
                } else if (i51 < 17) {
                    f10 = f4766e[i51];
                } else {
                    com.google.android.recaptcha.internal.a.s(i51, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (yVar.h()) {
                yVar.r();
            }
            if (yVar.h()) {
                yVar.s(4);
                if (yVar.h()) {
                    yVar.s(24);
                }
            }
            if (yVar.h()) {
                yVar.l();
                yVar.l();
            }
            yVar.r();
            if (yVar.h()) {
                iL3 *= 2;
            }
        }
        return new r(i14, zH, i15, i20, iArr, i21, iL2, iL3, f10);
    }

    public static t C(int i10, int i11, byte[] bArr) {
        int iL;
        boolean zH;
        int iL2;
        boolean z10;
        boolean zH2;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 1;
        y yVar = new y(bArr, i10 + 1, i11);
        int i20 = 8;
        int i21 = yVar.i(8);
        int i22 = yVar.i(8);
        int i23 = yVar.i(8);
        int iL3 = yVar.l();
        if (i21 == 100 || i21 == 110 || i21 == 122 || i21 == 244 || i21 == 44 || i21 == 83 || i21 == 86 || i21 == 118 || i21 == 128 || i21 == 138) {
            iL = yVar.l();
            zH = iL == 3 ? yVar.h() : false;
            yVar.l();
            yVar.l();
            yVar.r();
            if (yVar.h()) {
                int i24 = iL != 3 ? 8 : 12;
                int i25 = 0;
                while (i25 < i24) {
                    if (yVar.h()) {
                        int i26 = i25 < 6 ? 16 : 64;
                        int iM = 8;
                        int i27 = 8;
                        for (int i28 = 0; i28 < i26; i28++) {
                            if (iM != 0) {
                                iM = ((yVar.m() + i27) + 256) % 256;
                            }
                            if (iM != 0) {
                                i27 = iM;
                            }
                        }
                    }
                    i25++;
                }
            }
        } else {
            iL = 1;
            zH = false;
        }
        int iL4 = yVar.l() + 4;
        int iL5 = yVar.l();
        if (iL5 != 0) {
            if (iL5 == 1) {
                boolean zH3 = yVar.h();
                yVar.m();
                yVar.m();
                long jL = yVar.l();
                yVar = yVar;
                for (int i29 = 0; i29 < jL; i29++) {
                    yVar.l();
                }
                z10 = zH3;
                i20 = 8;
                iL2 = 0;
            } else {
                iL2 = 0;
            }
            yVar.l();
            yVar.r();
            int iL6 = yVar.l() + 1;
            int iL7 = yVar.l() + 1;
            zH2 = yVar.h();
            i12 = 2 - (zH2 ? 1 : 0);
            int i30 = iL7 * i12;
            if (!zH2) {
                yVar.r();
            }
            yVar.r();
            i13 = iL6 * 16;
            i14 = i30 * 16;
            if (yVar.h()) {
                int iL8 = yVar.l();
                int iL9 = yVar.l();
                int iL10 = yVar.l();
                int iL11 = yVar.l();
                if (iL != 0) {
                    if (iL == 3) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    i12 *= iL == 1 ? 2 : 1;
                    i19 = i18;
                }
                i13 -= (iL8 + iL9) * i19;
                i14 -= (iL10 + iL11) * i12;
            }
            int i31 = i13;
            f10 = 1.0f;
            if (yVar.h() && yVar.h()) {
                i15 = yVar.i(i20);
                if (i15 == 255) {
                    i16 = yVar.i(16);
                    i17 = yVar.i(16);
                    if (i16 != 0 && i17 != 0) {
                        f10 = i16 / i17;
                    }
                } else if (i15 < 17) {
                    f10 = f4766e[i15];
                } else {
                    com.google.android.recaptcha.internal.a.s(i15, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            return new t(i21, i22, i23, iL3, i31, i14, f10, zH, zH2, iL4, iL5, iL2, z10);
        }
        iL2 = yVar.l() + 4;
        z10 = false;
        yVar.l();
        yVar.r();
        int iL12 = yVar.l() + 1;
        int iL13 = yVar.l() + 1;
        zH2 = yVar.h();
        i12 = 2 - (zH2 ? 1 : 0);
        int i32 = iL13 * i12;
        if (!zH2) {
            yVar.r();
        }
        yVar.r();
        i13 = iL12 * 16;
        i14 = i32 * 16;
        if (yVar.h()) {
            int iL14 = yVar.l();
            int iL15 = yVar.l();
            int iL16 = yVar.l();
            int iL17 = yVar.l();
            if (iL != 0) {
                if (iL == 3) {
                    i18 = 1;
                } else {
                    i18 = 2;
                }
                i12 *= iL == 1 ? 2 : 1;
                i19 = i18;
            }
            i13 -= (iL14 + iL15) * i19;
            i14 -= (iL16 + iL17) * i12;
        }
        int i33 = i13;
        f10 = 1.0f;
        if (yVar.h()) {
            i15 = yVar.i(i20);
            if (i15 == 255) {
                i16 = yVar.i(16);
                i17 = yVar.i(16);
                if (i16 != 0) {
                    f10 = i16 / i17;
                }
            } else if (i15 < 17) {
                f10 = f4766e[i15];
            } else {
                com.google.android.recaptcha.internal.a.s(i15, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
            }
        }
        return new t(i21, i22, i23, iL3, i33, i14, f10, zH, zH2, iL4, iL5, iL2, z10);
    }

    public static long D(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long E(int i10, byte[] bArr) {
        long jD = D(i10, bArr);
        long jD2 = D(i10 + 4, bArr);
        if (jD == 0 && jD2 == 0) {
            return 0L;
        }
        return ((jD2 * 1000) / 4294967296L) + ((jD - 2208988800L) * 1000);
    }

    public static String F(StringBuilder sb2, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb2.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String G(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrU = u(str2);
        if (iArrU[0] != -1) {
            sb2.append(str2);
            F(sb2, iArrU[1], iArrU[2]);
            return sb2.toString();
        }
        int[] iArrU2 = u(str);
        if (iArrU[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrU2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrU[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrU2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = iArrU[1];
        if (i10 != 0) {
            int i11 = iArrU2[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return F(sb2, iArrU[1] + i11, i11 + iArrU[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, iArrU2[1]);
            sb2.append(str2);
            int i12 = iArrU2[1];
            return F(sb2, i12, iArrU[2] + i12);
        }
        int i13 = iArrU2[0] + 2;
        int i14 = iArrU2[1];
        if (i13 >= i14 || i14 != iArrU2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrU2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrU2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return F(sb2, iArrU2[1], i15 + iArrU[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = iArrU2[1];
        return F(sb2, i16, iArrU[2] + i16 + 1);
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(i0.a.k(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static int J(int i10, byte[] bArr) {
        int i11;
        synchronized (f4767f) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f4768g;
                    if (iArr.length <= i13) {
                        f4768g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f4768g[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f4768g[i16] - i15;
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

    public static void K(String str, String str2) {
        synchronized (f4765c) {
            Log.w(str, str2);
        }
    }

    public static void L(String str, String str2, Exception exc) {
        K(str, b(str2, exc));
    }

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        char c10;
        synchronized (f4769i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c10 = 0;
            } else {
                long j10 = jCurrentTimeMillis / 1000;
                Long.signum(j10);
                long j11 = jCurrentTimeMillis - (j10 * 1000);
                long j12 = j10 + 2208988800L;
                c10 = 0;
                bArr[40] = (byte) (j12 >> 24);
                bArr[41] = (byte) (j12 >> 16);
                bArr[42] = (byte) (j12 >> 8);
                bArr[43] = (byte) j12;
                long j13 = (j11 * 4294967296L) / 1000;
                bArr[44] = (byte) (j13 >> 24);
                bArr[45] = (byte) (j13 >> 16);
                bArr[46] = (byte) (j13 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket2.send(datagramPacket);
            datagramSocket2.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j14 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b10 = bArr[c10];
            byte b11 = (byte) ((b10 >> 6) & 3);
            byte b12 = (byte) (b10 & 7);
            int i10 = bArr[1] & 255;
            long jE = E(24, bArr);
            long jE2 = E(32, bArr);
            datagramSocket = datagramSocket2;
            try {
                long jE3 = E(40, bArr);
                l(b11, b12, i10, jE3);
                long j15 = (j14 + (((jE3 - j14) + (jE2 - jE)) / 2)) - jElapsedRealtime2;
                datagramSocket.close();
                return j15;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    datagramSocket.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th) {
        String strReplace;
        synchronized (f4765c) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                } else {
                    strReplace = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbF = s3.c.f(str, "\n  ");
        sbF.append(strReplace.replace("\n", "\n  "));
        sbF.append('\n');
        return sbF.toString();
    }

    public static void c(String str) {
        if (g0.f4795a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        Object[] objArr = {f4764b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        int i14 = g0.f4795a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static void e(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(String str, boolean z10) throws h {
        if (!z10) {
            throw new h(str);
        }
    }

    public static void h(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void l(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(i0.a.k(b11, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(i0.a.k(i10, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void m(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void n(String str, String str2) {
        synchronized (f4765c) {
            Log.d(str, str2);
        }
    }

    public static void o(String str, String str2) {
        synchronized (f4765c) {
            Log.e(str, str2);
        }
    }

    public static void p(String str, String str2, Throwable th) {
        o(str, b(str2, th));
    }

    public static void q() {
        if (g0.f4795a >= 18) {
            Trace.endSection();
        }
    }

    public static int r(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        i(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    m(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static l0 s(h3.f fVar, ArrayList arrayList) {
        p8.x xVar = p8.z.f45604b;
        p8.l.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            h3.g gVarA = fVar.a(bundle);
            gVarA.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, p8.w.d(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = gVarA;
            i10++;
            i11 = i12;
        }
        return p8.z.s(i11, objArrCopyOf);
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int[] u(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void v(String str, String str2) {
        synchronized (f4765c) {
            Log.i(str, str2);
        }
    }

    public static int w(String str) {
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = q.f4823a;
        switch (str2) {
            case "audio/x-flac":
                str2 = "audio/flac";
                break;
            case "audio/x-wav":
                str2 = "audio/wav";
                break;
            case "audio/mp3":
                str2 = "audio/mpeg";
                break;
        }
        switch (str2) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/jpeg":
                return 14;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int x(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
