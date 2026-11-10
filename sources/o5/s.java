package o5;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class s {
    public static volatile j f20854e;
    public final x5.a f20855a;
    public final x5.a f20856b;
    public final t5.b f20857c;
    public final ia.c d;

    public s(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, ui.e eVar) {
        this.f20855a = aVar;
        this.f20856b = aVar2;
        this.f20857c = bVar;
        this.d = cVar;
        ((Executor) eVar.f56939b).execute(new sh.b(eVar, 13));
    }

    public static s a() {
        j jVar = f20854e;
        if (jVar != null) {
            return (s) jVar.f20838f.mo24get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f20854e == null) {
            synchronized (s.class) {
                try {
                    if (f20854e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f2020a = context;
                        f20854e = obj.a();
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
        a10.f14266b = "cct";
        m5.a aVar = (m5.a) kVar;
        String str = aVar.f19879a;
        String str2 = aVar.f19880b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = com.google.android.recaptcha.internal.a.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f14267c = bytes;
        return new q(singleton, a10.h(), this);
    }
}
