package i2;

import android.content.Context;
public final class d implements d9.j {
    public final int f11624a;
    public final Context f11625b;

    public d(Context context, int i10) {
        this.f11624a = i10;
        this.f11625b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11624a) {
            case 0:
                return c2.d.e(this.f11625b);
            case 1:
                return new l(this.f11625b);
            case 2:
                return new u2.p(this.f11625b, new c3.m());
            case 3:
                return new x2.p(this.f11625b, new na.d(26));
            default:
                return y2.f.b(this.f11625b);
        }
    }
}
