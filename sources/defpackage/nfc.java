package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;
public final class nfc implements vi5 {
    public final ViewGroup c;
    public final ec5 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public nfc(ViewGroup viewGroup, ViewGroup viewGroup2, ec5 ec5Var) {
        this.c = viewGroup;
        this.d = ec5Var;
        this.e = viewGroup2;
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!zgc.b(viewGroup, viewGroup2, pointF)) {
            ucbVar.b = true;
        } else if ((viewGroup instanceof vi5) && !this.h) {
            ucbVar.c(pointF.x);
            ucbVar.c(pointF.y);
            RectF rectF2 = this.f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((vi5) viewGroup).a(ucbVar, rectF);
            rectF.set(rectF2);
        } else {
            ucbVar.b = true;
        }
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!zgc.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof vi5) && !this.h) {
            RectF rectF2 = this.f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((vi5) viewGroup).g(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                RectF rectF3 = this.a;
                if (zgc.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    ec5 ec5Var = this.d;
                    byte b = ec5Var.a;
                    Object obj = ec5Var.b;
                    switch (b) {
                        case 0:
                            ((r59) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            RectF rectF4 = ProfileActivity.e7;
                            if (childAt != profileActivity.O) {
                                profileActivity.a.drawChild(canvas, childAt, uptimeMillis);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            ((dxb) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
