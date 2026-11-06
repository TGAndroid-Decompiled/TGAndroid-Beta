package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10027a;
    public Activity f10028b;
    public final int f10029c;
    public boolean d = false;
    public boolean f10030e = false;
    public boolean f10031f = false;

    public c(Activity activity) {
        this.f10028b = activity;
        this.f10029c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10028b == activity) {
            this.f10028b = null;
            this.f10030e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10030e && !this.f10031f && !this.d) {
            Object obj = this.f10027a;
            try {
                Object obj2 = d.f10034c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10029c) {
                    d.f10037g.postAtFrontOfQueue(new m9.u(11, d.f10033b.get(activity), obj2));
                    this.f10031f = true;
                    this.f10027a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10028b == activity) {
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
