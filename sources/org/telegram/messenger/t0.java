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
import org.telegram.ui.y80;
import org.telegram.utils.twidget.WidgetEngineService;
public abstract class t0 extends Application {
    public static volatile boolean E = true;
    public static volatile boolean F = true;
    public static boolean G = false;
    public static volatile long H = 0;
    public static nt I = null;
    public static pb.b J = null;
    public static h6.m K = null;
    public static t0 f27012a = null;
    public static volatile Context f27013b = null;
    public static volatile NetworkInfo f27014c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager f27015e = null;
    public static volatile boolean f27016f = false;
    public static volatile s0 h = null;
    public static long f27017n = 0;
    public static int f27018r = -1;
    public static long f27019s = 0;
    public static volatile boolean f27020w = false;
    public static volatile boolean f27021x = true;
    public static volatile boolean f27022y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) f27012a).getClass();
        try {
            w9.b bVar = (w9.b) o9.g.c().b(w9.b.class);
            if (bVar != null) {
                if (th2 == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                aa.t tVar = bVar.f59766a;
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
        if (z10 || f27014c == null) {
            try {
                if (f27015e == null) {
                    f27015e = (ConnectivityManager) f27013b.getSystemService("connectivity");
                }
                f27014c = f27015e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    f27015e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        f27012a.getClass();
    }

    public static int e() {
        int i7;
        try {
            c(false);
            if (f27014c != null) {
                if (f27014c.getType() != 1 && f27014c.getType() != 9) {
                    if (f27014c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i7 = f27018r) == 0 || i7 == 1) && System.currentTimeMillis() - f27017n < 5000)) {
                    return f27018r;
                }
                if (f27015e.isActiveNetworkMetered()) {
                    f27018r = 0;
                } else {
                    f27018r = 1;
                }
                f27017n = System.currentTimeMillis();
                return f27018r;
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
            File filesDir = f27013b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(f27013b.getApplicationInfo().dataDir, "files");
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
            f27012a.getClass();
            h6.m mVar = new h6.m();
            K = mVar;
            mVar.init(f27013b);
        }
        return K;
    }

    public static IMapsProvider k() {
        if (J == null) {
            f27012a.getClass();
            J = new pb.b(17);
        }
        return J;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (I == null) {
            f27012a.getClass();
            I = nt.f26062b;
        }
        return I;
    }

    public static void m() {
        f27012a.getClass();
    }

    public static void n() {
        f27012a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (f27014c != null) {
                if (f27014c.getType() != 1) {
                    if (f27014c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = f27014c.getState();
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
            if (f27014c != null && f27014c.getType() == 0) {
                int subtype = f27014c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        f27012a.getClass();
    }

    public static boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t0.s():boolean");
    }

    public static boolean t() {
        try {
            c(false);
            if (f27014c != null) {
                if (f27014c.isRoaming()) {
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
        f27012a.getClass();
    }

    public static void w() {
        if (!f27016f && f27013b != null) {
            f27016f = true;
            vr.f(f27013b);
            try {
                gd.E0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                f27015e = (ConnectivityManager) f27013b.getSystemService("connectivity");
                f27013b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f27013b.registerReceiver(new q0(3), intentFilter);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                pc.h(f27013b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
            try {
                f27020w = ((PowerManager) f27013b.getSystemService("power")).isScreenOn();
                if (s2.f26829a) {
                    a8.b("screen state = " + f27020w);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            bz.t();
            c6.f23386g = f27013b.getSharedPreferences("webview_bots", 0);
            for (int i7 = 0; i7 < 4; i7++) {
                i10.i(i7).s();
                mp.u1(i7);
                if (i7 == 0) {
                    bz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i7).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i7);
                }
                TLRPC.User f10 = i10.i(i7).f();
                if (f10 != null) {
                    mp.u1(i7).e4(f10, true, false);
                    tr messagesStorage = zy.C(i7).getMessagesStorage();
                    messagesStorage.f27149a.c(new pq(messagesStorage, 22));
                }
            }
            ((t0) f27013b).getClass();
            g0.h3(new ai.k(29), 1000L);
            if (s2.f26829a) {
                a8.b("app initied");
            }
            MediaController.B();
            for (int i10 = 0; i10 < 4; i10++) {
                i5 r10 = i5.r(i10);
                r10.f24683a = null;
                Utilities.f22877e.c(new m4(r10, 0));
                a6.q(i10);
            }
            r1.i().q();
            g0.h3(new ai.k(25), 3000L);
        }
    }

    public static void x() {
        boolean z10;
        SharedPreferences h12 = mp.h1();
        if (h12.contains("pushService")) {
            z10 = h12.getBoolean("pushService", true);
        } else {
            z10 = mp.u1(i10.f24637t0).h7.getBoolean("keepAliveService", false);
        }
        if (z10) {
            try {
                f27013b.startService(new Intent(f27013b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        f27013b.stopService(new Intent(f27013b, NotificationsService.class));
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
            gd.E0().X0(configuration);
            g0.v(f27013b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.c3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        f27012a = this;
        try {
            f27013b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        if (WidgetEngineService.b()) {
            return;
        }
        Typeface typeface = g0.f24198a;
        if (s2.f26829a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f27019s = elapsedRealtime;
            i5.c.v(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = f27013b.getPackageManager().getPackageInfo(f27013b.getPackageName(), 0);
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
        if (f27013b == null) {
            f27013b = getApplicationContext();
        }
        vr.f(f27013b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.k(26));
            if (s2.f26829a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - f27019s));
            }
            d = new Handler(f27013b.getMainLooper());
            g0.g3(new ai.k(27));
            y80[] values = y80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (c8.za.a(values[i11])) {
                        break;
                    }
                    i11++;
                } else {
                    c8.za.b(y80.DEFAULT);
                    break;
                }
            }
            kt ktVar = kt.f25352c;
            for (int i12 = 0; i12 < 4; i12++) {
                ks.f(i12).b(ktVar, ks.T1);
            }
            ks.e().b(ktVar, ks.E4);
            ks.e().b(ktVar, ks.D4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + vr.d());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
