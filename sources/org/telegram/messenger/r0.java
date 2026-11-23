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
    public static r0 f26536f;
    public int f26537a;
    public boolean f26538b = true;
    public long f26539c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList f26540e = new ArrayList();

    public r0(t0 t0Var) {
        f26536f = this;
        t0Var.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i7 = this.f26537a + 1;
        this.f26537a = i7;
        if (i7 == 1) {
            if (SystemClock.elapsedRealtime() - this.f26539c < 200) {
                this.f26538b = false;
            }
            if (s2.f26730a) {
                a8.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.l00) it.next()).b();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void b(Activity activity) {
        ArrayList arrayList = this.f26540e;
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
        this.f26540e.add(new WeakReference(activity));
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        boolean z10;
        if (this.f26537a == 0) {
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
        int i7 = this.f26537a - 1;
        this.f26537a = i7;
        if (i7 == 0) {
            this.f26539c = SystemClock.elapsedRealtime();
            this.f26538b = true;
            if (s2.f26730a) {
                a8.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.l00) it.next()).a();
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
