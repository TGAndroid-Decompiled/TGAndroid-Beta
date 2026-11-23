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
    public static volatile j f21762e;
    public final x5.a f21763a;
    public final x5.a f21764b;
    public final t5.b f21765c;
    public final ia.c d;

    public s(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, c0 c0Var) {
        this.f21763a = aVar;
        this.f21764b = aVar2;
        this.f21765c = bVar;
        this.d = cVar;
        ((Executor) c0Var.f908b).execute(new z0(c0Var, 23));
    }

    public static s a() {
        j jVar = f21762e;
        if (jVar != null) {
            return (s) jVar.f21746f.mo24get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21762e == null) {
            synchronized (s.class) {
                try {
                    if (f21762e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f1982a = context;
                        f21762e = obj.a();
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
        a10.f13968b = "cct";
        m5.a aVar = (m5.a) kVar;
        String str = aVar.f20860a;
        String str2 = aVar.f20861b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f13969c = bytes;
        return new q(singleton, a10.j(), this);
    }
}
