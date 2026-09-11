package i2;

import android.content.Context;
public final class d implements d9.j {
    public final int f11474a;
    public final Context f11475b;

    public d(Context context, int i10) {
        this.f11474a = i10;
        this.f11475b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11474a) {
            case 0:
                return c2.d.e(this.f11475b);
            case 1:
                return new m(this.f11475b);
            case 2:
                return new u2.p(this.f11475b, new c3.m());
            case 3:
                return new x2.p(this.f11475b, new rb.a(25));
            default:
                return y2.f.b(this.f11475b);
        }
    }
}
