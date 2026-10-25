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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.i80;
public final class kb extends FrameLayout {
    public float f11135a;
    public float f11136b;
    public final Paint f11137c;
    public LinearGradient d;
    public final sb e;

    public kb(sb sbVar, Activity activity) {
        super(activity);
        this.e = sbVar;
        this.f11137c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f11135a;
        this.f11136b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        boolean drawChild = super.drawChild(canvas, view, j10);
        sb sbVar = this.e;
        if (view == sbVar.f11629h0) {
            if (sbVar.V) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f11137c;
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
        sb sbVar = this.e;
        if (sbVar.V) {
            i14 = sbVar.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sbVar.f11629h0.layout(0, 0, sbVar.S, sbVar.T);
        sbVar.f11629h0.setPivotX(sbVar.S * 0.5f);
        FrameLayout frameLayout = sbVar.f11632i0;
        frameLayout.layout(0, i14, sbVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = sbVar.f11638k0;
        frameLayout2.layout(0, sbVar.T - frameLayout2.getMeasuredHeight(), sbVar.S, sbVar.T);
        FrameLayout frameLayout3 = sbVar.m0;
        int i15 = sbVar.T;
        frameLayout3.layout(0, i15, sbVar.S, frameLayout3.getMeasuredHeight() + i15);
        sbVar.f11641l0.layout(0, 0, sbVar.S, sbVar.T);
        bi.cc ccVar = sbVar.f11666t0;
        if (ccVar != null) {
            ccVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        sbVar.f11662s.f11467c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = sbVar.f11614c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, sbVar.S, sbVar.T);
            sbVar.f11614c1.y();
        }
        eg0 eg0Var = sbVar.B1;
        if (eg0Var != null) {
            eg0Var.layout(0, 0, eg0Var.getMeasuredWidth(), sbVar.B1.getMeasuredHeight());
        }
        ta taVar = sbVar.f11673v1;
        if (taVar != null) {
            taVar.layout(0, 0, taVar.getMeasuredWidth(), sbVar.f11673v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof i80) {
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
        sb sbVar = this.e;
        a(sbVar.f11629h0, sbVar.S, sbVar.T);
        sbVar.i();
        a(sbVar.f11632i0, sbVar.S, AndroidUtilities.dp(150.0f));
        a(sbVar.f11638k0, sbVar.S, AndroidUtilities.dp(220.0f));
        a(sbVar.m0, sbVar.S, sbVar.U);
        a(sbVar.f11641l0, sbVar.S, sbVar.T);
        a(sbVar.f11662s.f11467c, size, size2);
        bi.cc ccVar = sbVar.f11666t0;
        if (ccVar != null) {
            a(ccVar, size, size2);
        }
        i iVar = sbVar.f11614c1.M;
        if (iVar != null) {
            a(iVar, sbVar.S, sbVar.T);
        }
        eg0 eg0Var = sbVar.B1;
        if (eg0Var != null) {
            a(eg0Var, size, size2);
        }
        ta taVar = sbVar.f11673v1;
        if (taVar != null) {
            a(taVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof i80) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f11135a = f7;
        super.setTranslationY(this.f11136b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        sb sbVar = this.e;
        sbVar.K = clamp;
        sbVar.n();
        sbVar.f11645n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
