package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public final class f implements Application.ActivityLifecycleCallbacks {

    public Object f5045a;

    public Activity f5046b;

    public final int f5047c;
    public boolean d = false;

    public boolean f5048e = false;

    public boolean f5049f = false;

    public f(Activity activity) {
        this.f5046b = activity;
        this.f5047c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5046b == activity) {
            this.f5046b = null;
            this.f5048e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (!this.f5048e || this.f5049f || this.d) {
            return;
        }
        Object obj = this.f5045a;
        try {
            Object obj2 = g.f5052c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f5047c) {
                g.f5055g.postAtFrontOfQueue(new a9.o(g.f5051b.get(activity), obj2, false, 5));
                this.f5049f = true;
                this.f5045a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f5046b == activity) {
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
