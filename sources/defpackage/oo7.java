package defpackage;

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
public final class oo7 {
    public static String d;
    public static no7 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public oo7(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static oo7 c(Context context) {
        return new oo7(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return lh0.a(this.b);
        }
        Context context = this.a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final void b(int i, String str) {
        this.b.cancel(str, i);
    }

    public final void d(int i, Notification notification) {
        e(null, i, notification);
    }

    public final void e(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            ko7 ko7Var = new ko7(this.a.getPackageName(), i, str, notification);
            synchronized (f) {
                no7 no7Var = g;
                if (no7Var == null) {
                    no7Var = new no7(this.a.getApplicationContext());
                    g = no7Var;
                }
                no7Var.b.obtainMessage(0, ko7Var).sendToTarget();
            }
            this.b.cancel(str, i);
            return;
        }
        this.b.notify(str, i, notification);
    }
}
