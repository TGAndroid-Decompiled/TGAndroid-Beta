package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a10;
public final class s extends a10 {
    public final Paint U;
    public final a0 V;

    public s(a0 a0Var, Context context) {
        super(context, null);
        this.V = a0Var;
        this.U = new Paint();
    }

    @Override
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int v02 = j6.v0(j6.f17928d6, this.V.W.f444c);
        Paint paint = this.U;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
