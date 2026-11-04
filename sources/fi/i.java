package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.iz;
public final class i extends iz {
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
        int w02 = k6.w0(k6.f27878d6, this.W.f11616a0.f11633c);
        Paint paint = this.V;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
