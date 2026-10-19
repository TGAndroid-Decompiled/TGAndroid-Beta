package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
public final class v0 extends View implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f15567a;
    public final Paint f15568b;
    public a f15569c;

    public v0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f15568b = new Paint();
        this.f15567a = d6Var;
        d();
    }

    @Override
    public final void d() {
        this.f15568b.setColor(h6.w0(h6.Fk, this.f15567a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f15569c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f15568b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
