package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class fpa extends wec {
    public final vqa W;

    public fpa(vqa vqaVar, Context context) {
        super(context, null);
        this.W = vqaVar;
    }

    @Override
    public final void F(View view, float f) {
        View view2;
        hv4 hv4Var;
        hv4 hv4Var2;
        hpa hpaVar;
        hpa hpaVar2;
        hpa hpaVar3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f);
            return;
        }
        float i = Utilities.i(f / getMeasuredWidth(), 1.0f, -1.0f);
        vqa vqaVar = this.W;
        view.setTranslationX(((-i) * 2.0f * vqaVar.u0) + f);
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
                hv4Var = vqaVar.X1;
                if (hv4Var != null && view2 == hv4Var.T1 && (hpaVar3 = hv4Var.Z1) != null) {
                    hpaVar3.invalidate();
                }
                if (view2 == vqaVar.T1 && (hpaVar2 = vqaVar.Z1) != null) {
                    hpaVar2.invalidate();
                }
                hv4Var2 = vqaVar.Y1;
                if (hv4Var2 == null && view2 == hv4Var2.T1 && (hpaVar = hv4Var2.Z1) != null) {
                    hpaVar.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        hv4Var = vqaVar.X1;
        if (hv4Var != null) {
            hpaVar3.invalidate();
        }
        if (view2 == vqaVar.T1) {
            hpaVar2.invalidate();
        }
        hv4Var2 = vqaVar.Y1;
        if (hv4Var2 == null) {
        }
    }

    @Override
    public final void G() {
        super.G();
        int i = this.b;
        vqa vqaVar = this.W;
        boolean z = false;
        if (i != vqaVar.B1(false)) {
            if (this.b > vqaVar.B1(false)) {
                z = true;
            }
            gl.c3(new k08((byte) 19, this, z));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        vqa vqaVar = this.W;
        canvas.clipRect(vqaVar.u0, -getHeight(), getWidth() - vqaVar.u0, getHeight() << 1);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean g(MotionEvent motionEvent) {
        xpa xpaVar = this.W.W2;
        if (xpaVar != null && !xpaVar.c(0)) {
            return false;
        }
        return true;
    }

    @Override
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.u0 << 1));
    }
}
