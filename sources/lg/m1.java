package lg;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.Components.qt0;
public final class m1 extends qt0 {
    public final int f18370g0;

    public m1(Context context, q4 q4Var, int i3) {
        super(context, q4Var);
        this.f18370g0 = i3;
    }

    @Override
    public boolean O() {
        switch (this.f18370g0) {
            case 2:
                return false;
            case 3:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f18370g0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }
}
