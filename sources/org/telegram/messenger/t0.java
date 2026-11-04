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
import android.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t80;
public abstract class t0 extends Application {
    public static volatile boolean E = true;
    public static volatile boolean F = true;
    public static boolean G = false;
    public static volatile long H = 0;
    public static lt I = null;
    public static mb.b J = null;
    public static k4.j K = null;
    public static t0 f25456a = null;
    public static volatile Context f25457b = null;
    public static volatile NetworkInfo f25458c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager f25459e = null;
    public static volatile boolean f25460f = false;
    public static volatile s0 h = null;
    public static long f25461n = 0;
    public static int f25462r = -1;
    public static long f25463s = 0;
    public static volatile boolean f25464w = false;
    public static volatile boolean f25465x = true;
    public static volatile boolean f25466y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) f25456a).getClass();
        try {
            v9.b bVar = (v9.b) n9.h.c().b(v9.b.class);
            if (bVar != null) {
                if (th2 == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                z9.p pVar = bVar.f56485a;
                Map map = Collections.EMPTY_MAP;
                pVar.f60227n.f286a.a(new xh.i(pVar, th2));
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th3) {
            a8.g(th3, false);
        }
    }

    public static void c(boolean z10) {
        if (z10 || f25458c == null) {
            try {
                if (f25459e == null) {
                    f25459e = (ConnectivityManager) f25457b.getSystemService("connectivity");
                }
                f25458c = f25459e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    f25459e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        f25456a.getClass();
    }

    public static int e() {
        int i3;
        try {
            c(false);
            if (f25458c != null) {
                if (f25458c.getType() != 1 && f25458c.getType() != 9) {
                    if (f25458c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i3 = f25462r) == 0 || i3 == 1) && System.currentTimeMillis() - f25461n < 5000)) {
                    return f25462r;
                }
                if (f25459e.isActiveNetworkMetered()) {
                    f25462r = 0;
                } else {
                    f25462r = 1;
                }
                f25461n = System.currentTimeMillis();
                return f25462r;
            }
            return 0;
        } catch (Exception e10) {
            a8.g(e10, true);
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
        for (int i3 = 0; i3 < 10; i3++) {
            File filesDir = f25457b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(f25457b.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static File i() {
        try {
            File file = new File(h(), "rasterized/wallpaper");
            file.mkdirs();
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static ILocationServiceProvider j() {
        if (K == null) {
            f25456a.getClass();
            k4.j jVar = new k4.j(15);
            K = jVar;
            jVar.init(f25457b);
        }
        return K;
    }

    public static IMapsProvider k() {
        if (J == null) {
            f25456a.getClass();
            J = new mb.b(17);
        }
        return J;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (I == null) {
            f25456a.getClass();
            I = lt.f24103b;
        }
        return I;
    }

    public static void m() {
        f25456a.getClass();
    }

    public static void n() {
        f25456a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (f25458c != null) {
                if (f25458c.getType() != 1) {
                    if (f25458c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = f25458c.getState();
                if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                    if (state == NetworkInfo.State.SUSPENDED) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static boolean p() {
        try {
            c(false);
            if (f25458c != null && f25458c.getType() == 0) {
                int subtype = f25458c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        f25456a.getClass();
    }

    public static boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t0.s():boolean");
    }

    public static boolean t() {
        try {
            c(false);
            if (f25458c != null) {
                if (f25458c.isRoaming()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static void u() {
        f25456a.getClass();
    }

    public static void w() {
        if (!f25460f && f25457b != null) {
            f25460f = true;
            sr.f(f25457b);
            try {
                bd.E0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                f25459e = (ConnectivityManager) f25457b.getSystemService("connectivity");
                f25457b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f25457b.registerReceiver(new q0(3), intentFilter);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                lc.h(f25457b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
            try {
                f25464w = ((PowerManager) f25457b.getSystemService("power")).isScreenOn();
                if (r2.f25040a) {
                    a8.b("screen state = " + f25464w);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            az.t();
            b6.f21747g = f25457b.getSharedPreferences("webview_bots", 0);
            for (int i3 = 0; i3 < 4; i3++) {
                h10.i(i3).s();
                hp.s1(i3);
                if (i3 == 0) {
                    az.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i3).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i3);
                }
                TLRPC.User f10 = h10.i(i3).f();
                if (f10 != null) {
                    hp.s1(i3).X3(f10, true, false);
                    qr messagesStorage = yy.C(i3).getMessagesStorage();
                    messagesStorage.f24934a.c(new hq(messagesStorage, 29));
                }
            }
            ((t0) f25457b).getClass();
            g0.i3(new ai.y1(25), 1000L);
            if (r2.f25040a) {
                a8.b("app initied");
            }
            MediaController.B();
            for (int i10 = 0; i10 < 4; i10++) {
                g5 r5 = g5.r(i10);
                r5.f22643a = null;
                Utilities.f21387e.c(new x4(r5, 0));
                z5.q(i10);
            }
            r1.i().q();
        }
    }

    public static void x() {
        boolean z10;
        SharedPreferences f12 = hp.f1();
        if (f12.contains("pushService")) {
            z10 = f12.getBoolean("pushService", true);
        } else {
            z10 = hp.s1(h10.f22829t0).f22999e7.getBoolean("keepAliveService", false);
        }
        if (z10) {
            try {
                f25457b.startService(new Intent(f25457b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        f25457b.stopService(new Intent(f25457b, NotificationsService.class));
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
            bd.E0().W0(configuration);
            g0.v(f25457b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.d3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        f25456a = this;
        try {
            f25457b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        Typeface typeface = g0.f22580a;
        if (r2.f25040a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f25463s = elapsedRealtime;
            k2.p1.r(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = f25457b.getPackageManager().getPackageInfo(f25457b.getPackageName(), 0);
                int i3 = packageInfo.versionCode % 10;
                if (i3 != 1 && i3 != 2) {
                    u();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i10 = packageInfo.versionCode;
                a8.b("buildVersion = ".concat("v" + str2 + " (" + (i10 / 10) + "[" + (i10 % 10) + "]) " + str));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            StringBuilder sb3 = new StringBuilder("device = manufacturer=");
            sb3.append(Build.MANUFACTURER);
            sb3.append(", device=");
            sb3.append(Build.DEVICE);
            sb3.append(", model=");
            sb3.append(Build.MODEL);
            sb3.append(", product=");
            k2.p1.w(Build.PRODUCT, sb3);
        }
        if (f25457b == null) {
            f25457b = getApplicationContext();
        }
        sr.f(f25457b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.y1(23));
            if (r2.f25040a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - f25463s));
            }
            d = new Handler(f25457b.getMainLooper());
            g0.h3(new ai.y1(24));
            t80[] values = t80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (b8.uf.a(values[i11])) {
                        break;
                    }
                    i11++;
                } else {
                    b8.uf.b(t80.DEFAULT);
                    break;
                }
            }
            ht htVar = ht.f23368c;
            for (int i12 = 0; i12 < 4; i12++) {
                hs.f(i12).b(htVar, hs.T1);
            }
            hs.e().b(htVar, hs.B4);
            hs.e().b(htVar, hs.A4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + sr.d());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
