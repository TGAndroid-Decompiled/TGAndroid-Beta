package jb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import m2.t;
public final class g {
    public static final Object f9782b = new Object();
    public static g f9783c;
    public r9.g f9784a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f9782b) {
            if (f9783c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.i("MlKitContext has not been initialized", z10);
            gVar = f9783c;
            n6.l.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f9782b) {
            if (f9783c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.i("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f9783c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList l4 = new m5.e(21, context, new t(MlKitComponentDiscoveryService.class, 20)).l();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            org.telegram.utils.twidget.t tVar = r9.e.f46427o;
            arrayList.addAll(l4);
            arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(r9.a.c(obj, g.class, new Class[0]));
            r9.g gVar2 = new r9.g(executor, arrayList, arrayList2, tVar);
            obj.f9784a = gVar2;
            gVar2.f(true);
            gVar = f9783c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f9783c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.i("MlKitContext has been deleted", z10);
        n6.l.g(this.f9784a);
        return this.f9784a.b(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
