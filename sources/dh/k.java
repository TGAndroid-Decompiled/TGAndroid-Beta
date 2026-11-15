package dh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n40;
import org.telegram.ui.s91;
public final class k implements eh.a {
    public final ViewGroup f8173c;
    public final n40 d;
    public final ViewGroup f8174e;
    public boolean h;
    public final RectF f8171a = new RectF();
    public final PointF f8172b = new PointF();
    public final RectF f8175f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, n40 n40Var) {
        this.f8173c = viewGroup;
        this.d = n40Var;
        this.f8174e = viewGroup2;
    }

    @Override
    public final void c(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f8173c;
        ViewGroup viewGroup2 = this.f8174e;
        PointF pointF = this.f8172b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f8087a = true;
        } else if ((viewGroup instanceof eh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f8175f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).c(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f8087a = true;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f8173c;
        ViewGroup viewGroup2 = this.f8174e;
        PointF pointF = this.f8172b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof eh.a) && !this.h) {
            RectF rectF2 = this.f8175f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                RectF rectF3 = this.f8171a;
                if (jh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    n40 n40Var = this.d;
                    int i10 = n40Var.f49442a;
                    Object obj = n40Var.f49443b;
                    switch (i10) {
                        case 0:
                            ((uj0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.O) {
                                break;
                            } else {
                                profileActivity.f43062a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((s91) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
