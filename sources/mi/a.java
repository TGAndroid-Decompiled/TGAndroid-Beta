package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class a extends View {
    public final Paint f20643a;
    public final Paint f20644b;
    public final Paint f20645c;
    public final RectF d;
    public final e6 f20646e;

    public a(Context context, e6 e6Var) {
        super(context);
        this.f20646e = e6Var;
        Paint paint = new Paint(1);
        this.f20643a = paint;
        Paint paint2 = new Paint(1);
        this.f20644b = paint2;
        Paint paint3 = new Paint(1);
        this.f20645c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(j6.w0(j6.f28849d6, e6Var));
        paint3.setColor(j6.w0(j6.nk, e6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = j6.f28849d6;
        e6 e6Var = this.f20646e;
        int w02 = j6.w0(i7, e6Var);
        Paint paint = this.f20643a;
        paint.setColor(w02);
        int w03 = j6.w0(j6.nk, e6Var);
        Paint paint2 = this.f20645c;
        paint2.setColor(w03);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(g0.L(1.33f), g0.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(g0.N(4.67f), g0.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f20644b);
    }
}
