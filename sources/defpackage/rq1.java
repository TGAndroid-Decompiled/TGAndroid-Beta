package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class rq1 extends uk1 {
    public final mu1 z2;

    public rq1(mu1 mu1Var, wjb wjbVar, Context context) {
        super(wjbVar, context, false);
        this.z2 = mu1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mu1 mu1Var = this.z2;
        if (mu1Var.R8 == null) {
            float y = ((mu1Var.A0.getY() + mu1Var.P9) - getY()) - gl.L(4.0f);
            if (y > 0.0f) {
                if (y < getMeasuredHeight()) {
                    canvas.save();
                    canvas.clipRect(0.0f, y, getMeasuredWidth(), getMeasuredHeight());
                    super.onDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() != 0.0f) {
            mu1 mu1Var = this.z2;
            aVar = ((d) mu1Var).actionBar;
            if (!aVar.y() && !mu1Var.R7()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() != 0.0f) {
            mu1 mu1Var = this.z2;
            aVar = ((d) mu1Var).actionBar;
            if (!aVar.y() && !mu1Var.R7()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f) {
        int i;
        super.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
