package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10173a;
    public Activity f10174b;
    public final int f10175c;
    public boolean d = false;
    public boolean f10176e = false;
    public boolean f10177f = false;

    public c(Activity activity) {
        this.f10174b = activity;
        this.f10175c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10174b == activity) {
            this.f10174b = null;
            this.f10176e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10176e && !this.f10177f && !this.d) {
            Object obj = this.f10173a;
            try {
                Object obj2 = d.f10180c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10175c) {
                    d.f10183g.postAtFrontOfQueue(new m9.u(11, d.f10179b.get(activity), obj2));
                    this.f10177f = true;
                    this.f10173a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10174b == activity) {
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
