package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.hv0;
public final class y5 extends hv0 {
    public int f9548s0;
    public final e6 f9549t0;

    public y5(e6 e6Var, Context context) {
        super(context, null);
        this.f9549t0 = e6Var;
        this.f9548s0 = -1;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void T() {
        this.f9549t0.d.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.H) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e6 e6Var = this.f9549t0;
        LinearLayout linearLayout = e6Var.f9131e0;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        e6Var.f9133g0.W(e6Var.f9133g0.getY() + e6Var.f9131e0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f9548s0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f9548s0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f9548s0;
        if (i13 == -1) {
            this.f9548s0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
