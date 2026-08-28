package ha;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final s8.h f10343a;
    public final ja.h f10344b;

    public m(s8.h hVar, ja.h hVar2, qc.h hVar3) {
        this.f10343a = hVar;
        this.f10344b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f47470a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(s0.f10367a);
            hd.f0.q(hd.f0.b(hVar3), new l(this, hVar3, null, 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
