package b9;

import android.util.Log;
import g9.b1;
import java.util.concurrent.atomic.AtomicReference;
import y8.p;
public final class b {
    public static final d f1658c = new Object();
    public final p f1659a;
    public final AtomicReference f1660b = new AtomicReference(null);

    public b(p pVar) {
        this.f1659a = pVar;
        pVar.a(new a1.c(this, 1));
    }

    public final d a(String str) {
        b bVar = (b) this.f1660b.get();
        if (bVar == null) {
            return f1658c;
        }
        return bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.f1660b.get();
        if (bVar != null && bVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        b bVar = (b) this.f1660b.get();
        if (bVar != null && bVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String d = ta.b.d("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", d, null);
        }
        this.f1659a.a(new a(str, j10, b1Var, 0));
    }
}
