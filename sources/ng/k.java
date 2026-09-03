package ng;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.x;
public final class k implements og.a {
    public final ViewGroup f15013c;
    public final j d;
    public final ViewGroup e;
    public boolean h;
    public final RectF f15011a = new RectF();
    public final PointF f15012b = new PointF();
    public final RectF f15014f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, j jVar) {
        this.f15013c = viewGroup;
        this.d = jVar;
        this.e = viewGroup2;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f15013c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f15012b;
        if (!ug.i.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof og.a) && !this.h) {
            RectF rectF2 = this.f15014f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((og.a) viewGroup).e(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f15011a;
                if (ug.i.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void g(x xVar, RectF rectF) {
        ViewGroup viewGroup = this.f15013c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f15012b;
        if (!ug.i.b(viewGroup, viewGroup2, pointF)) {
            xVar.f6327b = true;
        } else if ((viewGroup instanceof og.a) && !this.h) {
            xVar.c(pointF.x);
            xVar.c(pointF.y);
            RectF rectF2 = this.f15014f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((og.a) viewGroup).g(xVar, rectF);
            rectF.set(rectF2);
        } else {
            xVar.f6327b = true;
        }
    }
}
