package defpackage;

import android.content.Context;
import android.view.View;
public final class kz extends View {
    public final float a;

    public kz(Context context, float f) {
        super(context);
        this.a = f;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.a), 1073741824), i2);
    }
}
