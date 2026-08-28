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
    public static m0 f4742g;
    public final Context f4743a;
    public final NotificationManager f4744b;
    public static final Object f4739c = new Object();
    public static HashSet f4740e = new HashSet();
    public static final Object f4741f = new Object();

    public n0(Context context) {
        this.f4743a = context;
        this.f4744b = (NotificationManager) context.getSystemService("notification");
    }

    public static n0 c(Context context) {
        return new n0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.v.a(this.f4744b);
        }
        Context context = this.f4743a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i9 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i9), packageName)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final void b(int i9) {
        this.f4744b.cancel(null, i9);
    }

    public final void d(int i9, Notification notification) {
        NotificationManager notificationManager = this.f4744b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            j0 j0Var = new j0(this.f4743a.getPackageName(), i9, notification);
            synchronized (f4741f) {
                try {
                    if (f4742g == null) {
                        f4742g = new m0(this.f4743a.getApplicationContext());
                    }
                    f4742g.f4734b.obtainMessage(0, j0Var).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            notificationManager.cancel(null, i9);
            return;
        }
        notificationManager.notify(null, i9, notification);
    }
}
