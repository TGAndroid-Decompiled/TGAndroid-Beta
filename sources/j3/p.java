package j3;

import android.content.Context;
public final class p implements p8.i {
    public final int f10660a;
    public final Context f10661b;

    public p(Context context, int i10) {
        this.f10660a = i10;
        this.f10661b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10660a) {
            case 0:
                return new l(this.f10661b);
            case 1:
                return new l4.l(this.f10661b, new o3.i());
            case 2:
                return new d5.p(this.f10661b, new ab.b(5));
            default:
                return com.google.android.exoplayer2.upstream.u.b(this.f10661b);
        }
    }
}
