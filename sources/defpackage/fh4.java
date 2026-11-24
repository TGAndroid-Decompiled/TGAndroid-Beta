package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class fh4 {
    public final jg4 a;
    public final k7a b;

    public fh4(jg4 jg4Var, k7a k7aVar, sw2 sw2Var, i7a i7aVar) {
        jg4Var.getClass();
        k7aVar.getClass();
        sw2Var.getClass();
        i7aVar.getClass();
        this.a = jg4Var;
        this.b = k7aVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        jg4Var.a();
        Context applicationContext = jg4Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(i7aVar);
            ppd.b(h9e.a(sw2Var), new eh4(this, i7aVar, null, (byte) 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
