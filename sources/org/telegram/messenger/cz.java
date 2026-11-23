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
public abstract class cz {
    public static boolean A = false;
    public static boolean A0 = false;
    public static boolean A1 = false;
    public static int B = 0;
    public static boolean B0 = false;
    public static bz B1 = null;
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
    public static int f23390a = -1;
    public static boolean f23391a0;
    public static boolean f23392a1;
    public static boolean f23393b;
    public static boolean f23394b0;
    public static int f23395b1;
    public static Boolean f23396c;
    public static boolean f23397c0;
    public static int f23398c1;
    public static String d;
    public static boolean f23399d0;
    public static int f23400d1;
    public static final HashSet f23401e;
    public static int f23402e0;
    public static int f23403e1;
    public static int f23404f;
    public static int f23405f0;
    public static int f23406f1;
    public static String f23407g;
    public static boolean f23408g0;
    public static boolean f23409g1;
    public static String h;
    public static String f23410h0;
    public static boolean f23411h1;
    public static long f23412i;
    public static String f23413i0;
    public static boolean f23414i1;
    public static long f23415j;
    public static HashMap f23416j0;
    public static TLRPC.TL_help_appUpdate f23417j1;
    public static boolean f23418k;
    public static int f23419k0;
    public static int f23420k1;
    public static byte[] f23421l;
    public static boolean f23422l0;
    public static long l1;
    public static byte[] f23423m;
    public static final Object m0;
    public static boolean f23424m1;
    public static boolean f23425n;
    public static final Object f23426n0;
    public static int n1;
    public static boolean f23427o;
    public static int f23428o0;
    public static int f23429o1;
    public static boolean f23430p;
    public static int f23431p0;
    public static boolean f23432p1;
    public static String f23433q;
    public static final boolean f23434q0;
    public static boolean f23435q1;
    public static int f23436r;
    public static boolean f23437r0;
    public static int f23438r1;
    public static String f23439s;
    public static boolean f23440s0;
    public static int f23441s1;
    public static long f23442t;
    public static boolean f23443t0;
    public static int f23444t1;
    public static long f23445u;
    public static boolean f23446u0;
    public static int f23447u1;
    public static int v;
    public static boolean f23448v0;
    public static int f23449v1;
    public static byte[] f23450w;
    public static boolean f23451w0;
    public static boolean f23452w1;
    public static boolean f23453x;
    public static boolean f23454x0;
    public static boolean f23455x1;
    public static int f23456y;
    public static boolean f23457y0;
    public static final int[] f23458y1;
    public static boolean f23459z;
    public static boolean f23460z0;
    public static final ArrayList f23461z1;

    static {
        boolean z10;
        HashSet hashSet = new HashSet();
        f23401e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f23404f = 2;
        f23407g = "";
        h = "";
        f23439s = "";
        f23450w = new byte[0];
        f23456y = 3600;
        D = true;
        G = 1;
        X = true;
        f23397c0 = true;
        f23402e0 = 2;
        f23405f0 = -210000;
        f23408g0 = true;
        f23413i0 = "";
        m0 = new Object();
        f23426n0 = new Object();
        f23428o0 = 2;
        f23431p0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        f23434q0 = z10;
        f23437r0 = false;
        f23440s0 = true;
        f23443t0 = true;
        f23446u0 = false;
        f23448v0 = true;
        f23451w0 = false;
        f23454x0 = true;
        f23457y0 = true;
        f23460z0 = true;
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
        f23444t1 = 3;
        f23447u1 = 3;
        f23449v1 = 3;
        f23458y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        f23461z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i7) {
        G = i7;
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i7) {
        if (f23444t1 != i7) {
            f23444t1 = i7;
            t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", f23444t1).apply();
        }
    }

    public static void C(boolean z10) {
        f23452w1 = z10;
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", f23452w1);
        edit.apply();
    }

    public static void D(boolean z10) {
        if (A0 == z10) {
            return;
        }
        A0 = z10;
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putBoolean("noSoundHintShowed", A0);
        edit.apply();
    }

    public static void E(int i7) {
        S0 = i7;
        if (i7 < 0 || i7 > 2) {
            S0 = 0;
        }
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putInt("repeatMode", S0);
        edit.apply();
    }

    public static void F(int i7) {
        if (f23447u1 != i7) {
            f23447u1 = i7;
            t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", f23447u1).apply();
        }
    }

