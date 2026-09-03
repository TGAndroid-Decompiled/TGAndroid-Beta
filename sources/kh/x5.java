package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.qv0;
public final class x5 extends qv0 {
    public int f11059t0;
    public final d6 f11060u0;

    public x5(d6 d6Var, Context context) {
        super(context, null);
        this.f11060u0 = d6Var;
        this.f11059t0 = -1;
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
        this.f11060u0.d.invalidate();
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
        d6 d6Var = this.f11060u0;
        LinearLayout linearLayout = d6Var.f10660f0;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        d6Var.f10662h0.W(d6Var.f10662h0.getY() + d6Var.f10660f0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f11059t0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f11059t0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f11059t0;
        if (i13 == -1) {
            this.f11059t0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
