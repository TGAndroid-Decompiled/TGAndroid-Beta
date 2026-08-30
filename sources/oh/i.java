package oh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.pt0;
public final class i extends ou0 {
    public final r f16588n3;

    public i(r rVar, Context context) {
        super(context);
        this.f16588n3 = rVar;
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
        float f10 = i11;
        r rVar = this.f16588n3;
        o oVar = rVar.G;
        if (rVar.f16602b) {
            pt0 pt0Var = rVar.f16606r;
            int i13 = 0;
            for (int i14 = 0; i14 < pt0Var.getChildCount(); i14++) {
                int bottom2 = pt0Var.getChildAt(i14).getBottom() - pt0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i13, rVar.f16603c);
        }
        if (rVar.v.h() <= 0) {
            i10 = 8;
        }
        oVar.setVisibility(i10);
        oVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f16588n3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f16588n3.f16603c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f16588n3.d;
    }

    @Override
    public final cl0 getMovingAdapter() {
        r rVar = this.f16588n3;
        if (rVar.D.f5690y == 0 && !rVar.T.D.f31161z1) {
            return rVar.v;
        }
        return null;
    }

    @Override
    public final cl0 getSupportingAdapter() {
        return this.f16588n3.f16608w;
    }

    @Override
    public final pt0 getSupportingListView() {
        return this.f16588n3.f16606r;
    }

    @Override
    public final boolean z1() {
        return this.f16588n3.f16602b;
    }
}
