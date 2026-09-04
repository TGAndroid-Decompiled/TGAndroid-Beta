package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class s {
    public static volatile j f15306e;
    public final u5.a f15307a;
    public final u5.a f15308b;
    public final q5.b f15309c;
    public final da.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, com.google.firebase.messaging.s sVar) {
        this.f15307a = aVar;
        this.f15308b = aVar2;
        this.f15309c = bVar;
        this.d = bVar2;
        ((Executor) sVar.f6391b).execute(new org.telegram.ui.web.b(sVar, 18));
    }

    public static s a() {
        j jVar = f15306e;
        if (jVar != null) {
            return (s) jVar.f15290f.mo28get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f15306e == null) {
            synchronized (s.class) {
                try {
                    if (f15306e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f14823a = context;
                        f15306e = obj.a();
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
        a2.f371b = "cct";
        j5.a aVar = (j5.a) kVar;
        String str = aVar.f13510a;
        String str2 = aVar.f13511b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f372c = bytes;
        return new q(singleton, a2.f(), this);
    }
}
