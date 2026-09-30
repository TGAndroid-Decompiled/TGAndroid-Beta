package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.hl0;
public final class j extends cv0 {
    public final u f3572x3;

    public j(u uVar, Context context) {
        super(context);
        this.f3572x3 = uVar;
    }

    @Override
    public final boolean B1() {
        return this.f3572x3.f3591b;
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
        u uVar = this.f3572x3;
        r rVar = uVar.J;
        if (uVar.f3591b) {
            eu0 eu0Var = uVar.f3595r;
            int i13 = 0;
            for (int i14 = 0; i14 < eu0Var.getChildCount(); i14++) {
                int bottom2 = eu0Var.getChildAt(i14).getBottom() - eu0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, uVar.f3592c);
        }
        if (uVar.v.h() <= 0) {
            i10 = 8;
        }
        rVar.setVisibility(i10);
        rVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f3572x3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f3572x3.f3592c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f3572x3.d;
    }

    @Override
    public final hl0 getMovingAdapter() {
        u uVar = this.f3572x3;
        if (uVar.G.f43217y == 0 && !uVar.W.G.C1) {
            return uVar.v;
        }
        return null;
    }

    @Override
    public final hl0 getSupportingAdapter() {
        return this.f3572x3.f3597w;
    }

    @Override
    public final eu0 getSupportingListView() {
        return this.f3572x3.f3595r;
    }
}
