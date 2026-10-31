package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class u0 implements Application.ActivityLifecycleCallbacks {
    public static u0 f18205f;
    public int f18206a;
    public boolean f18207b = true;
    public long f18208c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList e = new ArrayList();

    public u0(w0 w0Var) {
        f18205f = this;
        w0Var.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i10 = this.f18206a + 1;
        this.f18206a = i10;
        if (i10 == 1) {
            if (SystemClock.elapsedRealtime() - this.f18208c < 200) {
                this.f18207b = false;
            }
            if (v2.f18448a) {
                f8.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.m00) it.next()).b();
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public final void b(Activity activity) {
        ArrayList arrayList = this.e;
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
        this.e.add(new WeakReference(activity));
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        boolean z10;
        if (this.f18206a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(activity);
        if (z10) {
            w0.c(true);
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f18206a - 1;
        this.f18206a = i10;
        if (i10 == 0) {
            this.f18208c = SystemClock.elapsedRealtime();
            this.f18207b = true;
            if (v2.f18448a) {
                f8.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.m00) it.next()).a();
                } catch (Exception e) {
                    f8.g(e, true);
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
