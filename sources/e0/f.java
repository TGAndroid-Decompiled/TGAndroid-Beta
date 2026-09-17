package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f8606a;
    public Activity f8607b;
    public final int f8608c;
    public boolean d = false;
    public boolean f8609e = false;
    public boolean f8610f = false;

    public f(Activity activity) {
        this.f8607b = activity;
        this.f8608c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8607b == activity) {
            this.f8607b = null;
            this.f8609e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f8609e && !this.f8610f && !this.d) {
            Object obj = this.f8606a;
            try {
                Object obj2 = g.f8613c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8608c) {
                    g.f8616g.postAtFrontOfQueue(new i9.s(12, g.f8612b.get(activity), obj2));
                    this.f8610f = true;
                    this.f8606a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8607b == activity) {
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
