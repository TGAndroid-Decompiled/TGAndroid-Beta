package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import be.c0;
import java.util.List;
import k1.z;
import td.l;
public final class c {
    public final String f15044a;
    public final l f15045b;
    public final c0 f15046c;
    public final Object d;
    public volatile m.h e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f15044a = name;
        this.f15045b = lVar;
        this.f15046c = c0Var;
        this.d = new Object();
    }

    public final m.h a(Object obj, xd.g property) {
        m.h hVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        m.h hVar2 = this.e;
        if (hVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f15045b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f15046c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.e = new m.h(new z(new k0(bVar, 2), jd.h.b(new ab.l(migrations, null, 4)), new rb.b(12), c0Var), 2);
                    }
                    hVar = this.e;
                    kotlin.jvm.internal.i.b(hVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hVar;
        }
        return hVar2;
    }
}
