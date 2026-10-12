package ah;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
public final class n implements bh.a {
    public final ViewGroup f617c;
    public final m d;
    public final ViewGroup f618e;
    public boolean h;
    public final RectF f615a = new RectF();
    public final PointF f616b = new PointF();
    public final RectF f619f = new RectF();

    public n(ViewGroup viewGroup, ViewGroup viewGroup2, m mVar) {
        this.f617c = viewGroup;
        this.d = mVar;
        this.f618e = viewGroup2;
    }

    @Override
    public final void b(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f617c;
        ViewGroup viewGroup2 = this.f618e;
        PointF pointF = this.f616b;
        if (!hh.j.b(viewGroup, viewGroup2, pointF)) {
            aVar.f538a = true;
        } else if ((viewGroup instanceof bh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f619f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((bh.a) viewGroup).b(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f538a = true;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f617c;
        ViewGroup viewGroup2 = this.f618e;
        PointF pointF = this.f616b;
        if (!hh.j.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof bh.a) && !this.h) {
            RectF rectF2 = this.f619f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((bh.a) viewGroup).f(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f615a;
                if (hh.j.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }
}
