package m1;

import ae.d0;
import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import m2.t;
import sd.l;
public final class c {
    public final String f15922a;
    public final l f15923b;
    public final d0 f15924c;
    public final Object d;
    public volatile t f15925e;

    public c(String name, l lVar, d0 d0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f15922a = name;
        this.f15923b = lVar;
        this.f15924c = d0Var;
        this.d = new Object();
    }

    public final t a(Object obj, wd.g property) {
        t tVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        t tVar2 = this.f15925e;
        if (tVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f15925e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f15923b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        d0 d0Var = this.f15924c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.f15925e = new t(new a0(new k0(bVar, 2), id.h.b(new bb.i(migrations, null, 1)), new na.d(12), d0Var), 1);
                    }
                    tVar = this.f15925e;
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
