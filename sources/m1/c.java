package m1;

import ae.d0;
import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import sd.l;
public final class c {
    public final String f15646a;
    public final l f15647b;
    public final d0 f15648c;
    public final Object d;
    public volatile a4.l f15649e;

    public c(String name, l lVar, d0 d0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f15646a = name;
        this.f15647b = lVar;
        this.f15648c = d0Var;
        this.d = new Object();
    }

    public final a4.l a(Object obj, wd.g property) {
        a4.l lVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        a4.l lVar2 = this.f15649e;
        if (lVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f15649e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar3 = this.f15647b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar3.invoke(applicationContext);
                        d0 d0Var = this.f15648c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.f15649e = new a4.l(new a0(new k0(bVar, 2), id.h.b(new bb.j(migrations, null, 1)), new na.d(12), d0Var), 29);
                    }
                    lVar = this.f15649e;
                    kotlin.jvm.internal.i.b(lVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar;
        }
        return lVar2;
    }
}
