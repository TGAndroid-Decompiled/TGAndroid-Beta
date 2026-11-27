package defpackage;

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
public final class jbb extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final rbb e;

    public jbb(rbb rbbVar, Activity activity) {
        super(activity);
        this.e = rbbVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    public final void b(float f) {
        float f2 = this.a;
        this.b = f;
        super.setTranslationY(f2 + f);
    }

    public final void c() {
        if (!this.e.K) {
            setBackground(aob.b0(hl.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        boolean drawChild = super.drawChild(canvas, view, j);
        rbb rbbVar = this.e;
        if (view == rbbVar.i0) {
            if (rbbVar.W) {
                f = hl.m;
            } else {
                f = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f, 0.0f, f + hl.L(72.0f), new int[]{1073741824, 0}, new float[]{f / (hl.L(72.0f) + f), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), hl.L(84.0f) + f);
            canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
        }
        return drawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        rbb rbbVar = this.e;
        if (rbbVar.W) {
            i5 = rbbVar.a0;
        } else {
            i5 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        rbbVar.i0.layout(0, 0, rbbVar.T, rbbVar.U);
        rbbVar.i0.setPivotX(rbbVar.T * 0.5f);
        FrameLayout frameLayout = rbbVar.j0;
        frameLayout.layout(0, i5, rbbVar.T, frameLayout.getMeasuredHeight() + i5);
        FrameLayout frameLayout2 = rbbVar.l0;
        frameLayout2.layout(0, rbbVar.U - frameLayout2.getMeasuredHeight(), rbbVar.T, rbbVar.U);
        FrameLayout frameLayout3 = rbbVar.n0;
        int i6 = rbbVar.U;
        frameLayout3.layout(0, i6, rbbVar.T, frameLayout3.getMeasuredHeight() + i6);
        rbbVar.m0.layout(0, 0, rbbVar.T, rbbVar.U);
        nf9 nf9Var = rbbVar.u0;
        if (nf9Var != null) {
            nf9Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        rbbVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        mb1 mb1Var = rbbVar.d1.N;
        if (mb1Var != null) {
            mb1Var.layout(0, 0, rbbVar.T, rbbVar.U);
            rbbVar.d1.y();
        }
        c98 c98Var = rbbVar.C1;
        if (c98Var != null) {
            c98Var.layout(0, 0, c98Var.getMeasuredWidth(), rbbVar.C1.getMeasuredHeight());
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            vabVar.layout(0, 0, vabVar.getMeasuredWidth(), rbbVar.w1.getMeasuredHeight());
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof bu5) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        rbb rbbVar = this.e;
        a(rbbVar.i0, rbbVar.T, rbbVar.U);
        rbbVar.g();
        a(rbbVar.j0, rbbVar.T, hl.L(150.0f));
        a(rbbVar.l0, rbbVar.T, hl.L(220.0f));
        a(rbbVar.n0, rbbVar.T, rbbVar.V);
        a(rbbVar.m0, rbbVar.T, rbbVar.U);
        a(rbbVar.s.c, size, size2);
        nf9 nf9Var = rbbVar.u0;
        if (nf9Var != null) {
            a(nf9Var, size, size2);
        }
        mb1 mb1Var = rbbVar.d1.N;
        if (mb1Var != null) {
            a(mb1Var, rbbVar.T, rbbVar.U);
        }
        c98 c98Var = rbbVar.C1;
        if (c98Var != null) {
            a(c98Var, size, size2);
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            a(vabVar, size, size2);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof bu5) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f) {
        this.a = f;
        super.setTranslationY(this.b + f);
        float i = Utilities.i((f / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        rbb rbbVar = this.e;
        rbbVar.L = i;
        rbbVar.l();
        rbbVar.n.invalidate();
        float i2 = 1.0f - (Utilities.i(getTranslationY() / hl.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i2);
        setScaleY(i2);
    }
}
