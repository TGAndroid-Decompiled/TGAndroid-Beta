package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class rk7 extends FrameLayout {
    public final FrameLayout a;

    public rk7(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, tre.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
