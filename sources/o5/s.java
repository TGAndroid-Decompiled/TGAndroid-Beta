package o5;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.t0;
public final class s {
    public static volatile j f20849e;
    public final x5.a f20850a;
    public final x5.a f20851b;
    public final t5.b f20852c;
    public final ia.c d;

    public s(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, ui.e eVar) {
        this.f20850a = aVar;
        this.f20851b = aVar2;
        this.f20852c = bVar;
        this.d = cVar;
        ((Executor) eVar.f56931b).execute(new t0(eVar, 15));
    }

    public static s a() {
        j jVar = f20849e;
        if (jVar != null) {
            return (s) jVar.f20833f.mo24get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f20849e == null) {
            synchronized (s.class) {
                try {
                    if (f20849e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f2020a = context;
                        f20849e = obj.a();
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
        String str = aVar.f19874a;
        String str2 = aVar.f19875b;
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
