package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class j8 extends FrameLayout {
    public final Drawable a;

    public j8(int i, wjb wjbVar, Context context) {
        super(context);
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.a7, wjbVar);
        this.a = bkb.V0(getContext(), 2131231232, v02);
        setBackgroundColor(v0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i) {
        setBackgroundColor(i);
    }

    public j8(Context context, wjb wjbVar) {
        this(bkb.G8, wjbVar, context);
    }
}
