package kh;

import android.content.Context;
import android.view.View;
public final class k0 extends View {
    public final float f10794a;

    public k0(Context context, float f10) {
        super(context);
        this.f10794a = f10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f10794a), 1073741824), i11);
    }
}
