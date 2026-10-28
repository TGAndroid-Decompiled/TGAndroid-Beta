package bb;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final m9.h f3796a;
    public final db.h f3797b;

    public m(m9.h hVar, db.h hVar2, ld.h hVar3) {
        this.f3796a = hVar;
        this.f3797b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f18379a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(s0.f3818a);
            ce.f0.q(ce.f0.b(hVar3), new l(this, hVar3, null, 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
