package o9;

import a8.i8;
import a8.r7;
import ab.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import zd.v0;
public final class h implements u9.d, q {
    public static final h f20880b = new h(0);
    public static final h f20881c = new h(1);
    public static final h d = new h(2);
    public static final h f20882e = new h(3);
    public final int f20883a;

    public h(int i7) {
        this.f20883a = i7;
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f20883a) {
            case 0:
                Object e10 = r7Var.e(new u9.q(q9.a.class, Executor.class));
                j.d(e10, "get(...)");
                return new v0((Executor) e10);
            case 1:
                Object e11 = r7Var.e(new u9.q(q9.c.class, Executor.class));
                j.d(e11, "get(...)");
                return new v0((Executor) e11);
            case 2:
                Object e12 = r7Var.e(new u9.q(q9.b.class, Executor.class));
                j.d(e12, "get(...)");
                return new v0((Executor) e12);
            default:
                Object e13 = r7Var.e(new u9.q(q9.d.class, Executor.class));
                j.d(e13, "get(...)");
                return new v0((Executor) e13);
        }
    }

    @Override
    public Exception f(Status status) {
        int i7 = status.f6529a;
        int i10 = status.f6529a;
        String str = status.f6530b;
        if (i7 == 8) {
            if (str == null) {
                str = i8.a(i10);
            }
            return new a0(str);
        }
        if (str == null) {
            str = i8.a(i10);
        }
        return new a0(str);
    }
}
