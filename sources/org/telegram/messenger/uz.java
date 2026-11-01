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
public abstract class uz {
    public static boolean A = false;
    public static boolean A0 = false;
    public static boolean A1 = false;
    public static int B = 0;
    public static boolean B0 = false;
    public static tz B1 = null;
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
    public static int f18500a = -1;
    public static boolean f18501a0;
    public static boolean f18502a1;
    public static boolean f18503b;
    public static boolean f18504b0;
    public static int f18505b1;
    public static Boolean f18506c;
    public static boolean f18507c0;
    public static int f18508c1;
    public static String d;
    public static boolean f18509d0;
    public static int f18510d1;
    public static final HashSet e;
    public static int f18511e0;
    public static int f18512e1;
    public static int f18513f;
    public static int f18514f0;
    public static int f18515f1;
    public static String f18516g;
    public static boolean f18517g0;
    public static boolean f18518g1;
    public static String h;
    public static String f18519h0;
    public static boolean f18520h1;
    public static long f18521i;
    public static String f18522i0;
    public static boolean f18523i1;
    public static long f18524j;
    public static HashMap f18525j0;
    public static TLRPC.TL_help_appUpdate f18526j1;
    public static boolean f18527k;
    public static int f18528k0;
    public static int f18529k1;
    public static byte[] f18530l;
    public static boolean f18531l0;
    public static long l1;
    public static byte[] f18532m;
    public static final Object m0;
    public static boolean f18533m1;
    public static boolean f18534n;
    public static final Object f18535n0;
    public static int f18536n1;
    public static boolean f18537o;
    public static int f18538o0;
    public static int f18539o1;
    public static boolean f18540p;
    public static int f18541p0;
    public static boolean f18542p1;
    public static String f18543q;
    public static final boolean f18544q0;
    public static boolean f18545q1;
    public static int f18546r;
    public static boolean f18547r0;
    public static int f18548r1;
    public static String f18549s;
    public static boolean f18550s0;
    public static int f18551s1;
    public static long f18552t;
    public static boolean f18553t0;
    public static int f18554t1;
    public static long f18555u;
    public static boolean f18556u0;
    public static int f18557u1;
    public static int v;
    public static boolean f18558v0;
    public static int f18559v1;
    public static byte[] f18560w;
    public static boolean f18561w0;
    public static boolean f18562w1;
    public static boolean f18563x;
    public static boolean f18564x0;
    public static boolean f18565x1;
    public static int f18566y;
    public static boolean f18567y0;
    public static final int[] f18568y1;
    public static boolean f18569z;
    public static boolean f18570z0;
    public static final ArrayList f18571z1;

    static {
        boolean z10;
        HashSet hashSet = new HashSet();
        e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f18513f = 2;
        f18516g = "";
        h = "";
        f18549s = "";
        f18560w = new byte[0];
        f18566y = 3600;
        D = true;
        G = 1;
        X = true;
        f18507c0 = true;
        f18511e0 = 2;
        f18514f0 = -210000;
        f18517g0 = true;
        f18522i0 = "";
        m0 = new Object();
        f18535n0 = new Object();
        f18538o0 = 2;
        f18541p0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        f18544q0 = z10;
        f18547r0 = false;
        f18550s0 = true;
        f18553t0 = true;
        f18556u0 = false;
        f18558v0 = true;
        f18561w0 = false;
        f18564x0 = true;
        f18567y0 = true;
        f18570z0 = true;
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
        f18554t1 = 3;
        f18557u1 = 3;
        f18559v1 = 3;
        f18568y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        f18571z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i10) {
        G = i10;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i10) {
        if (f18554t1 != i10) {
            f18554t1 = i10;
            w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", f18554t1).apply();
        }
    }

    public static void C(boolean z10) {
        f18562w1 = z10;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", f18562w1);
        edit.apply();
    }

    public static void D(boolean z10) {
        if (A0 == z10) {
            return;
        }
        A0 = z10;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("noSoundHintShowed", A0);
        edit.apply();
    }

    public static void E(int i10) {
        S0 = i10;
        if (i10 < 0 || i10 > 2) {
            S0 = 0;
        }
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putInt("repeatMode", S0);
        edit.apply();
    }

    public static void F(int i10) {
        if (f18557u1 != i10) {
            f18557u1 = i10;
            w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", f18557u1).apply();
        }
    }

