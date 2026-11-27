package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class yq0 extends uia {
    public final gr0 v3;

    public yq0(gr0 gr0Var, Context context) {
        super(context);
        this.v3 = gr0Var;
    }

    @Override
    public final boolean B1() {
        return this.v3.b;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int bottom = getChildAt(i3).getBottom() - getPaddingTop();
            if (bottom > i2) {
                i2 = bottom;
            }
        }
        float f = i2;
        gr0 gr0Var = this.v3;
        dr0 dr0Var = gr0Var.K;
        if (gr0Var.b) {
            yha yhaVar = gr0Var.r;
            int i4 = 0;
            for (int i5 = 0; i5 < yhaVar.getChildCount(); i5++) {
                int bottom2 = yhaVar.getChildAt(i5).getBottom() - yhaVar.getPaddingTop();
                if (bottom2 > i4) {
                    i4 = bottom2;
                }
            }
            f = hl.R1(f, i4, gr0Var.c);
        }
        if (gr0Var.w.b() <= 0) {
            i = 8;
        }
        dr0Var.setVisibility(i);
        dr0Var.setTranslationY(f);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override
    public final l69 getMovingAdapter() {
        gr0 gr0Var = this.v3;
        if (gr0Var.H.E == 0 && !gr0Var.a0.H.F1) {
            return gr0Var.w;
        }
        return null;
    }

    @Override
    public final l69 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override
    public final yha getSupportingListView() {
        return this.v3.r;
    }
}
