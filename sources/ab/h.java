package ab;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class h {
    public static final Object f310b = new Object();
    public static h f311c;
    public a9.j f312a;

    public static h c() {
        boolean z10;
        h hVar;
        synchronized (f310b) {
            if (f311c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            z5.l.j("MlKitContext has not been initialized", z10);
            hVar = f311c;
            z5.l.h(hVar);
        }
        return hVar;
    }

    public static h d(Context context, Executor executor) {
        boolean z10;
        h hVar;
        synchronized (f310b) {
            if (f311c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            z5.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f311c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList o10 = new ze.b(context, new m5.i(MlKitComponentDiscoveryService.class, 1)).o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a9.f fVar = a9.g.f241g;
            arrayList.addAll(o10);
            arrayList2.add(a9.b.c(context, Context.class, new Class[0]));
            arrayList2.add(a9.b.c(obj, h.class, new Class[0]));
            a9.j jVar = new a9.j(executor, arrayList, arrayList2, fVar);
            obj.f312a = jVar;
            jVar.h(true);
            hVar = f311c;
        }
        return hVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f311c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        z5.l.j("MlKitContext has been deleted", z10);
        z5.l.h(this.f312a);
        return this.f312a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
