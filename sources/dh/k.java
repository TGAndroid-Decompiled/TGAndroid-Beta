package dh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n40;
import org.telegram.ui.t91;
public final class k implements eh.a {
    public final ViewGroup f8786c;
    public final n40 d;
    public final ViewGroup f8787e;
    public boolean h;
    public final RectF f8784a = new RectF();
    public final PointF f8785b = new PointF();
    public final RectF f8788f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, n40 n40Var) {
        this.f8786c = viewGroup;
        this.d = n40Var;
        this.f8787e = viewGroup2;
    }

    @Override
    public final void c(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f8786c;
        ViewGroup viewGroup2 = this.f8787e;
        PointF pointF = this.f8785b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f8700a = true;
        } else if ((viewGroup instanceof eh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f8788f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).c(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f8700a = true;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f8786c;
        ViewGroup viewGroup2 = this.f8787e;
        PointF pointF = this.f8785b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof eh.a) && !this.h) {
            RectF rectF2 = this.f8788f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                RectF rectF3 = this.f8784a;
                if (jh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    n40 n40Var = this.d;
                    int i10 = n40Var.f47956a;
                    Object obj = n40Var.f47957b;
                    switch (i10) {
                        case 0:
                            ((pj0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.N) {
                                break;
                            } else {
                                profileActivity.f41687a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((t91) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
