package kg;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.Components.au0;
public final class o1 extends au0 {
    public final int f18409g0;

    public o1(Context context, s4 s4Var, int i7) {
        super(context, s4Var);
        this.f18409g0 = i7;
    }

    @Override
    public boolean O() {
        switch (this.f18409g0) {
            case 2:
                return false;
            case 3:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f18409g0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
