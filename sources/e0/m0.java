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
public final class m0 {
    public static String d;
    public static l0 f5004g;
    public final Context f5005a;
    public final NotificationManager f5006b;
    public static final Object f5002c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f5003f = new Object();

    public m0(Context context) {
        this.f5005a = context;
        this.f5006b = (NotificationManager) context.getSystemService("notification");
    }

    public static m0 c(Context context) {
        return new m0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.w.a(this.f5006b);
        }
        Context context = this.f5005a;
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
        this.f5006b.cancel(null, i10);
    }

    public final void d(int i10, Notification notification) {
        NotificationManager notificationManager = this.f5006b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            i0 i0Var = new i0(this.f5005a.getPackageName(), i10, notification);
            synchronized (f5003f) {
                try {
                    if (f5004g == null) {
                        f5004g = new l0(this.f5005a.getApplicationContext());
                    }
                    f5004g.f5000b.obtainMessage(0, i0Var).sendToTarget();
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
