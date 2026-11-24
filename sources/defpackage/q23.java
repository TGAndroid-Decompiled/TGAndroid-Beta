package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class q23 extends j33 {
    public final byte Q;
    public final FrameLayout R;

    public q23(FrameLayout frameLayout, Context context, byte b) {
        super(context);
        this.Q = b;
        this.R = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                return t23.b((t23) frameLayout);
            default:
                return y23.b((y23) frameLayout);
        }
    }

    @Override
    public final int getCurrentWidth() {
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                return t23.a((t23) frameLayout);
            default:
                return y23.a((y23) frameLayout);
        }
    }
}
