package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class v81 extends FrameLayout {
    public final r59 a;

    public v81(r59 r59Var, Context context) {
        super(context);
        this.a = r59Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(r59Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
