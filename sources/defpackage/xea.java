package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class xea {
    public static int A;
    public static boolean A0;
    public static boolean B;
    public static boolean B0;
    public static boolean C;
    public static boolean C0;
    public static int D;
    public static boolean D0;
    public static boolean E;
    public static boolean E0;
    public static int F;
    public static boolean F0;
    public static int G;
    public static boolean G0;
    public static int H;
    public static boolean H0;
    public static int I;
    public static boolean I0;
    public static int J;
    public static boolean J0;
    public static long K;
    public static boolean K0;
    public static int L;
    public static boolean L0;
    public static long M;
    public static boolean M0;
    public static int N;
    public static boolean N0;
    public static boolean O;
    public static int O0;
    public static boolean P;
    public static boolean P0;
    public static boolean Q;
    public static boolean Q0;
    public static int R;
    public static boolean R0;
    public static boolean S;
    public static int S0;
    public static boolean T;
    public static boolean T0;
    public static boolean U;
    public static int U0;
    public static boolean V;
    public static int V0;
    public static boolean W;
    public static boolean W0;
    public static boolean X;
    public static int X0;
    public static boolean Y;
    public static int Y0;
    public static boolean Z;
    public static int Z0;
    public static boolean a;
    public static boolean a0;
    public static int a1;
    public static Boolean b;
    public static int b0;
    public static int b1;
    public static String c;
    public static int c0;
    public static boolean c1;
    public static final HashSet d;
    public static boolean d0;
    public static boolean d1;
    public static int e;
    public static String e0;
    public static boolean e1;
    public static String f;
    public static String f0;
    public static TLRPC.TL_help_appUpdate f1;
    public static String g;
    public static HashMap g0;
    public static int g1;
    public static long h;
    public static int h0;
    public static long h1;
    public static long i;
    public static boolean i0;
    public static boolean i1;
    public static boolean j;
    public static final Object j0;
    public static int j1;
    public static byte[] k;
    public static final Object k0;
    public static int k1;
    public static byte[] l;
    public static int l0;
    public static boolean l1;
    public static boolean m;
    public static int m0;
    public static boolean m1;
    public static boolean n;
    public static final boolean n0;
    public static int n1;
    public static boolean o;
    public static boolean o0;
    public static int o1;
    public static String p;
    public static boolean p0;
    public static int p1;
    public static int q;
    public static boolean q0;
    public static int q1;
    public static String r;
    public static boolean r0;
    public static int r1;
    public static long s;
    public static boolean s0;
    public static boolean s1;
    public static long t;
    public static boolean t0;
    public static boolean t1;
    public static int u;
    public static boolean u0;
    public static final int[] u1;
    public static byte[] v;
    public static boolean v0;
    public static final ArrayList v1;
    public static boolean w;
    public static boolean w0;
    public static boolean w1;
    public static int x;
    public static boolean x0;
    public static wea x1;
    public static boolean y;
    public static boolean y0;
    public static Boolean y1;
    public static boolean z;
    public static boolean z0;
    public static boolean z1;

    static {
        boolean z2;
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        e = 2;
        f = "";
        g = "";
        r = "";
        v = new byte[0];
        x = 3600;
        C = true;
        F = 1;
        W = true;
        Z = true;
        b0 = 2;
        c0 = -210000;
        d0 = true;
        f0 = "";
        j0 = new Object();
        k0 = new Object();
        l0 = 2;
        m0 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z2 = true;
        } else {
            z2 = false;
        }
        n0 = z2;
        o0 = false;
        p0 = true;
        q0 = true;
        r0 = false;
        s0 = true;
        t0 = false;
        u0 = true;
        v0 = true;
        w0 = false;
        x0 = true;
        y0 = false;
        z0 = false;
        A0 = true;
        B0 = false;
        C0 = false;
        D0 = false;
        G0 = true;
        M0 = true;
        N0 = false;
        S0 = 16;
        U0 = 17;
        V0 = 16;
        p1 = 3;
        q1 = 3;
        r1 = 3;
        u1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        s();
        v1 = new ArrayList();
        z1 = true;
    }

    public static void A(int i2) {
        if (p1 != i2) {
            p1 = i2;
            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", p1).apply();
        }
    }

    public static void B(boolean z2) {
        s1 = z2;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", s1);
        edit.apply();
    }

    public static void C(boolean z2) {
        if (w0 == z2) {
            return;
        }
        w0 = z2;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("noSoundHintShowed", w0);
        edit.apply();
    }

    public static void D(int i2) {
        O0 = i2;
        if (i2 < 0 || i2 > 2) {
            O0 = 0;
        }
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("repeatMode", O0);
        edit.apply();
    }

    public static void E(int i2) {
        if (q1 != i2) {
            q1 = i2;
            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", q1).apply();
        }
    }

    public static void F(boolean z2) {
        T = z2;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("storiesIntroShown", T);
        edit.apply();
    }

    public static void G(boolean z2) {
        S = z2;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("storyReactionsLongPressHint", S);
        edit.apply();
    }

    public static void H(int i2) {
        D = i2;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("suggestStickers", D);
        edit.apply();
    }

    public static void I() {
        s0 = !s0;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("adaptableBrowser", s0);
        edit.apply();
    }

    public static void J() {
        boolean z2 = !F0;
        F0 = z2;
        WebView.setWebContentsDebuggingEnabled(z2);
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("debugWebView", F0);
        edit.apply();
    }

    public static void K() {
        a0 = !a0;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", a0).apply();
    }

    public static void L() {
        Z = !Z;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", Z).apply();
    }

    public static void M() {
        Y = !Y;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", Y).apply();
    }

    public static void N() {
        SharedPreferences.Editor edit = uc7.e1().edit();
        boolean z2 = !W;
        W = z2;
        edit.putBoolean("updateStickersOrderOnSend", z2);
        edit.apply();
    }

    public static void O() {
        X = !X;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", X).apply();
    }

    public static void P(int i2) {
        Y0 = i2;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", Y0).apply();
    }

    public static void Q(int i2) {
        b0 = i2;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", b0).apply();
    }

    public static boolean R(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i2 = 0; i2 < Math.min(split.length, split2.length); i2++) {
            int parseInt = Integer.parseInt(split[i2]);
            int parseInt2 = Integer.parseInt(split2[i2]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
    }

    public static wea a(wea weaVar) {
        t();
        ArrayList arrayList = v1;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wea weaVar2 = (wea) arrayList.get(i2);
            if (Objects.equals(weaVar.a, weaVar2.a)) {
                return weaVar2;
            }
        }
        arrayList.add(0, weaVar);
        y();
        return weaVar;
    }

    public static boolean b() {
        Boolean bool = b;
        if (bool == null) {
            int codecCount = MediaCodecList.getCodecCount();
            boolean z2 = false;
            int i2 = 0;
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (!codecInfoAt.isEncoder()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        } else if (codecInfoAt.getSupportedTypes()[i4].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i2) {
                                i2 = maxSupportedInstances;
                            }
                        } else {
                            i4++;
                        }
                    }
                }
            }
            if (i2 >= 8) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
            b = bool;
        }
        return bool.booleanValue();
    }

    public static boolean c() {
        Boolean bool = y1;
        if (bool == null) {
            bool = Boolean.valueOf(uc7.e1().getBoolean("view_animations", true));
            y1 = bool;
        }
        return bool.booleanValue();
    }

    public static int d() {
        try {
            return a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode;
        } catch (Exception e2) {
            cc4.g(e2, true);
            return 0;
        }
    }

    public static boolean e() {
        int i2;
        int o2 = o();
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        if (o2 >= i2) {
            return true;
        }
        boolean z2 = f11.a;
        return false;
    }

    public static boolean f() {
        if (e() && i86.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (v.length == 0) {
            boolean equals = Utilities.a(str).equals(r);
            if (equals) {
                try {
                    v = new byte[16];
                    Utilities.b.nextBytes(v);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(v, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(v, 0, bArr, bytes.length + 16, 16);
                    r = Utilities.f(Utilities.o(length, bArr));
                    x();
                    return equals;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            return equals;
        }
        try {
            byte[] bytes2 = str.getBytes("UTF-8");
            int length2 = bytes2.length + 32;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(v, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(v, 0, bArr2, bytes2.length + 16, 16);
            return r.equals(Utilities.f(Utilities.o(length2, bArr2)));
        } catch (Exception e3) {
            cc4.g(e3, true);
            return false;
        }
    }

    public static void h(File file) {
        if (file != null && e0 != null && !a && file.getPath().startsWith(e0)) {
            hl.c3(new pg6((byte) 27));
        }
    }

    public static void i(wea weaVar) {
        if (x1 == weaVar) {
            x1 = null;
            SharedPreferences e12 = uc7.e1();
            boolean z2 = e12.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = e12.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_type", 0);
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.apply();
            if (z2) {
                ConnectionsManager.setProxySettings(false, null);
            }
        }
        v1.remove(weaVar);
        y();
    }

    public static boolean j() {
        if (o() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean k(boolean z2) {
        if (p0) {
            if (!z2 || o0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String l() {
        String str = c;
        if (str == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt.isEncoder()) {
                    for (int i3 = 0; i3 < codecInfoAt.getSupportedTypes().length; i3++) {
                        if (codecInfoAt.getSupportedTypes()[i3].contains("video/hevc") && codecInfoAt.isHardwareAccelerated()) {
                            boolean z2 = f11.a;
                            if (d.contains(codecInfoAt.getName().toLowerCase())) {
                                String name = codecInfoAt.getName();
                                c = name;
                                return name;
                            }
                        }
                    }
                    continue;
                }
            }
            str = "";
            c = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c;
    }

    public static int m(int i2) {
        int i3 = n1;
        if (i3 >= 0) {
            if (i3 == 5 && uc7.s1(i2).G0.isEmpty()) {
                return 2;
            }
            return n1;
        } else if (uc7.s1(i2).G0.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
    }

    public static HashMap n() {
        if (g0 == null) {
            g0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    g0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        return g0;
    }

    public static int o() {
        int i2 = k1;
        if (i2 != -1) {
            return i2;
        }
        int i3 = j1;
        if (i3 == -1) {
            int u2 = u();
            j1 = u2;
            return u2;
        }
        return i3;
    }

    public static int p() {
        int i2;
        synchronized (k0) {
            i2 = c0;
            c0 = i2 - 1;
        }
        return i2;
    }

    public static SharedPreferences q() {
        return a.b.getSharedPreferences("userconfing", 0);
    }

    public static void r() {
        int i2 = u + 1;
        u = i2;
        if (i2 >= 3) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                s = 30000L;
                            } else {
                                s = 25000L;
                            }
                        } else {
                            s = 20000L;
                        }
                    } else {
                        s = 15000L;
                    }
                } else {
                    s = 10000L;
                }
            } else {
                s = 5000L;
            }
            t = SystemClock.elapsedRealtime();
        }
        x();
    }

    public static void s() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xea.s():void");
    }

    public static void t() {
        if (!w1) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
            jx8 c2 = jx8.c(sharedPreferences);
            w1 = true;
            v1.clear();
            x1 = null;
            String string = sharedPreferences.getString("proxy_list", null);
            if (!TextUtils.isEmpty(string)) {
                SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                int readInt32 = serializedData.readInt32(false);
                if (readInt32 == -1) {
                    byte readByte = serializedData.readByte(false);
                    if (readByte != 2 && readByte != 3) {
                        cc4.d("Unknown proxy schema version: " + ((int) readByte));
                    } else {
                        int readInt322 = serializedData.readInt32(false);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            wea a2 = wea.a(readByte, serializedData);
                            v1.add(0, a2);
                            if (x1 == null && c2.g() && c2.equals(a2.a)) {
                                x1 = a2;
                            }
                        }
                    }
                } else {
                    for (int i3 = 0; i3 < readInt32; i3++) {
                        wea a3 = wea.a(0, serializedData);
                        v1.add(0, a3);
                        if (x1 == null && c2.g() && c2.equals(a3.a)) {
                            x1 = a3;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (x1 == null && c2.g()) {
                wea weaVar = new wea(c2);
                x1 = weaVar;
                v1.add(0, weaVar);
            }
        }
    }

    public static int u() {
        int ceil;
        long j2;
        String j3;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) a.b.getSystemService("activity")).getMemoryClass();
        int i4 = 0;
        if (i2 >= 31 && (j3 = vr9.j()) != null) {
            int hashCode = j3.toUpperCase().hashCode();
            int i5 = 0;
            while (true) {
                int[] iArr = u1;
                if (i5 >= iArr.length) {
                    break;
                } else if (iArr[i5] == hashCode) {
                    return 0;
                } else {
                    i5++;
                }
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i8 + "/cpufreq/cpuinfo_max_freq", "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i7 += Utilities.z(readLine).intValue() / 1000;
                    i6++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        if (i6 == 0) {
            ceil = -1;
        } else {
            ceil = (int) Math.ceil(i7 / i6);
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) a.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j2 = -1;
        }
        if (i3 > 2 && memoryClass > 100 && ((i3 > 4 || ceil == -1 || ceil > 1250) && ((i3 > 4 || ceil > 1300 || memoryClass > 128 || i2 > 24) && (j2 == -1 || j2 >= 2147483648L)))) {
            if (i3 >= 8 && memoryClass > 160) {
                if (ceil == -1) {
                    i4 = 2;
                }
            }
            i4 = 1;
        }
        if (f11.a) {
            StringBuilder p2 = bs2.p("device performance info selected_class = ", i4, " (cpu_count = ", i3, ", freq = ");
            bs2.w(p2, ceil, ", memoryClass = ", memoryClass, ", android version ");
            p2.append(i2);
            p2.append(", manufacture ");
            p2.append(Build.MANUFACTURER);
            p2.append(", screenRefreshRate=");
            p2.append(hl.r);
            p2.append(", screenMaxRefreshRate=");
            p2.append(hl.s);
            p2.append(")");
            cc4.b(p2.toString());
        }
        return i4;
    }

    public static void v(int i2) {
        SharedPreferences.Editor edit = uc7.e1().edit();
        k1 = i2;
        edit.putInt("overrideDevicePerformanceClass", i2).remove("lite_mode").apply();
    }

    public static String w(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return "UNKNOWN";
                }
                return "HIGH";
            }
            return "AVERAGE";
        }
        return "LOW";
    }

    public static void x() {
        String str;
        String str2;
        String str3;
        synchronized (j0) {
            try {
                SharedPreferences.Editor edit = a.b.getSharedPreferences("userconfing", 0).edit();
                edit.putBoolean("saveIncomingPhotos", y);
                edit.putString("passcodeHash1", r);
                byte[] bArr = v;
                if (bArr.length > 0) {
                    str = Base64.encodeToString(bArr, 0);
                } else {
                    str = "";
                }
                edit.putString("passcodeSalt", str);
                edit.putBoolean("appLocked", w);
                edit.putInt("passcodeType", q);
                edit.putLong("passcodeRetryInMs", s);
                edit.putLong("lastUptimeMillis", t);
                edit.putInt("badPasscodeTries", u);
                edit.putInt("autoLockIn", x);
                edit.putInt("lastPauseTime", A);
                edit.putBoolean("useFingerprint", C);
                edit.putBoolean("walletUseFingerprintLock", d0);
                edit.putBoolean("allowScreenCapture", z);
                edit.putString("pushString2", f);
                edit.putInt("pushType", e);
                edit.putBoolean("pushStatSent", j);
                byte[] bArr2 = k;
                if (bArr2 != null) {
                    str2 = Base64.encodeToString(bArr2, 0);
                } else {
                    str2 = "";
                }
                edit.putString("pushAuthKey", str2);
                edit.putInt("lastLocalId", c0);
                edit.putString("passportConfigJson", f0);
                edit.putInt("passportConfigHash", h0);
                edit.putBoolean("sortContactsByName", H0);
                edit.putBoolean("sortFilesByName", I0);
                edit.putInt("textSelectionHintShows", I);
                edit.putInt("scheduledOrNoSoundHintShows", J);
                edit.putLong("scheduledOrNoSoundHintSeenAt", K);
                edit.putInt("scheduledHintShows", L);
                edit.putLong("scheduledHintSeenAt", M);
                edit.putBoolean("forwardingOptionsHintShown", O);
                edit.putBoolean("replyingOptionsHintShown", P);
                edit.putInt("lockRecordAudioVideoHint", N);
                if (!TextUtils.isEmpty(e0)) {
                    str3 = e0;
                } else {
                    str3 = "";
                }
                edit.putString("storageCacheDir", str3);
                edit.putBoolean("proxyRotationEnabled", W0);
                edit.putInt("proxyRotationTimeout", X0);
                TLRPC.TL_help_appUpdate tL_help_appUpdate = f1;
                if (tL_help_appUpdate != null) {
                    try {
                        SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                        f1.serializeToStream(serializedData);
                        edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                        edit.putInt("appUpdateBuild", g1);
                        serializedData.cleanup();
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove("appUpdate");
                }
                edit.putLong("appUpdateCheckTime", h1);
                edit.apply();
                SharedPreferences.Editor edit2 = a.b.getSharedPreferences("mainconfig", 0).edit();
                edit2.putBoolean("hasEmailLogin", i1);
                edit2.putBoolean("floatingDebugActive", t1);
                edit2.putBoolean("record_via_sco", r0);
                edit2.apply();
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public static void y() {
        ArrayList arrayList = new ArrayList(v1);
        Collections.sort(arrayList, new qq7((byte) 27));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i2 = size - 1;
        while (true) {
            int i3 = 0;
            if (i2 >= 0) {
                wea weaVar = (wea) arrayList.get(i2);
                serializedData.writeString(weaVar.a.b);
                serializedData.writeInt32(weaVar.a.c);
                serializedData.writeString(weaVar.a.d);
                serializedData.writeString(weaVar.a.e);
                serializedData.writeString(weaVar.a.f);
                serializedData.writeInt64(weaVar.b);
                serializedData.writeInt64(weaVar.e);
                int F2 = ik8.F(weaVar.a.a);
                if (F2 != 1) {
                    if (F2 == 2) {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
                serializedData.writeInt32(i3);
                i2--;
            } else {
                a.b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
        }
    }

    public static void z(int i2) {
        F = i2;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("keep_media", F);
        edit.apply();
    }
}
