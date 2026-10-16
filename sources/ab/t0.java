package ab;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class t0 implements Application.ActivityLifecycleCallbacks {
    public static final t0 f464a = new Object();
    public static boolean f465b;
    public static com.google.firebase.messaging.s f466c;

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
        com.google.firebase.messaging.s sVar = f466c;
        if (sVar != null) {
            sVar.r(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        id.i iVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        com.google.firebase.messaging.s sVar = f466c;
        if (sVar != null) {
            sVar.r(1);
            iVar = id.i.f11390a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f465b = true;
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
