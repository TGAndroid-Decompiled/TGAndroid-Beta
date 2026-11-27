package defpackage;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.ViewConfiguration;
import android.webkit.WebView;
public abstract class qq5 {
    public static Context a;
    public static Boolean b;

    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static boolean b(Context context) {
        Display display;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static PackageInfo c() {
        return WebView.getCurrentWebViewPackage();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static synchronized boolean f(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (qq5.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool2 = b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            b = null;
            if (rve.a()) {
                bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                b = bool;
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    bool = Boolean.TRUE;
                    b = bool;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                    b = bool;
                }
            }
            a = applicationContext;
            return bool.booleanValue();
        }
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
    }

    public static void h(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void i(Notification.Builder builder, int i) {
        builder.setGroupAlertBehavior(i);
    }

    public static void j(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void k(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void l(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }
}
