package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class z6b extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final a7b e;

    public z6b(a7b a7bVar, Activity activity) {
        super(activity);
        this.e = a7bVar;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i) {
        FrameLayout frameLayout;
        a7b a7bVar = this.e;
        if (i <= -1) {
            frameLayout = a7bVar.b;
        } else if (i >= 1) {
            frameLayout = a7bVar.f;
        } else {
            frameLayout = a7bVar.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - gm.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a7b a7bVar = this.e;
        RectF rectF = this.a;
        a(rectF, (int) Math.floor(a7bVar.r));
        int ceil = (int) Math.ceil(a7bVar.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f = a7bVar.r;
        float floor = f - ((float) Math.floor(f));
        RectF rectF3 = this.c;
        gm.X1(rectF, rectF2, floor, rectF3);
        int p1 = cmb.p1(0.15f, on2.f(a7bVar.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
