package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f7755a;
    public Activity f7756b;
    public final int f7757c;
    public boolean d = false;
    public boolean e = false;
    public boolean f7758f = false;

    public f(Activity activity) {
        this.f7756b = activity;
        this.f7757c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7756b == activity) {
            this.f7756b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f7758f && !this.d) {
            Object obj = this.f7755a;
            try {
                Object obj2 = g.f7761c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f7757c) {
                    g.f7763g.postAtFrontOfQueue(new i9.s(12, g.f7760b.get(activity), obj2));
                    this.f7758f = true;
                    this.f7755a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f7756b == activity) {
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
