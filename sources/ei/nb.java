package ei;

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
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hg0;
public final class nb extends FrameLayout {
    public float f9540a;
    public float f9541b;
    public final Paint f9542c;
    public LinearGradient d;
    public final vb e;

    public nb(vb vbVar, Activity activity) {
        super(activity);
        this.e = vbVar;
        this.f9542c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f9540a;
        this.f9541b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        boolean drawChild = super.drawChild(canvas, view, j10);
        vb vbVar = this.e;
        if (view == vbVar.f9988h0) {
            if (vbVar.V) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f9542c;
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
        vb vbVar = this.e;
        if (vbVar.V) {
            i14 = vbVar.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        vbVar.f9988h0.layout(0, 0, vbVar.S, vbVar.T);
        vbVar.f9988h0.setPivotX(vbVar.S * 0.5f);
        FrameLayout frameLayout = vbVar.f9991i0;
        frameLayout.layout(0, i14, vbVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = vbVar.f9997k0;
        frameLayout2.layout(0, vbVar.T - frameLayout2.getMeasuredHeight(), vbVar.S, vbVar.T);
        FrameLayout frameLayout3 = vbVar.m0;
        int i15 = vbVar.T;
        frameLayout3.layout(0, i15, vbVar.S, frameLayout3.getMeasuredHeight() + i15);
        vbVar.f10000l0.layout(0, 0, vbVar.S, vbVar.T);
        ai.jc jcVar = vbVar.f10025t0;
        if (jcVar != null) {
            jcVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        vbVar.f10021s.f9784c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = vbVar.f9973c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, vbVar.S, vbVar.T);
            vbVar.f9973c1.y();
        }
        hg0 hg0Var = vbVar.B1;
        if (hg0Var != null) {
            hg0Var.layout(0, 0, hg0Var.getMeasuredWidth(), vbVar.B1.getMeasuredHeight());
        }
        xa xaVar = vbVar.f10032v1;
        if (xaVar != null) {
            xaVar.layout(0, 0, xaVar.getMeasuredWidth(), vbVar.f10032v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof h80) {
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
        vb vbVar = this.e;
        a(vbVar.f9988h0, vbVar.S, vbVar.T);
        vbVar.i();
        a(vbVar.f9991i0, vbVar.S, AndroidUtilities.dp(150.0f));
        a(vbVar.f9997k0, vbVar.S, AndroidUtilities.dp(220.0f));
        a(vbVar.m0, vbVar.S, vbVar.U);
        a(vbVar.f10000l0, vbVar.S, vbVar.T);
        a(vbVar.f10021s.f9784c, size, size2);
        ai.jc jcVar = vbVar.f10025t0;
        if (jcVar != null) {
            a(jcVar, size, size2);
        }
        i iVar = vbVar.f9973c1.M;
        if (iVar != null) {
            a(iVar, vbVar.S, vbVar.T);
        }
        hg0 hg0Var = vbVar.B1;
        if (hg0Var != null) {
            a(hg0Var, size, size2);
        }
        xa xaVar = vbVar.f10032v1;
        if (xaVar != null) {
            a(xaVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof h80) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f9540a = f7;
        super.setTranslationY(this.f9541b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        vb vbVar = this.e;
        vbVar.K = clamp;
        vbVar.n();
        vbVar.f10004n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
