package m1;

import ad.l;
import android.content.Context;
import androidx.lifecycle.k0;
import h7.q6;
import ia.m;
import id.c0;
import java.util.List;
import k1.z;

public final class c {

    public final String f17538a;

    public final l f17539b;

    public final c0 f17540c;
    public final Object d;

    public volatile n1.d f17541e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.f17538a = name;
        this.f17539b = lVar;
        this.f17540c = c0Var;
        this.d = new Object();
    }

    public final n1.d a(Object obj, ed.g property) {
        n1.d dVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        n1.d dVar2 = this.f17541e;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.d) {
            try {
                if (this.f17541e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    l lVar = this.f17539b;
                    kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    c0 c0Var = this.f17540c;
                    b bVar = new b(applicationContext, this);
                    kotlin.jvm.internal.j.e(migrations, "migrations");
                    this.f17541e = new n1.d(new z(new k0(bVar, 2), q6.a(new m(migrations, null, 3)), new w9.d(12), c0Var), 0);
                }
                dVar = this.f17541e;
                kotlin.jvm.internal.j.b(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
