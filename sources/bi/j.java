package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.fl0;
public final class j extends av0 {
    public final u f3565q3;

    public j(u uVar, Context context) {
        super(context);
        this.f3565q3 = uVar;
    }

    @Override
    public final boolean A1() {
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
        u uVar = this.f3565q3;
        r rVar = uVar.J;
        if (uVar.f3584b) {
            cu0 cu0Var = uVar.f3588r;
            int i13 = 0;
            for (int i14 = 0; i14 < cu0Var.getChildCount(); i14++) {
                int bottom2 = cu0Var.getChildAt(i14).getBottom() - cu0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, uVar.f3585c);
        }
        if (uVar.v.h() <= 0) {
            i10 = 8;
        }
        rVar.setVisibility(i10);
        rVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f3565q3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f3565q3.f3585c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f3565q3.d;
    }

    @Override
    public final fl0 getMovingAdapter() {
        u uVar = this.f3565q3;
        if (uVar.G.f43108y == 0 && !uVar.W.G.C1) {
            return uVar.v;
        }
        return null;
    }

    @Override
    public final fl0 getSupportingAdapter() {
        return this.f3565q3.f3590w;
    }

    @Override
    public final cu0 getSupportingListView() {
        return this.f3565q3.f3588r;
    }

    @Override
    public final boolean z1() {
        return this.f3565q3.f3584b;
    }
}
