package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class cr0 extends tk4 {
    public final Paint V;
    public final gr0 W;

    public cr0(gr0 gr0Var, Context context) {
        super(context, null);
        this.W = gr0Var;
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
        int v0 = aob.v0(aob.d6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
