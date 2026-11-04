package eh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i40;
import org.telegram.ui.k91;
public final class k implements fh.a {
    public final ViewGroup f10064c;
    public final i40 d;
    public final ViewGroup f10065e;
    public boolean h;
    public final RectF f10062a = new RectF();
    public final PointF f10063b = new PointF();
    public final RectF f10066f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, i40 i40Var) {
        this.f10064c = viewGroup;
        this.d = i40Var;
        this.f10065e = viewGroup2;
    }

    @Override
    public final void b(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f10064c;
        ViewGroup viewGroup2 = this.f10065e;
        PointF pointF = this.f10063b;
        if (!kh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f9978a = true;
        } else if ((viewGroup instanceof fh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f10066f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((fh.a) viewGroup).b(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f9978a = true;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f10064c;
        ViewGroup viewGroup2 = this.f10065e;
        PointF pointF = this.f10063b;
        if (!kh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof fh.a) && !this.h) {
            RectF rectF2 = this.f10066f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((fh.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                RectF rectF3 = this.f10062a;
                if (kh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    i40 i40Var = this.d;
                    int i10 = i40Var.f46105a;
                    Object obj = i40Var.f46106b;
                    switch (i10) {
                        case 0:
                            ((tj0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.O) {
                                break;
                            } else {
                                profileActivity.f41719a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((k91) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
