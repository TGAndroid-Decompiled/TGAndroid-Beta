package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class d implements Application.ActivityLifecycleCallbacks {
    public Object f8204a;
    public Activity f8205b;
    public final int f8206c;
    public boolean d = false;
    public boolean e = false;
    public boolean f8207f = false;

    public d(Activity activity) {
        this.f8205b = activity;
        this.f8206c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8205b == activity) {
            this.f8205b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f8207f && !this.d) {
            Object obj = this.f8204a;
            try {
                Object obj2 = e.f8210c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8206c) {
                    e.f8212g.postAtFrontOfQueue(new j9.u(13, e.f8209b.get(activity), obj2));
                    this.f8207f = true;
                    this.f8204a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8205b == activity) {
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
