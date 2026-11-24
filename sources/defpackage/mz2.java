package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
public final class mz2 implements Callable {
    public final long a;
    public final nz2 b;

    public mz2(nz2 nz2Var, long j) {
        this.b = nz2Var;
        this.a = j;
    }

    @Override
    public final Object call() {
        kt6.j(1, "fatal").putLong("timestamp", this.a);
        ((nf5) this.b.k.a.a).getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
        return null;
    }
}
