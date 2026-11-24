package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class n71 extends FrameLayout {
    public final o39 a;

    public n71(o39 o39Var, Context context) {
        super(context);
        this.a = o39Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(o39Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
