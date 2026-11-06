package ei;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.vi0;
public final class f extends ns0 {
    public final n f10815u3;

    public f(n nVar, Context context) {
        super(context);
        this.f10815u3 = nVar;
    }

    @Override
    public final boolean A1() {
        return this.f10815u3.f10830b;
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
        n nVar = this.f10815u3;
        ah.a aVar = nVar.J;
        if (nVar.f10830b) {
            rr0 rr0Var = nVar.f10835r;
            int i12 = 0;
            for (int i13 = 0; i13 < rr0Var.getChildCount(); i13++) {
                int bottom2 = rr0Var.getChildAt(i13).getBottom() - rr0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = g0.T1(f10, i12, nVar.f10831c);
        }
        if (nVar.f10837w.b() <= 0) {
            i7 = 8;
        }
        aVar.setVisibility(i7);
        aVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f10815u3.f10832e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f10815u3.f10831c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f10815u3.d;
    }

    @Override
    public final vi0 getMovingAdapter() {
        n nVar = this.f10815u3;
        if (nVar.G.D == 0 && !nVar.W.G.E1) {
            return nVar.f10837w;
        }
        return null;
    }

    @Override
    public final vi0 getSupportingAdapter() {
        return this.f10815u3.f10838x;
    }

    @Override
    public final rr0 getSupportingListView() {
        return this.f10815u3.f10835r;
    }
}
