package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class ds1 extends cm1 {
    public final yv1 z2;

    public ds1(yv1 yv1Var, ylb ylbVar, Context context) {
        super(ylbVar, context, false);
        this.z2 = yv1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        yv1 yv1Var = this.z2;
        if (yv1Var.R8 == null) {
            float y = ((yv1Var.A0.getY() + yv1Var.P9) - getY()) - gm.L(4.0f);
            aVar = ((d) yv1Var).actionBar;
            if (aVar.getVisibility() == 0 || yv1Var.Aa != null) {
                y -= a.getCurrentActionBarHeight() / 2.0f;
            }
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
            yv1 yv1Var = this.z2;
            aVar = ((d) yv1Var).actionBar;
            if (!aVar.y() && !yv1Var.c8()) {
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
            yv1 yv1Var = this.z2;
            aVar = ((d) yv1Var).actionBar;
            if (!aVar.y() && !yv1Var.c8()) {
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
