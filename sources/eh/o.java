package eh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.e00;
public final class o extends e00 {
    public final int Q;

    public o(Context context, int i9, b6 b6Var) {
        super(context, b6Var);
        this.Q = i9;
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
    public void onMeasure(int i9, int i10) {
        switch (this.Q) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(104.0f));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }
}
