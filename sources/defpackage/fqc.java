package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
public final class fqc extends xj3 {
    public final ShapeDrawable H;
    public final uqc I;

    public fqc(uqc uqcVar, Context context) {
        super(context);
        this.I = uqcVar;
        this.H = aob.b0(hl.L(22.0f), uqcVar.getThemedColor(aob.d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(aob.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
