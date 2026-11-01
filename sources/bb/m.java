package bb;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final l9.h f2597a;
    public final db.h f2598b;

    public m(l9.h hVar, db.h hVar2, cd.h hVar3) {
        this.f2597a = hVar;
        this.f2598b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f11708a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(s0.f2619a);
            td.e0.q(td.e0.b(hVar3), new l(this, hVar3, null, 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
