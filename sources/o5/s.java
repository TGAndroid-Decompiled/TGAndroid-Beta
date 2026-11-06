package o5;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.t0;
public final class s {
    public static volatile j f20846e;
    public final x5.a f20847a;
    public final x5.a f20848b;
    public final t5.b f20849c;
    public final ia.c d;

    public s(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, ui.e eVar) {
        this.f20847a = aVar;
        this.f20848b = aVar2;
        this.f20849c = bVar;
        this.d = cVar;
        ((Executor) eVar.f56839b).execute(new t0(eVar, 15));
    }

    public static s a() {
        j jVar = f20846e;
        if (jVar != null) {
            return (s) jVar.f20830f.mo24get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f20846e == null) {
            synchronized (s.class) {
                try {
                    if (f20846e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f2020a = context;
                        f20846e = obj.a();
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
        a10.f14264b = "cct";
        m5.a aVar = (m5.a) kVar;
        String str = aVar.f19871a;
        String str2 = aVar.f19872b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = com.google.android.recaptcha.internal.a.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f14265c = bytes;
        return new q(singleton, a10.h(), this);
    }
}
