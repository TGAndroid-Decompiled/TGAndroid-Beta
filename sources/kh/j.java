package kh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.ys0;

public final class j extends xt0 {

    public final r f15202m3;

    public j(r rVar, Context context) {
        super(context);
        this.f15202m3 = rVar;
    }

    @Override
    public final boolean A1() {
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float fLerp = i10;
        r rVar = this.f15202m3;
        o oVar = rVar.F;
        if (rVar.f15215b) {
            ys0 ys0Var = rVar.f15220r;
            int i12 = 0;
            for (int i13 = 0; i13 < ys0Var.getChildCount(); i13++) {
                int bottom2 = ys0Var.getChildAt(i13).getBottom() - ys0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            fLerp = AndroidUtilities.lerp(fLerp, i12, rVar.f15216c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(fLerp);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f15202m3.f15217e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f15202m3.f15216c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f15202m3.d;
    }

    @Override
    public final jk0 getMovingAdapter() {
        r rVar = this.f15202m3;
        if (rVar.C.f5666y != 0 || rVar.S.C.f29163y1) {
            return null;
        }
        return rVar.v;
    }

    @Override
    public final jk0 getSupportingAdapter() {
        return this.f15202m3.f15222w;
    }

    @Override
    public final ys0 getSupportingListView() {
        return this.f15202m3.f15220r;
    }

    @Override
    public final boolean z1() {
        return this.f15202m3.f15215b;
    }
}
