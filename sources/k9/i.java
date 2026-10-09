package k9;

import ae.a1;
import cc.k;
import ci.u5;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.r;
public final class i implements q9.d, t {
    public static final i f14755b = new i(0);
    public static final i f14756c = new i(1);
    public static final i d = new i(2);
    public static final i f14757e = new i(3);
    public final int f14758a;

    public i(int i10) {
        this.f14758a = i10;
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f6525a;
        int i11 = status.f6525a;
        String str = status.f6526b;
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

    @Override
    public Object y0(u5 u5Var) {
        switch (this.f14758a) {
            case 0:
                Object g10 = u5Var.g(new r(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g10);
            case 1:
                Object g11 = u5Var.g(new r(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(g11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g11);
            case 2:
                Object g12 = u5Var.g(new r(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(g12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g12);
            default:
                Object g13 = u5Var.g(new r(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(g13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g13);
        }
    }
}
