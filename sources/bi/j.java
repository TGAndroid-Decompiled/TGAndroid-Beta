package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.tk0;
public final class j extends ou0 {
    public final u f3570q3;

    public j(u uVar, Context context) {
        super(context);
        this.f3570q3 = uVar;
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
        u uVar = this.f3570q3;
        r rVar = uVar.J;
        if (uVar.f3589b) {
            qt0 qt0Var = uVar.f3593r;
            int i13 = 0;
            for (int i14 = 0; i14 < qt0Var.getChildCount(); i14++) {
                int bottom2 = qt0Var.getChildAt(i14).getBottom() - qt0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i13, uVar.f3590c);
        }
        if (uVar.v.h() <= 0) {
            i10 = 8;
        }
        rVar.setVisibility(i10);
        rVar.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f3570q3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f3570q3.f3590c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f3570q3.d;
    }

    @Override
    public final tk0 getMovingAdapter() {
        u uVar = this.f3570q3;
        if (uVar.G.f42820y == 0 && !uVar.W.G.C1) {
            return uVar.v;
        }
        return null;
    }

    @Override
    public final tk0 getSupportingAdapter() {
        return this.f3570q3.f3595w;
    }

    @Override
    public final qt0 getSupportingListView() {
        return this.f3570q3.f3593r;
    }

    @Override
    public final boolean z1() {
        return this.f3570q3.f3589b;
    }
}
