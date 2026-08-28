package d5;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import j3.r0;
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
import o8.l0;
import org.xmlpull.v1.XmlPullParser;
public abstract class a {
    public static final byte[] f4321a = {0, 0, 0, 1};
    public static final String[] f4322b = {"", "A", "B", "C"};
    public static final Object f4323c = new Object();
    public static final byte[] d = {0, 0, 0, 1};
    public static final float[] f4324e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f4325f = new Object();
    public static int[] f4326g = new int[10];
    public static final Object h = new Object();
    public static final Object f4327i = new Object();
    public static boolean f4328j;
    public static long f4329k;

    public static void A(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static r B(int i9, int i10, byte[] bArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        x xVar = new x(bArr, i9 + 2, i10);
        int i17 = 4;
        xVar.s(4);
        int i18 = xVar.i(3);
        xVar.r();
        int i19 = xVar.i(2);
        boolean h10 = xVar.h();
        int i20 = xVar.i(5);
        int i21 = 0;
        for (int i22 = 0; i22 < 32; i22++) {
            if (xVar.h()) {
                i21 |= 1 << i22;
            }
        }
        int i23 = 6;
        int[] iArr = new int[6];
        for (int i24 = 0; i24 < 6; i24++) {
            iArr[i24] = xVar.i(8);
        }
        int i25 = i21;
        int i26 = xVar.i(8);
        int i27 = 0;
        for (int i28 = 0; i28 < i18; i28++) {
            if (xVar.h()) {
                i27 += 89;
            }
            if (xVar.h()) {
                i27 += 8;
            }
        }
        xVar.s(i27);
        if (i18 > 0) {
            xVar.s((8 - i18) * 2);
        }
        xVar.l();
        int l10 = xVar.l();
        if (l10 == 3) {
            xVar.r();
        }
        int l11 = xVar.l();
        int l12 = xVar.l();
        if (xVar.h()) {
            int l13 = xVar.l();
            int l14 = xVar.l();
            int l15 = xVar.l();
            int l16 = xVar.l();
            if (l10 != 1 && l10 != 2) {
                i15 = 1;
            } else {
                i15 = 2;
            }
            if (l10 == 1) {
                i16 = 2;
            } else {
                i16 = 1;
            }
            l11 -= (l13 + l14) * i15;
            l12 -= (l15 + l16) * i16;
        }
        xVar.l();
        xVar.l();
        int l17 = xVar.l();
        if (xVar.h()) {
            i11 = 0;
        } else {
            i11 = i18;
        }
        for (int i29 = i11; i29 <= i18; i29++) {
            xVar.l();
            xVar.l();
            xVar.l();
        }
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        if (xVar.h() && xVar.h()) {
            int i30 = 0;
            while (i30 < i17) {
                int i31 = 0;
                while (i31 < i23) {
                    if (!xVar.h()) {
                        xVar.l();
                    } else {
                        int min = Math.min(64, 1 << ((i30 << 1) + 4));
                        if (i30 > 1) {
                            xVar.m();
                        }
                        for (int i32 = 0; i32 < min; i32++) {
                            xVar.m();
                        }
                    }
                    if (i30 == 3) {
                        i14 = 3;
                    } else {
                        i14 = 1;
                    }
                    i31 += i14;
                    i23 = 6;
                }
                i30++;
                i17 = 4;
                i23 = 6;
            }
        }
        xVar.s(2);
        if (xVar.h()) {
            xVar.s(8);
            xVar.l();
            xVar.l();
            xVar.r();
        }
        int l18 = xVar.l();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i33 = -1;
        int i34 = -1;
        int i35 = 0;
        while (i35 < l18) {
            if (i35 != 0 && xVar.h()) {
                int i36 = i33 + i34;
                int l19 = (1 - ((xVar.h() ? 1 : 0) * 2)) * (xVar.l() + 1);
                i12 = l18;
                int i37 = i36 + 1;
                int[] iArr4 = iArr2;
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 <= i36; i38++) {
                    if (!xVar.h()) {
                        zArr[i38] = xVar.h();
                    } else {
                        zArr[i38] = true;
                    }
                }
                int[] iArr5 = new int[i37];
                int[] iArr6 = new int[i37];
                int i39 = 0;
                for (int i40 = i34 - 1; i40 >= 0; i40--) {
                    int i41 = iArr3[i40] + l19;
                    if (i41 < 0 && zArr[i33 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (l19 < 0 && zArr[i36]) {
                    iArr5[i39] = l19;
                    i39++;
                }
                int i42 = i39;
                i13 = l17;
                for (int i43 = 0; i43 < i33; i43++) {
                    int i44 = iArr4[i43] + l19;
                    if (i44 < 0 && zArr[i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr5, i42);
                int i45 = 0;
                for (int i46 = i33 - 1; i46 >= 0; i46--) {
                    int i47 = iArr4[i46] + l19;
                    if (i47 > 0 && zArr[i46]) {
                        iArr6[i45] = i47;
                        i45++;
                    }
                }
                if (l19 > 0 && zArr[i36]) {
                    iArr6[i45] = l19;
                    i45++;
                }
                int i48 = i42;
                int i49 = i45;
                for (int i50 = 0; i50 < i34; i50++) {
                    int i51 = iArr3[i50] + l19;
                    if (i51 > 0 && zArr[i33 + i50]) {
                        iArr6[i49] = i51;
                        i49++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr6, i49);
                i34 = i49;
                i33 = i48;
            } else {
                i12 = l18;
                i13 = l17;
                int l20 = xVar.l();
                int l21 = xVar.l();
                int[] iArr7 = new int[l20];
                for (int i52 = 0; i52 < l20; i52++) {
                    iArr7[i52] = xVar.l() + 1;
                    xVar.r();
                }
                int[] iArr8 = new int[l21];
                for (int i53 = 0; i53 < l21; i53++) {
                    iArr8[i53] = xVar.l() + 1;
                    xVar.r();
                }
                i33 = l20;
                iArr3 = iArr8;
                iArr2 = iArr7;
                i34 = l21;
            }
            i35++;
            l18 = i12;
            l17 = i13;
        }
        int i54 = l17;
        if (xVar.h()) {
            for (int i55 = 0; i55 < xVar.l(); i55++) {
                xVar.s(i54 + 5);
            }
        }
        xVar.s(2);
        float f10 = 1.0f;
        if (xVar.h()) {
            if (xVar.h()) {
                int i56 = xVar.i(8);
                if (i56 == 255) {
                    int i57 = xVar.i(16);
                    int i58 = xVar.i(16);
                    if (i57 != 0 && i58 != 0) {
                        f10 = i57 / i58;
                    }
                } else if (i56 < 17) {
                    f10 = f4324e[i56];
                } else {
                    e2.c.t(i56, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (xVar.h()) {
                xVar.r();
            }
            if (xVar.h()) {
                xVar.s(4);
                if (xVar.h()) {
                    xVar.s(24);
                }
            }
            if (xVar.h()) {
                xVar.l();
                xVar.l();
            }
            xVar.r();
            if (xVar.h()) {
                l12 *= 2;
            }
        }
        return new r(i19, h10, i20, i25, iArr, i26, l11, l12, f10);
    }

    public static d5.t C(int r23, int r24, byte[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: d5.a.C(int, int, byte[]):d5.t");
    }

    public static long D(int i9, byte[] bArr) {
        int i10 = bArr[i9];
        int i11 = bArr[i9 + 1];
        int i12 = bArr[i9 + 2];
        int i13 = bArr[i9 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long E(int i9, byte[] bArr) {
        long D = D(i9, bArr);
        long D2 = D(i9 + 4, bArr);
        if (D == 0 && D2 == 0) {
            return 0L;
        }
        return ((D2 * 1000) / 4294967296L) + ((D - 2208988800L) * 1000);
    }

    public static String F(StringBuilder sb2, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i9) == '/') {
            i9++;
        }
        int i14 = i9;
        int i15 = i14;
        while (i14 <= i10) {
            if (i14 == i10) {
                i11 = i14;
            } else if (sb2.charAt(i14) == '/') {
                i11 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb2.charAt(i15) == '.') {
                sb2.delete(i15, i11);
                i10 -= i11 - i15;
            } else {
                if (i14 == i15 + 2 && sb2.charAt(i15) == '.' && sb2.charAt(i16) == '.') {
                    i12 = sb2.lastIndexOf("/", i15 - 2) + 1;
                    if (i12 > i9) {
                        i13 = i12;
                    } else {
                        i13 = i9;
                    }
                    sb2.delete(i13, i11);
                    i10 -= i11 - i13;
                } else {
                    i12 = i14 + 1;
                }
                i15 = i12;
            }
            i14 = i15;
        }
        return sb2.toString();
    }

    public static String G(String str, String str2) {
        int i9;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] u10 = u(str2);
        if (u10[0] != -1) {
            sb2.append(str2);
            F(sb2, u10[1], u10[2]);
            return sb2.toString();
        }
        int[] u11 = u(str);
        if (u10[3] == 0) {
            sb2.append((CharSequence) str, 0, u11[3]);
            sb2.append(str2);
            return sb2.toString();
        } else if (u10[2] == 0) {
            sb2.append((CharSequence) str, 0, u11[2]);
            sb2.append(str2);
            return sb2.toString();
        } else {
            int i10 = u10[1];
            if (i10 != 0) {
                int i11 = u11[0] + 1;
                sb2.append((CharSequence) str, 0, i11);
                sb2.append(str2);
                return F(sb2, u10[1] + i11, i11 + u10[2]);
            } else if (str2.charAt(i10) == '/') {
                sb2.append((CharSequence) str, 0, u11[1]);
                sb2.append(str2);
                int i12 = u11[1];
                return F(sb2, i12, u10[2] + i12);
            } else {
                int i13 = u11[0] + 2;
                int i14 = u11[1];
                if (i13 < i14 && i14 == u11[2]) {
                    sb2.append((CharSequence) str, 0, i14);
                    sb2.append('/');
                    sb2.append(str2);
                    int i15 = u11[1];
                    return F(sb2, i15, u10[2] + i15 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, u11[2] - 1);
                if (lastIndexOf == -1) {
                    i9 = u11[1];
                } else {
                    i9 = lastIndexOf + 1;
                }
                sb2.append((CharSequence) str, 0, i9);
                sb2.append(str2);
                return F(sb2, u11[1], i9 + u10[2]);
            }
        }
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer(r0.l(i9, "csd-"), ByteBuffer.wrap((byte[]) list.get(i9)));
        }
    }

    public static int J(int i9, byte[] bArr) {
        int i10;
        synchronized (f4325f) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                while (true) {
                    if (i11 < i9 - 2) {
                        try {
                            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                                break;
                            }
                            i11++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i11 = i9;
                        break;
                    }
                }
                if (i11 < i9) {
                    int[] iArr = f4326g;
                    if (iArr.length <= i12) {
                        f4326g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f4326g[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i9 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f4326g[i15] - i14;
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

    public static void K(String str, String str2) {
        synchronized (f4323c) {
            Log.w(str, str2);
        }
    }

    public static void L(String str, String str2, Exception exc) {
        K(str, b(str2, exc));
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j10;
        char c10;
        synchronized (f4327i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j10 = currentTimeMillis;
                c10 = 0;
            } else {
                long j11 = currentTimeMillis / 1000;
                Long.signum(j11);
                long j12 = currentTimeMillis - (j11 * 1000);
                long j13 = j11 + 2208988800L;
                j10 = currentTimeMillis;
                c10 = 0;
                bArr[40] = (byte) (j13 >> 24);
                bArr[41] = (byte) (j13 >> 16);
                bArr[42] = (byte) (j13 >> 8);
                bArr[43] = (byte) j13;
                long j14 = (j12 * 4294967296L) / 1000;
                bArr[44] = (byte) (j14 >> 24);
                bArr[45] = (byte) (j14 >> 16);
                bArr[46] = (byte) (j14 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket2.send(datagramPacket);
            datagramSocket2.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j15 = (elapsedRealtime2 - elapsedRealtime) + j10;
            byte b10 = bArr[c10];
            byte b11 = (byte) ((b10 >> 6) & 3);
            byte b12 = (byte) (b10 & 7);
            int i9 = bArr[1] & 255;
            long E = E(24, bArr);
            long E2 = E(32, bArr);
            datagramSocket = datagramSocket2;
            try {
                long E3 = E(40, bArr);
                l(b11, b12, i9, E3);
                long j16 = (j15 + (((E3 - j15) + (E2 - E)) / 2)) - elapsedRealtime2;
                datagramSocket.close();
                return j16;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    datagramSocket.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th) {
        String replace;
        synchronized (f4323c) {
            try {
                if (th == null) {
                    replace = null;
                } else {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } else {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder e10 = ta.b.e(str, "\n  ");
            e10.append(replace.replace("\n", "\n  "));
            e10.append('\n');
            return e10.toString();
        }
        return str;
    }

    public static void c(String str) {
        if (f0.f4349a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i9, int i10, int i11, int i12, boolean z10, int[] iArr) {
        char c10;
        String str = f4322b[i9];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c10), Integer.valueOf(i12)};
        int i13 = f0.f4349a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static void e(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void f(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void g(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new Exception(str);
    }

    public static void h(int i9, int i10) {
        if (i9 >= 0 && i9 < i10) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void i(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void l(byte b10, byte b11, int i9, long j10) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(r0.l(b11, "SNTP: Untrusted mode: "));
            }
            if (i9 != 0 && i9 <= 15) {
                if (j10 != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            }
            throw new IOException(r0.l(i9, "SNTP: Untrusted stratum: "));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static void m(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void n(String str, String str2) {
        synchronized (f4323c) {
            Log.d(str, str2);
        }
    }

    public static void o(String str, String str2) {
        synchronized (f4323c) {
            Log.e(str, str2);
        }
    }

    public static void p(String str, String str2, Throwable th) {
        o(str, b(str2, th));
    }

    public static void q() {
        if (f0.f4349a >= 18) {
            Trace.endSection();
        }
    }

    public static int r(byte[] bArr, int i9, int i10, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = i10 - i9;
        boolean z13 = false;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(z10);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            m(zArr);
            return i9 - 3;
        } else if (i11 > 1 && zArr[1] && bArr[i9] == 1) {
            m(zArr);
            return i9 - 2;
        } else if (i11 > 2 && zArr[2] && bArr[i9] == 0 && bArr[i9 + 1] == 1) {
            m(zArr);
            return i9 - 1;
        } else {
            int i12 = i10 - 1;
            int i13 = i9 + 2;
            while (i13 < i12) {
                byte b10 = bArr[i13];
                if ((b10 & 254) == 0) {
                    int i14 = i13 - 2;
                    if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                        m(zArr);
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

    public static l0 s(h3.f fVar, ArrayList arrayList) {
        o8.x xVar = o8.z.f19105b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i9);
            bundle.getClass();
            h3.g c10 = fVar.c(bundle);
            c10.getClass();
            int i11 = i10 + 1;
            if (objArr.length < i11) {
                objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i11));
            }
            objArr[i10] = c10;
            i9++;
            i10 = i11;
        }
        return o8.z.s(i10, objArr);
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            if (xmlPullParser.getAttributeName(i9).equals(str)) {
                return xmlPullParser.getAttributeValue(i9);
            }
        }
        return null;
    }

    public static int[] u(String str) {
        int i9;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i9 = str.indexOf(47, indexOf4 + 3);
            if (i9 == -1 || i9 > indexOf2) {
                i9 = indexOf2;
            }
        } else {
            i9 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i9;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void v(String str, String str2) {
        synchronized (f4323c) {
            Log.i(str, str2);
        }
    }

    public static int w(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: d5.a.w(java.lang.String):int");
    }

    public static int x(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }
}
