package jg;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.y;

public final class k implements kg.a {

    public final ViewGroup f13012c;
    public final j d;

    public final ViewGroup f13013e;
    public boolean h;

    public final RectF f13010a = new RectF();

    public final PointF f13011b = new PointF();

    public final RectF f13014f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, j jVar) {
        this.f13012c = viewGroup;
        this.d = jVar;
        this.f13013e = viewGroup2;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f13012c;
        ViewGroup viewGroup2 = this.f13013e;
        PointF pointF = this.f13011b;
        if (qg.j.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof kg.a) || this.h) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    RectF rectF2 = this.f13010a;
                    if (qg.j.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        this.d.a(canvas, childAt, jUptimeMillis);
                    }
                }
            } else {
                RectF rectF3 = this.f13014f;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((kg.a) viewGroup).e(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }

    @Override
    public final void g(y yVar, RectF rectF) {
        ViewGroup viewGroup = this.f13012c;
        ViewGroup viewGroup2 = this.f13013e;
        PointF pointF = this.f13011b;
        if (!qg.j.b(viewGroup, viewGroup2, pointF)) {
            yVar.f6327b = true;
            return;
        }
        if (!(viewGroup instanceof kg.a) || this.h) {
            yVar.f6327b = true;
            return;
        }
        yVar.c(pointF.x);
        yVar.c(pointF.y);
        RectF rectF2 = this.f13014f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((kg.a) viewGroup).g(yVar, rectF);
        rectF.set(rectF2);
    }
}
