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
import org.telegram.ui.Components.t60;
public final class fb extends FrameLayout {
    public float f14508a;
    public float f14509b;
    public final Paint f14510c;
    public LinearGradient d;
    public final nb f14511e;

    public fb(nb nbVar, Activity activity) {
        super(activity);
        this.f14511e = nbVar;
        this.f14510c = new Paint(1);
    }

    public static void a(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f14508a;
        this.f14509b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f14511e.K == 0) {
            setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        nb nbVar = this.f14511e;
        if (view == nbVar.f15082i0) {
            if (nbVar.W) {
                f10 = org.telegram.messenger.g0.f24220m;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f14510c;
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
        ValueAnimator valueAnimator = this.f14511e.F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        nb nbVar = this.f14511e;
        if (nbVar.W) {
            i13 = nbVar.f15055a0;
        } else {
            i13 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        nbVar.f15082i0.layout(0, 0, nbVar.T, nbVar.U);
        nbVar.f15082i0.setPivotX(nbVar.T * 0.5f);
        FrameLayout frameLayout = nbVar.f15085j0;
        frameLayout.layout(0, i13, nbVar.T, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = nbVar.f15091l0;
        frameLayout2.layout(0, nbVar.U - frameLayout2.getMeasuredHeight(), nbVar.T, nbVar.U);
        FrameLayout frameLayout3 = nbVar.f15096n0;
        int i14 = nbVar.U;
        frameLayout3.layout(0, i14, nbVar.T, frameLayout3.getMeasuredHeight() + i14);
        nbVar.m0.layout(0, 0, nbVar.T, nbVar.U);
        bi.o3 o3Var = nbVar.f15118u0;
        if (o3Var != null) {
            o3Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        nbVar.f15111s.f15655c.layout(0, 0, measuredWidth, measuredHeight);
        j jVar = nbVar.f15067d1.N;
        if (jVar != null) {
            jVar.layout(0, 0, nbVar.T, nbVar.U);
            nbVar.f15067d1.y();
        }
        de0 de0Var = nbVar.C1;
        if (de0Var != null) {
            de0Var.layout(0, 0, de0Var.getMeasuredWidth(), nbVar.C1.getMeasuredHeight());
        }
        pa paVar = nbVar.f15126w1;
        if (paVar != null) {
            paVar.layout(0, 0, paVar.getMeasuredWidth(), nbVar.f15126w1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof t60) {
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
        nb nbVar = this.f14511e;
        a(nbVar.f15082i0, nbVar.T, nbVar.U);
        nbVar.i();
        a(nbVar.f15085j0, nbVar.T, org.telegram.messenger.g0.L(150.0f));
        a(nbVar.f15091l0, nbVar.T, org.telegram.messenger.g0.L(220.0f));
        a(nbVar.f15096n0, nbVar.T, nbVar.V);
        a(nbVar.m0, nbVar.T, nbVar.U);
        a(nbVar.f15111s.f15655c, size, size2);
        bi.o3 o3Var = nbVar.f15118u0;
        if (o3Var != null) {
            a(o3Var, size, size2);
        }
        j jVar = nbVar.f15067d1.N;
        if (jVar != null) {
            a(jVar, nbVar.T, nbVar.U);
        }
        de0 de0Var = nbVar.C1;
        if (de0Var != null) {
            a(de0Var, size, size2);
        }
        pa paVar = nbVar.f15126w1;
        if (paVar != null) {
            a(paVar, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f14508a = f10;
        super.setTranslationY(this.f14509b + f10);
        float i7 = Utilities.i((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        nb nbVar = this.f14511e;
        nbVar.L = i7;
        nbVar.n();
        nbVar.f15095n.invalidate();
        float i10 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.g0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i10);
        setScaleY(i10);
    }
}
