package la;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class p0 implements Application.ActivityLifecycleCallbacks {
    public static final p0 f11814a = new Object();
    public static boolean f11815b;
    public static com.google.firebase.messaging.r f11816c;

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        com.google.firebase.messaging.r rVar = f11816c;
        if (rVar != null) {
            rVar.R(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        sc.i iVar;
        kotlin.jvm.internal.j.e(activity, "activity");
        com.google.firebase.messaging.r rVar = f11816c;
        if (rVar != null) {
            rVar.R(1);
            iVar = sc.i.f44253a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f11815b = true;
        }
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(outState, "outState");
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }
}
