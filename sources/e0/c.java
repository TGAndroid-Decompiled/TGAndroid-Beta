package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f8080a;
    public Activity f8081b;
    public final int f8082c;
    public boolean d = false;
    public boolean e = false;
    public boolean f8083f = false;

    public c(Activity activity) {
        this.f8081b = activity;
        this.f8082c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8081b == activity) {
            this.f8081b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f8083f && !this.d) {
            Object obj = this.f8080a;
            try {
                Object obj2 = d.f8086c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8082c) {
                    d.f8088g.postAtFrontOfQueue(new j9.u(13, d.f8085b.get(activity), obj2));
                    this.f8083f = true;
                    this.f8080a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8081b == activity) {
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
