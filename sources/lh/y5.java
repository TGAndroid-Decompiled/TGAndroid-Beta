package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.pv0;
public final class y5 extends pv0 {
    public int f13127t0;
    public final e6 f13128u0;

    public y5(e6 e6Var, Context context) {
        super(context, null);
        this.f13128u0 = e6Var;
        this.f13127t0 = -1;
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
        this.f13128u0.d.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.I) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        e6 e6Var = this.f13128u0;
        LinearLayout linearLayout = e6Var.f12705f0;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        e6Var.f12707h0.W(e6Var.f12707h0.getY() + e6Var.f12705f0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f13127t0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f13127t0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f13127t0;
        if (i13 == -1) {
            this.f13127t0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
