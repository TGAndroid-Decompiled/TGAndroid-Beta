package ci;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.ul0;
public final class i extends nv0 {
    public final t f4762o3;

    public i(t tVar, Context context) {
        super(context);
        this.f4762o3 = tVar;
    }

    @Override
    public final boolean A1() {
        return this.f4762o3.f4781b;
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
        t tVar = this.f4762o3;
        q qVar = tVar.J;
        if (tVar.f4781b) {
            pu0 pu0Var = tVar.f4785r;
            int i13 = 0;
            for (int i14 = 0; i14 < pu0Var.getChildCount(); i14++) {
                int bottom2 = pu0Var.getChildAt(i14).getBottom() - pu0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, tVar.f4782c);
        }
        if (tVar.v.h() <= 0) {
            i10 = 8;
        }
        qVar.setVisibility(i10);
        qVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f4762o3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f4762o3.f4782c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f4762o3.d;
    }

    @Override
    public final ul0 getMovingAdapter() {
        t tVar = this.f4762o3;
        if (tVar.G.f44993y == 0 && !tVar.W.G.C1) {
            return tVar.v;
        }
        return null;
    }

    @Override
    public final ul0 getSupportingAdapter() {
        return this.f4762o3.f4787w;
    }

    @Override
    public final pu0 getSupportingListView() {
        return this.f4762o3.f4785r;
    }
}
