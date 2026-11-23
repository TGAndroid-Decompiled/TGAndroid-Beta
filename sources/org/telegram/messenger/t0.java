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
import org.telegram.ui.z80;
import org.telegram.utils.twidget.WidgetEngineService;
public abstract class t0 extends Application {
    public static volatile boolean E = true;
    public static volatile boolean F = true;
    public static boolean G = false;
    public static volatile long H = 0;
    public static ot I = null;
    public static pb.b J = null;
    public static h6.m K = null;
    public static t0 f26894a = null;
    public static volatile Context f26895b = null;
    public static volatile NetworkInfo f26896c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager f26897e = null;
    public static volatile boolean f26898f = false;
    public static volatile s0 h = null;
    public static long f26899n = 0;
    public static int f26900r = -1;
    public static long f26901s = 0;
    public static volatile boolean f26902w = false;
    public static volatile boolean f26903x = true;
    public static volatile boolean f26904y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) f26894a).getClass();
        try {
            w9.b bVar = (w9.b) o9.g.c().b(w9.b.class);
            if (bVar != null) {
                if (th2 == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                aa.t tVar = bVar.f59646a;
                Map map = Collections.EMPTY_MAP;
                tVar.f864n.f3058a.a(new a1.e(tVar, th2));
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th3) {
            a8.g(th3, false);
        }
    }

    public static void c(boolean z10) {
        if (z10 || f26896c == null) {
            try {
                if (f26897e == null) {
                    f26897e = (ConnectivityManager) f26895b.getSystemService("connectivity");
                }
                f26896c = f26897e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    f26897e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        f26894a.getClass();
    }

    public static int e() {
        int i7;
        try {
            c(false);
            if (f26896c != null) {
                if (f26896c.getType() != 1 && f26896c.getType() != 9) {
                    if (f26896c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i7 = f26900r) == 0 || i7 == 1) && System.currentTimeMillis() - f26899n < 5000)) {
                    return f26900r;
                }
                if (f26897e.isActiveNetworkMetered()) {
                    f26900r = 0;
                } else {
                    f26900r = 1;
                }
                f26899n = System.currentTimeMillis();
                return f26900r;
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
            File filesDir = f26895b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(f26895b.getApplicationInfo().dataDir, "files");
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
            f26894a.getClass();
            h6.m mVar = new h6.m(20);
            K = mVar;
            mVar.init(f26895b);
        }
        return K;
    }

    public static IMapsProvider k() {
        if (J == null) {
            f26894a.getClass();
            J = new pb.b(17);
        }
        return J;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (I == null) {
            f26894a.getClass();
            I = ot.f26129b;
        }
        return I;
    }

    public static void m() {
        f26894a.getClass();
    }

    public static void n() {
        f26894a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (f26896c != null) {
                if (f26896c.getType() != 1) {
                    if (f26896c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = f26896c.getState();
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
            if (f26896c != null && f26896c.getType() == 0) {
                int subtype = f26896c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        f26894a.getClass();
    }

    public static boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t0.s():boolean");
    }

    public static boolean t() {
        try {
            c(false);
            if (f26896c != null) {
                if (f26896c.isRoaming()) {
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
        f26894a.getClass();
    }

    public static void w() {
        if (!f26898f && f26895b != null) {
            f26898f = true;
            wr.f(f26895b);
            try {
                hd.E0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                f26897e = (ConnectivityManager) f26895b.getSystemService("connectivity");
                f26895b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f26895b.registerReceiver(new q0(3), intentFilter);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                qc.h(f26895b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
            try {
                f26902w = ((PowerManager) f26895b.getSystemService("power")).isScreenOn();
                if (s2.f26694a) {
                    a8.b("screen state = " + f26902w);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            cz.t();
            c6.f23202g = f26895b.getSharedPreferences("webview_bots", 0);
            for (int i7 = 0; i7 < 4; i7++) {
                k10.i(i7).s();
                np.u1(i7);
                if (i7 == 0) {
                    cz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i7).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i7);
                }
                TLRPC.User f10 = k10.i(i7).f();
                if (f10 != null) {
                    np.u1(i7).e4(f10, true, false);
                    ur messagesStorage = az.C(i7).getMessagesStorage();
                    messagesStorage.f27214a.c(new qq(messagesStorage, 22));
                }
            }
            ((t0) f26895b).getClass();
            g0.h3(new ai.i(29), 1000L);
            if (s2.f26694a) {
                a8.b("app initied");
            }
            MediaController.B();
            for (int i10 = 0; i10 < 4; i10++) {
                i5 r10 = i5.r(i10);
                r10.f24559a = null;
                Utilities.f22774e.c(new m4(r10, 0));
                a6.q(i10);
            }
            r1.i().q();
            g0.h3(new ai.i(25), 3000L);
        }
    }

    public static void x() {
        boolean z10;
        SharedPreferences h12 = np.h1();
        if (h12.contains("pushService")) {
            z10 = h12.getBoolean("pushService", true);
        } else {
            z10 = np.u1(k10.f24932t0).h7.getBoolean("keepAliveService", false);
        }
        if (z10) {
            try {
                f26895b.startService(new Intent(f26895b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        f26895b.stopService(new Intent(f26895b, NotificationsService.class));
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
            hd.E0().X0(configuration);
            g0.v(f26895b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.c3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        f26894a = this;
        try {
            f26895b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        if (WidgetEngineService.b()) {
            return;
        }
        Typeface typeface = g0.f23982a;
        if (s2.f26694a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f26901s = elapsedRealtime;
            i5.c.v(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = f26895b.getPackageManager().getPackageInfo(f26895b.getPackageName(), 0);
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
            p5.c.s(Build.PRODUCT, sb3);
        }
        if (f26895b == null) {
            f26895b = getApplicationContext();
        }
        wr.f(f26895b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.i(26));
            if (s2.f26694a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - f26901s));
            }
            d = new Handler(f26895b.getMainLooper());
            g0.g3(new ai.i(27));
            z80[] values = z80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (c8.za.a(values[i11])) {
                        break;
                    }
                    i11++;
                } else {
                    c8.za.b(z80.DEFAULT);
                    break;
                }
            }
            lt ltVar = lt.f25411c;
            for (int i12 = 0; i12 < 4; i12++) {
                ls.f(i12).b(ltVar, ls.T1);
            }
            ls.e().b(ltVar, ls.E4);
            ls.e().b(ltVar, ls.D4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + wr.d());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
