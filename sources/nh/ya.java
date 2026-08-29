package nh;

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
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.h70;
public final class ya extends FrameLayout {
    public float f18912a;
    public float f18913b;
    public final Paint f18914c;
    public LinearGradient d;
    public final gb f18915e;

    public ya(gb gbVar, Activity activity) {
        super(activity);
        this.f18915e = gbVar;
        this.f18914c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f9) {
        float f10 = this.f18912a;
        this.f18913b = f9;
        super.setTranslationY(f10 + f9);
    }

    public final void c() {
        if (this.f18915e.F == 0) {
            setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f9;
        boolean drawChild = super.drawChild(canvas, view, j10);
        gb gbVar = this.f18915e;
        if (view == gbVar.f17747d0) {
            if (gbVar.R) {
                f9 = AndroidUtilities.statusBarHeight;
            } else {
                f9 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f18914c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f9, 0.0f, f9 + AndroidUtilities.dp(72.0f), new int[]{1073741824, 0}, new float[]{f9 / (AndroidUtilities.dp(72.0f) + f9), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f9);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        return drawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.f18915e.A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        gb gbVar = this.f18915e;
        if (gbVar.R) {
            i14 = gbVar.V;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        gbVar.f17747d0.layout(0, 0, gbVar.O, gbVar.P);
        gbVar.f17747d0.setPivotX(gbVar.O * 0.5f);
        FrameLayout frameLayout = gbVar.f17751e0;
        frameLayout.layout(0, i14, gbVar.O, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = gbVar.f17758g0;
        frameLayout2.layout(0, gbVar.P - frameLayout2.getMeasuredHeight(), gbVar.O, gbVar.P);
        FrameLayout frameLayout3 = gbVar.f17764i0;
        int i15 = gbVar.P;
        frameLayout3.layout(0, i15, gbVar.O, frameLayout3.getMeasuredHeight() + i15);
        gbVar.f17761h0.layout(0, 0, gbVar.O, gbVar.P);
        cg.h0 h0Var = gbVar.f17784p0;
        if (h0Var != null) {
            h0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        gbVar.f17794s.f18332c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = gbVar.Y0.I;
        if (iVar != null) {
            iVar.layout(0, 0, gbVar.O, gbVar.P);
            gbVar.Y0.y();
        }
        ef0 ef0Var = gbVar.f17813x1;
        if (ef0Var != null) {
            ef0Var.layout(0, 0, ef0Var.getMeasuredWidth(), gbVar.f17813x1.getMeasuredHeight());
        }
        ja jaVar = gbVar.f17792r1;
        if (jaVar != null) {
            jaVar.layout(0, 0, jaVar.getMeasuredWidth(), gbVar.f17792r1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof h70) {
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
        gb gbVar = this.f18915e;
        a(gbVar.f17747d0, gbVar.O, gbVar.P);
        gbVar.j();
        a(gbVar.f17751e0, gbVar.O, AndroidUtilities.dp(150.0f));
        a(gbVar.f17758g0, gbVar.O, AndroidUtilities.dp(220.0f));
        a(gbVar.f17764i0, gbVar.O, gbVar.Q);
        a(gbVar.f17761h0, gbVar.O, gbVar.P);
        a(gbVar.f17794s.f18332c, size, size2);
        cg.h0 h0Var = gbVar.f17784p0;
        if (h0Var != null) {
            a(h0Var, size, size2);
        }
        i iVar = gbVar.Y0.I;
        if (iVar != null) {
            a(iVar, gbVar.O, gbVar.P);
        }
        ef0 ef0Var = gbVar.f17813x1;
        if (ef0Var != null) {
            a(ef0Var, size, size2);
        }
        ja jaVar = gbVar.f17792r1;
        if (jaVar != null) {
            a(jaVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof h70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f9) {
        this.f18912a = f9;
        super.setTranslationY(this.f18913b + f9);
        float clamp = Utilities.clamp((f9 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        gb gbVar = this.f18915e;
        gbVar.G = clamp;
        gbVar.o();
        gbVar.f17777n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
