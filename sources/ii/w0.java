package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends View implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f12755a;
    public final Paint f12756b;
    public a f12757c;

    public w0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f12756b = new Paint();
        this.f12755a = d6Var;
        e();
    }

    @Override
    public final void e() {
        this.f12756b.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fk, this.f12755a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f12757c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f12756b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
