package k9;

import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.r;
import zd.y0;
public final class i implements q9.d, t {
    public static final i f14890b = new i(0);
    public static final i f14891c = new i(1);
    public static final i d = new i(2);
    public static final i f14892e = new i(3);
    public final int f14893a;

    public i(int i10) {
        this.f14893a = i10;
    }

    @Override
    public Object D(cf.c cVar) {
        switch (this.f14893a) {
            case 0:
                Object i10 = cVar.i(new r(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(i10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i10);
            case 1:
                Object i11 = cVar.i(new r(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(i11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i11);
            case 2:
                Object i12 = cVar.i(new r(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(i12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i12);
            default:
                Object i13 = cVar.i(new r(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(i13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i13);
        }
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f4973a;
        int i11 = status.f4973a;
        String str = status.f4974b;
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
