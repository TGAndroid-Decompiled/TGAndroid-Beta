package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class fta extends vic {
    public final wua W;

    public fta(wua wuaVar, Context context) {
        super(context, null);
        this.W = wuaVar;
    }

    @Override
    public final void G(View view, float f) {
        View view2;
        mx4 mx4Var;
        mx4 mx4Var2;
        hta htaVar;
        hta htaVar2;
        hta htaVar3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f);
            return;
        }
        float i = Utilities.i(f / getMeasuredWidth(), 1.0f, -1.0f);
        wua wuaVar = this.W;
        view.setTranslationX(((-i) * 2.0f * wuaVar.u0) + f);
        float f2 = 0.0f;
        if (i <= 0.0f) {
            f2 = view.getMeasuredWidth();
        }
        view.setPivotX(f2);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i));
        view.setRotationY(i * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                mx4Var = wuaVar.X1;
                if (mx4Var != null && view2 == mx4Var.T1 && (htaVar3 = mx4Var.Z1) != null) {
                    htaVar3.invalidate();
                }
                if (view2 == wuaVar.T1 && (htaVar2 = wuaVar.Z1) != null) {
                    htaVar2.invalidate();
                }
                mx4Var2 = wuaVar.Y1;
                if (mx4Var2 == null && view2 == mx4Var2.T1 && (htaVar = mx4Var2.Z1) != null) {
                    htaVar.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        mx4Var = wuaVar.X1;
        if (mx4Var != null) {
            htaVar3.invalidate();
        }
        if (view2 == wuaVar.T1) {
            htaVar2.invalidate();
        }
        mx4Var2 = wuaVar.Y1;
        if (mx4Var2 == null) {
        }
    }

    @Override
    public final void H() {
        super.H();
        int i = this.b;
        wua wuaVar = this.W;
        boolean z = false;
        if (i != wuaVar.C1(false)) {
            if (this.b > wuaVar.C1(false)) {
                z = true;
            }
            hl.c3(new q38((byte) 19, this, z));
        }
    }

    @Override
    public final boolean c(MotionEvent motionEvent) {
        yta ytaVar = this.W.W2;
        if (ytaVar != null && !ytaVar.c(0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        wua wuaVar = this.W;
        canvas.clipRect(wuaVar.u0, -getHeight(), getWidth() - wuaVar.u0, getHeight() << 1);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.u0 << 1));
    }
}
