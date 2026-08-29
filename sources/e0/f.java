package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f5658a;
    public Activity f5659b;
    public final int f5660c;
    public boolean d = false;
    public boolean f5661e = false;
    public boolean f5662f = false;

    public f(Activity activity) {
        this.f5659b = activity;
        this.f5660c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5659b == activity) {
            this.f5659b = null;
            this.f5661e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f5661e && !this.f5662f && !this.d) {
            Object obj = this.f5658a;
            try {
                Object obj2 = g.f5665c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f5660c) {
                    g.f5668g.postAtFrontOfQueue(new ab.o(9, g.f5664b.get(activity), obj2));
                    this.f5662f = true;
                    this.f5658a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f5659b == activity) {
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
