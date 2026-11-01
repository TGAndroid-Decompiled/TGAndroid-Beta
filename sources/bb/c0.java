package bb;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w e = new Object();
    public static final m1.c f2535f = w7.v.a(s.f2617a);
    public final Context f2536a;
    public final cd.h f2537b;
    public final AtomicReference f2538c;
    public final hf.b d;

    public c0(Context context, cd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f2536a = context;
        this.f2537b = hVar;
        this.f2538c = new AtomicReference();
        e.getClass();
        this.d = new hf.b(6, new u9.b(4, ((k1.z) f2535f.a(context, w.f2628a[0]).f10701a).f10590c, new ed.j(3, null)), this);
        td.e0.q(td.e0.b(hVar), new v(this, null, 0));
    }
}
