package ia;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class t0 implements Application.ActivityLifecycleCallbacks {

    public static final t0 f11079a = new t0();

    public static boolean f11080b;

    public static com.google.firebase.messaging.t f11081c;

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
        com.google.firebase.messaging.t tVar = f11081c;
        if (tVar != null) {
            tVar.M(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        pc.i iVar;
        kotlin.jvm.internal.j.e(activity, "activity");
        com.google.firebase.messaging.t tVar = f11081c;
        if (tVar != null) {
            tVar.M(1);
            iVar = pc.i.f45696a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f11080b = true;
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
