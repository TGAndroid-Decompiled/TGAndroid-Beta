package ia;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class d0 implements u {

    public static final x f10992e = new x();

    public static final m1.c f10993f = h7.o.a(t.f11077a);

    public final Context f10994a;

    public final rc.h f10995b;

    public final AtomicReference f10996c;
    public final g5.b d;

    public d0(Context context, rc.h hVar) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f10994a = context;
        this.f10995b = hVar;
        this.f10996c = new AtomicReference();
        f10992e.getClass();
        int i10 = 17;
        this.d = new g5.b(10, new g5.b(i10, ((k1.z) f10993f.a(context, x.f11088a[0]).f18088b).f14333c, new z(3, null)), this);
        id.f0.q(id.f0.b(hVar), new w(this, null, 0));
    }
}
