package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
public final class qz2 {
    public static final f8e c = new Object();
    public final xs7 a;
    public final AtomicReference b = new AtomicReference(null);

    public qz2(xs7 xs7Var) {
        this.a = xs7Var;
        xs7Var.a(new wm2(this, (byte) 4));
    }

    public final f8e a() {
        qz2 qz2Var = (qz2) this.b.get();
        if (qz2Var == null) {
            return c;
        }
        return qz2Var.a();
    }

    public final boolean b() {
        qz2 qz2Var = (qz2) this.b.get();
        if (qz2Var != null && qz2Var.b()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        qz2 qz2Var = (qz2) this.b.get();
        if (qz2Var != null && qz2Var.c()) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j, mb0 mb0Var) {
        String h = b10.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.a.a(new pt0(str, j, mb0Var, (byte) 1));
    }
}
