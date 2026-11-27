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
    public static z3f J = null;
    public static pm3 K = null;
    public static a a = null;
    public static volatile Context b = null;
    public static volatile NetworkInfo c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager e = null;
    public static volatile boolean f = false;
    public static volatile wr h = null;
    public static long n = 0;
    public static int r = -1;
    public static long s = 0;
    public static volatile boolean w = false;
    public static volatile boolean x = true;
    public static volatile boolean y = true;

    public static void a(Throwable th) {
        ((ApplicationLoaderImpl) a).getClass();
        try {
            li4 li4Var = (li4) ji4.c().b(li4.class);
            if (li4Var != null) {
                if (th == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                zc1 zc1Var = li4Var.a;
                Map map = Collections.EMPTY_MAP;
                ((i03) ((rx6) zc1Var.n).b).a(new bv2(zc1Var, th));
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th2) {
            cc4.g(th2, false);
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
            cc4.g(e2, true);
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
            cc4.g(e2, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static ILocationServiceProvider i() {
        if (K == null) {
            a.getClass();
            pm3 pm3Var = new pm3((byte) 6);
            K = pm3Var;
            pm3Var.init(b);
        }
        return K;
    }

    public static IMapsProvider j() {
        z3f z3fVar = J;
        if (z3fVar == null) {
            a.getClass();
            z3f z3fVar2 = new z3f((byte) 20);
            J = z3fVar2;
            return z3fVar2;
        }
        return z3fVar;
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
            cc4.g(e2, true);
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
            cc4.g(e2, true);
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
            cc4.g(e2, true);
            return false;
        }
    }

    public static void t() {
        a.getClass();
    }

    public static void v() {
        if (!f && b != null) {
            f = true;
            ok7.c(b);
            try {
                ob6.D0();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                e = (ConnectivityManager) b.getSystemService("connectivity");
                b.registerReceiver(new ur((byte) 0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                b.registerReceiver(new ur((byte) 3), intentFilter);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            try {
                i86.h(b.registerReceiver(new ur((byte) 1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th) {
                cc4.g(th, true);
            }
            try {
                w = ((PowerManager) b.getSystemService("power")).isScreenOn();
                if (f11.a) {
                    cc4.b("screen state = " + w);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            xea.s();
            vye.a = b.getSharedPreferences("webview_bots", 0);
            for (int i = 0; i < 4; i++) {
                yac.h(i).r();
                uc7.s1(i);
                if (i == 0) {
                    xea.g = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i);
                }
                TLRPC.User f2 = yac.h(i).f();
                if (f2 != null) {
                    uc7.s1(i).i4(f2, true, false);
                    jf7 messagesStorage = r7a.B(i).getMessagesStorage();
                    messagesStorage.a.c(new be7(messagesStorage, (byte) 22));
                    String i2 = ea4.i(i);
                    if (i2 != null) {
                        ea4.e.postRunnable(new qu2(i2, (byte) 1));
                    }
                }
            }
            ((a) b).getClass();
            hl.d3(new kc((byte) 8), 1000L);
            if (f11.a) {
                cc4.b("app initied");
            }
            MediaController.z();
            for (int i3 = 0; i3 < 4; i3++) {
                lv2 r2 = lv2.r(i3);
                r2.a = null;
                Utilities.e.c(new pu2(r2, (byte) 0));
                lq3.q(i3);
            }
            di0.h().q();
            hl.d3(new kc((byte) 4), 3000L);
        }
    }

    public static void w() {
        boolean z;
        SharedPreferences f1 = uc7.f1();
        if (f1.contains("pushService")) {
            z = f1.getBoolean("pushService", true);
        } else {
            z = uc7.s1(yac.t0).X3.getBoolean("keepAliveService", false);
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
            jj.j(context, null).show();
            return false;
        }
        return true;
    }

    public final File g() {
        ph0 e2 = ph0.e();
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
            ob6.D0().W0(configuration);
            hl.v(b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            hl.Y2();
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
        Typeface typeface = hl.a;
        if (f11.a) {
            cc4.b("Hello World!");
            StringBuilder sb = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s = elapsedRealtime;
            ik8.q(elapsedRealtime, sb);
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
                cc4.b("buildVersion = ".concat("v" + str2 + " (" + (i2 / 10) + "[" + (i2 % 10) + "]) " + str));
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            StringBuilder sb2 = new StringBuilder("device = manufacturer=");
            sb2.append(Build.MANUFACTURER);
            sb2.append(", device=");
            sb2.append(Build.DEVICE);
            sb2.append(", model=");
            sb2.append(Build.MODEL);
            sb2.append(", product=");
            uh9.s(Build.PRODUCT, sb2);
        }
        if (b == null) {
            b = getApplicationContext();
        }
        ok7.c(b);
        try {
            ConnectionsManager.native_setJava(false);
            new vr(this);
            new e1(new kc((byte) 5));
            if (f11.a) {
                cc4.b("load libs time = " + (SystemClock.elapsedRealtime() - s));
            }
            d = new Handler(b.getMainLooper());
            hl.c3(new kc((byte) 6));
            g26[] values = g26.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (ere.a(values[i3])) {
                        break;
                    }
                    i3++;
                } else {
                    ere.b(g26.DEFAULT);
                    break;
                }
            }
            ix8 ix8Var = ix8.c;
            for (int i4 = 0; i4 < 4; i4++) {
                jn7.f(i4).a(ix8Var, jn7.T1);
            }
            jn7.e().a(ix8Var, jn7.E4);
            jn7.e().a(ix8Var, jn7.D4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + ok7.a());
        }
    }

    public abstract boolean u(Activity activity, TLRPC.Document document);
}
