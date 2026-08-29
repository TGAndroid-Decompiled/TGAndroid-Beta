package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import bd.l;
import i7.m7;
import java.util.List;
import jd.c0;
import k1.a0;
public final class c {
    public final String f16760a;
    public final l f16761b;
    public final c0 f16762c;
    public final Object d;
    public volatile za.c f16763e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.f16760a = name;
        this.f16761b = lVar;
        this.f16762c = c0Var;
        this.d = new Object();
    }

    public final za.c a(Object obj, fd.g property) {
        za.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        za.c cVar2 = this.f16763e;
        if (cVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f16763e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f16761b;
                        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f16762c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.j.e(migrations, "migrations");
                        this.f16763e = new za.c(new a0(new k0(bVar, 2), m7.a(new ja.l(migrations, null, 3)), new ab.b(12), c0Var), 27);
                    }
                    cVar = this.f16763e;
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
