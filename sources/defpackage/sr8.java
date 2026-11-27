package defpackage;

import android.content.Context;
import android.view.View;
public final class sr8 extends View {
    public final int a;

    public sr8(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.a, 1073741824));
    }
}
