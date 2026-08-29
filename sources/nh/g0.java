package nh;

import android.content.Context;
import android.widget.FrameLayout;
public final class g0 extends wf.n {
    public final int L;
    public final FrameLayout M;

    public g0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.L = i10;
        this.M = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.L) {
            case 0:
                return j0.b((j0) this.M);
            default:
                return m0.b((m0) this.M);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.L) {
            case 0:
                return j0.a((j0) this.M);
            default:
                return m0.a((m0) this.M);
        }
    }
}
