package fg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.bb0;
public final class z0 extends FrameLayout implements x0 {
    public final g6 f6634a;
    public final ArrayList f6635b;
    public final y0 f6636c;
    public final y0 d;
    public final y0 f6637e;
    public final boolean f6638f;

    public z0(Context context, g6 g6Var) {
        super(context);
        bb0[] values;
        this.f6635b = new ArrayList();
        this.f6634a = g6Var;
        for (bb0 bb0Var : bb0.values()) {
            if (bb0Var.f35427e) {
                this.f6635b.add(bb0Var);
            }
            if (this.f6635b.size() == 3) {
                break;
            }
        }
        if (this.f6635b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f6638f = true;
            return;
        }
        this.f6636c = a(context, 0);
        this.d = a(context, 1);
        this.f6637e = a(context, 2);
        setClipChildren(false);
    }

    public final y0 a(Context context, int i10) {
        bb0 bb0Var = (bb0) this.f6635b.get(i10);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        o2 o2Var = new o2(20);
        qVar.f6630e = o2Var;
        Paint paint = new Paint(1);
        qVar.f6631f = paint;
        o2Var.f6466r = 12;
        o2Var.f6467s = 8;
        o2Var.f6468t = 6;
        if (i10 == 1) {
            o2Var.N = 1001;
        }
        if (i10 == 0) {
            o2Var.N = 1002;
        }
        o2Var.O = this.f6634a;
        o2Var.P = k6.Zj;
        o2Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(c6.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(bb0Var.f35426c);
        qVar.setBackgroundResource(bb0Var.f35425b);
        qVar.setPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f6638f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6636c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f10 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f6637e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override
    public void setOffset(float f10) {
        if (this.f6638f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = pr.f30170i.getInterpolation(abs);
        int right = getRight();
        y0 y0Var = this.f6637e;
        y0Var.setTranslationX(((y0Var.getWidth() * 1.5f) + (right - y0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        y0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float f11 = 1.0f;
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        y0Var.setScaleX(clamp);
        y0Var.setScaleY(clamp);
        int top = getTop();
        y0 y0Var2 = this.f6636c;
        y0Var2.setTranslationY((((top - y0Var2.getTop()) - (y0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        y0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        y0Var2.setScaleX(clamp2);
        y0Var2.setScaleY(clamp2);
        float interpolation2 = pr.f30169g.getInterpolation(abs);
        int left = getLeft();
        y0 y0Var3 = this.d;
        y0Var3.setTranslationX((((left - y0Var3.getLeft()) - (y0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        y0Var3.setTranslationY(((y0Var3.getHeight() * 2.5f) + (getBottom() - y0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        y0Var3.setScaleX(clamp3);
        y0Var3.setScaleY(clamp3);
        if (abs < 0.4f) {
            f11 = abs / 0.4f;
        }
        y0Var.h = f11;
        y0Var2.h = f11;
        y0Var3.h = f11;
    }
}
