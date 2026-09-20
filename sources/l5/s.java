package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.t;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import k2.u;
import org.telegram.ui.web.r0;
public final class s {
    public static volatile j e;
    public final u5.a f14114a;
    public final u5.a f14115b;
    public final q5.b f14116c;
    public final da.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, t tVar) {
        this.f14114a = aVar;
        this.f14115b = aVar2;
        this.f14116c = bVar;
        this.d = bVar2;
        ((Executor) tVar.f7346b).execute(new r0(tVar, 24));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f14099f.mo28get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        u uVar = new u(3, false);
                        context.getClass();
                        uVar.f13384b = context;
                        e = uVar.c();
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
        a2.f359b = "cct";
        j5.a aVar = (j5.a) kVar;
        String str = aVar.f12880a;
        String str2 = aVar.f12881b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f360c = bytes;
        return new q(singleton, a2.e(), this);
    }
}
