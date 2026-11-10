package gb;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class o {
    public final o9.g f13736a;
    public final jb.l f13737b;

    public o(o9.g firebaseApp, jb.l settings, id.h backgroundDispatcher, y0 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.j.e(settings, "settings");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f13736a = firebaseApp;
        this.f13737b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f20880a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            zd.b0.q(zd.b0.b(backgroundDispatcher), new be.l(this, sessionsActivityLifecycleCallbacks, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
