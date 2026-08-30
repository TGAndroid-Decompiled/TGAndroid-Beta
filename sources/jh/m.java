package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t00;
public final class m extends t00 {
    public final int R;

    public m(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.R = i10;
    }

    @Override
    public int getColumnsCount() {
        switch (this.R) {
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override
    public int getViewType() {
        switch (this.R) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.R) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(104.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
