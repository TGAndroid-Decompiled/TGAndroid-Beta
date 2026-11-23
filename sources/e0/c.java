package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f10210a;
    public Activity f10211b;
    public final int f10212c;
    public boolean d = false;
    public boolean f10213e = false;
    public boolean f10214f = false;

    public c(Activity activity) {
        this.f10211b = activity;
        this.f10212c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10211b == activity) {
            this.f10211b = null;
            this.f10213e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.f10213e && !this.f10214f && !this.d) {
            Object obj = this.f10210a;
            try {
                Object obj2 = d.f10217c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f10212c) {
                    d.f10220g.postAtFrontOfQueue(new m9.u(11, d.f10216b.get(activity), obj2));
                    this.f10214f = true;
                    this.f10210a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f10211b == activity) {
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
