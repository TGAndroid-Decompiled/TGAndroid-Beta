package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class a extends View {
    public final Paint f21035a;
    public final Paint f21036b;
    public final Paint f21037c;
    public final RectF d;
    public final h6 f21038e;

    public a(Context context, h6 h6Var) {
        super(context);
        this.f21038e = h6Var;
        Paint paint = new Paint(1);
        this.f21035a = paint;
        Paint paint2 = new Paint(1);
        this.f21036b = paint2;
        Paint paint3 = new Paint(1);
        this.f21037c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(m6.w0(m6.f29381d6, h6Var));
        paint3.setColor(m6.w0(m6.nk, h6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = m6.f29381d6;
        h6 h6Var = this.f21038e;
        int w02 = m6.w0(i7, h6Var);
        Paint paint = this.f21035a;
        paint.setColor(w02);
        int w03 = m6.w0(m6.nk, h6Var);
        Paint paint2 = this.f21037c;
        paint2.setColor(w03);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(g0.L(1.33f), g0.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(g0.N(4.67f), g0.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f21036b);
    }
}
