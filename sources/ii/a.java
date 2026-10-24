package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class a extends View {
    public final Paint f13194a;
    public final Paint f13195b;
    public final Paint f13196c;
    public final RectF d;
    public final g6 e;

    public a(Context context, g6 g6Var) {
        super(context);
        this.e = g6Var;
        Paint paint = new Paint(1);
        this.f13194a = paint;
        Paint paint2 = new Paint(1);
        this.f13195b = paint2;
        Paint paint3 = new Paint(1);
        this.f13196c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(k6.w0(k6.f21184d6, g6Var));
        paint3.setColor(k6.w0(k6.wj, g6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = k6.f21184d6;
        g6 g6Var = this.e;
        int w02 = k6.w0(i10, g6Var);
        Paint paint = this.f13194a;
        paint.setColor(w02);
        int w03 = k6.w0(k6.wj, g6Var);
        Paint paint2 = this.f13196c;
        paint2.setColor(w03);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f13195b);
    }
}
