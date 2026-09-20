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
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.t70;
public final class gc extends FrameLayout {
    public float f4731a;
    public float f4732b;
    public final Paint f4733c;
    public LinearGradient d;
    public final oc e;

    public gc(oc ocVar, Activity activity) {
        super(activity);
        this.e = ocVar;
        this.f4733c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f4731a;
        this.f4732b = f7;
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
        oc ocVar = this.e;
        if (view == ocVar.f5229h0) {
            if (ocVar.V) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f4733c;
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
        oc ocVar = this.e;
        if (ocVar.V) {
            i14 = ocVar.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ocVar.f5229h0.layout(0, 0, ocVar.S, ocVar.T);
        ocVar.f5229h0.setPivotX(ocVar.S * 0.5f);
        FrameLayout frameLayout = ocVar.f5232i0;
        frameLayout.layout(0, i14, ocVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = ocVar.f5238k0;
        frameLayout2.layout(0, ocVar.T - frameLayout2.getMeasuredHeight(), ocVar.S, ocVar.T);
        FrameLayout frameLayout3 = ocVar.m0;
        int i15 = ocVar.T;
        frameLayout3.layout(0, i15, ocVar.S, frameLayout3.getMeasuredHeight() + i15);
        ocVar.f5241l0.layout(0, 0, ocVar.S, ocVar.T);
        eb ebVar = ocVar.f5266t0;
        if (ebVar != null) {
            ebVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ocVar.f5262s.f5809c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = ocVar.f5214c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, ocVar.S, ocVar.T);
            ocVar.f5214c1.y();
        }
        rf0 rf0Var = ocVar.B1;
        if (rf0Var != null) {
            rf0Var.layout(0, 0, rf0Var.getMeasuredWidth(), ocVar.B1.getMeasuredHeight());
        }
        qb qbVar = ocVar.f5273v1;
        if (qbVar != null) {
            qbVar.layout(0, 0, qbVar.getMeasuredWidth(), ocVar.f5273v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof t70) {
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
        oc ocVar = this.e;
        a(ocVar.f5229h0, ocVar.S, ocVar.T);
        ocVar.j();
        a(ocVar.f5232i0, ocVar.S, AndroidUtilities.dp(150.0f));
        a(ocVar.f5238k0, ocVar.S, AndroidUtilities.dp(220.0f));
        a(ocVar.m0, ocVar.S, ocVar.U);
        a(ocVar.f5241l0, ocVar.S, ocVar.T);
        a(ocVar.f5262s.f5809c, size, size2);
        eb ebVar = ocVar.f5266t0;
        if (ebVar != null) {
            a(ebVar, size, size2);
        }
        i iVar = ocVar.f5214c1.M;
        if (iVar != null) {
            a(iVar, ocVar.S, ocVar.T);
        }
        rf0 rf0Var = ocVar.B1;
        if (rf0Var != null) {
            a(rf0Var, size, size2);
        }
        qb qbVar = ocVar.f5273v1;
        if (qbVar != null) {
            a(qbVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof t70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f4731a = f7;
        super.setTranslationY(this.f4732b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        oc ocVar = this.e;
        ocVar.K = clamp;
        ocVar.o();
        ocVar.f5245n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
