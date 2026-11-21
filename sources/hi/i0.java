package hi;

import android.content.Context;
import android.widget.FrameLayout;
public final class i0 extends og.o {
    public final int Q;
    public final FrameLayout R;

    public i0(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.Q) {
            case 0:
                return l0.b((l0) this.R);
            default:
                return o0.b((o0) this.R);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.Q) {
            case 0:
                return l0.a((l0) this.R);
            default:
                return o0.a((o0) this.R);
        }
    }
}
