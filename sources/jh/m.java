package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.e00;
public final class m extends e00 {
    public final Paint Q;
    public final q R;

    public m(q qVar, Context context) {
        super(context, null);
        this.R = qVar;
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
        int v02 = f6.v0(f6.f23001d6, this.R.S.f14380c);
        Paint paint = this.Q;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
