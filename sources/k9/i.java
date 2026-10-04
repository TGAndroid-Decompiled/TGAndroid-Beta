package k9;

import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.r;
import zd.y0;
public final class i implements q9.d, t {
    public static final i f14723b = new i(0);
    public static final i f14724c = new i(1);
    public static final i d = new i(2);
    public static final i f14725e = new i(3);
    public final int f14726a;

    public i(int i10) {
        this.f14726a = i10;
    }

    @Override
    public Object E(cf.c cVar) {
        switch (this.f14726a) {
            case 0:
                Object g10 = cVar.g(new r(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g10);
            case 1:
                Object g11 = cVar.g(new r(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(g11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g11);
            case 2:
                Object g12 = cVar.g(new r(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(g12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g12);
            default:
                Object g13 = cVar.g(new r(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(g13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g13);
        }
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f6473a;
        int i11 = status.f6473a;
        String str = status.f6474b;
        if (i10 == 8) {
            if (str == null) {
                str = x8.j.a(i11);
            }
            return new k(str);
        }
        if (str == null) {
            str = x8.j.a(i11);
        }
        return new k(str);
    }
}
