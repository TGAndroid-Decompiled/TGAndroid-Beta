package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.t0;
public final class t {
    public static volatile k f15183e;
    public final u5.a f15184a;
    public final u5.a f15185b;
    public final q5.b f15186c;
    public final da.c d;

    public t(u5.a aVar, u5.a aVar2, q5.b bVar, da.c cVar, com.google.firebase.messaging.s sVar) {
        this.f15184a = aVar;
        this.f15185b = aVar2;
        this.f15186c = bVar;
        this.d = cVar;
        ((Executor) sVar.f7967b).execute(new t0(sVar, 24));
    }

    public static t a() {
        k kVar = f15183e;
        if (kVar != null) {
            return (t) kVar.f15167f.mo27get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f15183e == null) {
            synchronized (t.class) {
                try {
                    if (f15183e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f15162a = context;
                        f15183e = obj.a();
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
        a2.f386b = "cct";
        j5.a aVar = (j5.a) lVar;
        String str = aVar.f14021a;
        String str2 = aVar.f14022b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f387c = bytes;
        return new r(singleton, a2.e(), this);
    }
}
