package jh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.ws0;
public final class i extends ut0 {
    public final q f14351m3;

    public i(q qVar, Context context) {
        super(context);
        this.f14351m3 = qVar;
    }

    @Override
    public final boolean A1() {
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f10 = i10;
        q qVar = this.f14351m3;
        n nVar = qVar.F;
        if (qVar.f14364b) {
            ws0 ws0Var = qVar.f14369r;
            int i12 = 0;
            for (int i13 = 0; i13 < ws0Var.getChildCount(); i13++) {
                int bottom2 = ws0Var.getChildAt(i13).getBottom() - ws0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i12, qVar.f14365c);
        }
        if (qVar.v.h() <= 0) {
            i9 = 8;
        }
        nVar.setVisibility(i9);
        nVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f14351m3.f14366e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f14351m3.f14365c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f14351m3.d;
    }

    @Override
    public final gk0 getMovingAdapter() {
        q qVar = this.f14351m3;
        if (qVar.C.f5378y == 0 && !qVar.S.C.f28178y1) {
            return qVar.v;
        }
        return null;
    }

    @Override
    public final gk0 getSupportingAdapter() {
        return this.f14351m3.f14371w;
    }

    @Override
    public final ws0 getSupportingListView() {
        return this.f14351m3.f14369r;
    }

    @Override
    public final boolean z1() {
        return this.f14351m3.f14364b;
    }
}
