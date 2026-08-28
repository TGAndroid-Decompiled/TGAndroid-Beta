package fh;

import android.content.Context;
import android.view.View;
public final class p0 extends View {
    public final float f6676a;

    public p0(Context context, float f10) {
        super(context);
        this.f6676a = f10;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i9) * this.f6676a), 1073741824), i10);
    }
}
