package l9;

import be.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.messaging.q;
import java.util.concurrent.Executor;
import r9.r;
public final class i implements r9.d, s {
    public static final i f15968b = new i(0);
    public static final i f15969c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final int f15970a;

    public i(int i10) {
        this.f15970a = i10;
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f6346a;
        int i11 = status.f6346a;
        String str = status.f6347b;
        if (i10 == 8) {
            if (str == null) {
                str = x8.j.a(i11);
            }
            return new q(str);
        }
        if (str == null) {
            str = x8.j.a(i11);
        }
        return new q(str);
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f15970a) {
            case 0:
                Object f7 = z5Var.f(new r(n9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f7);
            case 1:
                Object f10 = z5Var.f(new r(n9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f10);
            case 2:
                Object f11 = z5Var.f(new r(n9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(f11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f11);
            default:
                Object f12 = z5Var.f(new r(n9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(f12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f12);
        }
    }
}
