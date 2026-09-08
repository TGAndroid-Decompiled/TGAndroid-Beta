package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import k2.g0;
import rd.l;
import zd.c0;
public final class c {
    public final String f15769a;
    public final l f15770b;
    public final c0 f15771c;
    public final Object d;
    public volatile g0 f15772e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f15769a = name;
        this.f15770b = lVar;
        this.f15771c = c0Var;
        this.d = new Object();
    }

    public final g0 a(Object obj, vd.g property) {
        g0 g0Var;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        g0 g0Var2 = this.f15772e;
        if (g0Var2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f15772e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f15770b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f15771c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.f15772e = new g0(new a0(new k0(bVar, 2), hd.h.b(new bb.j(migrations, null, 1)), new ob.a(12), c0Var), 3);
                    }
                    g0Var = this.f15772e;
                    kotlin.jvm.internal.i.b(g0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return g0Var;
        }
        return g0Var2;
    }
}
