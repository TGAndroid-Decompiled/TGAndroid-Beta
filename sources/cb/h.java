package cb;

import android.content.Context;
import androidx.emoji2.text.w;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class h {
    public static final Object f2410b = new Object();
    public static h f2411c;
    public c9.i f2412a;

    public static h c() {
        boolean z4;
        h hVar;
        synchronized (f2410b) {
            if (f2411c != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            b6.m.j("MlKitContext has not been initialized", z4);
            hVar = f2411c;
            b6.m.h(hVar);
        }
        return hVar;
    }

    public static h d(Context context, Executor executor) {
        boolean z4;
        h hVar;
        synchronized (f2410b) {
            if (f2411c == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            b6.m.j("MlKitContext is already initialized", z4);
            ?? obj = new Object();
            f2411c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList v = new bf.b(16, context, new o5.i(MlKitComponentDiscoveryService.class, 5)).v();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            w wVar = c9.f.f2344g;
            arrayList.addAll(v);
            arrayList2.add(c9.b.c(context, Context.class, new Class[0]));
            arrayList2.add(c9.b.c(obj, h.class, new Class[0]));
            c9.i iVar = new c9.i(executor, arrayList, arrayList2, wVar);
            obj.f2412a = iVar;
            iVar.g(true);
            hVar = f2411c;
        }
        return hVar;
    }

    public final Object a(Class cls) {
        boolean z4;
        if (f2411c == this) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.j("MlKitContext has been deleted", z4);
        b6.m.h(this.f2412a);
        return this.f2412a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
