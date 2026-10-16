package ab;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final l9.h f440a;
    public final cb.h f441b;

    public m(l9.h hVar, cb.h hVar2, kd.h hVar3) {
        this.f440a = hVar;
        this.f441b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f14626a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(t0.f464a);
            be.f0.q(be.f0.b(hVar3), new l(this, hVar3, null, 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
