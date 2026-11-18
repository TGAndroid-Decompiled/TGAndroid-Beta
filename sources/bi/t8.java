package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.au0;
public final class t8 extends au0 {
    public int f4098g0;
    public final a9 f4099h0;

    public t8(a9 a9Var, Context context) {
        super(context, null);
        this.f4099h0 = a9Var;
        this.f4098g0 = -1;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void S() {
        this.f4099h0.f39534o1.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.M) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a9 a9Var = this.f4099h0;
        LinearLayout linearLayout = a9Var.f3426e2;
        linearLayout.setTranslationY(((i12 - i10) - linearLayout.getMeasuredHeight()) / 2.0f);
        a9Var.f3428g2.l0(a9Var.f3428g2.getY() + a9Var.f3426e2.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f4098g0 != -1) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f4098g0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i7, i10);
        int i12 = this.f4098g0;
        if (i12 == -1) {
            this.f4098g0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
