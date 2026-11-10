package e0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
public final class i0 {
    public static String d;
    public static h0 f10079g;
    public final Context f10080a;
    public final NotificationManager f10081b;
    public static final Object f10076c = new Object();
    public static HashSet f10077e = new HashSet();
    public static final Object f10078f = new Object();

    public i0(Context context) {
        this.f10080a = context;
        this.f10081b = (NotificationManager) context.getSystemService("notification");
    }

    public static i0 c(Context context) {
        return new i0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.w.a(this.f10081b);
        }
        Context context = this.f10080a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i7 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i7), packageName)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final void b(int i7, String str) {
        this.f10081b.cancel(str, i7);
    }

    public final void d(int i7, Notification notification) {
        e(null, i7, notification);
    }

    public final void e(String str, int i7, Notification notification) {
        NotificationManager notificationManager = this.f10081b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            e0 e0Var = new e0(this.f10080a.getPackageName(), i7, str, notification);
            synchronized (f10078f) {
                try {
                    if (f10079g == null) {
                        f10079g = new h0(this.f10080a.getApplicationContext());
                    }
                    f10079g.f10074b.obtainMessage(0, e0Var).sendToTarget();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            notificationManager.cancel(str, i7);
            return;
        }
        notificationManager.notify(str, i7, notification);
    }
}
