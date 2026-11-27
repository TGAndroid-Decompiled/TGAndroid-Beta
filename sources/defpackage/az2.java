package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
public final class az2 {
    public static final sae c = new Object();
    public final au7 a;
    public final AtomicReference b = new AtomicReference(null);

    public az2(au7 au7Var) {
        this.a = au7Var;
        au7Var.a(new ht2(this, (byte) 3));
    }

    public final sae a() {
        az2 az2Var = (az2) this.b.get();
        if (az2Var == null) {
            return c;
        }
        return az2Var.a();
    }

    public final boolean b() {
        az2 az2Var = (az2) this.b.get();
        if (az2Var != null && az2Var.b()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        az2 az2Var = (az2) this.b.get();
        if (az2Var != null && az2Var.c()) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j, oa0 oa0Var) {
        String i = c00.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i, null);
        }
        this.a.a(new ps0(str, j, oa0Var, (byte) 1));
    }
}
