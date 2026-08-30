package k6;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.webkit.WebView;
public abstract class a {
    public static Context f9752a;
    public static Boolean f9753b;

    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
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
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f9752a;
            if (context2 != null && (bool = f9753b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f9753b = null;
            if (i6.b.d()) {
                f9753b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f9753b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f9753b = Boolean.FALSE;
                }
            }
            f9752a = applicationContext;
            return f9753b.booleanValue();
        }
    }

    public static void g(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void h(MenuItem menuItem, char c3, int i10) {
        menuItem.setAlphabeticShortcut(c3, i10);
    }

    public static void i(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void j(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void k(Notification.Builder builder, int i10) {
        builder.setGroupAlertBehavior(i10);
    }

    public static void l(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void m(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void n(MenuItem menuItem, char c3, int i10) {
        menuItem.setNumericShortcut(c3, i10);
    }

    public static void o(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void p(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void q(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void r(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
