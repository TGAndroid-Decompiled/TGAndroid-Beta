package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.qt0;
public final class w6 extends qt0 {
    public int f1086g0;
    public final d7 f1087h0;

    public w6(d7 d7Var, Context context) {
        super(context, null);
        this.f1087h0 = d7Var;
        this.f1086g0 = -1;
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
        this.f1087h0.f36102l1.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.M) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        d7 d7Var = this.f1087h0;
        LinearLayout linearLayout = d7Var.f578b2;
        linearLayout.setTranslationY(((i12 - i10) - linearLayout.getMeasuredHeight()) / 2.0f);
        d7Var.f579d2.h0(d7Var.f579d2.getY() + d7Var.f578b2.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.f1086g0 != -1) {
            super.onMeasure(i3, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f1086g0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i3, i10);
        int i12 = this.f1086g0;
        if (i12 == -1) {
            this.f1086g0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
