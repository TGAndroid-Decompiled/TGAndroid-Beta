package o9;

import a8.j8;
import a8.r7;
import ab.b0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import u9.q;
import zd.v0;
public final class h implements u9.d, r {
    public static final h f21793b = new h(0);
    public static final h f21794c = new h(1);
    public static final h d = new h(2);
    public static final h f21795e = new h(3);
    public final int f21796a;

    public h(int i7) {
        this.f21796a = i7;
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f21796a) {
            case 0:
                Object e10 = r7Var.e(new q(q9.a.class, Executor.class));
                j.d(e10, "get(...)");
                return new v0((Executor) e10);
            case 1:
                Object e11 = r7Var.e(new q(q9.c.class, Executor.class));
                j.d(e11, "get(...)");
                return new v0((Executor) e11);
            case 2:
                Object e12 = r7Var.e(new q(q9.b.class, Executor.class));
                j.d(e12, "get(...)");
                return new v0((Executor) e12);
            default:
                Object e13 = r7Var.e(new q(q9.d.class, Executor.class));
                j.d(e13, "get(...)");
                return new v0((Executor) e13);
        }
    }

    @Override
    public Exception k(Status status) {
        int i7 = status.f6223a;
        int i10 = status.f6223a;
        String str = status.f6224b;
        if (i7 == 8) {
            if (str == null) {
                str = j8.a(i10);
            }
            return new b0(str);
        }
        if (str == null) {
            str = j8.a(i10);
        }
        return new b0(str);
    }
}
