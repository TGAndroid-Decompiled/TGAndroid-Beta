package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.u00;
public final class m extends u00 {
    public final Paint R;
    public final r S;

    public m(r rVar, Context context) {
        super(context, null);
        this.S = rVar;
        this.R = new Paint();
    }

    @Override
    public final int getColumnsCount() {
        return this.S.d;
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int v02 = j6.v0(j6.f19881d6, this.S.T.f16597c);
        Paint paint = this.R;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
