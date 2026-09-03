package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import dd.l;
import java.util.List;
import k1.d0;
import k7.s7;
import ld.c0;
public final class c {
    public final String f13690a;
    public final l f13691b;
    public final c0 f13692c;
    public final Object d;
    public volatile bb.b e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.f13690a = name;
        this.f13691b = lVar;
        this.f13692c = c0Var;
        this.d = new Object();
    }

    public final bb.b a(Object obj, hd.g property) {
        bb.b bVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        bb.b bVar2 = this.e;
        if (bVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f13691b;
                        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f13692c;
                        b bVar3 = new b(applicationContext, this);
                        kotlin.jvm.internal.j.e(migrations, "migrations");
                        this.e = new bb.b(new d0(new k0(bVar3, 2), s7.a(new k1.c(migrations, (uc.c) null, 0)), new cb.b(11), c0Var), 27);
                    }
                    bVar = this.e;
                    kotlin.jvm.internal.j.b(bVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }
}
