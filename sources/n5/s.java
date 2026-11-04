package n5;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import r4.u;
public final class s {
    public static volatile j f20268e;
    public final w5.a f20269a;
    public final w5.a f20270b;
    public final s5.b f20271c;
    public final ha.c d;

    public s(w5.a aVar, w5.a aVar2, s5.b bVar, ha.c cVar, za.p pVar) {
        this.f20269a = aVar;
        this.f20270b = aVar2;
        this.f20271c = bVar;
        this.d = cVar;
        ((Executor) pVar.f60311a).execute(new u(pVar, 4));
    }

    public static s a() {
        j jVar = f20268e;
        if (jVar != null) {
            return (s) jVar.f20252f.mo5get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f20268e == null) {
            synchronized (s.class) {
                try {
                    if (f20268e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f1741a = context;
                        f20268e = obj.b();
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
            singleton = DesugarCollections.unmodifiableSet(l5.a.d);
        } else {
            singleton = Collections.singleton(new k5.c("proto"));
        }
        k4.j a10 = i.a();
        kVar.getClass();
        a10.f16869a = "cct";
        l5.a aVar = (l5.a) kVar;
        String str = aVar.f18038a;
        String str2 = aVar.f18039b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = com.google.android.recaptcha.internal.a.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f16870b = bytes;
        return new q(singleton, a10.l(), this);
    }
}
