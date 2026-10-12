package l9;

import be.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.messaging.r;
import java.util.concurrent.Executor;
public final class i implements r9.d, t {
    public static final i f14633b = new i(0);
    public static final i f14634c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final int f14635a;

    public i(int i10) {
        this.f14635a = i10;
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f4885a;
        int i11 = status.f4885a;
        String str = status.f4886b;
        if (i10 == 8) {
            if (str == null) {
                str = x8.j.a(i11);
            }
            return new r(str);
        }
        if (str == null) {
            str = x8.j.a(i11);
        }
        return new r(str);
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f14635a) {
            case 0:
                Object e7 = z5Var.e(new r9.r(n9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e7);
            case 1:
                Object e10 = z5Var.e(new r9.r(n9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e10);
            case 2:
                Object e11 = z5Var.e(new r9.r(n9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e11);
            default:
                Object e12 = z5Var.e(new r9.r(n9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e12);
        }
    }
}
