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
public abstract class az {
    public static boolean A = false;
    public static boolean A0 = false;
    public static boolean A1 = false;
    public static int B = 0;
    public static boolean B0 = false;
    public static zy B1 = null;
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
    public static int f21612a = -1;
    public static boolean f21613a0;
    public static boolean f21614a1;
    public static boolean f21615b;
    public static boolean f21616b0;
    public static int f21617b1;
    public static Boolean f21618c;
    public static boolean f21619c0;
    public static int f21620c1;
    public static String d;
    public static boolean f21621d0;
    public static int f21622d1;
    public static final HashSet f21623e;
    public static int f21624e0;
    public static int f21625e1;
    public static int f21626f;
    public static int f21627f0;
    public static int f21628f1;
    public static String f21629g;
    public static boolean f21630g0;
    public static boolean f21631g1;
    public static String h;
    public static String f21632h0;
    public static boolean f21633h1;
    public static long f21634i;
    public static String f21635i0;
    public static boolean f21636i1;
    public static long f21637j;
    public static HashMap f21638j0;
    public static TLRPC.TL_help_appUpdate f21639j1;
    public static boolean f21640k;
    public static int f21641k0;
    public static int k1;
    public static byte[] f21642l;
    public static boolean f21643l0;
    public static long f21644l1;
    public static byte[] f21645m;
    public static final Object m0;
    public static boolean m1;
    public static boolean f21646n;
    public static final Object f21647n0;
    public static int f21648n1;
    public static boolean f21649o;
    public static int f21650o0;
    public static int f21651o1;
    public static boolean f21652p;
    public static int f21653p0;
    public static boolean f21654p1;
    public static String f21655q;
    public static final boolean f21656q0;
    public static boolean f21657q1;
    public static int f21658r;
    public static boolean f21659r0;
    public static int f21660r1;
    public static String f21661s;
    public static boolean f21662s0;
    public static int f21663s1;
    public static long f21664t;
    public static boolean f21665t0;
    public static int f21666t1;
    public static long f21667u;
    public static boolean f21668u0;
    public static int f21669u1;
    public static int v;
    public static boolean f21670v0;
    public static int f21671v1;
    public static byte[] f21672w;
    public static boolean f21673w0;
    public static boolean f21674w1;
    public static boolean f21675x;
    public static boolean f21676x0;
    public static boolean f21677x1;
    public static int f21678y;
    public static boolean f21679y0;
    public static final int[] f21680y1;
    public static boolean f21681z;
    public static boolean f21682z0;
    public static final ArrayList f21683z1;

    static {
        boolean z10;
        HashSet hashSet = new HashSet();
        f21623e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f21626f = 2;
        f21629g = "";
        h = "";
        f21661s = "";
        f21672w = new byte[0];
        f21678y = 3600;
        D = true;
        G = 1;
        X = true;
        f21619c0 = true;
        f21624e0 = 2;
        f21627f0 = -210000;
        f21630g0 = true;
        f21635i0 = "";
        m0 = new Object();
        f21647n0 = new Object();
        f21650o0 = 2;
        f21653p0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        f21656q0 = z10;
        f21659r0 = false;
        f21662s0 = true;
        f21665t0 = true;
        f21668u0 = false;
        f21670v0 = true;
        f21673w0 = false;
        f21676x0 = true;
        f21679y0 = true;
        f21682z0 = true;
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
        f21666t1 = 3;
        f21669u1 = 3;
        f21671v1 = 3;
        f21680y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        f21683z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i3) {
        G = i3;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i3) {
        if (f21666t1 != i3) {
            f21666t1 = i3;
            t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", f21666t1).apply();
        }
    }

    public static void C(boolean z10) {
        f21674w1 = z10;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", f21674w1);
        edit.apply();
    }

    public static void D(boolean z10) {
        if (A0 == z10) {
            return;
        }
        A0 = z10;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("noSoundHintShowed", A0);
        edit.apply();
    }

    public static void E(int i3) {
        S0 = i3;
        if (i3 < 0 || i3 > 2) {
            S0 = 0;
        }
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putInt("repeatMode", S0);
        edit.apply();
    }

    public static void F(int i3) {
        if (f21669u1 != i3) {
            f21669u1 = i3;
            t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", f21669u1).apply();
        }
    }

    public static void G(boolean z10) {
        U = z10;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("storiesIntroShown", U);
        edit.apply();
    }

    public static void H(boolean z10) {
        T = z10;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("storyReactionsLongPressHint", T);
        edit.apply();
    }

    public static void I(int i3) {
        E = i3;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putInt("suggestStickers", E);
        edit.apply();
    }

    public static void J() {
        f21670v0 = !f21670v0;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("adaptableBrowser", f21670v0);
        edit.apply();
    }

    public static void K() {
        J0 = !J0;
        WebView.setWebContentsDebuggingEnabled(J0);
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("debugWebView", J0);
        edit.apply();
    }

    public static void L() {
        f21621d0 = !f21621d0;
        t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", f21621d0).apply();
    }

