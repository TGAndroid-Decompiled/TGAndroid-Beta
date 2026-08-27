package c9;

import android.util.Log;
import c3.f;
import h9.b1;
import java.util.concurrent.atomic.AtomicReference;
import z8.o;

public final class a {

    public static final c f2562c = new c();

    public final o f2563a;

    public final AtomicReference f2564b = new AtomicReference(null);

    public a(o oVar) {
        this.f2563a = oVar;
        oVar.a(new a1.c(this, 7));
    }

    public final c a(String str) {
        a aVar = (a) this.f2564b.get();
        return aVar == null ? f2562c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f2564b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f2564b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j10, b1 b1Var) {
        String strE = s3.c.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strE, null);
        }
        this.f2563a.a(new f(str, j10, b1Var, 1));
    }
}
