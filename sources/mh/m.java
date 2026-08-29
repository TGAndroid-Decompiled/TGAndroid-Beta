package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p00;
public final class m extends p00 {
    public final Paint Q;
    public final r R;

    public m(r rVar, Context context) {
        super(context, null);
        this.R = rVar;
        this.Q = new Paint();
    }

    @Override
    public final int getColumnsCount() {
        return this.R.d;
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int v02 = g6.v0(g6.f23062d6, this.R.S.f17058c);
        Paint paint = this.Q;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
