package ja;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w f11310e = new Object();
    public static final m1.c f11311f = i7.x.a(s.f11400a);
    public final Context f11312a;
    public final sc.h f11313b;
    public final AtomicReference f11314c;
    public final g9.l d;

    public c0(Context context, sc.h hVar) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f11312a = context;
        this.f11313b = hVar;
        this.f11314c = new AtomicReference();
        f11310e.getClass();
        this.d = new g9.l(new g9.l(((k1.a0) f11311f.a(context, w.f11411a[0]).f50799b).f13250c, new uc.i(3, null), false, 23), this, false, 13);
        jd.e0.q(jd.e0.b(hVar), new v(this, null, 0));
    }
}
