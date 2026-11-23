package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import j$.util.Objects;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class bz {
    public static boolean A = false;
    public static boolean A0 = false;
    public static boolean A1 = false;
    public static int B = 0;
    public static boolean B0 = false;
    public static az B1 = null;
    public static boolean C = false;
    public static boolean C0 = false;
    public static Boolean C1 = null;
    public static boolean D = false;
    public static boolean D0 = false;
    public static boolean D1 = false;
    public static int E = 0;
    public static boolean E0 = false;
    public static boolean F = false;
    public static boolean F0 = false;
    public static int G = 0;
    public static boolean G0 = false;
    public static int H = 0;
    public static boolean H0 = false;
    public static int I = 0;
    public static boolean I0 = false;
    public static int J = 0;
    public static boolean J0 = false;
    public static int K = 0;
    public static boolean K0 = false;
    public static long L = 0;
    public static boolean L0 = false;
    public static int M = 0;
    public static boolean M0 = false;
    public static long N = 0;
    public static boolean N0 = false;
    public static int O = 0;
    public static boolean O0 = false;
    public static boolean P = false;
    public static boolean P0 = false;
    public static boolean Q = false;
    public static boolean Q0 = false;
    public static boolean R = false;
    public static boolean R0 = false;
    public static int S = 0;
    public static int S0 = 0;
    public static boolean T = false;
    public static boolean T0 = false;
    public static boolean U = false;
    public static boolean U0 = false;
    public static boolean V = false;
    public static boolean V0 = false;
    public static boolean W = false;
    public static int W0 = 0;
    public static boolean X = false;
    public static boolean X0 = false;
    public static boolean Y = false;
    public static int Y0 = 0;
    public static Boolean Z = null;
    public static int Z0 = 0;
    public static int f23270a = -1;
    public static boolean f23271a0;
    public static boolean f23272a1;
    public static boolean f23273b;
    public static boolean f23274b0;
    public static int f23275b1;
    public static Boolean f23276c;
    public static boolean f23277c0;
    public static int f23278c1;
    public static String d;
    public static boolean f23279d0;
    public static int f23280d1;
    public static final HashSet f23281e;
    public static int f23282e0;
    public static int f23283e1;
    public static int f23284f;
    public static int f23285f0;
    public static int f23286f1;
    public static String f23287g;
    public static boolean f23288g0;
    public static boolean f23289g1;
    public static String h;
    public static String f23290h0;
    public static boolean f23291h1;
    public static long f23292i;
    public static String f23293i0;
    public static boolean f23294i1;
    public static long f23295j;
    public static HashMap f23296j0;
    public static TLRPC.TL_help_appUpdate f23297j1;
    public static boolean f23298k;
    public static int f23299k0;
    public static int f23300k1;
    public static byte[] f23301l;
    public static boolean f23302l0;
    public static long l1;
    public static byte[] f23303m;
    public static final Object m0;
    public static boolean f23304m1;
    public static boolean f23305n;
    public static final Object f23306n0;
    public static int n1;
    public static boolean f23307o;
    public static int f23308o0;
    public static int f23309o1;
    public static boolean f23310p;
    public static int f23311p0;
    public static boolean f23312p1;
    public static String f23313q;
    public static final boolean f23314q0;
    public static boolean f23315q1;
    public static int f23316r;
    public static boolean f23317r0;
    public static int f23318r1;
    public static String f23319s;
    public static boolean f23320s0;
    public static int f23321s1;
    public static long f23322t;
    public static boolean f23323t0;
    public static int f23324t1;
    public static long f23325u;
    public static boolean f23326u0;
    public static int f23327u1;
    public static int v;
    public static boolean f23328v0;
    public static int f23329v1;
    public static byte[] f23330w;
    public static boolean f23331w0;
    public static boolean f23332w1;
    public static boolean f23333x;
    public static boolean f23334x0;
    public static boolean f23335x1;
    public static int f23336y;
    public static boolean f23337y0;
    public static final int[] f23338y1;
    public static boolean f23339z;
    public static boolean f23340z0;
    public static final ArrayList f23341z1;

    static {
        boolean z10;
        HashSet hashSet = new HashSet();
        f23281e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f23284f = 2;
        f23287g = "";
        h = "";
        f23319s = "";
        f23330w = new byte[0];
        f23336y = 3600;
        D = true;
        G = 1;
        X = true;
        f23277c0 = true;
        f23282e0 = 2;
        f23285f0 = -210000;
        f23288g0 = true;
        f23293i0 = "";
        m0 = new Object();
        f23306n0 = new Object();
        f23308o0 = 2;
        f23311p0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        f23314q0 = z10;
        f23317r0 = false;
        f23320s0 = true;
        f23323t0 = true;
        f23326u0 = false;
        f23328v0 = true;
        f23331w0 = false;
        f23334x0 = true;
        f23337y0 = true;
        f23340z0 = true;
        A0 = false;
        B0 = true;
        C0 = false;
        D0 = false;
        E0 = true;
        F0 = false;
        G0 = false;
        H0 = false;
        K0 = true;
        Q0 = true;
        R0 = false;
        W0 = 16;
        Y0 = 17;
        Z0 = 16;
        f23324t1 = 3;
        f23327u1 = 3;
        f23329v1 = 3;
        f23338y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        f23341z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i7) {
        G = i7;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i7) {
        if (f23324t1 != i7) {
            f23324t1 = i7;
            t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", f23324t1).apply();
        }
    }

    public static void C(boolean z10) {
        f23332w1 = z10;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", f23332w1);
        edit.apply();
    }

    public static void D(boolean z10) {
        if (A0 == z10) {
            return;
        }
        A0 = z10;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("noSoundHintShowed", A0);
        edit.apply();
    }

    public static void E(int i7) {
        S0 = i7;
        if (i7 < 0 || i7 > 2) {
            S0 = 0;
        }
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putInt("repeatMode", S0);
        edit.apply();
    }

    public static void F(int i7) {
        if (f23327u1 != i7) {
            f23327u1 = i7;
            t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", f23327u1).apply();
        }
    }

    public static void G(boolean z10) {
        U = z10;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("storiesIntroShown", U);
        edit.apply();
    }

    public static void H(boolean z10) {
        T = z10;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("storyReactionsLongPressHint", T);
        edit.apply();
    }

    public static void I(int i7) {
        E = i7;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putInt("suggestStickers", E);
        edit.apply();
    }

    public static void J() {
        f23328v0 = !f23328v0;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("adaptableBrowser", f23328v0);
        edit.apply();
    }

    public static void K() {
        J0 = !J0;
        WebView.setWebContentsDebuggingEnabled(J0);
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("debugWebView", J0);
        edit.apply();
    }

    public static void L() {
        f23279d0 = !f23279d0;
        t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", f23279d0).apply();
    }

    public static void M() {
        f23277c0 = !f23277c0;
        t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", f23277c0).apply();
    }

    public static void N() {
        Y = !Y;
        t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        f23274b0 = !f23274b0;
        t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", f23274b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = mp.g1().edit();
        boolean z10 = !X;
        X = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void Q(int i7) {
        SharedPreferences.Editor edit = t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !s(i7);
        Z = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void R() {
        f23271a0 = !f23271a0;
        t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", f23271a0).apply();
    }

    public static void S(int i7) {
        f23278c1 = i7;
        t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", f23278c1).apply();
    }

    public static void T(int i7) {
        f23282e0 = i7;
        t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", f23282e0).apply();
    }

    public static boolean U(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i7 = 0; i7 < Math.min(split.length, split2.length); i7++) {
            int parseInt = Integer.parseInt(split[i7]);
            int parseInt2 = Integer.parseInt(split2[i7]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
    }

    public static az a(az azVar) {
        u();
        ArrayList arrayList = f23341z1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            az azVar2 = (az) arrayList.get(i7);
            if (Objects.equals(azVar.f23096a, azVar2.f23096a)) {
                return azVar2;
            }
        }
        arrayList.add(0, azVar);
        z();
        return azVar;
    }

    public static boolean b() {
        if (f23276c == null) {
            int codecCount = MediaCodecList.getCodecCount();
            boolean z10 = false;
            int i7 = 0;
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (!codecInfoAt.isEncoder()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        } else if (codecInfoAt.getSupportedTypes()[i11].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i7) {
                                i7 = maxSupportedInstances;
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (i7 >= 8) {
                z10 = true;
            }
            f23276c = Boolean.valueOf(z10);
        }
        return f23276c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(mp.g1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return t0.f27013b.getPackageManager().getPackageInfo(t0.f27013b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static boolean e() {
        int i7;
        int o4 = o();
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        if (o4 >= i7) {
            return true;
        }
        boolean z10 = s2.f26829a;
        return false;
    }

    public static boolean f() {
        if (e() && pc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (f23330w.length == 0) {
            boolean equals = Utilities.a(str).equals(f23319s);
            if (equals) {
                try {
                    f23330w = new byte[16];
                    Utilities.f22875b.nextBytes(f23330w);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(f23330w, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(f23330w, 0, bArr, bytes.length + 16, 16);
                    f23319s = Utilities.f(Utilities.o(length, bArr));
                    y();
                    return equals;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            return equals;
        }
        try {
            byte[] bytes2 = str.getBytes("UTF-8");
            int length2 = bytes2.length + 32;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(f23330w, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(f23330w, 0, bArr2, bytes2.length + 16, 16);
            return f23319s.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e11) {
            a8.g(e11, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && f23290h0 != null && !f23273b && file.getPath().startsWith(f23290h0)) {
            g0.g3(new j2(16));
        }
    }

    public static void i(az azVar) {
        if (B1 == azVar) {
            B1 = null;
            SharedPreferences g12 = mp.g1();
            boolean z10 = g12.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = g12.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_type", 0);
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.apply();
            if (z10) {
                ConnectionsManager.setProxySettings(false, null);
            }
        }
        f23341z1.remove(azVar);
        z();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z10) {
        if (f23320s0) {
            if (!z10 || f23317r0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String l() {
        if (d == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i7 = 0; i7 < codecCount; i7++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                if (codecInfoAt.isEncoder()) {
                    for (int i10 = 0; i10 < codecInfoAt.getSupportedTypes().length; i10++) {
                        if (codecInfoAt.getSupportedTypes()[i10].contains("video/hevc") && codecInfoAt.isHardwareAccelerated()) {
                            boolean z10 = s2.f26829a;
                            if (f23281e.contains(codecInfoAt.getName().toLowerCase())) {
                                String name = codecInfoAt.getName();
                                d = name;
                                return name;
                            }
                        }
                    }
                    continue;
                }
            }
            d = "";
        }
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return d;
    }

    public static int m(int i7) {
        int i10 = f23318r1;
        if (i10 >= 0) {
            if (i10 == 5 && mp.u1(i7).Q0.isEmpty()) {
                return 2;
            }
            return f23318r1;
        } else if (mp.u1(i7).Q0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (f23296j0 == null) {
            f23296j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f23293i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    f23296j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return f23296j0;
    }

    public static int o() {
        int i7 = f23309o1;
        if (i7 != -1) {
            return i7;
        }
        if (n1 == -1) {
            n1 = v();
        }
        return n1;
    }

    public static int p() {
        int i7;
        synchronized (f23306n0) {
            i7 = f23285f0;
            f23285f0 = i7 - 1;
        }
        return i7;
    }

    public static SharedPreferences q() {
        return t0.f27013b.getSharedPreferences("userconfing", 0);
    }

    public static void r() {
        int i7 = v + 1;
        v = i7;
        if (i7 >= 3) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        if (i7 != 6) {
                            if (i7 != 7) {
                                f23322t = 30000L;
                            } else {
                                f23322t = 25000L;
                            }
                        } else {
                            f23322t = 20000L;
                        }
                    } else {
                        f23322t = 15000L;
                    }
                } else {
                    f23322t = 10000L;
                }
            } else {
                f23322t = 5000L;
            }
            f23325u = SystemClock.elapsedRealtime();
        }
        y();
    }

    public static boolean s(int i7) {
        Boolean bool = Z;
        if (bool == null) {
            if (!mp.u1(i7).P5) {
                return true;
            }
            return false;
        }
        return bool.booleanValue();
    }

    public static void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bz.t():void");
    }

    public static void u() {
        if (!A1) {
            SharedPreferences sharedPreferences = t0.f27013b.getSharedPreferences("mainconfig", 0);
            xi.a c10 = xi.a.c(sharedPreferences);
            A1 = true;
            f23341z1.clear();
            B1 = null;
            String string = sharedPreferences.getString("proxy_list", null);
            if (!TextUtils.isEmpty(string)) {
                SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                int readInt32 = serializedData.readInt32(false);
                if (readInt32 == -1) {
                    byte readByte = serializedData.readByte(false);
                    if (readByte != 2 && readByte != 3) {
                        a8.d("Unknown proxy schema version: " + ((int) readByte));
                    } else {
                        int readInt322 = serializedData.readInt32(false);
                        for (int i7 = 0; i7 < readInt322; i7++) {
                            az a10 = az.a(readByte, serializedData);
                            f23341z1.add(0, a10);
                            if (B1 == null && c10.g() && c10.equals(a10.f23096a)) {
                                B1 = a10;
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < readInt32; i10++) {
                        az a11 = az.a(0, serializedData);
                        f23341z1.add(0, a11);
                        if (B1 == null && c10.g() && c10.equals(a11.f23096a)) {
                            B1 = a11;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (B1 == null && c10.g()) {
                az azVar = new az(c10);
                B1 = azVar;
                f23341z1.add(0, azVar);
            }
        }
    }

    public static int v() {
        int ceil;
        long j3;
        String k10;
        int i7 = Build.VERSION.SDK_INT;
        int i10 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) t0.f27013b.getSystemService("activity")).getMemoryClass();
        int i11 = 0;
        if (i7 >= 31 && (k10 = ed.k()) != null) {
            int hashCode = k10.toUpperCase().hashCode();
            int i12 = 0;
            while (true) {
                int[] iArr = f23338y1;
                if (i12 >= iArr.length) {
                    break;
                } else if (iArr[i12] == hashCode) {
                    return 0;
                } else {
                    i12++;
                }
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i15 + "/cpufreq/cpuinfo_max_freq", "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i14 += Utilities.z(readLine).intValue() / 1000;
                    i13++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        if (i13 == 0) {
            ceil = -1;
        } else {
            ceil = (int) Math.ceil(i14 / i13);
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) t0.f27013b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j3 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j3 = -1;
        }
        if (i10 > 2 && memoryClass > 100 && ((i10 > 4 || ceil == -1 || ceil > 1250) && ((i10 > 4 || ceil > 1300 || memoryClass > 128 || i7 > 24) && (j3 == -1 || j3 >= 2147483648L)))) {
            i11 = (i10 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i10 == 8 && i7 <= 23)) ? 1 : 2;
        }
        if (s2.f26829a) {
            StringBuilder n10 = i5.c.n("device performance info selected_class = ", i11, " (cpu_count = ", i10, ", freq = ");
            i5.c.z(n10, ceil, ", memoryClass = ", memoryClass, ", android version ");
            n10.append(i7);
            n10.append(", manufacture ");
            n10.append(Build.MANUFACTURER);
            n10.append(", screenRefreshRate=");
            n10.append(g0.f24227r);
            n10.append(", screenMaxRefreshRate=");
            n10.append(g0.f24228s);
            n10.append(")");
            a8.b(n10.toString());
        }
        return i11;
    }

    public static void w(int i7) {
        SharedPreferences.Editor edit = mp.g1().edit();
        f23309o1 = i7;
        edit.putInt("overrideDevicePerformanceClass", i7).remove("lite_mode").apply();
    }

    public static String x(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return "UNKNOWN";
                }
                return "HIGH";
            }
            return "AVERAGE";
        }
        return "LOW";
    }

    public static void y() {
        String str;
        String str2;
        String str3;
        synchronized (m0) {
            try {
                try {
                    SharedPreferences.Editor edit = t0.f27013b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", f23339z);
                    edit.putString("passcodeHash1", f23319s);
                    byte[] bArr = f23330w;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", f23333x);
                    edit.putInt("passcodeType", f23316r);
                    edit.putLong("passcodeRetryInMs", f23322t);
                    edit.putLong("lastUptimeMillis", f23325u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", f23336y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", f23288g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", f23287g);
                    edit.putInt("pushType", f23284f);
                    edit.putBoolean("pushStatSent", f23298k);
                    byte[] bArr2 = f23301l;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", f23285f0);
                    edit.putString("passportConfigJson", f23293i0);
                    edit.putInt("passportConfigHash", f23299k0);
                    edit.putBoolean("sortContactsByName", L0);
                    edit.putBoolean("sortFilesByName", M0);
                    edit.putInt("textSelectionHintShows", J);
                    edit.putInt("scheduledOrNoSoundHintShows", K);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", L);
                    edit.putInt("scheduledHintShows", M);
                    edit.putLong("scheduledHintSeenAt", N);
                    edit.putBoolean("forwardingOptionsHintShown", P);
                    edit.putBoolean("replyingOptionsHintShown", Q);
                    edit.putInt("lockRecordAudioVideoHint", O);
                    if (!TextUtils.isEmpty(f23290h0)) {
                        str3 = f23290h0;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", f23272a1);
                    edit.putInt("proxyRotationTimeout", f23275b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = f23297j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            f23297j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", f23300k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", f23304m1);
                    edit2.putBoolean("floatingDebugActive", f23335x1);
                    edit2.putBoolean("record_via_sco", f23326u0);
                    edit2.apply();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void z() {
        ArrayList arrayList = new ArrayList(f23341z1);
        Collections.sort(arrayList, new dl(19));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i7 = size - 1;
        while (true) {
            int i10 = 0;
            if (i7 >= 0) {
                az azVar = (az) arrayList.get(i7);
                serializedData.writeString(azVar.f23096a.f60736b);
                serializedData.writeInt32(azVar.f23096a.f60737c);
                serializedData.writeString(azVar.f23096a.d);
                serializedData.writeString(azVar.f23096a.f60738e);
                serializedData.writeString(azVar.f23096a.f60739f);
                serializedData.writeInt64(azVar.f23097b);
                serializedData.writeInt64(azVar.f23099e);
                int c10 = p1.g.c(azVar.f23096a.f60735a);
                if (c10 != 1) {
                    if (c10 == 2) {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
                serializedData.writeInt32(i10);
                i7--;
            } else {
                t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }
}
