package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f4688a;
    public Activity f4689b;
    public final int f4690c;
    public boolean d = false;
    public boolean f4691e = false;
    public boolean f4692f = false;

    public f(Activity activity) {
        this.f4689b = activity;
        this.f4690c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4689b == activity) {
            this.f4689b = null;
            this.f4691e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f4691e && !this.f4692f && !this.d) {
            Object obj = this.f4688a;
            try {
                Object obj2 = g.f4695c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f4690c) {
                    g.f4698g.postAtFrontOfQueue(new androidx.biometric.j(g.f4694b.get(activity), obj2, false, 4));
                    this.f4692f = true;
                    this.f4688a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f4689b == activity) {
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
