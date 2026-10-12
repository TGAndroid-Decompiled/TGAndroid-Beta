package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import be.c0;
import java.util.List;
import k1.z;
import td.l;
public final class c {
    public final String f15309a;
    public final l f15310b;
    public final c0 f15311c;
    public final Object d;
    public volatile l2.f e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f15309a = name;
        this.f15310b = lVar;
        this.f15311c = c0Var;
        this.d = new Object();
    }

    public final l2.f a(Object obj, xd.g property) {
        l2.f fVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        l2.f fVar2 = this.e;
        if (fVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f15310b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f15311c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.e = new l2.f(new z(new k0(bVar, 2), jd.h.b(new ab.l(migrations, null, 4)), new rb.b(12), c0Var), 3);
                    }
                    fVar = this.e;
                    kotlin.jvm.internal.i.b(fVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fVar;
        }
        return fVar2;
    }
}
