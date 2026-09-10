package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import qg.q0;
public final class s {
    public static volatile j e;
    public final u5.a f12814a;
    public final u5.a f12815b;
    public final q5.b f12816c;
    public final da.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, com.google.firebase.messaging.s sVar) {
        this.f12814a = aVar;
        this.f12815b = aVar2;
        this.f12816c = bVar;
        this.d = bVar2;
        ((Executor) sVar.f6118b).execute(new q0(sVar, 6));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f12799f.mo28get();
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
                        obj.f12361a = context;
                        e = obj.a();
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
        a2.f355b = "cct";
        j5.a aVar = (j5.a) kVar;
        String str = aVar.f11770a;
        String str2 = aVar.f11771b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.i("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f356c = bytes;
        return new q(singleton, a2.e(), this);
    }
}
