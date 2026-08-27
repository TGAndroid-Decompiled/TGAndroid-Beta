package ea;

import af.h;
import id.z0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v8.b;
import v8.c;
import z8.d;
import z8.q;

public final class a implements d {

    public static final a f5359b = new a(0);

    public static final a f5360c = new a(1);
    public static final a d = new a(2);

    public static final a f5361e = new a(3);

    public final int f5362a;

    public a(int i10) {
        this.f5362a = i10;
    }

    @Override
    public final Object u0(h hVar) {
        switch (this.f5362a) {
            case 0:
                Object objB = hVar.b(new q(v8.a.class, Executor.class));
                j.d(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB);
            case 1:
                Object objB2 = hVar.b(new q(c.class, Executor.class));
                j.d(objB2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB2);
            case 2:
                Object objB3 = hVar.b(new q(b.class, Executor.class));
                j.d(objB3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB3);
            default:
                Object objB4 = hVar.b(new q(v8.d.class, Executor.class));
                j.d(objB4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB4);
        }
    }
}
