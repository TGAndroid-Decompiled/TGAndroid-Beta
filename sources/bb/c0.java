package bb;

import a8.fe;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w e = new Object();
    public static final m1.c f3735f = fe.a(s.f3816a);
    public final Context f3736a;
    public final ld.h f3737b;
    public final AtomicReference f3738c;
    public final rf.b d;

    public c0(Context context, ld.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f3736a = context;
        this.f3737b = hVar;
        this.f3738c = new AtomicReference();
        e.getClass();
        this.d = new rf.b(8, new rf.b(18, ((k1.z) f3735f.a(context, w.f3827a[0]).f15827b).f16110c, new nd.i(3, null)), this);
        ce.f0.q(ce.f0.b(hVar), new v(this, null, 0));
    }
}
