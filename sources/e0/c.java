package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10181a;
    public Activity f10182b;
    public final int f10183c;
    public boolean d = false;
    public boolean f10184e = false;
    public boolean f10185f = false;

    public c(Activity activity) {
        this.f10182b = activity;
        this.f10183c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10182b == activity) {
            this.f10182b = null;
            this.f10184e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10184e && !this.f10185f && !this.d) {
            Object obj = this.f10181a;
            try {
                Object obj2 = d.f10188c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10183c) {
                    d.f10191g.postAtFrontOfQueue(new m9.u(11, d.f10187b.get(activity), obj2));
                    this.f10185f = true;
                    this.f10181a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10182b == activity) {
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
