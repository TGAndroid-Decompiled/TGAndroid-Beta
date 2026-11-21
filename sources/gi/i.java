package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.yz;
public final class i extends yz {
    public final Paint V;
    public final m W;

    public i(m mVar, Context context) {
        super(context, null);
        this.W = mVar;
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
        int w02 = m6.w0(m6.f29378d6, this.W.f13678a0.f13695c);
        Paint paint = this.V;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
