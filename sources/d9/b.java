package d9;

import a9.t;
import android.util.Log;
import i9.b1;
import java.util.concurrent.atomic.AtomicReference;
public final class b {
    public static final d f5532c = new Object();
    public final t f5533a;
    public final AtomicReference f5534b = new AtomicReference(null);

    public b(t tVar) {
        this.f5533a = tVar;
        tVar.a(new a1.c(this, 21));
    }

    public final d a(String str) {
        b bVar = (b) this.f5534b.get();
        if (bVar == null) {
            return f5532c;
        }
        return bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.f5534b.get();
        if (bVar != null && bVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        b bVar = (b) this.f5534b.get();
        if (bVar != null && bVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String e10 = u3.c.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e10, null);
        }
        this.f5533a.a(new a(str, j10, b1Var, 0));
    }
}
