package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f8405a;
    public Activity f8406b;
    public final int f8407c;
    public boolean d = false;
    public boolean f8408e = false;
    public boolean f8409f = false;

    public f(Activity activity) {
        this.f8406b = activity;
        this.f8407c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8406b == activity) {
            this.f8406b = null;
            this.f8408e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f8408e && !this.f8409f && !this.d) {
            Object obj = this.f8405a;
            try {
                Object obj2 = g.f8412c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8407c) {
                    g.f8415g.postAtFrontOfQueue(new i9.s(12, g.f8411b.get(activity), obj2));
                    this.f8409f = true;
                    this.f8405a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8406b == activity) {
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
