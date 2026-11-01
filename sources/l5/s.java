package l5;

import android.content.Context;
import android.support.v4.media.session.a0;
import c3.i0;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import ph.x1;
public final class s {
    public static volatile j e;
    public final u5.a f11686a;
    public final u5.a f11687b;
    public final q5.c f11688c;
    public final ea.d d;

    public s(u5.a aVar, u5.a aVar2, q5.c cVar, ea.d dVar, ji.f fVar) {
        this.f11686a = aVar;
        this.f11687b = aVar2;
        this.f11688c = cVar;
        this.d = dVar;
        ((Executor) fVar.f10442b).execute(new x1(fVar, 4));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f11671f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f10521a = context;
                        e = obj.b();
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
            singleton = DesugarCollections.unmodifiableSet(j5.a.d);
        } else {
            singleton = Collections.singleton(new i5.c("proto"));
        }
        a0 a2 = i.a();
        kVar.getClass();
        a2.f875b = "cct";
        j5.a aVar = (j5.a) kVar;
        String str = aVar.f9668a;
        String str2 = aVar.f9669b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = i0.n("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f876c = bytes;
        return new q(singleton, a2.f(), this);
    }
}
