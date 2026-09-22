package i2;

import android.content.Context;
public final class d implements d9.i {
    public final int f10633a;
    public final Context f10634b;

    public d(Context context, int i10) {
        this.f10633a = i10;
        this.f10634b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10633a) {
            case 0:
                return c2.d.e(this.f10634b);
            case 1:
                return new l(this.f10634b);
            case 2:
                return new u2.p(this.f10634b, new c3.m());
            case 3:
                return new x2.p(this.f10634b, new qb.b(25));
            default:
                return y2.f.b(this.f10634b);
        }
    }
}
