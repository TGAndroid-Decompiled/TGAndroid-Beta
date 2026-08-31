package f9;

import android.util.Log;
import c9.r;
import e3.f;
import java.util.concurrent.atomic.AtomicReference;
import k9.b1;
import org.telegram.ui.yh;
public final class a {
    public static final b f6222c = new Object();
    public final r f6223a;
    public final AtomicReference f6224b = new AtomicReference(null);

    public a(r rVar) {
        this.f6223a = rVar;
        rVar.a(new a1.c(this, 27));
    }

    public final b a(String str) {
        a aVar = (a) this.f6224b.get();
        if (aVar == null) {
            return f6222c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f6224b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f6224b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String k10 = yh.k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", k10, null);
        }
        this.f6223a.a(new f(str, j10, b1Var, 2));
    }
}
