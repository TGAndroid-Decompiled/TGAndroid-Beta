package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.mz;
public final class j extends mz {
    public final Paint U;
    public final n V;

    public j(n nVar, Context context) {
        super(context, null);
        this.V = nVar;
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
        int w02 = k6.w0(k6.f27852d6, this.V.W.f10846c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
