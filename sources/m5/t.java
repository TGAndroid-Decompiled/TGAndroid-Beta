package m5;

import aa.b0;
import android.content.Context;
import c3.h0;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.h1;
public final class t {
    public static volatile k e;
    public final v5.a f18355a;
    public final v5.a f18356b;
    public final r5.b f18357c;
    public final b0 d;

    public t(v5.a aVar, v5.a aVar2, r5.b bVar, b0 b0Var, com.google.firebase.messaging.q qVar) {
        this.f18355a = aVar;
        this.f18356b = aVar2;
        this.f18357c = bVar;
        this.d = b0Var;
        ((Executor) qVar.f7757a).execute(new h1(qVar, 15));
    }

    public static t a() {
        k kVar = e;
        if (kVar != null) {
            return (t) kVar.f18340f.mo27get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (t.class) {
                try {
                    if (e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f18336a = context;
                        e = obj.a();
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
            singleton = DesugarCollections.unmodifiableSet(k5.a.d);
        } else {
            singleton = Collections.singleton(new j5.c("proto"));
        }
        k6.c a2 = i.a();
        lVar.getClass();
        a2.f16407c = "cct";
        k5.a aVar = (k5.a) lVar;
        String str = aVar.f16386a;
        String str2 = aVar.f16387b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = h0.m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f16406b = bytes;
        return new r(singleton, a2.j(), this);
    }
}
