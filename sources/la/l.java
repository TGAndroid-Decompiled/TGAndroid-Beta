package la;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class l {
    public final w8.g f12218a;
    public final na.h f12219b;

    public l(w8.g gVar, na.h hVar, uc.h hVar2) {
        this.f12218a = gVar;
        this.f12219b = hVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        gVar.a();
        Context applicationContext = gVar.f49451a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(p0.f12231a);
            ld.e0.q(ld.e0.b(hVar2), new k1.c(this, hVar2, null, 3));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
