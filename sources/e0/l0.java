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
public final class l0 {
    public static String d;
    public static k0 f8249g;
    public final Context f8250a;
    public final NotificationManager f8251b;
    public static final Object f8247c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f8248f = new Object();

    public l0(Context context) {
        this.f8250a = context;
        this.f8251b = (NotificationManager) context.getSystemService("notification");
    }

    public static l0 c(Context context) {
        return new l0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.w.a(this.f8251b);
        }
        Context context = this.f8250a;
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
        this.f8251b.cancel(str, i10);
    }

    public final void d(int i10, Notification notification) {
        e(null, i10, notification);
    }

    public final void e(String str, int i10, Notification notification) {
        NotificationManager notificationManager = this.f8251b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            h0 h0Var = new h0(this.f8250a.getPackageName(), i10, str, notification);
            synchronized (f8248f) {
                try {
                    if (f8249g == null) {
                        f8249g = new k0(this.f8250a.getApplicationContext());
                    }
                    f8249g.f8243b.obtainMessage(0, h0Var).sendToTarget();
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
