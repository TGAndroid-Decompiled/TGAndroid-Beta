package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.pz;
public final class q2 extends pz {
    public final int V;

    public q2(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V = i7;
    }

    @Override
    public int getColumnsCount() {
        switch (this.V) {
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
        switch (this.V) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.V) {
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(104.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
