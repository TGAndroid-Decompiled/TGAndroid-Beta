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
public final class t {
    public static volatile k f21828e;
    public final x5.a f21829a;
    public final x5.a f21830b;
    public final t5.b f21831c;
    public final ia.c d;

    public t(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, c0 c0Var) {
        this.f21829a = aVar;
        this.f21830b = aVar2;
        this.f21831c = bVar;
        this.d = cVar;
        ((Executor) c0Var.f908b).execute(new z0(c0Var, 24));
    }

    public static t a() {
        k kVar = f21828e;
        if (kVar != null) {
            return (t) kVar.f21812f.mo23get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21828e == null) {
            synchronized (t.class) {
                try {
                    if (f21828e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f21807a = context;
                        f21828e = obj.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final r c(l lVar) {
        Set singleton;
        byte[] bytes;
        if (lVar != null) {
            singleton = DesugarCollections.unmodifiableSet(m5.a.d);
        } else {
            singleton = Collections.singleton(new l5.c("proto"));
        }
        h6.m a10 = i.a();
        lVar.getClass();
        a10.f13931b = "cct";
        m5.a aVar = (m5.a) lVar;
        String str = aVar.f20922a;
        String str2 = aVar.f20923b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f13932c = bytes;
        return new r(singleton, a10.u(), this);
    }
}
