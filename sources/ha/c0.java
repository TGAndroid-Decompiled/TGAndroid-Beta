package ha;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class c0 implements t {
    public static final w f10275e = new Object();
    public static final m1.c f10276f = g7.o.a(s.f10365a);
    public final Context f10277a;
    public final qc.h f10278b;
    public final AtomicReference f10279c;
    public final g5.b d;

    public c0(Context context, qc.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f10277a = context;
        this.f10278b = hVar;
        this.f10279c = new AtomicReference();
        f10275e.getClass();
        this.d = new g5.b(7, new g5.b(15, ((k1.z) f10276f.a(context, w.f10376a[0]).f281b).f14512c, new sc.i(3, null)), this);
        hd.f0.q(hd.f0.b(hVar), new v(this, null, 0));
    }
}
