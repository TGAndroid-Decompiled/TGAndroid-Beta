package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class do2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final ylb e;

    public do2(Context context, ylb ylbVar) {
        super(context);
        this.e = ylbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(cmb.v0(cmb.c6, ylbVar));
        paint3.setColor(cmb.v0(cmb.mk, ylbVar));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = cmb.c6;
        ylb ylbVar = this.e;
        int v0 = cmb.v0(i, ylbVar);
        Paint paint = this.a;
        paint.setColor(v0);
        int v02 = cmb.v0(cmb.mk, ylbVar);
        Paint paint2 = this.c;
        paint2.setColor(v02);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(gm.L(1.33f), gm.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(gm.N(4.67f), gm.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.b);
    }
}
