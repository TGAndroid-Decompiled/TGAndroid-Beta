package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f4958a;
    public Activity f4959b;
    public final int f4960c;
    public boolean d = false;
    public boolean e = false;
    public boolean f4961f = false;

    public f(Activity activity) {
        this.f4959b = activity;
        this.f4960c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4959b == activity) {
            this.f4959b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f4961f && !this.d) {
            Object obj = this.f4958a;
            try {
                Object obj2 = g.f4964c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f4960c) {
                    g.f4966g.postAtFrontOfQueue(new androidx.biometric.k(g.f4963b.get(activity), obj2, false, 9));
                    this.f4961f = true;
                    this.f4958a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f4959b == activity) {
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
