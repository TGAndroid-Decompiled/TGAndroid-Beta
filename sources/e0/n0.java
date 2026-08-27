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

    public static m0 f5099g;

    public final Context f5100a;

    public final NotificationManager f5101b;

    public static final Object f5096c = new Object();

    public static HashSet f5097e = new HashSet();

    public static final Object f5098f = new Object();

    public n0(Context context) {
        this.f5100a = context;
        this.f5101b = (NotificationManager) context.getSystemService("notification");
    }

    public static n0 c(Context context) {
        return new n0(context);
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.v.a(this.f5101b);
        }
        Context context = this.f5100a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
    }

    public final void b(int i10) {
        this.f5101b.cancel(null, i10);
    }

    public final void d(int i10, Notification notification) {
        NotificationManager notificationManager = this.f5101b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i10, notification);
            return;
        }
        j0 j0Var = new j0(this.f5100a.getPackageName(), i10, notification);
        synchronized (f5098f) {
            try {
                if (f5099g == null) {
                    f5099g = new m0(this.f5100a.getApplicationContext());
                }
                f5099g.f5091b.obtainMessage(0, j0Var).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i10);
    }
}
