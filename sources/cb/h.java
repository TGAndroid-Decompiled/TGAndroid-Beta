package cb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class h {
    public static final Object f2242b = new Object();
    public static h f2243c;
    public c9.j f2244a;

    public static h c() {
        boolean z4;
        h hVar;
        synchronized (f2242b) {
            if (f2243c != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            b6.m.j("MlKitContext has not been initialized", z4);
            hVar = f2243c;
            b6.m.h(hVar);
        }
        return hVar;
    }

    public static h d(Context context, Executor executor) {
        boolean z4;
        h hVar;
        synchronized (f2242b) {
            if (f2243c == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            b6.m.j("MlKitContext is already initialized", z4);
            ?? obj = new Object();
            f2243c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList w10 = new af.c(16, context, new c9.e(MlKitComponentDiscoveryService.class)).w();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            af.a aVar = c9.g.f2179g;
            arrayList.addAll(w10);
            arrayList2.add(c9.b.c(context, Context.class, new Class[0]));
            arrayList2.add(c9.b.c(obj, h.class, new Class[0]));
            c9.j jVar = new c9.j(executor, arrayList, arrayList2, aVar);
            obj.f2244a = jVar;
            jVar.h(true);
            hVar = f2243c;
        }
        return hVar;
    }

    public final Object a(Class cls) {
        boolean z4;
        if (f2243c == this) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.j("MlKitContext has been deleted", z4);
        b6.m.h(this.f2244a);
        return this.f2244a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
