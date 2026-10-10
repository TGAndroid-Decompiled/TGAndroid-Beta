package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.q0;
public final class s {
    public static volatile j f15438e;
    public final u5.a f15439a;
    public final u5.a f15440b;
    public final q5.b f15441c;
    public final da.c d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.c cVar, com.google.firebase.messaging.s sVar) {
        this.f15439a = aVar;
        this.f15440b = aVar2;
        this.f15441c = bVar;
        this.d = cVar;
        ((Executor) sVar.f7971b).execute(new q0(sVar, 24));
    }

    public static s a() {
        j jVar = f15438e;
        if (jVar != null) {
            return (s) jVar.f15422f.mo27get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f15438e == null) {
            synchronized (s.class) {
                try {
                    if (f15438e == null) {
                        l2.f fVar = new l2.f(1, false);
                        context.getClass();
                        fVar.f15335b = context;
                        f15438e = fVar.n();
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
        aa.a a2 = i.a();
        kVar.getClass();
        a2.f384b = "cct";
        j5.a aVar = (j5.a) kVar;
        String str = aVar.f14024a;
        String str2 = aVar.f14025b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f385c = bytes;
        return new q(singleton, a2.d(), this);
    }
}
