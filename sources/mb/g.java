package mb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import m2.t;
import org.telegram.ui.Components.i9;
public final class g {
    public static final Object f19230b = new Object();
    public static g f19231c;
    public t9.g f19232a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f19230b) {
            if (f19231c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p6.m.i("MlKitContext has not been initialized", z10);
            gVar = f19231c;
            p6.m.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f19230b) {
            if (f19231c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p6.m.i("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f19231c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList l02 = new t(context, new i9(MlKitComponentDiscoveryService.class, 20), false, 26).l0();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0.b bVar = t9.e.A;
            arrayList.addAll(l02);
            arrayList2.add(t9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(t9.a.c(obj, g.class, new Class[0]));
            t9.g gVar2 = new t9.g(executor, arrayList, arrayList2, bVar);
            obj.f19232a = gVar2;
            gVar2.h(true);
            gVar = f19231c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f19231c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        p6.m.i("MlKitContext has been deleted", z10);
        p6.m.g(this.f19232a);
        return this.f19232a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
