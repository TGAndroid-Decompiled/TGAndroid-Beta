package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aa0;
public abstract class w0 extends Application {
    public static volatile boolean D = true;
    public static volatile boolean E = true;
    public static boolean F = false;
    public static volatile long G = 0;
    public static fu H = null;
    public static t7.u I = null;
    public static li.k J = null;
    public static w0 f18944a = null;
    public static volatile Context f18945b = null;
    public static volatile NetworkInfo f18946c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager e = null;
    public static volatile boolean f18947f = false;
    public static volatile v0 h = null;
    public static long f18948n = 0;
    public static int f18949r = -1;
    public static long f18950s = 0;
    public static volatile boolean f18951w = false;
    public static volatile boolean f18952x = true;
    public static volatile boolean f18953y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) f18944a).getClass();
        try {
            t9.c cVar = (t9.c) l9.h.c().b(t9.c.class);
            if (cVar != null) {
                cVar.a(th2);
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th3) {
            f8.g(th3, false);
        }
    }

    public static void c(boolean z10) {
        if (z10 || f18946c == null) {
            try {
                if (e == null) {
                    e = (ConnectivityManager) f18945b.getSystemService("connectivity");
                }
                f18946c = e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        f18944a.getClass();
    }

    public static int e() {
        int i10;
        try {
            c(false);
            if (f18946c != null) {
                if (f18946c.getType() != 1 && f18946c.getType() != 9) {
                    if (f18946c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i10 = f18949r) == 0 || i10 == 1) && System.currentTimeMillis() - f18948n < 5000)) {
                    return f18949r;
                }
                if (e.isActiveNetworkMetered()) {
                    f18949r = 0;
                } else {
                    f18949r = 1;
                }
                f18948n = System.currentTimeMillis();
                return f18949r;
            }
            return 0;
        } catch (Exception e7) {
            f8.g(e7, true);
            return 0;
        }
    }

    public static int f() {
        if (o()) {
            return 1;
        }
        if (t()) {
            return 2;
        }
        return 0;
    }

    public static File h() {
        for (int i10 = 0; i10 < 10; i10++) {
            File filesDir = f18945b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(f18945b.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e7) {
            f8.g(e7, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static File i() {
        try {
            File file = new File(h(), "rasterized/wallpaper");
            file.mkdirs();
            return file;
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static ILocationServiceProvider j() {
        if (J == null) {
            f18944a.getClass();
            li.k kVar = new li.k(14);
            J = kVar;
            kVar.init(f18945b);
        }
        return J;
    }

    public static IMapsProvider k() {
        if (I == null) {
            f18944a.getClass();
            I = new t7.u(13);
        }
        return I;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (H == null) {
            f18944a.getClass();
            H = fu.f15792b;
        }
        return H;
    }

    public static void m() {
        f18944a.getClass();
    }

    public static void n() {
        f18944a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (f18946c != null) {
                if (f18946c.getType() != 1) {
                    if (f18946c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = f18946c.getState();
                if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                    if (state == NetworkInfo.State.SUSPENDED) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static boolean p() {
        try {
            c(false);
            if (f18946c != null && f18946c.getType() == 0) {
                int subtype = f18946c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        f18944a.getClass();
    }

    public static boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w0.s():boolean");
    }

    public static boolean t() {
        try {
            c(false);
            if (f18946c != null) {
                if (f18946c.isRoaming()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static void u() {
        f18944a.getClass();
    }

    public static void w() {
        if (!f18947f && f18945b != null) {
            f18947f = true;
            ks.g(f18945b);
            try {
                dd.D0();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            try {
                e = (ConnectivityManager) f18945b.getSystemService("connectivity");
                f18945b.registerReceiver(new t0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f18945b.registerReceiver(new t0(3), intentFilter);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                tc.h(f18945b.registerReceiver(new t0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
            try {
                f18951w = ((PowerManager) f18945b.getSystemService("power")).isScreenOn();
                if (v2.f18578a) {
                    f8.b("screen state = " + f18951w);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            uz.t();
            ks.f16787i = f18945b.getSharedPreferences("webview_bots", 0);
            for (int i10 = 0; i10 < 4; i10++) {
                e20.i(i10).s();
                wp.r1(i10);
                if (i10 == 0) {
                    uz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i10).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i10);
                }
                TLRPC.User f7 = e20.i(i10).f();
                if (f7 != null) {
                    wp.r1(i10).U3(f7, true, false);
                    is messagesStorage = rz.C(i10).getMessagesStorage();
                    messagesStorage.f16331a.c(new cr(messagesStorage, 29));
                }
            }
            ((w0) f18945b).getClass();
            i0.h3(new ag.f3(12), 1000L);
            if (v2.f18578a) {
                f8.b("app initied");
            }
            MediaController.B();
            for (int i11 = 0; i11 < 4; i11++) {
                i5 r10 = i5.r(i11);
                r10.f16211a = null;
                Utilities.e.c(new a5(r10, 0));
                b6.q(i11);
            }
            u1.i().q();
        }
    }

    public static void x() {
        boolean z10;
        SharedPreferences e12 = wp.e1();
        if (e12.contains("pushService")) {
            z10 = e12.getBoolean("pushService", true);
        } else {
            z10 = wp.r1(e20.f15506s0).f7.getBoolean("keepAliveService", false);
        }
        if (z10) {
            try {
                f18945b.startService(new Intent(f18945b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        f18945b.stopService(new Intent(f18945b, NotificationsService.class));
    }

    @Override
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public abstract boolean b(Context context);

    public abstract File g();

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            dd.D0().T0(configuration);
            i0.v(f18945b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            i0.c3();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        f18944a = this;
        try {
            f18945b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        Typeface typeface = i0.f16145a;
        if (v2.f18578a) {
            f8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f18950s = elapsedRealtime;
            i0.a.q(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = f18945b.getPackageManager().getPackageInfo(f18945b.getPackageName(), 0);
                int i10 = packageInfo.versionCode % 10;
                if (i10 != 1 && i10 != 2) {
                    u();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i11 = packageInfo.versionCode;
                f8.b("buildVersion = ".concat("v" + str2 + " (" + (i11 / 10) + "[" + (i11 % 10) + "]) " + str));
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            StringBuilder sb3 = new StringBuilder("device = manufacturer=");
            sb3.append(Build.MANUFACTURER);
            sb3.append(", device=");
            sb3.append(Build.DEVICE);
            sb3.append(", model=");
            sb3.append(Build.MODEL);
            sb3.append(", product=");
            a1.g.z(Build.PRODUCT, sb3);
        }
        if (f18945b == null) {
            f18945b = getApplicationContext();
        }
        ks.g(f18945b);
        try {
            ConnectionsManager.native_setJava(false);
            new u0(this);
            new b(new ag.f3(10));
            if (v2.f18578a) {
                f8.b("load libs time = " + (SystemClock.elapsedRealtime() - f18950s));
            }
            d = new Handler(f18945b.getMainLooper());
            i0.g3(new ag.f3(11));
            aa0[] values = aa0.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (w7.j6.a(values[i12])) {
                        break;
                    }
                    i12++;
                } else {
                    w7.j6.b(aa0.DEFAULT);
                    break;
                }
            }
            cu cuVar = cu.f15209c;
            for (int i13 = 0; i13 < 4; i13++) {
                at.f(i13).b(cuVar, at.T1);
            }
            at.e().b(cuVar, at.B4);
            at.e().b(cuVar, at.A4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + ks.e());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
