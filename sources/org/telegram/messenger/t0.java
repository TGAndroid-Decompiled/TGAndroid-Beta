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
import org.telegram.ui.w80;
public abstract class t0 extends Application {
    public static volatile boolean D = true;
    public static volatile boolean E = true;
    public static boolean F = false;
    public static volatile long G = 0;
    public static tt H = null;
    public static nb.a I = null;
    public static h6.m J = null;
    public static t0 f25562a = null;
    public static volatile Context f25563b = null;
    public static volatile NetworkInfo f25564c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager f25565e = null;
    public static volatile boolean f25566f = false;
    public static volatile s0 h = null;
    public static long f25567n = 0;
    public static int f25568r = -1;
    public static long f25569s = 0;
    public static volatile boolean f25570w = false;
    public static volatile boolean f25571x = true;
    public static volatile boolean f25572y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) f25562a).getClass();
        try {
            w9.b bVar = (w9.b) o9.g.c().b(w9.b.class);
            if (bVar != null) {
                if (th2 == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                aa.u uVar = bVar.f57528a;
                Map map = Collections.EMPTY_MAP;
                uVar.f868n.f3135a.a(new a1.e(uVar, th2));
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th3) {
            a8.g(th3, false);
        }
    }

    public static void c(boolean z9) {
        if (z9 || f25564c == null) {
            try {
                if (f25565e == null) {
                    f25565e = (ConnectivityManager) f25563b.getSystemService("connectivity");
                }
                f25564c = f25565e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    f25565e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        f25562a.getClass();
    }

    public static int e() {
        int i7;
        try {
            c(false);
            if (f25564c != null) {
                if (f25564c.getType() != 1 && f25564c.getType() != 9) {
                    if (f25564c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i7 = f25568r) == 0 || i7 == 1) && System.currentTimeMillis() - f25567n < 5000)) {
                    return f25568r;
                }
                if (f25565e.isActiveNetworkMetered()) {
                    f25568r = 0;
                } else {
                    f25568r = 1;
                }
                f25567n = System.currentTimeMillis();
                return f25568r;
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
        for (int i7 = 0; i7 < 10; i7++) {
            File filesDir = f25563b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(f25563b.getApplicationInfo().dataDir, "files");
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
        if (J == null) {
            f25562a.getClass();
            h6.m mVar = new h6.m(19);
            J = mVar;
            mVar.init(f25563b);
        }
        return J;
    }

    public static IMapsProvider k() {
        if (I == null) {
            f25562a.getClass();
            I = new nb.a(17);
        }
        return I;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (H == null) {
            f25562a.getClass();
            H = tt.f25660b;
        }
        return H;
    }

    public static void m() {
        f25562a.getClass();
    }

    public static void n() {
        f25562a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (f25564c != null) {
                if (f25564c.getType() != 1) {
                    if (f25564c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = f25564c.getState();
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
            if (f25564c != null && f25564c.getType() == 0) {
                int subtype = f25564c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        f25562a.getClass();
    }

    public static boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t0.s():boolean");
    }

    public static boolean t() {
        try {
            c(false);
            if (f25564c != null) {
                if (f25564c.isRoaming()) {
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
        f25562a.getClass();
    }

    public static void w() {
        if (!f25566f && f25563b != null) {
            f25566f = true;
            as.f(f25563b);
            try {
                hd.E0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                f25565e = (ConnectivityManager) f25563b.getSystemService("connectivity");
                f25563b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f25563b.registerReceiver(new q0(3), intentFilter);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                rc.h(f25563b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
            try {
                f25570w = ((PowerManager) f25563b.getSystemService("power")).isScreenOn();
                if (r2.f25199a) {
                    a8.b("screen state = " + f25570w);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            iz.t();
            b6.f21596g = f25563b.getSharedPreferences("webview_bots", 0);
            for (int i7 = 0; i7 < 4; i7++) {
                p10.i(i7).s();
                qp.s1(i7);
                if (i7 == 0) {
                    iz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i7).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i7);
                }
                TLRPC.User f10 = p10.i(i7).f();
                if (f10 != null) {
                    qp.s1(i7).X3(f10, true, false);
                    yr messagesStorage = gz.C(i7).getMessagesStorage();
                    messagesStorage.f26696a.c(new qq(messagesStorage, 29));
                }
            }
            ((t0) f25563b).getClass();
            g0.i3(new ai.m0(21), 1000L);
            if (r2.f25199a) {
                a8.b("app initied");
            }
            MediaController.B();
            for (int i10 = 0; i10 < 4; i10++) {
                g5 r10 = g5.r(i10);
                r10.f22581a = null;
                Utilities.f21333e.c(new x4(r10, 0));
                z5.q(i10);
            }
            r1.i().q();
        }
    }

    public static void x() {
        boolean z9;
        SharedPreferences f12 = qp.f1();
        if (f12.contains("pushService")) {
            z9 = f12.getBoolean("pushService", true);
        } else {
            z9 = qp.s1(p10.f24467s0).f24767e7.getBoolean("keepAliveService", false);
        }
        if (z9) {
            try {
                f25563b.startService(new Intent(f25563b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        f25563b.stopService(new Intent(f25563b, NotificationsService.class));
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
            hd.E0().W0(configuration);
            g0.v(f25563b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.d3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        f25562a = this;
        try {
            f25563b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        Typeface typeface = g0.f22516a;
        if (r2.f25199a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f25569s = elapsedRealtime;
            jg.g.u(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = f25563b.getPackageManager().getPackageInfo(f25563b.getPackageName(), 0);
                int i7 = packageInfo.versionCode % 10;
                if (i7 != 1 && i7 != 2) {
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
            org.telegram.ui.Cells.f1.u(Build.PRODUCT, sb3);
        }
        if (f25563b == null) {
            f25563b = getApplicationContext();
        }
        as.f(f25563b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.m0(19));
            if (r2.f25199a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - f25569s));
            }
            d = new Handler(f25563b.getMainLooper());
            g0.h3(new ai.m0(20));
            w80[] values = w80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (c8.ua.a(values[i11])) {
                        break;
                    }
                    i11++;
                } else {
                    c8.ua.b(w80.DEFAULT);
                    break;
                }
            }
            qt qtVar = qt.f25130c;
            for (int i12 = 0; i12 < 4; i12++) {
                qs.f(i12).b(qtVar, qs.T1);
            }
            qs.e().b(qtVar, qs.B4);
            qs.e().b(qtVar, qs.A4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + as.d());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
