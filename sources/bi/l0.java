package bi;

import android.content.Context;
import android.widget.FrameLayout;
public final class l0 extends kg.p {
    public final int P;
    public final FrameLayout Q;

    public l0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.P) {
            case 0:
                return n0.b((n0) this.Q);
            default:
                return q0.b((q0) this.Q);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.P) {
            case 0:
                return n0.a((n0) this.Q);
            default:
                return q0.a((q0) this.Q);
        }
    }
}
