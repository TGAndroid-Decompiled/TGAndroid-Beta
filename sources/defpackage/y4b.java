package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class y4b extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final z4b e;

    public y4b(z4b z4bVar, Context context) {
        super(context);
        this.e = z4bVar;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i) {
        FrameLayout frameLayout;
        z4b z4bVar = this.e;
        if (i <= -1) {
            frameLayout = z4bVar.b;
        } else if (i >= 1) {
            frameLayout = z4bVar.f;
        } else {
            frameLayout = z4bVar.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - gl.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z4b z4bVar = this.e;
        RectF rectF = this.a;
        a(rectF, (int) Math.floor(z4bVar.r));
        int ceil = (int) Math.ceil(z4bVar.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f = z4bVar.r;
        float floor = f - ((float) Math.floor(f));
        RectF rectF3 = this.c;
        gl.X1(rectF, rectF2, floor, rectF3);
        int p1 = bkb.p1(0.15f, bm2.f(z4bVar.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
