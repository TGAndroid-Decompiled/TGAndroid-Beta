package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class yr0 extends dha {
    public final gs0 v3;

    public yr0(gs0 gs0Var, Context context) {
        super(context);
        this.v3 = gs0Var;
    }

    @Override
    public final boolean A1() {
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
        gs0 gs0Var = this.v3;
        ds0 ds0Var = gs0Var.K;
        if (gs0Var.b) {
            hga hgaVar = gs0Var.r;
            int i4 = 0;
            for (int i5 = 0; i5 < hgaVar.getChildCount(); i5++) {
                int bottom2 = hgaVar.getChildAt(i5).getBottom() - hgaVar.getPaddingTop();
                if (bottom2 > i4) {
                    i4 = bottom2;
                }
            }
            f = gm.R1(f, i4, gs0Var.c);
        }
        if (gs0Var.w.b() <= 0) {
            i = 8;
        }
        ds0Var.setVisibility(i);
        ds0Var.setTranslationY(f);
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
    public final z49 getMovingAdapter() {
        gs0 gs0Var = this.v3;
        if (gs0Var.H.E == 0 && !gs0Var.a0.H.F1) {
            return gs0Var.w;
        }
        return null;
    }

    @Override
    public final z49 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override
    public final hga getSupportingListView() {
        return this.v3.r;
    }
}
