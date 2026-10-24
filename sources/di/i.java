package di;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.tl0;
public final class i extends mv0 {
    public final r f8046r3;

    public i(r rVar, Context context) {
        super(context);
        this.f8046r3 = rVar;
    }

    @Override
    public final boolean F1() {
        return this.f8046r3.f8062b;
    }

    @Override
    public final boolean G1() {
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
        r rVar = this.f8046r3;
        o oVar = rVar.J;
        if (rVar.f8062b) {
            ou0 ou0Var = rVar.f8066r;
            int i13 = 0;
            for (int i14 = 0; i14 < ou0Var.getChildCount(); i14++) {
                int bottom2 = ou0Var.getChildAt(i14).getBottom() - ou0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, rVar.f8063c);
        }
        if (rVar.v.h() <= 0) {
            i10 = 8;
        }
        oVar.setVisibility(i10);
        oVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f8046r3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f8046r3.f8063c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f8046r3.d;
    }

    @Override
    public final tl0 getMovingAdapter() {
        r rVar = this.f8046r3;
        if (rVar.G.f46497y == 0 && !rVar.W.G.C1) {
            return rVar.v;
        }
        return null;
    }

    @Override
    public final tl0 getSupportingAdapter() {
        return this.f8046r3.f8068w;
    }

    @Override
    public final ou0 getSupportingListView() {
        return this.f8046r3.f8066r;
    }
}
