package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h00;

public final class n extends h00 {
    public final Paint Q;
    public final r R;

    public n(r rVar, Context context) {
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
        int iV0 = g6.v0(g6.f23053d6, this.R.S.f15231c);
        Paint paint = this.Q;
        paint.setColor(iV0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
