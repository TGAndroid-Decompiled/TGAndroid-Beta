package db;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class x0 implements Application.ActivityLifecycleCallbacks {
    public final e1 f8755a;

    public x0(e1 sharedSessionRepository) {
        kotlin.jvm.internal.j.e(sharedSessionRepository, "sharedSessionRepository");
        this.f8755a = sharedSessionRepository;
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
        this.f8755a.b();
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.f8755a.c();
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
