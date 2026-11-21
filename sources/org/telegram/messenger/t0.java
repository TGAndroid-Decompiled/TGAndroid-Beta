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
    public static nt I = null;
    public static pb.b J = null;
    public static h6.m K = null;
    public static t0 f26940a = null;
    public static volatile Context f26941b = null;
    public static volatile NetworkInfo f26942c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager f26943e = null;
    public static volatile boolean f26944f = false;
    public static volatile s0 h = null;
    public static long f26945n = 0;
    public static int f26946r = -1;
    public static long f26947s = 0;
    public static volatile boolean f26948w = false;
    public static volatile boolean f26949x = true;
    public static volatile boolean f26950y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) f26940a).getClass();
        try {
            w9.b bVar = (w9.b) o9.g.c().b(w9.b.class);
            if (bVar != null) {
                if (th2 == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                aa.t tVar = bVar.f59677a;
                Map map = Collections.EMPTY_MAP;
                tVar.f864n.f3100a.a(new a1.e(tVar, th2));
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th3) {
            a8.g(th3, false);
        }
    }

    public static void c(boolean z10) {
        if (z10 || f26942c == null) {
            try {
                if (f26943e == null) {
                    f26943e = (ConnectivityManager) f26941b.getSystemService("connectivity");
                }
                f26942c = f26943e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    f26943e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        f26940a.getClass();
    }

    public static int e() {
        int i7;
        try {
            c(false);
            if (f26942c != null) {
                if (f26942c.getType() != 1 && f26942c.getType() != 9) {
                    if (f26942c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i7 = f26946r) == 0 || i7 == 1) && System.currentTimeMillis() - f26945n < 5000)) {
                    return f26946r;
                }
                if (f26943e.isActiveNetworkMetered()) {
                    f26946r = 0;
                } else {
                    f26946r = 1;
                }
                f26945n = System.currentTimeMillis();
                return f26946r;
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
            File filesDir = f26941b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(f26941b.getApplicationInfo().dataDir, "files");
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
            f26940a.getClass();
            h6.m mVar = new h6.m(20);
            K = mVar;
            mVar.init(f26941b);
        }
        return K;
    }

    public static IMapsProvider k() {
        if (J == null) {
            f26940a.getClass();
            J = new pb.b(17);
        }
        return J;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (I == null) {
            f26940a.getClass();
            I = nt.f25994b;
        }
        return I;
    }

    public static void m() {
        f26940a.getClass();
    }

    public static void n() {
        f26940a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (f26942c != null) {
                if (f26942c.getType() != 1) {
                    if (f26942c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = f26942c.getState();
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
            if (f26942c != null && f26942c.getType() == 0) {
                int subtype = f26942c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        f26940a.getClass();
    }

    public static boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t0.s():boolean");
    }

    public static boolean t() {
        try {
            c(false);
            if (f26942c != null) {
                if (f26942c.isRoaming()) {
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
        f26940a.getClass();
    }

    public static void w() {
        if (!f26944f && f26941b != null) {
            f26944f = true;
            vr.f(f26941b);
            try {
                gd.E0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                f26943e = (ConnectivityManager) f26941b.getSystemService("connectivity");
                f26941b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f26941b.registerReceiver(new q0(3), intentFilter);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                pc.h(f26941b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
            try {
                f26948w = ((PowerManager) f26941b.getSystemService("power")).isScreenOn();
                if (s2.f26749a) {
                    a8.b("screen state = " + f26948w);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            bz.t();
            c6.f23296g = f26941b.getSharedPreferences("webview_bots", 0);
            for (int i7 = 0; i7 < 4; i7++) {
                j10.i(i7).s();
                mp.u1(i7);
                if (i7 == 0) {
                    bz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i7).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i7);
                }
                TLRPC.User f10 = j10.i(i7).f();
                if (f10 != null) {
                    mp.u1(i7).e4(f10, true, false);
                    tr messagesStorage = zy.C(i7).getMessagesStorage();
                    messagesStorage.f27080a.c(new pq(messagesStorage, 22));
                }
            }
            ((t0) f26941b).getClass();
            g0.h3(new ai.n(29), 1000L);
            if (s2.f26749a) {
                a8.b("app initied");
            }
            MediaController.B();
            for (int i10 = 0; i10 < 4; i10++) {
                i5 r10 = i5.r(i10);
                r10.f24585a = null;
                Utilities.f22807e.c(new m4(r10, 0));
                a6.q(i10);
            }
            r1.i().q();
            g0.h3(new ai.n(25), 3000L);
        }
    }

    public static void x() {
        boolean z10;
        SharedPreferences h12 = mp.h1();
        if (h12.contains("pushService")) {
            z10 = h12.getBoolean("pushService", true);
        } else {
            z10 = mp.u1(j10.f24798t0).h7.getBoolean("keepAliveService", false);
        }
        if (z10) {
            try {
                f26941b.startService(new Intent(f26941b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        f26941b.stopService(new Intent(f26941b, NotificationsService.class));
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
            g0.v(f26941b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.c3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        f26940a = this;
        try {
            f26941b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        if (WidgetEngineService.b()) {
            return;
        }
        Typeface typeface = g0.f24118a;
        if (s2.f26749a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f26947s = elapsedRealtime;
            i5.c.v(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = f26941b.getPackageManager().getPackageInfo(f26941b.getPackageName(), 0);
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
        if (f26941b == null) {
            f26941b = getApplicationContext();
        }
        vr.f(f26941b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.n(26));
            if (s2.f26749a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - f26947s));
            }
            d = new Handler(f26941b.getMainLooper());
            g0.g3(new ai.n(27));
            z80[] values = z80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (c8.ya.a(values[i11])) {
                        break;
                    }
                    i11++;
                } else {
                    c8.ya.b(z80.DEFAULT);
                    break;
                }
            }
            kt ktVar = kt.f25281c;
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
