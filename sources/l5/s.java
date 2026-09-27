package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.t;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.u0;
public final class s {
    public static volatile j e;
    public final u5.a f14142a;
    public final u5.a f14143b;
    public final q5.b f14144c;
    public final da.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, t tVar) {
        this.f14142a = aVar;
        this.f14143b = aVar2;
        this.f14144c = bVar;
        this.d = bVar2;
        ((Executor) tVar.f7336b).execute(new u0(tVar, 24));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f14127f.mo28get();
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
                        obj.f13371a = context;
                        e = obj.e();
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
        String str = aVar.f12871a;
        String str2 = aVar.f12872b;
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
