package i2;

import android.content.Context;
public final class d implements d9.j {
    public final int f11500a;
    public final Context f11501b;

    public d(Context context, int i10) {
        this.f11500a = i10;
        this.f11501b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11500a) {
            case 0:
                return c2.d.e(this.f11501b);
            case 1:
                return new m(this.f11501b);
            case 2:
                return new u2.p(this.f11501b, new c3.m());
            case 3:
                return new x2.p(this.f11501b, new rb.a(25));
            default:
                return y2.f.b(this.f11501b);
        }
    }
}
