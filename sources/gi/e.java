package gi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.ws0;
public final class e extends ws0 {
    public final m f13634v3;

    public e(m mVar, Context context) {
        super(context);
        this.f13634v3 = mVar;
    }

    @Override
    public final boolean A1() {
        return this.f13634v3.f13650b;
    }

    @Override
    public final boolean B1() {
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f10 = i10;
        m mVar = this.f13634v3;
        ah.a aVar = mVar.K;
        if (mVar.f13650b) {
            as0 as0Var = mVar.f13655r;
            int i12 = 0;
            for (int i13 = 0; i13 < as0Var.getChildCount(); i13++) {
                int bottom2 = as0Var.getChildAt(i13).getBottom() - as0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = g0.T1(f10, i12, mVar.f13651c);
        }
        if (mVar.f13657w.b() <= 0) {
            i7 = 8;
        }
        aVar.setVisibility(i7);
        aVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f13634v3.f13652e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f13634v3.f13651c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f13634v3.d;
    }

    @Override
    public final ij0 getMovingAdapter() {
        m mVar = this.f13634v3;
        if (mVar.H.E == 0 && !mVar.f13649a0.H.F1) {
            return mVar.f13657w;
        }
        return null;
    }

    @Override
    public final ij0 getSupportingAdapter() {
        return this.f13634v3.f13658x;
    }

    @Override
    public final as0 getSupportingListView() {
        return this.f13634v3.f13655r;
    }
}
