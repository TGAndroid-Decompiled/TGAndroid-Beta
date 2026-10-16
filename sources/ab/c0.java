package ab;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w e = new Object();
    public static final m1.c f379f = w7.s.a(s.f461a);
    public final Context f380a;
    public final kd.h f381b;
    public final AtomicReference f382c;
    public final n4.s d;

    public c0(Context context, kd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f380a = context;
        this.f381b = hVar;
        this.f382c = new AtomicReference();
        e.getClass();
        this.d = new n4.s(3, new qf.b(16, ((k1.z) f379f.a(context, w.f473a[0]).f14848b).f13833c, new md.i(3, null)), this);
        be.f0.q(be.f0.b(hVar), new v(this, null, 0));
    }
}
