package k9;

import bi.u6;
import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.r;
import zd.y0;
public final class i implements q9.d, t {
    public static final i f12399b = new i(0);
    public static final i f12400c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final int f12401a;

    public i(int i10) {
        this.f12401a = i10;
    }

    @Override
    public Object P1(u6 u6Var) {
        switch (this.f12401a) {
            case 0:
                Object h = u6Var.h(new r(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h);
            case 1:
                Object h10 = u6Var.h(new r(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h10);
            case 2:
                Object h11 = u6Var.h(new r(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(h11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h11);
            default:
                Object h12 = u6Var.h(new r(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(h12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h12);
        }
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f4796a;
        int i11 = status.f4796a;
        String str = status.f4797b;
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
