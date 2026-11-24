package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
public final class slc extends fj3 {
    public final ShapeDrawable H;
    public final hmc I;

    public slc(hmc hmcVar, Context context) {
        super(context);
        this.I = hmcVar;
        this.H = bkb.b0(gl.L(22.0f), hmcVar.getThemedColor(bkb.c6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(bkb.c6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
