package i2;

import android.content.Context;
public final class d implements d9.j {
    public final int f10635a;
    public final Context f10636b;

    public d(Context context, int i10) {
        this.f10635a = i10;
        this.f10636b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10635a) {
            case 0:
                return c2.d.e(this.f10636b);
            case 1:
                return new l(this.f10636b);
            case 2:
                return new u2.p(this.f10636b, new c3.m());
            case 3:
                return new x2.q(this.f10636b, new qb.b(25));
            default:
                return y2.f.b(this.f10636b);
        }
    }
}
