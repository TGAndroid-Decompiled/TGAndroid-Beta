package f9;

import android.util.Log;
import c9.s;
import e3.f;
import java.util.concurrent.atomic.AtomicReference;
import k9.b1;
import vh.w2;
public final class a {
    public static final b f6092c = new Object();
    public final s f6093a;
    public final AtomicReference f6094b = new AtomicReference(null);

    public a(s sVar) {
        this.f6093a = sVar;
        sVar.a(new a1.c(this, 27));
    }

    public final b a(String str) {
        a aVar = (a) this.f6094b.get();
        if (aVar == null) {
            return f6092c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f6094b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f6094b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String e = w2.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e, null);
        }
        this.f6093a.a(new f(str, j10, b1Var, 2));
    }
}
