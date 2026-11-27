package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;
public final class lhc implements yi5 {
    public final ViewGroup c;
    public final hc5 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public lhc(ViewGroup viewGroup, ViewGroup viewGroup2, hc5 hc5Var) {
        this.c = viewGroup;
        this.d = hc5Var;
        this.e = viewGroup2;
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!yic.b(viewGroup, viewGroup2, pointF)) {
            qebVar.b = true;
        } else if ((viewGroup instanceof yi5) && !this.h) {
            qebVar.c(pointF.x);
            qebVar.c(pointF.y);
            RectF rectF2 = this.f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((yi5) viewGroup).a(qebVar, rectF);
            rectF.set(rectF2);
        } else {
            qebVar.b = true;
        }
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!yic.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof yi5) && !this.h) {
            RectF rectF2 = this.f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((yi5) viewGroup).g(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                RectF rectF3 = this.a;
                if (yic.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    hc5 hc5Var = this.d;
                    byte b = hc5Var.a;
                    Object obj = hc5Var.b;
                    switch (b) {
                        case 0:
                            ((d79) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            RectF rectF4 = ProfileActivity.Z6;
                            if (childAt != profileActivity.O) {
                                profileActivity.a.drawChild(canvas, childAt, uptimeMillis);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            ((ezb) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
