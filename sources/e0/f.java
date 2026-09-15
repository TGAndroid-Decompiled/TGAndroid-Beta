package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f7768a;
    public Activity f7769b;
    public final int f7770c;
    public boolean d = false;
    public boolean e = false;
    public boolean f7771f = false;

    public f(Activity activity) {
        this.f7769b = activity;
        this.f7770c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7769b == activity) {
            this.f7769b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f7771f && !this.d) {
            Object obj = this.f7768a;
            try {
                Object obj2 = g.f7774c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f7770c) {
                    g.f7776g.postAtFrontOfQueue(new i9.s(12, g.f7773b.get(activity), obj2));
                    this.f7771f = true;
                    this.f7768a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f7769b == activity) {
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
