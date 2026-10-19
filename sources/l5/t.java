package l5;

import android.content.Context;
import com.google.android.gms.internal.play_billing.k3;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.z1;
public final class t {
    public static volatile k e;
    public final u5.a f15942a;
    public final u5.a f15943b;
    public final q5.b f15944c;
    public final ea.b d;

    public t(u5.a aVar, u5.a aVar2, q5.b bVar, ea.b bVar2, com.google.firebase.messaging.r rVar) {
        this.f15942a = aVar;
        this.f15943b = aVar2;
        this.f15944c = bVar;
        this.d = bVar2;
        ((Executor) rVar.f7660b).execute(new z1(rVar, 11));
    }

    public static t a() {
        k kVar = e;
        if (kVar != null) {
            return (t) kVar.f15927f.mo27get();
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
                        obj.f15923a = context;
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
        androidx.biometric.e a2 = i.a();
        lVar.getClass();
        a2.f2815b = "cct";
        j5.a aVar = (j5.a) lVar;
        String str = aVar.f14252a;
        String str2 = aVar.f14253b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = k3.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f2816c = bytes;
        return new r(singleton, a2.e(), this);
    }
}