    public static void G(boolean z10) {
        U = z10;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("storiesIntroShown", U);
        edit.apply();
    }

    public static void H(boolean z10) {
        T = z10;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("storyReactionsLongPressHint", T);
        edit.apply();
    }

    public static void I(int i10) {
        E = i10;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putInt("suggestStickers", E);
        edit.apply();
    }

    public static void J() {
        f18558v0 = !f18558v0;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("adaptableBrowser", f18558v0);
        edit.apply();
    }

    public static void K() {
        J0 = !J0;
        WebView.setWebContentsDebuggingEnabled(J0);
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("debugWebView", J0);
        edit.apply();
    }

    public static void L() {
        f18509d0 = !f18509d0;
        w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", f18509d0).apply();
    }

    public static void M() {
        f18507c0 = !f18507c0;
        w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", f18507c0).apply();
    }

    public static void N() {
        Y = !Y;
        w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        f18504b0 = !f18504b0;
        w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", f18504b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = wp.d1().edit();
        boolean z10 = !X;
        X = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void Q(int i10) {
        SharedPreferences.Editor edit = w0.f18945b.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !s(i10);
        Z = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void R() {
        f18501a0 = !f18501a0;
        w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", f18501a0).apply();
    }

    public static void S(int i10) {
        f18508c1 = i10;
        w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", f18508c1).apply();
    }

    public static void T(int i10) {
        f18511e0 = i10;
        w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", f18511e0).apply();
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

    public static tz a(tz tzVar) {
        u();
        ArrayList arrayList = f18571z1;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            tz tzVar2 = (tz) arrayList.get(i10);
            if (Objects.equals(tzVar.f18325a, tzVar2.f18325a)) {
                return tzVar2;
            }
        }
        arrayList.add(0, tzVar);
        z();
        return tzVar;
    }

    public static boolean b() {
        if (f18506c == null) {
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
            f18506c = Boolean.valueOf(z10);
        }
        return f18506c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(wp.d1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return w0.f18945b.getPackageManager().getPackageInfo(w0.f18945b.getPackageName(), 0).versionCode;
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
        boolean z10 = v2.f18578a;
        return false;
    }

    public static boolean f() {
        if (e() && tc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (f18560w.length == 0) {
            boolean equals = Utilities.a(str).equals(f18549s);
            if (equals) {
                try {
                    f18560w = new byte[16];
                    Utilities.f14520b.nextBytes(f18560w);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(f18560w, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(f18560w, 0, bArr, bytes.length + 16, 16);
                    f18549s = Utilities.f(Utilities.o(length, bArr));
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
            System.arraycopy(f18560w, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(f18560w, 0, bArr2, bytes2.length + 16, 16);
            return f18549s.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e10) {
            f8.g(e10, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && f18519h0 != null && !f18503b && file.getPath().startsWith(f18519h0)) {
            i0.g3(new ag.f3(29));
        }
    }

    public static void i(tz tzVar) {
        if (B1 == tzVar) {
            B1 = null;
            SharedPreferences d12 = wp.d1();
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
        f18571z1.remove(tzVar);
        z();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z10) {
        if (f18550s0) {
            if (!z10 || f18547r0) {
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
                            boolean z10 = v2.f18578a;
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
        int i11 = f18548r1;
        if (i11 >= 0) {
            if (i11 == 5 && wp.r1(i10).P0.isEmpty()) {
                return 2;
            }
            return f18548r1;
        } else if (wp.r1(i10).P0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (f18525j0 == null) {
            f18525j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f18522i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    f18525j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        return f18525j0;
    }

    public static int o() {
        int i10 = f18539o1;
        if (i10 != -1) {
            return i10;
        }
        if (f18536n1 == -1) {
            f18536n1 = v();
        }
        return f18536n1;
    }

    public static int p() {
        int i10;
        synchronized (f18535n0) {
            i10 = f18514f0;
            f18514f0 = i10 - 1;
        }
        return i10;
    }

    public static SharedPreferences q() {
        return w0.f18945b.getSharedPreferences("userconfing", 0);
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
                                f18552t = 30000L;
                            } else {
                                f18552t = 25000L;
                            }
                        } else {
                            f18552t = 20000L;
                        }
                    } else {
                        f18552t = 15000L;
                    }
                } else {
                    f18552t = 10000L;
                }
            } else {
                f18552t = 5000L;
            }
            f18555u = SystemClock.elapsedRealtime();
        }
        y();
    }

    public static boolean s(int i10) {
        Boolean bool = Z;
        if (bool == null) {
            if (!wp.r1(i10).N5) {
                return true;
            }
            return false;
        }
        return bool.booleanValue();
    }

    public static void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uz.t():void");
    }

    public static void u() {
        if (!A1) {
            SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("mainconfig", 0);
            ji.b c10 = ji.b.c(sharedPreferences);
            A1 = true;
            f18571z1.clear();
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
                            tz a2 = tz.a(readByte, serializedData);
                            f18571z1.add(0, a2);
                            if (B1 == null && c10.f() && c10.equals(a2.f18325a)) {
                                B1 = a2;
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < readInt32; i11++) {
                        tz a10 = tz.a(0, serializedData);
                        f18571z1.add(0, a10);
                        if (B1 == null && c10.f() && c10.equals(a10.f18325a)) {
                            B1 = a10;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (B1 == null && c10.f()) {
                tz tzVar = new tz(c10);
                B1 = tzVar;
                f18571z1.add(0, tzVar);
            }
        }
    }

    public static int v() {
        int ceil;
        long j10;
        String f7;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) w0.f18945b.getSystemService("activity")).getMemoryClass();
        int i12 = 0;
        if (i10 >= 31 && (f7 = e9.f()) != null) {
            int hashCode = f7.toUpperCase().hashCode();
            int i13 = 0;
            while (true) {
                int[] iArr = f18568y1;
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
            ((ActivityManager) w0.f18945b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j10 = -1;
        }
        if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && ((i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24) && (j10 == -1 || j10 >= 2147483648L)))) {
            i12 = (i11 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i11 == 8 && i10 <= 23)) ? 1 : 2;
        }
        if (v2.f18578a) {
            StringBuilder m10 = i0.a.m("device performance info selected_class = ", i12, " (cpu_count = ", i11, ", freq = ");
            i0.a.t(m10, ceil, ", memoryClass = ", memoryClass, ", android version ");
            m10.append(i10);
            m10.append(", manufacture ");
            m10.append(Build.MANUFACTURER);
            m10.append(", screenRefreshRate=");
            m10.append(i0.f16173r);
            m10.append(", screenMaxRefreshRate=");
            m10.append(i0.f16174s);
            m10.append(")");
            f8.b(m10.toString());
        }
        return i12;
    }

    public static void w(int i10) {
        SharedPreferences.Editor edit = wp.d1().edit();
        f18539o1 = i10;
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
                    SharedPreferences.Editor edit = w0.f18945b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", f18569z);
                    edit.putString("passcodeHash1", f18549s);
                    byte[] bArr = f18560w;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", f18563x);
                    edit.putInt("passcodeType", f18546r);
                    edit.putLong("passcodeRetryInMs", f18552t);
                    edit.putLong("lastUptimeMillis", f18555u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", f18566y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", f18517g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", f18516g);
                    edit.putInt("pushType", f18513f);
                    edit.putBoolean("pushStatSent", f18527k);
                    byte[] bArr2 = f18530l;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", f18514f0);
                    edit.putString("passportConfigJson", f18522i0);
                    edit.putInt("passportConfigHash", f18528k0);
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
                    if (!TextUtils.isEmpty(f18519h0)) {
                        str3 = f18519h0;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", f18502a1);
                    edit.putInt("proxyRotationTimeout", f18505b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = f18526j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            f18526j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", f18529k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = w0.f18945b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", f18533m1);
                    edit2.putBoolean("floatingDebugActive", f18565x1);
                    edit2.putBoolean("record_via_sco", f18556u0);
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
        ArrayList arrayList = new ArrayList(f18571z1);
        Collections.sort(arrayList, new ck(22));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i10 = size - 1;
        while (true) {
            int i11 = 0;
            if (i10 >= 0) {
                tz tzVar = (tz) arrayList.get(i10);
                serializedData.writeString(tzVar.f18325a.f10429b);
                serializedData.writeInt32(tzVar.f18325a.f10430c);
                serializedData.writeString(tzVar.f18325a.d);
                serializedData.writeString(tzVar.f18325a.e);
                serializedData.writeString(tzVar.f18325a.f10431f);
                serializedData.writeInt64(tzVar.f18326b);
                serializedData.writeInt64(tzVar.e);
                int c10 = m1.j.c(tzVar.f18325a.f10428a);
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
                w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }
}
