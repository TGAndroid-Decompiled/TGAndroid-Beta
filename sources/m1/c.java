package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import ki.e0;
import rd.l;
import zd.c0;
public final class c {
    public final String f14617a;
    public final l f14618b;
    public final c0 f14619c;
    public final Object d;
    public volatile e0 e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f14617a = name;
        this.f14618b = lVar;
        this.f14619c = c0Var;
        this.d = new Object();
    }

    public final e0 a(Object obj, vd.g property) {
        e0 e0Var;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        e0 e0Var2 = this.e;
        if (e0Var2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f14618b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f14619c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.e = new e0(new a0(new k0(bVar, 2), hd.h.b(new bb.i(migrations, null, 1)), new na.d(12), c0Var), 4);
                    }
                    e0Var = this.e;
                    kotlin.jvm.internal.i.b(e0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return e0Var;
        }
        return e0Var2;
    }
}
