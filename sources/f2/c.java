package f2;

import android.content.Context;
import g9.u;
public final class c implements u {
    public final int f10896a;
    public final Context f10897b;

    public c(Context context, int i7) {
        this.f10896a = i7;
        this.f10897b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10896a) {
            case 0:
                return i.d(this.f10897b);
            case 1:
                return new l2.j(this.f10897b);
            case 2:
                return new x2.p(this.f10897b, new f3.m());
            case 3:
                return new a3.s(this.f10897b, new nb.a(1));
            default:
                return b3.g.c(this.f10897b);
        }
    }
}
