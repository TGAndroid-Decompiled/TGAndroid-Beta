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
    public static r0 f25016f;
    public int f25017a;
    public boolean f25018b = true;
    public long f25019c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList f25020e = new ArrayList();

    public r0(t0 t0Var) {
        f25016f = this;
        t0Var.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i3 = this.f25017a + 1;
        this.f25017a = i3;
        if (i3 == 1) {
            if (SystemClock.elapsedRealtime() - this.f25019c < 200) {
                this.f25018b = false;
            }
            if (r2.f25040a) {
                a8.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.uz) it.next()).b();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void b(Activity activity) {
        ArrayList arrayList = this.f25020e;
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
        this.f25020e.add(new WeakReference(activity));
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        boolean z10;
        if (this.f25017a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(activity);
        if (z10) {
            t0.c(true);
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        int i3 = this.f25017a - 1;
        this.f25017a = i3;
        if (i3 == 0) {
            this.f25019c = SystemClock.elapsedRealtime();
            this.f25018b = true;
            if (r2.f25040a) {
                a8.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.uz) it.next()).a();
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
