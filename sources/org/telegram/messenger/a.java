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
import org.telegram.utils.twidget.WidgetEngineService;
public abstract class a extends Application {
    public static volatile boolean E = true;
    public static volatile boolean F = true;
    public static boolean G = false;
    public static volatile long H = 0;
    public static b I = null;
    public static k1f J = null;
    public static in3 K = null;
    public static a a = null;
    public static volatile Context b = null;
    public static volatile NetworkInfo c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager e = null;
    public static volatile boolean f = false;
    public static volatile vs h = null;
    public static long n = 0;
    public static int r = -1;
    public static long s = 0;
    public static volatile boolean w = false;
    public static volatile boolean x = true;
    public static volatile boolean y = true;

    public static void a(Throwable th) {
        ((ApplicationLoaderImpl) a).getClass();
        try {
            ni4 ni4Var = (ni4) li4.c().b(ni4.class);
            if (ni4Var != null) {
                if (th == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                zd1 zd1Var = ni4Var.a;
                Map map = Collections.EMPTY_MAP;
                ((a13) ((mx6) zd1Var.n).b).a(new mv2(zd1Var, th));
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th2) {
            fc4.g(th2, false);
        }
    }

    public static void c(boolean z) {
        if (z || c == null) {
            try {
                ConnectivityManager connectivityManager = e;
                if (connectivityManager == null) {
                    connectivityManager = (ConnectivityManager) b.getSystemService("connectivity");
                    e = connectivityManager;
                }
                c = connectivityManager.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        a.getClass();
    }

    public static int e() {
        int i;
        try {
            c(false);
            if (c != null) {
                if (c.getType() != 1 && c.getType() != 9) {
                    if (c.isRoaming()) {
                        return 2;
                    }
                } else if (Build.VERSION.SDK_INT >= 24 && (((i = r) == 0 || i == 1) && System.currentTimeMillis() - n < 5000)) {
                    return r;
                } else {
                    if (e.isActiveNetworkMetered()) {
                        r = 0;
                    } else {
                        r = 1;
                    }
                    n = System.currentTimeMillis();
                    return r;
                }
            }
            return 0;
        } catch (Exception e2) {
            fc4.g(e2, true);
            return 0;
        }
    }

    public static int f() {
        if (n()) {
            return 1;
        }
        if (s()) {
            return 2;
        }
        return 0;
    }

    public static File h() {
        for (int i = 0; i < 10; i++) {
            File filesDir = b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(b.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e2) {
            fc4.g(e2, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static ILocationServiceProvider i() {
        if (K == null) {
            a.getClass();
            in3 in3Var = new in3((byte) 6);
            K = in3Var;
            in3Var.init(b);
        }
        return K;
    }

    public static IMapsProvider j() {
        k1f k1fVar = J;
        if (k1fVar == null) {
            a.getClass();
            k1f k1fVar2 = new k1f((byte) 20);
            J = k1fVar2;
            return k1fVar2;
        }
        return k1fVar;
    }

    public static PushListenerController.IPushListenerServiceProvider k() {
        b bVar = I;
        if (bVar == null) {
            a.getClass();
            b bVar2 = b.b;
            I = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public static void l() {
        a.getClass();
    }

    public static void m() {
        a.getClass();
    }

    public static boolean n() {
        try {
            c(false);
            if (c != null && (c.getType() == 1 || c.getType() == 9)) {
                NetworkInfo.State state = c.getState();
                if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                    if (state == NetworkInfo.State.SUSPENDED) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e2) {
            fc4.g(e2, true);
            return false;
        }
    }

    public static boolean o() {
        try {
            c(false);
            if (c != null && (c.getType() == 1 || c.getType() == 9)) {
                if (c.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            fc4.g(e2, true);
            return false;
        }
    }

    public static boolean p() {
        try {
            c(false);
            if (c != null && c.getType() == 0) {
                int subtype = c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void q() {
        a.getClass();
    }

    public static boolean r() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a.r():boolean");
    }

    public static boolean s() {
        try {
            c(false);
            if (c != null) {
                if (c.isRoaming()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            fc4.g(e2, true);
            return false;
        }
    }

    public static void t() {
        a.getClass();
    }

    public static void v() {
        if (!f && b != null) {
            f = true;
            ik7.c(b);
            try {
                jb6.D0();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                e = (ConnectivityManager) b.getSystemService("connectivity");
                b.registerReceiver(new ts((byte) 0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                b.registerReceiver(new ts((byte) 3), intentFilter);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            try {
                e86.h(b.registerReceiver(new ts((byte) 1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th) {
                fc4.g(th, true);
            }
            try {
                w = ((PowerManager) b.getSystemService("power")).isScreenOn();
                if (e21.a) {
                    fc4.b("screen state = " + w);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            gda.s();
            ewe.a = b.getSharedPreferences("webview_bots", 0);
            for (int i = 0; i < 4; i++) {
                z8c.h(i).r();
                oc7.r1(i);
                if (i == 0) {
                    gda.g = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i);
                }
                TLRPC.User f2 = z8c.h(i).f();
                if (f2 != null) {
                    oc7.r1(i).c4(f2, true, false);
                    cf7 messagesStorage = a6a.B(i).getMessagesStorage();
                    messagesStorage.a.c(new xd7(messagesStorage, (byte) 22));
                    String f3 = ia4.f(i);
                    if (f3 != null) {
                        ia4.d.postRunnable(new iv2(f3, (byte) 1));
                    }
                }
            }
            ((a) b).getClass();
            gm.d3(new jd((byte) 8), 1000L);
            if (e21.a) {
                fc4.b("app initied");
            }
            MediaController.w();
            for (int i2 = 0; i2 < 4; i2++) {
                bw2 r2 = bw2.r(i2);
                r2.a = null;
                Utilities.e.c(new hv2(r2, (byte) 0));
                er3.q(i2);
            }
            cj0.h().q();
            gm.d3(new jd((byte) 4), 3000L);
        }
    }

    public static void w() {
        boolean z;
        SharedPreferences e1 = oc7.e1();
        if (e1.contains("pushService")) {
            z = e1.getBoolean("pushService", true);
        } else {
            z = oc7.r1(z8c.t0).X3.getBoolean("keepAliveService", false);
        }
        if (z) {
            try {
                b.startService(new Intent(b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        b.stopService(new Intent(b, NotificationsService.class));
    }

    @Override
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !b.getPackageManager().canRequestPackageInstalls()) {
            ik.j(context, null).show();
            return false;
        }
        return true;
    }

    public final File g() {
        oi0 e2 = oi0.e();
        if (e2.d == null) {
            return null;
        }
        File file = new File(e2.d);
        if (!file.exists()) {
            e2.d = null;
            e2.f();
            return null;
        }
        return file;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            jb6.D0().W0(configuration);
            gm.v(b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            gm.Y2();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        a = this;
        try {
            b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        if (WidgetEngineService.d()) {
            return;
        }
        Typeface typeface = gm.a;
        if (e21.a) {
            fc4.b("Hello World!");
            StringBuilder sb = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s = elapsedRealtime;
            wi8.q(elapsedRealtime, sb);
            try {
                PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
                int i = packageInfo.versionCode % 10;
                if (i != 1 && i != 2) {
                    t();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i2 = packageInfo.versionCode;
                fc4.b("buildVersion = ".concat("v" + str2 + " (" + (i2 / 10) + "[" + (i2 % 10) + "]) " + str));
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            StringBuilder sb2 = new StringBuilder("device = manufacturer=");
            sb2.append(Build.MANUFACTURER);
            sb2.append(", device=");
            sb2.append(Build.DEVICE);
            sb2.append(", model=");
            sb2.append(Build.MODEL);
            sb2.append(", product=");
            hg9.r(Build.PRODUCT, sb2);
        }
        if (b == null) {
            b = getApplicationContext();
        }
        ik7.c(b);
        try {
            ConnectionsManager.native_setJava(false);
            new us(this);
            new d1(new jd((byte) 5));
            if (e21.a) {
                fc4.b("load libs time = " + (SystemClock.elapsedRealtime() - s));
            }
            d = new Handler(b.getMainLooper());
            gm.c3(new jd((byte) 6));
            c26[] values = c26.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (moe.a(values[i3])) {
                        break;
                    }
                    i3++;
                } else {
                    moe.b(c26.DEFAULT);
                    break;
                }
            }
            aw8 aw8Var = aw8.c;
            for (int i4 = 0; i4 < 4; i4++) {
                nm7.f(i4).a(aw8Var, nm7.T1);
            }
            nm7.e().a(aw8Var, nm7.F4);
            nm7.e().a(aw8Var, nm7.E4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + ik7.a());
        }
    }

    public abstract boolean u(Activity activity, TLRPC.Document document);
}
