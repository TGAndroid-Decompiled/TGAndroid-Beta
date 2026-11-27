package defpackage;

import android.util.Log;
import java.util.ArrayList;
public final class sj {
    public final tj a;

    public final void a(uy2 uy2Var) {
        tj tjVar = this.a;
        synchronized (tjVar) {
            ((ArrayList) tjVar.b).add(uy2Var);
            Object obj = tjVar.c;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
