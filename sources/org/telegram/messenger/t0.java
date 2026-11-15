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
import org.telegram.utils.twidget.WidgetEngineService;
public abstract class t0 extends Application {
    public static volatile boolean E = true;
    public static volatile boolean F = true;
    public static boolean G = false;
    public static volatile long H = 0;
    public static qt I = null;
    public static pb.b J = null;
    public static h6.m K = null;
    public static t0 f26608a = null;
    public static volatile Context f26609b = null;
    public static volatile NetworkInfo f26610c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager f26611e = null;
    public static volatile boolean f26612f = false;
    public static volatile s0 h = null;
    public static long f26613n = 0;
    public static int f26614r = -1;
    public static long f26615s = 0;
    public static volatile boolean f26616w = false;
    public static volatile boolean f26617x = true;
    public static volatile boolean f26618y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) f26608a).getClass();
        try {
            w9.b bVar = (w9.b) o9.g.c().b(w9.b.class);
            if (bVar != null) {
                if (th2 == null) {
                    Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                    return;
                }
                aa.t tVar = bVar.f59073a;
                Map map = Collections.EMPTY_MAP;
                tVar.f865n.f3093a.a(new a1.e(tVar, th2));
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th3) {
            a8.g(th3, false);
        }
    }

    public static void c(boolean z10) {
        if (z10 || f26610c == null) {
            try {
                if (f26611e == null) {
                    f26611e = (ConnectivityManager) f26609b.getSystemService("connectivity");
                }
                f26610c = f26611e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT >= 24 && h == null) {
                    h = new ConnectivityManager.NetworkCallback();
                    f26611e.registerDefaultNetworkCallback(h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        f26608a.getClass();
    }

    public static int e() {
        int i7;
        try {
            c(false);
            if (f26610c != null) {
                if (f26610c.getType() != 1 && f26610c.getType() != 9) {
                    if (f26610c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i7 = f26614r) == 0 || i7 == 1) && System.currentTimeMillis() - f26613n < 5000)) {
                    return f26614r;
                }
                if (f26611e.isActiveNetworkMetered()) {
                    f26614r = 0;
                } else {
                    f26614r = 1;
                }
                f26613n = System.currentTimeMillis();
                return f26614r;
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
            File filesDir = f26609b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(f26609b.getApplicationInfo().dataDir, "files");
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
            f26608a.getClass();
            h6.m mVar = new h6.m(20);
            K = mVar;
            mVar.init(f26609b);
        }
        return K;
    }

    public static IMapsProvider k() {
        if (J == null) {
            f26608a.getClass();
            J = new pb.b(17);
        }
        return J;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (I == null) {
            f26608a.getClass();
            I = qt.f26137b;
        }
        return I;
    }

    public static void m() {
        f26608a.getClass();
    }

    public static void n() {
        f26608a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (f26610c != null) {
                if (f26610c.getType() != 1) {
                    if (f26610c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = f26610c.getState();
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
            if (f26610c != null && f26610c.getType() == 0) {
                int subtype = f26610c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        f26608a.getClass();
    }

    public static boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t0.s():boolean");
    }

    public static boolean t() {
        try {
            c(false);
            if (f26610c != null) {
                if (f26610c.isRoaming()) {
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
        f26608a.getClass();
    }

    public static void w() {
        if (!f26612f && f26609b != null) {
            f26612f = true;
            xr.f(f26609b);
            try {
                hd.E0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                f26611e = (ConnectivityManager) f26609b.getSystemService("connectivity");
                f26609b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f26609b.registerReceiver(new q0(3), intentFilter);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                qc.h(f26609b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
            try {
                f26616w = ((PowerManager) f26609b.getSystemService("power")).isScreenOn();
                if (r2.f26206a) {
                    a8.b("screen state = " + f26616w);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            gz.t();
            b6.f22667g = f26609b.getSharedPreferences("webview_bots", 0);
            for (int i7 = 0; i7 < 4; i7++) {
                m10.i(i7).s();
                np.s1(i7);
                if (i7 == 0) {
                    gz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i7).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i7);
                }
                TLRPC.User f10 = m10.i(i7).f();
                if (f10 != null) {
                    np.s1(i7).X3(f10, true, false);
                    vr messagesStorage = ez.C(i7).getMessagesStorage();
                    messagesStorage.f27219a.c(new nq(messagesStorage, 23));
                }
            }
            ((t0) f26609b).getClass();
            g0.i3(new ai.o(27), 1000L);
            if (r2.f26206a) {
                a8.b("app initied");
            }
            MediaController.B();
            for (int i10 = 0; i10 < 4; i10++) {
                g5 r10 = g5.r(i10);
                r10.f23671a = null;
                Utilities.f22416e.c(new k4(r10, 0));
                z5.q(i10);
            }
            r1.i().q();
            g0.i3(new ai.o(23), 3000L);
        }
    }

    public static void x() {
        boolean z10;
        SharedPreferences f12 = np.f1();
        if (f12.contains("pushService")) {
            z10 = f12.getBoolean("pushService", true);
        } else {
            z10 = np.s1(m10.f24940t0).f25283f7.getBoolean("keepAliveService", false);
        }
        if (z10) {
            try {
                f26609b.startService(new Intent(f26609b, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        f26609b.stopService(new Intent(f26609b, NotificationsService.class));
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
            g0.v(f26609b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.d3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override
    public final void onCreate() {
        String str;
        f26608a = this;
        try {
            f26609b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        if (WidgetEngineService.c()) {
            return;
        }
        Typeface typeface = g0.f23583a;
        if (r2.f26206a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f26615s = elapsedRealtime;
            i5.c.t(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = f26609b.getPackageManager().getPackageInfo(f26609b.getPackageName(), 0);
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
            org.telegram.ui.Cells.y0.t(Build.PRODUCT, sb3);
        }
        if (f26609b == null) {
            f26609b = getApplicationContext();
        }
        xr.f(f26609b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.o(24));
            if (r2.f26206a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - f26615s));
            }
            d = new Handler(f26609b.getMainLooper());
            g0.h3(new ai.o(25));
            w80[] values = w80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (c8.wa.a(values[i11])) {
                        break;
                    }
                    i11++;
                } else {
                    c8.wa.b(w80.DEFAULT);
                    break;
                }
            }
            nt ntVar = nt.f25636c;
            for (int i12 = 0; i12 < 4; i12++) {
                ns.f(i12).b(ntVar, ns.T1);
            }
            ns.e().b(ntVar, ns.B4);
            ns.e().b(ntVar, ns.A4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + xr.d());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
