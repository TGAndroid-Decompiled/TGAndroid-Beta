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
public final class j0 {
    public static String d;
    public static i0 f9556g;
    public final Context f9557a;
    public final NotificationManager f9558b;
    public static final Object f9554c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f9555f = new Object();

    public j0(Context context) {
        this.f9557a = context;
        this.f9558b = (NotificationManager) context.getSystemService("notification");
    }

    public static j0 c(Context context) {
        return new j0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.w.a(this.f9558b);
        }
        Context context = this.f9557a;
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
        this.f9558b.cancel(str, i10);
    }

    public final void d(int i10, Notification notification) {
        e(null, i10, notification);
    }

    public final void e(String str, int i10, Notification notification) {
        NotificationManager notificationManager = this.f9558b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            f0 f0Var = new f0(this.f9557a.getPackageName(), i10, str, notification);
            synchronized (f9555f) {
                try {
                    if (f9556g == null) {
                        f9556g = new i0(this.f9557a.getApplicationContext());
                    }
                    f9556g.f9552b.obtainMessage(0, f0Var).sendToTarget();
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
