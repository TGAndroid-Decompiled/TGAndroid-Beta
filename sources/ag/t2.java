package ag;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.uu0;
public final class t2 extends uu0 {
    public final int f737f0;

    public t2(Context context, z4 z4Var, int i10) {
        super(context, z4Var);
        this.f737f0 = i10;
    }

    @Override
    public boolean O() {
        switch (this.f737f0) {
            case 2:
                return false;
            case 3:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f737f0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
