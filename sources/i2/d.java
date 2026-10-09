package i2;

import android.content.Context;
public final class d implements d9.j {
    public final int f11626a;
    public final Context f11627b;

    public d(Context context, int i10) {
        this.f11626a = i10;
        this.f11627b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11626a) {
            case 0:
                return c2.d.e(this.f11627b);
            case 1:
                return new l(this.f11627b);
            case 2:
                return new u2.p(this.f11627b, new c3.m());
            case 3:
                return new x2.p(this.f11627b, new Object());
            default:
                return y2.f.b(this.f11627b);
        }
    }
}
