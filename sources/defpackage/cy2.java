package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
public final class cy2 implements Callable {
    public final long a;
    public final dy2 b;

    public cy2(dy2 dy2Var, long j) {
        this.b = dy2Var;
        this.a = j;
    }

    @Override
    public final Object call() {
        ls6.j(1, "fatal").putLong("timestamp", this.a);
        ((pd5) this.b.k.a.a).getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
        return null;
    }
}
