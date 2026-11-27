package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class v71 extends FrameLayout {
    public final d79 a;

    public v71(d79 d79Var, Context context) {
        super(context);
        this.a = d79Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(d79Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
