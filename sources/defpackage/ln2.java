package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class ln2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final vnb e;

    public ln2(Context context, vnb vnbVar) {
        super(context);
        this.e = vnbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(aob.v0(aob.d6, vnbVar));
        paint3.setColor(aob.v0(aob.nk, vnbVar));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = aob.d6;
        vnb vnbVar = this.e;
        int v0 = aob.v0(i, vnbVar);
        Paint paint = this.a;
        paint.setColor(v0);
        int v02 = aob.v0(aob.nk, vnbVar);
        Paint paint2 = this.c;
        paint2.setColor(v02);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(hl.L(1.33f), hl.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(hl.N(4.67f), hl.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.b);
    }
}
