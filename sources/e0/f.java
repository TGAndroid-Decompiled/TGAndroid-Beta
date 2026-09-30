package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f7767a;
    public Activity f7768b;
    public final int f7769c;
    public boolean d = false;
    public boolean e = false;
    public boolean f7770f = false;

    public f(Activity activity) {
        this.f7768b = activity;
        this.f7769c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7768b == activity) {
            this.f7768b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f7770f && !this.d) {
            Object obj = this.f7767a;
            try {
                Object obj2 = g.f7773c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f7769c) {
                    g.f7775g.postAtFrontOfQueue(new i9.s(12, g.f7772b.get(activity), obj2));
                    this.f7770f = true;
                    this.f7767a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f7768b == activity) {
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
