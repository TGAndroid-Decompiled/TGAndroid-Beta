package fa;

import a5.j;
import a9.e;
import a9.v;
import java.util.concurrent.Executor;
import jd.y0;
import w8.b;
import w8.c;
import w8.d;
public final class a implements e {
    public static final a f6695b = new a(0);
    public static final a f6696c = new a(1);
    public static final a d = new a(2);
    public static final a f6697e = new a(3);
    public final int f6698a;

    public a(int i10) {
        this.f6698a = i10;
    }

    @Override
    public final Object I0(j jVar) {
        switch (this.f6698a) {
            case 0:
                Object d10 = jVar.d(new v(w8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d10);
            case 1:
                Object d11 = jVar.d(new v(c.class, Executor.class));
                kotlin.jvm.internal.j.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d11);
            case 2:
                Object d12 = jVar.d(new v(b.class, Executor.class));
                kotlin.jvm.internal.j.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d12);
            default:
                Object d13 = jVar.d(new v(d.class, Executor.class));
                kotlin.jvm.internal.j.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d13);
        }
    }
}
