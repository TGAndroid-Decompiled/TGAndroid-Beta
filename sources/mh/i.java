package mh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.tk0;
public final class i extends gu0 {
    public final r f17027m3;

    public i(r rVar, Context context) {
        super(context);
        this.f17027m3 = rVar;
    }

    @Override
    public final boolean A1() {
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
        float f9 = i11;
        r rVar = this.f17027m3;
        o oVar = rVar.F;
        if (rVar.f17042b) {
            ht0 ht0Var = rVar.f17047r;
            int i13 = 0;
            for (int i14 = 0; i14 < ht0Var.getChildCount(); i14++) {
                int bottom2 = ht0Var.getChildAt(i14).getBottom() - ht0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f9 = AndroidUtilities.lerp(f9, i13, rVar.f17043c);
        }
        if (rVar.v.h() <= 0) {
            i10 = 8;
        }
        oVar.setVisibility(i10);
        oVar.setTranslationY(f9);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f17027m3.f17044e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f17027m3.f17043c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f17027m3.d;
    }

    @Override
    public final tk0 getMovingAdapter() {
        r rVar = this.f17027m3;
        if (rVar.C.f6309y == 0 && !rVar.S.C.f32111y1) {
            return rVar.v;
        }
        return null;
    }

    @Override
    public final tk0 getSupportingAdapter() {
        return this.f17027m3.f17049w;
    }

    @Override
    public final ht0 getSupportingListView() {
        return this.f17027m3.f17047r;
    }

    @Override
    public final boolean z1() {
        return this.f17027m3.f17042b;
    }
}
