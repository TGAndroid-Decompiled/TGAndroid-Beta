package gi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.zs0;
public final class e extends zs0 {
    public final m f13629v3;

    public e(m mVar, Context context) {
        super(context);
        this.f13629v3 = mVar;
    }

    @Override
    public final boolean A1() {
        return this.f13629v3.f13645b;
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
        m mVar = this.f13629v3;
        ah.a aVar = mVar.K;
        if (mVar.f13645b) {
            cs0 cs0Var = mVar.f13650r;
            int i12 = 0;
            for (int i13 = 0; i13 < cs0Var.getChildCount(); i13++) {
                int bottom2 = cs0Var.getChildAt(i13).getBottom() - cs0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = g0.T1(f10, i12, mVar.f13646c);
        }
        if (mVar.f13652w.b() <= 0) {
            i7 = 8;
        }
        aVar.setVisibility(i7);
        aVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f13629v3.f13647e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f13629v3.f13646c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f13629v3.d;
    }

    @Override
    public final kj0 getMovingAdapter() {
        m mVar = this.f13629v3;
        if (mVar.H.E == 0 && !mVar.f13644a0.H.F1) {
            return mVar.f13652w;
        }
        return null;
    }

    @Override
    public final kj0 getSupportingAdapter() {
        return this.f13629v3.f13653x;
    }

    @Override
    public final cs0 getSupportingListView() {
        return this.f13629v3.f13650r;
    }
}
