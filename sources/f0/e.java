package f0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.biometric.n;
import e0.n0;
import java.util.concurrent.Executor;
public abstract class e {
    public static final Object f9161a = null;

    public static int a(android.content.Context r5, java.lang.String r6, int r7, int r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: f0.e.a(android.content.Context, java.lang.String, int, int, java.lang.String):int");
    }

    public static int b(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new n0(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    public static Drawable d(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static Executor e(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(context);
        }
        return new n(new Handler(context.getMainLooper()), 3);
    }

    public static Object f(Context context, Class cls) {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return a.b(context, cls);
        }
        if (i10 >= 23) {
            str = a.c(context, cls);
        } else {
            str = (String) d.f9160a.get(cls);
        }
        if (str != null) {
            return context.getSystemService(str);
        }
        return null;
    }
}
