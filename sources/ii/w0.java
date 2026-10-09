package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f12756a;
    public final Paint f12757b;
    public a f12758c;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12757b = new Paint();
        this.f12756a = e6Var;
        e();
    }

    @Override
    public final void e() {
        this.f12757b.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Fk, this.f12756a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f12758c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f12757b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
