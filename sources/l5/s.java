package l5;

import android.content.Context;
import com.google.android.gms.internal.play_billing.k3;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.voip.r2;
public final class s {
    public static volatile j e;
    public final u5.a f14601a;
    public final u5.a f14602b;
    public final q5.b f14603c;
    public final ea.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, ea.b bVar2, com.google.firebase.messaging.s sVar) {
        this.f14601a = aVar;
        this.f14602b = aVar2;
        this.f14603c = bVar;
        this.d = bVar2;
        ((Executor) sVar.f6209b).execute(new r2(sVar, 21));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f14586f.mo27get();
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
                        obj.f13764a = context;
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
        androidx.biometric.e a2 = i.a();
        kVar.getClass();
        a2.f1200b = "cct";
        j5.a aVar = (j5.a) kVar;
        String str = aVar.f12842a;
        String str2 = aVar.f12843b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = k3.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f1201c = bytes;
        return new q(singleton, a2.e(), this);
    }
}
