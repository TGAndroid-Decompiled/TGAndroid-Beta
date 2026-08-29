package hh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.p00;
public final class m extends p00 {
    public final int Q;

    public m(Context context, int i10, c6 c6Var) {
        super(context, c6Var);
        this.Q = i10;
    }

    @Override
    public int getColumnsCount() {
        switch (this.Q) {
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override
    public int getViewType() {
        switch (this.Q) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.Q) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(104.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
