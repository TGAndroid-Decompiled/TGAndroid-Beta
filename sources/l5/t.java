package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.r0;
public final class t {
    public static volatile k e;
    public final u5.a f14129a;
    public final u5.a f14130b;
    public final q5.b f14131c;
    public final da.b d;

    public t(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, com.google.firebase.messaging.t tVar) {
        this.f14129a = aVar;
        this.f14130b = aVar2;
        this.f14131c = bVar;
        this.d = bVar2;
        ((Executor) tVar.f7344b).execute(new r0(tVar, 24));
    }

    public static t a() {
        k kVar = e;
        if (kVar != null) {
            return (t) kVar.f14114f.mo28get();
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
                        obj.f14110a = context;
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
            singleton = DesugarCollections.unmodifiableSet(j5.a.d);
        } else {
            singleton = Collections.singleton(new i5.c("proto"));
        }
        aa.a a2 = i.a();
        lVar.getClass();
        a2.f356b = "cct";
        j5.a aVar = (j5.a) lVar;
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
        a2.f357c = bytes;
        return new r(singleton, a2.h(), this);
    }
}
