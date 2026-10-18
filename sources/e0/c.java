package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f8079a;
    public Activity f8080b;
    public final int f8081c;
    public boolean d = false;
    public boolean e = false;
    public boolean f8082f = false;

    public c(Activity activity) {
        this.f8080b = activity;
        this.f8081c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8080b == activity) {
            this.f8080b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f8082f && !this.d) {
            Object obj = this.f8079a;
            try {
                Object obj2 = d.f8085c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8081c) {
                    d.f8087g.postAtFrontOfQueue(new j9.u(13, d.f8084b.get(activity), obj2));
                    this.f8082f = true;
                    this.f8079a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8080b == activity) {
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
