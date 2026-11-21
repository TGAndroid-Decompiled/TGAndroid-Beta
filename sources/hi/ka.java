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
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.w60;
public final class ka extends FrameLayout {
    public float f14940a;
    public float f14941b;
    public final Paint f14942c;
    public LinearGradient d;
    public final sa f14943e;

    public ka(sa saVar, Activity activity) {
        super(activity);
        this.f14943e = saVar;
        this.f14942c = new Paint(1);
    }

    public static void a(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f14940a;
        this.f14941b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f14943e.K == 0) {
            setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        sa saVar = this.f14943e;
        if (view == saVar.f15409i0) {
            if (saVar.W) {
                f10 = org.telegram.messenger.g0.f24140m;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f14942c;
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
        ValueAnimator valueAnimator = this.f14943e.F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        sa saVar = this.f14943e;
        if (saVar.W) {
            i13 = saVar.f15382a0;
        } else {
            i13 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        saVar.f15409i0.layout(0, 0, saVar.T, saVar.U);
        saVar.f15409i0.setPivotX(saVar.T * 0.5f);
        FrameLayout frameLayout = saVar.f15412j0;
        frameLayout.layout(0, i13, saVar.T, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = saVar.f15418l0;
        frameLayout2.layout(0, saVar.U - frameLayout2.getMeasuredHeight(), saVar.T, saVar.U);
        FrameLayout frameLayout3 = saVar.f15423n0;
        int i14 = saVar.U;
        frameLayout3.layout(0, i14, saVar.T, frameLayout3.getMeasuredHeight() + i14);
        saVar.m0.layout(0, 0, saVar.T, saVar.U);
        bi.m3 m3Var = saVar.f15445u0;
        if (m3Var != null) {
            m3Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        saVar.f15438s.f15072c.layout(0, 0, measuredWidth, measuredHeight);
        j jVar = saVar.f15394d1.N;
        if (jVar != null) {
            jVar.layout(0, 0, saVar.T, saVar.U);
            saVar.f15394d1.y();
        }
        ee0 ee0Var = saVar.C1;
        if (ee0Var != null) {
            ee0Var.layout(0, 0, ee0Var.getMeasuredWidth(), saVar.C1.getMeasuredHeight());
        }
        u9 u9Var = saVar.f15453w1;
        if (u9Var != null) {
            u9Var.layout(0, 0, u9Var.getMeasuredWidth(), saVar.f15453w1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof w60) {
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
        sa saVar = this.f14943e;
        a(saVar.f15409i0, saVar.T, saVar.U);
        saVar.i();
        a(saVar.f15412j0, saVar.T, org.telegram.messenger.g0.L(150.0f));
        a(saVar.f15418l0, saVar.T, org.telegram.messenger.g0.L(220.0f));
        a(saVar.f15423n0, saVar.T, saVar.V);
        a(saVar.m0, saVar.T, saVar.U);
        a(saVar.f15438s.f15072c, size, size2);
        bi.m3 m3Var = saVar.f15445u0;
        if (m3Var != null) {
            a(m3Var, size, size2);
        }
        j jVar = saVar.f15394d1.N;
        if (jVar != null) {
            a(jVar, saVar.T, saVar.U);
        }
        ee0 ee0Var = saVar.C1;
        if (ee0Var != null) {
            a(ee0Var, size, size2);
        }
        u9 u9Var = saVar.f15453w1;
        if (u9Var != null) {
            a(u9Var, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f14940a = f10;
        super.setTranslationY(this.f14941b + f10);
        float i7 = Utilities.i((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        sa saVar = this.f14943e;
        saVar.L = i7;
        saVar.n();
        saVar.f15422n.invalidate();
        float i10 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.g0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i10);
        setScaleY(i10);
    }
}
