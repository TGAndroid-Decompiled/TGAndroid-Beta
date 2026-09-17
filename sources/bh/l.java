package bh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
public final class l implements ch.a {
    public final ViewGroup f2722c;
    public final k d;
    public final ViewGroup f2723e;
    public boolean h;
    public final RectF f2720a = new RectF();
    public final PointF f2721b = new PointF();
    public final RectF f2724f = new RectF();

    public l(ViewGroup viewGroup, ViewGroup viewGroup2, k kVar) {
        this.f2722c = viewGroup;
        this.d = kVar;
        this.f2723e = viewGroup2;
    }

    @Override
    public final void e(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f2722c;
        ViewGroup viewGroup2 = this.f2723e;
        PointF pointF = this.f2721b;
        if (!ih.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f2648a = true;
        } else if ((viewGroup instanceof ch.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f2724f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ch.a) viewGroup).e(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f2648a = true;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f2722c;
        ViewGroup viewGroup2 = this.f2723e;
        PointF pointF = this.f2721b;
        if (!ih.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof ch.a) && !this.h) {
            RectF rectF2 = this.f2724f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ch.a) viewGroup).f(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f2720a;
                if (ih.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }
}
