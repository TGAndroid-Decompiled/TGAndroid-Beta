package i2;

import android.content.Context;
public final class d implements d9.j {
    public final int f11625a;
    public final Context f11626b;

    public d(Context context, int i10) {
        this.f11625a = i10;
        this.f11626b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11625a) {
            case 0:
                return c2.d.e(this.f11626b);
            case 1:
                return new l(this.f11626b);
            case 2:
                return new u2.p(this.f11626b, new c3.m());
            case 3:
                return new x2.p(this.f11626b, new Object());
            default:
                return y2.f.b(this.f11626b);
        }
    }
}
