package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class lf1 extends cja {
    public final nf1 m0;

    public lf1(nf1 nf1Var, Context context) {
        super(context, null);
        this.m0 = nf1Var;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        nf1 nf1Var = this.m0;
        if (nf1Var.w.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, nf1Var.w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, nf1Var.w.getY());
        nf1Var.w.getClass();
        int i = 0;
        while (true) {
            int childCount = nf1Var.w.getChildCount();
            fu fuVar = nf1Var.w;
            if (i < childCount) {
                View childAt = fuVar.getChildAt(i);
                RectF rectF2 = nf1Var.P0;
                if (rectF != null && nf1Var.w != null && childAt != null) {
                    rectF2.set(childAt.getX(), nf1Var.w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), nf1Var.w.getY() + childAt.getY() + childAt.getHeight());
                    z = !rectF2.intersect(rectF);
                } else {
                    z = false;
                }
                if (!z) {
                    if (childAt instanceof gb2) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        gb2 gb2Var = (gb2) childAt;
                        if (gb2Var.L0()) {
                            canvas.save();
                            canvas.translate(0.0f, gb2Var.W);
                            gb2Var.M0(canvas, true, false);
                            canvas.restore();
                        }
                        canvas.restore();
                        nf1Var.w.drawChild(canvas, childAt, uptimeMillis);
                        if (gb2Var.l2()) {
                            canvas.save();
                            canvas.translate(gb2Var.getX(), gb2Var.getY());
                            gb2Var.i1(canvas);
                            canvas.restore();
                        }
                    } else {
                        boolean z2 = childAt instanceof uk1;
                        fu fuVar2 = nf1Var.w;
                        if (z2) {
                            fuVar2.drawChild(canvas, childAt, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt.getX(), childAt.getY());
                            ((uk1) childAt).L(canvas);
                            canvas.restore();
                        } else {
                            fuVar2.drawChild(canvas, childAt, uptimeMillis);
                        }
                    }
                }
                i++;
            } else {
                fuVar.getClass();
                canvas.restore();
                return;
            }
        }
    }
}
