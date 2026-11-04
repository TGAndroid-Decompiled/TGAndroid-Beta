package ai;

import android.content.Context;
import android.view.View;
public final class x0 extends View {
    public final float f1089a;

    public x0(Context context, float f10) {
        super(context);
        this.f1089a = f10;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i3) * this.f1089a), 1073741824), i10);
    }
}
