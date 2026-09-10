package i2;

import android.content.Context;
public final class d implements d9.i {
    public final int f10117a;
    public final Context f10118b;

    public d(Context context, int i10) {
        this.f10117a = i10;
        this.f10118b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10117a) {
            case 0:
                return c2.d.e(this.f10118b);
            case 1:
                return new l(this.f10118b);
            case 2:
                return new u2.q(this.f10118b, new c3.m());
            case 3:
                return new x2.p(this.f10118b, new Object());
            default:
                return y2.f.b(this.f10118b);
        }
    }
}
