package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends View implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f11689a;
    public final Paint f11690b;
    public a f11691c;

    public w0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f11690b = new Paint();
        this.f11689a = d6Var;
        e();
    }

    @Override
    public final void e() {
        this.f11690b.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Fk, this.f11689a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11691c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f11690b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
