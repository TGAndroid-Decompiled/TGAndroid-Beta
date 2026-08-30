package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import dd.l;
import java.util.List;
import k1.d0;
import k7.s7;
import ld.c0;
public final class c {
    public final String f13706a;
    public final l f13707b;
    public final c0 f13708c;
    public final Object d;
    public volatile a3.c e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.f13706a = name;
        this.f13707b = lVar;
        this.f13708c = c0Var;
        this.d = new Object();
    }

    public final a3.c a(Object obj, hd.g property) {
        a3.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        a3.c cVar2 = this.e;
        if (cVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f13707b;
                        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f13708c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.j.e(migrations, "migrations");
                        this.e = new a3.c(new d0(new k0(bVar, 2), s7.a(new k1.c(migrations, (uc.c) null, 0)), new cb.b(11), c0Var), 25);
                    }
                    cVar = this.e;
                    kotlin.jvm.internal.j.b(cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cVar;
        }
        return cVar2;
    }
}
