package c2;

import android.content.Context;
public final class d implements d9.u {
    public final int f4126a;
    public final Context f4127b;

    public d(Context context, int i10) {
        this.f4126a = i10;
        this.f4127b = context;
    }

    @Override
    public final Object get() {
        switch (this.f4126a) {
            case 0:
                return i.e(this.f4127b);
            case 1:
                return new i2.k(this.f4127b);
            case 2:
                return new u2.q(this.f4127b, new c3.m());
            case 3:
                return new x2.n(this.f4127b, new oa.d(26));
            default:
                return y2.f.b(this.f4127b);
        }
    }
}
