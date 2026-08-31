package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class f implements Application.ActivityLifecycleCallbacks {
    public Object f4778a;
    public Activity f4779b;
    public final int f4780c;
    public boolean d = false;
    public boolean f4781e = false;
    public boolean f4782f = false;

    public f(Activity activity) {
        this.f4779b = activity;
        this.f4780c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4779b == activity) {
            this.f4779b = null;
            this.f4781e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f4781e && !this.f4782f && !this.d) {
            Object obj = this.f4778a;
            try {
                Object obj2 = g.f4785c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f4780c) {
                    g.f4788g.postAtFrontOfQueue(new androidx.biometric.k(g.f4784b.get(activity), obj2, false, 9));
                    this.f4782f = true;
                    this.f4778a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f4779b == activity) {
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
