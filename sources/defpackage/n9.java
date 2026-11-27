package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Method;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class n9 implements Runnable {
    public final byte a;
    public final Activity b;

    public n9(Activity activity, byte b) {
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
                    Handler handler = q9.g;
                    Method method = q9.f;
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28) {
                        activity.recreate();
                        return;
                    }
                    if (((i != 26 && i != 27) || method != null) && (q9.e != null || q9.d != null)) {
                        try {
                            Object obj2 = q9.c.get(activity);
                            if (obj2 != null && (obj = q9.b.get(activity)) != null) {
                                Application application = activity.getApplication();
                                p9 p9Var = new p9(activity);
                                application.registerActivityLifecycleCallbacks(p9Var);
                                handler.post(new iqd(p9Var, obj2, (byte) 1));
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
                                handler.post(new xs4(application, p9Var, (byte) 2));
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
                int i2 = ChatActivityEnterView.X7;
                hl.K3(activity);
                return;
            case 2:
                m01.u(activity, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                m01.u(activity, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                m01.u(activity, "https://promote.telegram.org/guidelines");
                return;
            default:
                m01.u(activity, ob6.M0(2131744623, null));
                return;
        }
    }
}
