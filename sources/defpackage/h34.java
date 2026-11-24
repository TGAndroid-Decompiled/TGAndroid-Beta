package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public abstract class h34 implements Application.ActivityLifecycleCallbacks {
    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override
    public void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override
    public void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override
    public void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
