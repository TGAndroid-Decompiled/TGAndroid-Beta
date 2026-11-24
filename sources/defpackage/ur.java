package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.a;
public final class ur implements Application.ActivityLifecycleCallbacks {
    public static ur f;
    public int a;
    public boolean b = true;
    public long c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList e = new ArrayList();

    public ur(a aVar) {
        f = this;
        aVar.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            if (SystemClock.elapsedRealtime() - this.c < 200) {
                this.b = false;
            }
            if (w01.a) {
                fa4.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((dm4) it.next()).b();
                } catch (Exception e) {
                    fa4.g(e, true);
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
        boolean z;
        if (this.a == 0) {
            z = true;
        } else {
            z = false;
        }
        a(activity);
        if (z) {
            a.c(true);
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.c = SystemClock.elapsedRealtime();
            this.b = true;
            if (w01.a) {
                fa4.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((dm4) it.next()).a();
                } catch (Exception e) {
                    fa4.g(e, true);
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
