package k9;

import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.s;
import zd.y0;
public final class i implements q9.d, t {
    public static final i f13555b = new i(0);
    public static final i f13556c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final int f13557a;

    public i(int i10) {
        this.f13557a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f13557a) {
            case 0:
                Object m10 = cVar.m(new s(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(m10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m10);
            case 1:
                Object m11 = cVar.m(new s(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(m11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m11);
            case 2:
                Object m12 = cVar.m(new s(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(m12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m12);
            default:
                Object m13 = cVar.m(new s(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(m13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m13);
        }
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f6021a;
        int i11 = status.f6021a;
        String str = status.f6022b;
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
