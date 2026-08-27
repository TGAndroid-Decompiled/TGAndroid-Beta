package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.zu0;

public final class g6 extends zu0 {

    public int f7274s0;

    public final m6 f7275t0;

    public g6(m6 m6Var, Context context) {
        super(context, null);
        this.f7275t0 = m6Var;
        this.f7274s0 = -1;
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
        this.f7275t0.d.invalidate();
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
        m6 m6Var = this.f7275t0;
        LinearLayout linearLayout = m6Var.f7442e0;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        m6Var.f7444g0.W(m6Var.f7444g0.getY() + m6Var.f7442e0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f7274s0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f7274s0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f7274s0;
        if (i13 == -1) {
            this.f7274s0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
