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
    public static volatile j f15434e;
    public final u5.a f15435a;
    public final u5.a f15436b;
    public final q5.b f15437c;
    public final da.c d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.c cVar, com.google.firebase.messaging.s sVar) {
        this.f15435a = aVar;
        this.f15436b = aVar2;
        this.f15437c = bVar;
        this.d = cVar;
        ((Executor) sVar.f7971b).execute(new q0(sVar, 24));
    }

    public static s a() {
        j jVar = f15434e;
        if (jVar != null) {
            return (s) jVar.f15418f.mo27get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f15434e == null) {
            synchronized (s.class) {
                try {
                    if (f15434e == null) {
                        l2.f fVar = new l2.f(1, false);
                        context.getClass();
                        fVar.f15331b = context;
                        f15434e = fVar.n();
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
