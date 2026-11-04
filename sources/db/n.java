package db;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class n {
    public final n9.h f8704a;
    public final gb.l f8705b;

    public n(n9.h firebaseApp, gb.l settings, fd.h backgroundDispatcher, x0 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.j.e(settings, "settings");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f8704a = firebaseApp;
        this.f8705b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f20296a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            wd.b0.q(wd.b0.b(backgroundDispatcher), new ae.d(this, sessionsActivityLifecycleCallbacks, null, 3));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
