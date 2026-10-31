package bb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class s0 implements Application.ActivityLifecycleCallbacks {
    public static final s0 f2619a = new Object();
    public static boolean f2620b;
    public static ji.f f2621c;

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
        ji.f fVar = f2621c;
        if (fVar != null) {
            fVar.u(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        ad.j jVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        ji.f fVar = f2621c;
        if (fVar != null) {
            fVar.u(1);
            jVar = ad.j.f401a;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            f2620b = true;
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
