package dh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q40;
import org.telegram.ui.x91;
public final class k implements eh.a {
    public final ViewGroup f8789c;
    public final q40 d;
    public final ViewGroup f8790e;
    public boolean h;
    public final RectF f8787a = new RectF();
    public final PointF f8788b = new PointF();
    public final RectF f8791f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, q40 q40Var) {
        this.f8789c = viewGroup;
        this.d = q40Var;
        this.f8790e = viewGroup2;
    }

    @Override
    public final void c(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f8789c;
        ViewGroup viewGroup2 = this.f8790e;
        PointF pointF = this.f8788b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f8703a = true;
        } else if ((viewGroup instanceof eh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f8791f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).c(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f8703a = true;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f8789c;
        ViewGroup viewGroup2 = this.f8790e;
        PointF pointF = this.f8788b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof eh.a) && !this.h) {
            RectF rectF2 = this.f8791f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                RectF rectF3 = this.f8787a;
                if (jh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    q40 q40Var = this.d;
                    int i10 = q40Var.f48946a;
                    Object obj = q40Var.f48947b;
                    switch (i10) {
                        case 0:
                            ((pj0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.N) {
                                break;
                            } else {
                                profileActivity.f41689a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((x91) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
