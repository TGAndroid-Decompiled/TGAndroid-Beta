package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class d implements Application.ActivityLifecycleCallbacks {
    public Object f8392a;
    public Activity f8393b;
    public final int f8394c;
    public boolean d = false;
    public boolean f8395e = false;
    public boolean f8396f = false;

    public d(Activity activity) {
        this.f8393b = activity;
        this.f8394c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8393b == activity) {
            this.f8393b = null;
            this.f8395e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f8395e && !this.f8396f && !this.d) {
            Object obj = this.f8392a;
            try {
                Object obj2 = e.f8399c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8394c) {
                    e.f8402g.postAtFrontOfQueue(new i9.s(13, e.f8398b.get(activity), obj2));
                    this.f8396f = true;
                    this.f8392a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8393b == activity) {
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
