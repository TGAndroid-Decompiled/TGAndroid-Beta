package bb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class s0 implements Application.ActivityLifecycleCallbacks {
    public static final s0 f3818a = new Object();
    public static boolean f3819b;
    public static com.google.firebase.messaging.q f3820c;

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.google.firebase.messaging.q qVar = f3820c;
        if (qVar != null) {
            qVar.C(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        jd.i iVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        com.google.firebase.messaging.q qVar = f3820c;
        if (qVar != null) {
            qVar.C(1);
            iVar = jd.i.f15580a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f3819b = true;
        }
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(outState, "outState");
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }
}
