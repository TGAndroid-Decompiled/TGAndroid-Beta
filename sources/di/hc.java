package di;

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
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.l70;
public final class hc extends FrameLayout {
    public float f7377a;
    public float f7378b;
    public final Paint f7379c;
    public LinearGradient d;
    public final pc f7380e;

    public hc(pc pcVar, Activity activity) {
        super(activity);
        this.f7380e = pcVar;
        this.f7379c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f7377a;
        this.f7378b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.f7380e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f7;
        boolean drawChild = super.drawChild(canvas, view, j3);
        pc pcVar = this.f7380e;
        if (view == pcVar.f7894h0) {
            if (pcVar.V) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f7379c;
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
        ValueAnimator valueAnimator = this.f7380e.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        pc pcVar = this.f7380e;
        if (pcVar.V) {
            i14 = pcVar.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        pcVar.f7894h0.layout(0, 0, pcVar.S, pcVar.T);
        pcVar.f7894h0.setPivotX(pcVar.S * 0.5f);
        FrameLayout frameLayout = pcVar.f7897i0;
        frameLayout.layout(0, i14, pcVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = pcVar.f7903k0;
        frameLayout2.layout(0, pcVar.T - frameLayout2.getMeasuredHeight(), pcVar.S, pcVar.T);
        FrameLayout frameLayout3 = pcVar.m0;
        int i15 = pcVar.T;
        frameLayout3.layout(0, i15, pcVar.S, frameLayout3.getMeasuredHeight() + i15);
        pcVar.f7906l0.layout(0, 0, pcVar.S, pcVar.T);
        eb ebVar = pcVar.f7931t0;
        if (ebVar != null) {
            ebVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        pcVar.f7927s.f8478c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = pcVar.f7878c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, pcVar.S, pcVar.T);
            pcVar.f7878c1.y();
        }
        jf0 jf0Var = pcVar.B1;
        if (jf0Var != null) {
            jf0Var.layout(0, 0, jf0Var.getMeasuredWidth(), pcVar.B1.getMeasuredHeight());
        }
        rb rbVar = pcVar.f7938v1;
        if (rbVar != null) {
            rbVar.layout(0, 0, rbVar.getMeasuredWidth(), pcVar.f7938v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof l70) {
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
        pc pcVar = this.f7380e;
        a(pcVar.f7894h0, pcVar.S, pcVar.T);
        pcVar.j();
        a(pcVar.f7897i0, pcVar.S, AndroidUtilities.dp(150.0f));
        a(pcVar.f7903k0, pcVar.S, AndroidUtilities.dp(220.0f));
        a(pcVar.m0, pcVar.S, pcVar.U);
        a(pcVar.f7906l0, pcVar.S, pcVar.T);
        a(pcVar.f7927s.f8478c, size, size2);
        eb ebVar = pcVar.f7931t0;
        if (ebVar != null) {
            a(ebVar, size, size2);
        }
        i iVar = pcVar.f7878c1.M;
        if (iVar != null) {
            a(iVar, pcVar.S, pcVar.T);
        }
        jf0 jf0Var = pcVar.B1;
        if (jf0Var != null) {
            a(jf0Var, size, size2);
        }
        rb rbVar = pcVar.f7938v1;
        if (rbVar != null) {
            a(rbVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof l70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f7377a = f7;
        super.setTranslationY(this.f7378b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        pc pcVar = this.f7380e;
        pcVar.K = clamp;
        pcVar.o();
        pcVar.f7910n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
