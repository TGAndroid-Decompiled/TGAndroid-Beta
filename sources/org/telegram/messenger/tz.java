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
public abstract class tz {
    public static boolean A = false;
    public static boolean A0 = false;
    public static boolean A1 = false;
    public static int B = 0;
    public static boolean B0 = false;
    public static sz B1 = null;
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
    public static int f18131a = -1;
    public static boolean f18132a0;
    public static boolean f18133a1;
    public static boolean f18134b;
    public static boolean f18135b0;
    public static int f18136b1;
    public static Boolean f18137c;
    public static boolean f18138c0;
    public static int f18139c1;
    public static String d;
    public static boolean f18140d0;
    public static int f18141d1;
    public static final HashSet e;
    public static int f18142e0;
    public static int f18143e1;
    public static int f18144f;
    public static int f18145f0;
    public static int f18146f1;
    public static String f18147g;
    public static boolean f18148g0;
    public static boolean f18149g1;
    public static String h;
    public static String f18150h0;
    public static boolean f18151h1;
    public static long f18152i;
    public static String f18153i0;
    public static boolean f18154i1;
    public static long f18155j;
    public static HashMap f18156j0;
    public static TLRPC.TL_help_appUpdate f18157j1;
    public static boolean f18158k;
    public static int f18159k0;
    public static int f18160k1;
    public static byte[] f18161l;
    public static boolean f18162l0;
    public static long l1;
    public static byte[] f18163m;
    public static final Object m0;
    public static boolean f18164m1;
    public static boolean f18165n;
    public static final Object f18166n0;
    public static int f18167n1;
    public static boolean f18168o;
    public static int f18169o0;
    public static int f18170o1;
    public static boolean f18171p;
    public static int f18172p0;
    public static boolean f18173p1;
    public static String f18174q;
    public static final boolean f18175q0;
    public static boolean f18176q1;
    public static int f18177r;
    public static boolean f18178r0;
    public static int f18179r1;
    public static String f18180s;
    public static boolean f18181s0;
    public static int f18182s1;
    public static long f18183t;
    public static boolean f18184t0;
    public static int f18185t1;
    public static long f18186u;
    public static boolean f18187u0;
    public static int f18188u1;
    public static int v;
    public static boolean f18189v0;
    public static int f18190v1;
    public static byte[] f18191w;
    public static boolean f18192w0;
    public static boolean f18193w1;
    public static boolean f18194x;
    public static boolean f18195x0;
    public static boolean f18196x1;
    public static int f18197y;
    public static boolean f18198y0;
    public static final int[] f18199y1;
    public static boolean f18200z;
    public static boolean f18201z0;
    public static final ArrayList f18202z1;

    static {
        boolean z10;
        HashSet hashSet = new HashSet();
        e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f18144f = 2;
        f18147g = "";
        h = "";
        f18180s = "";
        f18191w = new byte[0];
        f18197y = 3600;
        D = true;
        G = 1;
        X = true;
        f18138c0 = true;
        f18142e0 = 2;
        f18145f0 = -210000;
        f18148g0 = true;
        f18153i0 = "";
        m0 = new Object();
        f18166n0 = new Object();
        f18169o0 = 2;
        f18172p0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        f18175q0 = z10;
        f18178r0 = false;
        f18181s0 = true;
        f18184t0 = true;
        f18187u0 = false;
        f18189v0 = true;
        f18192w0 = false;
        f18195x0 = true;
        f18198y0 = true;
        f18201z0 = true;
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
        f18185t1 = 3;
        f18188u1 = 3;
        f18190v1 = 3;
        f18199y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        f18202z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i10) {
        G = i10;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i10) {
        if (f18185t1 != i10) {
            f18185t1 = i10;
            w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", f18185t1).apply();
        }
    }

    public static void C(boolean z10) {
        f18193w1 = z10;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", f18193w1);
        edit.apply();
    }

    public static void D(boolean z10) {
        if (A0 == z10) {
            return;
        }
        A0 = z10;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("noSoundHintShowed", A0);
        edit.apply();
    }

