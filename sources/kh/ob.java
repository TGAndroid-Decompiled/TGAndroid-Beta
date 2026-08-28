package kh;

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
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.v60;
public final class ob extends FrameLayout {
    public float f15805a;
    public float f15806b;
    public final Paint f15807c;
    public LinearGradient d;
    public final wb f15808e;

    public ob(wb wbVar, Activity activity) {
        super(activity);
        this.f15808e = wbVar;
        this.f15807c = new Paint(1);
    }

    public static void a(View view, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f15805a;
        this.f15806b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f15808e.F == 0) {
            setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        wb wbVar = this.f15808e;
        if (view == wbVar.f16257d0) {
            if (wbVar.R) {
                f10 = AndroidUtilities.statusBarHeight;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f15807c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f10, 0.0f, f10 + AndroidUtilities.dp(72.0f), new int[]{1073741824, 0}, new float[]{f10 / (AndroidUtilities.dp(72.0f) + f10), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        return drawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.f15808e.A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        wb wbVar = this.f15808e;
        if (wbVar.R) {
            i13 = wbVar.V;
        } else {
            i13 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        wbVar.f16257d0.layout(0, 0, wbVar.O, wbVar.P);
        wbVar.f16257d0.setPivotX(wbVar.O * 0.5f);
        FrameLayout frameLayout = wbVar.f16261e0;
        frameLayout.layout(0, i13, wbVar.O, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = wbVar.f16268g0;
        frameLayout2.layout(0, wbVar.P - frameLayout2.getMeasuredHeight(), wbVar.O, wbVar.P);
        FrameLayout frameLayout3 = wbVar.f16274i0;
        int i14 = wbVar.P;
        frameLayout3.layout(0, i14, wbVar.O, frameLayout3.getMeasuredHeight() + i14);
        wbVar.f16271h0.layout(0, 0, wbVar.O, wbVar.P);
        fh.l2 l2Var = wbVar.f16294p0;
        if (l2Var != null) {
            l2Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        wbVar.f16304s.f16011c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = wbVar.Y0.I;
        if (iVar != null) {
            iVar.layout(0, 0, wbVar.O, wbVar.P);
            wbVar.Y0.y();
        }
        qe0 qe0Var = wbVar.f16323x1;
        if (qe0Var != null) {
            qe0Var.layout(0, 0, qe0Var.getMeasuredWidth(), wbVar.f16323x1.getMeasuredHeight());
        }
        ya yaVar = wbVar.f16302r1;
        if (yaVar != null) {
            yaVar.layout(0, 0, yaVar.getMeasuredWidth(), wbVar.f16302r1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof v60) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        wb wbVar = this.f15808e;
        a(wbVar.f16257d0, wbVar.O, wbVar.P);
        wbVar.j();
        a(wbVar.f16261e0, wbVar.O, AndroidUtilities.dp(150.0f));
        a(wbVar.f16268g0, wbVar.O, AndroidUtilities.dp(220.0f));
        a(wbVar.f16274i0, wbVar.O, wbVar.Q);
        a(wbVar.f16271h0, wbVar.O, wbVar.P);
        a(wbVar.f16304s.f16011c, size, size2);
        fh.l2 l2Var = wbVar.f16294p0;
        if (l2Var != null) {
            a(l2Var, size, size2);
        }
        i iVar = wbVar.Y0.I;
        if (iVar != null) {
            a(iVar, wbVar.O, wbVar.P);
        }
        qe0 qe0Var = wbVar.f16323x1;
        if (qe0Var != null) {
            a(qe0Var, size, size2);
        }
        ya yaVar = wbVar.f16302r1;
        if (yaVar != null) {
            a(yaVar, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f15805a = f10;
        super.setTranslationY(this.f15806b + f10);
        float clamp = Utilities.clamp((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        wb wbVar = this.f15808e;
        wbVar.G = clamp;
        wbVar.o();
        wbVar.f16287n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
