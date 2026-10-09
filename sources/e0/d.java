package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class d implements Application.ActivityLifecycleCallbacks {
    public Object f8393a;
    public Activity f8394b;
    public final int f8395c;
    public boolean d = false;
    public boolean f8396e = false;
    public boolean f8397f = false;

    public d(Activity activity) {
        this.f8394b = activity;
        this.f8395c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8394b == activity) {
            this.f8394b = null;
            this.f8396e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f8396e && !this.f8397f && !this.d) {
            Object obj = this.f8393a;
            try {
                Object obj2 = e.f8400c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8395c) {
                    e.f8403g.postAtFrontOfQueue(new i9.s(13, e.f8399b.get(activity), obj2));
                    this.f8397f = true;
                    this.f8393a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8394b == activity) {
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
