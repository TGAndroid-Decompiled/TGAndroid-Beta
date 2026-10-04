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
public final class n0 {
    public static String d;
    public static m0 f8460g;
    public final Context f8461a;
    public final NotificationManager f8462b;
    public static final Object f8457c = new Object();
    public static HashSet f8458e = new HashSet();
    public static final Object f8459f = new Object();

    public n0(Context context) {
        this.f8461a = context;
        this.f8462b = (NotificationManager) context.getSystemService("notification");
    }

    public static n0 c(Context context) {
        return new n0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.v.a(this.f8462b);
        }
        Context context = this.f8461a;
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

    public final void b(int i10) {
        this.f8462b.cancel(null, i10);
    }

    public final void d(int i10, Notification notification) {
        NotificationManager notificationManager = this.f8462b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            j0 j0Var = new j0(this.f8461a.getPackageName(), i10, notification);
            synchronized (f8459f) {
                try {
                    if (f8460g == null) {
                        f8460g = new m0(this.f8461a.getApplicationContext());
                    }
                    f8460g.f8452b.obtainMessage(0, j0Var).sendToTarget();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            notificationManager.cancel(null, i10);
            return;
        }
        notificationManager.notify(null, i10, notification);
    }
}
