package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class b43 extends u43 {
    public final byte Q;
    public final FrameLayout R;

    public b43(FrameLayout frameLayout, Context context, byte b) {
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
                return e43.b((e43) frameLayout);
            default:
                return j43.b((j43) frameLayout);
        }
    }

    @Override
    public final int getCurrentWidth() {
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                return e43.a((e43) frameLayout);
            default:
                return j43.a((j43) frameLayout);
        }
    }
}
