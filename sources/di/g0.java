package di;

import android.content.Context;
import android.widget.FrameLayout;
public final class g0 extends mg.q {
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
                return j0.b((j0) this.Q);
            default:
                return m0.b((m0) this.Q);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.P) {
            case 0:
                return j0.a((j0) this.Q);
            default:
                return m0.a((m0) this.Q);
        }
    }
}
