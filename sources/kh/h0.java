package kh;

import android.content.Context;
import android.widget.FrameLayout;
public final class h0 extends tf.n {
    public final int L;
    public final FrameLayout M;

    public h0(FrameLayout frameLayout, Context context, int i9) {
        super(context);
        this.L = i9;
        this.M = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.L) {
            case 0:
                return k0.b((k0) this.M);
            default:
                return n0.b((n0) this.M);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.L) {
            case 0:
                return k0.a((k0) this.M);
            default:
                return n0.a((n0) this.M);
        }
    }
}
