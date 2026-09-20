package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f7773a;
    public Activity f7774b;
    public final int f7775c;
    public boolean d = false;
    public boolean e = false;
    public boolean f7776f = false;

    public f(Activity activity) {
        this.f7774b = activity;
        this.f7775c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7774b == activity) {
            this.f7774b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f7776f && !this.d) {
            Object obj = this.f7773a;
            try {
                Object obj2 = g.f7779c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f7775c) {
                    g.f7781g.postAtFrontOfQueue(new i9.s(12, g.f7778b.get(activity), obj2));
                    this.f7776f = true;
                    this.f7773a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f7774b == activity) {
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
