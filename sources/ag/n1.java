package ag;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.ta0;

public final class n1 extends FrameLayout implements l1 {

    public final c6 f568a;

    public final ArrayList f569b;

    public final m1 f570c;
    public final m1 d;

    public final m1 f571e;

    public final boolean f572f;

    public n1(Context context, c6 c6Var) {
        super(context);
        this.f569b = new ArrayList();
        this.f568a = c6Var;
        for (ta0 ta0Var : ta0.values()) {
            if (ta0Var.f42845e) {
                this.f569b.add(ta0Var);
            }
            if (this.f569b.size() == 3) {
                break;
            }
        }
        if (this.f569b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f572f = true;
        } else {
            this.f570c = a(context, 0);
            this.d = a(context, 1);
            this.f571e = a(context, 2);
            setClipChildren(false);
        }
    }

    public final m1 a(Context context, int i10) {
        ta0 ta0Var = (ta0) this.f569b.get(i10);
        m1 m1Var = new m1(context);
        j3 j3Var = new j3(20);
        m1Var.f560e = j3Var;
        Paint paint = new Paint(1);
        m1Var.f561f = paint;
        j3Var.f514r = 12;
        j3Var.f515s = 8;
        j3Var.f516t = 6;
        if (i10 == 1) {
            j3Var.N = 1001;
        }
        if (i10 == 0) {
            j3Var.N = 1002;
        }
        j3Var.O = this.f568a;
        j3Var.P = g6.Zj;
        j3Var.c();
        paint.setColor(-1);
        m1Var.setLayoutParams(z5.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        m1Var.setForeground(ta0Var.f42844c);
        m1Var.setBackgroundResource(ta0Var.f42843b);
        m1Var.setPadding(AndroidUtilities.dp(8.0f));
        m1Var.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(m1Var);
        return m1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f572f) {
            return;
        }
        int iMin = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int iDp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f570c.getLayoutParams();
        layoutParams.height = iDp;
        layoutParams.width = iDp;
        float f10 = iDp;
        layoutParams.bottomMargin = (int) ((iMin * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = iDp;
        layoutParams2.width = iDp;
        int i12 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f571e.getLayoutParams();
        layoutParams3.height = iDp;
        layoutParams3.width = iDp;
        layoutParams3.leftMargin = i12;
    }

    @Override
    public void setOffset(float f10) {
        if (this.f572f) {
            return;
        }
        float fAbs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = er.f28124i.getInterpolation(fAbs);
        int right = getRight();
        m1 m1Var = this.f571e;
        m1Var.setTranslationX(((m1Var.getWidth() * 1.5f) + (right - m1Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        m1Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float fClamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        m1Var.setScaleX(fClamp);
        m1Var.setScaleY(fClamp);
        int top = getTop();
        m1 m1Var2 = this.f570c;
        m1Var2.setTranslationY((((top - m1Var2.getTop()) - (m1Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * fAbs);
        m1Var2.setTranslationX(AndroidUtilities.dp(16.0f) * fAbs);
        float fClamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, fAbs), 1.0f, 0.0f);
        m1Var2.setScaleX(fClamp2);
        m1Var2.setScaleY(fClamp2);
        float interpolation2 = er.f28123g.getInterpolation(fAbs);
        int left = getLeft();
        m1 m1Var3 = this.d;
        m1Var3.setTranslationX((((left - m1Var3.getLeft()) - (m1Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        m1Var3.setTranslationY(((m1Var3.getHeight() * 2.5f) + (getBottom() - m1Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float fClamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, fAbs), 1.0f, 0.0f);
        m1Var3.setScaleX(fClamp3);
        m1Var3.setScaleY(fClamp3);
        float f11 = fAbs < 0.4f ? fAbs / 0.4f : 1.0f;
        m1Var.h = f11;
        m1Var2.h = f11;
        m1Var3.h = f11;
    }
}
