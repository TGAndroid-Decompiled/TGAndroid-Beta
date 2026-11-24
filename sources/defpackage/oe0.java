package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class oe0 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final oe0 e = new oe0();
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean();
    public final ArrayList c = new ArrayList();
    public boolean d = false;

    public static void b(Application application) {
        oe0 oe0Var = e;
        synchronized (oe0Var) {
            if (!oe0Var.d) {
                application.registerActivityLifecycleCallbacks(oe0Var);
                application.registerComponentCallbacks(oe0Var);
                oe0Var.d = true;
            }
        }
    }

    public final void a(ne0 ne0Var) {
        synchronized (e) {
            this.c.add(ne0Var);
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
                ((ne0) obj).a(z);
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
