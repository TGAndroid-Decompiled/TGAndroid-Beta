package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f9206a;
    public Activity f9207b;
    public final int f9208c;
    public boolean d = false;
    public boolean f9209e = false;
    public boolean f9210f = false;

    public c(Activity activity) {
        this.f9207b = activity;
        this.f9208c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f9207b == activity) {
            this.f9207b = null;
            this.f9209e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f9209e && !this.f9210f && !this.d) {
            Object obj = this.f9206a;
            try {
                Object obj2 = d.f9213c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f9208c) {
                    d.f9216g.postAtFrontOfQueue(new l9.u(6, d.f9212b.get(activity), obj2));
                    this.f9210f = true;
                    this.f9206a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f9207b == activity) {
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
