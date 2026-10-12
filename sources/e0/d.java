package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class d implements Application.ActivityLifecycleCallbacks {
    public Object f8390a;
    public Activity f8391b;
    public final int f8392c;
    public boolean d = false;
    public boolean f8393e = false;
    public boolean f8394f = false;

    public d(Activity activity) {
        this.f8391b = activity;
        this.f8392c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8391b == activity) {
            this.f8391b = null;
            this.f8393e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f8393e && !this.f8394f && !this.d) {
            Object obj = this.f8390a;
            try {
                Object obj2 = e.f8397c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8392c) {
                    e.f8400g.postAtFrontOfQueue(new i9.s(13, e.f8396b.get(activity), obj2));
                    this.f8394f = true;
                    this.f8390a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8391b == activity) {
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
