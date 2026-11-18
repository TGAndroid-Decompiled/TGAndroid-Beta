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
    public static int f23145a = -1;
    public static boolean f23146a0;
    public static boolean f23147a1;
    public static boolean f23148b;
    public static boolean f23149b0;
    public static int f23150b1;
    public static Boolean f23151c;
    public static boolean f23152c0;
    public static int f23153c1;
    public static String d;
    public static boolean f23154d0;
    public static int f23155d1;
    public static final HashSet f23156e;
    public static int f23157e0;
    public static int f23158e1;
    public static int f23159f;
    public static int f23160f0;
    public static int f23161f1;
    public static String f23162g;
    public static boolean f23163g0;
    public static boolean f23164g1;
    public static String h;
    public static String f23165h0;
    public static boolean f23166h1;
    public static long f23167i;
    public static String f23168i0;
    public static boolean f23169i1;
    public static long f23170j;
    public static HashMap f23171j0;
    public static TLRPC.TL_help_appUpdate f23172j1;
    public static boolean f23173k;
    public static int f23174k0;
    public static int f23175k1;
    public static byte[] f23176l;
    public static boolean f23177l0;
    public static long l1;
    public static byte[] f23178m;
    public static final Object m0;
    public static boolean f23179m1;
    public static boolean f23180n;
    public static final Object f23181n0;
    public static int n1;
    public static boolean f23182o;
    public static int f23183o0;
    public static int f23184o1;
    public static boolean f23185p;
    public static int f23186p0;
    public static boolean f23187p1;
    public static String f23188q;
    public static final boolean f23189q0;
    public static boolean f23190q1;
    public static int f23191r;
    public static boolean f23192r0;
    public static int f23193r1;
    public static String f23194s;
    public static boolean f23195s0;
    public static int f23196s1;
    public static long f23197t;
    public static boolean f23198t0;
    public static int f23199t1;
    public static long f23200u;
    public static boolean f23201u0;
    public static int f23202u1;
    public static int v;
    public static boolean f23203v0;
    public static int f23204v1;
    public static byte[] f23205w;
    public static boolean f23206w0;
    public static boolean f23207w1;
    public static boolean f23208x;
    public static boolean f23209x0;
    public static boolean f23210x1;
    public static int f23211y;
    public static boolean f23212y0;
    public static final int[] f23213y1;
    public static boolean f23214z;
    public static boolean f23215z0;
    public static final ArrayList f23216z1;

    static {
        boolean z10;
        HashSet hashSet = new HashSet();
        f23156e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f23159f = 2;
        f23162g = "";
        h = "";
        f23194s = "";
        f23205w = new byte[0];
        f23211y = 3600;
        D = true;
        G = 1;
        X = true;
        f23152c0 = true;
        f23157e0 = 2;
        f23160f0 = -210000;
        f23163g0 = true;
        f23168i0 = "";
        m0 = new Object();
        f23181n0 = new Object();
        f23183o0 = 2;
        f23186p0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        f23189q0 = z10;
        f23192r0 = false;
        f23195s0 = true;
        f23198t0 = true;
        f23201u0 = false;
        f23203v0 = true;
        f23206w0 = false;
        f23209x0 = true;
        f23212y0 = true;
        f23215z0 = true;
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
        f23199t1 = 3;
        f23202u1 = 3;
        f23204v1 = 3;
        f23213y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        f23216z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i7) {
        G = i7;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i7) {
        if (f23199t1 != i7) {
            f23199t1 = i7;
            t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", f23199t1).apply();
        }
    }

    public static void C(boolean z10) {
        f23207w1 = z10;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", f23207w1);
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
        if (f23202u1 != i7) {
            f23202u1 = i7;
            t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", f23202u1).apply();
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
        f23203v0 = !f23203v0;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("adaptableBrowser", f23203v0);
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
        f23154d0 = !f23154d0;
        t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", f23154d0).apply();
    }

    public static void M() {
        f23152c0 = !f23152c0;
        t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", f23152c0).apply();
    }

    public static void N() {
        Y = !Y;
        t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        f23149b0 = !f23149b0;
        t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", f23149b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = mp.g1().edit();
        boolean z10 = !X;
        X = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void Q(int i7) {
        SharedPreferences.Editor edit = t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !s(i7);
        Z = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void R() {
        f23146a0 = !f23146a0;
        t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", f23146a0).apply();
    }

    public static void S(int i7) {
        f23153c1 = i7;
        t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", f23153c1).apply();
    }

    public static void T(int i7) {
        f23157e0 = i7;
        t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", f23157e0).apply();
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
        ArrayList arrayList = f23216z1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            az azVar2 = (az) arrayList.get(i7);
            if (Objects.equals(azVar.f22985a, azVar2.f22985a)) {
                return azVar2;
            }
        }
        arrayList.add(0, azVar);
        z();
        return azVar;
    }

    public static boolean b() {
        if (f23151c == null) {
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
            f23151c = Boolean.valueOf(z10);
        }
        return f23151c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(mp.g1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return t0.f26913b.getPackageManager().getPackageInfo(t0.f26913b.getPackageName(), 0).versionCode;
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
        boolean z10 = s2.f26721a;
        return false;
    }

    public static boolean f() {
        if (e() && pc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (f23205w.length == 0) {
            boolean equals = Utilities.a(str).equals(f23194s);
            if (equals) {
                try {
                    f23205w = new byte[16];
                    Utilities.f22777b.nextBytes(f23205w);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(f23205w, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(f23205w, 0, bArr, bytes.length + 16, 16);
                    f23194s = Utilities.f(Utilities.o(length, bArr));
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
            System.arraycopy(f23205w, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(f23205w, 0, bArr2, bytes2.length + 16, 16);
            return f23194s.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e11) {
            a8.g(e11, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && f23165h0 != null && !f23148b && file.getPath().startsWith(f23165h0)) {
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
        f23216z1.remove(azVar);
        z();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z10) {
        if (f23195s0) {
            if (!z10 || f23192r0) {
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
                            boolean z10 = s2.f26721a;
                            if (f23156e.contains(codecInfoAt.getName().toLowerCase())) {
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
        int i10 = f23193r1;
        if (i10 >= 0) {
            if (i10 == 5 && mp.u1(i7).Q0.isEmpty()) {
                return 2;
            }
            return f23193r1;
        } else if (mp.u1(i7).Q0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (f23171j0 == null) {
            f23171j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f23168i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    f23171j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return f23171j0;
    }

    public static int o() {
        int i7 = f23184o1;
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
        synchronized (f23181n0) {
            i7 = f23160f0;
            f23160f0 = i7 - 1;
        }
        return i7;
    }

    public static SharedPreferences q() {
        return t0.f26913b.getSharedPreferences("userconfing", 0);
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
                                f23197t = 30000L;
                            } else {
                                f23197t = 25000L;
                            }
                        } else {
                            f23197t = 20000L;
                        }
                    } else {
                        f23197t = 15000L;
                    }
                } else {
                    f23197t = 10000L;
                }
            } else {
                f23197t = 5000L;
            }
            f23200u = SystemClock.elapsedRealtime();
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
            SharedPreferences sharedPreferences = t0.f26913b.getSharedPreferences("mainconfig", 0);
            xi.a c10 = xi.a.c(sharedPreferences);
            A1 = true;
            f23216z1.clear();
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
                            f23216z1.add(0, a10);
                            if (B1 == null && c10.g() && c10.equals(a10.f22985a)) {
                                B1 = a10;
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < readInt32; i10++) {
                        az a11 = az.a(0, serializedData);
                        f23216z1.add(0, a11);
                        if (B1 == null && c10.g() && c10.equals(a11.f22985a)) {
                            B1 = a11;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (B1 == null && c10.g()) {
                az azVar = new az(c10);
                B1 = azVar;
                f23216z1.add(0, azVar);
            }
        }
    }

    public static int v() {
        int ceil;
        long j3;
        String i7;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) t0.f26913b.getSystemService("activity")).getMemoryClass();
        int i12 = 0;
        if (i10 >= 31 && (i7 = ed.i()) != null) {
            int hashCode = i7.toUpperCase().hashCode();
            int i13 = 0;
            while (true) {
                int[] iArr = f23213y1;
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
            ((ActivityManager) t0.f26913b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j3 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j3 = -1;
        }
        if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && ((i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24) && (j3 == -1 || j3 >= 2147483648L)))) {
            i12 = (i11 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i11 == 8 && i10 <= 23)) ? 1 : 2;
        }
        if (s2.f26721a) {
            StringBuilder n10 = i5.c.n("device performance info selected_class = ", i12, " (cpu_count = ", i11, ", freq = ");
            i5.c.z(n10, ceil, ", memoryClass = ", memoryClass, ", android version ");
            n10.append(i10);
            n10.append(", manufacture ");
            n10.append(Build.MANUFACTURER);
            n10.append(", screenRefreshRate=");
            n10.append(g0.f24119r);
            n10.append(", screenMaxRefreshRate=");
            n10.append(g0.f24120s);
            n10.append(")");
            a8.b(n10.toString());
        }
        return i12;
    }

    public static void w(int i7) {
        SharedPreferences.Editor edit = mp.g1().edit();
        f23184o1 = i7;
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
                    SharedPreferences.Editor edit = t0.f26913b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", f23214z);
                    edit.putString("passcodeHash1", f23194s);
                    byte[] bArr = f23205w;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", f23208x);
                    edit.putInt("passcodeType", f23191r);
                    edit.putLong("passcodeRetryInMs", f23197t);
                    edit.putLong("lastUptimeMillis", f23200u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", f23211y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", f23163g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", f23162g);
                    edit.putInt("pushType", f23159f);
                    edit.putBoolean("pushStatSent", f23173k);
                    byte[] bArr2 = f23176l;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", f23160f0);
                    edit.putString("passportConfigJson", f23168i0);
                    edit.putInt("passportConfigHash", f23174k0);
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
                    if (!TextUtils.isEmpty(f23165h0)) {
                        str3 = f23165h0;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", f23147a1);
                    edit.putInt("proxyRotationTimeout", f23150b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = f23172j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            f23172j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", f23175k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", f23179m1);
                    edit2.putBoolean("floatingDebugActive", f23210x1);
                    edit2.putBoolean("record_via_sco", f23201u0);
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
        ArrayList arrayList = new ArrayList(f23216z1);
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
                serializedData.writeString(azVar.f22985a.f60608b);
                serializedData.writeInt32(azVar.f22985a.f60609c);
                serializedData.writeString(azVar.f22985a.d);
                serializedData.writeString(azVar.f22985a.f60610e);
                serializedData.writeString(azVar.f22985a.f60611f);
                serializedData.writeInt64(azVar.f22986b);
                serializedData.writeInt64(azVar.f22988e);
                int c10 = p1.g.c(azVar.f22985a.f60607a);
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
                t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }
}
