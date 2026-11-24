package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
public final class o9 implements Application.ActivityLifecycleCallbacks {
    public Object a;
    public Activity b;
    public final int c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public o9(Activity activity) {
        this.b = activity;
        this.c = activity.hashCode();
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.e = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f && !this.d) {
            Object obj = this.a;
            try {
                Object obj2 = p9.c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.c) {
                    p9.g.postAtFrontOfQueue(new rld(p9.b.get(activity), obj2, (byte) 2));
                    this.f = true;
                    this.a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.b == activity) {
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
