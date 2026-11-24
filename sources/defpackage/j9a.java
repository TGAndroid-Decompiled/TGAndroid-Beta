package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class j9a implements Application.ActivityLifecycleCallbacks {
    public final hia a;

    public j9a(hia hiaVar) {
        hiaVar.getClass();
        this.a = hiaVar;
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        this.a.a();
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        this.a.b();
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
