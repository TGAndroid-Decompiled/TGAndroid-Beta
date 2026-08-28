package da;

import b3.b;
import hd.z0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import u8.c;
import y8.d;
import y8.r;
public final class a implements d {
    public static final a f4462b = new a(0);
    public static final a f4463c = new a(1);
    public static final a d = new a(2);
    public static final a f4464e = new a(3);
    public final int f4465a;

    public a(int i9) {
        this.f4465a = i9;
    }

    @Override
    public final Object H1(b bVar) {
        switch (this.f4465a) {
            case 0:
                Object c10 = bVar.c(new r(u8.a.class, Executor.class));
                i.d(c10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c10);
            case 1:
                Object c11 = bVar.c(new r(c.class, Executor.class));
                i.d(c11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c11);
            case 2:
                Object c12 = bVar.c(new r(u8.b.class, Executor.class));
                i.d(c12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c12);
            default:
                Object c13 = bVar.c(new r(u8.d.class, Executor.class));
                i.d(c13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c13);
        }
    }
}
