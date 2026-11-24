package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class cg7 {
    public static final Object b = new Object();
    public static cg7 c;
    public pr2 a;

    public static cg7 c() {
        boolean z;
        cg7 cg7Var;
        synchronized (b) {
            if (c != null) {
                z = true;
            } else {
                z = false;
            }
            ite.j("MlKitContext has not been initialized", z);
            cg7Var = c;
            ite.h(cg7Var);
        }
        return cg7Var;
    }

    public static cg7 d(Context context, Executor executor) {
        boolean z;
        cg7 cg7Var;
        synchronized (b) {
            if (c == null) {
                z = true;
            } else {
                z = false;
            }
            ite.j("MlKitContext is already initialized", z);
            ?? obj = new Object();
            c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList p = new lx6(context, new ni6(MlKitComponentDiscoveryService.class, (byte) 20), (byte) 16).p();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a32 a32Var = mr2.q;
            arrayList.addAll(p);
            arrayList2.add(xq2.c(context, Context.class, new Class[0]));
            arrayList2.add(xq2.c(obj, cg7.class, new Class[0]));
            pr2 pr2Var = new pr2(executor, arrayList, arrayList2, a32Var);
            obj.a = pr2Var;
            pr2Var.n(true);
            cg7Var = c;
        }
        return cg7Var;
    }

    public final Object a(Class cls) {
        boolean z;
        if (c == this) {
            z = true;
        } else {
            z = false;
        }
        ite.j("MlKitContext has been deleted", z);
        ite.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
