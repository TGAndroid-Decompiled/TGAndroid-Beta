package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f8081a;
    public Activity f8082b;
    public final int f8083c;
    public boolean d = false;
    public boolean e = false;
    public boolean f8084f = false;

    public c(Activity activity) {
        this.f8082b = activity;
        this.f8083c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8082b == activity) {
            this.f8082b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f8084f && !this.d) {
            Object obj = this.f8081a;
            try {
                Object obj2 = d.f8087c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8083c) {
                    d.f8089g.postAtFrontOfQueue(new j9.u(13, d.f8086b.get(activity), obj2));
                    this.f8084f = true;
                    this.f8081a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8082b == activity) {
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
