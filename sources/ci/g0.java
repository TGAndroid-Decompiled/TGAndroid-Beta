package ci;

import android.content.Context;
import android.widget.FrameLayout;
public final class g0 extends lg.p {
    public final int P;
    public final FrameLayout Q;

    public g0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.P) {
            case 0:
                return i0.b((i0) this.Q);
            default:
                return l0.b((l0) this.Q);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.P) {
            case 0:
                return i0.a((i0) this.Q);
            default:
                return l0.a((l0) this.Q);
        }
    }
}
