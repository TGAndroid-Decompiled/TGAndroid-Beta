package bi;

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
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.u70;
public final class td extends FrameLayout {
    public float f3694a;
    public float f3695b;
    public final Paint f3696c;
    public LinearGradient d;
    public final ce e;

    public td(ce ceVar, Activity activity) {
        super(activity);
        this.e = ceVar;
        this.f3696c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f3694a;
        this.f3695b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f7;
        boolean drawChild = super.drawChild(canvas, view, j3);
        ce ceVar = this.e;
        if (view == ceVar.f2454h0) {
            if (ceVar.V) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f3696c;
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
        ce ceVar = this.e;
        if (ceVar.V) {
            i14 = ceVar.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ceVar.f2454h0.layout(0, 0, ceVar.S, ceVar.T);
        ceVar.f2454h0.setPivotX(ceVar.S * 0.5f);
        FrameLayout frameLayout = ceVar.f2457i0;
        frameLayout.layout(0, i14, ceVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = ceVar.f2463k0;
        frameLayout2.layout(0, ceVar.T - frameLayout2.getMeasuredHeight(), ceVar.S, ceVar.T);
        FrameLayout frameLayout3 = ceVar.m0;
        int i15 = ceVar.T;
        frameLayout3.layout(0, i15, ceVar.S, frameLayout3.getMeasuredHeight() + i15);
        ceVar.f2466l0.layout(0, 0, ceVar.S, ceVar.T);
        nc ncVar = ceVar.f2491t0;
        if (ncVar != null) {
            ncVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ceVar.f2487s.f3078c.layout(0, 0, measuredWidth, measuredHeight);
        k kVar = ceVar.f2439c1.M;
        if (kVar != null) {
            kVar.layout(0, 0, ceVar.S, ceVar.T);
            ceVar.f2439c1.y();
        }
        sf0 sf0Var = ceVar.B1;
        if (sf0Var != null) {
            sf0Var.layout(0, 0, sf0Var.getMeasuredWidth(), ceVar.B1.getMeasuredHeight());
        }
        ad adVar = ceVar.f2498v1;
        if (adVar != null) {
            adVar.layout(0, 0, adVar.getMeasuredWidth(), ceVar.f2498v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof u70) {
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
        ce ceVar = this.e;
        a(ceVar.f2454h0, ceVar.S, ceVar.T);
        ceVar.j();
        a(ceVar.f2457i0, ceVar.S, AndroidUtilities.dp(150.0f));
        a(ceVar.f2463k0, ceVar.S, AndroidUtilities.dp(220.0f));
        a(ceVar.m0, ceVar.S, ceVar.U);
        a(ceVar.f2466l0, ceVar.S, ceVar.T);
        a(ceVar.f2487s.f3078c, size, size2);
        nc ncVar = ceVar.f2491t0;
        if (ncVar != null) {
            a(ncVar, size, size2);
        }
        k kVar = ceVar.f2439c1.M;
        if (kVar != null) {
            a(kVar, ceVar.S, ceVar.T);
        }
        sf0 sf0Var = ceVar.B1;
        if (sf0Var != null) {
            a(sf0Var, size, size2);
        }
        ad adVar = ceVar.f2498v1;
        if (adVar != null) {
            a(adVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof u70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f3694a = f7;
        super.setTranslationY(this.f3695b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        ce ceVar = this.e;
        ceVar.K = clamp;
        ceVar.o();
        ceVar.f2470n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
