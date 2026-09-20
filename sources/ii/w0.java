package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class w0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f11701a;
    public final Paint f11702b;
    public a f11703c;

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f11702b = new Paint();
        this.f11701a = f6Var;
        e();
    }

    @Override
    public final void e() {
        this.f11702b.setColor(j6.v0(j6.Fk, this.f11701a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11703c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f11702b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
