package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.u60;
public final class la extends FrameLayout {
    public float f14968a;
    public float f14969b;
    public final Paint f14970c;
    public LinearGradient d;
    public final ta f14971e;

    public la(ta taVar, Activity activity) {
        super(activity);
        this.f14971e = taVar;
        this.f14970c = new Paint(1);
    }

    public static void a(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f14968a;
        this.f14969b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f14971e.K == 0) {
            setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        ta taVar = this.f14971e;
        if (view == taVar.f15451i0) {
            if (taVar.W) {
                f10 = org.telegram.messenger.g0.f24115m;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f14970c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f10, 0.0f, f10 + org.telegram.messenger.g0.L(72.0f), new int[]{1073741824, 0}, new float[]{f10 / (org.telegram.messenger.g0.L(72.0f) + f10), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(84.0f) + f10);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
        }
        return drawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.f14971e.F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        ta taVar = this.f14971e;
        if (taVar.W) {
            i13 = taVar.f15424a0;
        } else {
            i13 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        taVar.f15451i0.layout(0, 0, taVar.T, taVar.U);
        taVar.f15451i0.setPivotX(taVar.T * 0.5f);
        FrameLayout frameLayout = taVar.f15454j0;
        frameLayout.layout(0, i13, taVar.T, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = taVar.f15460l0;
        frameLayout2.layout(0, taVar.U - frameLayout2.getMeasuredHeight(), taVar.T, taVar.U);
        FrameLayout frameLayout3 = taVar.f15465n0;
        int i14 = taVar.U;
        frameLayout3.layout(0, i14, taVar.T, frameLayout3.getMeasuredHeight() + i14);
        taVar.m0.layout(0, 0, taVar.T, taVar.U);
        bi.i3 i3Var = taVar.f15487u0;
        if (i3Var != null) {
            i3Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        taVar.f15480s.f15142c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = taVar.f15436d1.N;
        if (iVar != null) {
            iVar.layout(0, 0, taVar.T, taVar.U);
            taVar.f15436d1.y();
        }
        de0 de0Var = taVar.C1;
        if (de0Var != null) {
            de0Var.layout(0, 0, de0Var.getMeasuredWidth(), taVar.C1.getMeasuredHeight());
        }
        v9 v9Var = taVar.f15495w1;
        if (v9Var != null) {
            v9Var.layout(0, 0, v9Var.getMeasuredWidth(), taVar.f15495w1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof u60) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        ta taVar = this.f14971e;
        a(taVar.f15451i0, taVar.T, taVar.U);
        taVar.i();
        a(taVar.f15454j0, taVar.T, org.telegram.messenger.g0.L(150.0f));
        a(taVar.f15460l0, taVar.T, org.telegram.messenger.g0.L(220.0f));
        a(taVar.f15465n0, taVar.T, taVar.V);
        a(taVar.m0, taVar.T, taVar.U);
        a(taVar.f15480s.f15142c, size, size2);
        bi.i3 i3Var = taVar.f15487u0;
        if (i3Var != null) {
            a(i3Var, size, size2);
        }
        i iVar = taVar.f15436d1.N;
        if (iVar != null) {
            a(iVar, taVar.T, taVar.U);
        }
        de0 de0Var = taVar.C1;
        if (de0Var != null) {
            a(de0Var, size, size2);
        }
        v9 v9Var = taVar.f15495w1;
        if (v9Var != null) {
            a(v9Var, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f14968a = f10;
        super.setTranslationY(this.f14969b + f10);
        float i7 = Utilities.i((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        ta taVar = this.f14971e;
        taVar.L = i7;
        taVar.n();
        taVar.f15464n.invalidate();
        float i10 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.g0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i10);
        setScaleY(i10);
    }
}
