package defpackage;

import android.util.Log;
import java.util.ArrayList;
public final class rk {
    public final sk a;

    public rk(sk skVar) {
        this.a = skVar;
    }

    public final void a(a32 a32Var) {
        sk skVar = this.a;
        synchronized (skVar) {
            ((ArrayList) skVar.b).add(a32Var);
            Object obj = skVar.c;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
