package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class x8b extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final y8b e;

    public x8b(y8b y8bVar, Activity activity) {
        super(activity);
        this.e = y8bVar;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i) {
        FrameLayout frameLayout;
        y8b y8bVar = this.e;
        if (i <= -1) {
            frameLayout = y8bVar.b;
        } else if (i >= 1) {
            frameLayout = y8bVar.f;
        } else {
            frameLayout = y8bVar.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - hl.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y8b y8bVar = this.e;
        RectF rectF = this.a;
        a(rectF, (int) Math.floor(y8bVar.r));
        int ceil = (int) Math.ceil(y8bVar.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f = y8bVar.r;
        float floor = f - ((float) Math.floor(f));
        RectF rectF3 = this.c;
        hl.X1(rectF, rectF2, floor, rectF3);
        int p1 = aob.p1(0.15f, vm2.f(y8bVar.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
