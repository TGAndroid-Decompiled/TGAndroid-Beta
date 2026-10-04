package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends View implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f12708a;
    public final Paint f12709b;
    public a f12710c;

    public w0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f12709b = new Paint();
        this.f12708a = d6Var;
        e();
    }

    @Override
    public final void e() {
        this.f12709b.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Fk, this.f12708a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f12710c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f12709b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
