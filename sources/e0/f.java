package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f8406a;
    public Activity f8407b;
    public final int f8408c;
    public boolean d = false;
    public boolean f8409e = false;
    public boolean f8410f = false;

    public f(Activity activity) {
        this.f8407b = activity;
        this.f8408c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8407b == activity) {
            this.f8407b = null;
            this.f8409e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f8409e && !this.f8410f && !this.d) {
            Object obj = this.f8406a;
            try {
                Object obj2 = g.f8413c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8408c) {
                    g.f8416g.postAtFrontOfQueue(new i9.s(12, g.f8412b.get(activity), obj2));
                    this.f8410f = true;
                    this.f8406a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8407b == activity) {
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
