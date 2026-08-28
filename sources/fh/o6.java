package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.xu0;
public final class o6 extends xu0 {
    public int f6671s0;
    public final u6 f6672t0;

    public o6(u6 u6Var, Context context) {
        super(context, null);
        this.f6672t0 = u6Var;
        this.f6671s0 = -1;
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
        this.f6672t0.d.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.H) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        u6 u6Var = this.f6672t0;
        LinearLayout linearLayout = u6Var.f6794e0;
        linearLayout.setTranslationY(((i12 - i10) - linearLayout.getMeasuredHeight()) / 2.0f);
        u6Var.f6796g0.V(u6Var.f6796g0.getY() + u6Var.f6794e0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.f6671s0 != -1) {
            super.onMeasure(i9, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f6671s0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i9, i10);
        int i12 = this.f6671s0;
        if (i12 == -1) {
            this.f6671s0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
