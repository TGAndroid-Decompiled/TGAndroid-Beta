package ab;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final l9.h f439a;
    public final cb.h f440b;

    public m(l9.h hVar, cb.h hVar2, kd.h hVar3) {
        this.f439a = hVar;
        this.f440b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f15968a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(t0.f463a);
            be.f0.q(be.f0.b(hVar3), new l(this, hVar3, null, 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
