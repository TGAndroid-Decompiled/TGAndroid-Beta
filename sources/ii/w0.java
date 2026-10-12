package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends View implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f12769a;
    public final Paint f12770b;
    public a f12771c;

    public w0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f12770b = new Paint();
        this.f12769a = c6Var;
        e();
    }

    @Override
    public final void e() {
        this.f12770b.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fk, this.f12769a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f12771c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f12770b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
