package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class od0 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final od0 e = new od0();
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean();
    public final ArrayList c = new ArrayList();
    public boolean d = false;

    public static void b(Application application) {
        od0 od0Var = e;
        synchronized (od0Var) {
            if (!od0Var.d) {
                application.registerActivityLifecycleCallbacks(od0Var);
                application.registerComponentCallbacks(od0Var);
                od0Var.d = true;
            }
        }
    }

    public final void a(nd0 nd0Var) {
        synchronized (e) {
            this.c.add(nd0Var);
        }
    }

    public final void c(boolean z) {
        synchronized (e) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((nd0) obj).a(z);
            }
        }
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override
    public final void onTrimMemory(int i) {
        if (i == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            c(true);
        }
    }

    @Override
    public final void onLowMemory() {
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override
    public final void onActivityPaused(Activity activity) {
    }

    @Override
    public final void onActivityStarted(Activity activity) {
    }

    @Override
    public final void onActivityStopped(Activity activity) {
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
