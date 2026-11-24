package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
public final class ww0 extends dx0 {
    public final fx0 I;

    public ww0(fx0 fx0Var, Context context) {
        super(fx0Var, context);
        this.I = fx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.W(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Exception e) {
            fa4.g(e, true);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new oy((byte) 3));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        fx0 fx0Var = this.I;
        fx0Var.h = null;
        fx0Var.c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }
}
