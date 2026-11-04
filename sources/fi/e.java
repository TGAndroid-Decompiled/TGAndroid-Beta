package fi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.zi0;
public final class e extends ms0 {
    public final m f11601v3;

    public e(m mVar, Context context) {
        super(context);
        this.f11601v3 = mVar;
    }

    @Override
    public final boolean A1() {
        return this.f11601v3.f11617b;
    }

    @Override
    public final boolean B1() {
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f10 = i10;
        m mVar = this.f11601v3;
        bh.a aVar = mVar.K;
        if (mVar.f11617b) {
            qr0 qr0Var = mVar.f11622r;
            int i12 = 0;
            for (int i13 = 0; i13 < qr0Var.getChildCount(); i13++) {
                int bottom2 = qr0Var.getChildAt(i13).getBottom() - qr0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = g0.T1(f10, i12, mVar.f11618c);
        }
        if (mVar.f11624w.b() <= 0) {
            i3 = 8;
        }
        aVar.setVisibility(i3);
        aVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f11601v3.f11619e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f11601v3.f11618c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f11601v3.d;
    }

    @Override
    public final zi0 getMovingAdapter() {
        m mVar = this.f11601v3;
        if (mVar.H.E == 0 && !mVar.f11616a0.H.F1) {
            return mVar.f11624w;
        }
        return null;
    }

    @Override
    public final zi0 getSupportingAdapter() {
        return this.f11601v3.f11625x;
    }

    @Override
    public final qr0 getSupportingListView() {
        return this.f11601v3.f11622r;
    }
}
