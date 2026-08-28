package ig;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.x;
public final class k implements jg.a {
    public final ViewGroup f11200c;
    public final j d;
    public final ViewGroup f11201e;
    public boolean h;
    public final RectF f11198a = new RectF();
    public final PointF f11199b = new PointF();
    public final RectF f11202f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, j jVar) {
        this.f11200c = viewGroup;
        this.d = jVar;
        this.f11201e = viewGroup2;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f11200c;
        ViewGroup viewGroup2 = this.f11201e;
        PointF pointF = this.f11199b;
        if (!pg.i.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof jg.a) && !this.h) {
            RectF rectF2 = this.f11202f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((jg.a) viewGroup).e(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
                RectF rectF3 = this.f11198a;
                if (pg.i.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void g(x xVar, RectF rectF) {
        ViewGroup viewGroup = this.f11200c;
        ViewGroup viewGroup2 = this.f11201e;
        PointF pointF = this.f11199b;
        if (!pg.i.b(viewGroup, viewGroup2, pointF)) {
            xVar.f7046b = true;
        } else if ((viewGroup instanceof jg.a) && !this.h) {
            xVar.c(pointF.x);
            xVar.c(pointF.y);
            RectF rectF2 = this.f11202f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((jg.a) viewGroup).g(xVar, rectF);
            rectF.set(rectF2);
        } else {
            xVar.f7046b = true;
        }
    }
}
