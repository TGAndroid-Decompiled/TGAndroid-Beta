package lg;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.x;
public final class k implements mg.a {
    public final ViewGroup f15293c;
    public final j d;
    public final ViewGroup f15294e;
    public boolean h;
    public final RectF f15291a = new RectF();
    public final PointF f15292b = new PointF();
    public final RectF f15295f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, j jVar) {
        this.f15293c = viewGroup;
        this.d = jVar;
        this.f15294e = viewGroup2;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f15293c;
        ViewGroup viewGroup2 = this.f15294e;
        PointF pointF = this.f15292b;
        if (!sg.i.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof mg.a) && !this.h) {
            RectF rectF2 = this.f15295f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((mg.a) viewGroup).e(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f15291a;
                if (sg.i.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void g(x xVar, RectF rectF) {
        ViewGroup viewGroup = this.f15293c;
        ViewGroup viewGroup2 = this.f15294e;
        PointF pointF = this.f15292b;
        if (!sg.i.b(viewGroup, viewGroup2, pointF)) {
            xVar.f6956b = true;
        } else if ((viewGroup instanceof mg.a) && !this.h) {
            xVar.c(pointF.x);
            xVar.c(pointF.y);
            RectF rectF2 = this.f15295f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((mg.a) viewGroup).g(xVar, rectF);
            rectF.set(rectF2);
        } else {
            xVar.f6956b = true;
        }
    }
}
