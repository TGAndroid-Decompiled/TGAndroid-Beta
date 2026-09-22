package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f7770a;
    public Activity f7771b;
    public final int f7772c;
    public boolean d = false;
    public boolean e = false;
    public boolean f7773f = false;

    public f(Activity activity) {
        this.f7771b = activity;
        this.f7772c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7771b == activity) {
            this.f7771b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f7773f && !this.d) {
            Object obj = this.f7770a;
            try {
                Object obj2 = g.f7776c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f7772c) {
                    g.f7778g.postAtFrontOfQueue(new i9.s(12, g.f7775b.get(activity), obj2));
                    this.f7773f = true;
                    this.f7770a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f7771b == activity) {
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
