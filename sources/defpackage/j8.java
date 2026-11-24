package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class j8 extends FrameLayout {
    public final Drawable a;

    public j8(int i, ylb ylbVar, Context context) {
        super(context);
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.a7, ylbVar);
        this.a = cmb.V0(getContext(), 2131231233, v02);
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

    public j8(Context context, ylb ylbVar) {
        this(cmb.G8, ylbVar, context);
    }
}
