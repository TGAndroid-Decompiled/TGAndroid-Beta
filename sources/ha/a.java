package ha;

import c5.j;
import c9.f;
import c9.u;
import java.util.concurrent.Executor;
import ld.y0;
import y8.b;
import y8.c;
import y8.d;
public final class a implements f {
    public static final a f7035b = new a(0);
    public static final a f7036c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f7037a;

    public a(int i10) {
        this.f7037a = i10;
    }

    @Override
    public final Object d0(j jVar) {
        switch (this.f7037a) {
            case 0:
                Object f10 = jVar.f(new u(y8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f10);
            case 1:
                Object f11 = jVar.f(new u(c.class, Executor.class));
                kotlin.jvm.internal.j.d(f11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f11);
            case 2:
                Object f12 = jVar.f(new u(b.class, Executor.class));
                kotlin.jvm.internal.j.d(f12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f12);
            default:
                Object f13 = jVar.f(new u(d.class, Executor.class));
                kotlin.jvm.internal.j.d(f13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f13);
        }
    }
}
