package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class i33 extends b43 {
    public final byte Q;
    public final FrameLayout R;

    public i33(FrameLayout frameLayout, Context context, byte b) {
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
                return l33.a((l33) frameLayout);
            default:
                return q33.a((q33) frameLayout);
        }
    }

    @Override
    public final int getCurrentWidth() {
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                return l33.b((l33) frameLayout);
            default:
                return q33.b((q33) frameLayout);
        }
    }
}
