package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import bi.ec;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.sd0;
public final class na extends FrameLayout {
    public float f12500a;
    public float f12501b;
    public final Paint f12502c;
    public LinearGradient d;
    public final va f12503e;

    public na(va vaVar, Activity activity) {
        super(activity);
        this.f12503e = vaVar;
        this.f12502c = new Paint(1);
    }

    public static void a(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f12500a;
        this.f12501b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f12503e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        va vaVar = this.f12503e;
        if (view == vaVar.f12961h0) {
            if (vaVar.V) {
                f10 = org.telegram.messenger.g0.f22561m;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f12502c;
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
        ValueAnimator valueAnimator = this.f12503e.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        va vaVar = this.f12503e;
        if (vaVar.V) {
            i13 = vaVar.Z;
        } else {
            i13 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        vaVar.f12961h0.layout(0, 0, vaVar.S, vaVar.T);
        vaVar.f12961h0.setPivotX(vaVar.S * 0.5f);
        FrameLayout frameLayout = vaVar.f12964i0;
        frameLayout.layout(0, i13, vaVar.S, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = vaVar.f12970k0;
        frameLayout2.layout(0, vaVar.T - frameLayout2.getMeasuredHeight(), vaVar.S, vaVar.T);
        FrameLayout frameLayout3 = vaVar.m0;
        int i14 = vaVar.T;
        frameLayout3.layout(0, i14, vaVar.S, frameLayout3.getMeasuredHeight() + i14);
        vaVar.f12973l0.layout(0, 0, vaVar.S, vaVar.T);
        ec ecVar = vaVar.f12997t0;
        if (ecVar != null) {
            ecVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        vaVar.f12993s.f12578c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = vaVar.f12946c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, vaVar.S, vaVar.T);
            vaVar.f12946c1.y();
        }
        sd0 sd0Var = vaVar.B1;
        if (sd0Var != null) {
            sd0Var.layout(0, 0, sd0Var.getMeasuredWidth(), vaVar.B1.getMeasuredHeight());
        }
        x9 x9Var = vaVar.f13004v1;
        if (x9Var != null) {
            x9Var.layout(0, 0, x9Var.getMeasuredWidth(), vaVar.f13004v1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof i60) {
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
        va vaVar = this.f12503e;
        a(vaVar.f12961h0, vaVar.S, vaVar.T);
        vaVar.i();
        a(vaVar.f12964i0, vaVar.S, org.telegram.messenger.g0.L(150.0f));
        a(vaVar.f12970k0, vaVar.S, org.telegram.messenger.g0.L(220.0f));
        a(vaVar.m0, vaVar.S, vaVar.U);
        a(vaVar.f12973l0, vaVar.S, vaVar.T);
        a(vaVar.f12993s.f12578c, size, size2);
        ec ecVar = vaVar.f12997t0;
        if (ecVar != null) {
            a(ecVar, size, size2);
        }
        i iVar = vaVar.f12946c1.M;
        if (iVar != null) {
            a(iVar, vaVar.S, vaVar.T);
        }
        sd0 sd0Var = vaVar.B1;
        if (sd0Var != null) {
            a(sd0Var, size, size2);
        }
        x9 x9Var = vaVar.f13004v1;
        if (x9Var != null) {
            a(x9Var, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof i60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f12500a = f10;
        super.setTranslationY(this.f12501b + f10);
        float i7 = Utilities.i((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        va vaVar = this.f12503e;
        vaVar.K = i7;
        vaVar.n();
        vaVar.f12977n.invalidate();
        float i10 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.g0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i10);
        setScaleY(i10);
    }
}
