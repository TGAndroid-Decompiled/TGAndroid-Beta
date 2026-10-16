package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v0 extends View implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f13571a;
    public final Paint f13572b;
    public a f13573c;

    public v0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13572b = new Paint();
        this.f13571a = c6Var;
        d();
    }

    @Override
    public final void d() {
        this.f13572b.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Fk, this.f13571a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f13573c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f13572b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
