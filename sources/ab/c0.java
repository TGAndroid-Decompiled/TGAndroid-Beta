package ab;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w e = new Object();
    public static final m1.c f377f = w7.s.a(s.f459a);
    public final Context f378a;
    public final kd.h f379b;
    public final AtomicReference f380c;
    public final n4.s d;

    public c0(Context context, kd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f378a = context;
        this.f379b = hVar;
        this.f380c = new AtomicReference();
        e.getClass();
        this.d = new n4.s(3, new qf.b(14, ((k1.z) f377f.a(context, w.f471a[0]).f14830b).f14632c, new md.i(3, null)), this);
        be.f0.q(be.f0.b(hVar), new v(this, null, 0));
    }
}
