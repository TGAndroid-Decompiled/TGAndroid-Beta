package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class r0 implements Application.ActivityLifecycleCallbacks {
    public static r0 f25165f;
    public int f25166a;
    public boolean f25167b = true;
    public long f25168c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList f25169e = new ArrayList();

    public r0(t0 t0Var) {
        f25165f = this;
        t0Var.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i7 = this.f25166a + 1;
        this.f25166a = i7;
        if (i7 == 1) {
            if (SystemClock.elapsedRealtime() - this.f25168c < 200) {
                this.f25167b = false;
            }
            if (r2.f25191a) {
                a8.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.yz) it.next()).b();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void b(Activity activity) {
        ArrayList arrayList = this.f25169e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Activity activity2 = (Activity) ((WeakReference) arrayList.get(size)).get();
            if (activity2 == null || activity2 == activity) {
                arrayList.remove(size);
            }
        }
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        b(activity);
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        b(activity);
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        b(activity);
        this.f25169e.add(new WeakReference(activity));
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        boolean z9;
        if (this.f25166a == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        a(activity);
        if (z9) {
            t0.c(true);
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        int i7 = this.f25166a - 1;
        this.f25166a = i7;
        if (i7 == 0) {
            this.f25168c = SystemClock.elapsedRealtime();
            this.f25167b = true;
            if (r2.f25191a) {
                a8.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.yz) it.next()).a();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
