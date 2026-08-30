package kh;

import android.content.Context;
import android.view.View;
public final class k0 extends View {
    public final float f10689a;

    public k0(Context context, float f10) {
        super(context);
        this.f10689a = f10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f10689a), 1073741824), i11);
    }
}
