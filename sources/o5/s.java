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
    public static volatile j f21734e;
    public final x5.a f21735a;
    public final x5.a f21736b;
    public final t5.b f21737c;
    public final ia.c d;

    public s(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, c0 c0Var) {
        this.f21735a = aVar;
        this.f21736b = aVar2;
        this.f21737c = bVar;
        this.d = cVar;
        ((Executor) c0Var.f908b).execute(new z0(c0Var, 23));
    }

    public static s a() {
        j jVar = f21734e;
        if (jVar != null) {
            return (s) jVar.f21718f.mo24get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21734e == null) {
            synchronized (s.class) {
                try {
                    if (f21734e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f1963a = context;
                        f21734e = obj.a();
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
        a10.f13936b = "cct";
        m5.a aVar = (m5.a) kVar;
        String str = aVar.f20829a;
        String str2 = aVar.f20830b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f13937c = bytes;
        return new q(singleton, a10.j(), this);
    }
}
