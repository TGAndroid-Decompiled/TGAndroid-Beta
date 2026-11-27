package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class uf1 extends wma {
    public final wf1 g0;

    public uf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.g0 = wf1Var;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        wf1 wf1Var = this.g0;
        if (wf1Var.w.a1()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, wf1Var.w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, wf1Var.w.getY());
        wf1Var.w.getClass();
        int i = 0;
        while (true) {
            int childCount = wf1Var.w.getChildCount();
            gu guVar = wf1Var.w;
            if (i < childCount) {
                View childAt = guVar.getChildAt(i);
                RectF rectF2 = wf1Var.P0;
                if (rectF != null && wf1Var.w != null && childAt != null) {
                    rectF2.set(childAt.getX(), wf1Var.w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), wf1Var.w.getY() + childAt.getY() + childAt.getHeight());
                    z = !rectF2.intersect(rectF);
                } else {
                    z = false;
                }
                if (!z) {
                    if (childAt instanceof wb2) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        wb2 wb2Var = (wb2) childAt;
                        if (wb2Var.L0()) {
                            canvas.save();
                            canvas.translate(0.0f, wb2Var.W);
                            wb2Var.M0(canvas, true, false);
                            canvas.restore();
                        }
                        canvas.restore();
                        wf1Var.w.drawChild(canvas, childAt, uptimeMillis);
                        if (wb2Var.l2()) {
                            canvas.save();
                            canvas.translate(wb2Var.getX(), wb2Var.getY());
                            wb2Var.i1(canvas);
                            canvas.restore();
                        }
                    } else {
                        boolean z2 = childAt instanceof dl1;
                        gu guVar2 = wf1Var.w;
                        if (z2) {
                            guVar2.drawChild(canvas, childAt, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt.getX(), childAt.getY());
                            ((dl1) childAt).K(canvas);
                            canvas.restore();
                        } else {
                            guVar2.drawChild(canvas, childAt, uptimeMillis);
                        }
                    }
                }
                i++;
            } else {
                guVar.getClass();
                canvas.restore();
                return;
            }
        }
    }
}
