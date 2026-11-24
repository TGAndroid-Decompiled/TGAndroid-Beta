package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class ae7 {
    public static final Object b = new Object();
    public static ae7 c;
    public eq2 a;

    public static ae7 c() {
        boolean z;
        ae7 ae7Var;
        synchronized (b) {
            if (c != null) {
                z = true;
            } else {
                z = false;
            }
            fre.j("MlKitContext has not been initialized", z);
            ae7Var = c;
            fre.h(ae7Var);
        }
        return ae7Var;
    }

    public static ae7 d(Context context, Executor executor) {
        boolean z;
        ae7 ae7Var;
        synchronized (b) {
            if (c == null) {
                z = true;
            } else {
                z = false;
            }
            fre.j("MlKitContext is already initialized", z);
            ?? obj = new Object();
            c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList v = new tg2(context, new qx4(MlKitComponentDiscoveryService.class), (byte) 17).v();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            k32 k32Var = bq2.q;
            arrayList.addAll(v);
            arrayList2.add(mp2.c(context, Context.class, new Class[0]));
            arrayList2.add(mp2.c(obj, ae7.class, new Class[0]));
            eq2 eq2Var = new eq2(executor, arrayList, arrayList2, k32Var);
            obj.a = eq2Var;
            eq2Var.p(true);
            ae7Var = c;
        }
        return ae7Var;
    }

    public final Object a(Class cls) {
        boolean z;
        if (c == this) {
            z = true;
        } else {
            z = false;
        }
        fre.j("MlKitContext has been deleted", z);
        fre.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
