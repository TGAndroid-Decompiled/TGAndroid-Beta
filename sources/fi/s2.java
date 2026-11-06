package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.lz;
public final class s2 extends lz {
    public final int U;

    public s2(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = i7;
    }

    @Override
    public int getColumnsCount() {
        switch (this.U) {
            case 0:
                return 3;
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override
    public int getViewType() {
        switch (this.U) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.U) {
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(104.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
