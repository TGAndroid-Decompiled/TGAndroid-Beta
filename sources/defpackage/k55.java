package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class k55 extends ScrollView {
    public final short a;

    public k55(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), hl.L(this.a)), Integer.MIN_VALUE));
    }
}
