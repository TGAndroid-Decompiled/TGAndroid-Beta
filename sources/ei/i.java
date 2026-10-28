package ei;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.ul0;
public final class i extends rv0 {
    public final r f9985v3;

    public i(r rVar, Context context) {
        super(context);
        this.f9985v3 = rVar;
    }

    @Override
    public final boolean D1() {
        return this.f9985v3.f10001b;
    }

    @Override
    public final boolean E1() {
        return true;
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
        r rVar = this.f9985v3;
        o oVar = rVar.J;
        if (rVar.f10001b) {
            tu0 tu0Var = rVar.f10005r;
            int i13 = 0;
            for (int i14 = 0; i14 < tu0Var.getChildCount(); i14++) {
                int bottom2 = tu0Var.getChildAt(i14).getBottom() - tu0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, rVar.f10002c);
        }
        if (rVar.v.h() <= 0) {
            i10 = 8;
        }
        oVar.setVisibility(i10);
        oVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f9985v3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f9985v3.f10002c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f9985v3.d;
    }

    @Override
    public final ul0 getMovingAdapter() {
        r rVar = this.f9985v3;
        if (rVar.G.f47905y == 0 && !rVar.W.G.E1) {
            return rVar.v;
        }
        return null;
    }

    @Override
    public final ul0 getSupportingAdapter() {
        return this.f9985v3.f10007w;
    }

    @Override
    public final tu0 getSupportingListView() {
        return this.f9985v3.f10005r;
    }
}
