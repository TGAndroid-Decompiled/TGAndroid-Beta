package gh;

import android.content.Context;
import android.view.View;

public final class n0 extends View {

    public final float f7459a;

    public n0(Context context, float f10) {
        super(context);
        this.f7459a = f10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f7459a), 1073741824), i11);
    }
}
