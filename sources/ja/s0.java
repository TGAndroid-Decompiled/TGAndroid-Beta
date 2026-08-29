package ja;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class s0 implements Application.ActivityLifecycleCallbacks {
    public static final s0 f11402a = new Object();
    public static boolean f11403b;
    public static com.google.firebase.messaging.s f11404c;

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
        com.google.firebase.messaging.s sVar = f11404c;
        if (sVar != null) {
            sVar.M(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        qc.i iVar;
        kotlin.jvm.internal.j.e(activity, "activity");
        com.google.firebase.messaging.s sVar = f11404c;
        if (sVar != null) {
            sVar.M(1);
            iVar = qc.i.f46603a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f11403b = true;
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
