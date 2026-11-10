package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10032a;
    public Activity f10033b;
    public final int f10034c;
    public boolean d = false;
    public boolean f10035e = false;
    public boolean f10036f = false;

    public c(Activity activity) {
        this.f10033b = activity;
        this.f10034c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10033b == activity) {
            this.f10033b = null;
            this.f10035e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10035e && !this.f10036f && !this.d) {
            Object obj = this.f10032a;
            try {
                Object obj2 = d.f10039c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10034c) {
                    d.f10042g.postAtFrontOfQueue(new m9.u(11, d.f10038b.get(activity), obj2));
                    this.f10036f = true;
                    this.f10032a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10033b == activity) {
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
