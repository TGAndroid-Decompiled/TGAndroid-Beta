package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.f10;
public final class m extends f10 {
    public final Paint U;
    public final t V;

    public m(t tVar, Context context) {
        super(context, null);
        this.V = tVar;
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
        int w02 = g6.w0(g6.f19901d6, this.V.W.f4798c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
