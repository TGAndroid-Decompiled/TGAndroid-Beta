package i2;

import android.content.Context;
public final class d implements d9.i {
    public final int f10621a;
    public final Context f10622b;

    public d(Context context, int i10) {
        this.f10621a = i10;
        this.f10622b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10621a) {
            case 0:
                return c2.d.e(this.f10622b);
            case 1:
                return new l(this.f10622b);
            case 2:
                return new u2.p(this.f10622b, new c3.m());
            case 3:
                return new x2.p(this.f10622b, new qb.b(25));
            default:
                return y2.f.b(this.f10622b);
        }
    }
}
