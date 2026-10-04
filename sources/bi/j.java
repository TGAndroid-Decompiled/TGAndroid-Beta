package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hu0;
public final class j extends fv0 {
    public final u f3855x3;

    public j(u uVar, Context context) {
        super(context);
        this.f3855x3 = uVar;
    }

    @Override
    public final boolean B1() {
        return this.f3855x3.f3875b;
    }

    @Override
    public final boolean C1() {
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
        u uVar = this.f3855x3;
        r rVar = uVar.J;
        if (uVar.f3875b) {
            hu0 hu0Var = uVar.f3880r;
            int i13 = 0;
            for (int i14 = 0; i14 < hu0Var.getChildCount(); i14++) {
                int bottom2 = hu0Var.getChildAt(i14).getBottom() - hu0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, uVar.f3876c);
        }
        if (uVar.v.h() <= 0) {
            i10 = 8;
        }
        rVar.setVisibility(i10);
        rVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f3855x3.f3877e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f3855x3.f3876c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f3855x3.d;
    }

    @Override
    public final gl0 getMovingAdapter() {
        u uVar = this.f3855x3;
        if (uVar.G.f46698y == 0 && !uVar.W.G.C1) {
            return uVar.v;
        }
        return null;
    }

    @Override
    public final gl0 getSupportingAdapter() {
        return this.f3855x3.f3882w;
    }

    @Override
    public final hu0 getSupportingListView() {
        return this.f3855x3.f3880r;
    }
}
