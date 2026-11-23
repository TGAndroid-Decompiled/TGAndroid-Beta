package dh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p40;
import org.telegram.ui.u91;
public final class k implements eh.a {
    public final ViewGroup f8449c;
    public final p40 d;
    public final ViewGroup f8450e;
    public boolean h;
    public final RectF f8447a = new RectF();
    public final PointF f8448b = new PointF();
    public final RectF f8451f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, p40 p40Var) {
        this.f8449c = viewGroup;
        this.d = p40Var;
        this.f8450e = viewGroup2;
    }

    @Override
    public final void c(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f8449c;
        ViewGroup viewGroup2 = this.f8450e;
        PointF pointF = this.f8448b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f8363a = true;
        } else if ((viewGroup instanceof eh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f8451f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).c(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f8363a = true;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f8449c;
        ViewGroup viewGroup2 = this.f8450e;
        PointF pointF = this.f8448b;
        if (!jh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof eh.a) && !this.h) {
            RectF rectF2 = this.f8451f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((eh.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                RectF rectF3 = this.f8447a;
                if (jh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    p40 p40Var = this.d;
                    int i10 = p40Var.f50830a;
                    Object obj = p40Var.f50831b;
                    switch (i10) {
                        case 0:
                            ((ek0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.O) {
                                break;
                            } else {
                                profileActivity.f43634a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((u91) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
