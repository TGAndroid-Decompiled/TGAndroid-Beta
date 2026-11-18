package dh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q40;
import org.telegram.ui.w91;
public final class k implements eh.a {
    public final ViewGroup f8458c;
    public final q40 d;
    public final ViewGroup f8459e;
    public boolean h;
    public final RectF f8456a = new RectF();
    public final PointF f8457b = new PointF();
    public final RectF f8460f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, q40 q40Var) {
        this.f8458c = viewGroup;
        this.d = q40Var;
        this.f8459e = viewGroup2;
    }

    @Override
    public final void c(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f8458c;
        ViewGroup viewGroup2 = this.f8459e;
        PointF pointF = this.f8457b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f8372a = true;
        } else if ((viewGroup instanceof eh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f8460f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).c(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f8372a = true;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f8458c;
        ViewGroup viewGroup2 = this.f8459e;
        PointF pointF = this.f8457b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof eh.a) && !this.h) {
            RectF rectF2 = this.f8460f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                RectF rectF3 = this.f8456a;
                if (jh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    q40 q40Var = this.d;
                    int i10 = q40Var.f51094a;
                    Object obj = q40Var.f51095b;
                    switch (i10) {
                        case 0:
                            ((ck0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.O) {
                                break;
                            } else {
                                profileActivity.f43508a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((w91) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
