package e2;

import android.content.Context;
public final class c implements f9.t {
    public final int f9330a;
    public final Context f9331b;

    public c(Context context, int i3) {
        this.f9330a = i3;
        this.f9331b = context;
    }

    @Override
    public final Object get() {
        switch (this.f9330a) {
            case 0:
                return h.e(this.f9331b);
            case 1:
                return new k2.j(this.f9331b);
            case 2:
                return new w2.q(this.f9331b, new e3.m());
            case 3:
                return new z2.n(this.f9331b, new ra.e(28));
            default:
                return a3.g.c(this.f9331b);
        }
    }
}
