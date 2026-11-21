package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10207a;
    public Activity f10208b;
    public final int f10209c;
    public boolean d = false;
    public boolean f10210e = false;
    public boolean f10211f = false;

    public c(Activity activity) {
        this.f10208b = activity;
        this.f10209c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10208b == activity) {
            this.f10208b = null;
            this.f10210e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10210e && !this.f10211f && !this.d) {
            Object obj = this.f10207a;
            try {
                Object obj2 = d.f10214c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10209c) {
                    d.f10217g.postAtFrontOfQueue(new m9.u(11, d.f10213b.get(activity), obj2));
                    this.f10211f = true;
                    this.f10207a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10208b == activity) {
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
