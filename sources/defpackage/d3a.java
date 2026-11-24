package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
public final class d3a extends ela {
    public int m0;
    public final j3a n0;

    public d3a(j3a j3aVar, Context context) {
        super(context, null);
        this.n0 = j3aVar;
        this.m0 = -1;
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
        this.n0.n1.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.M) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j3a j3aVar = this.n0;
        LinearLayout linearLayout = j3aVar.d2;
        linearLayout.setTranslationY(((i4 - i2) - linearLayout.getMeasuredHeight()) / 2.0f);
        cm1 cm1Var = j3aVar.f2;
        cm1Var.j0(cm1Var.getY() + linearLayout.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.m0 != -1) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            int i3 = this.m0;
            if (measuredHeight < i3) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max(i3, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
        int i4 = this.m0;
        if (i4 == -1) {
            this.m0 = Math.max(i4, getMeasuredHeight());
        }
    }
}