    public static void M() {
        f21619c0 = !f21619c0;
        t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", f21619c0).apply();
    }

    public static void N() {
        Y = !Y;
        t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        f21616b0 = !f21616b0;
        t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", f21616b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = hp.e1().edit();
        boolean z10 = !X;
        X = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void Q(int i3) {
        SharedPreferences.Editor edit = t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !s(i3);
        Z = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void R() {
        f21613a0 = !f21613a0;
        t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", f21613a0).apply();
    }

    public static void S(int i3) {
        f21620c1 = i3;
        t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", f21620c1).apply();
    }

    public static void T(int i3) {
        f21624e0 = i3;
        t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", f21624e0).apply();
    }

    public static boolean U(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i3 = 0; i3 < Math.min(split.length, split2.length); i3++) {
            int parseInt = Integer.parseInt(split[i3]);
            int parseInt2 = Integer.parseInt(split2[i3]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
    }

    public static zy a(zy zyVar) {
        u();
        ArrayList arrayList = f21683z1;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zy zyVar2 = (zy) arrayList.get(i3);
            if (Objects.equals(zyVar.f26993a, zyVar2.f26993a)) {
                return zyVar2;
            }
        }
        arrayList.add(0, zyVar);
        z();
        return zyVar;
    }

    public static boolean b() {
        if (f21618c == null) {
            int codecCount = MediaCodecList.getCodecCount();
            boolean z10 = false;
            int i3 = 0;
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (!codecInfoAt.isEncoder()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        } else if (codecInfoAt.getSupportedTypes()[i11].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i3) {
                                i3 = maxSupportedInstances;
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (i3 >= 8) {
                z10 = true;
            }
            f21618c = Boolean.valueOf(z10);
        }
        return f21618c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(hp.e1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return t0.f25457b.getPackageManager().getPackageInfo(t0.f25457b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static boolean e() {
        int i3;
        int o10 = o();
        if (Build.VERSION.SDK_INT >= 31) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        if (o10 >= i3) {
            return true;
        }
        boolean z10 = r2.f25040a;
        return false;
    }

    public static boolean f() {
        if (e() && lc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (f21672w.length == 0) {
            boolean equals = Utilities.a(str).equals(f21661s);
            if (equals) {
                try {
                    f21672w = new byte[16];
                    Utilities.f21385b.nextBytes(f21672w);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(f21672w, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(f21672w, 0, bArr, bytes.length + 16, 16);
                    f21661s = Utilities.f(Utilities.o(length, bArr));
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
            System.arraycopy(f21672w, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(f21672w, 0, bArr2, bytes2.length + 16, 16);
            return f21661s.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e11) {
            a8.g(e11, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && f21632h0 != null && !f21615b && file.getPath().startsWith(f21632h0)) {
            g0.h3(new hc(12));
        }
    }

    public static void i(zy zyVar) {
        if (B1 == zyVar) {
            B1 = null;
            SharedPreferences e12 = hp.e1();
            boolean z10 = e12.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = e12.edit();
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
        f21683z1.remove(zyVar);
        z();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z10) {
        if (f21662s0) {
            if (!z10 || f21659r0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String l() {
        if (d == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (codecInfoAt.isEncoder()) {
                    for (int i10 = 0; i10 < codecInfoAt.getSupportedTypes().length; i10++) {
                        if (codecInfoAt.getSupportedTypes()[i10].contains("video/hevc") && codecInfoAt.isHardwareAccelerated()) {
                            boolean z10 = r2.f25040a;
                            if (f21623e.contains(codecInfoAt.getName().toLowerCase())) {
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

    public static int m(int i3) {
        int i10 = f21660r1;
        if (i10 >= 0) {
            if (i10 == 5 && hp.s1(i3).Q0.isEmpty()) {
                return 2;
            }
            return f21660r1;
        } else if (hp.s1(i3).Q0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (f21638j0 == null) {
            f21638j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f21635i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    f21638j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return f21638j0;
    }

    public static int o() {
        int i3 = f21651o1;
        if (i3 != -1) {
            return i3;
        }
        if (f21648n1 == -1) {
            f21648n1 = v();
        }
        return f21648n1;
    }

    public static int p() {
        int i3;
        synchronized (f21647n0) {
            i3 = f21627f0;
            f21627f0 = i3 - 1;
        }
        return i3;
    }

    public static SharedPreferences q() {
        return t0.f25457b.getSharedPreferences("userconfing", 0);
    }

    public static void r() {
        int i3 = v + 1;
        v = i3;
        if (i3 >= 3) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 != 6) {
                            if (i3 != 7) {
                                f21664t = 30000L;
                            } else {
                                f21664t = 25000L;
                            }
                        } else {
                            f21664t = 20000L;
                        }
                    } else {
                        f21664t = 15000L;
                    }
                } else {
                    f21664t = 10000L;
                }
            } else {
                f21664t = 5000L;
            }
            f21667u = SystemClock.elapsedRealtime();
        }
        y();
    }

    public static boolean s(int i3) {
        Boolean bool = Z;
        if (bool == null) {
            if (!hp.s1(i3).M5) {
                return true;
            }
            return false;
        }
        return bool.booleanValue();
    }

    public static void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.az.t():void");
    }

    public static void u() {
        if (!A1) {
            SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("mainconfig", 0);
            ui.a c2 = ui.a.c(sharedPreferences);
            A1 = true;
            f21683z1.clear();
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
                        for (int i3 = 0; i3 < readInt322; i3++) {
                            zy a10 = zy.a(readByte, serializedData);
                            f21683z1.add(0, a10);
                            if (B1 == null && c2.g() && c2.equals(a10.f26993a)) {
                                B1 = a10;
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < readInt32; i10++) {
                        zy a11 = zy.a(0, serializedData);
                        f21683z1.add(0, a11);
                        if (B1 == null && c2.g() && c2.equals(a11.f26993a)) {
                            B1 = a11;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (B1 == null && c2.g()) {
                zy zyVar = new zy(c2);
                B1 = zyVar;
                f21683z1.add(0, zyVar);
            }
        }
    }

    public static int v() {
        int ceil;
        long j10;
        String f10;
        int i3 = Build.VERSION.SDK_INT;
        int i10 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) t0.f25457b.getSystemService("activity")).getMemoryClass();
        int i11 = 0;
        if (i3 >= 31 && (f10 = go.f()) != null) {
            int hashCode = f10.toUpperCase().hashCode();
            int i12 = 0;
            while (true) {
                int[] iArr = f21680y1;
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
            ((ActivityManager) t0.f25457b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j10 = -1;
        }
        if (i10 > 2 && memoryClass > 100 && ((i10 > 4 || ceil == -1 || ceil > 1250) && ((i10 > 4 || ceil > 1300 || memoryClass > 128 || i3 > 24) && (j10 == -1 || j10 >= 2147483648L)))) {
            i11 = (i10 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i10 == 8 && i3 <= 23)) ? 1 : 2;
        }
        if (r2.f25040a) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m("device performance info selected_class = ", i11, " (cpu_count = ", i10, ", freq = ");
            com.google.android.recaptcha.internal.a.r(m10, ceil, ", memoryClass = ", memoryClass, ", android version ");
            m10.append(i3);
            m10.append(", manufacture ");
            m10.append(Build.MANUFACTURER);
            m10.append(", screenRefreshRate=");
            m10.append(g0.f22609r);
            m10.append(", screenMaxRefreshRate=");
            m10.append(g0.f22610s);
            m10.append(")");
            a8.b(m10.toString());
        }
        return i11;
    }

    public static void w(int i3) {
        SharedPreferences.Editor edit = hp.e1().edit();
        f21651o1 = i3;
        edit.putInt("overrideDevicePerformanceClass", i3).remove("lite_mode").apply();
    }

    public static String x(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
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
                    SharedPreferences.Editor edit = t0.f25457b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", f21681z);
                    edit.putString("passcodeHash1", f21661s);
                    byte[] bArr = f21672w;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", f21675x);
                    edit.putInt("passcodeType", f21658r);
                    edit.putLong("passcodeRetryInMs", f21664t);
                    edit.putLong("lastUptimeMillis", f21667u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", f21678y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", f21630g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", f21629g);
                    edit.putInt("pushType", f21626f);
                    edit.putBoolean("pushStatSent", f21640k);
                    byte[] bArr2 = f21642l;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", f21627f0);
                    edit.putString("passportConfigJson", f21635i0);
                    edit.putInt("passportConfigHash", f21641k0);
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
                    if (!TextUtils.isEmpty(f21632h0)) {
                        str3 = f21632h0;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", f21614a1);
                    edit.putInt("proxyRotationTimeout", f21617b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = f21639j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            f21639j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", f21644l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", m1);
                    edit2.putBoolean("floatingDebugActive", f21677x1);
                    edit2.putBoolean("record_via_sco", f21668u0);
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
        ArrayList arrayList = new ArrayList(f21683z1);
        Collections.sort(arrayList, new tq(10));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i3 = size - 1;
        while (true) {
            int i10 = 0;
            if (i3 >= 0) {
                zy zyVar = (zy) arrayList.get(i3);
                serializedData.writeString(zyVar.f26993a.f56372b);
                serializedData.writeInt32(zyVar.f26993a.f56373c);
                serializedData.writeString(zyVar.f26993a.d);
                serializedData.writeString(zyVar.f26993a.f56374e);
                serializedData.writeString(zyVar.f26993a.f56375f);
                serializedData.writeInt64(zyVar.f26994b);
                serializedData.writeInt64(zyVar.f26996e);
                int c2 = o1.g.c(zyVar.f26993a.f56371a);
                if (c2 != 1) {
                    if (c2 == 2) {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
                serializedData.writeInt32(i10);
                i3--;
            } else {
                t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }
}
