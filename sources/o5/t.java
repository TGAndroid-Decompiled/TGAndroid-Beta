package o5;

import ab.c0;
import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class t {
    public static volatile k f21371e;
    public final x5.a f21372a;
    public final x5.a f21373b;
    public final t5.c f21374c;
    public final ia.c d;

    public t(x5.a aVar, x5.a aVar2, t5.c cVar, ia.c cVar2, c0 c0Var) {
        this.f21372a = aVar;
        this.f21373b = aVar2;
        this.f21374c = cVar;
        this.d = cVar2;
        ((Executor) c0Var.f909b).execute(new q2.d(c0Var, 20));
    }

    public static t a() {
        k kVar = f21371e;
        if (kVar != null) {
            return (t) kVar.f21355f.mo24get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21371e == null) {
            synchronized (t.class) {
                try {
                    if (f21371e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f21350a = context;
                        f21371e = obj.a();
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
        a10.f13624b = "cct";
        m5.a aVar = (m5.a) lVar;
        String str = aVar.f20468a;
        String str2 = aVar.f20469b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f13625c = bytes;
        return new r(singleton, a10.j(), this);
    }
}
