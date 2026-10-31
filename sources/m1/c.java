package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.z;
import k2.m0;
import ld.l;
import td.c0;
public final class c {
    public final String f12618a;
    public final l f12619b;
    public final c0 f12620c;
    public final Object d;
    public volatile m0 e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f12618a = name;
        this.f12619b = lVar;
        this.f12620c = c0Var;
        this.d = new Object();
    }

    public final m0 a(Object obj, pd.g property) {
        m0 m0Var;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        m0 m0Var2 = this.e;
        if (m0Var2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f12619b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f12620c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.e = new m0(new z(new k0(bVar, 2), bd.j.b(new bb.l(migrations, null, 4)), new jb.b(10), c0Var));
                    }
                    m0Var = this.e;
                    kotlin.jvm.internal.i.b(m0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m0Var;
        }
        return m0Var2;
    }
}
