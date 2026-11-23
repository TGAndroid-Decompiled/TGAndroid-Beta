package gb;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class n {
    public final o9.g f13417a;
    public final jb.l f13418b;

    public n(o9.g firebaseApp, jb.l settings, id.h backgroundDispatcher, w0 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.j.e(settings, "settings");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f13417a = firebaseApp;
        this.f13418b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f21788a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            zd.b0.q(zd.b0.b(backgroundDispatcher), new be.l(this, sessionsActivityLifecycleCallbacks, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
