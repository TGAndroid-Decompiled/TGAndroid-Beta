package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f9513a;
    public Activity f9514b;
    public final int f9515c;
    public boolean d = false;
    public boolean e = false;
    public boolean f9516f = false;

    public c(Activity activity) {
        this.f9514b = activity;
        this.f9515c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f9514b == activity) {
            this.f9514b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f9516f && !this.d) {
            Object obj = this.f9513a;
            try {
                Object obj2 = d.f9519c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f9515c) {
                    d.f9521g.postAtFrontOfQueue(new k9.u(13, d.f9518b.get(activity), obj2));
                    this.f9516f = true;
                    this.f9513a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f9514b == activity) {
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
