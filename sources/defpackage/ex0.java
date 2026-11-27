package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
public final class ex0 extends lx0 {
    public final nx0 I;

    public ex0(nx0 nx0Var, Context context) {
        super(nx0Var, context);
        this.I = nx0Var;
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
            cc4.g(e, true);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new py((byte) 3));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        nx0 nx0Var = this.I;
        nx0Var.h = null;
        nx0Var.c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }
}
