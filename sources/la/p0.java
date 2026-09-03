package la;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class p0 implements Application.ActivityLifecycleCallbacks {
    public static final p0 f11924a = new Object();
    public static boolean f11925b;
    public static rf.f f11926c;

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
        rf.f fVar = f11926c;
        if (fVar != null) {
            fVar.F(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        sc.i iVar;
        kotlin.jvm.internal.j.e(activity, "activity");
        rf.f fVar = f11926c;
        if (fVar != null) {
            fVar.F(1);
            iVar = sc.i.f44318a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f11925b = true;
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
