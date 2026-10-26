package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c10;
public final class m extends c10 {
    public final Paint U;
    public final r V;

    public m(r rVar, Context context) {
        super(context, null);
        this.V = rVar;
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
        int w02 = y6.w0(y6.f23356d6, this.V.W.f10017c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
