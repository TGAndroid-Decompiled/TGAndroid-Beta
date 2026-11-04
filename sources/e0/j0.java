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
    public static i0 f9258g;
    public final Context f9259a;
    public final NotificationManager f9260b;
    public static final Object f9255c = new Object();
    public static HashSet f9256e = new HashSet();
    public static final Object f9257f = new Object();

    public j0(Context context) {
        this.f9259a = context;
        this.f9260b = (NotificationManager) context.getSystemService("notification");
    }

    public static j0 c(Context context) {
        return new j0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.x.a(this.f9260b);
        }
        Context context = this.f9259a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i3), packageName)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final void b(int i3, String str) {
        this.f9260b.cancel(str, i3);
    }

    public final void d(int i3, Notification notification) {
        e(null, i3, notification);
    }

    public final void e(String str, int i3, Notification notification) {
        NotificationManager notificationManager = this.f9260b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            f0 f0Var = new f0(this.f9259a.getPackageName(), i3, str, notification);
            synchronized (f9257f) {
                try {
                    if (f9258g == null) {
                        f9258g = new i0(this.f9259a.getApplicationContext());
                    }
                    f9258g.f9253b.obtainMessage(0, f0Var).sendToTarget();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            notificationManager.cancel(str, i3);
            return;
        }
        notificationManager.notify(str, i3, notification);
    }
}
