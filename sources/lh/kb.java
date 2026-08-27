package lh;

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
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.z60;

public final class kb extends FrameLayout {

    public float f16260a;

    public float f16261b;

    public final Paint f16262c;
    public LinearGradient d;

    public final sb f16263e;

    public kb(sb sbVar, Activity activity) {
        super(activity);
        this.f16263e = sbVar;
        this.f16262c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f16260a;
        this.f16261b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f16263e.F == 0) {
            setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        sb sbVar = this.f16263e;
        if (view == sbVar.f16753d0) {
            float f10 = sbVar.R ? AndroidUtilities.statusBarHeight : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.f16262c;
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
        return zDrawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.f16263e.A;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sb sbVar = this.f16263e;
        int i14 = sbVar.R ? sbVar.V : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sbVar.f16753d0.layout(0, 0, sbVar.O, sbVar.P);
        sbVar.f16753d0.setPivotX(sbVar.O * 0.5f);
        FrameLayout frameLayout = sbVar.f16757e0;
        frameLayout.layout(0, i14, sbVar.O, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = sbVar.f16764g0;
        frameLayout2.layout(0, sbVar.P - frameLayout2.getMeasuredHeight(), sbVar.O, sbVar.P);
        FrameLayout frameLayout3 = sbVar.f16770i0;
        int i15 = sbVar.P;
        frameLayout3.layout(0, i15, sbVar.O, frameLayout3.getMeasuredHeight() + i15);
        sbVar.f16767h0.layout(0, 0, sbVar.O, sbVar.P);
        ag.s0 s0Var = sbVar.f16790p0;
        if (s0Var != null) {
            s0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        sbVar.f16800s.f16628c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = sbVar.Y0.I;
        if (iVar != null) {
            iVar.layout(0, 0, sbVar.O, sbVar.P);
            sbVar.Y0.y();
        }
        ve0 ve0Var = sbVar.f16819x1;
        if (ve0Var != null) {
            ve0Var.layout(0, 0, ve0Var.getMeasuredWidth(), sbVar.f16819x1.getMeasuredHeight());
        }
        va vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            vaVar.layout(0, 0, vaVar.getMeasuredWidth(), sbVar.f16798r1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof z60) {
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
        sb sbVar = this.f16263e;
        a(sbVar.f16753d0, sbVar.O, sbVar.P);
        sbVar.j();
        a(sbVar.f16757e0, sbVar.O, AndroidUtilities.dp(150.0f));
        a(sbVar.f16764g0, sbVar.O, AndroidUtilities.dp(220.0f));
        a(sbVar.f16770i0, sbVar.O, sbVar.Q);
        a(sbVar.f16767h0, sbVar.O, sbVar.P);
        a(sbVar.f16800s.f16628c, size, size2);
        ag.s0 s0Var = sbVar.f16790p0;
        if (s0Var != null) {
            a(s0Var, size, size2);
        }
        i iVar = sbVar.Y0.I;
        if (iVar != null) {
            a(iVar, sbVar.O, sbVar.P);
        }
        ve0 ve0Var = sbVar.f16819x1;
        if (ve0Var != null) {
            a(ve0Var, size, size2);
        }
        va vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            a(vaVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof z60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f16260a = f10;
        super.setTranslationY(this.f16261b + f10);
        float fClamp = Utilities.clamp((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        sb sbVar = this.f16263e;
        sbVar.G = fClamp;
        sbVar.o();
        sbVar.f16783n.invalidate();
        float fClamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(fClamp2);
        setScaleY(fClamp2);
    }
}
