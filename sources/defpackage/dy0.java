package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
public final class dy0 extends ky0 {
    public final my0 I;

    public dy0(my0 my0Var, Context context) {
        super(my0Var, context);
        this.I = my0Var;
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
            fc4.g(e, true);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new oz((byte) 3));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        my0 my0Var = this.I;
        my0Var.h = null;
        my0Var.c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }
}
