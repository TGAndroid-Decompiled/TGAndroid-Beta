package defpackage;

import android.util.Log;
import java.util.ArrayList;
public final class rj {
    public final sj a;

    public rj(sj sjVar) {
        this.a = sjVar;
    }

    public final void a(k32 k32Var) {
        sj sjVar = this.a;
        synchronized (sjVar) {
            ((ArrayList) sjVar.b).add(k32Var);
            Object obj = sjVar.c;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
