package ah;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
public final class o implements bh.a {
    public final ViewGroup f488c;
    public final n d;
    public final ViewGroup e;
    public boolean h;
    public final RectF f486a = new RectF();
    public final PointF f487b = new PointF();
    public final RectF f489f = new RectF();

    public o(ViewGroup viewGroup, ViewGroup viewGroup2, n nVar) {
        this.f488c = viewGroup;
        this.d = nVar;
        this.e = viewGroup2;
    }

    @Override
    public final void b(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f488c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f487b;
        if (!hh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f414a = true;
        } else if ((viewGroup instanceof bh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f489f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((bh.a) viewGroup).b(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f414a = true;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f488c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f487b;
        if (!hh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof bh.a) && !this.h) {
            RectF rectF2 = this.f489f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((bh.a) viewGroup).f(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f486a;
                if (hh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }
}
