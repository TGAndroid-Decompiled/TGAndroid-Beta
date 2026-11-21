package o5;

import ab.c0;
import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.z0;
public final class s {
    public static volatile j f21759e;
    public final x5.a f21760a;
    public final x5.a f21761b;
    public final t5.b f21762c;
    public final ia.c d;

    public s(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, c0 c0Var) {
        this.f21760a = aVar;
        this.f21761b = aVar2;
        this.f21762c = bVar;
        this.d = cVar;
        ((Executor) c0Var.f908b).execute(new z0(c0Var, 23));
    }

    public static s a() {
        j jVar = f21759e;
        if (jVar != null) {
            return (s) jVar.f21743f.mo24get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21759e == null) {
            synchronized (s.class) {
                try {
                    if (f21759e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f1975a = context;
                        f21759e = obj.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final q c(k kVar) {
        Set singleton;
        byte[] bytes;
        if (kVar != null) {
            singleton = DesugarCollections.unmodifiableSet(m5.a.d);
        } else {
            singleton = Collections.singleton(new l5.c("proto"));
        }
        h6.m a10 = i.a();
        kVar.getClass();
        a10.f13965b = "cct";
        m5.a aVar = (m5.a) kVar;
        String str = aVar.f20857a;
        String str2 = aVar.f20858b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f13966c = bytes;
        return new q(singleton, a10.j(), this);
    }
}
