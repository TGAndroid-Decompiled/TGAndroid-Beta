package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class hj4 {
    public final li4 a;
    public final l9a b;

    public hj4(li4 li4Var, l9a l9aVar, cy2 cy2Var, j9a j9aVar) {
        li4Var.getClass();
        l9aVar.getClass();
        cy2Var.getClass();
        j9aVar.getClass();
        this.a = li4Var;
        this.b = l9aVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        li4Var.a();
        Context applicationContext = li4Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(j9aVar);
            srd.b(ibe.a(cy2Var), new gj4(this, j9aVar, null, (byte) 0));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
