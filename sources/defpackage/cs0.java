package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class cs0 extends tk4 {
    public final Paint V;
    public final gs0 W;

    public cs0(gs0 gs0Var, Context context) {
        super(context, null);
        this.W = gs0Var;
        this.V = new Paint();
    }

    @Override
    public final int getColumnsCount() {
        return this.W.d;
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int v0 = cmb.v0(cmb.c6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
