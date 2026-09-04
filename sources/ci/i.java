package ci;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.tk0;
public final class i extends nu0 {
    public final t f4812q3;

    public i(t tVar, Context context) {
        super(context);
        this.f4812q3 = tVar;
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
        t tVar = this.f4812q3;
        q qVar = tVar.J;
        if (tVar.f4832b) {
            pt0 pt0Var = tVar.f4837r;
            int i13 = 0;
            for (int i14 = 0; i14 < pt0Var.getChildCount(); i14++) {
                int bottom2 = pt0Var.getChildAt(i14).getBottom() - pt0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, tVar.f4833c);
        }
        if (tVar.v.h() <= 0) {
            i10 = 8;
        }
        qVar.setVisibility(i10);
        qVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f4812q3.f4834e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f4812q3.f4833c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f4812q3.d;
    }

    @Override
    public final tk0 getMovingAdapter() {
        t tVar = this.f4812q3;
        if (tVar.G.f45905y == 0 && !tVar.W.G.C1) {
            return tVar.v;
        }
        return null;
    }

    @Override
    public final tk0 getSupportingAdapter() {
        return this.f4812q3.f4839w;
    }

    @Override
    public final pt0 getSupportingListView() {
        return this.f4812q3.f4837r;
    }

    @Override
    public final boolean y1() {
        return this.f4812q3.f4832b;
    }

    @Override
    public final boolean z1() {
        return true;
    }
}
