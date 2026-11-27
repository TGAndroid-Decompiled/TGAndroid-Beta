package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class kg7 {
    public static final Object b = new Object();
    public static kg7 c;
    public xq2 a;

    public static kg7 c() {
        boolean z;
        kg7 kg7Var;
        synchronized (b) {
            if (c != null) {
                z = true;
            } else {
                z = false;
            }
            xve.j("MlKitContext has not been initialized", z);
            kg7Var = c;
            xve.h(kg7Var);
        }
        return kg7Var;
    }

    public static kg7 d(Context context, Executor executor) {
        boolean z;
        kg7 kg7Var;
        synchronized (b) {
            if (c == null) {
                z = true;
            } else {
                z = false;
            }
            xve.j("MlKitContext is already initialized", z);
            ?? obj = new Object();
            c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList q = new lh2(context, new ri6(MlKitComponentDiscoveryService.class, (byte) 20), (byte) 17).q();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c22 c22Var = uq2.q;
            arrayList.addAll(q);
            arrayList2.add(fq2.c(context, Context.class, new Class[0]));
            arrayList2.add(fq2.c(obj, kg7.class, new Class[0]));
            xq2 xq2Var = new xq2(executor, arrayList, arrayList2, c22Var);
            obj.a = xq2Var;
            xq2Var.o(true);
            kg7Var = c;
        }
        return kg7Var;
    }

    public final Object a(Class cls) {
        boolean z;
        if (c == this) {
            z = true;
        } else {
            z = false;
        }
        xve.j("MlKitContext has been deleted", z);
        xve.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
