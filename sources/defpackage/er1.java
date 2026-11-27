package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class er1 extends dl1 {
    public final zu1 z2;

    public er1(zu1 zu1Var, vnb vnbVar, Context context) {
        super(vnbVar, context, false);
        this.z2 = zu1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        zu1 zu1Var = this.z2;
        if (zu1Var.R8 == null) {
            float y = ((zu1Var.A0.getY() + zu1Var.P9) - getY()) - hl.L(4.0f);
            aVar = ((e) zu1Var).actionBar;
            if (aVar.getVisibility() == 0 || zu1Var.Aa != null) {
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
            zu1 zu1Var = this.z2;
            aVar = ((e) zu1Var).actionBar;
            if (!aVar.z() && !zu1Var.c8()) {
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
            zu1 zu1Var = this.z2;
            aVar = ((e) zu1Var).actionBar;
            if (!aVar.z() && !zu1Var.c8()) {
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
