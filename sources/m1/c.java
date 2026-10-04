package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import ii.n4;
import java.util.List;
import k1.a0;
import rd.l;
import zd.c0;
public final class c {
    public final String f15958a;
    public final l f15959b;
    public final c0 f15960c;
    public final Object d;
    public volatile n4 f15961e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f15958a = name;
        this.f15959b = lVar;
        this.f15960c = c0Var;
        this.d = new Object();
    }

    public final n4 a(Object obj, vd.g property) {
        n4 n4Var;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        n4 n4Var2 = this.f15961e;
        if (n4Var2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f15961e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f15959b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f15960c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.f15961e = new n4(new a0(new k0(bVar, 2), hd.h.b(new bb.i(migrations, null, 1)), new na.d(12), c0Var), 7);
                    }
                    n4Var = this.f15961e;
                    kotlin.jvm.internal.i.b(n4Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return n4Var;
        }
        return n4Var2;
    }
}
