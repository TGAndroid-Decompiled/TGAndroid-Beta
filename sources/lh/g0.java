package lh;

import android.content.Context;
import android.widget.FrameLayout;

public final class g0 extends uf.n {
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
                return ((j0) this.M).getCurrentHeight();
            default:
                return ((m0) this.M).getCurrentHeight();
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.L) {
            case 0:
                return ((j0) this.M).getCurrentWidth();
            default:
                return ((m0) this.M).getCurrentWidth();
        }
    }
}
