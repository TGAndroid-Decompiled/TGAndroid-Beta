package ha;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class s0 implements Application.ActivityLifecycleCallbacks {
    public static final s0 f10367a = new Object();
    public static boolean f10368b;
    public static com.google.firebase.messaging.t f10369c;

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
        com.google.firebase.messaging.t tVar = f10369c;
        if (tVar != null) {
            tVar.M(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        oc.i iVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        com.google.firebase.messaging.t tVar = f10369c;
        if (tVar != null) {
            tVar.M(1);
            iVar = oc.i.f19197a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f10368b = true;
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
