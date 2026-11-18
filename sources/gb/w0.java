package gb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class w0 implements Application.ActivityLifecycleCallbacks {
    public final d1 f13433a;

    public w0(d1 sharedSessionRepository) {
        kotlin.jvm.internal.j.e(sharedSessionRepository, "sharedSessionRepository");
        this.f13433a = sharedSessionRepository;
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
        this.f13433a.b();
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.f13433a.c();
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
