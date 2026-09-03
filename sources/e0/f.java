package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f4964a;
    public Activity f4965b;
    public final int f4966c;
    public boolean d = false;
    public boolean e = false;
    public boolean f4967f = false;

    public f(Activity activity) {
        this.f4965b = activity;
        this.f4966c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4965b == activity) {
            this.f4965b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f4967f && !this.d) {
            Object obj = this.f4964a;
            try {
                Object obj2 = g.f4970c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f4966c) {
                    g.f4972g.postAtFrontOfQueue(new androidx.biometric.j(g.f4969b.get(activity), obj2, false, 9));
                    this.f4967f = true;
                    this.f4964a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f4965b == activity) {
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
