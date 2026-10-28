package ch;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import jh.k;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.af1;
import org.telegram.ui.k60;
public final class j implements dh.a {
    public final ViewGroup f6362c;
    public final k60 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF f6360a = new RectF();
    public final PointF f6361b = new PointF();
    public final RectF f6363f = new RectF();

    public j(ViewGroup viewGroup, ViewGroup viewGroup2, k60 k60Var) {
        this.f6362c = viewGroup;
        this.d = k60Var;
        this.e = viewGroup2;
    }

    @Override
    public final void b(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.f6362c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f6361b;
        if (!k.b(viewGroup, viewGroup2, pointF)) {
            aVar.f6296a = true;
        } else if ((viewGroup instanceof dh.a) && !this.h) {
            aVar.c(pointF.x);
            aVar.c(pointF.y);
            RectF rectF2 = this.f6363f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((dh.a) viewGroup).b(aVar, rectF);
            rectF.set(rectF2);
        } else {
            aVar.f6296a = true;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f6362c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f6361b;
        if (!k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof dh.a) && !this.h) {
            RectF rectF2 = this.f6363f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((dh.a) viewGroup).f(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f6360a;
                if (k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    k60 k60Var = this.d;
                    int i11 = k60Var.f40667a;
                    Object obj = k60Var.f40668b;
                    switch (i11) {
                        case 0:
                            ((nm0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.N) {
                                break;
                            } else {
                                profileActivity.f35972a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((af1) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }
}
