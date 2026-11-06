package gb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class y0 implements Application.ActivityLifecycleCallbacks {
    public final f1 f13785a;

    public y0(f1 sharedSessionRepository) {
        kotlin.jvm.internal.j.e(sharedSessionRepository, "sharedSessionRepository");
        this.f13785a = sharedSessionRepository;
    }

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
        this.f13785a.b();
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.f13785a.c();
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
