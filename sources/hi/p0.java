package hi;

import android.content.Context;
import android.widget.FrameLayout;
public final class p0 extends og.o {
    public final int Q;
    public final FrameLayout R;

    public p0(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.Q) {
            case 0:
                return s0.b((s0) this.R);
            default:
                return w0.b((w0) this.R);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.Q) {
            case 0:
                return s0.a((s0) this.R);
            default:
                return w0.a((w0) this.R);
        }
    }
}
