package kg;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.Components.rt0;
public final class l1 extends rt0 {
    public final int f17424f0;

    public l1(Context context, q4 q4Var, int i7) {
        super(context, q4Var);
        this.f17424f0 = i7;
    }

    @Override
    public boolean O() {
        switch (this.f17424f0) {
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
        switch (this.f17424f0) {
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
