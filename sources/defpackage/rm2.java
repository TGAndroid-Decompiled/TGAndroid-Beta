package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class rm2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final wjb e;

    public rm2(Context context, wjb wjbVar) {
        super(context);
        this.e = wjbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(bkb.v0(bkb.c6, wjbVar));
        paint3.setColor(bkb.v0(bkb.mk, wjbVar));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = bkb.c6;
        wjb wjbVar = this.e;
        int v0 = bkb.v0(i, wjbVar);
        Paint paint = this.a;
        paint.setColor(v0);
        int v02 = bkb.v0(bkb.mk, wjbVar);
        Paint paint2 = this.c;
        paint2.setColor(v02);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(gl.L(1.33f), gl.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(gl.N(4.67f), gl.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.b);
    }
}
