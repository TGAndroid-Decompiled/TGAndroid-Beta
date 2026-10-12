package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zu0;
public final class j extends xv0 {
    public final u f3903o3;

    public j(u uVar, Context context) {
        super(context);
        this.f3903o3 = uVar;
    }

    @Override
    public final boolean A1() {
        return this.f3903o3.f3923b;
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
        u uVar = this.f3903o3;
        r rVar = uVar.J;
        if (uVar.f3923b) {
            zu0 zu0Var = uVar.f3928r;
            int i13 = 0;
            for (int i14 = 0; i14 < zu0Var.getChildCount(); i14++) {
                int bottom2 = zu0Var.getChildAt(i14).getBottom() - zu0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, uVar.f3924c);
        }
        if (uVar.v.h() <= 0) {
            i10 = 8;
        }
        rVar.setVisibility(i10);
        rVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f3903o3.f3925e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f3903o3.f3924c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f3903o3.d;
    }

    @Override
    public final em0 getMovingAdapter() {
        u uVar = this.f3903o3;
        if (uVar.G.f48057y == 0 && !uVar.W.G.C1) {
            return uVar.v;
        }
        return null;
    }

    @Override
    public final em0 getSupportingAdapter() {
        return this.f3903o3.f3930w;
    }

    @Override
    public final zu0 getSupportingListView() {
        return this.f3903o3.f3928r;
    }
}
