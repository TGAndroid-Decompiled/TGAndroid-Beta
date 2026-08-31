package ha;

import c5.j;
import c9.e;
import c9.t;
import java.util.concurrent.Executor;
import ld.y0;
import y8.b;
import y8.c;
import y8.d;
public final class a implements e {
    public static final a f7362b = new a(0);
    public static final a f7363c = new a(1);
    public static final a d = new a(2);
    public static final a f7364e = new a(3);
    public final int f7365a;

    public a(int i10) {
        this.f7365a = i10;
    }

    @Override
    public final Object e0(j jVar) {
        switch (this.f7365a) {
            case 0:
                Object f10 = jVar.f(new t(y8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f10);
            case 1:
                Object f11 = jVar.f(new t(c.class, Executor.class));
                kotlin.jvm.internal.j.d(f11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f11);
            case 2:
                Object f12 = jVar.f(new t(b.class, Executor.class));
                kotlin.jvm.internal.j.d(f12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f12);
            default:
                Object f13 = jVar.f(new t(d.class, Executor.class));
                kotlin.jvm.internal.j.d(f13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f13);
        }
    }
}
