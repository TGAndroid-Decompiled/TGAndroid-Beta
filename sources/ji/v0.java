package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f14261a;
    public final Paint f14262b;
    public a f14263c;

    public v0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14262b = new Paint();
        this.f14261a = f6Var;
        d();
    }

    @Override
    public final void d() {
        this.f14262b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fk, this.f14261a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f14263c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f14262b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
