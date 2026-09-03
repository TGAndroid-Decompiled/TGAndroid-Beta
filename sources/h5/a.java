package h5;

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
import kf.k0;
import org.xmlpull.v1.XmlPullParser;
import s8.i0;
import vh.w2;
public abstract class a {
    public static final byte[] f6904a = {0, 0, 0, 1};
    public static final String[] f6905b = {"", "A", "B", "C"};
    public static final Object f6906c = new Object();
    public static final byte[] d = {0, 0, 0, 1};
    public static final float[] e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f6907f = new Object();
    public static int[] f6908g = new int[10];
    public static final Object h = new Object();
    public static final Object f6909i = new Object();
    public static boolean f6910j;
    public static long f6911k;

    public static void A(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static h5.p B(int r30, int r31, byte[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: h5.a.B(int, int, byte[]):h5.p");
    }

    public static r C(int i10, int i11, byte[] bArr) {
        int l10;
        boolean z4;
        int i12;
        int i13;
        v vVar;
        boolean z10;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        v vVar2 = new v(bArr, i10 + 1, i11);
        int i21 = vVar2.i(8);
        int i22 = vVar2.i(8);
        int i23 = vVar2.i(8);
        int l11 = vVar2.l();
        if (i21 != 100 && i21 != 110 && i21 != 122 && i21 != 244 && i21 != 44 && i21 != 83 && i21 != 86 && i21 != 118 && i21 != 128 && i21 != 138) {
            l10 = 1;
            z4 = false;
        } else {
            l10 = vVar2.l();
            if (l10 == 3) {
                z4 = vVar2.h();
            } else {
                z4 = false;
            }
            vVar2.l();
            vVar2.l();
            vVar2.r();
            if (vVar2.h()) {
                if (l10 != 3) {
                    i12 = 8;
                } else {
                    i12 = 12;
                }
                for (int i24 = 0; i24 < i12; i24++) {
                    if (vVar2.h()) {
                        if (i24 < 6) {
                            i13 = 16;
                        } else {
                            i13 = 64;
                        }
                        int i25 = 8;
                        int i26 = 8;
                        for (int i27 = 0; i27 < i13; i27++) {
                            if (i25 != 0) {
                                i25 = ((vVar2.m() + i26) + 256) % 256;
                            }
                            if (i25 != 0) {
                                i26 = i25;
                            }
                        }
                    }
                }
            }
        }
        int l12 = vVar2.l() + 4;
        int l13 = vVar2.l();
        if (l13 == 0) {
            i14 = vVar2.l() + 4;
            vVar = vVar2;
            z10 = false;
        } else {
            if (l13 == 1) {
                boolean h9 = vVar2.h();
                vVar2.m();
                vVar2.m();
                long l14 = vVar2.l();
                vVar = vVar2;
                for (int i28 = 0; i28 < l14; i28++) {
                    vVar.l();
                }
                z10 = h9;
            } else {
                vVar = vVar2;
                z10 = false;
            }
            i14 = 0;
        }
        vVar.l();
        vVar.r();
        int l15 = vVar.l() + 1;
        boolean h10 = vVar.h();
        int i29 = 2 - (h10 ? 1 : 0);
        int l16 = (vVar.l() + 1) * i29;
        if (!h10) {
            vVar.r();
        }
        vVar.r();
        int i30 = l15 * 16;
        int i31 = l16 * 16;
        if (vVar.h()) {
            int l17 = vVar.l();
            int l18 = vVar.l();
            int l19 = vVar.l();
            int l20 = vVar.l();
            if (l10 == 0) {
                i19 = 1;
            } else {
                if (l10 == 3) {
                    i19 = 1;
                } else {
                    i19 = 2;
                }
                if (l10 == 1) {
                    i20 = 2;
                } else {
                    i20 = 1;
                }
                i29 *= i20;
            }
            i30 -= (l17 + l18) * i19;
            i31 -= (l19 + l20) * i29;
        }
        int i32 = -1;
        float f11 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                int i33 = vVar.i(8);
                if (i33 == 255) {
                    int i34 = vVar.i(16);
                    int i35 = vVar.i(16);
                    if (i34 != 0 && i35 != 0) {
                        f11 = i34 / i35;
                    }
                } else if (i33 < 17) {
                    f11 = e[i33];
                } else {
                    e2.c.q(i33, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (vVar.h()) {
                vVar.r();
            }
            if (vVar.h()) {
                vVar.s(3);
                if (vVar.h()) {
                    i18 = 1;
                } else {
                    i18 = 2;
                }
                if (vVar.h()) {
                    int i36 = vVar.i(8);
                    int i37 = vVar.i(8);
                    vVar.s(8);
                    i32 = i5.b.b(i36);
                    i17 = i5.b.c(i37);
                    i15 = i14;
                    f10 = f11;
                } else {
                    i15 = i14;
                    f10 = f11;
                    i17 = -1;
                }
                i16 = i18;
                return new r(i21, i22, i23, l11, i30, i31, f10, z4, h10, l12, l13, i15, z10, i32, i16, i17);
            }
            i15 = i14;
            f10 = f11;
        } else {
            i15 = i14;
            f10 = 1.0f;
        }
        i16 = -1;
        i17 = -1;
        return new r(i21, i22, i23, l11, i30, i31, f10, z4, h10, l12, l13, i15, z10, i32, i16, i17);
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
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long E(int i10, byte[] bArr) {
        long D = D(i10, bArr);
        long D2 = D(i10 + 4, bArr);
        if (D == 0 && D2 == 0) {
            return 0L;
        }
        return ((D2 * 1000) / 4294967296L) + ((D - 2208988800L) * 1000);
    }

    public static String F(StringBuilder sb, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 >= i11) {
            return sb.toString();
        }
        if (sb.charAt(i10) == '/') {
            i10++;
        }
        int i15 = i10;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb.charAt(i16) == '.') {
                sb.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb.charAt(i16) == '.' && sb.charAt(i17) == '.') {
                    i13 = sb.lastIndexOf("/", i16 - 2) + 1;
                    if (i13 > i10) {
                        i14 = i13;
                    } else {
                        i14 = i10;
                    }
                    sb.delete(i14, i12);
                    i11 -= i12 - i14;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb.toString();
    }

    public static String G(String str, String str2) {
        int i10;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] u10 = u(str2);
        if (u10[0] != -1) {
            sb.append(str2);
            F(sb, u10[1], u10[2]);
            return sb.toString();
        }
        int[] u11 = u(str);
        if (u10[3] == 0) {
            sb.append((CharSequence) str, 0, u11[3]);
            sb.append(str2);
            return sb.toString();
        } else if (u10[2] == 0) {
            sb.append((CharSequence) str, 0, u11[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i11 = u10[1];
            if (i11 != 0) {
                int i12 = u11[0] + 1;
                sb.append((CharSequence) str, 0, i12);
                sb.append(str2);
                return F(sb, u10[1] + i12, i12 + u10[2]);
            } else if (str2.charAt(i11) == '/') {
                sb.append((CharSequence) str, 0, u11[1]);
                sb.append(str2);
                int i13 = u11[1];
                return F(sb, i13, u10[2] + i13);
            } else {
                int i14 = u11[0] + 2;
                int i15 = u11[1];
                if (i14 < i15 && i15 == u11[2]) {
                    sb.append((CharSequence) str, 0, i15);
                    sb.append('/');
                    sb.append(str2);
                    int i16 = u11[1];
                    return F(sb, i16, u10[2] + i16 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, u11[2] - 1);
                if (lastIndexOf == -1) {
                    i10 = u11[1];
                } else {
                    i10 = lastIndexOf + 1;
                }
                sb.append((CharSequence) str, 0, i10);
                sb.append(str2);
                return F(sb, u11[1], i10 + u10[2]);
            }
        }
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(k0.j(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static int J(int i10, byte[] bArr) {
        int i11;
        synchronized (f6907f) {
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
                    int[] iArr = f6908g;
                    if (iArr.length <= i13) {
                        f6908g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f6908g[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f6908g[i16] - i15;
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
        synchronized (f6906c) {
            Log.w(str, str2);
        }
    }

    public static void L(String str, String str2, Exception exc) {
        K(str, b(str2, exc));
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j10;
        char c3;
        synchronized (f6909i) {
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
                c3 = 0;
            } else {
                long j11 = currentTimeMillis / 1000;
                Long.signum(j11);
                long j12 = currentTimeMillis - (j11 * 1000);
                long j13 = j11 + 2208988800L;
                j10 = currentTimeMillis;
                c3 = 0;
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
            byte b10 = bArr[c3];
            byte b11 = (byte) ((b10 >> 6) & 3);
            byte b12 = (byte) (b10 & 7);
            int i10 = bArr[1] & 255;
            long E = E(24, bArr);
            long E2 = E(32, bArr);
            datagramSocket = datagramSocket2;
            try {
                long E3 = E(40, bArr);
                l(b11, b12, i10, E3);
                long j16 = (j15 + (((E3 - j15) + (E2 - E)) / 2)) - elapsedRealtime2;
                datagramSocket.close();
                return j16;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    datagramSocket.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            th = th5;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th2) {
        String replace;
        synchronized (f6906c) {
            try {
                if (th2 == null) {
                    replace = null;
                } else {
                    Throwable th3 = th2;
                    while (true) {
                        if (th3 != null) {
                            if (th3 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th3 = th3.getCause();
                            }
                        } else {
                            replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder f10 = w2.f(str, "\n  ");
            f10.append(replace.replace("\n", "\n  "));
            f10.append('\n');
            return f10.toString();
        }
        return str;
    }

    public static void c(String str) {
        if (d0.f6924a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i10, int i11, int i12, int i13, boolean z4, int[] iArr) {
        char c3;
        String str = f6905b[i10];
        Integer valueOf = Integer.valueOf(i11);
        Integer valueOf2 = Integer.valueOf(i12);
        if (z4) {
            c3 = 'H';
        } else {
            c3 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c3), Integer.valueOf(i13)};
        int i14 = d0.f6924a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb.toString();
    }

    public static void e(String str, boolean z4) {
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void f(boolean z4) {
        if (z4) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void g(String str, boolean z4) {
        if (z4) {
            return;
        }
        throw new Exception(str);
    }

    public static void h(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void i(boolean z4) {
        if (z4) {
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

    public static void l(byte b10, byte b11, int i10, long j10) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(k0.j(b11, "SNTP: Untrusted mode: "));
            }
            if (i10 != 0 && i10 <= 15) {
                if (j10 != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            }
            throw new IOException(k0.j(i10, "SNTP: Untrusted stratum: "));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static void m(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void n(String str, String str2) {
        synchronized (f6906c) {
            Log.d(str, str2);
        }
    }

    public static void o(String str, String str2) {
        synchronized (f6906c) {
            Log.e(str, str2);
        }
    }

    public static void p(String str, String str2, Throwable th2) {
        o(str, b(str2, th2));
    }

    public static void q() {
        if (d0.f6924a >= 18) {
            Trace.endSection();
        }
    }

    public static int r(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i12 = i11 - i10;
        boolean z12 = false;
        if (i12 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        i(z4);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m(zArr);
            return i10 - 1;
        } else {
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
            if (i12 <= 2 ? !(i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !zArr[2] || bArr[i11 - 2] != 0 || bArr[i13] != 1) : !(bArr[i11 - 3] != 0 || bArr[i11 - 2] != 0 || bArr[i13] != 1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[0] = z10;
            if (i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : !(bArr[i11 - 2] != 0 || bArr[i13] != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            zArr[1] = z11;
            if (bArr[i13] == 0) {
                z12 = true;
            }
            zArr[2] = z12;
            return i11;
        }
    }

    public static i0 s(j3.f fVar, ArrayList arrayList) {
        s8.t tVar = s8.v.f44222b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            j3.g c3 = fVar.c(bundle);
            c3.getClass();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i12));
            } else if (z4) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i11] = c3;
                i10++;
                i11++;
            }
            z4 = false;
            objArr[i11] = c3;
            i10++;
            i11++;
        }
        return s8.v.s(i11, objArr);
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
        int i10;
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
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void v(String str, String str2) {
        synchronized (f6906c) {
            Log.i(str, str2);
        }
    }

    public static int w(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: h5.a.w(java.lang.String):int");
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
