package bh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
public final class l implements ch.a {
    public final ViewGroup f4424c;
    public final k d;
    public final ViewGroup e;
    public boolean h;
    public final RectF f4422a = new RectF();
    public final PointF f4423b = new PointF();
    public final RectF f4425f = new RectF();

    public l(ViewGroup viewGroup, ViewGroup viewGroup2, k kVar) {
        this.f4424c = viewGroup;
        this.d = kVar;
        this.e = viewGroup2;
    }

    @Override
    public final void e(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f4424c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f4423b;
        if (!ih.j.b(viewGroup, viewGroup2, pointF)) {
            aVar.f4356a = true;
        } else if ((viewGroup instanceof ch.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f4425f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ch.a) viewGroup).e(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f4356a = true;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f4424c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f4423b;
        if (!ih.j.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof ch.a) && !this.h) {
            RectF rectF2 = this.f4425f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ch.a) viewGroup).f(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f4422a;
                if (ih.j.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }
}
