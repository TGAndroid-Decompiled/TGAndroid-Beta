package ai;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zt0;
public final class o extends yu0 {
    public final a0 f461q3;

    public o(a0 a0Var, Context context) {
        super(context);
        this.f461q3 = a0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            int bottom = getChildAt(i12).getBottom() - getPaddingTop();
            if (bottom > i11) {
                i11 = bottom;
            }
        }
        float f7 = i11;
        a0 a0Var = this.f461q3;
        x xVar = a0Var.J;
        if (a0Var.f412b) {
            zt0 zt0Var = a0Var.f416r;
            int i13 = 0;
            for (int i14 = 0; i14 < zt0Var.getChildCount(); i14++) {
                int bottom2 = zt0Var.getChildAt(i14).getBottom() - zt0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, a0Var.f413c);
        }
        if (a0Var.v.h() <= 0) {
            i10 = 8;
        }
        xVar.setVisibility(i10);
        xVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f461q3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f461q3.f413c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f461q3.d;
    }

    @Override
    public final dl0 getMovingAdapter() {
        a0 a0Var = this.f461q3;
        if (a0Var.G.f41759y == 0 && !a0Var.W.G.C1) {
            return a0Var.v;
        }
        return null;
    }

    @Override
    public final dl0 getSupportingAdapter() {
        return this.f461q3.f418w;
    }

    @Override
    public final zt0 getSupportingListView() {
        return this.f461q3.f416r;
    }

    @Override
    public final boolean y1() {
        return this.f461q3.f412b;
    }

    @Override
    public final boolean z1() {
        return true;
    }
}
