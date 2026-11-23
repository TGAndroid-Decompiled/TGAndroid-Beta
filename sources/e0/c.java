package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10171a;
    public Activity f10172b;
    public final int f10173c;
    public boolean d = false;
    public boolean f10174e = false;
    public boolean f10175f = false;

    public c(Activity activity) {
        this.f10172b = activity;
        this.f10173c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10172b == activity) {
            this.f10172b = null;
            this.f10174e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10174e && !this.f10175f && !this.d) {
            Object obj = this.f10171a;
            try {
                Object obj2 = d.f10178c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10173c) {
                    d.f10181g.postAtFrontOfQueue(new m9.u(11, d.f10177b.get(activity), obj2));
                    this.f10175f = true;
                    this.f10171a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10172b == activity) {
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
