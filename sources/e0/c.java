package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f9863a;
    public Activity f9864b;
    public final int f9865c;
    public boolean d = false;
    public boolean f9866e = false;
    public boolean f9867f = false;

    public c(Activity activity) {
        this.f9864b = activity;
        this.f9865c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f9864b == activity) {
            this.f9864b = null;
            this.f9866e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f9866e && !this.f9867f && !this.d) {
            Object obj = this.f9863a;
            try {
                Object obj2 = d.f9870c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f9865c) {
                    d.f9873g.postAtFrontOfQueue(new m9.u(11, d.f9869b.get(activity), obj2));
                    this.f9867f = true;
                    this.f9863a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f9864b == activity) {
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
