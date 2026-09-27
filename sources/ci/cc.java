package ci;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.y70;
public final class cc extends FrameLayout {
    public float f4482a;
    public float f4483b;
    public final Paint f4484c;
    public LinearGradient d;
    public final kc e;

    public cc(kc kcVar, Activity activity) {
        super(activity);
        this.e = kcVar;
        this.f4484c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f4482a;
        this.f4483b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f7;
        boolean drawChild = super.drawChild(canvas, view, j3);
        kc kcVar = this.e;
        if (view == kcVar.f5006h0) {
            if (kcVar.V) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f4484c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f7, 0.0f, f7 + AndroidUtilities.dp(72.0f), new int[]{1073741824, 0}, new float[]{f7 / (AndroidUtilities.dp(72.0f) + f7), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f7);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        return drawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        kc kcVar = this.e;
        if (kcVar.V) {
            i14 = kcVar.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        kcVar.f5006h0.layout(0, 0, kcVar.S, kcVar.T);
        kcVar.f5006h0.setPivotX(kcVar.S * 0.5f);
        FrameLayout frameLayout = kcVar.f5009i0;
        frameLayout.layout(0, i14, kcVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = kcVar.f5015k0;
        frameLayout2.layout(0, kcVar.T - frameLayout2.getMeasuredHeight(), kcVar.S, kcVar.T);
        FrameLayout frameLayout3 = kcVar.m0;
        int i15 = kcVar.T;
        frameLayout3.layout(0, i15, kcVar.S, frameLayout3.getMeasuredHeight() + i15);
        kcVar.f5018l0.layout(0, 0, kcVar.S, kcVar.T);
        ab abVar = kcVar.f5043t0;
        if (abVar != null) {
            abVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        kcVar.f5039s.f5818c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = kcVar.f4991c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, kcVar.S, kcVar.T);
            kcVar.f4991c1.y();
        }
        tf0 tf0Var = kcVar.B1;
        if (tf0Var != null) {
            tf0Var.layout(0, 0, tf0Var.getMeasuredWidth(), kcVar.B1.getMeasuredHeight());
        }
        mb mbVar = kcVar.f5050v1;
        if (mbVar != null) {
            mbVar.layout(0, 0, mbVar.getMeasuredWidth(), kcVar.f5050v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof y70) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        kc kcVar = this.e;
        a(kcVar.f5006h0, kcVar.S, kcVar.T);
        kcVar.j();
        a(kcVar.f5009i0, kcVar.S, AndroidUtilities.dp(150.0f));
        a(kcVar.f5015k0, kcVar.S, AndroidUtilities.dp(220.0f));
        a(kcVar.m0, kcVar.S, kcVar.U);
        a(kcVar.f5018l0, kcVar.S, kcVar.T);
        a(kcVar.f5039s.f5818c, size, size2);
        ab abVar = kcVar.f5043t0;
        if (abVar != null) {
            a(abVar, size, size2);
        }
        i iVar = kcVar.f4991c1.M;
        if (iVar != null) {
            a(iVar, kcVar.S, kcVar.T);
        }
        tf0 tf0Var = kcVar.B1;
        if (tf0Var != null) {
            a(tf0Var, size, size2);
        }
        mb mbVar = kcVar.f5050v1;
        if (mbVar != null) {
            a(mbVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof y70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f4482a = f7;
        super.setTranslationY(this.f4483b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        kc kcVar = this.e;
        kcVar.K = clamp;
        kcVar.o();
        kcVar.f5022n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
