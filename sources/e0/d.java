package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class d implements Application.ActivityLifecycleCallbacks {
    public Object f8201a;
    public Activity f8202b;
    public final int f8203c;
    public boolean d = false;
    public boolean e = false;
    public boolean f8204f = false;

    public d(Activity activity) {
        this.f8202b = activity;
        this.f8203c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8202b == activity) {
            this.f8202b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f8204f && !this.d) {
            Object obj = this.f8201a;
            try {
                Object obj2 = e.f8207c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8203c) {
                    e.f8209g.postAtFrontOfQueue(new j9.u(13, e.f8206b.get(activity), obj2));
                    this.f8204f = true;
                    this.f8201a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8202b == activity) {
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
