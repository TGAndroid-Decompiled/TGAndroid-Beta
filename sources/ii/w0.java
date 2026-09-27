package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f11692a;
    public final Paint f11693b;
    public a f11694c;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f11693b = new Paint();
        this.f11692a = e6Var;
        e();
    }

    @Override
    public final void e() {
        this.f11693b.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Fk, this.f11692a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11694c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f11693b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
