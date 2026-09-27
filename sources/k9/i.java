package k9;

import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.r;
import zd.y0;
public final class i implements q9.d, t {
    public static final i f13543b = new i(0);
    public static final i f13544c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final int f13545a;

    public i(int i10) {
        this.f13545a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f13545a) {
            case 0:
                Object h = cVar.h(new r(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h);
            case 1:
                Object h10 = cVar.h(new r(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h10);
            case 2:
                Object h11 = cVar.h(new r(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(h11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h11);
            default:
                Object h12 = cVar.h(new r(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(h12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h12);
        }
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f6006a;
        int i11 = status.f6006a;
        String str = status.f6007b;
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
