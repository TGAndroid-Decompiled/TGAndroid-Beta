package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f7756a;
    public Activity f7757b;
    public final int f7758c;
    public boolean d = false;
    public boolean e = false;
    public boolean f7759f = false;

    public f(Activity activity) {
        this.f7757b = activity;
        this.f7758c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7757b == activity) {
            this.f7757b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f7759f && !this.d) {
            Object obj = this.f7756a;
            try {
                Object obj2 = g.f7762c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f7758c) {
                    g.f7764g.postAtFrontOfQueue(new i9.s(12, g.f7761b.get(activity), obj2));
                    this.f7759f = true;
                    this.f7756a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f7757b == activity) {
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
