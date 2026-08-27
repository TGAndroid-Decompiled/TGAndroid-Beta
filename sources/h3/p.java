package h3;

import android.content.Context;

public final class p implements o8.i {

    public final int f8053a;

    public final Context f8054b;

    public p(Context context, int i10) {
        this.f8053a = i10;
        this.f8054b = context;
    }

    @Override
    public final Object get() {
        switch (this.f8053a) {
            case 0:
                return new l(this.f8054b);
            case 1:
                return new j4.l(this.f8054b, new m3.i());
            case 2:
                return new b5.q(this.f8054b, new ab.a(3));
            default:
                return com.google.android.exoplayer2.upstream.u.b(this.f8054b);
        }
    }
}
