package di;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.ql0;
public final class i extends iv0 {
    public final r f8040o3;

    public i(r rVar, Context context) {
        super(context);
        this.f8040o3 = rVar;
    }

    @Override
    public final boolean A1() {
        return this.f8040o3.f8056b;
    }

    @Override
    public final boolean B1() {
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
        r rVar = this.f8040o3;
        o oVar = rVar.J;
        if (rVar.f8056b) {
            ku0 ku0Var = rVar.f8060r;
            int i13 = 0;
            for (int i14 = 0; i14 < ku0Var.getChildCount(); i14++) {
                int bottom2 = ku0Var.getChildAt(i14).getBottom() - ku0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, rVar.f8057c);
        }
        if (rVar.v.h() <= 0) {
            i10 = 8;
        }
        oVar.setVisibility(i10);
        oVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f8040o3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f8040o3.f8057c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f8040o3.d;
    }

    @Override
    public final ql0 getMovingAdapter() {
        r rVar = this.f8040o3;
        if (rVar.G.f46065y == 0 && !rVar.W.G.C1) {
            return rVar.v;
        }
        return null;
    }

    @Override
    public final ql0 getSupportingAdapter() {
        return this.f8040o3.f8062w;
    }

    @Override
    public final ku0 getSupportingListView() {
        return this.f8040o3.f8060r;
    }
}
