package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.iz;
public final class q2 extends iz {
    public final int V;

    public q2(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V = i3;
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
    public void onMeasure(int i3, int i10) {
        switch (this.V) {
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(104.0f));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }
}
