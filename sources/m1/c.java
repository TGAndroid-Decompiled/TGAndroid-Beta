package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import dd.l;
import java.util.List;
import k1.d0;
import k7.t7;
import ld.c0;
public final class c {
    public final String f13412a;
    public final l f13413b;
    public final c0 f13414c;
    public final Object d;
    public volatile y5.h f13415e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.f13412a = name;
        this.f13413b = lVar;
        this.f13414c = c0Var;
        this.d = new Object();
    }

    public final y5.h a(Object obj, hd.g property) {
        y5.h hVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        y5.h hVar2 = this.f13415e;
        if (hVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f13415e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f13413b;
                        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f13414c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.j.e(migrations, "migrations");
                        this.f13415e = new y5.h(new d0(new k0(bVar, 2), t7.a(new k1.c(migrations, (uc.c) null, 0)), new cb.b(11), c0Var), 26);
                    }
                    hVar = this.f13415e;
                    kotlin.jvm.internal.j.b(hVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hVar;
        }
        return hVar2;
    }
}
