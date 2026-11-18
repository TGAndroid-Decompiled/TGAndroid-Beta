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
    public static r0 f26517f;
    public int f26518a;
    public boolean f26519b = true;
    public long f26520c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList f26521e = new ArrayList();

    public r0(t0 t0Var) {
        f26517f = this;
        t0Var.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i7 = this.f26518a + 1;
        this.f26518a = i7;
        if (i7 == 1) {
            if (SystemClock.elapsedRealtime() - this.f26520c < 200) {
                this.f26519b = false;
            }
            if (s2.f26723a) {
                a8.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.j00) it.next()).b();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void b(Activity activity) {
        ArrayList arrayList = this.f26521e;
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
        this.f26521e.add(new WeakReference(activity));
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        boolean z10;
        if (this.f26518a == 0) {
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
        int i7 = this.f26518a - 1;
        this.f26518a = i7;
        if (i7 == 0) {
            this.f26520c = SystemClock.elapsedRealtime();
            this.f26519b = true;
            if (s2.f26723a) {
                a8.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.j00) it.next()).a();
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
