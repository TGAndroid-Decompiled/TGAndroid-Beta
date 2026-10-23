package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f8085a;
    public Activity f8086b;
    public final int f8087c;
    public boolean d = false;
    public boolean e = false;
    public boolean f8088f = false;

    public c(Activity activity) {
        this.f8086b = activity;
        this.f8087c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8086b == activity) {
            this.f8086b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f8088f && !this.d) {
            Object obj = this.f8085a;
            try {
                Object obj2 = d.f8091c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8087c) {
                    d.f8093g.postAtFrontOfQueue(new j9.u(13, d.f8090b.get(activity), obj2));
                    this.f8088f = true;
                    this.f8085a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8086b == activity) {
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
