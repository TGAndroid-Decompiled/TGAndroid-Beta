package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
public final class xy2 implements Callable {
    public final long a;
    public final yy2 b;

    public xy2(yy2 yy2Var, long j) {
        this.b = yy2Var;
        this.a = j;
    }

    @Override
    public final Object call() {
        qu6.j(1, "fatal").putLong("timestamp", this.a);
        ((qf5) this.b.k.a.a).getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
        return null;
    }
}
