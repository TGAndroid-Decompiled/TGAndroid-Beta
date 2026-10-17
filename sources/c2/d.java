package c2;

import android.content.Context;
public final class d implements d9.u {
    public final int f4496a;
    public final Context f4497b;

    public d(Context context, int i10) {
        this.f4496a = i10;
        this.f4497b = context;
    }

    @Override
    public final Object get() {
        switch (this.f4496a) {
            case 0:
                return i.e(this.f4497b);
            case 1:
                return new i2.j(this.f4497b);
            case 2:
                return new u2.q(this.f4497b, new c3.m());
            case 3:
                return new x2.n(this.f4497b, new oa.d(26));
            default:
                return y2.f.b(this.f4497b);
        }
    }
}
