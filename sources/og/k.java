package og;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.x;
public final class k implements pg.a {
    public final ViewGroup f16825c;
    public final j d;
    public final ViewGroup f16826e;
    public boolean h;
    public final RectF f16823a = new RectF();
    public final PointF f16824b = new PointF();
    public final RectF f16827f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, j jVar) {
        this.f16825c = viewGroup;
        this.d = jVar;
        this.f16826e = viewGroup2;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f16825c;
        ViewGroup viewGroup2 = this.f16826e;
        PointF pointF = this.f16824b;
        if (!vg.i.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof pg.a) && !this.h) {
            RectF rectF2 = this.f16827f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((pg.a) viewGroup).e(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f16823a;
                if (vg.i.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void g(x xVar, RectF rectF) {
        ViewGroup viewGroup = this.f16825c;
        ViewGroup viewGroup2 = this.f16826e;
        PointF pointF = this.f16824b;
        if (!vg.i.b(viewGroup, viewGroup2, pointF)) {
            xVar.f6800b = true;
        } else if ((viewGroup instanceof pg.a) && !this.h) {
            xVar.c(pointF.x);
            xVar.c(pointF.y);
            RectF rectF2 = this.f16827f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((pg.a) viewGroup).g(xVar, rectF);
            rectF.set(rectF2);
        } else {
            xVar.f6800b = true;
        }
    }
}
