package i2;

import android.content.Context;
public final class d implements d9.i {
    public final int f11576a;
    public final Context f11577b;

    public d(Context context, int i10) {
        this.f11576a = i10;
        this.f11577b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11576a) {
            case 0:
                return c2.d.e(this.f11577b);
            case 1:
                return new l(this.f11577b);
            case 2:
                return new u2.p(this.f11577b, new c3.m());
            case 3:
                return new x2.p(this.f11577b, new qb.b(25));
            default:
                return y2.f.b(this.f11577b);
        }
    }
}
