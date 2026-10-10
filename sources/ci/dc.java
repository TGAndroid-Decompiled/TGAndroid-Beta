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
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.o80;
public final class dc extends FrameLayout {
    public float f4978a;
    public float f4979b;
    public final Paint f4980c;
    public LinearGradient d;
    public final lc f4981e;

    public dc(lc lcVar, Activity activity) {
        super(activity);
        this.f4981e = lcVar;
        this.f4980c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f4978a;
        this.f4979b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.f4981e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f7;
        boolean drawChild = super.drawChild(canvas, view, j3);
        lc lcVar = this.f4981e;
        if (view == lcVar.f5483h0) {
            if (lcVar.V) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f4980c;
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
        ValueAnimator valueAnimator = this.f4981e.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        lc lcVar = this.f4981e;
        if (lcVar.V) {
            i14 = lcVar.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        lcVar.f5483h0.layout(0, 0, lcVar.S, lcVar.T);
        lcVar.f5483h0.setPivotX(lcVar.S * 0.5f);
        FrameLayout frameLayout = lcVar.f5486i0;
        frameLayout.layout(0, i14, lcVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = lcVar.f5492k0;
        frameLayout2.layout(0, lcVar.T - frameLayout2.getMeasuredHeight(), lcVar.S, lcVar.T);
        FrameLayout frameLayout3 = lcVar.m0;
        int i15 = lcVar.T;
        frameLayout3.layout(0, i15, lcVar.S, frameLayout3.getMeasuredHeight() + i15);
        lcVar.f5495l0.layout(0, 0, lcVar.S, lcVar.T);
        bb bbVar = lcVar.f5520t0;
        if (bbVar != null) {
            bbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        lcVar.f5516s.f6185c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = lcVar.f5467c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, lcVar.S, lcVar.T);
            lcVar.f5467c1.y();
        }
        mg0 mg0Var = lcVar.B1;
        if (mg0Var != null) {
            mg0Var.layout(0, 0, mg0Var.getMeasuredWidth(), lcVar.B1.getMeasuredHeight());
        }
        nb nbVar = lcVar.f5527v1;
        if (nbVar != null) {
            nbVar.layout(0, 0, nbVar.getMeasuredWidth(), lcVar.f5527v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof o80) {
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
        lc lcVar = this.f4981e;
        a(lcVar.f5483h0, lcVar.S, lcVar.T);
        lcVar.i();
        a(lcVar.f5486i0, lcVar.S, AndroidUtilities.dp(150.0f));
        a(lcVar.f5492k0, lcVar.S, AndroidUtilities.dp(220.0f));
        a(lcVar.m0, lcVar.S, lcVar.U);
        a(lcVar.f5495l0, lcVar.S, lcVar.T);
        a(lcVar.f5516s.f6185c, size, size2);
        bb bbVar = lcVar.f5520t0;
        if (bbVar != null) {
            a(bbVar, size, size2);
        }
        i iVar = lcVar.f5467c1.M;
        if (iVar != null) {
            a(iVar, lcVar.S, lcVar.T);
        }
        mg0 mg0Var = lcVar.B1;
        if (mg0Var != null) {
            a(mg0Var, size, size2);
        }
        nb nbVar = lcVar.f5527v1;
        if (nbVar != null) {
            a(nbVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof o80) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f4978a = f7;
        super.setTranslationY(this.f4979b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        lc lcVar = this.f4981e;
        lcVar.K = clamp;
        lcVar.n();
        lcVar.f5499n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
