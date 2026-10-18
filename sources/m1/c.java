package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import be.c0;
import java.util.List;
import k1.z;
import td.l;
public final class c {
    public final String f16402a;
    public final l f16403b;
    public final c0 f16404c;
    public final Object d;
    public volatile k0.b e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f16402a = name;
        this.f16403b = lVar;
        this.f16404c = c0Var;
        this.d = new Object();
    }

    public final k0.b a(Object obj, xd.g property) {
        k0.b bVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        k0.b bVar2 = this.e;
        if (bVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f16403b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f16404c;
                        b bVar3 = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.e = new k0.b(new z(new k0(bVar3, 2), jd.h.b(new ab.l(migrations, null, 4)), new rb.b(12), c0Var), 7);
                    }
                    bVar = this.e;
                    kotlin.jvm.internal.i.b(bVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }
}
