package m1;

import ae.d0;
import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import m2.t;
import sd.l;
public final class c {
    public final String f15897a;
    public final l f15898b;
    public final d0 f15899c;
    public final Object d;
    public volatile t f15900e;

    public c(String name, l lVar, d0 d0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f15897a = name;
        this.f15898b = lVar;
        this.f15899c = d0Var;
        this.d = new Object();
    }

    public final t a(Object obj, wd.g property) {
        t tVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        t tVar2 = this.f15900e;
        if (tVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f15900e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f15898b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        d0 d0Var = this.f15899c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.f15900e = new t(new a0(new k0(bVar, 2), id.h.b(new bb.i(migrations, null, 1)), new na.d(12), d0Var), 1);
                    }
                    tVar = this.f15900e;
                    kotlin.jvm.internal.i.b(tVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return tVar;
        }
        return tVar2;
    }
}
