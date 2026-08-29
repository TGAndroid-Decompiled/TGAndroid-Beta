package ja;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final u8.g f11378a;
    public final la.h f11379b;

    public m(u8.g gVar, la.h hVar, sc.h hVar2) {
        this.f11378a = gVar;
        this.f11379b = hVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        gVar.a();
        Context applicationContext = gVar.f49131a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(s0.f11402a);
            jd.e0.q(jd.e0.b(hVar2), new l(this, hVar2, null, 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
