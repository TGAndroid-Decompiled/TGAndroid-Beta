package hi;

import android.content.Context;
import android.widget.FrameLayout;
public final class g0 extends og.o {
    public final int Q;
    public final FrameLayout R;

    public g0(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.Q) {
            case 0:
                return j0.b((j0) this.R);
            default:
                return n0.b((n0) this.R);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.Q) {
            case 0:
                return j0.a((j0) this.R);
            default:
                return n0.a((n0) this.R);
        }
    }
}
