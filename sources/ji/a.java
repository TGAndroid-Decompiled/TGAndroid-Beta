package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class a extends View {
    public final Paint f15968a;
    public final Paint f15969b;
    public final Paint f15970c;
    public final RectF d;
    public final u6 e;

    public a(Context context, u6 u6Var) {
        super(context);
        this.e = u6Var;
        Paint paint = new Paint(1);
        this.f15968a = paint;
        Paint paint2 = new Paint(1);
        this.f15969b = paint2;
        Paint paint3 = new Paint(1);
        this.f15970c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(y6.w0(y6.f23357d6, u6Var));
        paint3.setColor(y6.w0(y6.wj, u6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = y6.f23357d6;
        u6 u6Var = this.e;
        int w02 = y6.w0(i10, u6Var);
        Paint paint = this.f15968a;
        paint.setColor(w02);
        int w03 = y6.w0(y6.wj, u6Var);
        Paint paint2 = this.f15970c;
        paint2.setColor(w03);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f15969b);
    }
}
