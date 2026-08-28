package h3;

import android.content.Context;
public final class p implements n8.i {
    public final int f9623a;
    public final Context f9624b;

    public p(Context context, int i9) {
        this.f9623a = i9;
        this.f9624b = context;
    }

    @Override
    public final Object get() {
        switch (this.f9623a) {
            case 0:
                return new l(this.f9624b);
            case 1:
                return new j4.m(this.f9624b, new m3.i());
            case 2:
                return new b5.r(this.f9624b, new wa.a(3));
            default:
                return com.google.android.exoplayer2.upstream.u.b(this.f9624b);
        }
    }
}
