package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class d implements Application.ActivityLifecycleCallbacks {
    public Object f5999a;
    public Activity f6000b;
    public final int f6001c;
    public boolean d = false;
    public boolean e = false;
    public boolean f6002f = false;

    public d(Activity activity) {
        this.f6000b = activity;
        this.f6001c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f6000b == activity) {
            this.f6000b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f6002f && !this.d) {
            Object obj = this.f5999a;
            try {
                Object obj2 = e.f6005c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f6001c) {
                    e.f6007g.postAtFrontOfQueue(new j9.u(13, e.f6004b.get(activity), obj2));
                    this.f6002f = true;
                    this.f5999a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f6000b == activity) {
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
