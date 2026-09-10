package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import rd.l;
import zd.c0;
public final class c {
    public final String f13219a;
    public final l f13220b;
    public final c0 f13221c;
    public final Object d;
    public volatile l2.h e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f13219a = name;
        this.f13220b = lVar;
        this.f13221c = c0Var;
        this.d = new Object();
    }

    public final l2.h a(Object obj, vd.g property) {
        l2.h hVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        l2.h hVar2 = this.e;
        if (hVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f13220b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f13221c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.e = new l2.h(new a0(new k0(bVar, 2), hd.h.b(new bb.i(migrations, null, 1)), new na.d(12), c0Var), 3);
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
