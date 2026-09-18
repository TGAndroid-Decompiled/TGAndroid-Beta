package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f7772a;
    public Activity f7773b;
    public final int f7774c;
    public boolean d = false;
    public boolean e = false;
    public boolean f7775f = false;

    public f(Activity activity) {
        this.f7773b = activity;
        this.f7774c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7773b == activity) {
            this.f7773b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f7775f && !this.d) {
            Object obj = this.f7772a;
            try {
                Object obj2 = g.f7778c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f7774c) {
                    g.f7780g.postAtFrontOfQueue(new i9.s(12, g.f7777b.get(activity), obj2));
                    this.f7775f = true;
                    this.f7772a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f7773b == activity) {
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
