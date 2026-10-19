package di;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.ql0;
public final class i extends jv0 {
    public final r f8039o3;

    public i(r rVar, Context context) {
        super(context);
        this.f8039o3 = rVar;
    }

    @Override
    public final boolean A1() {
        return this.f8039o3.f8055b;
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
        r rVar = this.f8039o3;
        o oVar = rVar.J;
        if (rVar.f8055b) {
            lu0 lu0Var = rVar.f8059r;
            int i13 = 0;
            for (int i14 = 0; i14 < lu0Var.getChildCount(); i14++) {
                int bottom2 = lu0Var.getChildAt(i14).getBottom() - lu0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, rVar.f8056c);
        }
        if (rVar.v.h() <= 0) {
            i10 = 8;
        }
        oVar.setVisibility(i10);
        oVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f8039o3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f8039o3.f8056c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f8039o3.d;
    }

    @Override
    public final ql0 getMovingAdapter() {
        r rVar = this.f8039o3;
        if (rVar.G.f46067y == 0 && !rVar.W.G.C1) {
            return rVar.v;
        }
        return null;
    }

    @Override
    public final ql0 getSupportingAdapter() {
        return this.f8039o3.f8061w;
    }

    @Override
    public final lu0 getSupportingListView() {
        return this.f8039o3.f8059r;
    }
}
