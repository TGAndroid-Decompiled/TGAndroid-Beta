package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.zz;
public final class i extends zz {
    public final int U;

    public i(int i10, Context context, p6 p6Var) {
        super(context, p6Var);
        this.U = i10;
    }

    @Override
    public int getColumnsCount() {
        switch (this.U) {
            case 1:
                return 3;
            case 2:
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
    public void onMeasure(int i10, int i11) {
        switch (this.U) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), i0.L(104.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
