package c2;

import android.content.Context;
public final class d implements d9.u {
    public final int f4122a;
    public final Context f4123b;

    public d(Context context, int i10) {
        this.f4122a = i10;
        this.f4123b = context;
    }

    @Override
    public final Object get() {
        switch (this.f4122a) {
            case 0:
                return i.e(this.f4123b);
            case 1:
                return new i2.k(this.f4123b);
            case 2:
                return new u2.q(this.f4123b, new c3.m());
            case 3:
                return new x2.n(this.f4123b, new oa.d(26));
            default:
                return y2.f.b(this.f4123b);
        }
    }
}
