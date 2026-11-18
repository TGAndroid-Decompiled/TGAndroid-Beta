package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10178a;
    public Activity f10179b;
    public final int f10180c;
    public boolean d = false;
    public boolean f10181e = false;
    public boolean f10182f = false;

    public c(Activity activity) {
        this.f10179b = activity;
        this.f10180c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10179b == activity) {
            this.f10179b = null;
            this.f10181e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10181e && !this.f10182f && !this.d) {
            Object obj = this.f10178a;
            try {
                Object obj2 = d.f10185c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10180c) {
                    d.f10188g.postAtFrontOfQueue(new m9.u(11, d.f10184b.get(activity), obj2));
                    this.f10182f = true;
                    this.f10178a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10179b == activity) {
            this.d = true;
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
    }

    @Override
    public final void onActivityStopped(Activity activity) {
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
