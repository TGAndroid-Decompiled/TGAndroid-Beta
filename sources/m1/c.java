package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import g7.o6;
import hd.c0;
import java.util.List;
import k1.z;
import zc.l;
public final class c {
    public final String f17162a;
    public final l f17163b;
    public final c0 f17164c;
    public final Object d;
    public volatile android.support.v4.media.c f17165e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f17162a = name;
        this.f17163b = lVar;
        this.f17164c = c0Var;
        this.d = new Object();
    }

    public final android.support.v4.media.c a(Object obj, dd.g property) {
        android.support.v4.media.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        android.support.v4.media.c cVar2 = this.f17165e;
        if (cVar2 == null) {
            synchronized (this.d) {
                try {
                    if (this.f17165e == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        l lVar = this.f17163b;
                        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        c0 c0Var = this.f17164c;
                        b bVar = new b(applicationContext, this);
                        kotlin.jvm.internal.i.e(migrations, "migrations");
                        this.f17165e = new android.support.v4.media.c(new z(new k0(bVar, 2), o6.a(new ha.l(migrations, null, 4)), new v9.d(13), c0Var), 29);
                    }
                    cVar = this.f17165e;
                    kotlin.jvm.internal.i.b(cVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cVar;
        }
        return cVar2;
    }
}
