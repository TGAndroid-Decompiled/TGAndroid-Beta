package n9;

import b8.ke;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import java.util.concurrent.Executor;
import l6.m;
import t9.r;
import wd.v0;
public final class i implements t9.d, q {
    public static final i f20304b = new i(0);
    public static final i f20305c = new i(1);
    public static final i d = new i(2);
    public static final i f20306e = new i(3);
    public final int f20307a;

    public i(int i3) {
        this.f20307a = i3;
    }

    @Override
    public Exception o(Status status) {
        int i3 = status.f6581a;
        int i10 = status.f6581a;
        String str = status.f6582b;
        if (i3 == 8) {
            if (str == null) {
                str = z8.c.a(i10);
            }
            return new m(str);
        }
        if (str == null) {
            str = z8.c.a(i10);
        }
        return new m(str);
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f20307a) {
            case 0:
                Object g7 = keVar.g(new r(p9.a.class, Executor.class));
                kotlin.jvm.internal.j.d(g7, "get(...)");
                return new v0((Executor) g7);
            case 1:
                Object g10 = keVar.g(new r(p9.c.class, Executor.class));
                kotlin.jvm.internal.j.d(g10, "get(...)");
                return new v0((Executor) g10);
            case 2:
                Object g11 = keVar.g(new r(p9.b.class, Executor.class));
                kotlin.jvm.internal.j.d(g11, "get(...)");
                return new v0((Executor) g11);
            default:
                Object g12 = keVar.g(new r(p9.d.class, Executor.class));
                kotlin.jvm.internal.j.d(g12, "get(...)");
                return new v0((Executor) g12);
        }
    }
}
