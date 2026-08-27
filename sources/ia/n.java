package ia;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public final class n {

    public final t8.h f11055a;

    public final ka.h f11056b;

    public n(t8.h hVar, ka.h hVar2, rc.h hVar3) {
        this.f11055a = hVar;
        this.f11056b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f48119a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(t0.f11079a);
            id.f0.q(id.f0.b(hVar3), new m(this, hVar3, null, 0));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