    public static void G(boolean z10) {
        U = z10;
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putBoolean("storiesIntroShown", U);
        edit.apply();
    }

    public static void H(boolean z10) {
        T = z10;
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putBoolean("storyReactionsLongPressHint", T);
        edit.apply();
    }

    public static void I(int i7) {
        E = i7;
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putInt("suggestStickers", E);
        edit.apply();
    }

    public static void J() {
        f23448v0 = !f23448v0;
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putBoolean("adaptableBrowser", f23448v0);
        edit.apply();
    }

    public static void K() {
        J0 = !J0;
        WebView.setWebContentsDebuggingEnabled(J0);
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putBoolean("debugWebView", J0);
        edit.apply();
    }

    public static void L() {
        f23399d0 = !f23399d0;
        t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", f23399d0).apply();
    }

    public static void M() {
        f23397c0 = !f23397c0;
        t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", f23397c0).apply();
    }

    public static void N() {
        Y = !Y;
        t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        f23394b0 = !f23394b0;
        t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", f23394b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = np.g1().edit();
        boolean z10 = !X;
        X = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void Q(int i7) {
        SharedPreferences.Editor edit = t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !s(i7);
        Z = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void R() {
        f23391a0 = !f23391a0;
        t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", f23391a0).apply();
    }

    public static void S(int i7) {
        f23398c1 = i7;
        t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", f23398c1).apply();
    }

    public static void T(int i7) {
        f23402e0 = i7;
        t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", f23402e0).apply();
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

    public static bz a(bz bzVar) {
        u();
        ArrayList arrayList = f23461z1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            bz bzVar2 = (bz) arrayList.get(i7);
            if (Objects.equals(bzVar.f23197a, bzVar2.f23197a)) {
                return bzVar2;
            }
        }
        arrayList.add(0, bzVar);
        z();
        return bzVar;
    }

    public static boolean b() {
        if (f23396c == null) {
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
            f23396c = Boolean.valueOf(z10);
        }
        return f23396c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(np.g1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return t0.f26931b.getPackageManager().getPackageInfo(t0.f26931b.getPackageName(), 0).versionCode;
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
        boolean z10 = s2.f26730a;
        return false;
    }

    public static boolean f() {
        if (e() && qc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (f23450w.length == 0) {
            boolean equals = Utilities.a(str).equals(f23439s);
            if (equals) {
                try {
                    f23450w = new byte[16];
                    Utilities.f22808b.nextBytes(f23450w);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(f23450w, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(f23450w, 0, bArr, bytes.length + 16, 16);
                    f23439s = Utilities.f(Utilities.o(length, bArr));
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
            System.arraycopy(f23450w, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(f23450w, 0, bArr2, bytes2.length + 16, 16);
            return f23439s.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e11) {
            a8.g(e11, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && f23410h0 != null && !f23393b && file.getPath().startsWith(f23410h0)) {
            g0.g3(new j2(16));
        }
    }

    public static void i(bz bzVar) {
        if (B1 == bzVar) {
            B1 = null;
            SharedPreferences g12 = np.g1();
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
        f23461z1.remove(bzVar);
        z();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z10) {
        if (f23440s0) {
            if (!z10 || f23437r0) {
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
                            boolean z10 = s2.f26730a;
                            if (f23401e.contains(codecInfoAt.getName().toLowerCase())) {
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
        int i10 = f23438r1;
        if (i10 >= 0) {
            if (i10 == 5 && np.u1(i7).Q0.isEmpty()) {
                return 2;
            }
            return f23438r1;
        } else if (np.u1(i7).Q0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (f23416j0 == null) {
            f23416j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f23413i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    f23416j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return f23416j0;
    }

    public static int o() {
        int i7 = f23429o1;
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
        synchronized (f23426n0) {
            i7 = f23405f0;
            f23405f0 = i7 - 1;
        }
        return i7;
    }

    public static SharedPreferences q() {
        return t0.f26931b.getSharedPreferences("userconfing", 0);
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
                                f23442t = 30000L;
                            } else {
                                f23442t = 25000L;
                            }
                        } else {
                            f23442t = 20000L;
                        }
                    } else {
                        f23442t = 15000L;
                    }
                } else {
                    f23442t = 10000L;
                }
            } else {
                f23442t = 5000L;
            }
            f23445u = SystemClock.elapsedRealtime();
        }
        y();
    }

    public static boolean s(int i7) {
        Boolean bool = Z;
        if (bool == null) {
            if (!np.u1(i7).P5) {
                return true;
            }
            return false;
        }
        return bool.booleanValue();
    }

    public static void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cz.t():void");
    }

    public static void u() {
        if (!A1) {
            SharedPreferences sharedPreferences = t0.f26931b.getSharedPreferences("mainconfig", 0);
            xi.a c10 = xi.a.c(sharedPreferences);
            A1 = true;
            f23461z1.clear();
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
                            bz a10 = bz.a(readByte, serializedData);
                            f23461z1.add(0, a10);
                            if (B1 == null && c10.g() && c10.equals(a10.f23197a)) {
                                B1 = a10;
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < readInt32; i10++) {
                        bz a11 = bz.a(0, serializedData);
                        f23461z1.add(0, a11);
                        if (B1 == null && c10.g() && c10.equals(a11.f23197a)) {
                            B1 = a11;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (B1 == null && c10.g()) {
                bz bzVar = new bz(c10);
                B1 = bzVar;
                f23461z1.add(0, bzVar);
            }
        }
    }

    public static int v() {
        int ceil;
        long j3;
        String i7;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) t0.f26931b.getSystemService("activity")).getMemoryClass();
        int i12 = 0;
        if (i10 >= 31 && (i7 = fd.i()) != null) {
            int hashCode = i7.toUpperCase().hashCode();
            int i13 = 0;
            while (true) {
                int[] iArr = f23458y1;
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
            ((ActivityManager) t0.f26931b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j3 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j3 = -1;
        }
        if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && ((i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24) && (j3 == -1 || j3 >= 2147483648L)))) {
            i12 = (i11 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i11 == 8 && i10 <= 23)) ? 1 : 2;
        }
        if (s2.f26730a) {
            StringBuilder n10 = i5.c.n("device performance info selected_class = ", i12, " (cpu_count = ", i11, ", freq = ");
            i5.c.z(n10, ceil, ", memoryClass = ", memoryClass, ", android version ");
            n10.append(i10);
            n10.append(", manufacture ");
            n10.append(Build.MANUFACTURER);
            n10.append(", screenRefreshRate=");
            n10.append(g0.f24047r);
            n10.append(", screenMaxRefreshRate=");
            n10.append(g0.f24048s);
            n10.append(")");
            a8.b(n10.toString());
        }
        return i12;
    }

    public static void w(int i7) {
        SharedPreferences.Editor edit = np.g1().edit();
        f23429o1 = i7;
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
                    SharedPreferences.Editor edit = t0.f26931b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", f23459z);
                    edit.putString("passcodeHash1", f23439s);
                    byte[] bArr = f23450w;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", f23453x);
                    edit.putInt("passcodeType", f23436r);
                    edit.putLong("passcodeRetryInMs", f23442t);
                    edit.putLong("lastUptimeMillis", f23445u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", f23456y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", f23408g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", f23407g);
                    edit.putInt("pushType", f23404f);
                    edit.putBoolean("pushStatSent", f23418k);
                    byte[] bArr2 = f23421l;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", f23405f0);
                    edit.putString("passportConfigJson", f23413i0);
                    edit.putInt("passportConfigHash", f23419k0);
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
                    if (!TextUtils.isEmpty(f23410h0)) {
                        str3 = f23410h0;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", f23392a1);
                    edit.putInt("proxyRotationTimeout", f23395b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = f23417j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            f23417j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", f23420k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", f23424m1);
                    edit2.putBoolean("floatingDebugActive", f23455x1);
                    edit2.putBoolean("record_via_sco", f23446u0);
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
        ArrayList arrayList = new ArrayList(f23461z1);
        Collections.sort(arrayList, new el(19));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i7 = size - 1;
        while (true) {
            int i10 = 0;
            if (i7 >= 0) {
                bz bzVar = (bz) arrayList.get(i7);
                serializedData.writeString(bzVar.f23197a.f60653b);
                serializedData.writeInt32(bzVar.f23197a.f60654c);
                serializedData.writeString(bzVar.f23197a.d);
                serializedData.writeString(bzVar.f23197a.f60655e);
                serializedData.writeString(bzVar.f23197a.f60656f);
                serializedData.writeInt64(bzVar.f23198b);
                serializedData.writeInt64(bzVar.f23200e);
                int c10 = p1.g.c(bzVar.f23197a.f60652a);
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
                t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }
}
