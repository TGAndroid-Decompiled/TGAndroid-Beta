package m1;

import a8.ud;
import android.content.Context;
import androidx.lifecycle.k0;
import ce.c0;
import java.util.List;
import jg.s0;
import k1.z;
import ud.l;
public final class c {
    public final String f17922a;
    public final l f17923b;
    public final c0 f17924c;
    public final Object d;
    public volatile s0 e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f17922a = name;
        this.f17923b = lVar;
        this.f17924c = c0Var;
        this.d = new Object();
    }

    public final s0 a(Object obj, yd.g property) {
        s0 s0Var;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        s0 s0Var2 = this.e;
        if (s0Var2 == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f17923b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f17924c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.e = new s0(new z(new k0(bVar, 2), ud.a(new bb.l(migrations, null, 4)), new Object(), c0Var), 10);
                    }
                    s0Var = this.e;
                    kotlin.jvm.internal.i.b(s0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return s0Var;
        }
        return s0Var2;
    }
}
