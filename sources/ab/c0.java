package ab;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w e = new Object();
    public static final m1.c f375f = w7.t.a(s.f457a);
    public final Context f376a;
    public final kd.h f377b;
    public final AtomicReference f378c;
    public final n4.s d;

    public c0(Context context, kd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f376a = context;
        this.f377b = hVar;
        this.f378c = new AtomicReference();
        e.getClass();
        this.d = new n4.s(3, new qf.b(16, ((k1.z) f375f.a(context, w.f469a[0]).f14503b).f13830c, new md.i(3, null)), this);
        be.f0.q(be.f0.b(hVar), new v(this, null, 0));
    }
}
