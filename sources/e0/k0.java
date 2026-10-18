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
public final class k0 {
    public static String d;
    public static j0 f8125g;
    public final Context f8126a;
    public final NotificationManager f8127b;
    public static final Object f8123c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f8124f = new Object();

    public k0(Context context) {
        this.f8126a = context;
        this.f8127b = (NotificationManager) context.getSystemService("notification");
    }

    public static k0 c(Context context) {
        return new k0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.w.a(this.f8127b);
        }
        Context context = this.f8126a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final void b(int i10, String str) {
        this.f8127b.cancel(str, i10);
    }

    public final void d(int i10, Notification notification) {
        e(null, i10, notification);
    }

    public final void e(String str, int i10, Notification notification) {
        NotificationManager notificationManager = this.f8127b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            g0 g0Var = new g0(this.f8126a.getPackageName(), i10, str, notification);
            synchronized (f8124f) {
                try {
                    if (f8125g == null) {
                        f8125g = new j0(this.f8126a.getApplicationContext());
                    }
                    f8125g.f8119b.obtainMessage(0, g0Var).sendToTarget();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            notificationManager.cancel(str, i10);
            return;
        }
        notificationManager.notify(str, i10, notification);
    }
}
