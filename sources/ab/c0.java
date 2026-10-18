package ab;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w e = new Object();
    public static final m1.c f378f = w7.s.a(s.f460a);
    public final Context f379a;
    public final kd.h f380b;
    public final AtomicReference f381c;
    public final n4.s d;

    public c0(Context context, kd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f379a = context;
        this.f380b = hVar;
        this.f381c = new AtomicReference();
        e.getClass();
        this.d = new n4.s(3, new qf.b(14, ((k1.z) f378f.a(context, w.f472a[0]).f14566b).f14635c, new md.i(3, null)), this);
        be.f0.q(be.f0.b(hVar), new v(this, null, 0));
    }
}
