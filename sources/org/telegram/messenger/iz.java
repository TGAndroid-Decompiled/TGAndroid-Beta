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
public abstract class iz {
    public static boolean A = false;
    public static boolean A0 = false;
    public static boolean A1 = false;
    public static int B = 0;
    public static boolean B0 = false;
    public static hz B1 = null;
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
    public static int f23385a = -1;
    public static boolean f23386a0;
    public static boolean f23387a1;
    public static boolean f23388b;
    public static boolean f23389b0;
    public static int f23390b1;
    public static Boolean f23391c;
    public static boolean f23392c0;
    public static int f23393c1;
    public static String d;
    public static boolean f23394d0;
    public static int f23395d1;
    public static final HashSet f23396e;
    public static int f23397e0;
    public static int f23398e1;
    public static int f23399f;
    public static int f23400f0;
    public static int f23401f1;
    public static String f23402g;
    public static boolean f23403g0;
    public static boolean f23404g1;
    public static String h;
    public static String f23405h0;
    public static boolean f23406h1;
    public static long f23407i;
    public static String f23408i0;
    public static boolean f23409i1;
    public static long f23410j;
    public static HashMap f23411j0;
    public static TLRPC.TL_help_appUpdate f23412j1;
    public static boolean f23413k;
    public static int f23414k0;
    public static int f23415k1;
    public static byte[] f23416l;
    public static boolean f23417l0;
    public static long l1;
    public static byte[] f23418m;
    public static final Object m0;
    public static boolean f23419m1;
    public static boolean f23420n;
    public static final Object f23421n0;
    public static int n1;
    public static boolean f23422o;
    public static int f23423o0;
    public static int f23424o1;
    public static boolean f23425p;
    public static int f23426p0;
    public static boolean f23427p1;
    public static String f23428q;
    public static final boolean f23429q0;
    public static boolean f23430q1;
    public static int f23431r;
    public static boolean f23432r0;
    public static int f23433r1;
    public static String f23434s;
    public static boolean f23435s0;
    public static int f23436s1;
    public static long f23437t;
    public static boolean f23438t0;
    public static int f23439t1;
    public static long f23440u;
    public static boolean f23441u0;
    public static int f23442u1;
    public static int v;
    public static boolean f23443v0;
    public static int f23444v1;
    public static byte[] f23445w;
    public static boolean f23446w0;
    public static boolean f23447w1;
    public static boolean f23448x;
    public static boolean f23449x0;
    public static boolean f23450x1;
    public static int f23451y;
    public static boolean f23452y0;
    public static final int[] f23453y1;
    public static boolean f23454z;
    public static boolean f23455z0;
    public static final ArrayList f23456z1;

