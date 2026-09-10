package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f9972a;
    public final Paint f9973b;
    public a f9974c;

    public y0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9973b = new Paint();
        this.f9972a = f6Var;
        e();
    }

    @Override
    public final void e() {
        this.f9973b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fk, this.f9972a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f9974c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f9973b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
