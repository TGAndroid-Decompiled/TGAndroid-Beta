package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Method;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class m9 implements Runnable {
    public final byte a;
    public final Activity b;

    public m9(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override
    public final void run() {
        Object obj;
        boolean z;
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    Handler handler = p9.g;
                    Method method = p9.f;
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28) {
                        activity.recreate();
                        return;
                    }
                    if (((i != 26 && i != 27) || method != null) && (p9.e != null || p9.d != null)) {
                        try {
                            Object obj2 = p9.c.get(activity);
                            if (obj2 != null && (obj = p9.b.get(activity)) != null) {
                                Application application = activity.getApplication();
                                o9 o9Var = new o9(activity);
                                application.registerActivityLifecycleCallbacks(o9Var);
                                handler.post(new rld(o9Var, obj2, (byte) 1));
                                if (i != 26 && i != 27) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new tq4(application, o9Var, (byte) 2));
                                return;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 1:
                int i2 = ChatActivityEnterView.r7;
                gl.L3(activity);
                return;
            case 2:
                d01.t(activity, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                d01.t(activity, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                d01.t(activity, "https://promote.telegram.org/guidelines");
                return;
            default:
                d01.t(activity, k96.M0(2131744729, null));
                return;
        }
    }
}