    public static void E(int i10) {
        S0 = i10;
        if (i10 < 0 || i10 > 2) {
            S0 = 0;
        }
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putInt("repeatMode", S0);
        edit.apply();
    }

    public static void F(int i10) {
        if (f18188u1 != i10) {
            f18188u1 = i10;
            w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", f18188u1).apply();
        }
    }

    public static void G(boolean z10) {
        U = z10;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("storiesIntroShown", U);
        edit.apply();
    }

    public static void H(boolean z10) {
        T = z10;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("storyReactionsLongPressHint", T);
        edit.apply();
    }

    public static void I(int i10) {
        E = i10;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putInt("suggestStickers", E);
        edit.apply();
    }

    public static void J() {
        f18189v0 = !f18189v0;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("adaptableBrowser", f18189v0);
        edit.apply();
    }

    public static void K() {
        J0 = !J0;
        WebView.setWebContentsDebuggingEnabled(J0);
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("debugWebView", J0);
        edit.apply();
    }

    public static void L() {
        f18140d0 = !f18140d0;
        w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", f18140d0).apply();
    }

    public static void M() {
        f18138c0 = !f18138c0;
        w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", f18138c0).apply();
    }

    public static void N() {
        Y = !Y;
        w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        f18135b0 = !f18135b0;
        w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", f18135b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = vp.d1().edit();
        boolean z10 = !X;
        X = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void Q(int i10) {
        SharedPreferences.Editor edit = w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !s(i10);
        Z = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void R() {
        f18132a0 = !f18132a0;
        w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", f18132a0).apply();
    }

    public static void S(int i10) {
        f18139c1 = i10;
        w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", f18139c1).apply();
    }

    public static void T(int i10) {
        f18142e0 = i10;
        w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", f18142e0).apply();
    }

    public static boolean U(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i10 = 0; i10 < Math.min(split.length, split2.length); i10++) {
            int parseInt = Integer.parseInt(split[i10]);
            int parseInt2 = Integer.parseInt(split2[i10]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
    }

    public static sz a(sz szVar) {
        u();
        ArrayList arrayList = f18202z1;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sz szVar2 = (sz) arrayList.get(i10);
            if (Objects.equals(szVar.f17974a, szVar2.f17974a)) {
                return szVar2;
            }
        }
        arrayList.add(0, szVar);
        z();
        return szVar;
    }

    public static boolean b() {
        if (f18137c == null) {
            int codecCount = MediaCodecList.getCodecCount();
            boolean z10 = false;
            int i10 = 0;
            for (int i11 = 0; i11 < codecCount; i11++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
                if (!codecInfoAt.isEncoder()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        } else if (codecInfoAt.getSupportedTypes()[i12].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i10) {
                                i10 = maxSupportedInstances;
                            }
                        } else {
                            i12++;
                        }
                    }
                }
            }
            if (i10 >= 8) {
                z10 = true;
            }
            f18137c = Boolean.valueOf(z10);
        }
        return f18137c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(vp.d1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return w0.f19025b.getPackageManager().getPackageInfo(w0.f19025b.getPackageName(), 0).versionCode;
        } catch (Exception e7) {
            f8.g(e7, true);
            return 0;
        }
    }

    public static boolean e() {
        int i10;
        int o10 = o();
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        if (o10 >= i10) {
            return true;
        }
        boolean z10 = v2.f18448a;
        return false;
    }

    public static boolean f() {
        if (e() && sc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (f18191w.length == 0) {
            boolean equals = Utilities.a(str).equals(f18180s);
            if (equals) {
                try {
                    f18191w = new byte[16];
                    Utilities.f14519b.nextBytes(f18191w);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(f18191w, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(f18191w, 0, bArr, bytes.length + 16, 16);
                    f18180s = Utilities.f(Utilities.o(length, bArr));
                    y();
                    return equals;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
            return equals;
        }
        try {
            byte[] bytes2 = str.getBytes("UTF-8");
            int length2 = bytes2.length + 32;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(f18191w, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(f18191w, 0, bArr2, bytes2.length + 16, 16);
            return f18180s.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e10) {
            f8.g(e10, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && f18150h0 != null && !f18134b && file.getPath().startsWith(f18150h0)) {
            i0.g3(new ag.f3(29));
        }
    }

    public static void i(sz szVar) {
        if (B1 == szVar) {
            B1 = null;
            SharedPreferences d12 = vp.d1();
            boolean z10 = d12.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = d12.edit();
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
        f18202z1.remove(szVar);
        z();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z10) {
        if (f18181s0) {
            if (!z10 || f18178r0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String l() {
        if (d == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt.isEncoder()) {
                    for (int i11 = 0; i11 < codecInfoAt.getSupportedTypes().length; i11++) {
                        if (codecInfoAt.getSupportedTypes()[i11].contains("video/hevc") && codecInfoAt.isHardwareAccelerated()) {
                            boolean z10 = v2.f18448a;
                            if (e.contains(codecInfoAt.getName().toLowerCase())) {
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

    public static int m(int i10) {
        int i11 = f18179r1;
        if (i11 >= 0) {
            if (i11 == 5 && vp.r1(i10).P0.isEmpty()) {
                return 2;
            }
            return f18179r1;
        } else if (vp.r1(i10).P0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (f18156j0 == null) {
            f18156j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f18153i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    f18156j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        return f18156j0;
    }

    public static int o() {
        int i10 = f18170o1;
        if (i10 != -1) {
            return i10;
        }
        if (f18167n1 == -1) {
            f18167n1 = v();
        }
        return f18167n1;
    }

    public static int p() {
        int i10;
        synchronized (f18166n0) {
            i10 = f18145f0;
            f18145f0 = i10 - 1;
        }
        return i10;
    }

    public static SharedPreferences q() {
        return w0.f19025b.getSharedPreferences("userconfing", 0);
    }

    public static void r() {
        int i10 = v + 1;
        v = i10;
        if (i10 >= 3) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                f18183t = 30000L;
                            } else {
                                f18183t = 25000L;
                            }
                        } else {
                            f18183t = 20000L;
                        }
                    } else {
                        f18183t = 15000L;
                    }
                } else {
                    f18183t = 10000L;
                }
            } else {
                f18183t = 5000L;
            }
            f18186u = SystemClock.elapsedRealtime();
        }
        y();
    }

    public static boolean s(int i10) {
        Boolean bool = Z;
        if (bool == null) {
            if (!vp.r1(i10).N5) {
                return true;
            }
            return false;
        }
        return bool.booleanValue();
    }

    public static void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tz.t():void");
    }

    public static void u() {
        if (!A1) {
            SharedPreferences sharedPreferences = w0.f19025b.getSharedPreferences("mainconfig", 0);
            ji.b c10 = ji.b.c(sharedPreferences);
            A1 = true;
            f18202z1.clear();
            B1 = null;
            String string = sharedPreferences.getString("proxy_list", null);
            if (!TextUtils.isEmpty(string)) {
                SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                int readInt32 = serializedData.readInt32(false);
                if (readInt32 == -1) {
                    byte readByte = serializedData.readByte(false);
                    if (readByte != 2 && readByte != 3) {
                        f8.d("Unknown proxy schema version: " + ((int) readByte));
                    } else {
                        int readInt322 = serializedData.readInt32(false);
                        for (int i10 = 0; i10 < readInt322; i10++) {
                            sz a2 = sz.a(readByte, serializedData);
                            f18202z1.add(0, a2);
                            if (B1 == null && c10.f() && c10.equals(a2.f17974a)) {
                                B1 = a2;
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < readInt32; i11++) {
                        sz a10 = sz.a(0, serializedData);
                        f18202z1.add(0, a10);
                        if (B1 == null && c10.f() && c10.equals(a10.f17974a)) {
                            B1 = a10;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (B1 == null && c10.f()) {
                sz szVar = new sz(c10);
                B1 = szVar;
                f18202z1.add(0, szVar);
            }
        }
    }

    public static int v() {
        int ceil;
        long j10;
        String f7;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) w0.f19025b.getSystemService("activity")).getMemoryClass();
        int i12 = 0;
        if (i10 >= 31 && (f7 = e9.f()) != null) {
            int hashCode = f7.toUpperCase().hashCode();
            int i13 = 0;
            while (true) {
                int[] iArr = f18199y1;
                if (i13 >= iArr.length) {
                    break;
                } else if (iArr[i13] == hashCode) {
                    return 0;
                } else {
                    i13++;
                }
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i16 + "/cpufreq/cpuinfo_max_freq", "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i15 += Utilities.z(readLine).intValue() / 1000;
                    i14++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        if (i14 == 0) {
            ceil = -1;
        } else {
            ceil = (int) Math.ceil(i15 / i14);
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) w0.f19025b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j10 = -1;
        }
        if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && ((i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24) && (j10 == -1 || j10 >= 2147483648L)))) {
            i12 = (i11 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i11 == 8 && i10 <= 23)) ? 1 : 2;
        }
        if (v2.f18448a) {
            StringBuilder m10 = i0.a.m("device performance info selected_class = ", i12, " (cpu_count = ", i11, ", freq = ");
            i0.a.t(m10, ceil, ", memoryClass = ", memoryClass, ", android version ");
            m10.append(i10);
            m10.append(", manufacture ");
            m10.append(Build.MANUFACTURER);
            m10.append(", screenRefreshRate=");
            m10.append(i0.f16027r);
            m10.append(", screenMaxRefreshRate=");
            m10.append(i0.f16028s);
            m10.append(")");
            f8.b(m10.toString());
        }
        return i12;
    }

    public static void w(int i10) {
        SharedPreferences.Editor edit = vp.d1().edit();
        f18170o1 = i10;
        edit.putInt("overrideDevicePerformanceClass", i10).remove("lite_mode").apply();
    }

    public static String x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
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
                    SharedPreferences.Editor edit = w0.f19025b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", f18200z);
                    edit.putString("passcodeHash1", f18180s);
                    byte[] bArr = f18191w;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", f18194x);
                    edit.putInt("passcodeType", f18177r);
                    edit.putLong("passcodeRetryInMs", f18183t);
                    edit.putLong("lastUptimeMillis", f18186u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", f18197y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", f18148g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", f18147g);
                    edit.putInt("pushType", f18144f);
                    edit.putBoolean("pushStatSent", f18158k);
                    byte[] bArr2 = f18161l;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", f18145f0);
                    edit.putString("passportConfigJson", f18153i0);
                    edit.putInt("passportConfigHash", f18159k0);
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
                    if (!TextUtils.isEmpty(f18150h0)) {
                        str3 = f18150h0;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", f18133a1);
                    edit.putInt("proxyRotationTimeout", f18136b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = f18157j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            f18157j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", f18160k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", f18164m1);
                    edit2.putBoolean("floatingDebugActive", f18196x1);
                    edit2.putBoolean("record_via_sco", f18187u0);
                    edit2.apply();
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void z() {
        ArrayList arrayList = new ArrayList(f18202z1);
        Collections.sort(arrayList, new bk(22));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i10 = size - 1;
        while (true) {
            int i11 = 0;
            if (i10 >= 0) {
                sz szVar = (sz) arrayList.get(i10);
                serializedData.writeString(szVar.f17974a.f10428b);
                serializedData.writeInt32(szVar.f17974a.f10429c);
                serializedData.writeString(szVar.f17974a.d);
                serializedData.writeString(szVar.f17974a.e);
                serializedData.writeString(szVar.f17974a.f10430f);
                serializedData.writeInt64(szVar.f17975b);
                serializedData.writeInt64(szVar.e);
                int c10 = m1.j.c(szVar.f17974a.f10427a);
                if (c10 != 1) {
                    if (c10 == 2) {
                        i11 = 2;
                    }
                } else {
                    i11 = 1;
                }
                serializedData.writeInt32(i11);
                i10--;
            } else {
                w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }
}
