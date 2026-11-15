package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.st0;
public final class n6 extends st0 {
    public int f3743g0;
    public final u6 f3744h0;

    public n6(u6 u6Var, Context context) {
        super(context, null);
        this.f3744h0 = u6Var;
        this.f3743g0 = -1;
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
        this.f3744h0.f35931o1.invalidate();
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
        u6 u6Var = this.f3744h0;
        LinearLayout linearLayout = u6Var.f3910e2;
        linearLayout.setTranslationY(((i12 - i10) - linearLayout.getMeasuredHeight()) / 2.0f);
        u6Var.f3912g2.j0(u6Var.f3912g2.getY() + u6Var.f3910e2.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f3743g0 != -1) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f3743g0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i7, i10);
        int i12 = this.f3743g0;
        if (i12 == -1) {
            this.f3743g0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