    static {
        boolean z9;
        HashSet hashSet = new HashSet();
        f23396e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f23399f = 2;
        f23402g = "";
        h = "";
        f23434s = "";
        f23445w = new byte[0];
        f23451y = 3600;
        D = true;
        G = 1;
        X = true;
        f23392c0 = true;
        f23397e0 = 2;
        f23400f0 = -210000;
        f23403g0 = true;
        f23408i0 = "";
        m0 = new Object();
        f23421n0 = new Object();
        f23423o0 = 2;
        f23426p0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z9 = true;
        } else {
            z9 = false;
        }
        f23429q0 = z9;
        f23432r0 = false;
        f23435s0 = true;
        f23438t0 = true;
        f23441u0 = false;
        f23443v0 = true;
        f23446w0 = false;
        f23449x0 = true;
        f23452y0 = true;
        f23455z0 = true;
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
        f23439t1 = 3;
        f23442u1 = 3;
        f23444v1 = 3;
        f23453y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        f23456z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i7) {
        G = i7;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i7) {
        if (f23439t1 != i7) {
            f23439t1 = i7;
            t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", f23439t1).apply();
        }
    }

    public static void C(boolean z9) {
        f23447w1 = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", f23447w1);
        edit.apply();
    }

    public static void D(boolean z9) {
        if (A0 == z9) {
            return;
        }
        A0 = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("noSoundHintShowed", A0);
        edit.apply();
    }

    public static void E(int i7) {
        S0 = i7;
        if (i7 < 0 || i7 > 2) {
            S0 = 0;
        }
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("repeatMode", S0);
        edit.apply();
    }

    public static void F(int i7) {
        if (f23442u1 != i7) {
            f23442u1 = i7;
            t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", f23442u1).apply();
        }
    }

    public static void G(boolean z9) {
        U = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("storiesIntroShown", U);
        edit.apply();
    }

    public static void H(boolean z9) {
        T = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("storyReactionsLongPressHint", T);
        edit.apply();
    }

    public static void I(int i7) {
        E = i7;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("suggestStickers", E);
        edit.apply();
    }

    public static void J() {
        f23443v0 = !f23443v0;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("adaptableBrowser", f23443v0);
        edit.apply();
    }

    public static void K() {
        J0 = !J0;
        WebView.setWebContentsDebuggingEnabled(J0);
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("debugWebView", J0);
        edit.apply();
    }

    public static void L() {
        f23394d0 = !f23394d0;
        t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", f23394d0).apply();
    }

    public static void M() {
        f23392c0 = !f23392c0;
        t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", f23392c0).apply();
    }

    public static void N() {
        Y = !Y;
        t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        f23389b0 = !f23389b0;
        t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", f23389b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = qp.e1().edit();
        boolean z9 = !X;
        X = z9;
        edit.putBoolean("updateStickersOrderOnSend", z9);
        edit.apply();
    }

    public static void Q(int i7) {
        SharedPreferences.Editor edit = t0.f25566b.getSharedPreferences("mainconfig", 0).edit();
        boolean z9 = !s(i7);
        Z = Boolean.valueOf(z9);
        edit.putBoolean("useCamera2Force_2", z9).apply();
    }

    public static void R() {
        f23386a0 = !f23386a0;
        t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", f23386a0).apply();
    }

    public static void S(int i7) {
        f23393c1 = i7;
        t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", f23393c1).apply();
    }

    public static void T(int i7) {
        f23397e0 = i7;
        t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", f23397e0).apply();
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

    public static hz a(hz hzVar) {
        u();
        ArrayList arrayList = f23456z1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            hz hzVar2 = (hz) arrayList.get(i7);
            if (Objects.equals(hzVar.f22994a, hzVar2.f22994a)) {
                return hzVar2;
            }
        }
        arrayList.add(0, hzVar);
        z();
        return hzVar;
    }

    public static boolean b() {
        if (f23391c == null) {
            int codecCount = MediaCodecList.getCodecCount();
            boolean z9 = false;
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
                z9 = true;
            }
            f23391c = Boolean.valueOf(z9);
        }
        return f23391c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(qp.e1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return t0.f25566b.getPackageManager().getPackageInfo(t0.f25566b.getPackageName(), 0).versionCode;
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
        boolean z9 = r2.f25212a;
        return false;
    }

    public static boolean f() {
        if (e() && sc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (f23445w.length == 0) {
            boolean equals = Utilities.a(str).equals(f23434s);
            if (equals) {
                try {
                    f23445w = new byte[16];
                    Utilities.f21334b.nextBytes(f23445w);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(f23445w, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(f23445w, 0, bArr, bytes.length + 16, 16);
                    f23434s = Utilities.f(Utilities.o(length, bArr));
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
            System.arraycopy(f23445w, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(f23445w, 0, bArr2, bytes2.length + 16, 16);
            return f23434s.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e11) {
            a8.g(e11, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && f23405h0 != null && !f23388b && file.getPath().startsWith(f23405h0)) {
            g0.h3(new rc(10));
        }
    }

    public static void i(hz hzVar) {
        if (B1 == hzVar) {
            B1 = null;
            SharedPreferences e12 = qp.e1();
            boolean z9 = e12.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = e12.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_type", 0);
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.apply();
            if (z9) {
                ConnectionsManager.setProxySettings(false, null);
            }
        }
        f23456z1.remove(hzVar);
        z();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z9) {
        if (f23435s0) {
            if (!z9 || f23432r0) {
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
                            boolean z9 = r2.f25212a;
                            if (f23396e.contains(codecInfoAt.getName().toLowerCase())) {
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
        int i10 = f23433r1;
        if (i10 >= 0) {
            if (i10 == 5 && qp.s1(i7).P0.isEmpty()) {
                return 2;
            }
            return f23433r1;
        } else if (qp.s1(i7).P0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (f23411j0 == null) {
            f23411j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f23408i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    f23411j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return f23411j0;
    }

    public static int o() {
        int i7 = f23424o1;
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
        synchronized (f23421n0) {
            i7 = f23400f0;
            f23400f0 = i7 - 1;
        }
        return i7;
    }

    public static SharedPreferences q() {
        return t0.f25566b.getSharedPreferences("userconfing", 0);
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
                                f23437t = 30000L;
                            } else {
                                f23437t = 25000L;
                            }
                        } else {
                            f23437t = 20000L;
                        }
                    } else {
                        f23437t = 15000L;
                    }
                } else {
                    f23437t = 10000L;
                }
            } else {
                f23437t = 5000L;
            }
            f23440u = SystemClock.elapsedRealtime();
        }
        y();
    }

    public static boolean s(int i7) {
        Boolean bool = Z;
        if (bool == null) {
            if (!qp.s1(i7).M5) {
                return true;
            }
            return false;
        }
        return bool.booleanValue();
    }

    public static void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iz.t():void");
    }

    public static void u() {
        if (!A1) {
            SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("mainconfig", 0);
            ui.a c10 = ui.a.c(sharedPreferences);
            A1 = true;
            f23456z1.clear();
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
                            hz a10 = hz.a(readByte, serializedData);
                            f23456z1.add(0, a10);
                            if (B1 == null && c10.g() && c10.equals(a10.f22994a)) {
                                B1 = a10;
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < readInt32; i10++) {
                        hz a11 = hz.a(0, serializedData);
                        f23456z1.add(0, a11);
                        if (B1 == null && c10.g() && c10.equals(a11.f22994a)) {
                            B1 = a11;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (B1 == null && c10.g()) {
                hz hzVar = new hz(c10);
                B1 = hzVar;
                f23456z1.add(0, hzVar);
            }
        }
    }

    public static int v() {
        int ceil;
        long j3;
        String i7;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) t0.f25566b.getSystemService("activity")).getMemoryClass();
        int i12 = 0;
        if (i10 >= 31 && (i7 = ch.i()) != null) {
            int hashCode = i7.toUpperCase().hashCode();
            int i13 = 0;
            while (true) {
                int[] iArr = f23453y1;
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
            ((ActivityManager) t0.f25566b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j3 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j3 = -1;
        }
        if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && ((i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24) && (j3 == -1 || j3 >= 2147483648L)))) {
            i12 = (i11 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i11 == 8 && i10 <= 23)) ? 1 : 2;
        }
        if (r2.f25212a) {
            StringBuilder o4 = jg.g.o("device performance info selected_class = ", i12, " (cpu_count = ", i11, ", freq = ");
            jg.g.x(o4, ceil, ", memoryClass = ", memoryClass, ", android version ");
            o4.append(i10);
            o4.append(", manufacture ");
            o4.append(Build.MANUFACTURER);
            o4.append(", screenRefreshRate=");
            o4.append(g0.f22564r);
            o4.append(", screenMaxRefreshRate=");
            o4.append(g0.f22565s);
            o4.append(")");
            a8.b(o4.toString());
        }
        return i12;
    }

    public static void w(int i7) {
        SharedPreferences.Editor edit = qp.e1().edit();
        f23424o1 = i7;
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
                    SharedPreferences.Editor edit = t0.f25566b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", f23454z);
                    edit.putString("passcodeHash1", f23434s);
                    byte[] bArr = f23445w;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", f23448x);
                    edit.putInt("passcodeType", f23431r);
                    edit.putLong("passcodeRetryInMs", f23437t);
                    edit.putLong("lastUptimeMillis", f23440u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", f23451y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", f23403g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", f23402g);
                    edit.putInt("pushType", f23399f);
                    edit.putBoolean("pushStatSent", f23413k);
                    byte[] bArr2 = f23416l;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", f23400f0);
                    edit.putString("passportConfigJson", f23408i0);
                    edit.putInt("passportConfigHash", f23414k0);
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
                    if (!TextUtils.isEmpty(f23405h0)) {
                        str3 = f23405h0;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", f23387a1);
                    edit.putInt("proxyRotationTimeout", f23390b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = f23412j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            f23412j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", f23415k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = t0.f25566b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", f23419m1);
                    edit2.putBoolean("floatingDebugActive", f23450x1);
                    edit2.putBoolean("record_via_sco", f23441u0);
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
        ArrayList arrayList = new ArrayList(f23456z1);
        Collections.sort(arrayList, new jl(20));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i7 = size - 1;
        while (true) {
            int i10 = 0;
            if (i7 >= 0) {
                hz hzVar = (hz) arrayList.get(i7);
                serializedData.writeString(hzVar.f22994a.f56917b);
                serializedData.writeInt32(hzVar.f22994a.f56918c);
                serializedData.writeString(hzVar.f22994a.d);
                serializedData.writeString(hzVar.f22994a.f56919e);
                serializedData.writeString(hzVar.f22994a.f56920f);
                serializedData.writeInt64(hzVar.f22995b);
                serializedData.writeInt64(hzVar.f22997e);
                int c10 = p1.g.c(hzVar.f22994a.f56916a);
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
                t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }
}
