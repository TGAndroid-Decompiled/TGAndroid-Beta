package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f8634a;
    public Activity f8635b;
    public final int f8636c;
    public boolean d = false;
    public boolean f8637e = false;
    public boolean f8638f = false;

    public f(Activity activity) {
        this.f8635b = activity;
        this.f8636c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8635b == activity) {
            this.f8635b = null;
            this.f8637e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f8637e && !this.f8638f && !this.d) {
            Object obj = this.f8634a;
            try {
                Object obj2 = g.f8641c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8636c) {
                    g.f8644g.postAtFrontOfQueue(new i9.s(12, g.f8640b.get(activity), obj2));
                    this.f8638f = true;
                    this.f8634a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f8635b == activity) {
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
